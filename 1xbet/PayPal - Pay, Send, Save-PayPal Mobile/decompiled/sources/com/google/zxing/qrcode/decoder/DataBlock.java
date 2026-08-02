package com.google.zxing.qrcode.decoder;

/* loaded from: classes9.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int i, byte[] bArr) {
        this.numDataCodewords = i;
        this.codewords = bArr;
    }

    static com.google.zxing.qrcode.decoder.DataBlock[] getDataBlocks(byte[] bArr, com.google.zxing.qrcode.decoder.Version version, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != version.getTotalCodewords()) {
            throw new java.lang.IllegalArgumentException();
        }
        com.google.zxing.qrcode.decoder.Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
        com.google.zxing.qrcode.decoder.Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
        int i = 0;
        for (com.google.zxing.qrcode.decoder.Version.ECB ecb : eCBlocks) {
            i += ecb.getCount();
        }
        com.google.zxing.qrcode.decoder.DataBlock[] dataBlockArr = new com.google.zxing.qrcode.decoder.DataBlock[i];
        int i2 = 0;
        for (com.google.zxing.qrcode.decoder.Version.ECB ecb2 : eCBlocks) {
            int i3 = 0;
            while (i3 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i2] = new com.google.zxing.qrcode.decoder.DataBlock(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                i3++;
                i2++;
            }
        }
        int length = dataBlockArr[0].codewords.length;
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (dataBlockArr[i].codewords.length != length);
        int i4 = i + 1;
        int eCCodewordsPerBlock = length - eCBlocksForLevel.getECCodewordsPerBlock();
        int i5 = 0;
        for (int i6 = 0; i6 < eCCodewordsPerBlock; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                dataBlockArr[i7].codewords[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        int i8 = i4;
        while (i8 < i2) {
            dataBlockArr[i8].codewords[eCCodewordsPerBlock] = bArr[i5];
            i8++;
            i5++;
        }
        int length2 = dataBlockArr[0].codewords.length;
        while (eCCodewordsPerBlock < length2) {
            int i9 = 0;
            while (i9 < i2) {
                dataBlockArr[i9].codewords[i9 < i4 ? eCCodewordsPerBlock : eCCodewordsPerBlock + 1] = bArr[i5];
                i9++;
                i5++;
            }
            eCCodewordsPerBlock++;
        }
        return dataBlockArr;
    }

    final int getNumDataCodewords() {
        return this.numDataCodewords;
    }

    final byte[] getCodewords() {
        return this.codewords;
    }
}
