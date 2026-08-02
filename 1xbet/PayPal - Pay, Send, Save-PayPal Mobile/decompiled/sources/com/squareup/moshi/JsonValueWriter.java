package com.squareup.moshi;

/* loaded from: classes3.dex */
final class JsonValueWriter extends com.squareup.moshi.JsonWriter {
    java.lang.Object[] Camera2StreamConfigurationMap = new java.lang.Object[32];

    @javax.annotation.Nullable
    private java.lang.String getOutputMinFrameDurationlomOqCM;

    JsonValueWriter() {
        int[] iArr = this.getInputFormats;
        int i = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i + 1;
        iArr[i] = 6;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter beginArray() throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Array cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.getInputSizeshNQ4ISI == this.getHighSpeedVideoSizes && this.getInputFormats[this.getInputSizeshNQ4ISI - 1] == 1) {
            this.getHighSpeedVideoSizes = ~this.getHighSpeedVideoSizes;
            return this;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getHighResolutionOutputSizeshNQ4ISI(arrayList);
        this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI] = arrayList;
        this.getHighResolutionOutputSizeshNQ4ISI[this.getInputSizeshNQ4ISI] = 0;
        int[] iArr = this.getInputFormats;
        int i = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i + 1;
        iArr[i] = 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter beginObject() throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Object cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.getInputSizeshNQ4ISI == this.getHighSpeedVideoSizes && this.getInputFormats[this.getInputSizeshNQ4ISI - 1] == 3) {
            this.getHighSpeedVideoSizes = ~this.getHighSpeedVideoSizes;
            return this;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = new com.squareup.moshi.LinkedHashTreeMap();
        getHighResolutionOutputSizeshNQ4ISI(linkedHashTreeMap);
        this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI] = linkedHashTreeMap;
        int[] iArr = this.getInputFormats;
        int i = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i + 1;
        iArr[i] = 3;
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
        if (this.getInputFormats[i - 1] != 3 || this.getOutputMinFrameDurationlomOqCM != null || this.getOutputFormats) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        this.getOutputMinFrameDurationlomOqCM = str;
        this.getOutputMinFrameDuration[this.getInputSizeshNQ4ISI - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.String str) throws java.io.IOException {
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(str);
        }
        getHighResolutionOutputSizeshNQ4ISI(str);
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
        getHighResolutionOutputSizeshNQ4ISI(null);
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
        getHighResolutionOutputSizeshNQ4ISI(java.lang.Boolean.valueOf(z));
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Boolean bool) throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Boolean cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        getHighResolutionOutputSizeshNQ4ISI(bool);
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(double d) throws java.io.IOException {
        if (!this.getHighSpeedVideoFpsRangesFor && (java.lang.Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(d)));
        }
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(java.lang.Double.toString(d));
        }
        getHighResolutionOutputSizeshNQ4ISI(java.lang.Double.valueOf(d));
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
        getHighResolutionOutputSizeshNQ4ISI(java.lang.Long.valueOf(j));
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Number number) throws java.io.IOException {
        if ((number instanceof java.lang.Byte) || (number instanceof java.lang.Short) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Long)) {
            return value(number.longValue());
        }
        if ((number instanceof java.lang.Float) || (number instanceof java.lang.Double)) {
            return value(number.doubleValue());
        }
        if (number == null) {
            return nullValue();
        }
        java.math.BigDecimal bigDecimal = number instanceof java.math.BigDecimal ? (java.math.BigDecimal) number : new java.math.BigDecimal(number.toString());
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            return name(bigDecimal.toString());
        }
        getHighResolutionOutputSizeshNQ4ISI(bigDecimal);
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getInputSizeshNQ4ISI - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final okio.BufferedSink valueSink() {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BufferedSink cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        if (this.getInputFormats[i - 1] == 9) {
            throw new java.lang.IllegalStateException("Sink from valueSink() was not closed");
        }
        int[] iArr = this.getInputFormats;
        int i2 = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = i2 + 1;
        iArr[i2] = 9;
        final okio.Buffer buffer = new okio.Buffer();
        return okio.Okio.buffer(new okio.ForwardingSink(buffer) { // from class: com.squareup.moshi.JsonValueWriter.1
            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                com.squareup.moshi.JsonValueWriter jsonValueWriter = com.squareup.moshi.JsonValueWriter.this;
                int i3 = jsonValueWriter.getInputSizeshNQ4ISI;
                if (i3 == 0) {
                    throw new java.lang.IllegalStateException("JsonWriter is closed.");
                }
                if (jsonValueWriter.getInputFormats[i3 - 1] != 9 || com.squareup.moshi.JsonValueWriter.this.Camera2StreamConfigurationMap[com.squareup.moshi.JsonValueWriter.this.getInputSizeshNQ4ISI] != null) {
                    throw new java.lang.AssertionError();
                }
                com.squareup.moshi.JsonValueWriter.this.getInputSizeshNQ4ISI--;
                java.lang.Object readJsonValue = com.squareup.moshi.JsonReader.of(buffer).readJsonValue();
                boolean z = com.squareup.moshi.JsonValueWriter.this.getHighSpeedVideoSizesFor;
                com.squareup.moshi.JsonValueWriter.this.getHighSpeedVideoSizesFor = true;
                try {
                    com.squareup.moshi.JsonValueWriter.this.getHighResolutionOutputSizeshNQ4ISI(readJsonValue);
                    com.squareup.moshi.JsonValueWriter.this.getHighSpeedVideoSizesFor = z;
                    int[] iArr2 = com.squareup.moshi.JsonValueWriter.this.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = com.squareup.moshi.JsonValueWriter.this.getInputSizeshNQ4ISI - 1;
                    iArr2[i4] = iArr2[i4] + 1;
                } catch (java.lang.Throwable th) {
                    com.squareup.moshi.JsonValueWriter.this.getHighSpeedVideoSizesFor = z;
                    throw th;
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        int i = this.getInputSizeshNQ4ISI;
        if (i > 1 || (i == 1 && this.getInputFormats[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.getInputSizeshNQ4ISI = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.getInputSizeshNQ4ISI == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.squareup.moshi.JsonValueWriter getHighResolutionOutputSizeshNQ4ISI(@javax.annotation.Nullable java.lang.Object obj) {
        java.lang.Object put;
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.getInputFormats[i - 1];
        if (this.getInputSizeshNQ4ISI == 1) {
            if (i2 != 6) {
                throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
            }
            this.getInputFormats[this.getInputSizeshNQ4ISI - 1] = 7;
            this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI - 1] = obj;
            return this;
        }
        if (i2 != 3 || this.getOutputMinFrameDurationlomOqCM == null) {
            if (i2 == 1) {
                ((java.util.List) this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI - 1]).add(obj);
                return this;
            }
            if (i2 == 9) {
                throw new java.lang.IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if ((obj != null || this.getHighSpeedVideoSizesFor) && (put = ((java.util.Map) this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI - 1]).put(this.getOutputMinFrameDurationlomOqCM, obj)) != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Map key '");
            sb.append(this.getOutputMinFrameDurationlomOqCM);
            sb.append("' has multiple values at path ");
            sb.append(getPath());
            sb.append(": ");
            sb.append(put);
            sb.append(" and ");
            sb.append(obj);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM = null;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter endArray() throws java.io.IOException {
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        if (this.getInputFormats[i - 1] != 1) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.getInputSizeshNQ4ISI == (~this.getHighSpeedVideoSizes)) {
            this.getHighSpeedVideoSizes = ~this.getHighSpeedVideoSizes;
            return this;
        }
        this.getInputSizeshNQ4ISI--;
        this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI] = null;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getInputSizeshNQ4ISI - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public final com.squareup.moshi.JsonWriter endObject() throws java.io.IOException {
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        if (this.getInputFormats[i - 1] != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.getOutputMinFrameDurationlomOqCM != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dangling name: ");
            sb.append(this.getOutputMinFrameDurationlomOqCM);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.getInputSizeshNQ4ISI == (~this.getHighSpeedVideoSizes)) {
            this.getHighSpeedVideoSizes = ~this.getHighSpeedVideoSizes;
            return this;
        }
        this.getOutputFormats = false;
        this.getInputSizeshNQ4ISI--;
        this.Camera2StreamConfigurationMap[this.getInputSizeshNQ4ISI] = null;
        this.getOutputMinFrameDuration[this.getInputSizeshNQ4ISI] = null;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getInputSizeshNQ4ISI - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }
}
