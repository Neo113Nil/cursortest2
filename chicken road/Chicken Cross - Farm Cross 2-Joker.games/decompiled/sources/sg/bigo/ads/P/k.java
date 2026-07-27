package sg.bigo.ads.P;

import sg.bigo.ads.api.core.BaseAdActivityImpl;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseAdActivityImpl f12483a;

    public k(BaseAdActivityImpl baseAdActivityImpl) {
        this.f12483a = baseAdActivityImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12483a.p();
    }
}
