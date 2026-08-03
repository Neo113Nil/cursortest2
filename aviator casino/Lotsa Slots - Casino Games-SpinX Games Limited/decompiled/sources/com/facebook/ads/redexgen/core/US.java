package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class US extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.String> {
    public static byte[] A05;
    public com.facebook.ads.redexgen.core.C1082Ul A00;
    public final com.facebook.ads.redexgen.core.T8 A01;
    public final com.facebook.ads.redexgen.core.UO<java.lang.String> A02;
    public final com.facebook.ads.redexgen.core.InterfaceC1073Uc<com.facebook.ads.redexgen.core.V7> A03;
    public final com.facebook.ads.redexgen.core.V7 A04;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{com.google.common.base.Ascii.DC4, 89, 110, 110, 115, 110, 60, 113, 121, 111, 111, 125, 123, 121, 60, Byte.MAX_VALUE, 125, 114, 114, 115, 104, 60, 126, 121, 60, 114, 105, 112, 112, 99, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 72, 70, 65, 72, com.google.common.base.Ascii.SI, 74, 89, 74, 65, 91, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, 102, 113, 119, 123, 102, 112, 75, 112, 117, 96, 117, 118, 117, 103, 113};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Uc != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
    public US(com.facebook.ads.redexgen.core.V7 v7, com.facebook.ads.redexgen.core.UO<java.lang.String> uo, com.facebook.ads.redexgen.core.InterfaceC1073Uc<com.facebook.ads.redexgen.core.V7> interfaceC1073Uc, com.facebook.ads.redexgen.core.T8 t8) {
        this.A04 = v7;
        this.A03 = interfaceC1073Uc;
        this.A02 = uo;
        this.A01 = t8;
    }

    private final java.lang.String A01(java.lang.Void... voidArr) {
        byte[] A07;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        java.lang.String str = null;
        try {
            try {
                str = java.util.UUID.randomUUID().toString();
                this.A01.A08().AA3(this.A04.A06().toString());
            } catch (com.facebook.ads.redexgen.core.C1082Ul e) {
                this.A00 = e;
                this.A01.A08().ABC(A00(44, 15, 24), com.facebook.ads.redexgen.core.AbstractC1048Td.A2N, new com.facebook.ads.redexgen.core.C1049Te(e));
            }
            if (android.text.TextUtils.isEmpty(this.A04.A08())) {
                return null;
            }
            if (this.A01.A05().AAO()) {
                java.lang.String str2 = A00(29, 15, 35) + this.A04.A06().toString() + A00(0, 1, 56) + this.A04.A09().toString();
            }
            com.facebook.ads.redexgen.core.InterfaceC1073Uc<com.facebook.ads.redexgen.core.V7> interfaceC1073Uc = this.A03;
            A07 = com.facebook.ads.redexgen.core.ZD.A07(this.A01, str, this.A04);
            interfaceC1073Uc.AKH(A07);
            return str;
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    private final void A03(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A02.A02(str);
            } else {
                this.A02.A01(0, (java.lang.String) com.facebook.ads.internal.util.common.Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 16)));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ java.lang.String doInBackground(java.lang.Void[] voidArr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            return A01(voidArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            A03(str);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
