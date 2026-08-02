package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0681Pn implements Runnable {
    public final /* synthetic */ C02036j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC0681Pn(C02036j c02036j, ArrayList arrayList) {
        this.A00 = c02036j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C0690Pw c0690Pw = (C0690Pw) it.next();
            this.A00.A0e(c0690Pw.A04, c0690Pw.A00, c0690Pw.A01, c0690Pw.A02, c0690Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
