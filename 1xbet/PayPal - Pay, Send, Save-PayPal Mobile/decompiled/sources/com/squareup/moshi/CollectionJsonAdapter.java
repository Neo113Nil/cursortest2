package com.squareup.moshi;

/* loaded from: classes3.dex */
abstract class CollectionJsonAdapter<C extends java.util.Collection<T>, T> extends com.squareup.moshi.JsonAdapter<C> {
    public static final com.squareup.moshi.JsonAdapter.Factory getHighResolutionOutputSizeshNQ4ISI = new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.CollectionJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @javax.annotation.Nullable
        public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
            java.lang.Class<?> rawType = com.squareup.moshi.Types.getRawType(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (rawType == java.util.List.class || rawType == java.util.Collection.class) {
                return com.squareup.moshi.CollectionJsonAdapter.getHighSpeedVideoSizes(type, moshi).nullSafe();
            }
            if (rawType == java.util.Set.class) {
                return com.squareup.moshi.CollectionJsonAdapter.getHighResolutionOutputSizeshNQ4ISI(type, moshi).nullSafe();
            }
            return null;
        }
    };
    private final com.squareup.moshi.JsonAdapter<T> getHighSpeedVideoFpsRanges;

    abstract C Camera2StreamConfigurationMap();

    /* synthetic */ CollectionJsonAdapter(com.squareup.moshi.JsonAdapter jsonAdapter, byte b) {
        this(jsonAdapter);
    }

    private CollectionJsonAdapter(com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        this.getHighSpeedVideoFpsRanges = jsonAdapter;
    }

    static <T> com.squareup.moshi.JsonAdapter<java.util.Collection<T>> getHighSpeedVideoSizes(java.lang.reflect.Type type, com.squareup.moshi.Moshi moshi) {
        return new com.squareup.moshi.CollectionJsonAdapter<java.util.Collection<T>, T>(moshi.adapter(com.squareup.moshi.Types.collectionElementType(type, java.util.Collection.class))) { // from class: com.squareup.moshi.CollectionJsonAdapter.2
            {
                byte b = 0;
            }

            @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
            public /* synthetic */ java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                return super.fromJson(jsonReader);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
            public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
                super.toJson(jsonWriter, (java.util.Collection) obj);
            }

            @Override // com.squareup.moshi.CollectionJsonAdapter
            final java.util.Collection<T> Camera2StreamConfigurationMap() {
                return new java.util.ArrayList();
            }
        };
    }

    static <T> com.squareup.moshi.JsonAdapter<java.util.Set<T>> getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Type type, com.squareup.moshi.Moshi moshi) {
        return new com.squareup.moshi.CollectionJsonAdapter<java.util.Set<T>, T>(moshi.adapter(com.squareup.moshi.Types.collectionElementType(type, java.util.Collection.class))) { // from class: com.squareup.moshi.CollectionJsonAdapter.3
            {
                byte b = 0;
            }

            @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
            public /* synthetic */ java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                return super.fromJson(jsonReader);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
            public /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
                super.toJson(jsonWriter, (java.util.Collection) obj);
            }

            @Override // com.squareup.moshi.CollectionJsonAdapter
            final /* synthetic */ java.util.Collection Camera2StreamConfigurationMap() {
                return new java.util.LinkedHashSet();
            }
        };
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final C fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        C Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Camera2StreamConfigurationMap.add(this.getHighSpeedVideoFpsRanges.fromJson(jsonReader));
        }
        jsonReader.endArray();
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, C c) throws java.io.IOException {
        jsonWriter.beginArray();
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            this.getHighSpeedVideoFpsRanges.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) it.next());
        }
        jsonWriter.endArray();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(".collection()");
        return sb.toString();
    }
}
