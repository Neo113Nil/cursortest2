package c2;

import A1.P0;
import A1.Q0;
import A1.R0;
import d2.C0959b;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799e extends AbstractC0812s {

    /* renamed from: c, reason: collision with root package name */
    public final long f10336c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10337d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10338e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10339f;

    public C0799e(R0 r02, long j, long j3) {
        super(r02);
        boolean z4 = false;
        if (r02.h() != 1) {
            throw new C0800f(0);
        }
        Q0 m7 = r02.m(0, new Q0(), 0L);
        long max = Math.max(0L, j);
        if (!m7.f205C && max != 0 && !m7.f218y) {
            throw new C0800f(1);
        }
        long max2 = j3 == Long.MIN_VALUE ? m7.f207E : Math.max(0L, j3);
        long j7 = m7.f207E;
        if (j7 != -9223372036854775807L) {
            max2 = max2 > j7 ? j7 : max2;
            if (max > max2) {
                throw new C0800f(2);
            }
        }
        this.f10336c = max;
        this.f10337d = max2;
        this.f10338e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m7.f219z && (max2 == -9223372036854775807L || (j7 != -9223372036854775807L && max2 == j7))) {
            z4 = true;
        }
        this.f10339f = z4;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p02, boolean z4) {
        this.f10399b.f(0, p02, z4);
        long j = p02.f190e - this.f10336c;
        long j3 = this.f10338e;
        p02.h(p02.f186a, p02.f187b, 0, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - j, j, C0959b.f12381f, false);
        return p02;
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q02, long j) {
        this.f10399b.m(0, q02, 0L);
        long j3 = q02.f210H;
        long j7 = this.f10336c;
        q02.f210H = j3 + j7;
        q02.f207E = this.f10338e;
        q02.f219z = this.f10339f;
        long j8 = q02.f206D;
        if (j8 != -9223372036854775807L) {
            long max = Math.max(j8, j7);
            q02.f206D = max;
            long j9 = this.f10337d;
            if (j9 != -9223372036854775807L) {
                max = Math.min(max, j9);
            }
            q02.f206D = max - j7;
        }
        long N7 = v2.t.N(j7);
        long j10 = q02.f215e;
        if (j10 != -9223372036854775807L) {
            q02.f215e = j10 + N7;
        }
        long j11 = q02.f216f;
        if (j11 != -9223372036854775807L) {
            q02.f216f = j11 + N7;
        }
        return q02;
    }
}
