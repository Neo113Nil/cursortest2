package com.google.common.io;

/* loaded from: classes9.dex */
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    static java.nio.CharBuffer createBuffer() {
        return java.nio.CharBuffer.allocate(2048);
    }

    private CharStreams() {
    }

    public static long copy(java.lang.Readable readable, java.lang.Appendable appendable) throws java.io.IOException {
        if (readable instanceof java.io.Reader) {
            if (appendable instanceof java.lang.StringBuilder) {
                return copyReaderToBuilder((java.io.Reader) readable, (java.lang.StringBuilder) appendable);
            }
            return copyReaderToWriter((java.io.Reader) readable, asWriter(appendable));
        }
        com.google.common.base.Preconditions.checkNotNull(readable);
        com.google.common.base.Preconditions.checkNotNull(appendable);
        java.nio.CharBuffer createBuffer = createBuffer();
        long j = 0;
        while (readable.read(createBuffer) != -1) {
            com.google.common.io.Java8Compatibility.flip(createBuffer);
            appendable.append(createBuffer);
            j += createBuffer.remaining();
            com.google.common.io.Java8Compatibility.clear(createBuffer);
        }
        return j;
    }

    static long copyReaderToBuilder(java.io.Reader reader, java.lang.StringBuilder sb) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(reader);
        com.google.common.base.Preconditions.checkNotNull(sb);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read == -1) {
                return j;
            }
            sb.append(cArr, 0, read);
            j += read;
        }
    }

    static long copyReaderToWriter(java.io.Reader reader, java.io.Writer writer) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(reader);
        com.google.common.base.Preconditions.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read == -1) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += read;
        }
    }

    public static java.lang.String toString(java.lang.Readable readable) throws java.io.IOException {
        return toStringBuilder(readable).toString();
    }

    private static java.lang.StringBuilder toStringBuilder(java.lang.Readable readable) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (readable instanceof java.io.Reader) {
            copyReaderToBuilder((java.io.Reader) readable, sb);
            return sb;
        }
        copy(readable, sb);
        return sb;
    }

    public static java.util.List<java.lang.String> readLines(java.lang.Readable readable) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.io.LineReader lineReader = new com.google.common.io.LineReader(readable);
        while (true) {
            java.lang.String readLine = lineReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static <T> T readLines(java.lang.Readable readable, com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        java.lang.String readLine;
        com.google.common.base.Preconditions.checkNotNull(readable);
        com.google.common.base.Preconditions.checkNotNull(lineProcessor);
        com.google.common.io.LineReader lineReader = new com.google.common.io.LineReader(readable);
        do {
            readLine = lineReader.readLine();
            if (readLine == null) {
                break;
            }
        } while (lineProcessor.processLine(readLine));
        return lineProcessor.getResult();
    }

    public static long exhaust(java.lang.Readable readable) throws java.io.IOException {
        java.nio.CharBuffer createBuffer = createBuffer();
        long j = 0;
        while (true) {
            long read = readable.read(createBuffer);
            if (read == -1) {
                return j;
            }
            j += read;
            com.google.common.io.Java8Compatibility.clear(createBuffer);
        }
    }

    public static void skipFully(java.io.Reader reader, long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(reader);
        while (j > 0) {
            long skip = reader.skip(j);
            if (skip == 0) {
                throw new java.io.EOFException();
            }
            j -= skip;
        }
    }

    public static java.io.Writer nullWriter() {
        return com.google.common.io.CharStreams.NullWriter.INSTANCE;
    }

    static final class NullWriter extends java.io.Writer {
        private static final com.google.common.io.CharStreams.NullWriter INSTANCE = new com.google.common.io.CharStreams.NullWriter();

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(char c) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(java.lang.CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(int i) {
        }

        private NullWriter() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(char c) throws java.io.IOException {
            return append(c);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
            return append(charSequence);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
            return append(charSequence, i, i2);
        }

        @Override // java.io.Writer
        public final void write(char[] cArr) {
            com.google.common.base.Preconditions.checkNotNull(cArr);
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2 + i, cArr.length);
        }

        @Override // java.io.Writer
        public final void write(java.lang.String str) {
            com.google.common.base.Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer
        public final void write(java.lang.String str, int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2 + i, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        public final java.lang.String toString() {
            return "CharStreams.nullWriter()";
        }
    }

    public static java.io.Writer asWriter(java.lang.Appendable appendable) {
        if (appendable instanceof java.io.Writer) {
            return (java.io.Writer) appendable;
        }
        return new com.google.common.io.AppendableWriter(appendable);
    }
}
