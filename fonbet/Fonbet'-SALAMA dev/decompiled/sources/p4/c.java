package p4;

import s4.h;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f15699a;

    /* renamed from: b, reason: collision with root package name */
    public final h f15700b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15701c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15703e;

    public c(long j, h hVar, long j3, boolean z4, boolean z7) {
        this.f15699a = j;
        if (hVar.f16173b.h() && !hVar.c()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f15700b = hVar;
        this.f15701c = j3;
        this.f15702d = z4;
        this.f15703e = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15699a == cVar.f15699a && this.f15700b.equals(cVar.f15700b) && this.f15701c == cVar.f15701c && this.f15702d == cVar.f15702d && this.f15703e == cVar.f15703e;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15703e).hashCode() + ((Boolean.valueOf(this.f15702d).hashCode() + ((Long.valueOf(this.f15701c).hashCode() + ((this.f15700b.hashCode() + (Long.valueOf(this.f15699a).hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TrackedQuery{id=" + this.f15699a + ", querySpec=" + this.f15700b + ", lastUse=" + this.f15701c + ", complete=" + this.f15702d + ", active=" + this.f15703e + "}";
    }
}
