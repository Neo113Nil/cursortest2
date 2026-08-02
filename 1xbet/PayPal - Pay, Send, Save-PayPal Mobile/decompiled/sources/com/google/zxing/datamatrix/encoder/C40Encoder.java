package com.google.zxing.datamatrix.encoder;

/* loaded from: classes9.dex */
class C40Encoder implements com.google.zxing.datamatrix.encoder.Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 1;
    }

    C40Encoder() {
    }

    void encodeMaximal(com.google.zxing.datamatrix.encoder.EncoderContext encoderContext) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = encoderContext.pos;
        int i2 = 0;
        int i3 = 0;
        while (encoderContext.hasMoreCharacters()) {
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            i3 = encodeChar(currentChar, sb);
            if (sb.length() % 3 == 0) {
                i = encoderContext.pos;
                i2 = sb.length();
            }
        }
        if (i2 != sb.length()) {
            int codewordCount = encoderContext.getCodewordCount() + ((sb.length() / 3) * 2) + 1;
            encoderContext.updateSymbolInfo(codewordCount);
            int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
            int length = sb.length() % 3;
            if ((length == 2 && dataCapacity != 2) || (length == 1 && (i3 > 3 || dataCapacity != 1))) {
                sb.setLength(i2);
                encoderContext.pos = i;
            }
        }
        if (sb.length() > 0) {
            encoderContext.writeCodeword((char) 230);
        }
        handleEOD(encoderContext, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(com.google.zxing.datamatrix.encoder.EncoderContext encoderContext) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            int encodeChar = encodeChar(currentChar, sb);
            int codewordCount = encoderContext.getCodewordCount() + ((sb.length() / 3) * 2);
            encoderContext.updateSymbolInfo(codewordCount);
            int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
            if (!encoderContext.hasMoreCharacters()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                if (sb.length() % 3 == 2 && dataCapacity != 2) {
                    encodeChar = backtrackOneCharacter(encoderContext, sb, sb2, encodeChar);
                }
                while (sb.length() % 3 == 1 && (encodeChar > 3 || dataCapacity != 1)) {
                    encodeChar = backtrackOneCharacter(encoderContext, sb, sb2, encodeChar);
                }
            } else if (sb.length() % 3 == 0 && com.google.zxing.datamatrix.encoder.HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        handleEOD(encoderContext, sb);
    }

    private int backtrackOneCharacter(com.google.zxing.datamatrix.encoder.EncoderContext encoderContext, java.lang.StringBuilder sb, java.lang.StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        encoderContext.pos--;
        int encodeChar = encodeChar(encoderContext.getCurrentChar(), sb2);
        encoderContext.resetSymbolInfo();
        return encodeChar;
    }

    static void writeNextTriplet(com.google.zxing.datamatrix.encoder.EncoderContext encoderContext, java.lang.StringBuilder sb) {
        encoderContext.writeCodewords(encodeToCodewords(sb));
        sb.delete(0, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7.hasMoreCharacters() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r7.hasMoreCharacters() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void handleEOD(com.google.zxing.datamatrix.encoder.EncoderContext encoderContext, java.lang.StringBuilder sb) {
        int length = sb.length() / 3;
        int length2 = sb.length() % 3;
        int codewordCount = encoderContext.getCodewordCount() + (length * 2);
        encoderContext.updateSymbolInfo(codewordCount);
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                writeNextTriplet(encoderContext, sb);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                writeNextTriplet(encoderContext, sb);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
            encoderContext.pos--;
        } else if (length2 == 0) {
            while (sb.length() >= 3) {
                writeNextTriplet(encoderContext, sb);
            }
            if (dataCapacity <= 0) {
            }
            encoderContext.writeCodeword((char) 254);
        } else {
            throw new java.lang.IllegalStateException("Unexpected case. Please report!");
        }
        encoderContext.signalEncoderChange(0);
    }

    int encodeChar(char c, java.lang.StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        sb.append("\u0001\u001e");
        return encodeChar((char) (c - 128), sb) + 2;
    }

    private static java.lang.String encodeToCodewords(java.lang.CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new java.lang.String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }
}
