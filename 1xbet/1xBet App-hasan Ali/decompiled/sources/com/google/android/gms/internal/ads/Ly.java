package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Ly extends AbstractC1314mx {

    /* renamed from: a, reason: collision with root package name */
    public final C1181jz f10564a;

    public Ly(C1181jz c1181jz) {
        this.f10564a = c1181jz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f10564a.f14197b.z() != UA.f11745o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ly)) {
            return false;
        }
        C1181jz c1181jz = ((Ly) obj).f10564a;
        C1181jz c1181jz2 = this.f10564a;
        if (c1181jz2.f14197b.z().equals(c1181jz.f14197b.z())) {
            String B5 = c1181jz2.f14197b.B();
            BA ba = c1181jz.f14197b;
            if (B5.equals(ba.B()) && c1181jz2.f14197b.A().equals(ba.A())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C1181jz c1181jz = this.f10564a;
        return Objects.hash(c1181jz.f14197b, c1181jz.f14196a);
    }

    public final String toString() {
        C1181jz c1181jz = this.f10564a;
        String B5 = c1181jz.f14197b.B();
        int ordinal = c1181jz.f14197b.z().ordinal();
        return "(typeUrl=" + B5 + ", outputPrefixType=" + (ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}
