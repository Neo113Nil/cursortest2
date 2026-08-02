package okio;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010$J\u001f\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010(J\u001f\u0010-\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "Ljava/nio/file/FileSystem;", "nioFileSystem", "<init>", "(Ljava/nio/file/FileSystem;)V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Lokio/Path;Z)Ljava/util/List;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lokio/Path;Lokio/Path;)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "createSymlink", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/file/FileSystem;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NioFileSystemWrappingFileSystem extends okio.NioSystemFileSystem {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.nio.file.FileSystem getHighSpeedVideoFpsRanges;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        this.getHighSpeedVideoFpsRanges = fileSystem;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.Path canonicalize(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        try {
            okio.Path.Companion companion = okio.Path.INSTANCE;
            java.nio.file.Path path2 = this.getHighSpeedVideoFpsRanges.getPath(path.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
            java.nio.file.Path realPath = path2.toRealPath(new java.nio.file.LinkOption[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(realPath, "");
            return okio.Path.Companion.get$default(companion, realPath, false, 1, (java.lang.Object) null);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(path)));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final java.util.List<okio.Path> list(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        java.util.List<okio.Path> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(dir, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
        return highSpeedVideoFpsRangesFor;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        return getHighSpeedVideoFpsRangesFor(dir, false);
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
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
            java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(file.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            java.nio.file.StandardOpenOption[] standardOpenOptionArr = (java.nio.file.StandardOpenOption[]) build.toArray(new java.nio.file.StandardOpenOption[0]);
            java.nio.channels.FileChannel open = java.nio.channels.FileChannel.open(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            kotlin.jvm.internal.Intrinsics.checkNotNull(open);
            return new okio.NioFileSystemFileHandle(true, open);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(file)));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.Sink sink(okio.Path file, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (mustCreate) {
            createListBuilder.add(java.nio.file.StandardOpenOption.CREATE_NEW);
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        try {
            java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(file.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            java.nio.file.StandardOpenOption[] standardOpenOptionArr = (java.nio.file.StandardOpenOption[]) build.toArray(new java.nio.file.StandardOpenOption[0]);
            java.nio.file.OpenOption[] openOptionArr = (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newOutputStream, "");
            return okio.Okio.sink(newOutputStream);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(file)));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.Sink appendingSink(okio.Path file, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(java.nio.file.StandardOpenOption.APPEND);
        if (!mustExist) {
            createListBuilder.add(java.nio.file.StandardOpenOption.CREATE);
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(file.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        java.nio.file.StandardOpenOption[] standardOpenOptionArr = (java.nio.file.StandardOpenOption[]) build.toArray(new java.nio.file.StandardOpenOption[0]);
        java.nio.file.OpenOption[] openOptionArr = (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        java.io.OutputStream newOutputStream = java.nio.file.Files.newOutputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newOutputStream, "");
        return okio.Okio.sink(newOutputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1.getIsDirectory() != true) goto L6;
     */
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createDirectory(okio.Path dir, boolean mustCreate) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        okio.FileMetadata metadataOrNull = metadataOrNull(dir);
        if (metadataOrNull != null) {
            z = true;
        }
        z = false;
        if (z && mustCreate) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(dir);
            sb.append(" already exists.");
            throw new java.io.IOException(sb.toString());
        }
        try {
            java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(dir.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.createDirectory(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(new java.nio.file.attribute.FileAttribute[0], 0)), "");
        } catch (java.io.IOException e) {
            if (!z) {
                throw new java.io.IOException("failed to create directory: ".concat(java.lang.String.valueOf(dir)), e);
            }
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final void delete(okio.Path path, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        java.nio.file.Path path2 = this.getHighSpeedVideoFpsRanges.getPath(path.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
        try {
            java.nio.file.Files.delete(path2);
        } catch (java.nio.file.NoSuchFileException unused) {
            if (mustExist) {
                throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(path)));
            }
        } catch (java.io.IOException unused2) {
            if (java.nio.file.Files.exists(path2, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0))) {
                throw new java.io.IOException("failed to delete ".concat(java.lang.String.valueOf(path)));
            }
        }
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public final java.lang.String toString() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.getHighSpeedVideoFpsRanges.getClass()).getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }

    private final java.util.List<okio.Path> getHighSpeedVideoFpsRangesFor(okio.Path p0, boolean p1) {
        java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(p0.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        try {
            java.util.List listDirectoryEntries$default = kotlin.io.path.PathsKt.listDirectoryEntries$default(path, null, 1, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = listDirectoryEntries$default.iterator();
            while (it.hasNext()) {
                arrayList.add(okio.Path.Companion.get$default(okio.Path.INSTANCE, (java.nio.file.Path) it.next(), false, 1, (java.lang.Object) null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            kotlin.collections.CollectionsKt.sort(arrayList2);
            return arrayList2;
        } catch (java.lang.Exception unused) {
            if (!p1) {
                return null;
            }
            if (java.nio.file.Files.exists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0))) {
                throw new java.io.IOException("failed to list ".concat(java.lang.String.valueOf(p0)));
            }
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(p0)));
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final void atomicMove(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        try {
            java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(source.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            java.nio.file.Path path2 = this.getHighSpeedVideoFpsRanges.getPath(target.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.move(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING}, 2)), "");
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e) {
            throw new java.io.FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final void createSymlink(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(source.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        java.nio.file.Path path2 = this.getHighSpeedVideoFpsRanges.getPath(target.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.createSymbolicLink(path, path2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(new java.nio.file.attribute.FileAttribute[0], 0)), "");
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.FileMetadata metadataOrNull(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.nio.file.Path path2 = this.getHighSpeedVideoFpsRanges.getPath(path.toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
        return metadataOrNull(path2);
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.FileHandle openReadOnly(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        try {
            java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(file.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            java.nio.channels.FileChannel open = java.nio.channels.FileChannel.open(path, java.nio.file.StandardOpenOption.READ);
            kotlin.jvm.internal.Intrinsics.checkNotNull(open);
            return new okio.NioFileSystemFileHandle(false, open);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(file)));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final okio.Source source(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        try {
            java.nio.file.Path path = this.getHighSpeedVideoFpsRanges.getPath(file.toString(), new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            java.io.InputStream newInputStream = java.nio.file.Files.newInputStream(path, (java.nio.file.OpenOption[]) java.util.Arrays.copyOf(new java.nio.file.OpenOption[0], 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInputStream, "");
            return okio.Okio.source(newInputStream);
        } catch (java.nio.file.NoSuchFileException unused) {
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(file)));
        }
    }
}
