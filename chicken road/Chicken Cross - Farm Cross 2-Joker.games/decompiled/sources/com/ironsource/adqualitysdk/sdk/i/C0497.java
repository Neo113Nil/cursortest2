package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0497 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0462 f1143;

    public C0497(C0462 c0462) {
        this.f1143 = c0462;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        HashSet hashSet;
        C0455.m5446(this.f1143.f860, true);
        C0455 c0455 = this.f1143.f860;
        synchronized (c0455) {
            hashSet = new HashSet(c0455.f845);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0919) it.next()).mo5490();
        }
    }
}
