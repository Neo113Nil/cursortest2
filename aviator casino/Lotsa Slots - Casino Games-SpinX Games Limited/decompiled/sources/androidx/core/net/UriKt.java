package androidx.core.net;

/* compiled from: Uri.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UriKt {
    public static final android.net.Uri toUri(java.lang.String str) {
        return android.net.Uri.parse(str);
    }

    public static final android.net.Uri toUri(java.io.File file) {
        return android.net.Uri.fromFile(file);
    }

    public static final java.io.File toFile(android.net.Uri uri) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "file")) {
            throw new java.lang.IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        java.lang.String path = uri.getPath();
        if (path != null) {
            return new java.io.File(path);
        }
        throw new java.lang.IllegalArgumentException(("Uri path is null: " + uri).toString());
    }
}
