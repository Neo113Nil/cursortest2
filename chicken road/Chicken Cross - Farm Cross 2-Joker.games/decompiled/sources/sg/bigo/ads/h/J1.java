package sg.bigo.ads.h;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class J1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12832a;
    public final /* synthetic */ K1 b;

    public J1(K1 k1, int i) {
        this.b = k1;
        this.f12832a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O1 o1 = this.b.b;
        sg.bigo.ads.E0.p.a(this.b.f12835a, this.f12832a, new I1(((o1.g > 0L ? 1 : (o1.g == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - o1.g : 0L) > 15 ? 300L : 0L));
    }
}
