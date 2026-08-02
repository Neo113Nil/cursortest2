package Z;

import P.AbstractC0329z;
import P.C0312q;
import P.G;
import P.H;
import i4.InterfaceC2015a;
import java.util.HashMap;
import r.C2315A;
import r.C2321G;
import r.C2322H;
import t3.AbstractC2425d;
import z0.o0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final i4.c f6220a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6221b;

    /* renamed from: c, reason: collision with root package name */
    public C2315A f6222c;

    /* renamed from: j, reason: collision with root package name */
    public int f6227j;

    /* renamed from: d, reason: collision with root package name */
    public int f6223d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final C2321G f6224e = AbstractC2425d.o();
    public final C2321G f = new C2321G();

    /* renamed from: g, reason: collision with root package name */
    public final C2322H f6225g = new C2322H();

    /* renamed from: h, reason: collision with root package name */
    public final R.e f6226h = new R.e(new H[16]);
    public final C0312q i = new C0312q(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final C2321G f6228k = AbstractC2425d.o();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f6229l = new HashMap();

    public r(i4.c cVar) {
        this.f6220a = cVar;
    }

    public final void a(Object obj, O0.e eVar, InterfaceC2015a interfaceC2015a) {
        boolean z3;
        int i;
        int i5;
        Object obj2 = this.f6221b;
        C2315A c2315a = this.f6222c;
        int i6 = this.f6223d;
        this.f6221b = obj;
        this.f6222c = (C2315A) this.f.g(obj);
        if (this.f6223d == -1) {
            long g5 = l.k().g();
            this.f6223d = (int) (g5 ^ (g5 >>> 32));
        }
        C0312q c0312q = this.i;
        R.e n5 = AbstractC0329z.n();
        boolean z5 = true;
        try {
            n5.c(c0312q);
            q.i(interfaceC2015a, eVar);
            n5.l(n5.f5108m - 1);
            Object obj3 = this.f6221b;
            kotlin.jvm.internal.l.c(obj3);
            int i7 = this.f6223d;
            C2315A c2315a2 = this.f6222c;
            if (c2315a2 != null) {
                long[] jArr = c2315a2.f18899a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr[i8];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            z3 = z5;
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j5 & 255) < 128) {
                                    int i12 = (i8 << 3) + i11;
                                    i5 = i9;
                                    Object obj4 = c2315a2.f18900b[i12];
                                    i = i11;
                                    boolean z6 = c2315a2.f18901c[i12] != i7 ? z3 : false;
                                    if (z6) {
                                        d(obj3, obj4);
                                    }
                                    if (z6) {
                                        c2315a2.g(i12);
                                    }
                                } else {
                                    i = i11;
                                    i5 = i9;
                                }
                                j5 >>= i5;
                                i11 = i + 1;
                                i9 = i5;
                            }
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            z3 = z5;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        z5 = z3;
                    }
                }
            }
            this.f6221b = obj2;
            this.f6222c = c2315a;
            this.f6223d = i6;
        } catch (Throwable th) {
            n5.l(n5.f5108m - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b(java.util.Set r47) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.r.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i, Object obj2, C2315A c2315a) {
        int i5;
        if (this.f6227j > 0) {
            return;
        }
        int c5 = c2315a.c(obj);
        if (c5 < 0) {
            c5 = ~c5;
            i5 = -1;
        } else {
            i5 = c2315a.f18901c[c5];
        }
        c2315a.f18900b[c5] = obj;
        c2315a.f18901c[c5] = i;
        if ((obj instanceof H) && i5 != i) {
            G i6 = ((H) obj).i();
            this.f6229l.put(obj, i6.f);
            C2315A c2315a2 = i6.f4314e;
            C2321G c2321g = this.f6228k;
            AbstractC2425d.F(c2321g, obj);
            Object[] objArr = c2315a2.f18900b;
            long[] jArr = c2315a2.f18899a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j5 & 255) < 128) {
                                u uVar = (u) objArr[(i7 << 3) + i9];
                                if (uVar instanceof v) {
                                    ((v) uVar).g(2);
                                }
                                AbstractC2425d.h(c2321g, uVar, obj);
                            }
                            j5 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        if (i5 == -1) {
            if (obj instanceof v) {
                ((v) obj).g(2);
            }
            AbstractC2425d.h(this.f6224e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        C2321G c2321g = this.f6224e;
        AbstractC2425d.E(c2321g, obj2, obj);
        if (!(obj2 instanceof H) || c2321g.c(obj2)) {
            return;
        }
        AbstractC2425d.F(this.f6228k, obj2);
        this.f6229l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j5;
        char c5;
        long j6;
        int i;
        boolean z3;
        long j7;
        C2321G c2321g = this.f;
        long[] jArr3 = c2321g.f18928a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j8 = jArr3[i5];
            char c6 = 7;
            long j9 = -9187201950435737472L;
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j8 & 255) < 128) {
                        int i9 = (i5 << 3) + i8;
                        c5 = c6;
                        Object obj = c2321g.f18929b[i9];
                        j6 = j9;
                        C2315A c2315a = (C2315A) c2321g.f18930c[i9];
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope", obj);
                        boolean z5 = ((o0) obj).z();
                        if (!z5) {
                            Object[] objArr = c2315a.f18900b;
                            int[] iArr = c2315a.f18901c;
                            long[] jArr4 = c2315a.f18899a;
                            int i10 = i6;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j5 = j8;
                                int i11 = 0;
                                while (true) {
                                    long j10 = jArr4[i11];
                                    long[] jArr5 = jArr4;
                                    z3 = z5;
                                    if ((((~j10) << c5) & j10 & j6) != j6) {
                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((j10 & 255) < 128) {
                                                int i14 = (i11 << 3) + i13;
                                                j7 = j10;
                                                Object obj2 = objArr[i14];
                                                int i15 = iArr[i14];
                                                d(obj, obj2);
                                            } else {
                                                j7 = j10;
                                            }
                                            j10 = j7 >> i10;
                                        }
                                        if (i12 != i10) {
                                            break;
                                        }
                                    }
                                    if (i11 == length2) {
                                        break;
                                    }
                                    i11++;
                                    z5 = z3;
                                    jArr4 = jArr5;
                                    i10 = 8;
                                }
                                if (!z3) {
                                    c2321g.l(i9);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j5 = j8;
                        z3 = z5;
                        if (!z3) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j5 = j8;
                        c5 = c6;
                        j6 = j9;
                        i = i6;
                    }
                    i8++;
                    i6 = i;
                    j8 = j5 >> i;
                    c6 = c5;
                    j9 = j6;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i7 != i6) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            jArr3 = jArr;
        }
    }
}
