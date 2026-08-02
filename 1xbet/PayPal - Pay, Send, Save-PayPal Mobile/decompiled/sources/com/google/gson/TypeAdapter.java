package com.google.gson;

/* loaded from: classes4.dex */
public abstract class TypeAdapter<T> {
    /* renamed from: read */
    public abstract T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException;

    public abstract void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException;

    public final void toJson(java.io.Writer writer, T t) throws java.io.IOException {
        write(new com.google.gson.stream.JsonWriter(writer), t);
    }

    public final java.lang.String toJson(T t) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            toJson(com.google.gson.internal.Streams.writerForAppendable(sb), t);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new com.google.gson.JsonIOException(e);
        }
    }

    public final com.google.gson.JsonElement toJsonTree(T t) {
        try {
            com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter = new com.google.gson.internal.bind.JsonTreeWriter();
            write(jsonTreeWriter, t);
            return jsonTreeWriter.get();
        } catch (java.io.IOException e) {
            throw new com.google.gson.JsonIOException(e);
        }
    }

    public final T fromJson(java.io.Reader reader) throws java.io.IOException {
        return read2(new com.google.gson.stream.JsonReader(reader));
    }

    public final T fromJson(java.lang.String str) throws java.io.IOException {
        return fromJson(new java.io.StringReader(str));
    }

    public final T fromJsonTree(com.google.gson.JsonElement jsonElement) {
        try {
            return read2(new com.google.gson.internal.bind.JsonTreeReader(jsonElement));
        } catch (java.io.IOException e) {
            throw new com.google.gson.JsonIOException(e);
        }
    }

    public final com.google.gson.TypeAdapter<T> nullSafe() {
        return !(this instanceof com.google.gson.TypeAdapter.NullSafeTypeAdapter) ? new com.google.gson.TypeAdapter.NullSafeTypeAdapter() : this;
    }

    final class NullSafeTypeAdapter extends com.google.gson.TypeAdapter<T> {
        private NullSafeTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                com.google.gson.TypeAdapter.this.write(jsonWriter, t);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) com.google.gson.TypeAdapter.this.read2(jsonReader);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NullSafeTypeAdapter[");
            sb.append(com.google.gson.TypeAdapter.this);
            sb.append("]");
            return sb.toString();
        }
    }
}
