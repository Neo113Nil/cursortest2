package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class HexEncoder implements com.visa.cbp.external.common.Encoder {
    protected final byte[] encodeTable = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodeTable = new byte[128];

    private boolean ignore(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    protected void initialiseDecodingTable() {
        int i = 0;
        while (true) {
            byte[] bArr = this.encodeTable;
            if (i < bArr.length) {
                this.decodeTable[bArr[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr2 = this.decodeTable;
                bArr2[65] = bArr2[97];
                bArr2[66] = bArr2[98];
                bArr2[67] = bArr2[99];
                bArr2[68] = bArr2[100];
                bArr2[69] = bArr2[101];
                bArr2[70] = bArr2[102];
                return;
            }
        }
    }

    public HexEncoder() {
        initialiseDecodingTable();
    }

    @Override // com.visa.cbp.external.common.Encoder
    public int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = bArr[i3];
            outputStream.write(this.encodeTable[(b & 255) >>> 4]);
            outputStream.write(this.encodeTable[b & com.google.common.base.Ascii.SI]);
        }
        return i2 << 1;
    }

    @Override // com.visa.cbp.external.common.Encoder
    public int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = i2 + i;
        while (i3 > i && ignore((char) bArr[i3 - 1])) {
            i3--;
        }
        int i4 = 0;
        while (i < i3) {
            while (i < i3 && ignore((char) bArr[i])) {
                i++;
            }
            int i5 = i + 1;
            byte b = this.decodeTable[bArr[i]];
            while (i5 < i3 && ignore((char) bArr[i5])) {
                i5++;
            }
            outputStream.write((b << 4) | this.decodeTable[bArr[i5]]);
            i4++;
            i = i5 + 1;
        }
        return i4;
    }

    @Override // com.visa.cbp.external.common.Encoder
    public int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && ignore(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b = this.decodeTable[str.charAt(i)];
            while (i3 < length && ignore(str.charAt(i3))) {
                i3++;
            }
            outputStream.write((b << 4) | this.decodeTable[str.charAt(i3)]);
            i2++;
            i = i3 + 1;
        }
        return i2;
    }
}
