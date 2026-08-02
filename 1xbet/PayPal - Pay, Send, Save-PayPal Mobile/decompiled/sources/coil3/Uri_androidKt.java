package coil3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/Uri;", "Lcoil3/Uri;", "toCoilUri", "(Landroid/net/Uri;)Lcoil3/Uri;", "toAndroidUri", "(Lcoil3/Uri;)Landroid/net/Uri;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Uri_androidKt {
    public static final coil3.Uri toCoilUri(android.net.Uri uri) {
        return coil3.UriKt.toUri$default(uri.toString(), null, 1, null);
    }

    public static final android.net.Uri toAndroidUri(coil3.Uri uri) {
        return android.net.Uri.parse(uri.toString());
    }
}
