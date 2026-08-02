package com.google.zxing.qrcode.decoder;

/* loaded from: classes9.dex */
public final class Decoder {
    private final com.google.zxing.common.reedsolomon.ReedSolomonDecoder rsDecoder = new com.google.zxing.common.reedsolomon.ReedSolomonDecoder(com.google.zxing.common.reedsolomon.GenericGF.QR_CODE_FIELD_256);

    public final com.google.zxing.common.DecoderResult decode(boolean[][] zArr) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decode(zArr, (java.util.Map<com.google.zxing.DecodeHintType, ?>) null);
    }

    public final com.google.zxing.common.DecoderResult decode(boolean[][] zArr, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decode(com.google.zxing.common.BitMatrix.parse(zArr), map);
    }

    public final com.google.zxing.common.DecoderResult decode(com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decode(bitMatrix, (java.util.Map<com.google.zxing.DecodeHintType, ?>) null);
    }

    public final com.google.zxing.common.DecoderResult decode(com.google.zxing.common.BitMatrix bitMatrix, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        com.google.zxing.qrcode.decoder.BitMatrixParser bitMatrixParser = new com.google.zxing.qrcode.decoder.BitMatrixParser(bitMatrix);
        com.google.zxing.ChecksumException checksumException = null;
        try {
            return decode(bitMatrixParser, map);
        } catch (com.google.zxing.ChecksumException e) {
            e = null;
            checksumException = e;
            try {
                bitMatrixParser.remask();
                bitMatrixParser.setMirror(true);
                bitMatrixParser.readVersion();
                bitMatrixParser.readFormatInformation();
                bitMatrixParser.mirror();
                com.google.zxing.common.DecoderResult decode = decode(bitMatrixParser, map);
                decode.setOther(new com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData(true));
                return decode;
            } catch (com.google.zxing.ChecksumException | com.google.zxing.FormatException unused) {
                if (e != null) {
                    throw e;
                }
                throw checksumException;
            }
        } catch (com.google.zxing.FormatException e2) {
            e = e2;
            bitMatrixParser.remask();
            bitMatrixParser.setMirror(true);
            bitMatrixParser.readVersion();
            bitMatrixParser.readFormatInformation();
            bitMatrixParser.mirror();
            com.google.zxing.common.DecoderResult decode2 = decode(bitMatrixParser, map);
            decode2.setOther(new com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData(true));
            return decode2;
        }
    }

    private com.google.zxing.common.DecoderResult decode(com.google.zxing.qrcode.decoder.BitMatrixParser bitMatrixParser, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        com.google.zxing.qrcode.decoder.Version readVersion = bitMatrixParser.readVersion();
        com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel = bitMatrixParser.readFormatInformation().getErrorCorrectionLevel();
        com.google.zxing.qrcode.decoder.DataBlock[] dataBlocks = com.google.zxing.qrcode.decoder.DataBlock.getDataBlocks(bitMatrixParser.readCodewords(), readVersion, errorCorrectionLevel);
        int i = 0;
        for (com.google.zxing.qrcode.decoder.DataBlock dataBlock : dataBlocks) {
            i += dataBlock.getNumDataCodewords();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        for (com.google.zxing.qrcode.decoder.DataBlock dataBlock2 : dataBlocks) {
            byte[] codewords = dataBlock2.getCodewords();
            int numDataCodewords = dataBlock2.getNumDataCodewords();
            i2 += correctErrors(codewords, numDataCodewords);
            int i4 = 0;
            while (i4 < numDataCodewords) {
                bArr[i3] = codewords[i4];
                i4++;
                i3++;
            }
        }
        com.google.zxing.common.DecoderResult decode = com.google.zxing.qrcode.decoder.DecodedBitStreamParser.decode(bArr, readVersion, errorCorrectionLevel, map);
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
