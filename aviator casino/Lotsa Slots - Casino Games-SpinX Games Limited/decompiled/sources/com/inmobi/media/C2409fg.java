package com.inmobi.media;

/* renamed from: com.inmobi.media.fg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2409fg {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Zf f5201a;
    public final int b;
    public final java.lang.String c;
    public final long d;

    public C2409fg(com.inmobi.media.Zf ping, int i, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ping, "ping");
        this.f5201a = ping;
        this.b = i;
        this.c = str;
        this.d = currentTimeMillis;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2409fg)) {
            return false;
        }
        com.inmobi.media.C2409fg c2409fg = (com.inmobi.media.C2409fg) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5201a, c2409fg.f5201a) && this.b == c2409fg.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2409fg.c) && this.d == c2409fg.d;
    }

    public final int hashCode() {
        int a2 = com.inmobi.media.AbstractC2755si.a(this.b, this.f5201a.hashCode() * 31, 31);
        java.lang.String str = this.c;
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "PingResult(ping=" + this.f5201a + ", statusCode=" + this.b + ", error=" + this.c + ", timestamp=" + this.d + ")";
    }
}
