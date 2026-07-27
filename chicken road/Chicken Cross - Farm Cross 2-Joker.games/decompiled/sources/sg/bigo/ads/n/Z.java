package sg.bigo.ads.n;

import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class Z implements sg.bigo.ads.C.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f13156a;

    public Z(U0 u0) {
        this.f13156a = u0;
    }

    @Override // sg.bigo.ads.C.e
    public final boolean a() {
        ViewFlow viewFlow = this.f13156a.C;
        if (viewFlow != null) {
            return viewFlow.s;
        }
        return false;
    }
}
