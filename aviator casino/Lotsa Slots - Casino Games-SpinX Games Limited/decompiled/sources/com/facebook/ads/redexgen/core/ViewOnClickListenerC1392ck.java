package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1392ck implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt;
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt2;
        boolean z;
        com.facebook.ads.redexgen.core.C1313bT c1313bT;
        boolean z2;
        com.facebook.ads.redexgen.core.C1313bT c1313bT2;
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2;
        com.facebook.ads.redexgen.core.C1353c7 c1353c72;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            abstractC0888Mt = this.A00.A0W;
            if (abstractC0888Mt == null) {
                return;
            }
            abstractC0888Mt2 = this.A00.A0W;
            android.net.Uri A0M = ((com.facebook.ads.redexgen.core.AnonymousClass85) abstractC0888Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z = this.A00.A0D;
            if (!z) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c1353c7 = this.A00.A0b;
                if (c1353c7.A0D() != null) {
                    c1353c72 = this.A00.A0b;
                    c1353c72.A0D().ACQ();
                }
                abstractC1801jd = this.A00.A0X;
                if (abstractC1801jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC1801jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC1801jd2.A0q());
                }
            }
            c1313bT = this.A00.A09;
            if (c1313bT != null) {
                c1313bT2 = this.A00.A09;
                c1313bT2.A0B();
                this.A00.A09 = null;
            }
            com.facebook.ads.redexgen.core.C0799Ji c0799Ji = this.A00;
            z2 = this.A00.A0D;
            c0799Ji.A0q(z2 ? false : true);
        } catch (java.lang.Throwable th) {
            java.lang.String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC1392ck(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        this.A00 = c0799Ji;
    }
}
