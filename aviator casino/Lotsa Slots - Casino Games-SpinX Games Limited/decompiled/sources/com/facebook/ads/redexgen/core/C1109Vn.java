package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1109Vn extends java.lang.Exception {
    public final com.facebook.ads.internal.protocol.AdErrorType A00;
    public final java.lang.String A01;

    public C1109Vn(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        this(adErrorType, str, null);
    }

    public C1109Vn(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public final com.facebook.ads.internal.protocol.AdErrorType A00() {
        return this.A00;
    }

    public final java.lang.String A01() {
        return this.A01;
    }
}
