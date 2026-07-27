package io.appmetrica.analytics.billing.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346a {

    /* renamed from: a, reason: collision with root package name */
    public final List f5147a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5148b;

    public C0346a(List list, boolean z3) {
        this.f5147a = list;
        this.f5148b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0346a)) {
            return false;
        }
        C0346a c0346a = (C0346a) obj;
        return kotlin.jvm.internal.j.a(this.f5147a, c0346a.f5147a) && this.f5148b == c0346a.f5148b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5147a.hashCode() * 31;
        boolean z3 = this.f5148b;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f5147a + ", firstInappCheckOccurred=" + this.f5148b + ')';
    }
}
