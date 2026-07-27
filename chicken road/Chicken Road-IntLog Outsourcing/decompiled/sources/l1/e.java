package l1;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import java.time.Duration;
import java.time.Instant;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ Class C() {
        return Duration.class;
    }

    public static /* synthetic */ NotificationChannel h(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder k(int i2) {
        return new AudioFocusRequest.Builder(i2);
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return Instant.class;
    }

    public static /* bridge */ /* synthetic */ Duration r(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Instant t(Object obj) {
        return (Instant) obj;
    }

    public static /* synthetic */ void u() {
    }
}
