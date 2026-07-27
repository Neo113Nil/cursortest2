package sg.bigo.ads.x;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.h.AbstractC5164f1;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f13372a;

    public g(h hVar) {
        this.f13372a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : this.f13372a.f13373a.b0.o0.entrySet()) {
            AbstractC5164f1.a((sg.bigo.ads.C.l) entry.getKey(), new f(this, concurrentHashMap, ((sg.bigo.ads.E.c) entry.getValue()).d, concurrentHashMap2));
        }
    }
}
