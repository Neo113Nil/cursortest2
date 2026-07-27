package sg.bigo.ads.Z0;

import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;

/* loaded from: classes3.dex */
public final class d implements BigoAdSdk.InitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f12655a;
    public final /* synthetic */ sg.bigo.ads.N.d b;
    public final /* synthetic */ l c;

    public d(l lVar, AtomicBoolean atomicBoolean, sg.bigo.ads.N.d dVar) {
        this.c = lVar;
        this.f12655a = atomicBoolean;
        this.b = dVar;
    }

    @Override // sg.bigo.ads.BigoAdSdk.InitListener
    public final void onInitialized() {
        if (this.f12655a.compareAndSet(false, true)) {
            this.c.a(this.b);
        }
    }
}
