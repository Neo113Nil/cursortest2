package com.squareup.moshi;

/* loaded from: classes3.dex */
final class ArrayJsonAdapter extends com.squareup.moshi.JsonAdapter<java.lang.Object> {
    public static final com.squareup.moshi.JsonAdapter.Factory getHighSpeedVideoSizes = new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.ArrayJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @javax.annotation.Nullable
        public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
            java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI = com.squareup.moshi.Types.getHighResolutionOutputSizeshNQ4ISI(type);
            if (highResolutionOutputSizeshNQ4ISI != null && set.isEmpty()) {
                return new com.squareup.moshi.ArrayJsonAdapter(com.squareup.moshi.Types.getRawType(highResolutionOutputSizeshNQ4ISI), moshi.adapter(highResolutionOutputSizeshNQ4ISI)).nullSafe();
            }
            return null;
        }
    };
    private final com.squareup.moshi.JsonAdapter<java.lang.Object> Camera2StreamConfigurationMap;
    private final java.lang.Class<?> getHighSpeedVideoFpsRangesFor;

    ArrayJsonAdapter(java.lang.Class<?> cls, com.squareup.moshi.JsonAdapter<java.lang.Object> jsonAdapter) {
        this.getHighSpeedVideoFpsRangesFor = cls;
        this.Camera2StreamConfigurationMap = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.Camera2StreamConfigurationMap.fromJson(jsonReader));
        }
        jsonReader.endArray();
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(this.getHighSpeedVideoFpsRangesFor, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            java.lang.reflect.Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        jsonWriter.beginArray();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.Camera2StreamConfigurationMap.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) java.lang.reflect.Array.get(obj, i));
        }
        jsonWriter.endArray();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(".array()");
        return sb.toString();
    }
}
