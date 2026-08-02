package com.nimbusds.jose.shaded.gson.internal;

/* loaded from: classes4.dex */
public final class Streams {
    private Streams() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static com.nimbusds.jose.shaded.gson.JsonElement parse(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws com.nimbusds.jose.shaded.gson.JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.peek();
            } catch (java.io.EOFException e) {
                e = e;
                z = true;
            }
            try {
                return com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.JSON_ELEMENT.read2(jsonReader);
            } catch (java.io.EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
                }
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
            }
        } catch (com.nimbusds.jose.shaded.gson.stream.MalformedJsonException e3) {
            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e3);
        } catch (java.io.IOException e4) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e4);
        } catch (java.lang.NumberFormatException e5) {
            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e5);
        }
    }

    public static void write(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter) throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static java.io.Writer writerForAppendable(java.lang.Appendable appendable) {
        return appendable instanceof java.io.Writer ? (java.io.Writer) appendable : new com.nimbusds.jose.shaded.gson.internal.Streams.AppendableWriter(appendable);
    }

    static final class AppendableWriter extends java.io.Writer {
        private final java.lang.Appendable appendable;
        private final com.nimbusds.jose.shaded.gson.internal.Streams.AppendableWriter.CurrentWrite currentWrite = new com.nimbusds.jose.shaded.gson.internal.Streams.AppendableWriter.CurrentWrite();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
            return append(charSequence);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
            return append(charSequence, i, i2);
        }

        AppendableWriter(java.lang.Appendable appendable) {
            this.appendable = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
            this.currentWrite.setChars(cArr);
            this.appendable.append(this.currentWrite, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) throws java.io.IOException {
            this.appendable.append((char) i);
        }

        @Override // java.io.Writer
        public final void write(java.lang.String str, int i, int i2) throws java.io.IOException {
            java.util.Objects.requireNonNull(str);
            this.appendable.append(str, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(java.lang.CharSequence charSequence) throws java.io.IOException {
            this.appendable.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
            this.appendable.append(charSequence, i, i2);
            return this;
        }

        static class CurrentWrite implements java.lang.CharSequence {
            private java.lang.String cachedString;
            private char[] chars;

            private CurrentWrite() {
            }

            void setChars(char[] cArr) {
                this.chars = cArr;
                this.cachedString = null;
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.chars.length;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.chars[i];
            }

            @Override // java.lang.CharSequence
            public java.lang.CharSequence subSequence(int i, int i2) {
                return new java.lang.String(this.chars, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public java.lang.String toString() {
                if (this.cachedString == null) {
                    this.cachedString = new java.lang.String(this.chars);
                }
                return this.cachedString;
            }
        }
    }
}
