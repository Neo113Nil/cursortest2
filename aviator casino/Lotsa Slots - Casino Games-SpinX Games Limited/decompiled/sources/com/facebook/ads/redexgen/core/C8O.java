package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8O, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8O {
    public static final com.facebook.ads.redexgen.core.C8O A03;
    public final java.lang.String A00;
    public final com.facebook.ads.redexgen.core.C8N A01;
    public final java.lang.Object A02;

    static {
        com.facebook.ads.redexgen.core.C8O c8o;
        if (com.facebook.ads.redexgen.core.C5C.A02 < 31) {
            c8o = new com.facebook.ads.redexgen.core.C8O("");
        } else {
            c8o = new com.facebook.ads.redexgen.core.C8O(com.facebook.ads.redexgen.core.C8N.A01, "");
        }
        A03 = c8o;
    }

    public C8O(com.facebook.ads.redexgen.core.C8N c8n, java.lang.String str) {
        this.A01 = c8n;
        this.A00 = str;
        this.A02 = new java.lang.Object();
    }

    public C8O(java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(com.facebook.ads.redexgen.core.C5C.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new java.lang.Object();
    }

    public final android.media.metrics.LogSessionId A00() {
        return ((com.facebook.ads.redexgen.core.C8N) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01)).A00;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C8O)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C8O c8o = (com.facebook.ads.redexgen.core.C8O) obj;
        if (java.util.Objects.equals(this.A00, c8o.A00) && java.util.Objects.equals(this.A01, c8o.A01) && java.util.Objects.equals(this.A02, c8o.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.A00, this.A01, this.A02);
    }
}
