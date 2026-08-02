package com.google.zxing.datamatrix.decoder;

/* loaded from: classes9.dex */
public final class Decoder {
    private final com.google.zxing.common.reedsolomon.ReedSolomonDecoder rsDecoder = new com.google.zxing.common.reedsolomon.ReedSolomonDecoder(com.google.zxing.common.reedsolomon.GenericGF.DATA_MATRIX_FIELD_256);

    public final com.google.zxing.common.DecoderResult decode(boolean[][] zArr) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        return decode(com.google.zxing.common.BitMatrix.parse(zArr));
    }

    public final com.google.zxing.common.DecoderResult decode(com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        com.google.zxing.datamatrix.decoder.BitMatrixParser bitMatrixParser = new com.google.zxing.datamatrix.decoder.BitMatrixParser(bitMatrix);
        com.google.zxing.datamatrix.decoder.DataBlock[] dataBlocks = com.google.zxing.datamatrix.decoder.DataBlock.getDataBlocks(bitMatrixParser.readCodewords(), bitMatrixParser.getVersion());
        int i = 0;
        for (com.google.zxing.datamatrix.decoder.DataBlock dataBlock : dataBlocks) {
            i += dataBlock.getNumDataCodewords();
        }
        byte[] bArr = new byte[i];
        int length = dataBlocks.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            com.google.zxing.datamatrix.decoder.DataBlock dataBlock2 = dataBlocks[i3];
            byte[] codewords = dataBlock2.getCodewords();
            int numDataCodewords = dataBlock2.getNumDataCodewords();
            i2 += correctErrors(codewords, numDataCodewords);
            for (int i4 = 0; i4 < numDataCodewords; i4++) {
                bArr[(i4 * length) + i3] = codewords[i4];
            }
        }
        com.google.zxing.common.DecoderResult decode = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.decode(bArr);
        decode.setErrorsCorrected(java.lang.Integer.valueOf(i2));
        return decode;
    }

    private int correctErrors(byte[] bArr, int i) throws com.google.zxing.ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            int decodeWithECCount = this.rsDecoder.decodeWithECCount(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
            return decodeWithECCount;
        } catch (com.google.zxing.common.reedsolomon.ReedSolomonException unused) {
            throw com.google.zxing.ChecksumException.getChecksumInstance();
        }
    }
}
