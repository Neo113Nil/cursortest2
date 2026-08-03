package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Za extends com.inmobi.media.AbstractC2272ab {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f5082a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;

    public Za(android.app.Activity activity, java.lang.String finalUrl, java.lang.String callerId, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalUrl, "finalUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerId, "callerId");
        this.f5082a = activity;
        this.b = finalUrl;
        this.c = callerId;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Za)) {
            return false;
        }
        com.inmobi.media.Za za = (com.inmobi.media.Za) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5082a, za.f5082a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, za.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, za.c) && this.d == za.d;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5082a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Valid(activity=" + this.f5082a + ", finalUrl=" + this.b + ", callerId=" + this.c + ", overlay=" + this.d + ")";
    }
}
