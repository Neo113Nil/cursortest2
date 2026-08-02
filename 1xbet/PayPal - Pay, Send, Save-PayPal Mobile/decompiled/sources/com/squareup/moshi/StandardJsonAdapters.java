package com.squareup.moshi;

/* loaded from: classes3.dex */
final class StandardJsonAdapters {
    public static final com.squareup.moshi.JsonAdapter.Factory Camera2StreamConfigurationMap = new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.StandardJsonAdapters.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == java.lang.Boolean.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoSizes;
            }
            if (type == java.lang.Byte.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoFpsRanges;
            }
            if (type == java.lang.Character.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (type == java.lang.Double.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoFpsRangesFor;
            }
            if (type == java.lang.Float.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoSizesFor;
            }
            if (type == java.lang.Integer.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getOutputMinFrameDuration;
            }
            if (type == java.lang.Long.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getOutputFormats;
            }
            if (type == java.lang.Short.TYPE) {
                return com.squareup.moshi.StandardJsonAdapters.getInputSizeshNQ4ISI;
            }
            if (type == java.lang.Boolean.class) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoSizes.nullSafe();
            }
            if (type == java.lang.Byte.class) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoFpsRanges.nullSafe();
            }
            if (type == java.lang.Character.class) {
                return com.squareup.moshi.StandardJsonAdapters.getHighResolutionOutputSizeshNQ4ISI.nullSafe();
            }
            if (type == java.lang.Double.class) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoFpsRangesFor.nullSafe();
            }
            if (type == java.lang.Float.class) {
                return com.squareup.moshi.StandardJsonAdapters.getHighSpeedVideoSizesFor.nullSafe();
            }
            if (type == java.lang.Integer.class) {
                return com.squareup.moshi.StandardJsonAdapters.getOutputMinFrameDuration.nullSafe();
            }
            if (type == java.lang.Long.class) {
                return com.squareup.moshi.StandardJsonAdapters.getOutputFormats.nullSafe();
            }
            if (type == java.lang.Short.class) {
                return com.squareup.moshi.StandardJsonAdapters.getInputSizeshNQ4ISI.nullSafe();
            }
            if (type == java.lang.String.class) {
                return com.squareup.moshi.StandardJsonAdapters.getInputFormats.nullSafe();
            }
            if (type == java.lang.Object.class) {
                return new com.squareup.moshi.StandardJsonAdapters.ObjectJsonAdapter(moshi).nullSafe();
            }
            java.lang.Class<?> rawType = com.squareup.moshi.Types.getRawType(type);
            com.squareup.moshi.JsonAdapter<?> generatedAdapter = com.squareup.moshi.internal.Util.generatedAdapter(moshi, type, rawType);
            if (generatedAdapter != null) {
                return generatedAdapter;
            }
            if (rawType.isEnum()) {
                return new com.squareup.moshi.StandardJsonAdapters.EnumJsonAdapter(rawType).nullSafe();
            }
            return null;
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Boolean> getHighSpeedVideoSizes = new com.squareup.moshi.JsonAdapter<java.lang.Boolean>() { // from class: com.squareup.moshi.StandardJsonAdapters.2
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
            jsonWriter.value(bool.booleanValue());
        }

        public java.lang.String toString() {
            return "JsonAdapter(Boolean)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Boolean fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Byte> getHighSpeedVideoFpsRanges = new com.squareup.moshi.JsonAdapter<java.lang.Byte>() { // from class: com.squareup.moshi.StandardJsonAdapters.3
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Byte b) throws java.io.IOException {
            jsonWriter.value(b.intValue() & 255);
        }

        public java.lang.String toString() {
            return "JsonAdapter(Byte)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Byte fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Byte.valueOf((byte) com.squareup.moshi.StandardJsonAdapters.Camera2StreamConfigurationMap(jsonReader, "a byte", androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, 255));
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Character> getHighResolutionOutputSizeshNQ4ISI = new com.squareup.moshi.JsonAdapter<java.lang.Character>() { // from class: com.squareup.moshi.StandardJsonAdapters.4
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Character ch) throws java.io.IOException {
            jsonWriter.value(ch.toString());
        }

        public java.lang.String toString() {
            return "JsonAdapter(Character)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Character fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            java.lang.String nextString = jsonReader.nextString();
            if (nextString.length() > 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
                sb.append(nextString);
                sb.append('\"');
                throw new com.squareup.moshi.JsonDataException(java.lang.String.format("Expected %s but was %s at path %s", "a char", sb.toString(), jsonReader.getPath()));
            }
            return java.lang.Character.valueOf(nextString.charAt(0));
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Double> getHighSpeedVideoFpsRangesFor = new com.squareup.moshi.JsonAdapter<java.lang.Double>() { // from class: com.squareup.moshi.StandardJsonAdapters.5
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Double d) throws java.io.IOException {
            jsonWriter.value(d.doubleValue());
        }

        public java.lang.String toString() {
            return "JsonAdapter(Double)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Double fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Double.valueOf(jsonReader.nextDouble());
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Float> getHighSpeedVideoSizesFor = new com.squareup.moshi.JsonAdapter<java.lang.Float>() { // from class: com.squareup.moshi.StandardJsonAdapters.6
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Float f) throws java.io.IOException {
            jsonWriter.value(f);
        }

        public java.lang.String toString() {
            return "JsonAdapter(Float)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Float fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            float nextDouble = (float) jsonReader.nextDouble();
            if (!jsonReader.isLenient() && java.lang.Float.isInfinite(nextDouble)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(nextDouble);
                sb.append(" at path ");
                sb.append(jsonReader.getPath());
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
            return java.lang.Float.valueOf(nextDouble);
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Integer> getOutputMinFrameDuration = new com.squareup.moshi.JsonAdapter<java.lang.Integer>() { // from class: com.squareup.moshi.StandardJsonAdapters.7
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Integer num) throws java.io.IOException {
            jsonWriter.value(num.intValue());
        }

        public java.lang.String toString() {
            return "JsonAdapter(Integer)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Integer fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Integer.valueOf(jsonReader.nextInt());
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Long> getOutputFormats = new com.squareup.moshi.JsonAdapter<java.lang.Long>() { // from class: com.squareup.moshi.StandardJsonAdapters.8
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Long l) throws java.io.IOException {
            jsonWriter.value(l.longValue());
        }

        public java.lang.String toString() {
            return "JsonAdapter(Long)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Long fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Long.valueOf(jsonReader.nextLong());
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.Short> getInputSizeshNQ4ISI = new com.squareup.moshi.JsonAdapter<java.lang.Short>() { // from class: com.squareup.moshi.StandardJsonAdapters.9
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Short sh) throws java.io.IOException {
            jsonWriter.value(sh.intValue());
        }

        public java.lang.String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.Short fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Short.valueOf((short) com.squareup.moshi.StandardJsonAdapters.Camera2StreamConfigurationMap(jsonReader, "a short", -32768, 32767));
        }
    };
    static final com.squareup.moshi.JsonAdapter<java.lang.String> getInputFormats = new com.squareup.moshi.JsonAdapter<java.lang.String>() { // from class: com.squareup.moshi.StandardJsonAdapters.10
        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.String str) throws java.io.IOException {
            jsonWriter.value(str);
        }

        public java.lang.String toString() {
            return "JsonAdapter(String)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public /* synthetic */ java.lang.String fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            return jsonReader.nextString();
        }
    };

    private StandardJsonAdapters() {
    }

    static int Camera2StreamConfigurationMap(com.squareup.moshi.JsonReader jsonReader, java.lang.String str, int i, int i2) throws java.io.IOException {
        int nextInt = jsonReader.nextInt();
        if (nextInt >= i && nextInt <= i2) {
            return nextInt;
        }
        throw new com.squareup.moshi.JsonDataException(java.lang.String.format("Expected %s but was %s at path %s", str, java.lang.Integer.valueOf(nextInt), jsonReader.getPath()));
    }

    /* loaded from: classes5.dex */
    static final class EnumJsonAdapter<T extends java.lang.Enum<T>> extends com.squareup.moshi.JsonAdapter<T> {
        private final java.lang.Class<T> Camera2StreamConfigurationMap;
        private final T[] getHighResolutionOutputSizeshNQ4ISI;
        private final com.squareup.moshi.JsonReader.Options getHighSpeedVideoFpsRanges;
        private final java.lang.String[] getHighSpeedVideoFpsRangesFor;

        @Override // com.squareup.moshi.JsonAdapter
        public final /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
            jsonWriter.value(this.getHighSpeedVideoFpsRangesFor[((java.lang.Enum) obj).ordinal()]);
        }

        EnumJsonAdapter(java.lang.Class<T> cls) {
            this.Camera2StreamConfigurationMap = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.getHighResolutionOutputSizeshNQ4ISI = enumConstants;
                this.getHighSpeedVideoFpsRangesFor = new java.lang.String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i < tArr.length) {
                        java.lang.String name2 = tArr[i].name();
                        this.getHighSpeedVideoFpsRangesFor[i] = com.squareup.moshi.internal.Util.jsonName(name2, cls.getField(name2));
                        i++;
                    } else {
                        this.getHighSpeedVideoFpsRanges = com.squareup.moshi.JsonReader.Options.of(this.getHighSpeedVideoFpsRangesFor);
                        return;
                    }
                }
            } catch (java.lang.NoSuchFieldException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing field in ");
                sb.append(cls.getName());
                throw new java.lang.AssertionError(sb.toString(), e);
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonAdapter(");
            sb.append(this.Camera2StreamConfigurationMap.getName());
            sb.append(")");
            return sb.toString();
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final /* synthetic */ java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            int selectString = jsonReader.selectString(this.getHighSpeedVideoFpsRanges);
            if (selectString != -1) {
                return this.getHighResolutionOutputSizeshNQ4ISI[selectString];
            }
            java.lang.String path = jsonReader.getPath();
            java.lang.String nextString = jsonReader.nextString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected one of ");
            sb.append(java.util.Arrays.asList(this.getHighSpeedVideoFpsRangesFor));
            sb.append(" but was ");
            sb.append(nextString);
            sb.append(" at path ");
            sb.append(path);
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
    }

    /* loaded from: classes5.dex */
    static final class ObjectJsonAdapter extends com.squareup.moshi.JsonAdapter<java.lang.Object> {
        private final com.squareup.moshi.JsonAdapter<java.lang.Double> Camera2StreamConfigurationMap;
        private final com.squareup.moshi.JsonAdapter<java.util.Map> getHighResolutionOutputSizeshNQ4ISI;
        private final com.squareup.moshi.Moshi getHighSpeedVideoFpsRanges;
        private final com.squareup.moshi.JsonAdapter<java.util.List> getHighSpeedVideoFpsRangesFor;
        private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> getHighSpeedVideoSizes;
        private final com.squareup.moshi.JsonAdapter<java.lang.String> getHighSpeedVideoSizesFor;

        ObjectJsonAdapter(com.squareup.moshi.Moshi moshi) {
            this.getHighSpeedVideoFpsRanges = moshi;
            this.getHighSpeedVideoFpsRangesFor = moshi.adapter(java.util.List.class);
            this.getHighResolutionOutputSizeshNQ4ISI = moshi.adapter(java.util.Map.class);
            this.getHighSpeedVideoSizesFor = moshi.adapter(java.lang.String.class);
            this.Camera2StreamConfigurationMap = moshi.adapter(java.lang.Double.class);
            this.getHighSpeedVideoSizes = moshi.adapter(java.lang.Boolean.class);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
            switch (com.squareup.moshi.StandardJsonAdapters.AnonymousClass11.getHighSpeedVideoFpsRangesFor[jsonReader.peek().ordinal()]) {
                case 1:
                    return this.getHighSpeedVideoFpsRangesFor.fromJson(jsonReader);
                case 2:
                    return this.getHighResolutionOutputSizeshNQ4ISI.fromJson(jsonReader);
                case 3:
                    return this.getHighSpeedVideoSizesFor.fromJson(jsonReader);
                case 4:
                    return this.Camera2StreamConfigurationMap.fromJson(jsonReader);
                case 5:
                    return this.getHighSpeedVideoSizes.fromJson(jsonReader);
                case 6:
                    return jsonReader.nextNull();
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a value but was ");
                    sb.append(jsonReader.peek());
                    sb.append(" at path ");
                    sb.append(jsonReader.getPath());
                    throw new java.lang.IllegalStateException(sb.toString());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
            java.lang.Class<?> cls = obj.getClass();
            if (cls == java.lang.Object.class) {
                jsonWriter.beginObject();
                jsonWriter.endObject();
                return;
            }
            com.squareup.moshi.Moshi moshi = this.getHighSpeedVideoFpsRanges;
            if (java.util.Map.class.isAssignableFrom(cls)) {
                cls = java.util.Map.class;
            } else if (java.util.Collection.class.isAssignableFrom(cls)) {
                cls = java.util.Collection.class;
            }
            moshi.adapter(cls, com.squareup.moshi.internal.Util.NO_ANNOTATIONS).toJson(jsonWriter, (com.squareup.moshi.JsonWriter) obj);
        }

        public final java.lang.String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: com.squareup.moshi.StandardJsonAdapters$11, reason: invalid class name */
    static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.squareup.moshi.JsonReader.Token.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.squareup.moshi.JsonReader.Token.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.squareup.moshi.JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.squareup.moshi.JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.squareup.moshi.JsonReader.Token.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
