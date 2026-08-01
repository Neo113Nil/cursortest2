package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.о, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0514 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f1168;

    public C0514(C0470 c0470) {
        this.f1168 = c0470;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0470 c0470 = this.f1168;
        synchronized (c0470) {
            c0470.f881 = true;
        }
        C1175 c1175 = this.f1168.f885;
        if (c1175 != null) {
            c1175.mo5664();
        }
        Iterator it = new ArrayList(this.f1168.f884).iterator();
        while (it.hasNext()) {
            ((InterfaceC0942) it.next()).mo5664();
        }
        this.f1168.f884.clear();
        Iterator it2 = new ArrayList(this.f1168.f883).iterator();
        while (it2.hasNext()) {
            ((InterfaceC0942) it2.next()).mo5664();
        }
    }
}
