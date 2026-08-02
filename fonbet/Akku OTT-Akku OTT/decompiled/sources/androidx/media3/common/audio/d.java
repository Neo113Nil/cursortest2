package androidx.media3.common.audio;

import android.app.NotificationChannel;
import com.google.firebase.messaging.CommonNotificationBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ NotificationChannel a(String str) {
        return new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, str, 3);
    }
}
