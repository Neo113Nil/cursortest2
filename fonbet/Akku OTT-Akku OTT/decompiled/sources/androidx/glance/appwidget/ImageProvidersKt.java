package androidx.glance.appwidget;

import android.net.Uri;
import androidx.glance.ImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"ImageProvider", "Landroidx/glance/ImageProvider;", "uri", "Landroid/net/Uri;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageProvidersKt {
    public static final ImageProvider ImageProvider(Uri uri) {
        return new UriImageProvider(uri);
    }
}
