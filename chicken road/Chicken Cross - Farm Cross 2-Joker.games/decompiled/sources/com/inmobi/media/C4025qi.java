package com.inmobi.media;

/* renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4025qi {

    /* renamed from: a, reason: collision with root package name */
    public int f7330a = 0;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4025qi)) {
            return false;
        }
        C4025qi c4025qi = (C4025qi) obj;
        return this.f7330a == c4025qi.f7330a && this.b == c4025qi.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7330a) * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f7330a + ", noOfSubscriptions=" + this.b + ")";
    }
}
