package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0794 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2305;

    public C0794(C0682 c0682) {
        this.f2305 = c0682;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0682 c0682 = this.f2305;
        Iterator it = (c0682.f1867 != null ? new ArrayList(c0682.f1867) : new ArrayList()).iterator();
        while (it.hasNext()) {
            ((C0969) it.next()).m5786();
        }
        List m5620 = C0682.m5620(this.f2305);
        if (m5620 != null) {
            ((ArrayList) m5620).clear();
        }
        this.f2305.f1867 = null;
        this.f2305.f1862 = null;
    }
}
