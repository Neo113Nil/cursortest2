package p018c2;

import A1.P0;
import A1.Q0;
import A1.R0;
import p024d2.b;
import p151v2.t;

/* JADX INFO: renamed from: c2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0759e extends AbstractC0772s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10339f;

    public C0759e(R0 r7, long j, long j3) throws C0760f {
        super(r7);
        boolean z4 = false;
        if (r7.h() != 1) {
            throw new C0760f(0);
        }
        Q0 q0M = r7.m(0, new Q0(), 0L);
        long jMax = Math.max(0L, j);
        if (!q0M.f205C && jMax != 0 && !q0M.f218y) {
            throw new C0760f(1);
        }
        long jMax2 = j3 == Long.MIN_VALUE ? q0M.f207E : Math.max(0L, j3);
        long j7 = q0M.f207E;
        if (j7 != -9223372036854775807L) {
            jMax2 = jMax2 > j7 ? j7 : jMax2;
            if (jMax > jMax2) {
                throw new C0760f(2);
            }
        }
        this.f10336c = jMax;
        this.f10337d = jMax2;
        this.f10338e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (q0M.f219z && (jMax2 == -9223372036854775807L || (j7 != -9223372036854775807L && jMax2 == j7))) {
            z4 = true;
        }
        this.f10339f = z4;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p5, boolean z4) {
        this.f10399b.f(0, p5, z4);
        long j = p5.f190e - this.f10336c;
        long j3 = this.f10338e;
        p5.h(p5.f186a, p5.f187b, 0, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - j, j, b.f12387f, false);
        return p5;
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q1, long j) {
        this.f10399b.m(0, q1, 0L);
        long j3 = q1.f210H;
        long j7 = this.f10336c;
        q1.f210H = j3 + j7;
        q1.f207E = this.f10338e;
        q1.f219z = this.f10339f;
        long j8 = q1.f206D;
        if (j8 != -9223372036854775807L) {
            long jMax = Math.max(j8, j7);
            q1.f206D = jMax;
            long j9 = this.f10337d;
            if (j9 != -9223372036854775807L) {
                jMax = Math.min(jMax, j9);
            }
            q1.f206D = jMax - j7;
        }
        long jN = t.N(j7);
        long j10 = q1.f215e;
        if (j10 != -9223372036854775807L) {
            q1.f215e = j10 + jN;
        }
        long j11 = q1.f216f;
        if (j11 != -9223372036854775807L) {
            q1.f216f = j11 + jN;
        }
        return q1;
    }
}
