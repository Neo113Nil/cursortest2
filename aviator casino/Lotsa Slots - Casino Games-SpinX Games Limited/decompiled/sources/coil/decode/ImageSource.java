package coil.decode;

/* compiled from: ImageSource.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u0010\u001a\u00020\u0011H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcoil/decode/ImageSource;", "Ljava/io/Closeable;", "<init>", "()V", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "metadata", "Lcoil/decode/ImageSource$Metadata;", "getMetadata$annotations", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "source", "Lokio/BufferedSource;", "sourceOrNull", "file", "Lokio/Path;", "fileOrNull", "Metadata", "Lcoil/decode/FileImageSource;", "Lcoil/decode/SourceImageSource;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ImageSource implements java.io.Closeable {

    /* compiled from: ImageSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/decode/ImageSource$Metadata;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Metadata {
    }

    public /* synthetic */ ImageSource(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public abstract okio.Path file();

    public abstract okio.Path fileOrNull();

    public abstract okio.FileSystem getFileSystem();

    public abstract coil.decode.ImageSource.Metadata getMetadata();

    public abstract okio.BufferedSource source();

    public abstract okio.BufferedSource sourceOrNull();

    private ImageSource() {
    }
}
