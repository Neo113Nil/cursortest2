package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04625o {
    public java.util.Map<java.lang.String, java.lang.String> A00;
    public final java.util.Map<java.lang.String, java.lang.String> A01 = new java.util.HashMap();

    public final synchronized java.util.Map<java.lang.String, java.lang.String> A00() {
        if (this.A00 == null) {
            this.A00 = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.A01));
        }
        return this.A00;
    }

    public final synchronized void A01(java.lang.String str, java.lang.String str2) {
        this.A00 = null;
        this.A01.put(str, str2);
    }
}
