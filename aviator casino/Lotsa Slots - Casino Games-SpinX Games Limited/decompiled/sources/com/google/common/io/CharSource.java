package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
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

    private long countBySkipping(java.io.Reader reader) throws java.io.IOException {
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

    public long copyTo(com.google.common.io.CharSink sink) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(sink);
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            return com.google.common.io.CharStreams.copy((java.io.Reader) create.register(openStream()), (java.io.Writer) create.register(sink.openStream()));
        } finally {
        }
    }

    public java.lang.String read() throws java.io.IOException {
        try {
            return com.google.common.io.CharStreams.toString((java.io.Reader) com.google.common.io.Closer.create().register(openStream()));
        } finally {
        }
    }

    @javax.annotation.CheckForNull
    public java.lang.String readFirstLine() throws java.io.IOException {
        try {
            return ((java.io.BufferedReader) com.google.common.io.Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public com.google.common.collect.ImmutableList<java.lang.String> readLines() throws java.io.IOException {
        try {
            java.io.BufferedReader bufferedReader = (java.io.BufferedReader) com.google.common.io.Closer.create().register(openBufferedStream());
            java.util.ArrayList newArrayList = com.google.common.collect.Lists.newArrayList();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    newArrayList.add(readLine);
                } else {
                    return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) newArrayList);
                }
            }
        } finally {
        }
    }

    @com.google.common.io.ParametricNullness
    public <T> T readLines(com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) com.google.common.io.CharStreams.readLines((java.io.Reader) com.google.common.io.Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }

    public boolean isEmpty() throws java.io.IOException {
        com.google.common.base.Optional<java.lang.Long> lengthIfKnown = lengthIfKnown();
        if (lengthIfKnown.isPresent()) {
            return lengthIfKnown.get().longValue() == 0;
        }
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            return ((java.io.Reader) create.register(openStream())).read() == -1;
        } catch (java.lang.Throwable th) {
            try {
                throw create.rethrow(th);
            } finally {
                create.close();
            }
        }
    }

    public static com.google.common.io.CharSource concat(java.lang.Iterable<? extends com.google.common.io.CharSource> sources) {
        return new com.google.common.io.CharSource.ConcatenatedCharSource(sources);
    }

    public static com.google.common.io.CharSource concat(java.util.Iterator<? extends com.google.common.io.CharSource> sources) {
        return concat(com.google.common.collect.ImmutableList.copyOf(sources));
    }

    public static com.google.common.io.CharSource concat(com.google.common.io.CharSource... sources) {
        return concat(com.google.common.collect.ImmutableList.copyOf(sources));
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

    private final class AsByteSource extends com.google.common.io.ByteSource {
        final java.nio.charset.Charset charset;

        AsByteSource(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            if (charset.equals(this.charset)) {
                return com.google.common.io.CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
            return new com.google.common.io.ReaderInputStream(com.google.common.io.CharSource.this.openStream(), this.charset, 8192);
        }

        public java.lang.String toString() {
            return com.google.common.io.CharSource.this.toString() + ".asByteSource(" + this.charset + ")";
        }
    }

    private static class CharSequenceCharSource extends com.google.common.io.CharSource {
        private static final com.google.common.base.Splitter LINE_SPLITTER = com.google.common.base.Splitter.onPattern("\r\n|\n|\r");
        protected final java.lang.CharSequence seq;

        protected CharSequenceCharSource(java.lang.CharSequence seq) {
            this.seq = (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(seq);
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
                java.util.Iterator<java.lang.String> lines;

                {
                    this.lines = com.google.common.io.CharSource.CharSequenceCharSource.LINE_SPLITTER.split(com.google.common.io.CharSource.CharSequenceCharSource.this.seq).iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
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
        @javax.annotation.CheckForNull
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
        @com.google.common.io.ParametricNullness
        public <T> T readLines(com.google.common.io.LineProcessor<T> processor) throws java.io.IOException {
            java.util.Iterator<java.lang.String> linesIterator = linesIterator();
            while (linesIterator.hasNext() && processor.processLine(linesIterator.next())) {
            }
            return processor.getResult();
        }

        public java.lang.String toString() {
            return "CharSource.wrap(" + com.google.common.base.Ascii.truncate(this.seq, 30, "...") + ")";
        }
    }

    private static class StringCharSource extends com.google.common.io.CharSource.CharSequenceCharSource {
        protected StringCharSource(java.lang.String seq) {
            super(seq);
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
        public long copyTo(com.google.common.io.CharSink sink) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(sink);
            try {
                ((java.io.Writer) com.google.common.io.Closer.create().register(sink.openStream())).write((java.lang.String) this.seq);
                return this.seq.length();
            } finally {
            }
        }
    }

    private static final class EmptyCharSource extends com.google.common.io.CharSource.StringCharSource {
        private static final com.google.common.io.CharSource.EmptyCharSource INSTANCE = new com.google.common.io.CharSource.EmptyCharSource();

        private EmptyCharSource() {
            super("");
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public java.lang.String toString() {
            return "CharSource.empty()";
        }
    }

    private static final class ConcatenatedCharSource extends com.google.common.io.CharSource {
        private final java.lang.Iterable<? extends com.google.common.io.CharSource> sources;

        ConcatenatedCharSource(java.lang.Iterable<? extends com.google.common.io.CharSource> sources) {
            this.sources = (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(sources);
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() throws java.io.IOException {
            return new com.google.common.io.MultiReader(this.sources.iterator());
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
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
        public long length() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().length();
            }
            return j;
        }

        public java.lang.String toString() {
            return "CharSource.concat(" + this.sources + ")";
        }
    }
}
