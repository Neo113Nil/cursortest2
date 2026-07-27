package sg.bigo.ads.Y0;

import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12636a;

    public j(x xVar) {
        this.f12636a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f12636a;
        if (xVar.g0) {
            AbstractC5446j.a(1, null, new l(xVar, 1), 0L);
        }
    }
}
