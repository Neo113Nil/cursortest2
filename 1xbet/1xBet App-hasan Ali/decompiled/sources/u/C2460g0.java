package u;

/* renamed from: u.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2460g0 implements C0 {

    /* renamed from: k, reason: collision with root package name */
    public final C0 f19815k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19816l;

    public C2460g0(C0 c02, long j5) {
        this.f19815k = c02;
        this.f19816l = j5;
    }

    @Override // u.C0
    public final boolean b() {
        return this.f19815k.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2460g0)) {
            return false;
        }
        C2460g0 c2460g0 = (C2460g0) obj;
        return c2460g0.f19816l == this.f19816l && kotlin.jvm.internal.l.a(c2460g0.f19815k, this.f19815k);
    }

    @Override // u.C0
    public final AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        long j6 = this.f19816l;
        return j5 < j6 ? abstractC2470q : this.f19815k.g(j5 - j6, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    public final int hashCode() {
        int hashCode = this.f19815k.hashCode() * 31;
        long j5 = this.f19816l;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    @Override // u.C0
    public final long m(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return this.f19815k.m(abstractC2470q, abstractC2470q2, abstractC2470q3) + this.f19816l;
    }

    @Override // u.C0
    public final AbstractC2470q p(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        long j6 = this.f19816l;
        return j5 < j6 ? abstractC2470q3 : this.f19815k.p(j5 - j6, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    @Override // u.C0
    public final AbstractC2470q r(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return p(m(abstractC2470q, abstractC2470q2, abstractC2470q3), abstractC2470q, abstractC2470q2, abstractC2470q3);
    }
}
