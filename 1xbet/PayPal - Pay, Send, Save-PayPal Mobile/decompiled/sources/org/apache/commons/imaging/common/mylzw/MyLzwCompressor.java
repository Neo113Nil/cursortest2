package org.apache.commons.imaging.common.mylzw;

/* loaded from: classes17.dex */
public class MyLzwCompressor {
    private final java.nio.ByteOrder byteOrder;
    private final int clearCode;
    private int codeSize;
    private int codes;
    private final boolean earlyLimit;
    private final int eoiCode;
    private final int initialCodeSize;
    private final org.apache.commons.imaging.common.mylzw.MyLzwCompressor.Listener listener;
    private final java.util.Map<org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray, java.lang.Integer> map;

    public interface Listener {
        void clearCode(int i);

        void dataCode(int i);

        void eoiCode(int i);

        void init(int i, int i2);
    }

    public MyLzwCompressor(int i, java.nio.ByteOrder byteOrder, boolean z) {
        this(i, byteOrder, z, null);
    }

    public MyLzwCompressor(int i, java.nio.ByteOrder byteOrder, boolean z, org.apache.commons.imaging.common.mylzw.MyLzwCompressor.Listener listener) {
        this.codes = -1;
        this.map = new java.util.HashMap();
        this.listener = listener;
        this.byteOrder = byteOrder;
        this.earlyLimit = z;
        this.initialCodeSize = i;
        int i2 = 1 << i;
        this.clearCode = i2;
        int i3 = i2 + 1;
        this.eoiCode = i3;
        if (listener != null) {
            listener.init(i2, i3);
        }
        initializeStringTable();
    }

    private void initializeStringTable() {
        int i = this.initialCodeSize;
        this.codeSize = i;
        this.map.clear();
        int i2 = 0;
        while (true) {
            this.codes = i2;
            if (i2 >= (1 << i) + 2) {
                return;
            }
            if (i2 != this.clearCode && i2 != this.eoiCode) {
                this.map.put(arrayToKey((byte) i2), java.lang.Integer.valueOf(this.codes));
            }
            i2 = this.codes + 1;
        }
    }

    private void clearTable() {
        initializeStringTable();
        incrementCodeSize();
    }

    private void incrementCodeSize() {
        int i = this.codeSize;
        if (i != 12) {
            this.codeSize = i + 1;
        }
    }

    private org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray arrayToKey(byte b) {
        return arrayToKey(new byte[]{b}, 0, 1);
    }

    static final class ByteArray {
        private final byte[] bytes;
        private final int hash;
        private final int length;
        private final int start;

        ByteArray(byte[] bArr, int i, int i2) {
            this.bytes = bArr;
            this.start = i;
            this.length = i2;
            int i3 = i2;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = ((i3 + (i3 << 8)) ^ (bArr[i4 + i] & 255)) ^ i4;
            }
            this.hash = i3;
        }

        public final int hashCode() {
            return this.hash;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray)) {
                return false;
            }
            org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray byteArray = (org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray) obj;
            if (byteArray.hash != this.hash || byteArray.length != this.length) {
                return false;
            }
            for (int i = 0; i < this.length; i++) {
                if (byteArray.bytes[byteArray.start + i] != this.bytes[this.start + i]) {
                    return false;
                }
            }
            return true;
        }
    }

    private org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray arrayToKey(byte[] bArr, int i, int i2) {
        return new org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray(bArr, i, i2);
    }

    private void writeDataCode(org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream, int i) throws java.io.IOException {
        org.apache.commons.imaging.common.mylzw.MyLzwCompressor.Listener listener = this.listener;
        if (listener != null) {
            listener.dataCode(i);
        }
        writeCode(myBitOutputStream, i);
    }

    private void writeClearCode(org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream) throws java.io.IOException {
        org.apache.commons.imaging.common.mylzw.MyLzwCompressor.Listener listener = this.listener;
        if (listener != null) {
            listener.dataCode(this.clearCode);
        }
        writeCode(myBitOutputStream, this.clearCode);
    }

    private void writeEoiCode(org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream) throws java.io.IOException {
        org.apache.commons.imaging.common.mylzw.MyLzwCompressor.Listener listener = this.listener;
        if (listener != null) {
            listener.eoiCode(this.eoiCode);
        }
        writeCode(myBitOutputStream, this.eoiCode);
    }

    private void writeCode(org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream, int i) throws java.io.IOException {
        myBitOutputStream.writeBits(i, this.codeSize);
    }

    private boolean isInTable(byte[] bArr, int i, int i2) {
        return this.map.containsKey(arrayToKey(bArr, i, i2));
    }

    private int codeFromString(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.lang.Integer num = this.map.get(arrayToKey(bArr, i, i2));
        if (num == null) {
            throw new java.io.IOException("CodeFromString");
        }
        return num.intValue();
    }

    private boolean addTableEntry(org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
        return addTableEntry(myBitOutputStream, arrayToKey(bArr, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean addTableEntry(org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream, org.apache.commons.imaging.common.mylzw.MyLzwCompressor.ByteArray byteArray) throws java.io.IOException {
        boolean z;
        int i = this.codeSize;
        int i2 = 1 << i;
        if (this.earlyLimit) {
            i2--;
        }
        if (this.codes == i2) {
            if (i < 12) {
                incrementCodeSize();
            } else {
                writeClearCode(myBitOutputStream);
                clearTable();
                z = true;
                if (!z) {
                    this.map.put(byteArray, java.lang.Integer.valueOf(this.codes));
                    this.codes++;
                }
                return z;
            }
        }
        z = false;
        if (!z) {
        }
        return z;
    }

    public byte[] compress(byte[] bArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
        org.apache.commons.imaging.common.mylzw.MyBitOutputStream myBitOutputStream = new org.apache.commons.imaging.common.mylzw.MyBitOutputStream(byteArrayOutputStream, this.byteOrder);
        initializeStringTable();
        clearTable();
        writeClearCode(myBitOutputStream);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = i2 + 1;
            if (isInTable(bArr, i, i4)) {
                i2 = i4;
            } else {
                writeDataCode(myBitOutputStream, codeFromString(bArr, i, i2));
                addTableEntry(myBitOutputStream, bArr, i, i4);
                i2 = 1;
                i = i3;
            }
        }
        writeDataCode(myBitOutputStream, codeFromString(bArr, i, i2));
        writeEoiCode(myBitOutputStream);
        myBitOutputStream.flushCache();
        return byteArrayOutputStream.toByteArray();
    }
}
