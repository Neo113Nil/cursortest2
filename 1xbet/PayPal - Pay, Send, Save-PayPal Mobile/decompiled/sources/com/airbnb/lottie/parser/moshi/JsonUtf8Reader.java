package com.airbnb.lottie.parser.moshi;

/* loaded from: classes7.dex */
final class JsonUtf8Reader extends com.airbnb.lottie.parser.moshi.JsonReader {
    private final okio.Buffer getOutputMinFrameDurationlomOqCM;
    private int getOutputSizeshNQ4ISI;
    private int getOutputStallDuration = 0;
    private long getOutputStallDurationlomOqCM;
    private final okio.BufferedSource getValidOutputFormatsForInputhNQ4ISI;
    private java.lang.String isOutputSupportedFor;
    private static final okio.ByteString getOutputFormats = okio.ByteString.encodeUtf8("'\\");
    private static final okio.ByteString getInputSizeshNQ4ISI = okio.ByteString.encodeUtf8("\"\\");
    private static final okio.ByteString getOutputSizes = okio.ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final okio.ByteString getHighSpeedVideoSizesFor = okio.ByteString.encodeUtf8("\n\r");
    private static final okio.ByteString getOutputMinFrameDuration = okio.ByteString.encodeUtf8("*/");

    JsonUtf8Reader(okio.BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new java.lang.NullPointerException("source == null");
        }
        this.getValidOutputFormatsForInputhNQ4ISI = bufferedSource;
        this.getOutputMinFrameDurationlomOqCM = bufferedSource.getBufferField();
        Camera2StreamConfigurationMap(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void beginArray() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 3) {
            Camera2StreamConfigurationMap(1);
            this.getHighSpeedVideoFpsRanges[this.getInputFormats - 1] = 0;
            this.getOutputStallDuration = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void endArray() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 4) {
            this.getInputFormats--;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getInputFormats - 1;
            iArr[i2] = iArr[i2] + 1;
            this.getOutputStallDuration = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void beginObject() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 1) {
            Camera2StreamConfigurationMap(3);
            this.getOutputStallDuration = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void endObject() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 2) {
            this.getInputFormats--;
            this.getHighSpeedVideoSizes[this.getInputFormats] = null;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getInputFormats - 1;
            iArr[i2] = iArr[i2] + 1;
            this.getOutputStallDuration = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean hasNext() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final com.airbnb.lottie.parser.moshi.JsonReader.Token peek() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        switch (i) {
            case 1:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.END_OBJECT;
            case 3:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.BOOLEAN;
            case 7:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.NAME;
            case 16:
            case 17:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER;
            case 18:
                return com.airbnb.lottie.parser.moshi.JsonReader.Token.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
    
        if (r5 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0207, code lost:
    
        if (r6 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0209, code lost:
    
        if (r5 != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
    
        if (r5 != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020e, code lost:
    
        r16.getOutputStallDurationlomOqCM = r6;
        r16.getOutputMinFrameDurationlomOqCM.skip(r2);
        r16.getOutputStallDuration = 16;
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021d, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021e, code lost:
    
        if (r1 == r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0221, code lost:
    
        if (r1 == 4) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0224, code lost:
    
        if (r1 != 7) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
    
        r16.getOutputSizeshNQ4ISI = r2;
        r16.getOutputStallDuration = 17;
        r5 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d1, code lost:
    
        if (getHighSpeedVideoFpsRanges(r8) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f6, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f7, code lost:
    
        if (r1 != 2) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f9, code lost:
    
        if (r4 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ff, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0233 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        int i;
        int highSpeedVideoFpsRangesFor;
        java.lang.String str;
        java.lang.String str2;
        int i2;
        byte b;
        int i3;
        char c;
        int i4 = this.getHighSpeedVideoFpsRangesFor[this.getInputFormats - 1];
        if (i4 == 1) {
            this.getHighSpeedVideoFpsRangesFor[this.getInputFormats - 1] = 2;
        } else if (i4 == 2) {
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(true);
            this.getOutputMinFrameDurationlomOqCM.readByte();
            if (highSpeedVideoFpsRangesFor2 != 44) {
                if (highSpeedVideoFpsRangesFor2 != 59) {
                    if (highSpeedVideoFpsRangesFor2 == 93) {
                        this.getOutputStallDuration = 4;
                        return 4;
                    }
                    throw getHighSpeedVideoFpsRangesFor("Unterminated array");
                }
                if (!this.Camera2StreamConfigurationMap) {
                    throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                this.getHighSpeedVideoFpsRangesFor[this.getInputFormats - 1] = 4;
                if (i4 == 5) {
                    int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(true);
                    this.getOutputMinFrameDurationlomOqCM.readByte();
                    if (highSpeedVideoFpsRangesFor3 != 44) {
                        if (highSpeedVideoFpsRangesFor3 != 59) {
                            if (highSpeedVideoFpsRangesFor3 == 125) {
                                this.getOutputStallDuration = 2;
                                return 2;
                            }
                            throw getHighSpeedVideoFpsRangesFor("Unterminated object");
                        }
                        if (!this.Camera2StreamConfigurationMap) {
                            throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    }
                }
                int highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(true);
                if (highSpeedVideoFpsRangesFor4 == 34) {
                    this.getOutputMinFrameDurationlomOqCM.readByte();
                    this.getOutputStallDuration = 13;
                    return 13;
                }
                if (highSpeedVideoFpsRangesFor4 == 39) {
                    this.getOutputMinFrameDurationlomOqCM.readByte();
                    if (this.Camera2StreamConfigurationMap) {
                        this.getOutputStallDuration = 12;
                        return 12;
                    }
                    throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (highSpeedVideoFpsRangesFor4 == 125) {
                    if (i4 != 5) {
                        this.getOutputMinFrameDurationlomOqCM.readByte();
                        this.getOutputStallDuration = 2;
                        return 2;
                    }
                    throw getHighSpeedVideoFpsRangesFor("Expected name");
                }
                if (this.Camera2StreamConfigurationMap) {
                    if (getHighSpeedVideoFpsRanges((char) highSpeedVideoFpsRangesFor4)) {
                        this.getOutputStallDuration = 14;
                        return 14;
                    }
                    throw getHighSpeedVideoFpsRangesFor("Expected name");
                }
                throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            if (i4 == 4) {
                this.getHighSpeedVideoFpsRangesFor[this.getInputFormats - 1] = 5;
                int highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor(true);
                this.getOutputMinFrameDurationlomOqCM.readByte();
                if (highSpeedVideoFpsRangesFor5 != 58) {
                    if (highSpeedVideoFpsRangesFor5 != 61) {
                        throw getHighSpeedVideoFpsRangesFor("Expected ':'");
                    }
                    if (this.Camera2StreamConfigurationMap) {
                        if (this.getValidOutputFormatsForInputhNQ4ISI.request(1L) && this.getOutputMinFrameDurationlomOqCM.getByte(0L) == 62) {
                            this.getOutputMinFrameDurationlomOqCM.readByte();
                        }
                    } else {
                        throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            } else if (i4 == 6) {
                this.getHighSpeedVideoFpsRangesFor[this.getInputFormats - 1] = 7;
            } else {
                if (i4 == 7) {
                    i = 0;
                    if (getHighSpeedVideoFpsRangesFor(false) == -1) {
                        this.getOutputStallDuration = 18;
                        return 18;
                    }
                    if (!this.Camera2StreamConfigurationMap) {
                        throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                } else {
                    i = 0;
                    if (i4 == 8) {
                        throw new java.lang.IllegalStateException("JsonReader is closed");
                    }
                }
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(true);
                if (highSpeedVideoFpsRangesFor != 34) {
                    this.getOutputMinFrameDurationlomOqCM.readByte();
                    this.getOutputStallDuration = 9;
                    return 9;
                }
                if (highSpeedVideoFpsRangesFor == 39) {
                    if (this.Camera2StreamConfigurationMap) {
                        this.getOutputMinFrameDurationlomOqCM.readByte();
                        this.getOutputStallDuration = 8;
                        return 8;
                    }
                    throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (highSpeedVideoFpsRangesFor != 44 && highSpeedVideoFpsRangesFor != 59) {
                    if (highSpeedVideoFpsRangesFor == 91) {
                        this.getOutputMinFrameDurationlomOqCM.readByte();
                        this.getOutputStallDuration = 3;
                        return 3;
                    }
                    if (highSpeedVideoFpsRangesFor != 93) {
                        if (highSpeedVideoFpsRangesFor == 123) {
                            this.getOutputMinFrameDurationlomOqCM.readByte();
                            this.getOutputStallDuration = 1;
                            return 1;
                        }
                        byte b2 = this.getOutputMinFrameDurationlomOqCM.getByte(0L);
                        if (b2 == 116 || b2 == 84) {
                            str = "true";
                            str2 = "TRUE";
                            i2 = 5;
                        } else if (b2 == 102 || b2 == 70) {
                            str = "false";
                            str2 = "FALSE";
                            i2 = 6;
                        } else if (b2 == 110 || b2 == 78) {
                            str = "null";
                            str2 = "NULL";
                            i2 = 7;
                        } else {
                            i2 = i;
                            if (i2 == 0) {
                                return i2;
                            }
                            boolean z = true;
                            long j = 0;
                            char c2 = 0;
                            int i5 = 0;
                            boolean z2 = false;
                            while (true) {
                                int i6 = i5 + 1;
                                if (!this.getValidOutputFormatsForInputhNQ4ISI.request(i6)) {
                                    break;
                                }
                                byte b3 = this.getOutputMinFrameDurationlomOqCM.getByte(i5);
                                if (b3 != 43) {
                                    if (b3 == 69 || b3 == 101) {
                                        if (c2 != 2 && c2 != 4) {
                                            break;
                                        }
                                        c2 = 5;
                                        i5 = i6;
                                    } else if (b3 == 45) {
                                        c = 6;
                                        if (c2 == 0) {
                                            c2 = 1;
                                            z2 = true;
                                            i5 = i6;
                                        } else {
                                            if (c2 != 5) {
                                                break;
                                            }
                                            c2 = c;
                                            i5 = i6;
                                        }
                                    } else if (b3 == 46) {
                                        if (c2 != 2) {
                                            break;
                                        }
                                        c2 = 3;
                                        i5 = i6;
                                    } else {
                                        if (b3 < 48 || b3 > 57) {
                                            break;
                                        }
                                        if (c2 == 1 || c2 == 0) {
                                            j = -(b3 - 48);
                                            c2 = 2;
                                        } else if (c2 == 2) {
                                            if (j == 0) {
                                                break;
                                            }
                                            long j2 = (10 * j) - (b3 - 48);
                                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                            j = j2;
                                        } else if (c2 == 3) {
                                            c2 = 4;
                                        } else if (c2 == 5 || c2 == 6) {
                                            c2 = 7;
                                        }
                                        i5 = i6;
                                    }
                                    if (i3 == 0) {
                                        return i3;
                                    }
                                    if (!getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM.getByte(0L))) {
                                        throw getHighSpeedVideoFpsRangesFor("Expected value");
                                    }
                                    if (this.Camera2StreamConfigurationMap) {
                                        this.getOutputStallDuration = 10;
                                        return 10;
                                    }
                                    throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
                                }
                                c = 6;
                                if (c2 != 5) {
                                    break;
                                }
                                c2 = c;
                                i5 = i6;
                            }
                            i3 = 0;
                            if (i3 == 0) {
                            }
                        }
                        int length = str.length();
                        int i7 = 1;
                        while (true) {
                            if (i7 < length) {
                                int i8 = i7 + 1;
                                if (!this.getValidOutputFormatsForInputhNQ4ISI.request(i8) || ((b = this.getOutputMinFrameDurationlomOqCM.getByte(i7)) != str.charAt(i7) && b != str2.charAt(i7))) {
                                    break;
                                }
                                i7 = i8;
                            } else if (!this.getValidOutputFormatsForInputhNQ4ISI.request(length + 1) || !getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM.getByte(length))) {
                                this.getOutputMinFrameDurationlomOqCM.skip(length);
                                this.getOutputStallDuration = i2;
                            }
                        }
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    } else if (i4 == 1) {
                        this.getOutputMinFrameDurationlomOqCM.readByte();
                        this.getOutputStallDuration = 4;
                        return 4;
                    }
                }
                if (i4 != 1 && i4 != 2) {
                    throw getHighSpeedVideoFpsRangesFor("Unexpected value");
                }
                if (this.Camera2StreamConfigurationMap) {
                    this.getOutputStallDuration = 7;
                    return 7;
                }
                throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        }
        i = 0;
        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(true);
        if (highSpeedVideoFpsRangesFor != 34) {
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final java.lang.String nextName() throws java.io.IOException {
        java.lang.String str;
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 14) {
            str = getHighResolutionOutputSizeshNQ4ISI();
        } else if (i == 13) {
            str = Camera2StreamConfigurationMap(getInputSizeshNQ4ISI);
        } else if (i == 12) {
            str = Camera2StreamConfigurationMap(getOutputFormats);
        } else if (i == 15) {
            str = this.isOutputSupportedFor;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
        this.getOutputStallDuration = 0;
        this.getHighSpeedVideoSizes[this.getInputFormats - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int selectName(com.airbnb.lottie.parser.moshi.JsonReader.Options options) throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor, options);
        }
        int select = this.getValidOutputFormatsForInputhNQ4ISI.select(options.getHighResolutionOutputSizeshNQ4ISI);
        if (select != -1) {
            this.getOutputStallDuration = 0;
            this.getHighSpeedVideoSizes[this.getInputFormats - 1] = options.getHighSpeedVideoFpsRangesFor[select];
            return select;
        }
        java.lang.String str = this.getHighSpeedVideoSizes[this.getInputFormats - 1];
        java.lang.String nextName = nextName();
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(nextName, options);
        if (highResolutionOutputSizeshNQ4ISI == -1) {
            this.getOutputStallDuration = 15;
            this.isOutputSupportedFor = nextName;
            this.getHighSpeedVideoSizes[this.getInputFormats - 1] = str;
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void skipName() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            sb.append(" at ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 14) {
            getOutputMinFrameDuration();
        } else if (i == 13) {
            getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
        } else if (i == 12) {
            getHighSpeedVideoFpsRangesFor(getOutputFormats);
        } else if (i != 15) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a name but was ");
            sb2.append(peek());
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb2.toString());
        }
        this.getOutputStallDuration = 0;
        this.getHighSpeedVideoSizes[this.getInputFormats - 1] = "null";
    }

    private int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.airbnb.lottie.parser.moshi.JsonReader.Options options) {
        int length = options.getHighSpeedVideoFpsRangesFor.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.getHighSpeedVideoFpsRangesFor[i])) {
                this.getOutputStallDuration = 0;
                this.getHighSpeedVideoSizes[this.getInputFormats - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final java.lang.String nextString() throws java.io.IOException {
        java.lang.String readUtf8;
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 10) {
            readUtf8 = getHighResolutionOutputSizeshNQ4ISI();
        } else if (i == 9) {
            readUtf8 = Camera2StreamConfigurationMap(getInputSizeshNQ4ISI);
        } else if (i == 8) {
            readUtf8 = Camera2StreamConfigurationMap(getOutputFormats);
        } else if (i == 11) {
            readUtf8 = this.isOutputSupportedFor;
            this.isOutputSupportedFor = null;
        } else if (i == 16) {
            readUtf8 = java.lang.Long.toString(this.getOutputStallDurationlomOqCM);
        } else if (i == 17) {
            readUtf8 = this.getOutputMinFrameDurationlomOqCM.readUtf8(this.getOutputSizeshNQ4ISI);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a string but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
        this.getOutputStallDuration = 0;
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getInputFormats - 1;
        iArr[i2] = iArr[i2] + 1;
        return readUtf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean nextBoolean() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 5) {
            this.getOutputStallDuration = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getInputFormats - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.getOutputStallDuration = 0;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getInputFormats - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a boolean but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double nextDouble() throws java.io.IOException {
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 16) {
            this.getOutputStallDuration = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getInputFormats - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.getOutputStallDurationlomOqCM;
        }
        if (i == 17) {
            this.isOutputSupportedFor = this.getOutputMinFrameDurationlomOqCM.readUtf8(this.getOutputSizeshNQ4ISI);
        } else if (i == 9) {
            this.isOutputSupportedFor = Camera2StreamConfigurationMap(getInputSizeshNQ4ISI);
        } else if (i == 8) {
            this.isOutputSupportedFor = Camera2StreamConfigurationMap(getOutputFormats);
        } else if (i == 10) {
            this.isOutputSupportedFor = getHighResolutionOutputSizeshNQ4ISI();
        } else if (i != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a double but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
        this.getOutputStallDuration = 11;
        try {
            double parseDouble = java.lang.Double.parseDouble(this.isOutputSupportedFor);
            if (!this.Camera2StreamConfigurationMap && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(getPath());
                throw new com.airbnb.lottie.parser.moshi.JsonEncodingException(sb2.toString());
            }
            this.isOutputSupportedFor = null;
            this.getOutputStallDuration = 0;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getInputFormats - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a double but was ");
            sb3.append(this.isOutputSupportedFor);
            sb3.append(" at path ");
            sb3.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb3.toString());
        }
    }

    private java.lang.String Camera2StreamConfigurationMap(okio.ByteString byteString) throws java.io.IOException {
        java.lang.StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw getHighSpeedVideoFpsRangesFor("Unterminated string");
            }
            if (this.getOutputMinFrameDurationlomOqCM.getByte(indexOfElement) != 92) {
                if (sb == null) {
                    java.lang.String readUtf8 = this.getOutputMinFrameDurationlomOqCM.readUtf8(indexOfElement);
                    this.getOutputMinFrameDurationlomOqCM.readByte();
                    return readUtf8;
                }
                sb.append(this.getOutputMinFrameDurationlomOqCM.readUtf8(indexOfElement));
                this.getOutputMinFrameDurationlomOqCM.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            sb.append(this.getOutputMinFrameDurationlomOqCM.readUtf8(indexOfElement));
            this.getOutputMinFrameDurationlomOqCM.readByte();
            sb.append(getHighSpeedVideoFpsRanges());
        }
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(getOutputSizes);
        return indexOfElement != -1 ? this.getOutputMinFrameDurationlomOqCM.readUtf8(indexOfElement) : this.getOutputMinFrameDurationlomOqCM.readUtf8();
    }

    private void getHighSpeedVideoFpsRangesFor(okio.ByteString byteString) throws java.io.IOException {
        while (true) {
            long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw getHighSpeedVideoFpsRangesFor("Unterminated string");
            }
            if (this.getOutputMinFrameDurationlomOqCM.getByte(indexOfElement) == 92) {
                this.getOutputMinFrameDurationlomOqCM.skip(indexOfElement + 1);
                getHighSpeedVideoFpsRanges();
            } else {
                this.getOutputMinFrameDurationlomOqCM.skip(indexOfElement + 1);
                return;
            }
        }
    }

    private void getOutputMinFrameDuration() throws java.io.IOException {
        long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(getOutputSizes);
        okio.Buffer buffer = this.getOutputMinFrameDurationlomOqCM;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int nextInt() throws java.io.IOException {
        java.lang.String Camera2StreamConfigurationMap;
        int i = this.getOutputStallDuration;
        if (i == 0) {
            i = getHighSpeedVideoFpsRangesFor();
        }
        if (i == 16) {
            long j = this.getOutputStallDurationlomOqCM;
            int i2 = (int) j;
            if (j != i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an int but was ");
                sb.append(this.getOutputStallDurationlomOqCM);
                sb.append(" at path ");
                sb.append(getPath());
                throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
            }
            this.getOutputStallDuration = 0;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i3 = this.getInputFormats - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 17) {
            this.isOutputSupportedFor = this.getOutputMinFrameDurationlomOqCM.readUtf8(this.getOutputSizeshNQ4ISI);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getInputSizeshNQ4ISI);
            } else {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getOutputFormats);
            }
            this.isOutputSupportedFor = Camera2StreamConfigurationMap;
            try {
                int parseInt = java.lang.Integer.parseInt(Camera2StreamConfigurationMap);
                this.getOutputStallDuration = 0;
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                int i4 = this.getInputFormats - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else if (i != 11) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected an int but was ");
            sb2.append(peek());
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb2.toString());
        }
        this.getOutputStallDuration = 11;
        try {
            double parseDouble = java.lang.Double.parseDouble(this.isOutputSupportedFor);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected an int but was ");
                sb3.append(this.isOutputSupportedFor);
                sb3.append(" at path ");
                sb3.append(getPath());
                throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb3.toString());
            }
            this.isOutputSupportedFor = null;
            this.getOutputStallDuration = 0;
            int[] iArr3 = this.getHighSpeedVideoFpsRanges;
            int i6 = this.getInputFormats - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (java.lang.NumberFormatException unused2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected an int but was ");
            sb4.append(this.isOutputSupportedFor);
            sb4.append(" at path ");
            sb4.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb4.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getOutputStallDuration = 0;
        this.getHighSpeedVideoFpsRangesFor[0] = 8;
        this.getInputFormats = 1;
        this.getOutputMinFrameDurationlomOqCM.clear();
        this.getValidOutputFormatsForInputhNQ4ISI.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void skipValue() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            sb.append(" at ");
            sb.append(getPath());
            throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb.toString());
        }
        int i = 0;
        do {
            int i2 = this.getOutputStallDuration;
            if (i2 == 0) {
                i2 = getHighSpeedVideoFpsRangesFor();
            }
            if (i2 == 3) {
                Camera2StreamConfigurationMap(1);
            } else if (i2 == 1) {
                Camera2StreamConfigurationMap(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a value but was ");
                        sb2.append(peek());
                        sb2.append(" at path ");
                        sb2.append(getPath());
                        throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb2.toString());
                    }
                    this.getInputFormats--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a value but was ");
                        sb3.append(peek());
                        sb3.append(" at path ");
                        sb3.append(getPath());
                        throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb3.toString());
                    }
                    this.getInputFormats--;
                } else if (i2 == 14 || i2 == 10) {
                    getOutputMinFrameDuration();
                } else if (i2 == 9 || i2 == 13) {
                    getHighSpeedVideoFpsRangesFor(getInputSizeshNQ4ISI);
                } else if (i2 == 8 || i2 == 12) {
                    getHighSpeedVideoFpsRangesFor(getOutputFormats);
                } else if (i2 == 17) {
                    this.getOutputMinFrameDurationlomOqCM.skip(this.getOutputSizeshNQ4ISI);
                } else if (i2 == 18) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected a value but was ");
                    sb4.append(peek());
                    sb4.append(" at path ");
                    sb4.append(getPath());
                    throw new com.airbnb.lottie.parser.moshi.JsonDataException(sb4.toString());
                }
                this.getOutputStallDuration = 0;
            }
            i++;
            this.getOutputStallDuration = 0;
        } while (i != 0);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i3 = this.getInputFormats - 1;
        iArr[i3] = iArr[i3] + 1;
        this.getHighSpeedVideoSizes[this.getInputFormats - 1] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r6.getOutputMinFrameDurationlomOqCM.skip(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 != 47) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r0 != 35) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r6.Camera2StreamConfigurationMap == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        Camera2StreamConfigurationMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        if (r6.getValidOutputFormatsForInputhNQ4ISI.request(2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
    
        if (r6.Camera2StreamConfigurationMap == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003c, code lost:
    
        r1 = r6.getOutputMinFrameDurationlomOqCM.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (r1 == 42) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        r6.getOutputMinFrameDurationlomOqCM.readByte();
        r6.getOutputMinFrameDurationlomOqCM.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (getHighSpeedVideoSizes() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        throw getHighSpeedVideoFpsRangesFor("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0048, code lost:
    
        if (r1 != 47) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004a, code lost:
    
        r6.getOutputMinFrameDurationlomOqCM.readByte();
        r6.getOutputMinFrameDurationlomOqCM.readByte();
        Camera2StreamConfigurationMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getHighSpeedVideoFpsRangesFor(boolean z) throws java.io.IOException {
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
                byte b = this.getOutputMinFrameDurationlomOqCM.getByte(j);
                if (b != 10 && b != 32 && b != 13 && b != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    private void Camera2StreamConfigurationMap() throws java.io.IOException {
        long indexOfElement = this.getValidOutputFormatsForInputhNQ4ISI.indexOfElement(getHighSpeedVideoSizesFor);
        okio.Buffer buffer = this.getOutputMinFrameDurationlomOqCM;
        buffer.skip(indexOfElement != -1 ? indexOfElement + 1 : buffer.size());
    }

    private boolean getHighSpeedVideoSizes() throws java.io.IOException {
        long indexOf = this.getValidOutputFormatsForInputhNQ4ISI.indexOf(getOutputMinFrameDuration);
        boolean z = indexOf != -1;
        okio.Buffer buffer = this.getOutputMinFrameDurationlomOqCM;
        buffer.skip(z ? indexOf + r1.size() : buffer.size());
        return z;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonReader(");
        sb.append(this.getValidOutputFormatsForInputhNQ4ISI);
        sb.append(")");
        return sb.toString();
    }

    private char getHighSpeedVideoFpsRanges() throws java.io.IOException {
        int i;
        if (!this.getValidOutputFormatsForInputhNQ4ISI.request(1L)) {
            throw getHighSpeedVideoFpsRangesFor("Unterminated escape sequence");
        }
        byte readByte = this.getOutputMinFrameDurationlomOqCM.readByte();
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
                byte b = this.getOutputMinFrameDurationlomOqCM.getByte(i2);
                char c2 = (char) (c << 4);
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\\u");
                        sb2.append(this.getOutputMinFrameDurationlomOqCM.readUtf8(4L));
                        throw getHighSpeedVideoFpsRangesFor(sb2.toString());
                    }
                    i = b - 55;
                }
                c = (char) (c2 + i);
            }
            this.getOutputMinFrameDurationlomOqCM.skip(4L);
            return c;
        }
        if (this.Camera2StreamConfigurationMap) {
            return (char) readByte;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid escape sequence: \\");
        sb3.append((char) readByte);
        throw getHighSpeedVideoFpsRangesFor(sb3.toString());
    }

    private boolean getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
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
        if (this.Camera2StreamConfigurationMap) {
            return false;
        }
        throw getHighSpeedVideoFpsRangesFor("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}
