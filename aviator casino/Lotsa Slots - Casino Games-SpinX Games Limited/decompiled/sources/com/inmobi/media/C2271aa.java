package com.inmobi.media;

/* renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2271aa {
    private final boolean GPID;

    public C2271aa() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2271aa) && this.GPID == ((com.inmobi.media.C2271aa) obj).GPID;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.GPID);
    }

    public final java.lang.String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ")";
    }

    public C2271aa(boolean z) {
        this.GPID = z;
    }

    public /* synthetic */ C2271aa(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
