package p042f4;

import D6.y0;
import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;
import p062i3.a;

/* JADX INFO: renamed from: f4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0899h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12943f = new a("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f12944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f12945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzg f12947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0 f12948e;

    public final void a() {
        f12943f.e(AbstractC0486a1.g("Scheduling refresh for ", this.f12944a - this.f12946c), new Object[0]);
        this.f12947d.removeCallbacks(this.f12948e);
        this.f12945b = Math.max((this.f12944a - System.currentTimeMillis()) - this.f12946c, 0L) / 1000;
        this.f12947d.postDelayed(this.f12948e, this.f12945b * 1000);
    }
}
