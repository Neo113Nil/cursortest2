package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\"\u0015\u0010\u0003\u001a\u00020\u00008CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r*\n\u0010\u0001\"\u00020\u000e2\u00020\u000e"}, d2 = {"Lkotlinx/io/files/Mover;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "Lkotlinx/io/files/FileSystem;", "SystemFileSystem", "Lkotlinx/io/files/FileSystem;", "Lkotlinx/io/files/Path;", "SystemTemporaryDirectory", "Lkotlinx/io/files/Path;", "", "isWindows", "Z", "()Z", "Ljava/io/FileNotFoundException;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileSystemJvmKt {
    public static final kotlinx.io.files.Path SystemTemporaryDirectory;
    private static final boolean isWindows;
    private static final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.io.files.FileSystemJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.io.files.Mover highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = kotlinx.io.files.FileSystemJvmKt.getHighSpeedVideoFpsRangesFor();
            return highSpeedVideoFpsRangesFor;
        }
    });
    public static final kotlinx.io.files.FileSystem SystemFileSystem = new kotlinx.io.files.SystemFileSystemImpl() { // from class: kotlinx.io.files.FileSystemJvmKt$SystemFileSystem$1
        @Override // kotlinx.io.files.FileSystem
        public final boolean exists(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            return path.getFile().exists();
        }

        @Override // kotlinx.io.files.FileSystem
        public final void delete(kotlinx.io.files.Path path, boolean mustExist) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            if (exists(path)) {
                if (!path.getFile().delete()) {
                    throw new java.io.IOException("Deletion failed");
                }
            } else if (mustExist) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("File does not exist: ");
                sb.append(path.getFile());
                throw new java.io.FileNotFoundException(sb.toString());
            }
        }

        @Override // kotlinx.io.files.FileSystem
        public final void createDirectories(kotlinx.io.files.Path path, boolean mustCreate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            if (path.getFile().mkdirs()) {
                return;
            }
            if (mustCreate) {
                throw new java.io.IOException("Path already exist: ".concat(java.lang.String.valueOf(path)));
            }
            if (path.getFile().isFile()) {
                throw new java.io.IOException("Path already exists and it's a file: ".concat(java.lang.String.valueOf(path)));
            }
        }

        @Override // kotlinx.io.files.FileSystem
        public final void atomicMove(kotlinx.io.files.Path source, kotlinx.io.files.Path destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            kotlinx.io.files.FileSystemJvmKt.access$getMover().move(source, destination);
        }

        @Override // kotlinx.io.files.FileSystem
        public final kotlinx.io.files.FileMetadata metadataOrNull(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            if (path.getFile().exists()) {
                return new kotlinx.io.files.FileMetadata(path.getFile().isFile(), path.getFile().isDirectory(), path.getFile().isFile() ? path.getFile().length() : -1L);
            }
            return null;
        }

        @Override // kotlinx.io.files.FileSystem
        public final kotlinx.io.RawSource source(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            return kotlinx.io.JvmCoreKt.asSource(new java.io.FileInputStream(path.getFile()));
        }

        @Override // kotlinx.io.files.FileSystem
        public final kotlinx.io.RawSink sink(kotlinx.io.files.Path path, boolean append) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            return kotlinx.io.JvmCoreKt.asSink(new java.io.FileOutputStream(path.getFile(), append));
        }

        @Override // kotlinx.io.files.FileSystem
        public final kotlinx.io.files.Path resolve(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            if (!path.getFile().exists()) {
                throw new java.io.FileNotFoundException(path.getFile().getAbsolutePath());
            }
            java.io.File canonicalFile = path.getFile().getCanonicalFile();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalFile, "");
            return new kotlinx.io.files.Path(canonicalFile);
        }

        @Override // kotlinx.io.files.FileSystem
        public final java.util.Collection<kotlinx.io.files.Path> list(kotlinx.io.files.Path directory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "");
            java.io.File file = directory.getFile();
            if (!file.exists()) {
                throw new java.io.FileNotFoundException(file.getAbsolutePath());
            }
            if (!file.isDirectory()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Not a directory: ");
                sb.append(file.getAbsolutePath());
                throw new java.io.IOException(sb.toString());
            }
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            java.lang.String[] list = file.list();
            if (list != null) {
                for (java.lang.String str : list) {
                    createListBuilder.add(kotlinx.io.files.PathsKt.Path(directory, str));
                }
            }
            return kotlin.collections.CollectionsKt.build(createListBuilder);
        }
    };

    static {
        java.lang.String property = java.lang.System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(property, "");
        SystemTemporaryDirectory = kotlinx.io.files.PathsJvmKt.Path(property);
        java.lang.String property2 = java.lang.System.getProperty("os.name");
        isWindows = property2 != null ? kotlin.text.StringsKt.startsWith$default(property2, "Windows", false, 2, (java.lang.Object) null) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.io.files.Mover getHighSpeedVideoFpsRangesFor() {
        try {
            java.lang.Class.forName("java.nio.file.Files");
            return new kotlinx.io.files.NioMover();
        } catch (java.lang.ClassNotFoundException unused) {
            return new kotlinx.io.files.Mover() { // from class: kotlinx.io.files.FileSystemJvmKt$mover$2$1
                @Override // kotlinx.io.files.Mover
                public final void move(kotlinx.io.files.Path source, kotlinx.io.files.Path destination) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                    throw new java.lang.UnsupportedOperationException("Atomic move not supported");
                }
            };
        }
    }

    public static final boolean isWindows() {
        return isWindows;
    }

    public static final /* synthetic */ kotlinx.io.files.Mover access$getMover() {
        return (kotlinx.io.files.Mover) getHighResolutionOutputSizeshNQ4ISI.getValue();
    }
}
