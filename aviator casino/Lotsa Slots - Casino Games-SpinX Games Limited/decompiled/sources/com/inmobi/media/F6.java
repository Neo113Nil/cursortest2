package com.inmobi.media;

/* loaded from: classes5.dex */
public final class F6 extends com.inmobi.media.G6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Bl f4698a;

    public F6() {
        this.f4698a = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.F6) && kotlin.jvm.internal.Intrinsics.areEqual(this.f4698a, ((com.inmobi.media.F6) obj).f4698a);
    }

    public final int hashCode() {
        com.inmobi.media.Bl bl = this.f4698a;
        if (bl == null) {
            return 0;
        }
        return bl.hashCode();
    }

    public final java.lang.String toString() {
        return "UnAvailable(vastBeaconData=" + this.f4698a + ")";
    }

    public F6(com.inmobi.media.Bl bl) {
        this.f4698a = bl;
    }
}
