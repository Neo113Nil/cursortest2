package P3;

import java.math.RoundingMode;
import m3.C8050C;
import m3.N;
import m3.s;

/* loaded from: classes8.dex */
final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21762b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21763c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21765e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21766f;

    private d(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f21761a = i11;
        this.f21762b = i12;
        this.f21763c = i13;
        this.f21764d = i14;
        this.f21765e = i15;
        this.f21766f = i16;
    }

    public static d c(C8050C c8050c) {
        int s11 = c8050c.s();
        c8050c.S(12);
        c8050c.s();
        int s12 = c8050c.s();
        int s13 = c8050c.s();
        c8050c.S(4);
        int s14 = c8050c.s();
        int s15 = c8050c.s();
        c8050c.S(4);
        return new d(s11, s12, s13, s14, s15, c8050c.s());
    }

    public final long a() {
        long j11 = this.f21764d;
        long j12 = this.f21762b * 1000000;
        long j13 = this.f21763c;
        int i11 = N.f74289a;
        return N.Z(j11, j12, j13, RoundingMode.DOWN);
    }

    public final int b() {
        int i11 = this.f21761a;
        if (i11 == 1935960438) {
            return 2;
        }
        if (i11 == 1935963489) {
            return 1;
        }
        if (i11 == 1937012852) {
            return 3;
        }
        s.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i11));
        return -1;
    }

    @Override // P3.a
    public final int getType() {
        return 1752331379;
    }
}
