package com.google.zxing.datamatrix.encoder;

/* loaded from: classes9.dex */
final class ASCIIEncoder implements com.google.zxing.datamatrix.encoder.Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final int getEncodingMode() {
        return 0;
    }

    ASCIIEncoder() {
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final void encode(com.google.zxing.datamatrix.encoder.EncoderContext encoderContext) {
        if (com.google.zxing.datamatrix.encoder.HighLevelEncoder.determineConsecutiveDigitCount(encoderContext.getMessage(), encoderContext.pos) >= 2) {
            encoderContext.writeCodeword(encodeASCIIDigits(encoderContext.getMessage().charAt(encoderContext.pos), encoderContext.getMessage().charAt(encoderContext.pos + 1)));
            encoderContext.pos += 2;
            return;
        }
        char currentChar = encoderContext.getCurrentChar();
        int lookAheadTest = com.google.zxing.datamatrix.encoder.HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode());
        if (lookAheadTest == getEncodingMode()) {
            if (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isExtendedASCII(currentChar)) {
                encoderContext.writeCodeword((char) 235);
                encoderContext.writeCodeword((char) (currentChar - 127));
                encoderContext.pos++;
                return;
            } else {
                encoderContext.writeCodeword((char) (currentChar + 1));
                encoderContext.pos++;
                return;
            }
        }
        if (lookAheadTest == 1) {
            encoderContext.writeCodeword((char) 230);
            encoderContext.signalEncoderChange(1);
            return;
        }
        if (lookAheadTest == 2) {
            encoderContext.writeCodeword((char) 239);
            encoderContext.signalEncoderChange(2);
            return;
        }
        if (lookAheadTest == 3) {
            encoderContext.writeCodeword((char) 238);
            encoderContext.signalEncoderChange(3);
        } else if (lookAheadTest == 4) {
            encoderContext.writeCodeword((char) 240);
            encoderContext.signalEncoderChange(4);
        } else {
            if (lookAheadTest == 5) {
                encoderContext.writeCodeword((char) 231);
                encoderContext.signalEncoderChange(5);
                return;
            }
            throw new java.lang.IllegalStateException("Illegal mode: ".concat(java.lang.String.valueOf(lookAheadTest)));
        }
    }

    private static char encodeASCIIDigits(char c, char c2) {
        if (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(c) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
