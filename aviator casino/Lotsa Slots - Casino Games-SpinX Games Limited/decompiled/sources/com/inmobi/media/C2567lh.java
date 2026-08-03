package com.inmobi.media;

/* renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2567lh extends com.inmobi.media.AbstractC2621nh {

    /* renamed from: a, reason: collision with root package name */
    public final int f5318a;
    public final java.lang.String b;

    public C2567lh(java.lang.String message, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.f5318a = i;
        this.b = message;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2567lh)) {
            return false;
        }
        com.inmobi.media.C2567lh c2567lh = (com.inmobi.media.C2567lh) obj;
        return this.f5318a == c2567lh.f5318a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2567lh.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5318a * 31);
    }

    public final java.lang.String toString() {
        return "Failure(statusCode=" + this.f5318a + ", message=" + this.b + ")";
    }
}
