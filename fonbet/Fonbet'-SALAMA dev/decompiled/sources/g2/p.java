package g2;

import A1.X;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends n {
    public final v2.n j;

    /* renamed from: k, reason: collision with root package name */
    public final v2.n f13169k;

    /* renamed from: l, reason: collision with root package name */
    public final long f13170l;

    public p(j jVar, long j, long j3, long j7, long j8, long j9, List list, long j10, v2.n nVar, v2.n nVar2, long j11, long j12) {
        super(jVar, j, j3, j7, j9, list, j10, j11, j12);
        this.j = nVar;
        this.f13169k = nVar2;
        this.f13170l = j8;
    }

    @Override // g2.s
    public final j a(m mVar) {
        v2.n nVar = this.j;
        if (nVar == null) {
            return this.f13175a;
        }
        X x4 = mVar.f13158a;
        return new j(nVar.c(x4.f311y, x4.f304a, 0L, 0L), 0L, -1L);
    }

    @Override // g2.n
    public final long d(long j) {
        if (this.f13165f != null) {
            return r0.size();
        }
        long j3 = this.f13170l;
        if (j3 != -1) {
            return (j3 - this.f13163d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f13176b));
        BigInteger multiply2 = BigInteger.valueOf(this.f13164e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = G3.a.f2868a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // g2.n
    public final j h(k kVar, long j) {
        long j3 = this.f13163d;
        List list = this.f13165f;
        long j7 = list != null ? ((q) list.get((int) (j - j3))).f13171a : (j - j3) * this.f13164e;
        X x4 = kVar.f13158a;
        return new j(this.f13169k.c(x4.f311y, x4.f304a, j, j7), 0L, -1L);
    }
}
