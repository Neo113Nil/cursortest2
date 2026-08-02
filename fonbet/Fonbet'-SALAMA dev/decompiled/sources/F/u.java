package F;

import android.app.Notification;
import w1.F0;

/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2455c;

    @Override // F.x
    public final void e(F0 f02) {
        new Notification.BigTextStyle((Notification.Builder) f02.f17374c).setBigContentTitle((CharSequence) this.f2476b).bigText(this.f2455c);
    }

    @Override // F.x
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
