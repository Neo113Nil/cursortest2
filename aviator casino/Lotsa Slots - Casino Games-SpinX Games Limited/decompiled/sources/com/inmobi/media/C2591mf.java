package com.inmobi.media;

/* renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2591mf {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5336a;
    public final java.lang.String b;

    public C2591mf(java.lang.String hyperId, java.lang.String spHost) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hyperId, "hyperId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("i6i", "sspId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spHost, "spHost");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("inmobi", "pubId");
        this.f5336a = hyperId;
        this.b = spHost;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2591mf)) {
            return false;
        }
        com.inmobi.media.C2591mf c2591mf = (com.inmobi.media.C2591mf) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5336a, c2591mf.f5336a) && kotlin.jvm.internal.Intrinsics.areEqual("i6i", "i6i") && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2591mf.b) && kotlin.jvm.internal.Intrinsics.areEqual("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (((this.f5336a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final java.lang.String toString() {
        return "NovatiqData(hyperId=" + this.f5336a + ", sspId=i6i, spHost=" + this.b + ", pubId=inmobi)";
    }
}
