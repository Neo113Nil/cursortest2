package com.squareup.moshi;

/* loaded from: classes3.dex */
final class JsonUtf8Reader extends com.squareup.moshi.JsonReader {
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private long getOutputStallDuration;
    private final okio.Buffer getOutputStallDurationlomOqCM;
    private final okio.BufferedSource getValidOutputFormatsForInputhNQ4ISI;

    @javax.annotation.Nullable
    private com.squareup.moshi.JsonValueSource isOutputSupportedFor;

    @javax.annotation.Nullable
    private java.lang.String toString;
    private static final okio.ByteString getOutputFormats = okio.ByteString.encodeUtf8("'\\");
    private static final okio.ByteString getInputSizeshNQ4ISI = okio.ByteString.encodeUtf8("\"\\");
    private static final okio.ByteString getOutputSizeshNQ4ISI = okio.ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final okio.ByteString getInputFormats = okio.ByteString.encodeUtf8("\n\r");
    private static final okio.ByteString getHighSpeedVideoSizesFor = okio.ByteString.encodeUtf8("*/");

    JsonUtf8Reader(okio.BufferedSource bufferedSource) {
        this.getOutputMinFrameDurationlomOqCM = 0;
        if (bufferedSource == null) {
            throw new java.lang.NullPointerException("source == null");
        }
        this.getValidOutputFormatsForInputhNQ4ISI = bufferedSource;
        this.getOutputStallDurationlomOqCM = bufferedSource.getBuffer();
        getHighSpeedVideoSizes(6);
    }

