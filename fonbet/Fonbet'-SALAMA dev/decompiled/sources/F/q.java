package F;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f2445a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f2446b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2447c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2448d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2449e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f2450f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f2451g;

    public q(int i7, String str, PendingIntent pendingIntent) {
        IconCompat d7 = i7 != 0 ? IconCompat.d(null, "", i7) : null;
        Bundle bundle = new Bundle();
        this.f2448d = true;
        this.f2446b = d7;
        if (d7 != null && d7.f() == 2) {
            this.f2449e = d7.e();
        }
        this.f2450f = w.b(str);
        this.f2451g = pendingIntent;
        this.f2445a = bundle;
        this.f2447c = true;
        this.f2448d = true;
    }
}
