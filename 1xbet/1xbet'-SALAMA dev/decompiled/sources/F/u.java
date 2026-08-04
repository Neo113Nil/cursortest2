package F;

import android.app.Notification;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f2455c;

    @Override // F.x
    public final void e(F0 f7) {
        new Notification.BigTextStyle((Notification.Builder) f7.f17380c).setBigContentTitle((CharSequence) this.f2476b).bigText(this.f2455c);
    }

    @Override // F.x
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