    private JsonUtf8Reader(com.squareup.moshi.JsonUtf8Reader jsonUtf8Reader) {
        super(jsonUtf8Reader);
        this.getOutputMinFrameDurationlomOqCM = 0;
        okio.BufferedSource peek = jsonUtf8Reader.getValidOutputFormatsForInputhNQ4ISI.peek();
        this.getValidOutputFormatsForInputhNQ4ISI = peek;
        this.getOutputStallDurationlomOqCM = peek.getBuffer();
        this.getOutputMinFrameDurationlomOqCM = jsonUtf8Reader.getOutputMinFrameDurationlomOqCM;
        this.getOutputStallDuration = jsonUtf8Reader.getOutputStallDuration;
        this.getOutputSizes = jsonUtf8Reader.getOutputSizes;
        this.toString = jsonUtf8Reader.toString;
        try {
            peek.require(jsonUtf8Reader.getOutputStallDurationlomOqCM.size());
        } catch (java.io.IOException unused) {
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 3) {
            getHighSpeedVideoSizes(1);
            this.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration - 1] = 0;
            this.getOutputMinFrameDurationlomOqCM = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 4) {
            this.getOutputMinFrameDuration--;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            this.getOutputMinFrameDurationlomOqCM = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.squareup.moshi.JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 1) {
            getHighSpeedVideoSizes(3);
            this.getOutputMinFrameDurationlomOqCM = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 2) {
            this.getOutputMinFrameDuration--;
            this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration] = null;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            this.getOutputMinFrameDurationlomOqCM = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.squareup.moshi.JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public final com.squareup.moshi.JsonReader.Token peek() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        switch (i) {
            case 1:
                return com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return com.squareup.moshi.JsonReader.Token.END_OBJECT;
            case 3:
                return com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return com.squareup.moshi.JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return com.squareup.moshi.JsonReader.Token.BOOLEAN;
            case 7:
                return com.squareup.moshi.JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.squareup.moshi.JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return com.squareup.moshi.JsonReader.Token.NAME;
            case 16:
            case 17:
                return com.squareup.moshi.JsonReader.Token.NUMBER;
            case 18:
                return com.squareup.moshi.JsonReader.Token.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e6, code lost:
    
        if (r1 == 5) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e8, code lost:
    
        if (r1 != 6) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ea, code lost:
    
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ec, code lost:
    
        r8 = -(r6 - 48);
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f7, code lost:
    
        if (Camera2StreamConfigurationMap(r6) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021d, code lost:
    
        if (r1 != 2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        if (r4 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0225, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        if (r5 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022d, code lost:
    
        if (r8 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022f, code lost:
    
        if (r5 != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0231, code lost:
    
        if (r5 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0233, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0234, code lost:
    
        r17.getOutputStallDuration = r8;
        r17.getOutputStallDurationlomOqCM.skip(r2);
        r17.getOutputMinFrameDurationlomOqCM = 16;
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0243, code lost:
    
        if (r1 == 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0246, code lost:
    
        if (r1 == 4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0249, code lost:
    
        if (r1 != 7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024e, code lost:
    
        r17.getOutputSizes = r2;
        r17.getOutputMinFrameDurationlomOqCM = 17;
        r6 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01fb, code lost:
    
        if (r1 != 2) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fd, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ff, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0200, code lost:
    
        if (r1 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0202, code lost:
    
        r1 = 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0206, code lost:
    
        if (r1 == 5) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0216, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x020b, code lost:
    
        if (r1 == 2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x020e, code lost:
    
        if (r1 != 4) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0210, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0212, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0214, code lost:
    
        if (r1 != 5) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x011e, code lost:
    
        r1 = "null";
        r2 = "NULL";
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0130, code lost:
    
        r6 = r1.length();
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0135, code lost:
    
        if (r8 >= r6) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0137, code lost:
    
        r4 = r8 + 1;
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0142, code lost:
    
        if (r17.getValidOutputFormatsForInputhNQ4ISI.request(r4) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0146, code lost:
    
        r9 = r17.getOutputStallDurationlomOqCM.getByte(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0151, code lost:
    
        if (r9 == r1.charAt(r8)) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0157, code lost:
    
        if (r9 == r2.charAt(r8)) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0144, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x015a, code lost:
    
        r8 = r4;
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x015f, code lost:
    
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x016a, code lost:
    
        if (r17.getValidOutputFormatsForInputhNQ4ISI.request(r6 + 1) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0177, code lost:
    
        if (Camera2StreamConfigurationMap(r17.getOutputStallDurationlomOqCM.getByte(r6)) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x017a, code lost:
    
        r17.getOutputStallDurationlomOqCM.skip(r6);
        r17.getOutputMinFrameDurationlomOqCM = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0124, code lost:
    
        r1 = "false";
        r2 = "FALSE";
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x012a, code lost:
    
        r1 = "true";
        r2 = "TRUE";
        r5 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x027e, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0285, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0286, code lost:
    
        r2 = "Use JsonReader.setLenient(true) to accept malformed JSON";
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0287, code lost:
    
        if (r1 != 1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0289, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0291, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x029c, code lost:
    
        if (r1 == 1) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x029e, code lost:
    
        if (r1 != 2) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02a7, code lost:
    
        throw Camera2StreamConfigurationMap("Unexpected value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02aa, code lost:
    
        if (r17.getHighSpeedVideoFpsRangesFor == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02ac, code lost:
    
        r17.getOutputMinFrameDurationlomOqCM = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02af, code lost:
    
        return 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02b4, code lost:
    
        throw Camera2StreamConfigurationMap(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0292, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x029a, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x029b, code lost:
    
        r2 = "Use JsonReader.setLenient(true) to accept malformed JSON";
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02b8, code lost:
    
        if (r17.getHighSpeedVideoFpsRangesFor == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02ba, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02c3, code lost:
    
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02c8, code lost:
    
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02c9, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02d2, code lost:
    
        return 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0022, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e1, code lost:
    
        r5 = getHighResolutionOutputSizeshNQ4ISI(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02db, code lost:
    
        r17.getHighResolutionOutputSizeshNQ4ISI[r17.getOutputMinFrameDuration - 1] = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02e7, code lost:
    
        if (r1 != 5) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02e9, code lost:
    
        r5 = getHighResolutionOutputSizeshNQ4ISI(true);
        r17.getOutputStallDurationlomOqCM.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x02f2, code lost:
    
        if (r5 == 44) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02f4, code lost:
    
        if (r5 == 59) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02f6, code lost:
    
        if (r5 != 125) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r5 == 34) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02f8, code lost:
    
        r17.getOutputMinFrameDurationlomOqCM = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02fa, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0301, code lost:
    
        throw Camera2StreamConfigurationMap("Unterminated object");
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0304, code lost:
    
        if (r17.getHighSpeedVideoFpsRangesFor == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x030b, code lost:
    
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x030c, code lost:
    
        r3 = getHighResolutionOutputSizeshNQ4ISI(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0312, code lost:
    
        if (r3 == 34) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0316, code lost:
    
        if (r3 == 39) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x031a, code lost:
    
        if (r3 == 125) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x031e, code lost:
    
        if (r17.getHighSpeedVideoFpsRangesFor == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (Camera2StreamConfigurationMap((char) r3) == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0327, code lost:
    
        r17.getOutputMinFrameDurationlomOqCM = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x032b, code lost:
    
        return 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        if (r5 == 39) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0330, code lost:
    
        throw Camera2StreamConfigurationMap("Expected name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0335, code lost:
    
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0337, code lost:
    
        if (r1 == 5) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0339, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0340, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0345, code lost:
    
        throw Camera2StreamConfigurationMap("Expected name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        if (r5 == 44) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0346, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x034d, code lost:
    
        if (r17.getHighSpeedVideoFpsRangesFor == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x034f, code lost:
    
        r17.getOutputMinFrameDurationlomOqCM = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0353, code lost:
    
        return 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0358, code lost:
    
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0359, code lost:
    
        r17.getOutputStallDurationlomOqCM.readByte();
        r17.getOutputMinFrameDurationlomOqCM = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0362, code lost:
    
        return 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r5 == 59) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        if (r5 == 91) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (r5 == 93) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        if (r5 == 123) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        r1 = r17.getOutputStallDurationlomOqCM.getByte(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        if (r1 == 116) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
    
        if (r1 == 84) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        if (r1 == 102) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        if (r1 == 70) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:
    
        if (r1 == 110) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
    
        if (r1 == 78) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r5 = r4;
        r16 = "Use JsonReader.setLenient(true) to accept malformed JSON";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0182, code lost:
    
        if (r5 == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0185, code lost:
    
        r4 = true;
        r8 = 0;
        r1 = 0;
        r2 = 0;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018a, code lost:
    
        r15 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        if (r17.getValidOutputFormatsForInputhNQ4ISI.request(r15) == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0195, code lost:
    
        r6 = r17.getOutputStallDurationlomOqCM.getByte(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019e, code lost:
    
        if (r6 == 43) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a2, code lost:
    
        if (r6 == 69) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a6, code lost:
    
        if (r6 == 101) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01aa, code lost:
    
        if (r6 == 45) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ae, code lost:
    
        if (r6 == 46) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b2, code lost:
    
        if (r6 < 48) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b6, code lost:
    
        if (r6 > 57) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b8, code lost:
    
        if (r1 == 1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ba, code lost:
    
        if (r1 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bc, code lost:
    
        if (r1 != 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c0, code lost:
    
        if (r8 == r12) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c2, code lost:
    
        r10 = (10 * r8) - (r6 - 48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d0, code lost:
    
        if (r8 > (-922337203685477580L)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d2, code lost:
    
        if (r8 != (-922337203685477580L)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d6, code lost:
    
        if (r10 < r8) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d8, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01db, code lost:
    
        r4 = r4 & r2;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0217, code lost:
    
        r2 = r15;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01da, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024c, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0256, code lost:
    
        if (r6 == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0258, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0265, code lost:
    
        if (Camera2StreamConfigurationMap(r17.getOutputStallDurationlomOqCM.getByte(0)) == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (r17.getHighSpeedVideoFpsRangesFor == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r17.getOutputMinFrameDurationlomOqCM = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x026f, code lost:
    
        return 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0276, code lost:
    
        throw Camera2StreamConfigurationMap(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027d, code lost:
    
        throw Camera2StreamConfigurationMap("Expected value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        if (r1 != 3) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
    
        r1 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        int i;
        while (true) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1];
            long j = 0;
            java.lang.String str = "Use JsonReader.setLenient(true) to accept malformed JSON";
            if (i2 == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = 2;
                break;
            }
            if (i2 == 2) {
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(true);
                this.getOutputStallDurationlomOqCM.readByte();
                if (highResolutionOutputSizeshNQ4ISI != 44) {
                    if (highResolutionOutputSizeshNQ4ISI != 59) {
                        if (highResolutionOutputSizeshNQ4ISI == 93) {
                            this.getOutputMinFrameDurationlomOqCM = 4;
                            return 4;
                        }
                        throw Camera2StreamConfigurationMap("Unterminated array");
                    }
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            } else {
                if (i2 == 3 || i2 == 5) {
                    break;
                }
                if (i2 == 4) {
                    this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = 5;
                    int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(true);
                    this.getOutputStallDurationlomOqCM.readByte();
                    if (highResolutionOutputSizeshNQ4ISI2 != 58) {
                        if (highResolutionOutputSizeshNQ4ISI2 != 61) {
                            throw Camera2StreamConfigurationMap("Expected ':'");
                        }
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            if (this.getValidOutputFormatsForInputhNQ4ISI.request(1L) && this.getOutputStallDurationlomOqCM.getByte(0L) == 62) {
                                this.getOutputStallDurationlomOqCM.readByte();
                            }
                        } else {
                            throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    }
                } else {
                    if (i2 == 6) {
                        this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = 7;
                        break;
                    }
                    if (i2 == 7) {
                        i = 0;
                        if (getHighResolutionOutputSizeshNQ4ISI(false) == -1) {
                            this.getOutputMinFrameDurationlomOqCM = 18;
                            return 18;
                        }
                        if (!this.getHighSpeedVideoFpsRangesFor) {
                            throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    } else {
                        i = 0;
                        if (i2 == 9) {
                            com.squareup.moshi.JsonValueSource jsonValueSource = this.isOutputSupportedFor;
                            jsonValueSource.getHighSpeedVideoSizesFor = true;
                            while (jsonValueSource.getOutputMinFrameDuration != com.squareup.moshi.JsonValueSource.getHighSpeedVideoFpsRangesFor) {
                                jsonValueSource.getHighResolutionOutputSizeshNQ4ISI(8192L);
                                jsonValueSource.getInputSizeshNQ4ISI.skip(jsonValueSource.getInputFormats);
                            }
                            this.isOutputSupportedFor = null;
                            this.getOutputMinFrameDuration--;
                        } else if (i2 == 8) {
                            throw new java.lang.IllegalStateException("JsonReader is closed");
                        }
                    }
                }
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final java.lang.String nextName() throws java.io.IOException {
        java.lang.String str;
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 14) {
            str = getHighSpeedVideoFpsRanges();
        } else if (i == 13) {
            str = getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
        } else if (i == 12) {
            str = getHighSpeedVideoFpsRangesFor(getOutputFormats);
        } else if (i == 15) {
            str = this.toString;
            this.toString = null;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectName(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return getHighSpeedVideoSizes(this.toString, options);
        }
        int select = this.getValidOutputFormatsForInputhNQ4ISI.select(options.Camera2StreamConfigurationMap);
        if (select != -1) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = options.getHighSpeedVideoFpsRanges[select];
            return select;
        }
        java.lang.String str = this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1];
        java.lang.String nextName = nextName();
        int highSpeedVideoSizes = getHighSpeedVideoSizes(nextName, options);
        if (highSpeedVideoSizes == -1) {
            this.getOutputMinFrameDurationlomOqCM = 15;
            this.toString = nextName;
            this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = str;
        }
        return highSpeedVideoSizes;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipName() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap) {
            com.squareup.moshi.JsonReader.Token peek = peek();
            nextName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot skip unexpected ");
            sb.append(peek);
            sb.append(" at ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 14) {
            getOutputFormats();
        } else if (i == 13) {
            getHighResolutionOutputSizeshNQ4ISI(getInputSizeshNQ4ISI);
        } else if (i == 12) {
            getHighResolutionOutputSizeshNQ4ISI(getOutputFormats);
        } else if (i != 15) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a name but was ");
            sb2.append(peek());
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb2.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = "null";
    }

    private int getHighSpeedVideoSizes(java.lang.String str, com.squareup.moshi.JsonReader.Options options) {
        int length = options.getHighSpeedVideoFpsRanges.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.getHighSpeedVideoFpsRanges[i])) {
                this.getOutputMinFrameDurationlomOqCM = 0;
                this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final java.lang.String nextString() throws java.io.IOException {
        java.lang.String readUtf8;
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 10) {
            readUtf8 = getHighSpeedVideoFpsRanges();
        } else if (i == 9) {
            readUtf8 = getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
        } else if (i == 8) {
            readUtf8 = getHighSpeedVideoFpsRangesFor(getOutputFormats);
        } else if (i == 11) {
            readUtf8 = this.toString;
            this.toString = null;
        } else if (i == 16) {
            readUtf8 = java.lang.Long.toString(this.getOutputStallDuration);
        } else if (i == 17) {
            readUtf8 = this.getOutputStallDurationlomOqCM.readUtf8(this.getOutputSizes);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a string but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = 0;
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getOutputMinFrameDuration - 1;
        iArr[i2] = iArr[i2] + 1;
        return readUtf8;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectString(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return Camera2StreamConfigurationMap(this.toString, options);
        }
        int select = this.getValidOutputFormatsForInputhNQ4ISI.select(options.Camera2StreamConfigurationMap);
        if (select != -1) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            return select;
        }
        java.lang.String nextString = nextString();
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(nextString, options);
        if (Camera2StreamConfigurationMap == -1) {
            this.getOutputMinFrameDurationlomOqCM = 11;
            this.toString = nextString;
            this.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration - 1] = r0[r1] - 1;
        }
        return Camera2StreamConfigurationMap;
    }

    private int Camera2StreamConfigurationMap(java.lang.String str, com.squareup.moshi.JsonReader.Options options) {
        int length = options.getHighSpeedVideoFpsRanges.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.getHighSpeedVideoFpsRanges[i])) {
                this.getOutputMinFrameDurationlomOqCM = 0;
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                int i2 = this.getOutputMinFrameDuration - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 5) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getOutputMinFrameDuration - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a boolean but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.squareup.moshi.JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    @javax.annotation.Nullable
    public final <T> T nextNull() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 7) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected null but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.squareup.moshi.JsonDataException(sb.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() throws java.io.IOException {
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 16) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.getOutputStallDuration;
        }
        if (i == 17) {
            this.toString = this.getOutputStallDurationlomOqCM.readUtf8(this.getOutputSizes);
        } else if (i == 9) {
            this.toString = getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
        } else if (i == 8) {
            this.toString = getHighSpeedVideoFpsRangesFor(getOutputFormats);
        } else if (i == 10) {
            this.toString = getHighSpeedVideoFpsRanges();
        } else if (i != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a double but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = 11;
        try {
            double parseDouble = java.lang.Double.parseDouble(this.toString);
            if (!this.getHighSpeedVideoFpsRangesFor && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(getPath());
                throw new com.squareup.moshi.JsonEncodingException(sb2.toString());
            }
            this.toString = null;
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getOutputMinFrameDuration - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a double but was ");
            sb3.append(this.toString);
            sb3.append(" at path ");
            sb3.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb3.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() throws java.io.IOException {
        java.lang.String highSpeedVideoFpsRangesFor;
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 16) {
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getOutputMinFrameDuration - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.getOutputStallDuration;
        }
        if (i == 17) {
            this.toString = this.getOutputStallDurationlomOqCM.readUtf8(this.getOutputSizes);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
            } else {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getOutputFormats);
            }
            this.toString = highSpeedVideoFpsRangesFor;
            try {
                long parseLong = java.lang.Long.parseLong(highSpeedVideoFpsRangesFor);
                this.getOutputMinFrameDurationlomOqCM = 0;
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                int i3 = this.getOutputMinFrameDuration - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else if (i != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a long but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = 11;
        try {
            long longValueExact = new java.math.BigDecimal(this.toString).longValueExact();
            this.toString = null;
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr3 = this.getHighSpeedVideoFpsRanges;
            int i4 = this.getOutputMinFrameDuration - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException unused2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a long but was ");
            sb2.append(this.toString);
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb2.toString());
        }
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(okio.ByteString byteString) throws java.io.IOException {
        java.lang.StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw Camera2StreamConfigurationMap("Unterminated string");
            }
            if (this.getOutputStallDurationlomOqCM.getByte(indexOfElement) != 92) {
                if (sb == null) {
                    java.lang.String readUtf8 = this.getOutputStallDurationlomOqCM.readUtf8(indexOfElement);
                    this.getOutputStallDurationlomOqCM.readByte();
                    return readUtf8;
                }
                sb.append(this.getOutputStallDurationlomOqCM.readUtf8(indexOfElement));
                this.getOutputStallDurationlomOqCM.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            sb.append(this.getOutputStallDurationlomOqCM.readUtf8(indexOfElement));
            this.getOutputStallDurationlomOqCM.readByte();
            sb.append(Camera2StreamConfigurationMap());
        }
    }

    private java.lang.String getHighSpeedVideoFpsRanges() throws java.io.IOException {
        long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(getOutputSizeshNQ4ISI);
        return indexOfElement != -1 ? this.getOutputStallDurationlomOqCM.readUtf8(indexOfElement) : this.getOutputStallDurationlomOqCM.readUtf8();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(okio.ByteString byteString) throws java.io.IOException {
        while (true) {
            long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw Camera2StreamConfigurationMap("Unterminated string");
            }
            if (this.getOutputStallDurationlomOqCM.getByte(indexOfElement) == 92) {
                this.getOutputStallDurationlomOqCM.skip(indexOfElement + 1);
                Camera2StreamConfigurationMap();
            } else {
                this.getOutputStallDurationlomOqCM.skip(indexOfElement + 1);
                return;
            }
        }
    }

    private void getOutputFormats() throws java.io.IOException {
        long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(getOutputSizeshNQ4ISI);
        okio.Buffer buffer = this.getOutputStallDurationlomOqCM;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() throws java.io.IOException {
        java.lang.String highSpeedVideoFpsRangesFor;
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            i = getHighResolutionOutputSizeshNQ4ISI();
        }
        if (i == 16) {
            long j = this.getOutputStallDuration;
            int i2 = (int) j;
            if (j != i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an int but was ");
                sb.append(this.getOutputStallDuration);
                sb.append(" at path ");
                sb.append(getPath());
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getOutputMinFrameDuration - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 17) {
            this.toString = this.getOutputStallDurationlomOqCM.readUtf8(this.getOutputSizes);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
            } else {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getOutputFormats);
            }
            this.toString = highSpeedVideoFpsRangesFor;
            try {
                int parseInt = java.lang.Integer.parseInt(highSpeedVideoFpsRangesFor);
                this.getOutputMinFrameDurationlomOqCM = 0;
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                int i4 = this.getOutputMinFrameDuration - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else if (i != 11) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected an int but was ");
            sb2.append(peek());
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb2.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = 11;
        try {
            double parseDouble = java.lang.Double.parseDouble(this.toString);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected an int but was ");
                sb3.append(this.toString);
                sb3.append(" at path ");
                sb3.append(getPath());
                throw new com.squareup.moshi.JsonDataException(sb3.toString());
            }
            this.toString = null;
            this.getOutputMinFrameDurationlomOqCM = 0;
            int[] iArr3 = this.getHighSpeedVideoFpsRanges;
            int i6 = this.getOutputMinFrameDuration - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (java.lang.NumberFormatException unused2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected an int but was ");
            sb4.append(this.toString);
            sb4.append(" at path ");
            sb4.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb4.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighResolutionOutputSizeshNQ4ISI[0] = 8;
        this.getOutputMinFrameDuration = 1;
        this.getOutputStallDurationlomOqCM.clear();
        this.getValidOutputFormatsForInputhNQ4ISI.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            sb.append(" at ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        int i = 0;
        do {
            int i2 = this.getOutputMinFrameDurationlomOqCM;
            if (i2 == 0) {
                i2 = getHighResolutionOutputSizeshNQ4ISI();
            }
            if (i2 == 3) {
                getHighSpeedVideoSizes(1);
            } else if (i2 == 1) {
                getHighSpeedVideoSizes(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a value but was ");
                        sb2.append(peek());
                        sb2.append(" at path ");
                        sb2.append(getPath());
                        throw new com.squareup.moshi.JsonDataException(sb2.toString());
                    }
                    this.getOutputMinFrameDuration--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a value but was ");
                        sb3.append(peek());
                        sb3.append(" at path ");
                        sb3.append(getPath());
                        throw new com.squareup.moshi.JsonDataException(sb3.toString());
                    }
                    this.getOutputMinFrameDuration--;
                } else if (i2 == 14 || i2 == 10) {
                    getOutputFormats();
                } else if (i2 == 9 || i2 == 13) {
                    getHighResolutionOutputSizeshNQ4ISI(getInputSizeshNQ4ISI);
                } else if (i2 == 8 || i2 == 12) {
                    getHighResolutionOutputSizeshNQ4ISI(getOutputFormats);
                } else if (i2 == 17) {
                    this.getOutputStallDurationlomOqCM.skip(this.getOutputSizes);
                } else if (i2 == 18) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected a value but was ");
                    sb4.append(peek());
                    sb4.append(" at path ");
                    sb4.append(getPath());
                    throw new com.squareup.moshi.JsonDataException(sb4.toString());
                }
                this.getOutputMinFrameDurationlomOqCM = 0;
            }
            i++;
            this.getOutputMinFrameDurationlomOqCM = 0;
        } while (i != 0);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i3 = this.getOutputMinFrameDuration - 1;
        iArr[i3] = iArr[i3] + 1;
        this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = "null";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okio.BufferedSource nextSource() throws java.io.IOException {
        okio.ByteString byteString;
        int i;
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        if (i2 == 0) {
            i2 = getHighResolutionOutputSizeshNQ4ISI();
        }
        okio.Buffer buffer = new okio.Buffer();
        okio.ByteString byteString2 = com.squareup.moshi.JsonValueSource.getHighSpeedVideoFpsRangesFor;
        if (i2 == 3) {
            buffer.writeUtf8("[");
            byteString = com.squareup.moshi.JsonValueSource.getHighResolutionOutputSizeshNQ4ISI;
        } else if (i2 == 1) {
            buffer.writeUtf8("{");
            byteString = com.squareup.moshi.JsonValueSource.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            if (i2 == 9) {
                buffer.writeUtf8("\"");
                byteString2 = com.squareup.moshi.JsonValueSource.getHighSpeedVideoFpsRanges;
            } else if (i2 == 8) {
                buffer.writeUtf8("'");
                byteString2 = com.squareup.moshi.JsonValueSource.getOutputFormats;
            } else if (i2 == 17 || i2 == 16 || i2 == 10) {
                buffer.writeUtf8(nextString());
            } else if (i2 == 5) {
                buffer.writeUtf8("true");
            } else if (i2 == 6) {
                buffer.writeUtf8("false");
            } else if (i2 == 7) {
                buffer.writeUtf8("null");
            } else if (i2 == 11) {
                java.lang.String nextString = nextString();
                com.squareup.moshi.JsonWriter of = com.squareup.moshi.JsonWriter.of(buffer);
                try {
                    of.value(nextString);
                    if (of != null) {
                        of.close();
                    }
                } catch (java.lang.Throwable th) {
                    if (of != null) {
                        try {
                            of.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a value but was ");
                sb.append(peek());
                sb.append(" at path ");
                sb.append(getPath());
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
            byteString = byteString2;
            i = 0;
            if (this.getOutputMinFrameDurationlomOqCM != 0) {
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                int i3 = this.getOutputMinFrameDuration - 1;
                iArr[i3] = iArr[i3] + 1;
                this.getOutputMinFrameDurationlomOqCM = 0;
            }
            this.isOutputSupportedFor = new com.squareup.moshi.JsonValueSource(this.getValidOutputFormatsForInputhNQ4ISI, buffer, byteString, i);
            getHighSpeedVideoSizes(9);
            return okio.Okio.buffer(this.isOutputSupportedFor);
        }
        i = 1;
        if (this.getOutputMinFrameDurationlomOqCM != 0) {
        }
        this.isOutputSupportedFor = new com.squareup.moshi.JsonValueSource(this.getValidOutputFormatsForInputhNQ4ISI, buffer, byteString, i);
        getHighSpeedVideoSizes(9);
        return okio.Okio.buffer(this.isOutputSupportedFor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r6.getOutputStallDurationlomOqCM.skip(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 != 47) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r0 != 35) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r6.getHighSpeedVideoFpsRangesFor == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        getHighSpeedVideoFpsRangesFor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        if (r6.getValidOutputFormatsForInputhNQ4ISI.request(2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
    
        if (r6.getHighSpeedVideoFpsRangesFor == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003c, code lost:
    
        r1 = r6.getOutputStallDurationlomOqCM.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (r1 == 42) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        r6.getOutputStallDurationlomOqCM.readByte();
        r6.getOutputStallDurationlomOqCM.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (getHighSpeedVideoSizes() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        throw Camera2StreamConfigurationMap("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0048, code lost:
    
        if (r1 != 47) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004a, code lost:
    
        r6.getOutputStallDurationlomOqCM.readByte();
        r6.getOutputStallDurationlomOqCM.readByte();
        getHighSpeedVideoFpsRangesFor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getHighResolutionOutputSizeshNQ4ISI(boolean z) throws java.io.IOException {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.getValidOutputFormatsForInputhNQ4ISI.request(i2)) {
                    if (z) {
                        throw new java.io.EOFException("End of input");
                    }
                    return -1;
                }
                long j = i;
                byte b = this.getOutputStallDurationlomOqCM.getByte(j);
                if (b != 10 && b != 32 && b != 13 && b != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(getInputFormats);
        okio.Buffer buffer = this.getOutputStallDurationlomOqCM;
        buffer.skip(indexOfElement != -1 ? indexOfElement + 1 : buffer.size());
    }

    private boolean getHighSpeedVideoSizes() throws java.io.IOException {
        long indexOf = this.getValidOutputFormatsForInputhNQ4ISI.indexOf(getHighSpeedVideoSizesFor);
        boolean z = indexOf != -1;
        okio.Buffer buffer = this.getOutputStallDurationlomOqCM;
        buffer.skip(z ? indexOf + r1.size() : buffer.size());
        return z;
    }

    @Override // com.squareup.moshi.JsonReader
    public final com.squareup.moshi.JsonReader peekJson() {
        return new com.squareup.moshi.JsonUtf8Reader(this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonReader(");
        sb.append(this.getValidOutputFormatsForInputhNQ4ISI);
        sb.append(")");
        return sb.toString();
    }

    private char Camera2StreamConfigurationMap() throws java.io.IOException {
        int i;
        if (!this.getValidOutputFormatsForInputhNQ4ISI.request(1L)) {
            throw Camera2StreamConfigurationMap("Unterminated escape sequence");
        }
        byte readByte = this.getOutputStallDurationlomOqCM.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte == 117) {
            if (!this.getValidOutputFormatsForInputhNQ4ISI.request(4L)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unterminated escape sequence at path ");
                sb.append(getPath());
                throw new java.io.EOFException(sb.toString());
            }
            char c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte b = this.getOutputStallDurationlomOqCM.getByte(i2);
                char c2 = (char) (c << 4);
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\\u");
                        sb2.append(this.getOutputStallDurationlomOqCM.readUtf8(4L));
                        throw Camera2StreamConfigurationMap(sb2.toString());
                    }
                    i = b - 55;
                }
                c = (char) (c2 + i);
            }
            this.getOutputStallDurationlomOqCM.skip(4L);
            return c;
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            return (char) readByte;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid escape sequence: \\");
        sb3.append((char) readByte);
        throw Camera2StreamConfigurationMap(sb3.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() throws java.io.IOException {
        if (hasNext()) {
            this.toString = nextName();
            this.getOutputMinFrameDurationlomOqCM = 11;
        }
    }

    private boolean Camera2StreamConfigurationMap(int i) throws java.io.IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            return false;
        }
        throw Camera2StreamConfigurationMap("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}
