package com.google.common.io;

/* loaded from: classes9.dex */
public final class MoreFiles {
    private MoreFiles() {
    }

    public static com.google.common.io.ByteSource asByteSource(java.nio.file.Path path, java.nio.file.OpenOption... openOptionArr) {
        return new com.google.common.io.MoreFiles.PathByteSource(path, openOptionArr);
    }

    static final class PathByteSource extends com.google.common.io.ByteSource {
        private static final java.nio.file.LinkOption[] FOLLOW_LINKS = new java.nio.file.LinkOption[0];
        private final boolean followLinks;
        private final java.nio.file.OpenOption[] options;
        private final java.nio.file.Path path;

        private PathByteSource(java.nio.file.Path path, java.nio.file.OpenOption... openOptionArr) {
            this.path = (java.nio.file.Path) com.google.common.base.Preconditions.checkNotNull(path);
            java.nio.file.OpenOption[] openOptionArr2 = (java.nio.file.OpenOption[]) openOptionArr.clone();
            this.options = openOptionArr2;
            this.followLinks = followLinks(openOptionArr2);
        }

        private static boolean followLinks(java.nio.file.OpenOption[] openOptionArr) {
            for (java.nio.file.OpenOption openOption : openOptionArr) {
                if (openOption == java.nio.file.LinkOption.NOFOLLOW_LINKS) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.InputStream openStream() throws java.io.IOException {
            return java.nio.file.Files.newInputStream(this.path, this.options);
        }

        private java.nio.file.attribute.BasicFileAttributes readAttributes() throws java.io.IOException {
            return java.nio.file.Files.readAttributes(this.path, java.nio.file.attribute.BasicFileAttributes.class, this.followLinks ? FOLLOW_LINKS : new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS});
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            try {
                java.nio.file.attribute.BasicFileAttributes readAttributes = readAttributes();
                if (readAttributes.isDirectory() || readAttributes.isSymbolicLink()) {
                    return com.google.common.base.Optional.absent();
                }
                return com.google.common.base.Optional.of(java.lang.Long.valueOf(readAttributes.size()));
            } catch (java.io.IOException unused) {
                return com.google.common.base.Optional.absent();
            }
        }

        @Override // com.google.common.io.ByteSource
        public final long size() throws java.io.IOException {
            java.nio.file.attribute.BasicFileAttributes readAttributes = readAttributes();
            if (readAttributes.isDirectory()) {
                throw new java.io.IOException("can't read: is a directory");
            }
            if (readAttributes.isSymbolicLink()) {
                throw new java.io.IOException("can't read: is a symbolic link");
            }
            return readAttributes.size();
        }

        @Override // com.google.common.io.ByteSource
        public final byte[] read() throws java.io.IOException {
            java.nio.channels.SeekableByteChannel newByteChannel = java.nio.file.Files.newByteChannel(this.path, this.options);
            try {
                byte[] byteArray = com.google.common.io.ByteStreams.toByteArray(java.nio.channels.Channels.newInputStream(newByteChannel), newByteChannel.size());
                if (newByteChannel != null) {
                    newByteChannel.close();
                }
                return byteArray;
            } catch (java.lang.Throwable th) {
                if (newByteChannel != null) {
                    try {
                        newByteChannel.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            if (this.options.length == 0) {
                return new com.google.common.io.ByteSource.AsCharSource(charset) { // from class: com.google.common.io.MoreFiles.PathByteSource.1
                    @Override // com.google.common.io.CharSource
                    public java.util.stream.Stream<java.lang.String> lines() throws java.io.IOException {
                        return java.nio.file.Files.lines(com.google.common.io.MoreFiles.PathByteSource.this.path, this.charset);
                    }
                };
            }
            return super.asCharSource(charset);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoreFiles.asByteSource(");
            sb.append(this.path);
            sb.append(", ");
            sb.append(java.util.Arrays.toString(this.options));
            sb.append(")");
            return sb.toString();
        }
    }

    public static com.google.common.io.ByteSink asByteSink(java.nio.file.Path path, java.nio.file.OpenOption... openOptionArr) {
        return new com.google.common.io.MoreFiles.PathByteSink(path, openOptionArr);
    }

    static final class PathByteSink extends com.google.common.io.ByteSink {
        private final java.nio.file.OpenOption[] options;
        private final java.nio.file.Path path;

        private PathByteSink(java.nio.file.Path path, java.nio.file.OpenOption... openOptionArr) {
            this.path = (java.nio.file.Path) com.google.common.base.Preconditions.checkNotNull(path);
            this.options = (java.nio.file.OpenOption[]) openOptionArr.clone();
        }

        @Override // com.google.common.io.ByteSink
        public final java.io.OutputStream openStream() throws java.io.IOException {
            return java.nio.file.Files.newOutputStream(this.path, this.options);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoreFiles.asByteSink(");
            sb.append(this.path);
            sb.append(", ");
            sb.append(java.util.Arrays.toString(this.options));
            sb.append(")");
            return sb.toString();
        }
    }

    public static com.google.common.io.CharSource asCharSource(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption... openOptionArr) {
        return asByteSource(path, openOptionArr).asCharSource(charset);
    }

    public static com.google.common.io.CharSink asCharSink(java.nio.file.Path path, java.nio.charset.Charset charset, java.nio.file.OpenOption... openOptionArr) {
        return asByteSink(path, openOptionArr).asCharSink(charset);
    }

    public static com.google.common.collect.ImmutableList<java.nio.file.Path> listFiles(java.nio.file.Path path) throws java.io.IOException {
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream = java.nio.file.Files.newDirectoryStream(path);
            try {
                com.google.common.collect.ImmutableList<java.nio.file.Path> copyOf = com.google.common.collect.ImmutableList.copyOf(newDirectoryStream);
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
                return copyOf;
            } finally {
            }
        } catch (java.nio.file.DirectoryIteratorException e) {
            throw e.getCause();
        }
    }

    public static com.google.common.graph.Traverser<java.nio.file.Path> fileTraverser() {
        return com.google.common.graph.Traverser.forTree(new com.google.common.graph.SuccessorsFunction() { // from class: com.google.common.io.MoreFiles$$ExternalSyntheticLambda0
            @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
            public final java.lang.Iterable successors(java.lang.Object obj) {
                java.lang.Iterable fileTreeChildren;
                fileTreeChildren = com.google.common.io.MoreFiles.fileTreeChildren((java.nio.file.Path) obj);
                return fileTreeChildren;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Iterable<java.nio.file.Path> fileTreeChildren(java.nio.file.Path path) {
        if (java.nio.file.Files.isDirectory(path, java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
            try {
                return listFiles(path);
            } catch (java.io.IOException e) {
                throw new java.nio.file.DirectoryIteratorException(e);
            }
        }
        return com.google.common.collect.ImmutableList.of();
    }

    public static com.google.common.base.Predicate<java.nio.file.Path> isDirectory(java.nio.file.LinkOption... linkOptionArr) {
        final java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) linkOptionArr.clone();
        return new com.google.common.base.Predicate<java.nio.file.Path>() { // from class: com.google.common.io.MoreFiles.1
            @Override // com.google.common.base.Predicate
            public boolean apply(java.nio.file.Path path) {
                return java.nio.file.Files.isDirectory(path, linkOptionArr2);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MoreFiles.isDirectory(");
                sb.append(java.util.Arrays.toString(linkOptionArr2));
                sb.append(")");
                return sb.toString();
            }
        };
    }

    private static boolean isDirectory(java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        return ((java.nio.file.attribute.BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, java.nio.file.attribute.BasicFileAttributeView.class, linkOptionArr)).readAttributes().isDirectory();
    }

    public static com.google.common.base.Predicate<java.nio.file.Path> isRegularFile(java.nio.file.LinkOption... linkOptionArr) {
        final java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) linkOptionArr.clone();
        return new com.google.common.base.Predicate<java.nio.file.Path>() { // from class: com.google.common.io.MoreFiles.2
            @Override // com.google.common.base.Predicate
            public boolean apply(java.nio.file.Path path) {
                return java.nio.file.Files.isRegularFile(path, linkOptionArr2);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MoreFiles.isRegularFile(");
                sb.append(java.util.Arrays.toString(linkOptionArr2));
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public static boolean equal(java.nio.file.Path path, java.nio.file.Path path2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(path);
        com.google.common.base.Preconditions.checkNotNull(path2);
        if (java.nio.file.Files.isSameFile(path, path2)) {
            return true;
        }
        com.google.common.io.ByteSource asByteSource = asByteSource(path, new java.nio.file.OpenOption[0]);
        com.google.common.io.ByteSource asByteSource2 = asByteSource(path2, new java.nio.file.OpenOption[0]);
        long longValue = asByteSource.sizeIfKnown().or((com.google.common.base.Optional<java.lang.Long>) 0L).longValue();
        long longValue2 = asByteSource2.sizeIfKnown().or((com.google.common.base.Optional<java.lang.Long>) 0L).longValue();
        if (longValue == 0 || longValue2 == 0 || longValue == longValue2) {
            return asByteSource.contentEquals(asByteSource2);
        }
        return false;
    }

    public static void touch(java.nio.file.Path path) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(path);
        try {
            java.nio.file.Files.setLastModifiedTime(path, java.nio.file.attribute.FileTime.fromMillis(java.lang.System.currentTimeMillis()));
        } catch (java.nio.file.NoSuchFileException unused) {
            try {
                java.nio.file.Files.createFile(path, new java.nio.file.attribute.FileAttribute[0]);
            } catch (java.nio.file.FileAlreadyExistsException unused2) {
            }
        }
    }

    public static void createParentDirectories(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path parent = path.toAbsolutePath().normalize().getParent();
        if (parent == null || java.nio.file.Files.isDirectory(parent, new java.nio.file.LinkOption[0])) {
            return;
        }
        java.nio.file.Files.createDirectories(parent, fileAttributeArr);
        if (!java.nio.file.Files.isDirectory(parent, new java.nio.file.LinkOption[0])) {
            throw new java.io.IOException("Unable to create parent directories of ".concat(java.lang.String.valueOf(path)));
        }
    }

    public static java.lang.String getFileExtension(java.nio.file.Path path) {
        java.lang.String obj;
        int lastIndexOf;
        java.nio.file.Path fileName = path.getFileName();
        if (fileName == null || (lastIndexOf = (obj = fileName.toString()).lastIndexOf(46)) == -1) {
            return "";
        }
        return obj.substring(lastIndexOf + 1);
    }

    public static java.lang.String getNameWithoutExtension(java.nio.file.Path path) {
        java.nio.file.Path fileName = path.getFileName();
        if (fileName == null) {
            return "";
        }
        java.lang.String obj = fileName.toString();
        int lastIndexOf = obj.lastIndexOf(46);
        return lastIndexOf == -1 ? obj : obj.substring(0, lastIndexOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void deleteRecursively(java.nio.file.Path path, com.google.common.io.RecursiveDeleteOption... recursiveDeleteOptionArr) throws java.io.IOException {
        java.util.Collection<java.io.IOException> collection;
        boolean z;
        java.nio.file.Path parentPath = getParentPath(path);
        java.util.Collection<java.io.IOException> collection2 = null;
        if (parentPath == null) {
            throw new java.nio.file.FileSystemException(path.toString(), null, "can't delete recursively");
        }
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream = java.nio.file.Files.newDirectoryStream(parentPath);
            if (newDirectoryStream instanceof java.nio.file.SecureDirectoryStream) {
                try {
                    collection = deleteRecursivelySecure((java.nio.file.SecureDirectoryStream) newDirectoryStream, (java.nio.file.Path) java.util.Objects.requireNonNull(path.getFileName()));
                    z = true;
                } finally {
                }
            } else {
                z = false;
                collection = null;
            }
            if (newDirectoryStream != null) {
                try {
                    newDirectoryStream.close();
                } catch (java.io.IOException e) {
                    e = e;
                    collection2 = collection;
                    if (collection2 != null) {
                        throw e;
                    }
                    collection2.add(e);
                    collection = collection2;
                    if (collection == null) {
                    }
                }
            }
            if (!z) {
                checkAllowsInsecure(path, recursiveDeleteOptionArr);
                collection = deleteRecursivelyInsecure(path);
            }
        } catch (java.io.IOException e2) {
            e = e2;
            if (collection2 != null) {
            }
        }
        if (collection == null) {
            throwDeleteFailed(path, collection);
        }
    }

    public static void deleteDirectoryContents(java.nio.file.Path path, com.google.common.io.RecursiveDeleteOption... recursiveDeleteOptionArr) throws java.io.IOException {
        java.util.Collection<java.io.IOException> deleteDirectoryContentsInsecure;
        java.util.Collection<java.io.IOException> collection = null;
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream = java.nio.file.Files.newDirectoryStream(path);
            try {
                if (newDirectoryStream instanceof java.nio.file.SecureDirectoryStream) {
                    deleteDirectoryContentsInsecure = deleteDirectoryContentsSecure((java.nio.file.SecureDirectoryStream) newDirectoryStream);
                } else {
                    checkAllowsInsecure(path, recursiveDeleteOptionArr);
                    deleteDirectoryContentsInsecure = deleteDirectoryContentsInsecure(newDirectoryStream);
                }
                collection = deleteDirectoryContentsInsecure;
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            if (collection == null) {
                throw e;
            }
            collection.add(e);
        }
        if (collection != null) {
            throwDeleteFailed(path, collection);
        }
    }

    private static java.util.Collection<java.io.IOException> deleteRecursivelySecure(java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path) {
        java.util.Collection<java.io.IOException> collection = null;
        try {
            if (isDirectory(secureDirectoryStream, path, java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
                java.nio.file.SecureDirectoryStream<java.nio.file.Path> newDirectoryStream = secureDirectoryStream.newDirectoryStream(path, java.nio.file.LinkOption.NOFOLLOW_LINKS);
                try {
                    collection = deleteDirectoryContentsSecure(newDirectoryStream);
                    if (newDirectoryStream != null) {
                        newDirectoryStream.close();
                    }
                    if (collection == null) {
                        secureDirectoryStream.deleteDirectory(path);
                    }
                    return collection;
                } finally {
                }
            }
            secureDirectoryStream.deleteFile(path);
            return null;
        } catch (java.io.IOException e) {
            return addException(collection, e);
        }
    }

    private static java.util.Collection<java.io.IOException> deleteDirectoryContentsSecure(java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream) {
        java.util.Collection<java.io.IOException> collection = null;
        try {
            java.util.Iterator<java.nio.file.Path> it = secureDirectoryStream.iterator();
            while (it.hasNext()) {
                collection = concat(collection, deleteRecursivelySecure(secureDirectoryStream, it.next().getFileName()));
            }
            return collection;
        } catch (java.nio.file.DirectoryIteratorException e) {
            return addException(collection, e.getCause());
        }
    }

    private static java.util.Collection<java.io.IOException> deleteRecursivelyInsecure(java.nio.file.Path path) {
        java.util.Collection<java.io.IOException> collection = null;
        try {
            if (java.nio.file.Files.isDirectory(path, java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
                java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream = java.nio.file.Files.newDirectoryStream(path);
                try {
                    collection = deleteDirectoryContentsInsecure(newDirectoryStream);
                    if (newDirectoryStream != null) {
                        newDirectoryStream.close();
                    }
                } finally {
                }
            }
            if (collection == null) {
                java.nio.file.Files.delete(path);
            }
            return collection;
        } catch (java.io.IOException e) {
            return addException(collection, e);
        }
    }

    private static java.util.Collection<java.io.IOException> deleteDirectoryContentsInsecure(java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream) {
        java.util.Collection<java.io.IOException> collection = null;
        try {
            java.util.Iterator<java.nio.file.Path> it = directoryStream.iterator();
            while (it.hasNext()) {
                collection = concat(collection, deleteRecursivelyInsecure(it.next()));
            }
            return collection;
        } catch (java.nio.file.DirectoryIteratorException e) {
            return addException(collection, e.getCause());
        }
    }

    private static java.nio.file.Path getParentPath(java.nio.file.Path path) {
        java.nio.file.Path parent = path.getParent();
        if (parent != null) {
            return parent;
        }
        if (path.getNameCount() == 0) {
            return null;
        }
        return path.getFileSystem().getPath(".", new java.lang.String[0]);
    }

    private static void checkAllowsInsecure(java.nio.file.Path path, com.google.common.io.RecursiveDeleteOption[] recursiveDeleteOptionArr) throws com.google.common.io.InsecureRecursiveDeleteException {
        if (!java.util.Arrays.asList(recursiveDeleteOptionArr).contains(com.google.common.io.RecursiveDeleteOption.ALLOW_INSECURE)) {
            throw new com.google.common.io.InsecureRecursiveDeleteException(path.toString());
        }
    }

    private static java.util.Collection<java.io.IOException> addException(java.util.Collection<java.io.IOException> collection, java.io.IOException iOException) {
        if (collection == null) {
            collection = new java.util.ArrayList<>();
        }
        collection.add(iOException);
        return collection;
    }

    private static java.util.Collection<java.io.IOException> concat(java.util.Collection<java.io.IOException> collection, java.util.Collection<java.io.IOException> collection2) {
        if (collection == null) {
            return collection2;
        }
        if (collection2 != null) {
            collection.addAll(collection2);
        }
        return collection;
    }

    private static void throwDeleteFailed(java.nio.file.Path path, java.util.Collection<java.io.IOException> collection) throws java.nio.file.FileSystemException {
        java.nio.file.NoSuchFileException pathNotFound = pathNotFound(path, collection);
        if (pathNotFound != null) {
            throw pathNotFound;
        }
        java.nio.file.FileSystemException fileSystemException = new java.nio.file.FileSystemException(path.toString(), null, "failed to delete one or more files; see suppressed exceptions for details");
        java.util.Iterator<java.io.IOException> it = collection.iterator();
        while (it.hasNext()) {
            fileSystemException.addSuppressed(it.next());
        }
        throw fileSystemException;
    }

    private static java.nio.file.NoSuchFileException pathNotFound(java.nio.file.Path path, java.util.Collection<java.io.IOException> collection) {
        java.nio.file.NoSuchFileException noSuchFileException;
        java.lang.String file;
        java.nio.file.Path parentPath;
        if (collection.size() != 1) {
            return null;
        }
        java.io.IOException iOException = (java.io.IOException) com.google.common.collect.Iterables.getOnlyElement(collection);
        if ((iOException instanceof java.nio.file.NoSuchFileException) && (file = (noSuchFileException = (java.nio.file.NoSuchFileException) iOException).getFile()) != null && (parentPath = getParentPath(path)) != null && file.equals(parentPath.resolve((java.nio.file.Path) java.util.Objects.requireNonNull(path.getFileName())).toString())) {
            return noSuchFileException;
        }
        return null;
    }
}
