package com.squareup.moshi.internal;

/* loaded from: classes3.dex */
public final class NullSafeJsonAdapter<T> extends com.squareup.moshi.JsonAdapter<T> {
    private final com.squareup.moshi.JsonAdapter<T> getHighSpeedVideoSizes;

    public NullSafeJsonAdapter(com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        this.getHighSpeedVideoSizes = jsonAdapter;
    }

    public final com.squareup.moshi.JsonAdapter<T> delegate() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @javax.annotation.Nullable
    public final T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.squareup.moshi.JsonReader.Token.NULL) {
            return (T) jsonReader.nextNull();
        }
        return this.getHighSpeedVideoSizes.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
        if (t == null) {
            jsonWriter.nullValue();
        } else {
            this.getHighSpeedVideoSizes.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(".nullSafe()");
        return sb.toString();
    }
}
