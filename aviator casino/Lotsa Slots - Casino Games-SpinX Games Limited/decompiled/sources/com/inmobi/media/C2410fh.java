package com.inmobi.media;

/* renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2410fh {

    /* renamed from: a, reason: collision with root package name */
    public int f5202a = 0;
    public int b = 0;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2410fh)) {
            return false;
        }
        com.inmobi.media.C2410fh c2410fh = (com.inmobi.media.C2410fh) obj;
        return this.f5202a == c2410fh.f5202a && this.b == c2410fh.b;
    }

    public final int hashCode() {
        return this.b + (this.f5202a * 31);
    }

    public final java.lang.String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f5202a + ", noOfSubscriptions=" + this.b + ")";
    }
}
