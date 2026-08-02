package androidx.core.net;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroid/net/Uri;", "toUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Ljava/io/File;", "(Ljava/io/File;)Landroid/net/Uri;", "toFile", "(Landroid/net/Uri;)Ljava/io/File;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UriKt {
    public static final android.net.Uri toUri(java.lang.String str) {
        return android.net.Uri.parse(str);
    }

    public static final android.net.Uri toUri(java.io.File file) {
        return android.net.Uri.fromFile(file);
    }

    public static final java.io.File toFile(android.net.Uri uri) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "file")) {
            throw new java.lang.IllegalArgumentException("Uri lacks 'file' scheme: ".concat(java.lang.String.valueOf(uri)).toString());
        }
        java.lang.String path = uri.getPath();
        if (path != null) {
            return new java.io.File(path);
        }
        throw new java.lang.IllegalArgumentException("Uri path is null: ".concat(java.lang.String.valueOf(uri)).toString());
    }
}
