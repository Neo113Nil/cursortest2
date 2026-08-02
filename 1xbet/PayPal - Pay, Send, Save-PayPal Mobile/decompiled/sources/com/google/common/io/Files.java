package com.google.common.io;

/* loaded from: classes9.dex */
public final class Files {
    private static final com.google.common.graph.SuccessorsFunction<java.io.File> FILE_TREE = new com.google.common.graph.SuccessorsFunction() { // from class: com.google.common.io.Files$$ExternalSyntheticLambda0
        @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final java.lang.Iterable successors(java.lang.Object obj) {
            return com.google.common.io.Files.lambda$static$0((java.io.File) obj);
        }
    };

    enum FilePredicate implements com.google.common.base.Predicate<java.io.File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.io.File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.io.File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Files.isFile()";
            }
        }
    }

    private Files() {
    }

    public static java.io.BufferedReader newReader(java.io.File file, java.nio.charset.Charset charset) throws java.io.FileNotFoundException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(charset);
        return new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset));
    }

    public static java.io.BufferedWriter newWriter(java.io.File file, java.nio.charset.Charset charset) throws java.io.FileNotFoundException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(charset);
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset));
    }

    public static com.google.common.io.ByteSource asByteSource(java.io.File file) {
        return new com.google.common.io.Files.FileByteSource(file);
    }

    static final class FileByteSource extends com.google.common.io.ByteSource {
        private final java.io.File file;

        private FileByteSource(java.io.File file) {
            this.file = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.FileInputStream openStream() throws java.io.IOException {
            return new java.io.FileInputStream(this.file);
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            if (this.file.isFile()) {
                return com.google.common.base.Optional.of(java.lang.Long.valueOf(this.file.length()));
            }
            return com.google.common.base.Optional.absent();
        }

        @Override // com.google.common.io.ByteSource
        public final long size() throws java.io.IOException {
            if (!this.file.isFile()) {
                throw new java.io.FileNotFoundException(this.file.toString());
            }
            return this.file.length();
        }

        @Override // com.google.common.io.ByteSource
        public final byte[] read() throws java.io.IOException {
            try {
                java.io.FileInputStream fileInputStream = (java.io.FileInputStream) com.google.common.io.Closer.create().register(openStream());
                return com.google.common.io.ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Files.asByteSource(");
            sb.append(this.file);
            sb.append(")");
            return sb.toString();
        }
    }

    public static com.google.common.io.ByteSink asByteSink(java.io.File file, com.google.common.io.FileWriteMode... fileWriteModeArr) {
        return new com.google.common.io.Files.FileByteSink(file, fileWriteModeArr);
    }

    static final class FileByteSink extends com.google.common.io.ByteSink {
        private final java.io.File file;
        private final com.google.common.collect.ImmutableSet<com.google.common.io.FileWriteMode> modes;

        private FileByteSink(java.io.File file, com.google.common.io.FileWriteMode... fileWriteModeArr) {
            this.file = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
            this.modes = com.google.common.collect.ImmutableSet.copyOf(fileWriteModeArr);
        }

        @Override // com.google.common.io.ByteSink
        public final java.io.FileOutputStream openStream() throws java.io.IOException {
            return new java.io.FileOutputStream(this.file, this.modes.contains(com.google.common.io.FileWriteMode.APPEND));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Files.asByteSink(");
            sb.append(this.file);
            sb.append(", ");
            sb.append(this.modes);
            sb.append(")");
            return sb.toString();
        }
    }

    public static com.google.common.io.CharSource asCharSource(java.io.File file, java.nio.charset.Charset charset) {
        return asByteSource(file).asCharSource(charset);
    }

    public static com.google.common.io.CharSink asCharSink(java.io.File file, java.nio.charset.Charset charset, com.google.common.io.FileWriteMode... fileWriteModeArr) {
        return asByteSink(file, fileWriteModeArr).asCharSink(charset);
    }

    public static byte[] toByteArray(java.io.File file) throws java.io.IOException {
        return asByteSource(file).read();
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return asCharSource(file, charset).read();
    }

    public static void write(byte[] bArr, java.io.File file) throws java.io.IOException {
        asByteSink(file, new com.google.common.io.FileWriteMode[0]).write(bArr);
    }

    @java.lang.Deprecated
    public static void write(java.lang.CharSequence charSequence, java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        asCharSink(file, charset, new com.google.common.io.FileWriteMode[0]).write(charSequence);
    }

    public static void copy(java.io.File file, java.io.OutputStream outputStream) throws java.io.IOException {
        asByteSource(file).copyTo(outputStream);
    }

    public static void copy(java.io.File file, java.io.File file2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        asByteSource(file).copyTo(asByteSink(file2, new com.google.common.io.FileWriteMode[0]));
    }

    @java.lang.Deprecated
    public static void copy(java.io.File file, java.nio.charset.Charset charset, java.lang.Appendable appendable) throws java.io.IOException {
        asCharSource(file, charset).copyTo(appendable);
    }

    @java.lang.Deprecated
    public static void append(java.lang.CharSequence charSequence, java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        asCharSink(file, charset, com.google.common.io.FileWriteMode.APPEND).write(charSequence);
    }

    public static boolean equal(java.io.File file, java.io.File file2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return asByteSource(file).contentEquals(asByteSource(file2));
        }
        return false;
    }

    @java.lang.Deprecated
    public static java.io.File createTempDir() {
        return com.google.common.io.TempFileCreator.INSTANCE.createTempDir();
    }

    public static void touch(java.io.File file) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        if (!file.createNewFile() && !file.setLastModified(java.lang.System.currentTimeMillis())) {
            throw new java.io.IOException("Unable to update modification time of ".concat(java.lang.String.valueOf(file)));
        }
    }

    public static void createParentDirs(java.io.File file) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new java.io.IOException("Unable to create parent directories of ".concat(java.lang.String.valueOf(file)));
            }
        }
    }

    public static void move(java.io.File file, java.io.File file2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(file2);
        com.google.common.base.Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        copy(file, file2);
        if (file.delete()) {
            return;
        }
        if (!file2.delete()) {
            throw new java.io.IOException("Unable to delete ".concat(java.lang.String.valueOf(file2)));
        }
        throw new java.io.IOException("Unable to delete ".concat(java.lang.String.valueOf(file)));
    }

    @java.lang.Deprecated
    public static java.lang.String readFirstLine(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return asCharSource(file, charset).readFirstLine();
    }

    public static java.util.List<java.lang.String> readLines(java.io.File file, java.nio.charset.Charset charset) throws java.io.IOException {
        return (java.util.List) asCharSource(file, charset).readLines(new com.google.common.io.LineProcessor<java.util.List<java.lang.String>>() { // from class: com.google.common.io.Files.1
            final java.util.List<java.lang.String> result = new java.util.ArrayList();

            @Override // com.google.common.io.LineProcessor
            public boolean processLine(java.lang.String str) {
                this.result.add(str);
                return true;
            }

            @Override // com.google.common.io.LineProcessor
            public java.util.List<java.lang.String> getResult() {
                return this.result;
            }
        });
    }

    @java.lang.Deprecated
    public static <T> T readLines(java.io.File file, java.nio.charset.Charset charset, com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        return (T) asCharSource(file, charset).readLines(lineProcessor);
    }

    @java.lang.Deprecated
    public static <T> T readBytes(java.io.File file, com.google.common.io.ByteProcessor<T> byteProcessor) throws java.io.IOException {
        return (T) asByteSource(file).read(byteProcessor);
    }

    @java.lang.Deprecated
    public static com.google.common.hash.HashCode hash(java.io.File file, com.google.common.hash.HashFunction hashFunction) throws java.io.IOException {
        return asByteSource(file).hash(hashFunction);
    }

    public static java.nio.MappedByteBuffer map(java.io.File file) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        return map(file, java.nio.channels.FileChannel.MapMode.READ_ONLY);
    }

    public static java.nio.MappedByteBuffer map(java.io.File file, java.nio.channels.FileChannel.MapMode mapMode) throws java.io.IOException {
        return mapInternal(file, mapMode, -1L);
    }

    public static java.nio.MappedByteBuffer map(java.io.File file, java.nio.channels.FileChannel.MapMode mapMode, long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(j >= 0, "size (%s) may not be negative", j);
        return mapInternal(file, mapMode, j);
    }

    private static java.nio.MappedByteBuffer mapInternal(java.io.File file, java.nio.channels.FileChannel.MapMode mapMode, long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(file);
        com.google.common.base.Preconditions.checkNotNull(mapMode);
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            java.nio.channels.FileChannel fileChannel = (java.nio.channels.FileChannel) create.register(((java.io.RandomAccessFile) create.register(new java.io.RandomAccessFile(file, mapMode == java.nio.channels.FileChannel.MapMode.READ_ONLY ? "r" : "rw"))).getChannel());
            if (j == -1) {
                j = fileChannel.size();
            }
            return fileChannel.map(mapMode, 0L, j);
        } finally {
        }
    }

    public static java.lang.String simplifyPath(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            return ".";
        }
        java.lang.Iterable<java.lang.String> split = com.google.common.base.Splitter.on(kotlinx.io.files.FileSystemKt.UnixPathSeparator).omitEmptyStrings().split(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : split) {
            str2.hashCode();
            if (!str2.equals(".")) {
                if (str2.equals("..")) {
                    if (arrayList.size() > 0 && !((java.lang.String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                        arrayList.remove(arrayList.size() - 1);
                    } else {
                        arrayList.add("..");
                    }
                } else {
                    arrayList.add(str2);
                }
            }
        }
        java.lang.String join = com.google.common.base.Joiner.on(kotlinx.io.files.FileSystemKt.UnixPathSeparator).join(arrayList);
        if (str.charAt(0) == '/') {
            join = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR.concat(java.lang.String.valueOf(join));
        }
        while (join.startsWith("/../")) {
            join = join.substring(3);
        }
        return join.equals("/..") ? androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR : join.isEmpty() ? "." : join;
    }

    public static java.lang.String getFileExtension(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        java.lang.String name2 = new java.io.File(str).getName();
        int lastIndexOf = name2.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name2.substring(lastIndexOf + 1);
    }

    public static java.lang.String getNameWithoutExtension(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        java.lang.String name2 = new java.io.File(str).getName();
        int lastIndexOf = name2.lastIndexOf(46);
        return lastIndexOf == -1 ? name2 : name2.substring(0, lastIndexOf);
    }

    public static com.google.common.graph.Traverser<java.io.File> fileTraverser() {
        return com.google.common.graph.Traverser.forTree(FILE_TREE);
    }

    static /* synthetic */ java.lang.Iterable lambda$static$0(java.io.File file) {
        java.io.File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            return java.util.Collections.unmodifiableList(java.util.Arrays.asList(listFiles));
        }
        return com.google.common.collect.ImmutableList.of();
    }

    public static com.google.common.base.Predicate<java.io.File> isDirectory() {
        return com.google.common.io.Files.FilePredicate.IS_DIRECTORY;
    }

    public static com.google.common.base.Predicate<java.io.File> isFile() {
        return com.google.common.io.Files.FilePredicate.IS_FILE;
    }
}
