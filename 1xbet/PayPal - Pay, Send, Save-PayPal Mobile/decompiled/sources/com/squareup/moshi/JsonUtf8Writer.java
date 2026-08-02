package com.squareup.moshi;

/* loaded from: classes3.dex */
final class JsonUtf8Writer extends com.squareup.moshi.JsonWriter {
    private static final java.lang.String[] Camera2StreamConfigurationMap = new java.lang.String[128];
    private java.lang.String getOutputSizeshNQ4ISI;
    private final okio.BufferedSink getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM = io.ktor.sse.ServerSentEventKt.COLON;

    static {
        for (int i = 0; i <= 31; i++) {
            Camera2StreamConfigurationMap[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = Camera2StreamConfigurationMap;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    JsonUtf8Writer(okio.BufferedSink bufferedSink) {
        if (bufferedSink == null) {
            throw new java.lang.NullPointerException("sink == null");
        }
        this.getOutputStallDuration = bufferedSink;
        int[] iArr = this.getInputFormats;
        int i = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i + 1;
        iArr[i] = 6;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final void setIndent(java.lang.String str) {
        super.setIndent(str);
        this.getOutputStallDurationlomOqCM = !str.isEmpty() ? ": " : io.ktor.sse.ServerSentEventKt.COLON;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter beginArray() throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Array cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        getHighSpeedVideoFpsRangesFor();
        return getHighSpeedVideoSizes(1, 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter endArray() throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(1, 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter beginObject() throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Object cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        getHighSpeedVideoFpsRangesFor();
        return getHighSpeedVideoSizes(3, 5, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter endObject() throws java.io.IOException {
        this.getOutputFormats = false;
        return getHighResolutionOutputSizeshNQ4ISI(3, 5, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    }

    private com.squareup.moshi.JsonWriter getHighSpeedVideoSizes(int i, int i2, char c) throws java.io.IOException {
        if (this.getInputSizeshNQ4ISI == this.getHighSpeedVideoSizes && (this.getInputFormats[this.getInputSizeshNQ4ISI - 1] == i || this.getInputFormats[this.getInputSizeshNQ4ISI - 1] == i2)) {
            this.getHighSpeedVideoSizes = ~this.getHighSpeedVideoSizes;
            return this;
        }
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI();
        int[] iArr = this.getInputFormats;
        int i3 = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i3 + 1;
        iArr[i3] = i;
        this.getHighResolutionOutputSizeshNQ4ISI[this.getInputSizeshNQ4ISI - 1] = 0;
        this.getOutputStallDuration.writeByte(c);
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter name(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (this.getInputSizeshNQ4ISI == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.getInputFormats[i - 1];
        if ((i2 != 3 && i2 != 5) || this.getOutputSizeshNQ4ISI != null || this.getOutputFormats) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        this.getOutputSizeshNQ4ISI = str;
        this.getOutputMinFrameDuration[this.getInputSizeshNQ4ISI - 1] = str;
        return this;
    }

    private void getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        if (this.getOutputSizeshNQ4ISI != null) {
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                throw new java.lang.IllegalStateException("JsonWriter is closed.");
            }
            int i2 = this.getInputFormats[i - 1];
            if (i2 == 5) {
                this.getOutputStallDuration.writeByte(44);
            } else if (i2 != 3) {
                throw new java.lang.IllegalStateException("Nesting problem.");
            }
            getHighSpeedVideoSizes();
            this.getInputFormats[this.getInputSizeshNQ4ISI - 1] = 4;
            getHighSpeedVideoFpsRanges(this.getOutputStallDuration, this.getOutputSizeshNQ4ISI);
            this.getOutputSizeshNQ4ISI = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(str);
        }
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRanges(this.getOutputStallDuration, str);
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter nullValue() throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("null cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.getOutputSizeshNQ4ISI != null) {
            if (this.getHighSpeedVideoSizesFor) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                this.getOutputSizeshNQ4ISI = null;
                return this;
            }
        }
        getHighSpeedVideoFpsRanges();
        this.getOutputStallDuration.writeUtf8("null");
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(boolean z) throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Boolean cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        this.getOutputStallDuration.writeUtf8(z ? "true" : "false");
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return nullValue();
        }
        return value(bool.booleanValue());
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(double d) throws java.io.IOException {
        if (!this.getHighSpeedVideoFpsRangesFor && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(d)));
        }
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(java.lang.Double.toString(d));
        }
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        this.getOutputStallDuration.writeUtf8(java.lang.Double.toString(d));
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(long j) throws java.io.IOException {
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(java.lang.Long.toString(j));
        }
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        this.getOutputStallDuration.writeUtf8(java.lang.Long.toString(j));
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return nullValue();
        }
        java.lang.String obj = number.toString();
        if (!this.getHighSpeedVideoFpsRangesFor && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(number)));
        }
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(obj);
        }
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        this.getOutputStallDuration.writeUtf8(obj);
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final okio.BufferedSink valueSink() throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BufferedSink cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        int[] iArr = this.getInputFormats;
        int i = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i + 1;
        iArr[i] = 9;
        return okio.Okio.buffer(new okio.Sink() { // from class: com.squareup.moshi.JsonUtf8Writer.1
            @Override // okio.Sink
            public void write(okio.Buffer buffer, long j) throws java.io.IOException {
                com.squareup.moshi.JsonUtf8Writer.this.getOutputStallDuration.write(buffer, j);
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                com.squareup.moshi.JsonUtf8Writer jsonUtf8Writer = com.squareup.moshi.JsonUtf8Writer.this;
                int i2 = jsonUtf8Writer.getInputSizeshNQ4ISI;
                if (i2 == 0) {
                    throw new java.lang.IllegalStateException("JsonWriter is closed.");
                }
                if (jsonUtf8Writer.getInputFormats[i2 - 1] != 9) {
                    throw new java.lang.AssertionError();
                }
                com.squareup.moshi.JsonUtf8Writer jsonUtf8Writer2 = com.squareup.moshi.JsonUtf8Writer.this;
                jsonUtf8Writer2.getInputSizeshNQ4ISI--;
                int[] iArr2 = com.squareup.moshi.JsonUtf8Writer.this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = com.squareup.moshi.JsonUtf8Writer.this.getInputSizeshNQ4ISI - 1;
                iArr2[i3] = iArr2[i3] + 1;
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws java.io.IOException {
                com.squareup.moshi.JsonUtf8Writer.this.getOutputStallDuration.flush();
            }

            @Override // okio.Sink
            /* renamed from: timeout */
            public okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
                return okio.Timeout.NONE;
            }
        });
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.getInputSizeshNQ4ISI == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.getOutputStallDuration.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getOutputStallDuration.close();
        int i = this.getInputSizeshNQ4ISI;
        if (i > 1 || (i == 1 && this.getInputFormats[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.getInputSizeshNQ4ISI = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void getHighSpeedVideoFpsRanges(okio.BufferedSink bufferedSink, java.lang.String str) throws java.io.IOException {
        int i;
        java.lang.String str2;
        java.lang.String[] strArr = Camera2StreamConfigurationMap;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    bufferedSink.writeUtf8(str, i2, i);
                }
                bufferedSink.writeUtf8(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                bufferedSink.writeUtf8(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            bufferedSink.writeUtf8(str, i2, length);
        }
        bufferedSink.writeByte(34);
    }

    private void getHighSpeedVideoSizes() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges != null) {
            this.getOutputStallDuration.writeByte(10);
            int i = this.getInputSizeshNQ4ISI;
            for (int i2 = 1; i2 < i; i2++) {
                this.getOutputStallDuration.writeUtf8(this.getHighSpeedVideoFpsRanges);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges() throws java.io.IOException {
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.getInputFormats[i - 1];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                this.getOutputStallDuration.writeByte(44);
            } else {
                if (i2 == 4) {
                    this.getOutputStallDuration.writeUtf8(this.getOutputStallDurationlomOqCM);
                    i3 = 5;
                } else {
                    if (i2 == 9) {
                        throw new java.lang.IllegalStateException("Sink from valueSink() was not closed");
                    }
                    if (i2 != 6) {
                        if (i2 == 7) {
                            if (!this.getHighSpeedVideoFpsRangesFor) {
                                throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new java.lang.IllegalStateException("Nesting problem.");
                        }
                    }
                    i3 = 7;
                }
                this.getInputFormats[this.getInputSizeshNQ4ISI - 1] = i3;
            }
        }
        getHighSpeedVideoSizes();
        this.getInputFormats[this.getInputSizeshNQ4ISI - 1] = i3;
    }

    private com.squareup.moshi.JsonWriter getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c) throws java.io.IOException {
        int i3 = this.getInputSizeshNQ4ISI;
        if (i3 == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i4 = this.getInputFormats[i3 - 1];
        if (i4 != i2 && i4 != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.getOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dangling name: ");
            sb.append(this.getOutputSizeshNQ4ISI);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.getInputSizeshNQ4ISI == (~this.getHighSpeedVideoSizes)) {
            this.getHighSpeedVideoSizes = ~this.getHighSpeedVideoSizes;
            return this;
        }
        this.getInputSizeshNQ4ISI--;
        this.getOutputMinFrameDuration[this.getInputSizeshNQ4ISI] = null;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = this.getInputSizeshNQ4ISI - 1;
        iArr[i5] = iArr[i5] + 1;
        if (i4 == i2) {
            getHighSpeedVideoSizes();
        }
        this.getOutputStallDuration.writeByte(c);
        return this;
    }
}
