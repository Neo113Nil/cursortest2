package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vg {

    /* renamed from: a, reason: collision with root package name */
    public final String f6913a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final long i;
    public final Long j;
    public final Ij k;
    public String l;

    public Vg(String url, String id, Map headers, boolean z, String priority, boolean z2, int i, String ownerId, long j, Long l, Ij ij, String status) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f6913a = url;
        this.b = id;
        this.c = headers;
        this.d = z;
        this.e = priority;
        this.f = z2;
        this.g = i;
        this.h = ownerId;
        this.i = j;
        this.j = l;
        this.k = ij;
        this.l = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vg)) {
            return false;
        }
        Vg vg = (Vg) obj;
        return Intrinsics.areEqual(this.f6913a, vg.f6913a) && Intrinsics.areEqual(this.b, vg.b) && Intrinsics.areEqual(this.c, vg.c) && this.d == vg.d && Intrinsics.areEqual(this.e, vg.e) && this.f == vg.f && this.g == vg.g && Intrinsics.areEqual(this.h, vg.h) && this.i == vg.i && Intrinsics.areEqual(this.j, vg.j) && Intrinsics.areEqual(this.k, vg.k) && Intrinsics.areEqual(this.l, vg.l);
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.i) + ((this.h.hashCode() + Hj.a(this.g, (Boolean.hashCode(this.f) + ((this.e.hashCode() + ((Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f6913a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        Long l = this.j;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Ij ij = this.k;
        return this.l.hashCode() + ((hashCode2 + (ij != null ? ij.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Ping(url=" + this.f6913a + ", id=" + this.b + ", headers=" + this.c + ", allowRedirects=" + this.d + ", priority=" + this.e + ", ackRequired=" + this.f + ", retryCount=" + this.g + ", ownerId=" + this.h + ", createdAt=" + this.i + ", retryAfterTimestamp=" + this.j + ", telemetryData=" + this.k + ", status=" + this.l + ")";
    }
}
