package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3739gg {

    /* renamed from: a, reason: collision with root package name */
    public final String f7123a;
    public final String b;

    public C3739gg(String hyperId, String spHost) {
        Intrinsics.checkNotNullParameter(hyperId, "hyperId");
        Intrinsics.checkNotNullParameter("i6i", "sspId");
        Intrinsics.checkNotNullParameter(spHost, "spHost");
        Intrinsics.checkNotNullParameter("inmobi", "pubId");
        this.f7123a = hyperId;
        this.b = spHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3739gg)) {
            return false;
        }
        C3739gg c3739gg = (C3739gg) obj;
        return Intrinsics.areEqual(this.f7123a, c3739gg.f7123a) && Intrinsics.areEqual("i6i", "i6i") && Intrinsics.areEqual(this.b, c3739gg.b) && Intrinsics.areEqual("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (((this.f7123a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f7123a + ", sspId=i6i, spHost=" + this.b + ", pubId=inmobi)";
    }
}
