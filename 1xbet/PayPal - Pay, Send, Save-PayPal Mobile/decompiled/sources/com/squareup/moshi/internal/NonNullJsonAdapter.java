package com.squareup.moshi.internal;

/* loaded from: classes3.dex */
public final class NonNullJsonAdapter<T> extends com.squareup.moshi.JsonAdapter<T> {
    private final com.squareup.moshi.JsonAdapter<T> getHighSpeedVideoFpsRanges;

    public NonNullJsonAdapter(com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        this.getHighSpeedVideoFpsRanges = jsonAdapter;
    }

    public final com.squareup.moshi.JsonAdapter<T> delegate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @javax.annotation.Nullable
    public final T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.squareup.moshi.JsonReader.Token.NULL) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected null at ");
            sb.append(jsonReader.getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        return this.getHighSpeedVideoFpsRanges.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
        if (t == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected null at ");
            sb.append(jsonWriter.getPath());
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(".nonNull()");
        return sb.toString();
    }
}
