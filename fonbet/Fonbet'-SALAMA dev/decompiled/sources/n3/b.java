package n3;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel c(int i7, String str) {
        return new NotificationChannel(str, "News and Announcements", i7);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest g(Object obj) {
        return (AudioFocusRequest) obj;
    }
}
