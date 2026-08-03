package kotlinx.io.files;

/* compiled from: FileSystemJvm.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e*\n\u0010\n\"\u00020\u000b2\u00020\u000b¨\u0006\u000f"}, d2 = {"mover", "Lkotlinx/io/files/Mover;", "getMover", "()Lkotlinx/io/files/Mover;", "mover$delegate", "Lkotlin/Lazy;", "SystemFileSystem", "Lkotlinx/io/files/FileSystem;", "SystemTemporaryDirectory", "Lkotlinx/io/files/Path;", "FileNotFoundException", "Ljava/io/FileNotFoundException;", "isWindows", "", "()Z", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileSystemJvmKt {
    public static final kotlinx.io.files.Path SystemTemporaryDirectory;
    private static final boolean isWindows;
    private static final kotlin.Lazy mover$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.io.files.FileSystemJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.io.files.Mover mover_delegate$lambda$0;
            mover_delegate$lambda$0 = kotlinx.io.files.FileSystemJvmKt.mover_delegate$lambda$0();
            return mover_delegate$lambda$0;
        }
    });
    public static final kotlinx.io.files.FileSystem SystemFileSystem = new kotlinx.io.files.SystemFileSystemImpl() { // from class: kotlinx.io.files.FileSystemJvmKt$SystemFileSystem$1
        @Override // kotlinx.io.files.FileSystem
        public boolean exists(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            return path.getFile().exists();
        }

        @Override // kotlinx.io.files.FileSystem
        public void delete(kotlinx.io.files.Path path, boolean mustExist) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            if (exists(path)) {
                if (!path.getFile().delete()) {
                    throw new java.io.IOException("Deletion failed");
                }
            } else if (mustExist) {
                throw new java.io.FileNotFoundException("File does not exist: " + path.getFile());
            }
        }

        @Override // kotlinx.io.files.FileSystem
        public void createDirectories(kotlinx.io.files.Path path, boolean mustCreate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            if (path.getFile().mkdirs()) {
                return;
            }
            if (mustCreate) {
                throw new java.io.IOException("Path already exist: " + path);
            }
            if (path.getFile().isFile()) {
                throw new java.io.IOException("Path already exists and it's a file: " + path);
            }
        }

        @Override // kotlinx.io.files.FileSystem
        public void atomicMove(kotlinx.io.files.Path source, kotlinx.io.files.Path destination) {
            kotlinx.io.files.Mover mover;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
            mover = kotlinx.io.files.FileSystemJvmKt.getMover();
            mover.move(source, destination);
        }

        @Override // kotlinx.io.files.FileSystem
        public kotlinx.io.files.FileMetadata metadataOrNull(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            if (path.getFile().exists()) {
                return new kotlinx.io.files.FileMetadata(path.getFile().isFile(), path.getFile().isDirectory(), path.getFile().isFile() ? path.getFile().length() : -1L);
            }
            return null;
        }

        @Override // kotlinx.io.files.FileSystem
        public kotlinx.io.RawSource source(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            return kotlinx.io.JvmCoreKt.asSource(new java.io.FileInputStream(path.getFile()));
        }

        @Override // kotlinx.io.files.FileSystem
        public kotlinx.io.RawSink sink(kotlinx.io.files.Path path, boolean append) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            return kotlinx.io.JvmCoreKt.asSink(new java.io.FileOutputStream(path.getFile(), append));
        }

        @Override // kotlinx.io.files.FileSystem
        public kotlinx.io.files.Path resolve(kotlinx.io.files.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            if (!path.getFile().exists()) {
                throw new java.io.FileNotFoundException(path.getFile().getAbsolutePath());
            }
            java.io.File canonicalFile = path.getFile().getCanonicalFile();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalFile, "getCanonicalFile(...)");
            return new kotlinx.io.files.Path(canonicalFile);
        }

        @Override // kotlinx.io.files.FileSystem
        public java.util.Collection<kotlinx.io.files.Path> list(kotlinx.io.files.Path directory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
            java.io.File file = directory.getFile();
            if (!file.exists()) {
                throw new java.io.FileNotFoundException(file.getAbsolutePath());
            }
            if (!file.isDirectory()) {
                throw new java.io.IOException("Not a directory: " + file.getAbsolutePath());
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
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SystemTemporaryDirectory = kotlinx.io.files.PathsJvmKt.Path(property);
        java.lang.String property2 = java.lang.System.getProperty("os.name");
        isWindows = property2 != null ? kotlin.text.StringsKt.startsWith$default(property2, "Windows", false, 2, (java.lang.Object) null) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.io.files.Mover getMover() {
        return (kotlinx.io.files.Mover) mover$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.io.files.Mover mover_delegate$lambda$0() {
        try {
            java.lang.Class.forName("java.nio.file.Files");
            return new kotlinx.io.files.NioMover();
        } catch (java.lang.ClassNotFoundException unused) {
            return new kotlinx.io.files.Mover() { // from class: kotlinx.io.files.FileSystemJvmKt$mover$2$1
                @Override // kotlinx.io.files.Mover
                public void move(kotlinx.io.files.Path source, kotlinx.io.files.Path destination) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
                    throw new java.lang.UnsupportedOperationException("Atomic move not supported");
                }
            };
        }
    }

    public static final boolean isWindows() {
        return isWindows;
    }
}
