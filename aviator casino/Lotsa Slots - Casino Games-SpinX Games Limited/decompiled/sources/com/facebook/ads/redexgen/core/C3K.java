package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3K, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C3K extends java.io.IOException {
    public int A00;
    public boolean A01;

    @java.lang.Deprecated
    public C3K() {
    }

    @java.lang.Deprecated
    public C3K(java.lang.String str) {
        super(str);
    }

    public C3K(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.A01 = z;
        this.A00 = i;
    }

    public static com.facebook.ads.redexgen.core.C3K A00(java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C3K(str, null, false, 1);
    }

    public static com.facebook.ads.redexgen.core.C3K A01(java.lang.String str, java.lang.Throwable th) {
        return new com.facebook.ads.redexgen.core.C3K(str, th, true, 1);
    }

    public static com.facebook.ads.redexgen.core.C3K A02(java.lang.String str, java.lang.Throwable th) {
        return new com.facebook.ads.redexgen.core.C3K(str, th, true, 0);
    }
}
