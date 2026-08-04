package M1;

import B.v;
import F1.r;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f4540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f4541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4542d;

    public b(long j, long j3, long j7) {
        this.f4542d = j;
        this.f4539a = j7;
        v vVar = new v(13, (byte) 0);
        this.f4540b = vVar;
        v vVar2 = new v(13, (byte) 0);
        this.f4541c = vVar2;
        vVar.d(0L);
        vVar2.d(j3);
    }

    public final boolean a(long j) {
        v vVar = this.f4540b;
        return j - vVar.g(vVar.f965b - 1) < 100000;
    }

    @Override // M1.f
    public final long b(long j) {
        return this.f4540b.g(t.c(this.f4541c, j));
    }

    @Override // M1.f
    public final long c() {
        return this.f4539a;
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        v vVar = this.f4540b;
        int iC = t.c(vVar, j);
        long jG = vVar.g(iC);
        v vVar2 = this.f4541c;
        F1.t tVar = new F1.t(jG, vVar2.g(iC));
        if (jG == j || iC == vVar.f965b - 1) {
            return new r(tVar, tVar);
        }
        int i7 = iC + 1;
        return new r(tVar, new F1.t(vVar.g(i7), vVar2.g(i7)));
    }

    @Override // F1.s
    public final long i() {
        return this.f4542d;
    }
}
