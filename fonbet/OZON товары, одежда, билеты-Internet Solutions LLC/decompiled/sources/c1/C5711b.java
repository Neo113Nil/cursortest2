package c1;

import S0.B0;
import androidx.collection.Y;
import c1.AbstractC5716g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5711b extends AbstractC5715f {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final int[] f56212n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    private final Function1<Object, Unit> f56213e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1<Object, Unit> f56214f;

    /* renamed from: g, reason: collision with root package name */
    private int f56215g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.collection.M<InterfaceC5704H> f56216h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f56217i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private C5718i f56218j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private int[] f56219k;

    /* renamed from: l, reason: collision with root package name */
    private int f56220l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f56221m;

    public C5711b(int i11, @NotNull C5718i c5718i, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(i11, c5718i);
        C5718i c5718i2;
        this.f56213e = function1;
        this.f56214f = function12;
        c5718i2 = C5718i.f56238e;
        this.f56218j = c5718i2;
        this.f56219k = f56212n;
        this.f56220l = 1;
    }

    public final void A() {
        int i11;
        C5718i c5718i;
        I(f());
        Unit unit = Unit.f71690a;
        if (this.f56221m || e()) {
            return;
        }
        int f7 = f();
        synchronized (C5721l.D()) {
            i11 = C5721l.f56254e;
            C5721l.f56254e = i11 + 1;
            u(i11);
            c5718i = C5721l.f56253d;
            C5721l.f56253d = c5718i.q(f());
        }
        v(C5721l.x(g(), f7 + 1, f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[LOOP:1: B:32:0x00d4->B:33:0x00d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142 A[Catch: all -> 0x012c, TryCatch #1 {all -> 0x012c, blocks: (B:38:0x00e6, B:40:0x00f6, B:43:0x0104, B:45:0x0110, B:47:0x011a, B:49:0x0120, B:51:0x012f, B:57:0x0142, B:60:0x014c, B:62:0x0156, B:64:0x0160, B:66:0x0166, B:68:0x0170, B:74:0x0178, B:76:0x017b, B:78:0x017f, B:80:0x0186, B:82:0x0192, B:88:0x0137), top: B:37:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f A[Catch: all -> 0x012c, TryCatch #1 {all -> 0x012c, blocks: (B:38:0x00e6, B:40:0x00f6, B:43:0x0104, B:45:0x0110, B:47:0x011a, B:49:0x0120, B:51:0x012f, B:57:0x0142, B:60:0x014c, B:62:0x0156, B:64:0x0160, B:66:0x0166, B:68:0x0170, B:74:0x0178, B:76:0x017b, B:78:0x017f, B:80:0x0186, B:82:0x0192, B:88:0x0137), top: B:37:0x00e6 }] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5716g B() {
        HashMap hashMap;
        AtomicReference atomicReference;
        androidx.collection.M<InterfaceC5704H> m11;
        long j11;
        long j12;
        ArrayList arrayList;
        int size;
        int i11;
        AtomicReference atomicReference2;
        int i12;
        C5718i c5718i;
        AtomicReference atomicReference3;
        C5718i c5718i2;
        AtomicReference atomicReference4;
        androidx.collection.M<InterfaceC5704H> D11 = D();
        if (D11 != null) {
            atomicReference3 = C5721l.f56259j;
            C5711b c5711b = (C5711b) atomicReference3.get();
            c5718i2 = C5721l.f56253d;
            atomicReference4 = C5721l.f56259j;
            hashMap = C5721l.m(c5711b, this, c5718i2.l(((C5710a) atomicReference4.get()).f()));
        } else {
            hashMap = null;
        }
        List list = kotlin.collections.K.f71697a;
        synchronized (C5721l.D()) {
            try {
                C5721l.w(this);
                if (D11 != null && D11.f38665d != 0) {
                    atomicReference2 = C5721l.f56259j;
                    C5710a c5710a = (C5710a) atomicReference2.get();
                    i12 = C5721l.f56254e;
                    c5718i = C5721l.f56253d;
                    AbstractC5716g H11 = H(i12, hashMap, c5718i.l(c5710a.f()));
                    if (!Intrinsics.d(H11, AbstractC5716g.b.f56232a)) {
                        return H11;
                    }
                    c();
                    C5721l.O(c5710a, C5721l.f56250a);
                    m11 = c5710a.f56216h;
                    N(null);
                    c5710a.f56216h = null;
                    list = C5721l.f56257h;
                    Unit unit = Unit.f71690a;
                    this.f56221m = true;
                    if (m11 != null) {
                        U0.c cVar = new U0.c(m11);
                        if (!cVar.isEmpty()) {
                            int size2 = list.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                ((Function2) list.get(i13)).invoke(cVar, this);
                            }
                        }
                    }
                    if (D11 != null && D11.c()) {
                        U0.c cVar2 = new U0.c(D11);
                        size = list.size();
                        for (i11 = 0; i11 < size; i11++) {
                            ((Function2) list.get(i11)).invoke(cVar2, this);
                        }
                    }
                    synchronized (C5721l.D()) {
                        try {
                            r();
                            C5721l.z();
                            if (m11 != null) {
                                Object[] objArr = m11.f38663b;
                                long[] jArr = m11.f38662a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    j11 = 128;
                                    while (true) {
                                        long j13 = jArr[i14];
                                        j12 = 255;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                if ((j13 & 255) < 128) {
                                                    C5721l.n((InterfaceC5704H) objArr[(i14 << 3) + i16]);
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i15 != 8) {
                                                break;
                                            }
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                    }
                                    if (D11 != null) {
                                        Object[] objArr2 = D11.f38663b;
                                        long[] jArr2 = D11.f38662a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                long j14 = jArr2[i17];
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                    for (int i19 = 0; i19 < i18; i19++) {
                                                        if ((j14 & j12) < j11) {
                                                            C5721l.n((InterfaceC5704H) objArr2[(i17 << 3) + i19]);
                                                        }
                                                        j14 >>= 8;
                                                    }
                                                    if (i18 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i17 == length2) {
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                    }
                                    arrayList = this.f56217i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i21 = 0; i21 < size3; i21++) {
                                            C5721l.n((InterfaceC5704H) arrayList.get(i21));
                                        }
                                    }
                                    this.f56217i = null;
                                    Unit unit2 = Unit.f71690a;
                                }
                            }
                            j11 = 128;
                            j12 = 255;
                            if (D11 != null) {
                            }
                            arrayList = this.f56217i;
                            if (arrayList != null) {
                            }
                            this.f56217i = null;
                            Unit unit22 = Unit.f71690a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return AbstractC5716g.b.f56232a;
                }
                c();
                atomicReference = C5721l.f56259j;
                C5710a c5710a2 = (C5710a) atomicReference.get();
                C5721l.O(c5710a2, C5721l.f56250a);
                m11 = c5710a2.f56216h;
                if (m11 == null || !m11.c()) {
                    m11 = null;
                } else {
                    list = C5721l.f56257h;
                }
                Unit unit3 = Unit.f71690a;
                this.f56221m = true;
                if (m11 != null) {
                }
                if (D11 != null) {
                    U0.c cVar22 = new U0.c(D11);
                    size = list.size();
                    while (i11 < size) {
                    }
                }
                synchronized (C5721l.D()) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean C() {
        return this.f56221m;
    }

    public androidx.collection.M<InterfaceC5704H> D() {
        return this.f56216h;
    }

    @NotNull
    public final C5718i E() {
        return this.f56218j;
    }

    @NotNull
    public final int[] F() {
        return this.f56219k;
    }

    @Override // c1.AbstractC5715f
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> h() {
        return this.f56213e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        r5 = c1.C5721l.L(r2, f(), r3);
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5716g H(int i11, HashMap hashMap, @NotNull C5718i c5718i) {
        int i12;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C5718i c5718i2;
        Object[] objArr;
        long[] jArr;
        C5718i c5718i3;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        AbstractC5706J L11;
        AbstractC5706J L12;
        AbstractC5706J L13;
        AbstractC5706J o11;
        C5718i o12 = g().q(f()).o(this.f56218j);
        androidx.collection.M<InterfaceC5704H> D11 = D();
        Intrinsics.f(D11);
        Object[] objArr3 = D11.f38663b;
        long[] jArr3 = D11.f38662a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j11 = jArr3[i14];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            i13 = i15;
                            InterfaceC5704H interfaceC5704H = (InterfaceC5704H) objArr3[(i14 << 3) + i17];
                            AbstractC5706J k11 = interfaceC5704H.k();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            ArrayList arrayList4 = arrayList3;
                            L11 = C5721l.L(k11, i11, c5718i);
                            if (L11 == null || L12 == null) {
                                c5718i3 = o12;
                            } else {
                                c5718i3 = o12;
                                if (L12.d() != 1) {
                                    if (!L11.equals(L12)) {
                                        L13 = C5721l.L(k11, f(), g());
                                        if (L13 == null) {
                                            C5721l.o();
                                            throw null;
                                        }
                                        if (hashMap == null || (o11 = (AbstractC5706J) hashMap.get(L11)) == null) {
                                            o11 = interfaceC5704H.o(L12, L11, L13);
                                        }
                                        if (o11 == null) {
                                            return new AbstractC5716g.a(0);
                                        }
                                        if (!o11.equals(L13)) {
                                            if (o11.equals(L11)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new Pair(interfaceC5704H, L11.b()));
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(interfaceC5704H);
                                                arrayList3 = arrayList5;
                                            } else {
                                                arrayList3 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList3.add(!o11.equals(L12) ? new Pair(interfaceC5704H, o11) : new Pair(interfaceC5704H, L12.b()));
                                            }
                                            j11 >>= i13;
                                            i17++;
                                            i15 = i13;
                                            objArr3 = objArr2;
                                            jArr3 = jArr2;
                                            o12 = c5718i3;
                                        }
                                    }
                                    arrayList3 = arrayList4;
                                    j11 >>= i13;
                                    i17++;
                                    i15 = i13;
                                    objArr3 = objArr2;
                                    jArr3 = jArr2;
                                    o12 = c5718i3;
                                }
                            }
                            arrayList3 = arrayList4;
                        } else {
                            c5718i3 = o12;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i13 = i15;
                        }
                        j11 >>= i13;
                        i17++;
                        i15 = i13;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        o12 = c5718i3;
                    }
                    c5718i2 = o12;
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = 0;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    c5718i2 = o12;
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = 0;
                }
                if (i14 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i14++;
                objArr3 = objArr;
                jArr3 = jArr;
                o12 = c5718i2;
            }
        } else {
            i12 = 0;
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            A();
            int size = arrayList3.size();
            for (int i18 = i12; i18 < size; i18++) {
                Pair pair = (Pair) arrayList3.get(i18);
                InterfaceC5704H interfaceC5704H2 = (InterfaceC5704H) pair.a();
                AbstractC5706J abstractC5706J = (AbstractC5706J) pair.b();
                abstractC5706J.f(f());
                synchronized (C5721l.D()) {
                    abstractC5706J.e(interfaceC5704H2.k());
                    interfaceC5704H2.b(abstractC5706J);
                    Unit unit = Unit.f71690a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i19 = i12; i19 < size2; i19++) {
                D11.l((InterfaceC5704H) arrayList2.get(i19));
            }
            ArrayList arrayList6 = this.f56217i;
            if (arrayList6 != null) {
                arrayList2 = C7714v.p0(arrayList2, arrayList6);
            }
            this.f56217i = arrayList2;
        }
        return AbstractC5716g.b.f56232a;
    }

    public final void I(int i11) {
        synchronized (C5721l.D()) {
            this.f56218j = this.f56218j.q(i11);
            Unit unit = Unit.f71690a;
        }
    }

    public final void J(@NotNull C5718i c5718i) {
        synchronized (C5721l.D()) {
            this.f56218j = this.f56218j.o(c5718i);
            Unit unit = Unit.f71690a;
        }
    }

    public final void K(int i11) {
        if (i11 >= 0) {
            this.f56219k = C7705l.T(this.f56219k, i11);
        }
    }

    public final void L(@NotNull int[] elements) {
        if (elements.length == 0) {
            return;
        }
        int[] iArr = this.f56219k;
        if (iArr.length != 0) {
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length = iArr.length;
            int length2 = elements.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(elements, 0, copyOf, length, length2);
            Intrinsics.f(copyOf);
            elements = copyOf;
        }
        this.f56219k = elements;
    }

    public final void M() {
        this.f56221m = true;
    }

    public void N(androidx.collection.M<InterfaceC5704H> m11) {
        this.f56216h = m11;
    }

    @NotNull
    public C5711b O(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        int i11;
        C5718i c5718i;
        int i12;
        C5718i c5718i2;
        int i13;
        z();
        if (this.f56221m) {
            i13 = ((AbstractC5715f) this).f56231d;
            if (i13 < 0) {
                B0.b("Unsupported operation on a disposed or applied snapshot");
                throw null;
            }
        }
        I(f());
        synchronized (C5721l.D()) {
            try {
                i11 = C5721l.f56254e;
                C5721l.f56254e = i11 + 1;
                c5718i = C5721l.f56253d;
                C5721l.f56253d = c5718i.q(i11);
                C5718i g10 = g();
                v(g10.q(i11));
                try {
                    C5712c c5712c = new C5712c(i11, C5721l.x(g10, f() + 1, i11), C5721l.E(function1, h()), C5721l.l(function12, k()), this);
                    if (this.f56221m || e()) {
                        return c5712c;
                    }
                    int f7 = f();
                    synchronized (C5721l.D()) {
                        i12 = C5721l.f56254e;
                        C5721l.f56254e = i12 + 1;
                        u(i12);
                        c5718i2 = C5721l.f56253d;
                        C5721l.f56253d = c5718i2.q(f());
                        Unit unit = Unit.f71690a;
                    }
                    v(C5721l.x(g(), f7 + 1, f()));
                    return c5712c;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // c1.AbstractC5715f
    public final void c() {
        C5718i c5718i;
        c5718i = C5721l.f56253d;
        C5721l.f56253d = c5718i.l(f()).k(this.f56218j);
    }

    @Override // c1.AbstractC5715f
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n();
    }

    @Override // c1.AbstractC5715f
    public boolean i() {
        return false;
    }

    @Override // c1.AbstractC5715f
    public int j() {
        return this.f56215g;
    }

    @Override // c1.AbstractC5715f
    public Function1<Object, Unit> k() {
        return this.f56214f;
    }

    @Override // c1.AbstractC5715f
    public void m() {
        this.f56220l++;
    }

    @Override // c1.AbstractC5715f
    public void n() {
        int i11 = this.f56220l;
        if (!(i11 > 0)) {
            B0.a("no pending nested snapshots");
            throw null;
        }
        int i12 = i11 - 1;
        this.f56220l = i12;
        if (i12 != 0 || this.f56221m) {
            return;
        }
        androidx.collection.M<InterfaceC5704H> D11 = D();
        if (D11 != null) {
            if (this.f56221m) {
                B0.b("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            N(null);
            int f7 = f();
            Object[] objArr = D11.f38663b;
            long[] jArr = D11.f38662a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j11 = jArr[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j11) < 128) {
                                for (AbstractC5706J k11 = ((InterfaceC5704H) objArr[(i13 << 3) + i15]).k(); k11 != null; k11 = k11.c()) {
                                    if (k11.d() == f7 || C7714v.A(this.f56218j, Integer.valueOf(k11.d()))) {
                                        k11.f(0);
                                    }
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        b();
    }

    @Override // c1.AbstractC5715f
    public void o() {
        if (this.f56221m || e()) {
            return;
        }
        A();
    }

    @Override // c1.AbstractC5715f
    public void p(@NotNull InterfaceC5704H interfaceC5704H) {
        androidx.collection.M<InterfaceC5704H> D11 = D();
        if (D11 == null) {
            D11 = Y.a();
            N(D11);
        }
        D11.d(interfaceC5704H);
    }

    @Override // c1.AbstractC5715f
    public final void r() {
        int length = this.f56219k.length;
        for (int i11 = 0; i11 < length; i11++) {
            C5721l.N(this.f56219k[i11]);
        }
        q();
    }

    @Override // c1.AbstractC5715f
    public void w(int i11) {
        this.f56215g = i11;
    }

    @Override // c1.AbstractC5715f
    @NotNull
    public AbstractC5715f x(Function1<Object, Unit> function1) {
        int i11;
        C5718i c5718i;
        C5713d c5713d;
        int i12;
        C5718i c5718i2;
        int i13;
        z();
        if (this.f56221m) {
            i13 = ((AbstractC5715f) this).f56231d;
            if (i13 < 0) {
                B0.b("Unsupported operation on a disposed or applied snapshot");
                throw null;
            }
        }
        int f7 = f();
        I(f());
        synchronized (C5721l.D()) {
            i11 = C5721l.f56254e;
            C5721l.f56254e = i11 + 1;
            c5718i = C5721l.f56253d;
            C5721l.f56253d = c5718i.q(i11);
            c5713d = new C5713d(i11, C5721l.x(g(), f7 + 1, i11), C5721l.E(function1, h()), this);
        }
        if (this.f56221m || e()) {
            return c5713d;
        }
        int f11 = f();
        synchronized (C5721l.D()) {
            i12 = C5721l.f56254e;
            C5721l.f56254e = i12 + 1;
            u(i12);
            c5718i2 = C5721l.f56253d;
            C5721l.f56253d = c5718i2.q(f());
            Unit unit = Unit.f71690a;
        }
        v(C5721l.x(g(), f11 + 1, f()));
        return c5713d;
    }
}
