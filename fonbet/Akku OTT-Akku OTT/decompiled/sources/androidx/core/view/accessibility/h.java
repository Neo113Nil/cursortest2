package androidx.core.view.accessibility;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSessionManager;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static /* synthetic */ Slice.Builder a(SliceSpec sliceSpec) {
        return new Slice.Builder(Uri.EMPTY, sliceSpec);
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo b(int i, int i2, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* bridge */ /* synthetic */ boolean e(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
