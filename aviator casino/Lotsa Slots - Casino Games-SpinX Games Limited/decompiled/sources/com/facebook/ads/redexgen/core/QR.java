package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QR implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7P A00;
    public final /* synthetic */ java.util.ArrayList A01;

    public QR(com.facebook.ads.redexgen.core.C7P c7p, java.util.ArrayList arrayList) {
        this.A00 = c7p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.C0969Qa c0969Qa = (com.facebook.ads.redexgen.core.C0969Qa) it.next();
            this.A00.A0e(c0969Qa.A04, c0969Qa.A00, c0969Qa.A01, c0969Qa.A02, c0969Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
