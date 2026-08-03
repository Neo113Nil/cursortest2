package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0577Ap implements com.facebook.ads.redexgen.core.InterfaceC2240rI {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0576Ao A00;

    public C0577Ap(com.facebook.ads.redexgen.core.C0576Ao c0576Ao) {
        this.A00 = c0576Ao;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2240rI
    public final void AFq() {
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        java.util.ArrayList arrayList;
        java.util.LinkedHashMap linkedHashMap3;
        java.util.LinkedHashMap linkedHashMap4;
        com.facebook.ads.redexgen.core.InterfaceC2240rI interfaceC2240rI;
        com.facebook.ads.redexgen.core.InterfaceC2240rI interfaceC2240rI2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new java.util.ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (java.lang.Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        interfaceC2240rI = this.A00.A01;
        if (interfaceC2240rI != null) {
            interfaceC2240rI2 = this.A00.A01;
            interfaceC2240rI2.AFq();
        }
    }
}
