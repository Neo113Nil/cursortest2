package sg.bigo.ads.Q0;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class h implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12505a;

    public h(n nVar) {
        this.f12505a = nVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        sg.bigo.ads.R0.b bVar;
        m mVar = (m) obj;
        this.f12505a.e.set(false);
        this.f12505a.f.set(false);
        this.f12505a.g.set(false);
        if (mVar == null || (bVar = mVar.f12509a) == null) {
            return;
        }
        this.f12505a.a(mVar.b, bVar.b, mVar.c, true);
    }
}
