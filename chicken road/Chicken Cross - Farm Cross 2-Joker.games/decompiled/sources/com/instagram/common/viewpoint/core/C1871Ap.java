package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1871Ap implements InterfaceC3534rI {
    public final /* synthetic */ C1870Ao A00;

    public C1871Ap(C1870Ao c1870Ao) {
        this.A00 = c1870Ao;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3534rI
    public final void AFq() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC3534rI interfaceC3534rI;
        InterfaceC3534rI interfaceC3534rI2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC3534rI = this.A00.A01;
        if (interfaceC3534rI != null) {
            interfaceC3534rI2 = this.A00.A01;
            interfaceC3534rI2.AFq();
        }
    }
}
