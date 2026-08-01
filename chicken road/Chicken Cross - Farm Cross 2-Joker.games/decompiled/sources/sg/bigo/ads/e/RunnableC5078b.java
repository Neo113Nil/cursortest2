package sg.bigo.ads.e;

import sg.bigo.ads.api.Ad;

/* renamed from: sg.bigo.ads.e.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5078b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ad f12742a;

    public RunnableC5078b(Ad ad) {
        this.f12742a = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12742a.destroy();
    }
}
