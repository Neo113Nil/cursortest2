package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05107k extends com.facebook.ads.redexgen.core.AbstractC1771j0 {
    public static byte[] A03;
    public long A00;
    public android.view.View A01;
    public com.facebook.ads.redexgen.core.AnonymousClass76 A02;

    static {
        A05();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, com.google.common.base.Ascii.VT, 38, 55, com.google.common.base.Ascii.ESC, 40, 40, 37, 40, -42, 45, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 34, com.google.common.base.Ascii.ESC, -42, 38, com.google.common.base.Ascii.ETB, 40, 41, com.google.common.base.Ascii.US, 36, com.google.common.base.Ascii.GS, -42, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, 36, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, -42, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 41, -42, -8, com.google.common.base.Ascii.ETB, 36, 36, com.google.common.base.Ascii.ESC, 40};
    }

    public C05107k(com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76, com.facebook.ads.redexgen.core.O7 o7) {
        super(anonymousClass76, o7);
        this.A00 = 10000L;
        this.A02 = anonymousClass76;
    }

    private com.facebook.ads.redexgen.core.C1774j3 A01(java.lang.Runnable runnable) {
        return new com.facebook.ads.redexgen.core.C1774j3(this, runnable);
    }

    private java.util.List<org.json.JSONObject> A04(com.facebook.ads.redexgen.core.O8 o8) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject A032 = o8.A03();
        if (A032.has(A03(22, 12, 71))) {
            try {
                this.A00 = A032.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                org.json.JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((org.json.JSONObject) adsArray.get(i));
                    }
                }
            } catch (org.json.JSONException unused) {
                java.lang.String A033 = A03(36, 38, 101);
                this.A02.A0F().A5g(com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1068Tx c1068Tx) {
        this.A0C = false;
        com.facebook.ads.redexgen.core.C1773j2 c1773j2 = new com.facebook.ads.redexgen.core.C1773j2(this, interfaceC1832k8, com.facebook.ads.redexgen.core.AbstractC1147Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c1773j2, c1068Tx.A05());
        interfaceC1832k8.AAt(this.A02, this.A09, this.A08.A08, A01(c1773j2), jSONObject, c1068Tx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0R(com.facebook.ads.redexgen.core.N1 n1, com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1065Tu c1065Tu, final com.facebook.ads.redexgen.core.O8 o8) {
        this.A02.A0F().A4Y();
        final com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8 = (com.facebook.ads.redexgen.core.InterfaceC1832k8) n1;
        if (interfaceC1832k8.AKL()) {
            final java.util.List<org.json.JSONObject> A04 = A04(o8);
            A06(interfaceC1832k8, A04.get(0), o8.A01());
            if (A04.size() > 1) {
                A0H().postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.C05107k.this.A0a(interfaceC1832k8, A04, o8);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC1832k8, o8.A03(), o8.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0U(java.lang.String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(com.facebook.ads.redexgen.core.InterfaceC1832k8 interfaceC1832k8, java.util.List list, com.facebook.ads.redexgen.core.O8 o8) {
        A06(interfaceC1832k8, (org.json.JSONObject) list.get(1), o8.A01());
    }
}
