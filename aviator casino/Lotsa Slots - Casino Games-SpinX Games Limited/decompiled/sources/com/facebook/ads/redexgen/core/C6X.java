package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C6X extends com.facebook.ads.redexgen.core.C0712Fy {
    public static java.lang.String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C6X(com.facebook.ads.redexgen.core.C1J c1j, int i, java.util.List<com.facebook.ads.redexgen.core.C1474e5> list, com.facebook.ads.redexgen.core.C1581fp c1581fp, android.os.Bundle bundle) {
        super(c1j, i, list, c1581fp, bundle);
        c1j.A1h(this);
        this.A03 = new com.facebook.ads.redexgen.core.M2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A25 = this.A0C.A25();
        if (this.A05 == null || A25 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A25 < curPos - 1) {
            int i = A25 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new java.lang.RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A26();
        int lastVisibleItem = this.A0C.A27();
        int firstVisibleItem = this.A0C.A25();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i);
    }

    @Override // com.facebook.ads.redexgen.core.C0712Fy, com.facebook.ads.redexgen.core.R7
    public final void A0L(com.facebook.ads.redexgen.core.C7M c7m, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.C0712Fy, com.facebook.ads.redexgen.core.R7
    public final void A0M(com.facebook.ads.redexgen.core.C7M c7m, int i, int i2) {
        if (this.A0C.A25() != -1) {
            com.facebook.ads.redexgen.core.AbstractC0797Jg curCard = (com.facebook.ads.redexgen.core.AbstractC0797Jg) this.A0C.A1o(this.A0C.A25());
            if (curCard != null && curCard.A1V() && !curCard.A1U()) {
                curCard.A1S();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C0712Fy
    public final void A0X(android.view.View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.core.C0712Fy
    public final void A0Z(com.facebook.ads.redexgen.core.AbstractC0797Jg abstractC0797Jg, boolean z) {
        A0X(abstractC0797Jg, z);
        if (!z && abstractC0797Jg.A1U()) {
            abstractC0797Jg.A1R();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C0712Fy
    public final boolean A0a(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final com.facebook.ads.redexgen.core.C1581fp A0b() {
        return this.A04;
    }

    public final void A0c(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        this.A04 = c1581fp;
    }

    public final void A0d(java.util.List<com.facebook.ads.redexgen.core.C1474e5> list) {
        this.A05 = list;
    }
}
