package androidx.glance.appwidget;

import android.net.Uri;
import androidx.glance.ImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/UriImageProvider;", "Landroidx/glance/ImageProvider;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UriImageProvider implements ImageProvider {
    private final Uri uri;

    public UriImageProvider(Uri uri) {
        this.uri = uri;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public String toString() {
        return "UriImageProvider(uri='" + this.uri + "')";
    }
}
