package com.squareup.moshi;

/* loaded from: classes3.dex */
final class JsonValueReader extends com.squareup.moshi.JsonReader {
    private static final java.lang.Object getOutputFormats = new java.lang.Object();
    private java.lang.Object[] getInputSizeshNQ4ISI;

    JsonValueReader(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration] = 7;
        java.lang.Object[] objArr = new java.lang.Object[32];
        this.getInputSizeshNQ4ISI = objArr;
        int i = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = i + 1;
        objArr[i] = obj;
    }

    private JsonValueReader(com.squareup.moshi.JsonValueReader jsonValueReader) {
        super(jsonValueReader);
        this.getInputSizeshNQ4ISI = (java.lang.Object[]) jsonValueReader.getInputSizeshNQ4ISI.clone();
        for (int i = 0; i < this.getOutputMinFrameDuration; i++) {
            java.lang.Object[] objArr = this.getInputSizeshNQ4ISI;
            java.lang.Object obj = objArr[i];
            if (obj instanceof com.squareup.moshi.JsonValueReader.JsonIterator) {
                com.squareup.moshi.JsonValueReader.JsonIterator jsonIterator = (com.squareup.moshi.JsonValueReader.JsonIterator) obj;
                objArr[i] = new com.squareup.moshi.JsonValueReader.JsonIterator(jsonIterator.getHighResolutionOutputSizeshNQ4ISI, jsonIterator.Camera2StreamConfigurationMap, jsonIterator.getHighSpeedVideoSizes);
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() throws java.io.IOException {
        java.util.List list = (java.util.List) Camera2StreamConfigurationMap(java.util.List.class, com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY);
        com.squareup.moshi.JsonValueReader.JsonIterator jsonIterator = new com.squareup.moshi.JsonValueReader.JsonIterator(com.squareup.moshi.JsonReader.Token.END_ARRAY, list.toArray(new java.lang.Object[list.size()]), 0);
        this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = jsonIterator;
        this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = 1;
        this.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration - 1] = 0;
        if (jsonIterator.hasNext()) {
            getHighSpeedVideoFpsRanges(jsonIterator.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() throws java.io.IOException {
        com.squareup.moshi.JsonValueReader.JsonIterator jsonIterator = (com.squareup.moshi.JsonValueReader.JsonIterator) Camera2StreamConfigurationMap(com.squareup.moshi.JsonValueReader.JsonIterator.class, com.squareup.moshi.JsonReader.Token.END_ARRAY);
        if (jsonIterator.getHighResolutionOutputSizeshNQ4ISI != com.squareup.moshi.JsonReader.Token.END_ARRAY || jsonIterator.hasNext()) {
            throw getHighSpeedVideoSizes(jsonIterator, com.squareup.moshi.JsonReader.Token.END_ARRAY);
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() throws java.io.IOException {
        java.util.Map map = (java.util.Map) Camera2StreamConfigurationMap(java.util.Map.class, com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT);
        com.squareup.moshi.JsonValueReader.JsonIterator jsonIterator = new com.squareup.moshi.JsonValueReader.JsonIterator(com.squareup.moshi.JsonReader.Token.END_OBJECT, map.entrySet().toArray(new java.lang.Object[map.size()]), 0);
        this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = jsonIterator;
        this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = 3;
        if (jsonIterator.hasNext()) {
            getHighSpeedVideoFpsRanges(jsonIterator.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() throws java.io.IOException {
        com.squareup.moshi.JsonValueReader.JsonIterator jsonIterator = (com.squareup.moshi.JsonValueReader.JsonIterator) Camera2StreamConfigurationMap(com.squareup.moshi.JsonValueReader.JsonIterator.class, com.squareup.moshi.JsonReader.Token.END_OBJECT);
        if (jsonIterator.getHighResolutionOutputSizeshNQ4ISI != com.squareup.moshi.JsonReader.Token.END_OBJECT || jsonIterator.hasNext()) {
            throw getHighSpeedVideoSizes(jsonIterator, com.squareup.moshi.JsonReader.Token.END_OBJECT);
        }
        this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 1] = null;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() throws java.io.IOException {
        if (this.getOutputMinFrameDuration == 0) {
            return false;
        }
        java.lang.Object obj = this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1];
        return !(obj instanceof java.util.Iterator) || ((java.util.Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.JsonReader
    public final com.squareup.moshi.JsonReader.Token peek() throws java.io.IOException {
        if (this.getOutputMinFrameDuration == 0) {
            return com.squareup.moshi.JsonReader.Token.END_DOCUMENT;
        }
        java.lang.Object obj = this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1];
        if (obj instanceof com.squareup.moshi.JsonValueReader.JsonIterator) {
            return ((com.squareup.moshi.JsonValueReader.JsonIterator) obj).getHighResolutionOutputSizeshNQ4ISI;
        }
        if (obj instanceof java.util.List) {
            return com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof java.util.Map) {
            return com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof java.util.Map.Entry) {
            return com.squareup.moshi.JsonReader.Token.NAME;
        }
        if (obj instanceof java.lang.String) {
            return com.squareup.moshi.JsonReader.Token.STRING;
        }
        if (obj instanceof java.lang.Boolean) {
            return com.squareup.moshi.JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof java.lang.Number) {
            return com.squareup.moshi.JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return com.squareup.moshi.JsonReader.Token.NULL;
        }
        if (obj == getOutputFormats) {
            throw new java.lang.IllegalStateException("JsonReader is closed");
        }
        throw getHighSpeedVideoSizes(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.JsonReader
    public final java.lang.String nextName() throws java.io.IOException {
        java.util.Map.Entry entry = (java.util.Map.Entry) Camera2StreamConfigurationMap(java.util.Map.Entry.class, com.squareup.moshi.JsonReader.Token.NAME);
        java.lang.Object key = entry.getKey();
        if (key instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) key;
            this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = entry.getValue();
            this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 2] = str;
            return str;
        }
        throw getHighSpeedVideoSizes(key, com.squareup.moshi.JsonReader.Token.NAME);
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectName(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException {
        java.util.Map.Entry entry = (java.util.Map.Entry) Camera2StreamConfigurationMap(java.util.Map.Entry.class, com.squareup.moshi.JsonReader.Token.NAME);
        java.lang.Object key = entry.getKey();
        if (key instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) key;
            int length = options.getHighSpeedVideoFpsRanges.length;
            for (int i = 0; i < length; i++) {
                if (options.getHighSpeedVideoFpsRanges[i].equals(str)) {
                    this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = entry.getValue();
                    this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 2] = str;
                    return i;
                }
            }
            return -1;
        }
        throw getHighSpeedVideoSizes(key, com.squareup.moshi.JsonReader.Token.NAME);
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
        this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = ((java.util.Map.Entry) Camera2StreamConfigurationMap(java.util.Map.Entry.class, com.squareup.moshi.JsonReader.Token.NAME)).getValue();
        this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 2] = "null";
    }

    @Override // com.squareup.moshi.JsonReader
    public final java.lang.String nextString() throws java.io.IOException {
        java.lang.Object obj = this.getOutputMinFrameDuration != 0 ? this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] : null;
        if (obj instanceof java.lang.String) {
            getHighResolutionOutputSizeshNQ4ISI();
            return (java.lang.String) obj;
        }
        if (obj instanceof java.lang.Number) {
            getHighResolutionOutputSizeshNQ4ISI();
            return obj.toString();
        }
        if (obj == getOutputFormats) {
            throw new java.lang.IllegalStateException("JsonReader is closed");
        }
        throw getHighSpeedVideoSizes(obj, com.squareup.moshi.JsonReader.Token.STRING);
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectString(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException {
        java.lang.Object obj = this.getOutputMinFrameDuration != 0 ? this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] : null;
        if (!(obj instanceof java.lang.String)) {
            if (obj != getOutputFormats) {
                return -1;
            }
            throw new java.lang.IllegalStateException("JsonReader is closed");
        }
        java.lang.String str = (java.lang.String) obj;
        int length = options.getHighSpeedVideoFpsRanges.length;
        for (int i = 0; i < length; i++) {
            if (options.getHighSpeedVideoFpsRanges[i].equals(str)) {
                getHighResolutionOutputSizeshNQ4ISI();
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() throws java.io.IOException {
        java.lang.Boolean bool = (java.lang.Boolean) Camera2StreamConfigurationMap(java.lang.Boolean.class, com.squareup.moshi.JsonReader.Token.BOOLEAN);
        getHighResolutionOutputSizeshNQ4ISI();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    @javax.annotation.Nullable
    public final <T> T nextNull() throws java.io.IOException {
        Camera2StreamConfigurationMap(java.lang.Void.class, com.squareup.moshi.JsonReader.Token.NULL);
        getHighResolutionOutputSizeshNQ4ISI();
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() throws java.io.IOException {
        double parseDouble;
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(java.lang.Object.class, com.squareup.moshi.JsonReader.Token.NUMBER);
        if (Camera2StreamConfigurationMap instanceof java.lang.Number) {
            parseDouble = ((java.lang.Number) Camera2StreamConfigurationMap).doubleValue();
        } else if (Camera2StreamConfigurationMap instanceof java.lang.String) {
            try {
                parseDouble = java.lang.Double.parseDouble((java.lang.String) Camera2StreamConfigurationMap);
            } catch (java.lang.NumberFormatException unused) {
                throw getHighSpeedVideoSizes(Camera2StreamConfigurationMap, com.squareup.moshi.JsonReader.Token.NUMBER);
            }
        } else {
            throw getHighSpeedVideoSizes(Camera2StreamConfigurationMap, com.squareup.moshi.JsonReader.Token.NUMBER);
        }
        if (!this.getHighSpeedVideoFpsRangesFor && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
            sb.append(parseDouble);
            sb.append(" at path ");
            sb.append(getPath());
            throw new com.squareup.moshi.JsonEncodingException(sb.toString());
        }
        getHighResolutionOutputSizeshNQ4ISI();
        return parseDouble;
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() throws java.io.IOException {
        long longValueExact;
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(java.lang.Object.class, com.squareup.moshi.JsonReader.Token.NUMBER);
        if (Camera2StreamConfigurationMap instanceof java.lang.Number) {
            longValueExact = ((java.lang.Number) Camera2StreamConfigurationMap).longValue();
        } else if (Camera2StreamConfigurationMap instanceof java.lang.String) {
            try {
                try {
                    longValueExact = java.lang.Long.parseLong((java.lang.String) Camera2StreamConfigurationMap);
                } catch (java.lang.NumberFormatException unused) {
                    throw getHighSpeedVideoSizes(Camera2StreamConfigurationMap, com.squareup.moshi.JsonReader.Token.NUMBER);
                }
            } catch (java.lang.NumberFormatException unused2) {
                longValueExact = new java.math.BigDecimal((java.lang.String) Camera2StreamConfigurationMap).longValueExact();
            }
        } else {
            throw getHighSpeedVideoSizes(Camera2StreamConfigurationMap, com.squareup.moshi.JsonReader.Token.NUMBER);
        }
        getHighResolutionOutputSizeshNQ4ISI();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() throws java.io.IOException {
        int intValueExact;
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(java.lang.Object.class, com.squareup.moshi.JsonReader.Token.NUMBER);
        if (Camera2StreamConfigurationMap instanceof java.lang.Number) {
            intValueExact = ((java.lang.Number) Camera2StreamConfigurationMap).intValue();
        } else if (Camera2StreamConfigurationMap instanceof java.lang.String) {
            try {
                try {
                    intValueExact = java.lang.Integer.parseInt((java.lang.String) Camera2StreamConfigurationMap);
                } catch (java.lang.NumberFormatException unused) {
                    throw getHighSpeedVideoSizes(Camera2StreamConfigurationMap, com.squareup.moshi.JsonReader.Token.NUMBER);
                }
            } catch (java.lang.NumberFormatException unused2) {
                intValueExact = new java.math.BigDecimal((java.lang.String) Camera2StreamConfigurationMap).intValueExact();
            }
        } else {
            throw getHighSpeedVideoSizes(Camera2StreamConfigurationMap, com.squareup.moshi.JsonReader.Token.NUMBER);
        }
        getHighResolutionOutputSizeshNQ4ISI();
        return intValueExact;
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
        if (this.getOutputMinFrameDuration > 1) {
            this.getHighSpeedVideoSizes[this.getOutputMinFrameDuration - 2] = "null";
        }
        java.lang.Object obj = this.getOutputMinFrameDuration != 0 ? this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] : null;
        if (obj instanceof com.squareup.moshi.JsonValueReader.JsonIterator) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a value but was ");
            sb2.append(peek());
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new com.squareup.moshi.JsonDataException(sb2.toString());
        }
        if (obj instanceof java.util.Map.Entry) {
            this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] = ((java.util.Map.Entry) this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1]).getValue();
            return;
        }
        if (this.getOutputMinFrameDuration > 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a value but was ");
        sb3.append(peek());
        sb3.append(" at path ");
        sb3.append(getPath());
        throw new com.squareup.moshi.JsonDataException(sb3.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public final okio.BufferedSource nextSource() throws java.io.IOException {
        java.lang.Object readJsonValue = readJsonValue();
        okio.Buffer buffer = new okio.Buffer();
        com.squareup.moshi.JsonWriter of = com.squareup.moshi.JsonWriter.of(buffer);
        try {
            of.jsonValue(readJsonValue);
            if (of != null) {
                of.close();
            }
            return buffer;
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
    }

    @Override // com.squareup.moshi.JsonReader
    public final com.squareup.moshi.JsonReader peekJson() {
        return new com.squareup.moshi.JsonValueReader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() throws java.io.IOException {
        if (hasNext()) {
            getHighSpeedVideoFpsRanges(nextName());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.util.Arrays.fill(this.getInputSizeshNQ4ISI, 0, this.getOutputMinFrameDuration, (java.lang.Object) null);
        this.getInputSizeshNQ4ISI[0] = getOutputFormats;
        this.getHighResolutionOutputSizeshNQ4ISI[0] = 8;
        this.getOutputMinFrameDuration = 1;
    }

    private void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        if (this.getOutputMinFrameDuration == this.getInputSizeshNQ4ISI.length) {
            if (this.getOutputMinFrameDuration == 256) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Nesting too deep at ");
                sb.append(getPath());
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI.length * 2);
            this.getHighSpeedVideoSizes = (java.lang.String[]) java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes.length * 2);
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges.length * 2);
            java.lang.Object[] objArr = this.getInputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(objArr, objArr.length * 2);
        }
        java.lang.Object[] objArr2 = this.getInputSizeshNQ4ISI;
        int i = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = i + 1;
        objArr2[i] = obj;
    }

    @javax.annotation.Nullable
    private <T> T Camera2StreamConfigurationMap(java.lang.Class<T> cls, com.squareup.moshi.JsonReader.Token token) throws java.io.IOException {
        java.lang.Object obj = this.getOutputMinFrameDuration != 0 ? this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == com.squareup.moshi.JsonReader.Token.NULL) {
            return null;
        }
        if (obj == getOutputFormats) {
            throw new java.lang.IllegalStateException("JsonReader is closed");
        }
        throw getHighSpeedVideoSizes(obj, token);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        this.getOutputMinFrameDuration--;
        this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration] = null;
        this.getHighResolutionOutputSizeshNQ4ISI[this.getOutputMinFrameDuration] = 0;
        if (this.getOutputMinFrameDuration > 0) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i = this.getOutputMinFrameDuration - 1;
            iArr[i] = iArr[i] + 1;
            java.lang.Object obj = this.getInputSizeshNQ4ISI[this.getOutputMinFrameDuration - 1];
            if (obj instanceof java.util.Iterator) {
                java.util.Iterator it = (java.util.Iterator) obj;
                if (it.hasNext()) {
                    getHighSpeedVideoFpsRanges(it.next());
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    static final class JsonIterator implements java.util.Iterator<java.lang.Object>, java.lang.Cloneable {
        final java.lang.Object[] Camera2StreamConfigurationMap;
        final com.squareup.moshi.JsonReader.Token getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        JsonIterator(com.squareup.moshi.JsonReader.Token token, java.lang.Object[] objArr, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = token;
            this.Camera2StreamConfigurationMap = objArr;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes < this.Camera2StreamConfigurationMap.length;
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            return objArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        protected final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            return new com.squareup.moshi.JsonValueReader.JsonIterator(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }
}
