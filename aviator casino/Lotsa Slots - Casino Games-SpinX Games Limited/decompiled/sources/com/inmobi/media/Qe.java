package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qe {

    /* renamed from: a, reason: collision with root package name */
    public final long f4918a;
    public final java.util.Map b;
    public final int c;
    public final java.lang.String d;

    public Qe(long j, java.util.Map headers, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        this.f4918a = j;
        this.b = headers;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Qe)) {
            return false;
        }
        com.inmobi.media.Qe qe = (com.inmobi.media.Qe) obj;
        return this.f4918a == qe.f4918a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, qe.b) && this.c == qe.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, qe.d);
    }

    public final int hashCode() {
        int a2 = com.inmobi.media.AbstractC2755si.a(this.c, (this.b.hashCode() + (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f4918a) * 31)) * 31, 31);
        java.lang.String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "NetworkMetaData(timeTaken=" + this.f4918a + ", headers=" + this.b + ", contentLength=" + this.c + ", contentType=" + this.d + ")";
    }
}
