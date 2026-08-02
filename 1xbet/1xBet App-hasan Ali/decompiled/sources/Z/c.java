package Z;

import java.util.Arrays;
import java.util.HashMap;
import r.C2322H;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f6183o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6184p;

    public c(long j5, j jVar, i4.c cVar, i4.c cVar2, b bVar) {
        super(j5, jVar, cVar, cVar2);
        this.f6183o = bVar;
        bVar.k();
    }

    @Override // Z.b, Z.f
    public final void c() {
        if (this.f6189c) {
            return;
        }
        super.c();
        if (this.f6184p) {
            return;
        }
        this.f6184p = true;
        this.f6183o.l();
    }

    @Override // Z.b
    public final q w() {
        c cVar;
        b bVar = this.f6183o;
        if (bVar.f6182m || bVar.f6189c) {
            return new g();
        }
        C2322H c2322h = this.f6178h;
        long j5 = this.f6188b;
        HashMap c5 = c2322h != null ? l.c(bVar.g(), this, this.f6183o.d()) : null;
        synchronized (l.f6208c) {
            try {
                l.d(this);
                try {
                    if (c2322h == null || c2322h.f18936d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        q z3 = cVar.z(this.f6183o.g(), c2322h, c5, this.f6183o.d());
                        if (!z3.equals(h.f6191b)) {
                            return z3;
                        }
                        C2322H x5 = cVar.f6183o.x();
                        if (x5 != null) {
                            x5.j(c2322h);
                        } else {
                            cVar.f6183o.C(c2322h);
                            cVar.f6178h = null;
                        }
                    }
                    if (kotlin.jvm.internal.l.h(cVar.f6183o.g(), j5) < 0) {
                        cVar.f6183o.v();
                    }
                    b bVar2 = cVar.f6183o;
                    bVar2.r(bVar2.d().d(j5).c(cVar.f6179j));
                    cVar.f6183o.A(j5);
                    b bVar3 = cVar.f6183o;
                    int i = cVar.f6190d;
                    cVar.f6190d = -1;
                    if (i >= 0) {
                        int[] iArr = bVar3.f6180k;
                        kotlin.jvm.internal.l.f("<this>", iArr);
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        bVar3.f6180k = copyOf;
                    } else {
                        bVar3.getClass();
                    }
                    cVar.f6183o.B(cVar.f6179j);
                    b bVar4 = cVar.f6183o;
                    int[] iArr2 = cVar.f6180k;
                    bVar4.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = bVar4.f6180k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            kotlin.jvm.internal.l.c(copyOf2);
                            iArr2 = copyOf2;
                        }
                        bVar4.f6180k = iArr2;
                    }
                    cVar.f6182m = true;
                    if (!cVar.f6184p) {
                        cVar.f6184p = true;
                        cVar.f6183o.l();
                    }
                    return h.f6191b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
