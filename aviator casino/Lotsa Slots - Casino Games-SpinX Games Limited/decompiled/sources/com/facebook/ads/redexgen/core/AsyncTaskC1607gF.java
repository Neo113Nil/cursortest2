package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class AsyncTaskC1607gF extends android.os.AsyncTask<java.lang.String, java.lang.Void, com.facebook.ads.redexgen.core.C1608gG> {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE};
    public static final java.lang.String A07;
    public static final java.util.Set<java.lang.String> A08;
    public com.facebook.ads.redexgen.core.T8 A00;
    public com.facebook.ads.redexgen.core.InterfaceC1586fu A01;
    public com.facebook.ads.redexgen.core.InterfaceC1606gE A02;
    public java.util.Map<java.lang.String, java.lang.String> A03;
    public java.util.Map<java.lang.String, java.lang.String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final com.facebook.ads.redexgen.core.C1608gG A00(java.lang.String... strArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        java.lang.String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            java.lang.String str = strArr[0];
            if (!android.text.TextUtils.isEmpty(str) && !A08.contains(str)) {
                java.lang.String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new com.facebook.ads.redexgen.core.C1608gG(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 93, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CAN, 19, com.google.common.base.Ascii.DC4, 19, com.google.common.base.Ascii.SUB, 93, 8, com.google.common.base.Ascii.SI, 17, 71, 93, com.google.common.base.Ascii.SI, 0, com.google.common.base.Ascii.SI, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = com.facebook.ads.redexgen.core.AsyncTaskC1607gF.class.getSimpleName();
        A08 = new java.util.HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC1607gF(com.facebook.ads.redexgen.core.T8 t8) {
        this(t8, null, null);
    }

    public AsyncTaskC1607gF(com.facebook.ads.redexgen.core.T8 t8, java.util.Map<java.lang.String, java.lang.String> extraData) {
        this(t8, extraData, null);
    }

    public AsyncTaskC1607gF(com.facebook.ads.redexgen.core.T8 t8, java.util.Map<java.lang.String, java.lang.String> extraData, java.util.Map<java.lang.String, java.lang.String> postData) {
        this.A00 = t8;
        this.A03 = extraData != null ? new java.util.HashMap(extraData) : null;
        this.A04 = postData != null ? new java.util.HashMap(postData) : null;
    }

    private java.lang.String A02(java.lang.String str) {
        try {
            return A03(str, A01(23, 6, 9), com.facebook.ads.redexgen.core.AbstractC1147Xd.A01(this.A00.A04().A6w()));
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    private java.lang.String A03(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            return str;
        }
        java.lang.String A01 = A01(3, 1, 49);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 127);
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str).append(A01).append(str2);
        java.lang.String prepend = A01(2, 1, 113);
        java.lang.StringBuilder append2 = append.append(prepend);
        java.lang.String prepend2 = java.net.URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(com.facebook.ads.redexgen.core.C1608gG response) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AHC(response);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    private boolean A06(java.lang.String str) {
        com.facebook.ads.redexgen.core.InterfaceC1586fu AGw;
        com.facebook.ads.redexgen.core.InterfaceC1587fv A00 = com.facebook.ads.redexgen.core.C1605gD.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                AGw = A00.AGw(str, new com.facebook.ads.redexgen.core.C1601g9());
            } else {
                com.facebook.ads.redexgen.core.C1601g9 params = new com.facebook.ads.redexgen.core.C1601g9();
                params.A05(this.A04);
                AGw = A00.AGx(str, params.A08());
            }
            this.A01 = AGw;
        } catch (java.lang.Exception e) {
            android.util.Log.e(A07, A01(4, 19, 26) + str, e);
        }
        return this.A01 != null && this.A01.A9C() == 200;
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC1606gE interfaceC1606gE) {
        this.A02 = interfaceC1606gE;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ com.facebook.ads.redexgen.core.C1608gG doInBackground(java.lang.String[] strArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AHA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(com.facebook.ads.redexgen.core.C1608gG c1608gG) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            A05(c1608gG);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
