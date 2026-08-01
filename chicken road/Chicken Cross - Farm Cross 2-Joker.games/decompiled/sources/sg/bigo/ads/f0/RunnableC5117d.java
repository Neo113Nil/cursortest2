package sg.bigo.ads.f0;

import sg.bigo.ads.n1.n;

/* renamed from: sg.bigo.ads.f0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5117d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5115b f12784a;
    public final /* synthetic */ long b;
    public final /* synthetic */ h c;

    public RunnableC5117d(h hVar, C5115b c5115b, long j) {
        this.c = hVar;
        this.f12784a = c5115b;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((n) this.c.f).a(this.f12784a, 2, this.b);
    }
}
