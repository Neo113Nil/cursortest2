package sg.bigo.ads.Z0;

import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.api.Ad;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12656a;

    public e(f fVar) {
        this.f12656a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f12656a;
        l lVar = fVar.f12657a.k;
        Ad ad = fVar.c;
        ConcurrentHashMap concurrentHashMap = l.c;
        lVar.a(ad, true);
    }
}
