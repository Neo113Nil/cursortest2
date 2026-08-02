package com.google.common.hash;

/* loaded from: classes9.dex */
public final class Funnels {
    private Funnels() {
    }

    public static com.google.common.hash.Funnel<byte[]> byteArrayFunnel() {
        return com.google.common.hash.Funnels.ByteArrayFunnel.INSTANCE;
    }

    enum ByteArrayFunnel implements com.google.common.hash.Funnel<byte[]> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public final void funnel(byte[] bArr, com.google.common.hash.PrimitiveSink primitiveSink) {
            primitiveSink.putBytes(bArr);
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    public static com.google.common.hash.Funnel<java.lang.CharSequence> unencodedCharsFunnel() {
        return com.google.common.hash.Funnels.UnencodedCharsFunnel.INSTANCE;
    }

    enum UnencodedCharsFunnel implements com.google.common.hash.Funnel<java.lang.CharSequence> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public final void funnel(java.lang.CharSequence charSequence, com.google.common.hash.PrimitiveSink primitiveSink) {
            primitiveSink.putUnencodedChars(charSequence);
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    public static com.google.common.hash.Funnel<java.lang.CharSequence> stringFunnel(java.nio.charset.Charset charset) {
        return new com.google.common.hash.Funnels.StringCharsetFunnel(charset);
    }

    static final class StringCharsetFunnel implements com.google.common.hash.Funnel<java.lang.CharSequence> {
        private final java.nio.charset.Charset charset;

        StringCharsetFunnel(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.hash.Funnel
        public final void funnel(java.lang.CharSequence charSequence, com.google.common.hash.PrimitiveSink primitiveSink) {
            primitiveSink.putString(charSequence, this.charset);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Funnels.stringFunnel(");
            sb.append(this.charset.name());
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.hash.Funnels.StringCharsetFunnel) {
                return this.charset.equals(((com.google.common.hash.Funnels.StringCharsetFunnel) obj).charset);
            }
            return false;
        }

        public final int hashCode() {
            return com.google.common.hash.Funnels.StringCharsetFunnel.class.hashCode() ^ this.charset.hashCode();
        }

        final java.lang.Object writeReplace() {
            return new com.google.common.hash.Funnels.StringCharsetFunnel.SerializedForm(this.charset);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use SerializedForm");
        }

        static final class SerializedForm implements java.io.Serializable {
            private static final long serialVersionUID = 0;
            private final java.lang.String charsetCanonicalName;

            SerializedForm(java.nio.charset.Charset charset) {
                this.charsetCanonicalName = charset.name();
            }

            private java.lang.Object readResolve() {
                return com.google.common.hash.Funnels.stringFunnel(java.nio.charset.Charset.forName(this.charsetCanonicalName));
            }
        }
    }

    public static com.google.common.hash.Funnel<java.lang.Integer> integerFunnel() {
        return com.google.common.hash.Funnels.IntegerFunnel.INSTANCE;
    }

    enum IntegerFunnel implements com.google.common.hash.Funnel<java.lang.Integer> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public final void funnel(java.lang.Integer num, com.google.common.hash.PrimitiveSink primitiveSink) {
            primitiveSink.putInt(num.intValue());
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    public static <E> com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> sequentialFunnel(com.google.common.hash.Funnel<E> funnel) {
        return new com.google.common.hash.Funnels.SequentialFunnel(funnel);
    }

    static final class SequentialFunnel<E> implements com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> {
        private final com.google.common.hash.Funnel<E> elementFunnel;

        SequentialFunnel(com.google.common.hash.Funnel<E> funnel) {
            this.elementFunnel = (com.google.common.hash.Funnel) com.google.common.base.Preconditions.checkNotNull(funnel);
        }

        @Override // com.google.common.hash.Funnel
        public final void funnel(java.lang.Iterable<? extends E> iterable, com.google.common.hash.PrimitiveSink primitiveSink) {
            java.util.Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                this.elementFunnel.funnel(it.next(), primitiveSink);
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Funnels.sequentialFunnel(");
            sb.append(this.elementFunnel);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.hash.Funnels.SequentialFunnel) {
                return this.elementFunnel.equals(((com.google.common.hash.Funnels.SequentialFunnel) obj).elementFunnel);
            }
            return false;
        }

        public final int hashCode() {
            return com.google.common.hash.Funnels.SequentialFunnel.class.hashCode() ^ this.elementFunnel.hashCode();
        }
    }

    public static com.google.common.hash.Funnel<java.lang.Long> longFunnel() {
        return com.google.common.hash.Funnels.LongFunnel.INSTANCE;
    }

    enum LongFunnel implements com.google.common.hash.Funnel<java.lang.Long> {
        INSTANCE;

        @Override // com.google.common.hash.Funnel
        public final void funnel(java.lang.Long l, com.google.common.hash.PrimitiveSink primitiveSink) {
            primitiveSink.putLong(l.longValue());
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static java.io.OutputStream asOutputStream(com.google.common.hash.PrimitiveSink primitiveSink) {
        return new com.google.common.hash.Funnels.SinkAsStream(primitiveSink);
    }

    static final class SinkAsStream extends java.io.OutputStream {
        final com.google.common.hash.PrimitiveSink sink;

        SinkAsStream(com.google.common.hash.PrimitiveSink primitiveSink) {
            this.sink = (com.google.common.hash.PrimitiveSink) com.google.common.base.Preconditions.checkNotNull(primitiveSink);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.sink.putByte((byte) i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            this.sink.putBytes(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            this.sink.putBytes(bArr, i, i2);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Funnels.asOutputStream(");
            sb.append(this.sink);
            sb.append(")");
            return sb.toString();
        }
    }
}
