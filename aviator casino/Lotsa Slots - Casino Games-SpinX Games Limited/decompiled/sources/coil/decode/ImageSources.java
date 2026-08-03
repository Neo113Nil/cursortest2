package coil.decode;

/* compiled from: ImageSource.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\n\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\n\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\n\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\b\n¨\u0006\u0013"}, d2 = {"ImageSource", "Lcoil/decode/ImageSource;", "file", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "diskCacheKey", "", "closeable", "Ljava/io/Closeable;", "create", "metadata", "Lcoil/decode/ImageSource$Metadata;", "source", "Lokio/BufferedSource;", "context", "Landroid/content/Context;", "cacheDirectory", "Ljava/io/File;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageSources {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.io.File ImageSource$lambda$2(java.io.File file) {
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.io.File ImageSource$lambda$3(java.io.File file) {
        return file;
    }

    public static /* synthetic */ coil.decode.ImageSource create$default(okio.Path path, okio.FileSystem fileSystem, java.lang.String str, java.io.Closeable closeable, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            fileSystem = okio.FileSystem.SYSTEM;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return create(path, fileSystem, str, closeable);
    }

    public static final coil.decode.ImageSource create(okio.Path path, okio.FileSystem fileSystem, java.lang.String str, java.io.Closeable closeable) {
        return new coil.decode.FileImageSource(path, fileSystem, str, closeable, null);
    }

    public static /* synthetic */ coil.decode.ImageSource create$default(okio.Path path, okio.FileSystem fileSystem, java.lang.String str, java.io.Closeable closeable, coil.decode.ImageSource.Metadata metadata, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            fileSystem = okio.FileSystem.SYSTEM;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        if ((i & 16) != 0) {
            metadata = null;
        }
        return create(path, fileSystem, str, closeable, metadata);
    }

    public static final coil.decode.ImageSource create(okio.Path path, okio.FileSystem fileSystem, java.lang.String str, java.io.Closeable closeable, coil.decode.ImageSource.Metadata metadata) {
        return new coil.decode.FileImageSource(path, fileSystem, str, closeable, metadata);
    }

    public static final coil.decode.ImageSource create(okio.BufferedSource bufferedSource, final android.content.Context context) {
        return new coil.decode.SourceImageSource(bufferedSource, new kotlin.jvm.functions.Function0() { // from class: coil.decode.ImageSources$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.File safeCacheDir;
                safeCacheDir = coil.util.Utils.getSafeCacheDir(context);
                return safeCacheDir;
            }
        }, null);
    }

    public static /* synthetic */ coil.decode.ImageSource create$default(okio.BufferedSource bufferedSource, android.content.Context context, coil.decode.ImageSource.Metadata metadata, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            metadata = null;
        }
        return create(bufferedSource, context, metadata);
    }

    public static final coil.decode.ImageSource create(okio.BufferedSource bufferedSource, final android.content.Context context, coil.decode.ImageSource.Metadata metadata) {
        return new coil.decode.SourceImageSource(bufferedSource, new kotlin.jvm.functions.Function0() { // from class: coil.decode.ImageSources$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.File safeCacheDir;
                safeCacheDir = coil.util.Utils.getSafeCacheDir(context);
                return safeCacheDir;
            }
        }, metadata);
    }

    public static final coil.decode.ImageSource create(okio.BufferedSource bufferedSource, final java.io.File file) {
        return new coil.decode.SourceImageSource(bufferedSource, new kotlin.jvm.functions.Function0() { // from class: coil.decode.ImageSources$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.File ImageSource$lambda$2;
                ImageSource$lambda$2 = coil.decode.ImageSources.ImageSource$lambda$2(file);
                return ImageSource$lambda$2;
            }
        }, null);
    }

    public static /* synthetic */ coil.decode.ImageSource create$default(okio.BufferedSource bufferedSource, java.io.File file, coil.decode.ImageSource.Metadata metadata, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            metadata = null;
        }
        return create(bufferedSource, file, metadata);
    }

    public static final coil.decode.ImageSource create(okio.BufferedSource bufferedSource, final java.io.File file, coil.decode.ImageSource.Metadata metadata) {
        return new coil.decode.SourceImageSource(bufferedSource, new kotlin.jvm.functions.Function0() { // from class: coil.decode.ImageSources$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.File ImageSource$lambda$3;
                ImageSource$lambda$3 = coil.decode.ImageSources.ImageSource$lambda$3(file);
                return ImageSource$lambda$3;
            }
        }, metadata);
    }
}
