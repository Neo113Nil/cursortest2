package f4;

import D6.y0;
import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;
import i3.C1263a;

/* renamed from: f4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1096h {

    /* renamed from: f, reason: collision with root package name */
    public static final C1263a f12937f = new C1263a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f12938a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f12939b;

    /* renamed from: c, reason: collision with root package name */
    public long f12940c;

    /* renamed from: d, reason: collision with root package name */
    public zzg f12941d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f12942e;

    public final void a() {
        f12937f.e(AbstractC0486a1.g("Scheduling refresh for ", this.f12938a - this.f12940c), new Object[0]);
        this.f12941d.removeCallbacks(this.f12942e);
        this.f12939b = Math.max((this.f12938a - System.currentTimeMillis()) - this.f12940c, 0L) / 1000;
        this.f12941d.postDelayed(this.f12942e, this.f12939b * 1000);
    }
}
