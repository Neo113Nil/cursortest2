package okio;

/* compiled from: ZlibOkio.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"openZip", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes6.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public static final okio.FileSystem openZip(okio.FileSystem fileSystem, okio.Path zipPath) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return okio.internal.ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
