package com.squareup.moshi;

/* loaded from: classes3.dex */
final class RecordJsonAdapter<T> extends com.squareup.moshi.JsonAdapter<T> {
    static final com.squareup.moshi.JsonAdapter.Factory Camera2StreamConfigurationMap = new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.RecordJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @javax.annotation.Nullable
        public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
            return null;
        }
    };

    RecordJsonAdapter() {
    }

    @Override // com.squareup.moshi.JsonAdapter
    @javax.annotation.Nullable
    public final T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        throw new java.lang.AssertionError();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
        throw new java.lang.AssertionError();
    }
}
