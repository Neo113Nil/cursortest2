package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public abstract class TypeAdapter<T> {
    /* renamed from: read */
    public abstract T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException;

    public abstract void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException;

    public final void toJson(java.io.Writer writer, T t) throws java.io.IOException {
        write(new com.nimbusds.jose.shaded.gson.stream.JsonWriter(writer), t);
    }

    public final com.nimbusds.jose.shaded.gson.TypeAdapter<T> nullSafe() {
        return new com.nimbusds.jose.shaded.gson.TypeAdapter<T>() { // from class: com.nimbusds.jose.shaded.gson.TypeAdapter.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                } else {
                    com.nimbusds.jose.shaded.gson.TypeAdapter.this.write(jsonWriter, t);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return (T) com.nimbusds.jose.shaded.gson.TypeAdapter.this.read2(jsonReader);
            }
        };
    }

    public final java.lang.String toJson(T t) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
        }
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement toJsonTree(T t) {
        try {
            com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeWriter jsonTreeWriter = new com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeWriter();
            write(jsonTreeWriter, t);
            return jsonTreeWriter.get();
        } catch (java.io.IOException e) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
        }
    }

    public final T fromJson(java.io.Reader reader) throws java.io.IOException {
        return read2(new com.nimbusds.jose.shaded.gson.stream.JsonReader(reader));
    }

    public final T fromJson(java.lang.String str) throws java.io.IOException {
        return fromJson(new java.io.StringReader(str));
    }

    public final T fromJsonTree(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        try {
            return read2(new com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader(jsonElement));
        } catch (java.io.IOException e) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
        }
    }
}
