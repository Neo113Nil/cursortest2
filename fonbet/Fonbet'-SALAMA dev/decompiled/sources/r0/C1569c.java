package r0;

import F.x;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import w1.F0;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569c extends x {

    /* renamed from: c, reason: collision with root package name */
    public int[] f16012c;

    /* renamed from: d, reason: collision with root package name */
    public MediaSessionCompat$Token f16013d;

    @Override // F.x
    public final void e(F0 f02) {
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) f02.f17374c;
        if (i7 >= 34) {
            AbstractC1567a.d(builder, AbstractC1567a.b(AbstractC1568b.a(AbstractC1567a.a(), null, 0, null, Boolean.FALSE), this.f16012c, this.f16013d));
        } else {
            AbstractC1567a.d(builder, AbstractC1567a.b(AbstractC1567a.a(), this.f16012c, this.f16013d));
        }
    }
}
