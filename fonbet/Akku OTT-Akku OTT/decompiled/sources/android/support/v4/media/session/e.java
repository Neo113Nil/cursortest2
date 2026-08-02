package android.support.v4.media.session;

import android.content.Context;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;

/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable c(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ MediaSession d(Context context) {
        return new MediaSession(context, "BetterPlayer", null);
    }
}
