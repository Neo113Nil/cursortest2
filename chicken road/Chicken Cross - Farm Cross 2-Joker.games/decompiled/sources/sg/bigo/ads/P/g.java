package sg.bigo.ads.P;

import sg.bigo.ads.api.AdError;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdError f12479a;
    public final /* synthetic */ i b;

    public g(i iVar, AdError adError) {
        this.b = iVar;
        this.f12479a = adError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f12481a.onError(this.f12479a);
    }
}
