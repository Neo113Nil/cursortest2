package sg.bigo.ads.P;

import sg.bigo.ads.api.Ad;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ad f12480a;
    public final /* synthetic */ i b;

    public h(i iVar, Ad ad) {
        this.b = iVar;
        this.f12480a = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12481a.onAdLoaded(this.f12480a);
    }
}
