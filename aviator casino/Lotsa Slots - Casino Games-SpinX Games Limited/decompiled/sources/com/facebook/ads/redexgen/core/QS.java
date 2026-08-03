package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QS implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7P A00;
    public final /* synthetic */ java.util.ArrayList A01;

    public QS(com.facebook.ads.redexgen.core.C7P c7p, java.util.ArrayList arrayList) {
        this.A00 = c7p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.QZ change = (com.facebook.ads.redexgen.core.QZ) it.next();
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
