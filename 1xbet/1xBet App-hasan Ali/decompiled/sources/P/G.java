package P;

import r.C2315A;

/* loaded from: classes.dex */
public final class G extends Z.w {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f4311h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f4312c;

    /* renamed from: d, reason: collision with root package name */
    public int f4313d;

    /* renamed from: e, reason: collision with root package name */
    public C2315A f4314e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public int f4315g;

    public G(long j5) {
        super(j5);
        C2315A c2315a = r.K.f18952a;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>", c2315a);
        this.f4314e = c2315a;
        this.f = f4311h;
    }

    @Override // Z.w
    public final void a(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>", wVar);
        G g5 = (G) wVar;
        this.f4314e = g5.f4314e;
        this.f = g5.f;
        this.f4315g = g5.f4315g;
    }

    @Override // Z.w
    public final Z.w b(long j5) {
        return new G(j5);
    }

    public final boolean c(H h3, Z.f fVar) {
        boolean z3;
        boolean z5;
        Object obj = Z.l.f6208c;
        synchronized (obj) {
            z3 = true;
            if (this.f4312c == fVar.g()) {
                if (this.f4313d == fVar.h()) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        if (this.f == f4311h || (z5 && this.f4315g != d(h3, fVar))) {
            z3 = false;
        }
        if (!z3 || !z5) {
            return z3;
        }
        synchronized (obj) {
            this.f4312c = fVar.g();
            this.f4313d = fVar.h();
        }
        return z3;
    }

    public final int d(H h3, Z.f fVar) {
        C2315A c2315a;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        Z.w j5;
        synchronized (Z.l.f6208c) {
            c2315a = this.f4314e;
        }
        int i9 = 1;
        int i10 = 7;
        if (!(c2315a.f18903e != 0)) {
            return 7;
        }
        R.e n5 = AbstractC0329z.n();
        Object[] objArr = n5.f5106k;
        int i11 = n5.f5108m;
        for (int i12 = 0; i12 < i11; i12++) {
            ((C0312q) objArr[i12]).b();
        }
        try {
            Object[] objArr2 = c2315a.f18900b;
            int[] iArr = c2315a.f18901c;
            long[] jArr = c2315a.f18899a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i6 = 7;
                int i13 = 0;
                while (true) {
                    long j6 = jArr[i13];
                    if ((((~j6) << i10) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        i7 = i10;
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j6 & 255) < 128) {
                                int i17 = (i13 << 3) + i16;
                                i8 = i14;
                                Z.u uVar = (Z.u) objArr2[i17];
                                if (iArr[i17] == i9) {
                                    if (uVar instanceof H) {
                                        H h4 = (H) uVar;
                                        i = 0;
                                        try {
                                            j5 = h4.h((G) Z.l.j(h4.f4318n, fVar), fVar, false, h4.f4316l);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = n5.f5106k;
                                            int i18 = n5.f5108m;
                                            for (int i19 = i; i19 < i18; i19++) {
                                                ((C0312q) objArr3[i19]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i = 0;
                                        j5 = Z.l.j(uVar.c(), fVar);
                                    }
                                    int identityHashCode = ((i6 * 31) + System.identityHashCode(j5)) * 31;
                                    long j7 = j5.f6242a;
                                    i6 = identityHashCode + ((int) (j7 ^ (j7 >>> 32)));
                                    j6 >>= i8;
                                    i16++;
                                    i14 = i8;
                                    i9 = 1;
                                }
                            } else {
                                i8 = i14;
                            }
                            j6 >>= i8;
                            i16++;
                            i14 = i8;
                            i9 = 1;
                        }
                        i5 = 0;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        i7 = i10;
                        i5 = 0;
                    }
                    if (i13 == length) {
                        i10 = i6;
                        break;
                    }
                    i13++;
                    i10 = i7;
                    i9 = 1;
                }
            } else {
                i5 = 0;
            }
            i6 = i10;
            Object[] objArr4 = n5.f5106k;
            int i20 = n5.f5108m;
            for (int i21 = i5; i21 < i20; i21++) {
                ((C0312q) objArr4[i21]).a();
            }
            return i6;
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }
}
