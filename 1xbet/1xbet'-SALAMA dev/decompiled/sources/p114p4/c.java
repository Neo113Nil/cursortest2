package p114p4;

import p134s4.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15709e;

    public c(long j, h hVar, long j3, boolean z4, boolean z7) {
        this.f15705a = j;
        if (hVar.f16179b.h() && !hVar.c()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f15706b = hVar;
        this.f15707c = j3;
        this.f15708d = z4;
        this.f15709e = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15705a == cVar.f15705a && this.f15706b.equals(cVar.f15706b) && this.f15707c == cVar.f15707c && this.f15708d == cVar.f15708d && this.f15709e == cVar.f15709e;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15709e).hashCode() + ((Boolean.valueOf(this.f15708d).hashCode() + ((Long.valueOf(this.f15707c).hashCode() + ((this.f15706b.hashCode() + (Long.valueOf(this.f15705a).hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TrackedQuery{id=" + this.f15705a + ", querySpec=" + this.f15706b + ", lastUse=" + this.f15707c + ", complete=" + this.f15708d + ", active=" + this.f15709e + "}";
    }
}
