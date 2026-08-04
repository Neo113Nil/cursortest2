package p123r0;

import F.x;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaSessionCompat$Token f16019d;

    @Override // F.x
    public final void e(F0 f7) {
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) f7.f17380c;
        if (i7 >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f16018c, this.f16019d));
        } else {
            a.d(builder, a.b(a.a(), this.f16018c, this.f16019d));
        }
    }
}
