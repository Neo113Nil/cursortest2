package okio;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", "p0", "openZip", "(Lokio/FileSystem;Lokio/Path;)Lokio/FileSystem;"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes17.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final okio.FileSystem openZip(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return okio.internal.ZipFilesKt.openZip$default(path, fileSystem, null, 4, null);
    }
}
