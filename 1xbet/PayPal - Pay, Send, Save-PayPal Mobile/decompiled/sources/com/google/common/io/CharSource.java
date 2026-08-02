package com.google.common.io;

/* loaded from: classes9.dex */
public abstract class CharSource {
    public abstract java.io.Reader openStream() throws java.io.IOException;

    protected CharSource() {
    }

    public com.google.common.io.ByteSource asByteSource(java.nio.charset.Charset charset) {
        return new com.google.common.io.CharSource.AsByteSource(charset);
    }

    public java.io.BufferedReader openBufferedStream() throws java.io.IOException {
        java.io.Reader openStream = openStream();
        if (openStream instanceof java.io.BufferedReader) {
            return (java.io.BufferedReader) openStream;
        }
        return new java.io.BufferedReader(openStream);
    }

    public java.util.stream.Stream<java.lang.String> lines() throws java.io.IOException {
        final java.io.BufferedReader openBufferedStream = openBufferedStream();
        return (java.util.stream.Stream) openBufferedStream.lines().onClose(new java.lang.Runnable() { // from class: com.google.common.io.CharSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.io.CharSource.closeUnchecked(openBufferedStream);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeUnchecked(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            throw new java.io.UncheckedIOException(e);
        }
    }

    public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
        return com.google.common.base.Optional.absent();
    }

    public long length() throws java.io.IOException {
        com.google.common.base.Optional<java.lang.Long> lengthIfKnown = lengthIfKnown();
        if (lengthIfKnown.isPresent()) {
            return lengthIfKnown.get().longValue();
        }
        try {
            return countBySkipping((java.io.Reader) com.google.common.io.Closer.create().register(openStream()));
        } finally {
        }
    }

    private static long countBySkipping(java.io.Reader reader) throws java.io.IOException {
        long j = 0;
        while (true) {
            long skip = reader.skip(Long.MAX_VALUE);
            if (skip == 0) {
                return j;
            }
            j += skip;
        }
    }

