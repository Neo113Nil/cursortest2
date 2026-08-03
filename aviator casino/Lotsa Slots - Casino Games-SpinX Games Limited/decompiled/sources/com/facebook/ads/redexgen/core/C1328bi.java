package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1328bi extends android.widget.FrameLayout {
    public static java.lang.String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public com.facebook.ads.redexgen.core.AbstractC1171Yb A00;
    public com.facebook.ads.redexgen.core.Z3 A01;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A04;
    public final com.facebook.ads.redexgen.core.InterfaceC1327bh A05;
    public final com.facebook.ads.redexgen.core.C0673Ek A06;
    public final java.util.List<android.view.View> A07;

    public C1328bi(com.facebook.ads.redexgen.core.C1353c7 c1353c7, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, com.facebook.ads.redexgen.core.DZ dz, com.facebook.ads.redexgen.core.AbstractC1299bF abstractC1299bF, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.InterfaceC1327bh interfaceC1327bh) {
        this(c1353c7, abstractC1801jd, c0673Ek, interfaceC1177Yh, interfaceC1327bh, dz, abstractC1299bF);
    }

    public C1328bi(com.facebook.ads.redexgen.core.C1353c7 c1353c7, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.InterfaceC1327bh interfaceC1327bh, android.view.View... viewArr) {
        this(c1353c7.A06(), c1353c7.A0B(), abstractC1801jd, c0673Ek, interfaceC1177Yh, interfaceC1327bh, viewArr);
    }

    public C1328bi(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.InterfaceC1327bh interfaceC1327bh, android.view.View... viewArr) {
        super(c1636gi);
        this.A07 = new java.util.ArrayList();
        this.A03 = c1636gi;
        this.A00 = abstractC1171Yb;
        this.A02 = abstractC1801jd;
        for (android.view.View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC1177Yh;
        this.A06 = c0673Ek;
        this.A05 = interfaceC1327bh;
        A04();
    }

    private void A04() {
        java.lang.String A06;
        com.facebook.ads.RewardData A0s = this.A02.A0s();
        if (A0s == null) {
            A06 = this.A02.A2B().A05();
        } else {
            A06 = this.A02.A2B().A06(A0s.getCurrency(), A0s.getQuantity());
        }
        this.A01 = new com.facebook.ads.redexgen.core.Z3(this.A03, -1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, A06, null, this.A02.A2B().A04(), this.A02.A2B().A03(), com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.REWARD_ICON));
        this.A01.A02.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1325bf(this));
        this.A01.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1326bg(this));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0d(com.facebook.ads.redexgen.core.EnumC1515el.A07);
        }
        this.A05.ACt();
        if (!this.A02.A29().A0V()) {
            this.A02.A2H(this.A04);
        }
    }

    public final void A07(android.view.ViewGroup viewGroup) {
        if (this.A06 != null && !this.A06.A0o()) {
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A06;
            java.lang.String[] strArr = A08;
            if (strArr[0].length() == strArr[3].length()) {
                java.lang.String[] strArr2 = A08;
                strArr2[4] = "1Ran1dt8ESvXQPCOL";
                strArr2[1] = "wn";
                c0673Ek.A0j(false, false, 11);
                com.facebook.ads.redexgen.core.YB.A0O(this.A06, 4);
            }
            throw new java.lang.RuntimeException();
        }
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.YB.A0H(this.A00);
        }
        java.util.Iterator<android.view.View> it = this.A07.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr3 = A08;
            if (strArr3[5].charAt(31) != strArr3[6].charAt(31)) {
                break;
            }
            java.lang.String[] strArr4 = A08;
            strArr4[0] = "6LHnkwVNW3v3BurcJpp";
            strArr4[3] = "pBsoAnuzgJgS4JAM4BB";
            if (hasNext) {
                android.view.View next = it.next();
                next.clearAnimation();
                com.facebook.ads.redexgen.core.YB.A0O(next, 4);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                viewGroup.addView(this, layoutParams);
                this.A05.AEn();
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
