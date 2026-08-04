package F;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f2445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f2446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f2450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f2451g;

    public q(int i7, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatD = i7 != 0 ? IconCompat.d(null, "", i7) : null;
        Bundle bundle = new Bundle();
        this.f2448d = true;
        this.f2446b = iconCompatD;
        if (iconCompatD != null && iconCompatD.f() == 2) {
            this.f2449e = iconCompatD.e();
        }
        this.f2450f = w.b(str);
        this.f2451g = pendingIntent;
        this.f2445a = bundle;
        this.f2447c = true;
        this.f2448d = true;
    }
}
