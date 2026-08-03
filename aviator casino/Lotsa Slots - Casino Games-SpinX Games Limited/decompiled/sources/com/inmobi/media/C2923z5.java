package com.inmobi.media;

/* renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2923z5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5583a;
    public final java.lang.String b;

    public C2923z5(java.lang.String str, boolean z) {
        this.f5583a = z;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2923z5)) {
            return false;
        }
        com.inmobi.media.C2923z5 c2923z5 = (com.inmobi.media.C2923z5) obj;
        return this.f5583a == c2923z5.f5583a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2923z5.b);
    }

    public final int hashCode() {
        int m = kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5583a) * 31;
        java.lang.String str = this.b;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f5583a + ", version=" + this.b + ")";
    }
}
