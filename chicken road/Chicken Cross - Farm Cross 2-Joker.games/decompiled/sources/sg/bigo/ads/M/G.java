package sg.bigo.ads.M;

import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class G implements sg.bigo.ads.C.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f12426a;

    public G(Q q) {
        this.f12426a = q;
    }

    @Override // sg.bigo.ads.C.e
    public final boolean a() {
        ViewFlow viewFlow = this.f12426a.d;
        if (viewFlow != null) {
            return viewFlow.s;
        }
        return false;
    }
}
