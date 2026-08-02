package r0;

import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1568b {
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i7, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i7, pendingIntent);
        }
        return mediaStyle;
    }
}
