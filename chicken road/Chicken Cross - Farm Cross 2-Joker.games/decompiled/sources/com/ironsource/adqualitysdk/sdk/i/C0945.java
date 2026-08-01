package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0945 implements InterfaceC0942 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0767 f2648;

    public C0945(C0767 c0767) {
        this.f2648 = c0767;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0942
    /* renamed from: ﾒ */
    public final void mo5664() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f2648.f2205);
            this.f2648.f2205.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
