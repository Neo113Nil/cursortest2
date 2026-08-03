package io.appmetrica.analytics.billing.impl;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f3449a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3450b;

    public C0204a(java.util.List list, boolean z2) {
        this.f3449a = list;
        this.f3450b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.billing.impl.C0204a)) {
            return false;
        }
        io.appmetrica.analytics.billing.impl.C0204a c0204a = (io.appmetrica.analytics.billing.impl.C0204a) obj;
        return kotlin.jvm.internal.i.a(this.f3449a, c0204a.f3449a) && this.f3450b == c0204a.f3450b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f3449a.hashCode() * 31;
        boolean z2 = this.f3450b;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final java.lang.String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f3449a + ", firstInappCheckOccurred=" + this.f3450b + ')';
    }
}
