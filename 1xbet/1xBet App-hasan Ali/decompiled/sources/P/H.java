package P;

import i4.InterfaceC2015a;
import r.C2315A;

/* loaded from: classes.dex */
public final class H extends Z.v implements d1 {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2015a f4316l;

    /* renamed from: m, reason: collision with root package name */
    public final U0 f4317m;

    /* renamed from: n, reason: collision with root package name */
    public G f4318n = new G(Z.l.k().g());

    public H(InterfaceC2015a interfaceC2015a, U0 u02) {
        this.f4316l = interfaceC2015a;
        this.f4317m = u02;
    }

    @Override // Z.u
    public final Z.w c() {
        return this.f4318n;
    }

    @Override // Z.u
    public final void e(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>", wVar);
        this.f4318n = (G) wVar;
    }

    @Override // P.d1
    public final Object getValue() {
        i4.c e3 = Z.l.k().e();
        if (e3 != null) {
            e3.c(this);
        }
        Z.f k5 = Z.l.k();
        return h((G) Z.l.j(this.f4318n, k5), k5, true, this.f4316l).f;
    }

    public final G h(G g5, Z.f fVar, boolean z3, InterfaceC2015a interfaceC2015a) {
        R.e n5;
        U0 u02;
        int i;
        G g6 = g5;
        if (g6.c(this, fVar)) {
            if (z3) {
                n5 = AbstractC0329z.n();
                Object[] objArr = n5.f5106k;
                int i5 = n5.f5108m;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C0312q) objArr[i6]).b();
                }
                try {
                    C2315A c2315a = g6.f4314e;
                    v3.e eVar = V0.f4408a;
                    X.f fVar2 = (X.f) eVar.u();
                    if (fVar2 == null) {
                        fVar2 = new X.f();
                        eVar.L(fVar2);
                    }
                    int i7 = fVar2.f6057a;
                    Object[] objArr2 = c2315a.f18900b;
                    int[] iArr = c2315a.f18901c;
                    long[] jArr = c2315a.f18899a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j5 = jArr[i8];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j5 & 255) < 128) {
                                        int i12 = (i8 << 3) + i11;
                                        i = i9;
                                        Z.u uVar = (Z.u) objArr2[i12];
                                        fVar2.f6057a = i7 + iArr[i12];
                                        i4.c e3 = fVar.e();
                                        if (e3 != null) {
                                            e3.c(uVar);
                                        }
                                    } else {
                                        i = i9;
                                    }
                                    j5 >>= i;
                                    i11++;
                                    i9 = i;
                                }
                                if (i10 != i9) {
                                    break;
                                }
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                        }
                    }
                    fVar2.f6057a = i7;
                    Object[] objArr3 = n5.f5106k;
                    int i13 = n5.f5108m;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((C0312q) objArr3[i14]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g6;
        }
        final C2315A c2315a2 = new C2315A();
        v3.e eVar2 = V0.f4408a;
        final X.f fVar3 = (X.f) eVar2.u();
        if (fVar3 == null) {
            fVar3 = new X.f();
            eVar2.L(fVar3);
        }
        final int i15 = fVar3.f6057a;
        n5 = AbstractC0329z.n();
        Object[] objArr4 = n5.f5106k;
        int i16 = n5.f5108m;
        for (int i17 = 0; i17 < i16; i17++) {
            ((C0312q) objArr4[i17]).b();
        }
        try {
            fVar3.f6057a = i15 + 1;
            Object i18 = Z.q.i(interfaceC2015a, new i4.c() { // from class: P.F
                @Override // i4.c
                public final Object c(Object obj) {
                    if (obj == H.this) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof Z.u) {
                        int i19 = fVar3.f6057a - i15;
                        C2315A c2315a3 = c2315a2;
                        int d5 = c2315a3.d(obj);
                        c2315a3.h(Math.min(i19, d5 >= 0 ? c2315a3.f18901c[d5] : Integer.MAX_VALUE), obj);
                    }
                    return W3.o.f6046a;
                }
            });
            fVar3.f6057a = i15;
            Object[] objArr5 = n5.f5106k;
            int i19 = n5.f5108m;
            for (int i20 = 0; i20 < i19; i20++) {
                ((C0312q) objArr5[i20]).a();
            }
            Object obj = Z.l.f6208c;
            synchronized (obj) {
                try {
                    Z.f k5 = Z.l.k();
                    Object obj2 = g6.f;
                    if (obj2 == G.f4311h || (u02 = this.f4317m) == null || !u02.a(i18, obj2)) {
                        g6 = (G) Z.l.n(this.f4318n, this, k5);
                        g6.f4314e = c2315a2;
                        g6.f4315g = g6.d(this, k5);
                        g6.f = i18;
                    } else {
                        g6.f4314e = c2315a2;
                        g6.f4315g = g6.d(this, k5);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            X.f fVar4 = (X.f) V0.f4408a.u();
            if (fVar4 == null || fVar4.f6057a != 0) {
                return g6;
            }
            Z.l.k().m();
            synchronized (obj) {
                Z.f k6 = Z.l.k();
                g6.f4312c = k6.g();
                g6.f4313d = k6.h();
            }
            return g6;
        } finally {
            Object[] objArr6 = n5.f5106k;
            int i21 = n5.f5108m;
            for (int i22 = 0; i22 < i21; i22++) {
                ((C0312q) objArr6[i22]).a();
            }
        }
    }

    public final G i() {
        Z.f k5 = Z.l.k();
        return h((G) Z.l.j(this.f4318n, k5), k5, false, this.f4316l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        G g5 = (G) Z.l.i(this.f4318n);
        sb.append(g5.c(this, Z.l.k()) ? String.valueOf(g5.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
