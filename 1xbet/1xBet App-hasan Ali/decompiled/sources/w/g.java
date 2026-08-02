package w;

import a1.z;

/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    public final long f20463a;

    public g(long j5) {
        this.f20463a = j5;
    }

    @Override // a1.z
    public final long a(W0.k kVar, long j5, W0.m mVar, long j6) {
        int i = kVar.f6011a;
        long j7 = this.f20463a;
        return G4.l.a(v1.j.a(i + ((int) (j7 >> 32)), (int) (j6 >> 32), (int) (j5 >> 32), mVar == W0.m.f6016k), v1.j.a(kVar.f6012b + ((int) (j7 & 4294967295L)), (int) (j6 & 4294967295L), (int) (j5 & 4294967295L), true));
    }
}
