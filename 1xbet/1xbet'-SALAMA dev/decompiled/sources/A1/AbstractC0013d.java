package A1;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import java.util.Locale;

/* JADX INFO: renamed from: A1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0013d {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ NotificationChannel c(int i7) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i7);
    }

    public static /* synthetic */ AudioFocusRequest.Builder e(int i7) {
        return new AudioFocusRequest.Builder(i7);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ Locale.LanguageRange r(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void t() {
    }
}
