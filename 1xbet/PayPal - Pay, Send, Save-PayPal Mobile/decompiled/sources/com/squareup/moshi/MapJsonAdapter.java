package com.squareup.moshi;

/* loaded from: classes3.dex */
final class MapJsonAdapter<K, V> extends com.squareup.moshi.JsonAdapter<java.util.Map<K, V>> {
    public static final com.squareup.moshi.JsonAdapter.Factory Camera2StreamConfigurationMap = new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.MapJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @javax.annotation.Nullable
        public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
            java.lang.Class<?> rawType;
            if (!set.isEmpty() || (rawType = com.squareup.moshi.Types.getRawType(type)) != java.util.Map.class) {
                return null;
            }
            java.lang.reflect.Type[] Camera2StreamConfigurationMap2 = com.squareup.moshi.Types.Camera2StreamConfigurationMap(type, rawType);
            return new com.squareup.moshi.MapJsonAdapter(moshi, Camera2StreamConfigurationMap2[0], Camera2StreamConfigurationMap2[1]).nullSafe();
        }
    };
    private final com.squareup.moshi.JsonAdapter<K> getHighSpeedVideoFpsRangesFor;
    private final com.squareup.moshi.JsonAdapter<V> getHighSpeedVideoSizes;

    @Override // com.squareup.moshi.JsonAdapter
    public final /* synthetic */ void toJson(com.squareup.moshi.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        jsonWriter.beginObject();
        for (java.util.Map.Entry<K, V> entry : ((java.util.Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Map key is null at ");
                sb.append(jsonWriter.getPath());
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
            jsonWriter.promoteValueToName();
            this.getHighSpeedVideoFpsRangesFor.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) entry.getKey());
            this.getHighSpeedVideoSizes.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) entry.getValue());
        }
        jsonWriter.endObject();
    }

    MapJsonAdapter(com.squareup.moshi.Moshi moshi, java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.getHighSpeedVideoFpsRangesFor = moshi.adapter(type);
        this.getHighSpeedVideoSizes = moshi.adapter(type2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonAdapter(");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* synthetic */ java.lang.Object fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = new com.squareup.moshi.LinkedHashTreeMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            jsonReader.promoteNameToValue();
            K fromJson = this.getHighSpeedVideoFpsRangesFor.fromJson(jsonReader);
            V fromJson2 = this.getHighSpeedVideoSizes.fromJson(jsonReader);
            V put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Map key '");
                sb.append(fromJson);
                sb.append("' has multiple values at path ");
                sb.append(jsonReader.getPath());
                sb.append(": ");
                sb.append(put);
                sb.append(" and ");
                sb.append(fromJson2);
                throw new com.squareup.moshi.JsonDataException(sb.toString());
            }
        }
        jsonReader.endObject();
        return linkedHashTreeMap;
    }
}
