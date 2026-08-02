package org.apache.commons.imaging.common.mylzw;

/* loaded from: classes17.dex */
public final class MyLzwDecompressor {
    private static final int MAX_TABLE_SIZE = 4096;
    private final java.nio.ByteOrder byteOrder;
    private final int clearCode;
    private int codeSize;
    private int codes;
    private final int eoiCode;
    private final int initialCodeSize;
    private final org.apache.commons.imaging.common.mylzw.MyLzwDecompressor.Listener listener;
    private final byte[][] table;
    private boolean tiffLZWMode;
    private int written;

    public interface Listener {
        void code(int i);

        void init(int i, int i2);
    }

    public MyLzwDecompressor(int i, java.nio.ByteOrder byteOrder) {
        this(i, byteOrder, null);
    }

    public MyLzwDecompressor(int i, java.nio.ByteOrder byteOrder, org.apache.commons.imaging.common.mylzw.MyLzwDecompressor.Listener listener) {
        this.codes = -1;
        this.listener = listener;
        this.byteOrder = byteOrder;
        this.initialCodeSize = i;
        this.table = new byte[4096][];
        int i2 = 1 << i;
        this.clearCode = i2;
        int i3 = i2 + 1;
        this.eoiCode = i3;
        if (listener != null) {
            listener.init(i2, i3);
        }
        initializeTable();
    }

    private void initializeTable() {
        int i = this.initialCodeSize;
        this.codeSize = i;
        for (int i2 = 0; i2 < (1 << (i + 2)); i2++) {
            this.table[i2] = new byte[]{(byte) i2};
        }
    }

    private void clearTable() {
        int i = this.initialCodeSize;
        this.codes = (1 << i) + 2;
        this.codeSize = i;
        incrementCodeSize();
    }

    private int getNextCode(org.apache.commons.imaging.common.mylzw.MyBitInputStream myBitInputStream) throws java.io.IOException {
        int readBits = myBitInputStream.readBits(this.codeSize);
        org.apache.commons.imaging.common.mylzw.MyLzwDecompressor.Listener listener = this.listener;
        if (listener != null) {
            listener.code(readBits);
        }
        return readBits;
    }

    private byte[] stringFromCode(int i) throws java.io.IOException {
        if (i >= this.codes || i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad Code: ");
            sb.append(i);
            sb.append(" codes: ");
            sb.append(this.codes);
            sb.append(" code_size: ");
            sb.append(this.codeSize);
            sb.append(", table: ");
            sb.append(this.table.length);
            throw new java.io.IOException(sb.toString());
        }
        return this.table[i];
    }

    private boolean isInTable(int i) {
        return i < this.codes;
    }

    private byte firstChar(byte[] bArr) {
        return bArr[0];
    }

    private void addStringToTable(byte[] bArr) throws java.io.IOException {
        int i = this.codes;
        if (i < (1 << this.codeSize)) {
            this.table[i] = bArr;
            this.codes = i + 1;
        }
        checkCodeSize();
    }

    private byte[] appendBytes(byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length] = b;
        return bArr2;
    }

    private void writeToResult(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        outputStream.write(bArr);
        this.written += bArr.length;
    }

    public final void setTiffLZWMode() {
        this.tiffLZWMode = true;
    }

    public final byte[] decompress(java.io.InputStream inputStream, int i) throws java.io.IOException {
        org.apache.commons.imaging.common.mylzw.MyBitInputStream myBitInputStream = new org.apache.commons.imaging.common.mylzw.MyBitInputStream(inputStream, this.byteOrder);
        if (this.tiffLZWMode) {
            myBitInputStream.setTiffLZWMode();
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i);
        clearTable();
        int i2 = -1;
        do {
            int nextCode = getNextCode(myBitInputStream);
            if (nextCode == this.eoiCode) {
                break;
            }
            if (nextCode == this.clearCode) {
                clearTable();
                if (this.written >= i || (i2 = getNextCode(myBitInputStream)) == this.eoiCode) {
                    break;
                }
                writeToResult(byteArrayOutputStream, stringFromCode(i2));
            } else {
                if (isInTable(nextCode)) {
                    writeToResult(byteArrayOutputStream, stringFromCode(nextCode));
                    addStringToTable(appendBytes(stringFromCode(i2), firstChar(stringFromCode(nextCode))));
                } else {
                    byte[] appendBytes = appendBytes(stringFromCode(i2), firstChar(stringFromCode(i2)));
                    writeToResult(byteArrayOutputStream, appendBytes);
                    addStringToTable(appendBytes);
                }
                i2 = nextCode;
            }
        } while (this.written < i);
        return byteArrayOutputStream.toByteArray();
    }

    private void checkCodeSize() {
        int i = 1 << this.codeSize;
        if (this.tiffLZWMode) {
            i--;
        }
        if (this.codes == i) {
            incrementCodeSize();
        }
    }

    private void incrementCodeSize() {
        int i = this.codeSize;
        if (i != 12) {
            this.codeSize = i + 1;
        }
    }
}
