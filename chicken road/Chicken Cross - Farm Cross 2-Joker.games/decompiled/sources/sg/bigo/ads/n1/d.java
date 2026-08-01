package sg.bigo.ads.n1;

import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C5115b f13207a;
    public final /* synthetic */ f b;

    public d(f fVar, C5115b c5115b) {
        this.b = fVar;
        this.f13207a = c5115b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5446j.a(1, new c(this));
    }
}
