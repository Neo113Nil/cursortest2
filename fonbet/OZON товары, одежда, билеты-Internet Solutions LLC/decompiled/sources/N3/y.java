package N3;

import j3.C7272n;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import m3.C8049B;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f18653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18656d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18657e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18658f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18659g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18660h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18661i;

    /* renamed from: j, reason: collision with root package name */
    public final long f18662j;

    /* renamed from: k, reason: collision with root package name */
    public final a f18663k;

    /* renamed from: l, reason: collision with root package name */
    private final j3.t f18664l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f18665a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f18666b;

        public a(long[] jArr, long[] jArr2) {
            this.f18665a = jArr;
            this.f18666b = jArr2;
        }
    }

    public y(int i11, byte[] bArr) {
        C8049B c8049b = new C8049B(bArr.length, bArr);
        c8049b.n(i11 * 8);
        this.f18653a = c8049b.h(16);
        this.f18654b = c8049b.h(16);
        this.f18655c = c8049b.h(24);
        this.f18656d = c8049b.h(24);
        int h11 = c8049b.h(20);
        this.f18657e = h11;
        this.f18658f = g(h11);
        this.f18659g = c8049b.h(3) + 1;
        int h12 = c8049b.h(5) + 1;
        this.f18660h = h12;
        this.f18661i = d(h12);
        this.f18662j = c8049b.j(36);
        this.f18663k = null;
        this.f18664l = null;
    }

    private static int d(int i11) {
        if (i11 == 8) {
            return 1;
        }
        if (i11 == 12) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 20) {
            return 5;
        }
        if (i11 != 24) {
            return i11 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int g(int i11) {
        switch (i11) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final y a(List<Z3.a> list) {
        j3.t tVar = new j3.t(list);
        j3.t tVar2 = this.f18664l;
        if (tVar2 != null) {
            tVar = tVar2.b(tVar);
        }
        j3.t tVar3 = tVar;
        return new y(this.f18653a, this.f18654b, this.f18655c, this.f18656d, this.f18657e, this.f18659g, this.f18660h, this.f18662j, this.f18663k, tVar3);
    }

    public final y b(a aVar) {
        return new y(this.f18653a, this.f18654b, this.f18655c, this.f18656d, this.f18657e, this.f18659g, this.f18660h, this.f18662j, aVar, this.f18664l);
    }

    public final y c(List<String> list) {
        j3.t c11 = P.c(list);
        j3.t tVar = this.f18664l;
        if (tVar != null) {
            c11 = tVar.b(c11);
        }
        j3.t tVar2 = c11;
        return new y(this.f18653a, this.f18654b, this.f18655c, this.f18656d, this.f18657e, this.f18659g, this.f18660h, this.f18662j, this.f18663k, tVar2);
    }

    public final long e() {
        long j11 = this.f18662j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / this.f18657e;
    }

    public final C7272n f(byte[] bArr, j3.t tVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i11 = this.f18656d;
        if (i11 <= 0) {
            i11 = -1;
        }
        j3.t tVar2 = this.f18664l;
        if (tVar2 != null) {
            tVar = tVar2.b(tVar);
        }
        C7272n.a aVar = new C7272n.a();
        aVar.y0("audio/flac");
        aVar.o0(i11);
        aVar.T(this.f18659g);
        aVar.z0(this.f18657e);
        int i12 = m3.N.f74289a;
        aVar.s0(m3.N.C(this.f18660h, ByteOrder.LITTLE_ENDIAN));
        aVar.k0(Collections.singletonList(bArr));
        aVar.r0(tVar);
        return aVar.P();
    }

    private y(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, a aVar, j3.t tVar) {
        this.f18653a = i11;
        this.f18654b = i12;
        this.f18655c = i13;
        this.f18656d = i14;
        this.f18657e = i15;
        this.f18658f = g(i15);
        this.f18659g = i16;
        this.f18660h = i17;
        this.f18661i = d(i17);
        this.f18662j = j11;
        this.f18663k = aVar;
        this.f18664l = tVar;
    }
}