    public long copyTo(java.lang.Appendable appendable) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(appendable);
        try {
            return com.google.common.io.CharStreams.copy((java.io.Reader) com.google.common.io.Closer.create().register(openStream()), appendable);
        } finally {
        }
    }

    public long copyTo(com.google.common.io.CharSink charSink) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(charSink);
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            return com.google.common.io.CharStreams.copy((java.io.Reader) create.register(openStream()), (java.io.Writer) create.register(charSink.openStream()));
        } finally {
        }
    }

    public java.lang.String read() throws java.io.IOException {
        try {
            return com.google.common.io.CharStreams.toString((java.io.Reader) com.google.common.io.Closer.create().register(openStream()));
        } finally {
        }
    }

    public java.lang.String readFirstLine() throws java.io.IOException {
        try {
            return ((java.io.BufferedReader) com.google.common.io.Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public com.google.common.collect.ImmutableList<java.lang.String> readLines() throws java.io.IOException {
        try {
            java.io.BufferedReader bufferedReader = (java.io.BufferedReader) com.google.common.io.Closer.create().register(openBufferedStream());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayList.add(readLine);
                } else {
                    return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
                }
            }
        } finally {
        }
    }

    public <T> T readLines(com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) com.google.common.io.CharStreams.readLines((java.io.Reader) com.google.common.io.Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }

    public void forEachLine(java.util.function.Consumer<? super java.lang.String> consumer) throws java.io.IOException {
        try {
            java.util.stream.Stream<java.lang.String> lines = lines();
            try {
                lines.forEachOrdered(consumer);
                if (lines != null) {
                    lines.close();
                }
            } finally {
            }
        } catch (java.io.UncheckedIOException e) {
            throw e.getCause();
        }
    }

    public boolean isEmpty() throws java.io.IOException {
        com.google.common.base.Optional<java.lang.Long> lengthIfKnown = lengthIfKnown();
        if (lengthIfKnown.isPresent()) {
            return lengthIfKnown.get().longValue() == 0;
        }
        try {
            return ((java.io.Reader) com.google.common.io.Closer.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public static com.google.common.io.CharSource concat(java.lang.Iterable<? extends com.google.common.io.CharSource> iterable) {
        return new com.google.common.io.CharSource.ConcatenatedCharSource(iterable);
    }

    public static com.google.common.io.CharSource concat(java.util.Iterator<? extends com.google.common.io.CharSource> it) {
        return concat(com.google.common.collect.ImmutableList.copyOf(it));
    }

    public static com.google.common.io.CharSource concat(com.google.common.io.CharSource... charSourceArr) {
        return concat(com.google.common.collect.ImmutableList.copyOf(charSourceArr));
    }

    public static com.google.common.io.CharSource wrap(java.lang.CharSequence charSequence) {
        if (charSequence instanceof java.lang.String) {
            return new com.google.common.io.CharSource.StringCharSource((java.lang.String) charSequence);
        }
        return new com.google.common.io.CharSource.CharSequenceCharSource(charSequence);
    }

    public static com.google.common.io.CharSource empty() {
        return com.google.common.io.CharSource.EmptyCharSource.INSTANCE;
    }

    final class AsByteSource extends com.google.common.io.ByteSource {
        final java.nio.charset.Charset charset;

        AsByteSource(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            if (charset.equals(this.charset)) {
                return com.google.common.io.CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.InputStream openStream() throws java.io.IOException {
            return new com.google.common.io.ReaderInputStream(com.google.common.io.CharSource.this.openStream(), this.charset, 8192);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.io.CharSource.this.toString());
            sb.append(".asByteSource(");
            sb.append(this.charset);
            sb.append(")");
            return sb.toString();
        }
    }

    static class CharSequenceCharSource extends com.google.common.io.CharSource {
        private static final com.google.common.base.Splitter LINE_SPLITTER = com.google.common.base.Splitter.onPattern("\r\n|\n|\r");
        final java.lang.CharSequence seq;

        CharSequenceCharSource(java.lang.CharSequence charSequence) {
            this.seq = (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(charSequence);
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() {
            return new com.google.common.io.CharSequenceReader(this.seq);
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String read() {
            return this.seq.toString();
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
            return this.seq.length() == 0;
        }

        @Override // com.google.common.io.CharSource
        public long length() {
            return this.seq.length();
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(this.seq.length()));
        }

        private java.util.Iterator<java.lang.String> linesIterator() {
            return new com.google.common.collect.AbstractIterator<java.lang.String>() { // from class: com.google.common.io.CharSource.CharSequenceCharSource.1
                final java.util.Iterator<java.lang.String> lines;

                {
                    this.lines = com.google.common.io.CharSource.CharSequenceCharSource.LINE_SPLITTER.split(com.google.common.io.CharSource.CharSequenceCharSource.this.seq).iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public java.lang.String computeNext() {
                    if (this.lines.hasNext()) {
                        java.lang.String next = this.lines.next();
                        if (this.lines.hasNext() || !next.isEmpty()) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // com.google.common.io.CharSource
        public java.util.stream.Stream<java.lang.String> lines() {
            return com.google.common.collect.Streams.stream(linesIterator());
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String readFirstLine() {
            java.util.Iterator<java.lang.String> linesIterator = linesIterator();
            if (linesIterator.hasNext()) {
                return linesIterator.next();
            }
            return null;
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.collect.ImmutableList<java.lang.String> readLines() {
            return com.google.common.collect.ImmutableList.copyOf(linesIterator());
        }

        @Override // com.google.common.io.CharSource
        public <T> T readLines(com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
            java.util.Iterator<java.lang.String> linesIterator = linesIterator();
            while (linesIterator.hasNext() && lineProcessor.processLine(linesIterator.next())) {
            }
            return lineProcessor.getResult();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharSource.wrap(");
            sb.append(com.google.common.base.Ascii.truncate(this.seq, 30, "..."));
            sb.append(")");
            return sb.toString();
        }
    }

    static class StringCharSource extends com.google.common.io.CharSource.CharSequenceCharSource {
        StringCharSource(java.lang.String str) {
            super(str);
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.io.CharSource
        public java.io.Reader openStream() {
            return new java.io.StringReader((java.lang.String) this.seq);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(java.lang.Appendable appendable) throws java.io.IOException {
            appendable.append(this.seq);
            return this.seq.length();
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(com.google.common.io.CharSink charSink) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(charSink);
            try {
                ((java.io.Writer) com.google.common.io.Closer.create().register(charSink.openStream())).write((java.lang.String) this.seq);
                return this.seq.length();
            } finally {
            }
        }
    }

    static final class EmptyCharSource extends com.google.common.io.CharSource.StringCharSource {
        private static final com.google.common.io.CharSource.EmptyCharSource INSTANCE = new com.google.common.io.CharSource.EmptyCharSource();

        private EmptyCharSource() {
            super("");
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public final java.lang.String toString() {
            return "CharSource.empty()";
        }
    }

    static final class ConcatenatedCharSource extends com.google.common.io.CharSource {
        private final java.lang.Iterable<? extends com.google.common.io.CharSource> sources;

        ConcatenatedCharSource(java.lang.Iterable<? extends com.google.common.io.CharSource> iterable) {
            this.sources = (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.CharSource
        public final java.io.Reader openStream() throws java.io.IOException {
            return new com.google.common.io.MultiReader(this.sources.iterator());
        }

        @Override // com.google.common.io.CharSource
        public final boolean isEmpty() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.CharSource
        public final com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            long j = 0;
            while (it.hasNext()) {
                com.google.common.base.Optional<java.lang.Long> lengthIfKnown = it.next().lengthIfKnown();
                if (!lengthIfKnown.isPresent()) {
                    return com.google.common.base.Optional.absent();
                }
                j += lengthIfKnown.get().longValue();
            }
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(j));
        }

        @Override // com.google.common.io.CharSource
        public final long length() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().length();
            }
            return j;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharSource.concat(");
            sb.append(this.sources);
            sb.append(")");
            return sb.toString();
        }
    }
}
