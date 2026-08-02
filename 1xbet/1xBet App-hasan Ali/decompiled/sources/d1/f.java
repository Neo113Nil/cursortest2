package d1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class f extends J2.a {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f16865b;

    @Override // J2.a
    public final void b(m2.g gVar) {
        new Notification.BigTextStyle((Notification.Builder) gVar.f17995m).setBigContentTitle(null).bigText(this.f16865b);
    }

    @Override // J2.a
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
