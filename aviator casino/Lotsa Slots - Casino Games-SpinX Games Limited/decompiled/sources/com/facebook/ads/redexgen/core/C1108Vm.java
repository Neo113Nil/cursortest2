package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1108Vm {
    public final com.facebook.ads.internal.protocol.AdErrorType A00;
    public final java.lang.String A01;

    public C1108Vm(int i, java.lang.String str) {
        this(com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1108Vm(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        str = android.text.TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static com.facebook.ads.redexgen.core.C1108Vm A00(com.facebook.ads.internal.protocol.AdErrorType adErrorType) {
        return new com.facebook.ads.redexgen.core.C1108Vm(adErrorType, (java.lang.String) null);
    }

    public static com.facebook.ads.redexgen.core.C1108Vm A01(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1108Vm(adErrorType, str);
    }

    public static com.facebook.ads.redexgen.core.C1108Vm A02(com.facebook.ads.redexgen.core.C1109Vn c1109Vn) {
        return new com.facebook.ads.redexgen.core.C1108Vm(c1109Vn.A00(), c1109Vn.A01());
    }

    public final com.facebook.ads.internal.protocol.AdErrorType A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A01;
    }
}
