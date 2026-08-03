package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03812j extends com.facebook.ads.redexgen.core.Q9<com.facebook.ads.redexgen.core.C1581fp> implements com.facebook.ads.redexgen.core.T4 {
    public com.facebook.ads.redexgen.core.C1636gi A00;
    public boolean A01;

    public C03812j(com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1581fp);
        this.A00 = c1636gi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3v(i);
        }
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07() {
        android.view.View view;
        java.lang.ref.WeakReference weakReference;
        boolean z;
        int i;
        int i2;
        int i3;
        com.facebook.ads.redexgen.core.C1582fq c1582fq;
        boolean wasViewable;
        java.util.Map map;
        java.util.Map map2;
        boolean z2;
        boolean z3;
        boolean z4;
        com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc;
        android.os.Handler handler;
        com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc2;
        int i4;
        boolean z5;
        boolean z6;
        java.util.Map map3;
        com.facebook.ads.redexgen.core.C1582fq c1582fq2;
        com.facebook.ads.redexgen.core.C1581fp A08 = A08();
        int i5 = 0;
        if (A08 == null) {
            A00(0);
            return;
        }
        view = A08.A0C;
        weakReference = A08.A0E;
        com.facebook.ads.redexgen.core.AbstractC1580fo abstractC1580fo = (com.facebook.ads.redexgen.core.AbstractC1580fo) weakReference.get();
        int i6 = 1;
        boolean z7 = view == null;
        if (!z7 && abstractC1580fo != null) {
            i = A08.A0A;
            com.facebook.ads.redexgen.core.C1582fq A0E = com.facebook.ads.redexgen.core.C1581fp.A0E(view, i, this.A00);
            if (A0E.A04()) {
                com.facebook.ads.redexgen.core.C1581fp.A05(A08);
            } else {
                A08.A00 = 0;
            }
            i2 = A08.A00;
            i3 = A08.A09;
            boolean z8 = i2 > i3;
            c1582fq = A08.A05;
            if (c1582fq != null) {
                c1582fq2 = A08.A05;
                if (c1582fq2.A04()) {
                    wasViewable = true;
                    if (!z8 || !A0E.A04()) {
                        A08.A05 = A0E;
                    }
                    java.lang.String valueOf = java.lang.String.valueOf(A0E.A01());
                    synchronized (A08) {
                        map = A08.A06;
                        if (map.containsKey(valueOf)) {
                            map3 = A08.A06;
                            i5 = ((java.lang.Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A08.A06;
                        map2.put(valueOf, java.lang.Integer.valueOf(i5 + 1));
                    }
                    if (z8 && !wasViewable) {
                        this.A01 = true;
                        A08.A03 = java.lang.System.currentTimeMillis();
                        z5 = A08.A07;
                        if (z5) {
                            this.A00.A0F().A3w();
                        }
                        abstractC1580fo.A03();
                        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() && com.facebook.ads.internal.settings.AdInternalSettings.isVisibleAnimation()) {
                            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(500L);
                            view.startAnimation(alphaAnimation);
                        }
                        z6 = A08.A0F;
                        if (!z6) {
                            return;
                        }
                    } else if (!z8 && wasViewable) {
                        this.A01 = true;
                        z3 = A08.A07;
                        if (z3) {
                            this.A00.A0F().A3S(A0E.A02());
                        }
                        abstractC1580fo.A00();
                    } else {
                        abstractC1580fo.A02();
                        if (!this.A01) {
                            z2 = A08.A07;
                            if (z2) {
                                this.A00.A0F().A3u(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    z4 = A08.A08;
                    if (z4) {
                        return;
                    }
                    abstractRunnableC1123Wc = A08.A04;
                    if (abstractRunnableC1123Wc == null) {
                        return;
                    }
                    handler = A08.A0B;
                    abstractRunnableC1123Wc2 = A08.A04;
                    i4 = A08.A02;
                    handler.postDelayed(abstractRunnableC1123Wc2, i4);
                    return;
                }
            }
            wasViewable = false;
            if (!z8) {
            }
            A08.A05 = A0E;
            java.lang.String valueOf2 = java.lang.String.valueOf(A0E.A01());
            synchronized (A08) {
            }
        } else {
            z = A08.A07;
            if (z) {
                if (!z7) {
                    i6 = 2;
                }
                A00(i6);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final com.facebook.ads.redexgen.core.C1636gi A6m() {
        return this.A00;
    }
}
