package Z;

import A0.P0;
import K0.C0196a;
import P.AbstractC0316s0;
import P.AbstractC0317t;
import i4.InterfaceC2015a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import r.C2315A;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f6230a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6232c;

    /* renamed from: h, reason: collision with root package name */
    public P0 f6236h;
    public r i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f6231b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0196a f6233d = new C0196a(10, this);

    /* renamed from: e, reason: collision with root package name */
    public final O0.e f6234e = new O0.e(12, this);
    public final R.e f = new R.e(new r[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f6235g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f6237j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public s(i4.c cVar) {
        this.f6230a = (kotlin.jvm.internal.m) cVar;
    }

    public final void a() {
        synchronized (this.f6235g) {
            R.e eVar = this.f;
            Object[] objArr = eVar.f5106k;
            int i = eVar.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                r rVar = (r) objArr[i5];
                rVar.f6224e.a();
                rVar.f.a();
                rVar.f6228k.a();
                rVar.f6229l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x007a, B:11:0x0082, B:13:0x0092, B:15:0x0087, B:18:0x0022, B:21:0x002e, B:23:0x0043, B:25:0x0051, B:27:0x005b, B:29:0x0066, B:36:0x0073, B:39:0x0098), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        int i;
        synchronized (this.f6235g) {
            try {
                R.e eVar = this.f;
                int i5 = eVar.f5108m;
                int i6 = 0;
                int i7 = 0;
                while (i6 < i5) {
                    r rVar = (r) eVar.f5106k[i6];
                    C2315A c2315a = (C2315A) rVar.f.k(obj);
                    if (c2315a != null) {
                        Object[] objArr = c2315a.f18900b;
                        int[] iArr = c2315a.f18901c;
                        long[] jArr = c2315a.f18899a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j5 = jArr[i8];
                                i = i6;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j5 & 255) < 128) {
                                            int i11 = (i8 << 3) + i10;
                                            Object obj2 = objArr[i11];
                                            int i12 = iArr[i11];
                                            rVar.d(obj, obj2);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i9 != 8) {
                                        break;
                                    }
                                }
                                if (i8 == length) {
                                    break;
                                }
                                i8++;
                                i6 = i;
                            }
                            if (rVar.f.j()) {
                                i7++;
                            } else if (i7 > 0) {
                                Object[] objArr2 = eVar.f5106k;
                                objArr2[i - i7] = objArr2[i];
                            }
                            i6 = i + 1;
                        }
                    }
                    i = i6;
                    if (rVar.f.j()) {
                    }
                    i6 = i + 1;
                }
                int i13 = i5 - i7;
                X3.l.B0(eVar.f5106k, i13, i5);
                eVar.f5108m = i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        boolean z3;
        Set set;
        synchronized (this.f6235g) {
            z3 = this.f6232c;
        }
        if (z3) {
            return false;
        }
        boolean z5 = false;
        while (true) {
            AtomicReference atomicReference = this.f6231b;
            Object obj = atomicReference.get();
            Set set2 = null;
            List list = null;
            List list2 = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0317t.d("Unexpected notification");
                        throw new D2.e();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z5;
            }
            synchronized (this.f6235g) {
                R.e eVar = this.f;
                Object[] objArr = eVar.f5106k;
                int i = eVar.f5108m;
                for (int i5 = 0; i5 < i; i5++) {
                    z5 = ((r) objArr[i5]).b(set2) || z5;
                }
            }
        }
    }

    public final void d(Object obj, i4.c cVar, InterfaceC2015a interfaceC2015a) {
        Object obj2;
        r rVar;
        synchronized (this.f6235g) {
            R.e eVar = this.f;
            Object[] objArr = eVar.f5106k;
            int i = eVar.f5108m;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i5];
                if (((r) obj2).f6220a == cVar) {
                    break;
                } else {
                    i5++;
                }
            }
            rVar = (r) obj2;
            if (rVar == null) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>", cVar);
                kotlin.jvm.internal.z.b(1, cVar);
                rVar = new r(cVar);
                eVar.c(rVar);
            }
        }
        r rVar2 = this.i;
        long j5 = this.f6237j;
        if (j5 != -1 && j5 != X.e.b()) {
            AbstractC0316s0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j5 + "), currentThread={id=" + X.e.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = rVar;
            this.f6237j = X.e.b();
            rVar.a(obj, this.f6234e, interfaceC2015a);
        } finally {
            this.i = rVar2;
            this.f6237j = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        C0196a c0196a = this.f6233d;
        l.f(l.f6206a);
        synchronized (l.f6208c) {
            l.f6212h = X3.m.h0(l.f6212h, c0196a);
        }
        this.f6236h = new P0(c0196a);
    }
}
