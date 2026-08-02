package com.squareup.moshi;

/* loaded from: classes3.dex */
public abstract class JsonAdapter<T> {

    public interface Factory {
        @javax.annotation.CheckReturnValue
        @javax.annotation.Nullable
        com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi);
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public abstract T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException;

    boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public abstract void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final T fromJson(okio.BufferedSource bufferedSource) throws java.io.IOException {
        return fromJson(com.squareup.moshi.JsonReader.of(bufferedSource));
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final T fromJson(java.lang.String str) throws java.io.IOException {
        com.squareup.moshi.JsonReader of = com.squareup.moshi.JsonReader.of(new okio.Buffer().writeUtf8(str));
        T fromJson = fromJson(of);
        if (getHighResolutionOutputSizeshNQ4ISI() || of.peek() == com.squareup.moshi.JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new com.squareup.moshi.JsonDataException("JSON document was not fully consumed.");
    }

    public final void toJson(okio.BufferedSink bufferedSink, @javax.annotation.Nullable T t) throws java.io.IOException {
        toJson(com.squareup.moshi.JsonWriter.of(bufferedSink), (com.squareup.moshi.JsonWriter) t);
    }

    @javax.annotation.CheckReturnValue
    public final java.lang.String toJson(@javax.annotation.Nullable T t) {
        okio.Buffer buffer = new okio.Buffer();
        try {
            toJson((okio.BufferedSink) buffer, (okio.Buffer) t);
            return buffer.readUtf8();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final java.lang.Object toJsonValue(@javax.annotation.Nullable T t) {
        com.squareup.moshi.JsonValueWriter jsonValueWriter = new com.squareup.moshi.JsonValueWriter();
        try {
            toJson((com.squareup.moshi.JsonWriter) jsonValueWriter, (com.squareup.moshi.JsonValueWriter) t);
            int i = jsonValueWriter.getInputSizeshNQ4ISI;
            if (i > 1 || (i == 1 && jsonValueWriter.getInputFormats[i - 1] != 7)) {
                throw new java.lang.IllegalStateException("Incomplete document");
            }
            return jsonValueWriter.Camera2StreamConfigurationMap[0];
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final T fromJsonValue(@javax.annotation.Nullable java.lang.Object obj) {
        try {
            return fromJson(new com.squareup.moshi.JsonValueReader(obj));
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @javax.annotation.CheckReturnValue
    public final com.squareup.moshi.JsonAdapter<T> serializeNulls() {
        return new com.squareup.moshi.JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            @javax.annotation.Nullable
            public T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                return (T) this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
                boolean serializeNulls = jsonWriter.getSerializeNulls();
                jsonWriter.setSerializeNulls(true);
                try {
                    this.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
                } finally {
                    jsonWriter.setSerializeNulls(serializeNulls);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            final boolean getHighResolutionOutputSizeshNQ4ISI() {
                return this.getHighResolutionOutputSizeshNQ4ISI();
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this);
                sb.append(".serializeNulls()");
                return sb.toString();
            }
        };
    }

    @javax.annotation.CheckReturnValue
    public final com.squareup.moshi.JsonAdapter<T> nullSafe() {
        return this instanceof com.squareup.moshi.internal.NullSafeJsonAdapter ? this : new com.squareup.moshi.internal.NullSafeJsonAdapter(this);
    }

    @javax.annotation.CheckReturnValue
    public final com.squareup.moshi.JsonAdapter<T> nonNull() {
        return this instanceof com.squareup.moshi.internal.NonNullJsonAdapter ? this : new com.squareup.moshi.internal.NonNullJsonAdapter(this);
    }

    @javax.annotation.CheckReturnValue
    public final com.squareup.moshi.JsonAdapter<T> lenient() {
        return new com.squareup.moshi.JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.2
            @Override // com.squareup.moshi.JsonAdapter
            final boolean getHighResolutionOutputSizeshNQ4ISI() {
                return true;
            }

            @Override // com.squareup.moshi.JsonAdapter
            @javax.annotation.Nullable
            public T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                boolean isLenient = jsonReader.isLenient();
                jsonReader.setLenient(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setLenient(isLenient);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
                boolean isLenient = jsonWriter.isLenient();
                jsonWriter.setLenient(true);
                try {
                    this.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
                } finally {
                    jsonWriter.setLenient(isLenient);
                }
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this);
                sb.append(".lenient()");
                return sb.toString();
            }
        };
    }

    @javax.annotation.CheckReturnValue
    public final com.squareup.moshi.JsonAdapter<T> failOnUnknown() {
        return new com.squareup.moshi.JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.3
            @Override // com.squareup.moshi.JsonAdapter
            @javax.annotation.Nullable
            public T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                boolean failOnUnknown = jsonReader.failOnUnknown();
                jsonReader.setFailOnUnknown(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setFailOnUnknown(failOnUnknown);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
                this.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
            }

            @Override // com.squareup.moshi.JsonAdapter
            final boolean getHighResolutionOutputSizeshNQ4ISI() {
                return this.getHighResolutionOutputSizeshNQ4ISI();
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this);
                sb.append(".failOnUnknown()");
                return sb.toString();
            }
        };
    }

    @javax.annotation.CheckReturnValue
    public com.squareup.moshi.JsonAdapter<T> indent(final java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("indent == null");
        }
        return new com.squareup.moshi.JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.4
            @Override // com.squareup.moshi.JsonAdapter
            @javax.annotation.Nullable
            public T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
                return (T) this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
                java.lang.String indent = jsonWriter.getIndent();
                jsonWriter.setIndent(str);
                try {
                    this.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
                } finally {
                    jsonWriter.setIndent(indent);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            final boolean getHighResolutionOutputSizeshNQ4ISI() {
                return this.getHighResolutionOutputSizeshNQ4ISI();
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this);
                sb.append(".indent(\"");
                sb.append(str);
                sb.append("\")");
                return sb.toString();
            }
        };
    }
}
