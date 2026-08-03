package com.inmobi.media;

/* renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2397f4 extends com.inmobi.media.AbstractC2767t4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5192a;
    public final int b;
    public final long c;

    public C2397f4(int i, long j, java.lang.String configType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "configType");
        this.f5192a = configType;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2397f4)) {
            return false;
        }
        com.inmobi.media.C2397f4 c2397f4 = (com.inmobi.media.C2397f4) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5192a, c2397f4.f5192a) && this.b == c2397f4.b && this.c == c2397f4.c;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + com.inmobi.media.AbstractC2755si.a(this.b, this.f5192a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return "ConfigFailure(configType=" + this.f5192a + ", errorCode=" + this.b + ", lastUpdatedTimestamp=" + this.c + ")";
    }
}
