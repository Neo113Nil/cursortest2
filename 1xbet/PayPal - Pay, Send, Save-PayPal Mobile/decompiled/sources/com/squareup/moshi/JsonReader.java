package com.squareup.moshi;

/* loaded from: classes3.dex */
public abstract class JsonReader implements java.io.Closeable {
    boolean Camera2StreamConfigurationMap;
    int[] getHighResolutionOutputSizeshNQ4ISI;
    int[] getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.String[] getHighSpeedVideoSizes;
    private java.util.Map<java.lang.Class<?>, java.lang.Object> getOutputFormats;
    int getOutputMinFrameDuration;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void beginArray() throws java.io.IOException;

    public abstract void beginObject() throws java.io.IOException;

    public abstract void endArray() throws java.io.IOException;

    public abstract void endObject() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract boolean hasNext() throws java.io.IOException;

    public abstract boolean nextBoolean() throws java.io.IOException;

    public abstract double nextDouble() throws java.io.IOException;

    public abstract int nextInt() throws java.io.IOException;

    public abstract long nextLong() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract java.lang.String nextName() throws java.io.IOException;

    @javax.annotation.Nullable
    public abstract <T> T nextNull() throws java.io.IOException;

    public abstract okio.BufferedSource nextSource() throws java.io.IOException;

    public abstract java.lang.String nextString() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract com.squareup.moshi.JsonReader.Token peek() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract com.squareup.moshi.JsonReader peekJson();

    public abstract void promoteNameToValue() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract int selectName(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract int selectString(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException;

    public abstract void skipName() throws java.io.IOException;

    public abstract void skipValue() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public static com.squareup.moshi.JsonReader of(okio.BufferedSource bufferedSource) {
        return new com.squareup.moshi.JsonUtf8Reader(bufferedSource);
    }

    JsonReader() {
        this.getHighResolutionOutputSizeshNQ4ISI = new int[32];
        this.getHighSpeedVideoSizes = new java.lang.String[32];
        this.getHighSpeedVideoFpsRanges = new int[32];
    }

    JsonReader(com.squareup.moshi.JsonReader jsonReader) {
        this.getOutputMinFrameDuration = jsonReader.getOutputMinFrameDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = (int[]) jsonReader.getHighResolutionOutputSizeshNQ4ISI.clone();
        this.getHighSpeedVideoSizes = (java.lang.String[]) jsonReader.getHighSpeedVideoSizes.clone();
        this.getHighSpeedVideoFpsRanges = (int[]) jsonReader.getHighSpeedVideoFpsRanges.clone();
        this.getHighSpeedVideoFpsRangesFor = jsonReader.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = jsonReader.Camera2StreamConfigurationMap;
    }

    final void getHighSpeedVideoSizes(int i) {
        int i2 = this.getOutputMinFrameDuration;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Nesting too deep at ");
                sb.append(getPath());
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            java.lang.String[] strArr = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = i3 + 1;
        iArr3[i3] = i;
    }

    final com.squareup.moshi.JsonEncodingException Camera2StreamConfigurationMap(java.lang.String str) throws com.squareup.moshi.JsonEncodingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.squareup.moshi.JsonEncodingException(sb.toString());
    }

    final com.squareup.moshi.JsonDataException getHighSpeedVideoSizes(@javax.annotation.Nullable java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(obj2);
            sb.append(" but was null at path ");
            sb.append(getPath());
            return new com.squareup.moshi.JsonDataException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected ");
        sb2.append(obj2);
        sb2.append(" but was ");
        sb2.append(obj);
        sb2.append(", a ");
        sb2.append(obj.getClass().getName());
        sb2.append(", at path ");
        sb2.append(getPath());
        return new com.squareup.moshi.JsonDataException(sb2.toString());
    }

    public final void setLenient(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean isLenient() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setFailOnUnknown(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean failOnUnknown() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: com.squareup.moshi.JsonReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.squareup.moshi.JsonReader.Token.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.squareup.moshi.JsonReader.Token.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.squareup.moshi.JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.squareup.moshi.JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.squareup.moshi.JsonReader.Token.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @javax.annotation.Nullable
    public final java.lang.Object readJsonValue() throws java.io.IOException {
        switch (com.squareup.moshi.JsonReader.AnonymousClass1.getHighSpeedVideoFpsRanges[peek().ordinal()]) {
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                beginArray();
                while (hasNext()) {
                    arrayList.add(readJsonValue());
                }
                endArray();
                return arrayList;
            case 2:
                com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = new com.squareup.moshi.LinkedHashTreeMap();
                beginObject();
                while (hasNext()) {
                    java.lang.String nextName = nextName();
                    java.lang.Object readJsonValue = readJsonValue();
                    java.lang.Object put = linkedHashTreeMap.put(nextName, readJsonValue);
                    if (put != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Map key '");
                        sb.append(nextName);
                        sb.append("' has multiple values at path ");
                        sb.append(getPath());
                        sb.append(": ");
                        sb.append(put);
                        sb.append(" and ");
                        sb.append(readJsonValue);
                        throw new com.squareup.moshi.JsonDataException(sb.toString());
                    }
                }
                endObject();
                return linkedHashTreeMap;
            case 3:
                return nextString();
            case 4:
                return java.lang.Double.valueOf(nextDouble());
            case 5:
                return java.lang.Boolean.valueOf(nextBoolean());
            case 6:
                return nextNull();
            default:
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a value but was ");
                sb2.append(peek());
                sb2.append(" at path ");
                sb2.append(getPath());
                throw new java.lang.IllegalStateException(sb2.toString());
        }
    }

    @javax.annotation.CheckReturnValue
    public final java.lang.String getPath() {
        return com.squareup.moshi.JsonScope.getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final <T> T tag(java.lang.Class<T> cls) {
        java.util.Map<java.lang.Class<?>, java.lang.Object> map = this.getOutputFormats;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public final <T> void setTag(java.lang.Class<T> cls, T t) {
        if (!cls.isAssignableFrom(t.getClass())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag value must be of type ");
            sb.append(cls.getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.getOutputFormats == null) {
            this.getOutputFormats = new java.util.LinkedHashMap();
        }
        this.getOutputFormats.put(cls, t);
    }

    public static final class Options {
        final okio.Options Camera2StreamConfigurationMap;
        final java.lang.String[] getHighSpeedVideoFpsRanges;

        private Options(java.lang.String[] strArr, okio.Options options) {
            this.getHighSpeedVideoFpsRanges = strArr;
            this.Camera2StreamConfigurationMap = options;
        }

        public final java.util.List<java.lang.String> strings() {
            return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.getHighSpeedVideoFpsRanges));
        }

        @javax.annotation.CheckReturnValue
        public static com.squareup.moshi.JsonReader.Options of(java.lang.String... strArr) {
            try {
                okio.ByteString[] byteStringArr = new okio.ByteString[strArr.length];
                okio.Buffer buffer = new okio.Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    com.squareup.moshi.JsonUtf8Writer.getHighSpeedVideoFpsRanges(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new com.squareup.moshi.JsonReader.Options((java.lang.String[]) strArr.clone(), okio.Options.of(byteStringArr));
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }
}
