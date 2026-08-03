package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class U9 implements java.util.concurrent.Callable<java.lang.Boolean> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1133Wn A00;
    public final /* synthetic */ java.lang.String A01;

    public U9(com.facebook.ads.redexgen.core.C1133Wn c1133Wn, java.lang.String str) {
        this.A00 = c1133Wn;
        this.A01 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean call() throws java.lang.Exception {
        java.util.Map map;
        java.util.Map map2;
        this.A00.A05();
        map = com.facebook.ads.redexgen.core.UB.A04;
        synchronized (map) {
            map2 = com.facebook.ads.redexgen.core.UB.A04;
            map2.put(this.A01, 2);
        }
        return true;
    }
}
