package okio;

/* compiled from: NioFileSystemWrappingFileSystem.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\f\u0010#\u001a\u00020$*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "nioFileSystem", "Ljava/nio/file/FileSystem;", "(Ljava/nio/file/FileSystem;)V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "resolve", "Ljava/nio/file/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NioFileSystemWrappingFileSystem extends okio.NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem nioFileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.nioFileSystem = nioFileSystem;
    }

    private final java.nio.file.Path resolve(okio.Path path) {
        java.nio.file.Path path2 = this.nioFileSystem.getPath(path.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        return path2;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Path canonicalize(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        try {
            okio.Path.Companion companion = okio.Path.INSTANCE;
            java.nio.file.Path realPath = resolve(path).toRealPath(new java.nio.file.LinkOption[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return okio.Path.Companion.get$default(companion, realPath, false, 1, (java.lang.Object) null);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return metadataOrNull(resolve(path));
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.util.List<okio.Path> list = list(dir, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    private final java.util.List<okio.Path> list(okio.Path dir, boolean throwOnFailure) {
        java.nio.file.Path resolve = resolve(dir);
        try {
            java.util.List listDirectoryEntries$default = kotlin.io.path.PathsKt.listDirectoryEntries$default(resolve, null, 1, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = listDirectoryEntries$default.iterator();
            while (it.hasNext()) {
                arrayList.add(okio.Path.Companion.get$default(okio.Path.INSTANCE, (java.nio.file.Path) it.next(), false, 1, (java.lang.Object) null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            kotlin.collections.CollectionsKt.sort(arrayList2);
            return arrayList2;
        } catch (java.lang.Exception unused) {
            if (!throwOnFailure) {
                return null;
            }
            if (java.nio.file.Files.exists(resolve, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0))) {
                throw new java.io.IOException("failed to list " + dir);
            }
            throw new java.io.FileNotFoundException("no such file: " + dir);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        try {
            java.nio.channels.FileChannel open = java.nio.channels.FileChannel.open(resolve(file), java.nio.file.StandardOpenOption.READ);
            kotlin.jvm.internal.Intrinsics.checkNotNull(open);
            return new okio.NioFileSystemFileHandle(false, open);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate && mustExist) {
            throw new java.lang.IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(java.nio.file.StandardOpenOption.READ);
        createListBuilder.add(java.nio.file.StandardOpenOption.WRITE);
        if (mustCreate) {
            createListBuilder.add(java.nio.file.StandardOpenOption.CREATE_NEW);
        } else if (!mustExist) {
            createListBuilder.add(java.nio.file.StandardOpenOption.CREATE);
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        try {
            java.nio.file.Path resolve = resolve(file);
            java.nio.file.StandardOpenOption[] standardOpenOptionArr = (java.nio.file.StandardOpenOption[]) build.toArray(new java.nio.file.StandardOpenOption[0]);
            java.nio.channels.FileChannel open = java.nio.channels.FileChannel.open(resolve, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            kotlin.jvm.internal.Intrinsics.checkNotNull(open);
            return new okio.NioFileSystemFileHandle(true, open);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Source source(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        try {
            java.io.InputStream newInputStream = java.nio.file.Files.newInputStream(resolve(file), (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(new java.nio.file.OpenOption[0], 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInputStream, "newInputStream(...)");
            return okio.Okio.source(newInputStream);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink sink(okio.Path file, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (mustCreate) {
            createListBuilder.add(java.nio.file.StandardOpenOption.CREATE_NEW);
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        try {
            java.nio.file.Path resolve = resolve(file);
            java.nio.file.StandardOpenOption[] standardOpenOptionArr = (java.nio.file.StandardOpenOption[]) build.toArray(new java.nio.file.StandardOpenOption[0]);
            java.nio.file.OpenOption[] openOptionArr = (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(resolve, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
            return okio.Okio.sink(newOutputStream);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink appendingSink(okio.Path file, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(java.nio.file.StandardOpenOption.APPEND);
        if (!mustExist) {
            createListBuilder.add(java.nio.file.StandardOpenOption.CREATE);
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        java.nio.file.Path resolve = resolve(file);
        java.nio.file.StandardOpenOption[] standardOpenOptionArr = (java.nio.file.StandardOpenOption[]) build.toArray(new java.nio.file.StandardOpenOption[0]);
        java.nio.file.OpenOption[] openOptionArr = (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(resolve, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(...)");
        return okio.Okio.sink(newOutputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.getIsDirectory() == true) goto L8;
     */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createDirectory(okio.Path dir, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        okio.FileMetadata metadataOrNull = metadataOrNull(dir);
        boolean z = metadataOrNull != null;
        if (z && mustCreate) {
            throw new java.io.IOException(dir + " already exists.");
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.createDirectory(resolve(dir), (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(new java.nio.file.attribute.FileAttribute[0], 0)), "createDirectory(...)");
        } catch (java.io.IOException e) {
            if (z) {
                return;
            }
            throw new java.io.IOException("failed to create directory: " + dir, e);
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.move(resolve(source), resolve(target), (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e) {
            throw new java.io.FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void delete(okio.Path path, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        java.nio.file.Path resolve = resolve(path);
        try {
            java.nio.file.Files.delete(resolve);
        } catch (java.nio.file.NoSuchFileException unused) {
            if (mustExist) {
                throw new java.io.FileNotFoundException("no such file: " + path);
            }
        } catch (java.io.IOException unused2) {
            if (java.nio.file.Files.exists(resolve, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0))) {
                throw new java.io.IOException("failed to delete " + path);
            }
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.createSymbolicLink(resolve(source), resolve(target), (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(new java.nio.file.attribute.FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public java.lang.String toString() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.nioFileSystem.getClass()).getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}
