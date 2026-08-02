package Ae;

import Be.AbstractC2630b;
import Be.AbstractC2632d;
import Be.C2631c;
import De.C2857A;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.C10741p;
import xe.InterfaceC10724g0;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public class C0<T> extends AbstractC2630b<F0> implements w0<T>, InterfaceC2385c<T>, Be.w<T> {

    /* renamed from: e, reason: collision with root package name */
    private final int f768e;

    /* renamed from: f, reason: collision with root package name */
    private final int f769f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final EnumC11113a f770g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f771h;

    /* renamed from: i, reason: collision with root package name */
    private long f772i;

    /* renamed from: j, reason: collision with root package name */
    private long f773j;

    /* renamed from: k, reason: collision with root package name */
    private int f774k;

    /* renamed from: l, reason: collision with root package name */
    private int f775l;

    private static final class a implements InterfaceC10724g0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final C0<?> f776a;

        /* renamed from: b, reason: collision with root package name */
        public long f777b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f778c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final C10737n f779d;

        public a(@NotNull C0 c02, long j11, Object obj, @NotNull C10737n c10737n) {
            this.f776a = c02;
            this.f777b = j11;
            this.f778c = obj;
            this.f779d = c10737n;
        }

        @Override // xe.InterfaceC10724g0
        public final void dispose() {
            C0.k(this.f776a, this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f780a;

        static {
            int[] iArr = new int[EnumC11113a.values().length];
            try {
                iArr[EnumC11113a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11113a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11113a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f780a = iArr;
        }
    }

    public C0(int i11, int i12, @NotNull EnumC11113a enumC11113a) {
        this.f768e = i11;
        this.f769f = i12;
        this.f770g = enumC11113a;
    }

    public static final void k(C0 c02, a aVar) {
        synchronized (c02) {
            if (aVar.f777b < c02.r()) {
                return;
            }
            Object[] objArr = c02.f771h;
            Intrinsics.f(objArr);
            long j11 = aVar.f777b;
            if (objArr[((int) j11) & (objArr.length - 1)] != aVar) {
                return;
            }
            E0.c(objArr, j11, E0.f797a);
            c02.m();
            Unit unit = Unit.f71690a;
        }
    }

    private final Object l(F0 f02, kotlin.coroutines.d<? super Unit> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        synchronized (this) {
            if (v(f02) < 0) {
                f02.f803b = c10737n;
            } else {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(Unit.f71690a);
            }
            Unit unit = Unit.f71690a;
        }
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    private final void m() {
        if (this.f769f != 0 || this.f775l > 1) {
            Object[] objArr = this.f771h;
            Intrinsics.f(objArr);
            while (this.f775l > 0) {
                long r11 = r();
                int i11 = this.f774k;
                int i12 = this.f775l;
                if (objArr[((int) ((r11 + (i11 + i12)) - 1)) & (objArr.length - 1)] != E0.f797a) {
                    return;
                }
                this.f775l = i12 - 1;
                E0.c(objArr, r() + this.f774k + this.f775l, null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(2:16|(3:38|39|(2:41|42)(2:43|37))(4:18|(3:23|24|25)|32|(1:34)(2:36|37))))(4:49|50|51|52)|30|31)(5:58|59|60|(1:62)|65)|53|54|15|(3:16|(0)(0)|37)))|68|6|(0)(0)|53|54|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0079, code lost:
    
        if (((Ae.R0) r9).a(r0) == r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Wc.a n(C0 c02, InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        D0 d02;
        int i11;
        C0 c03;
        Throwable th2;
        F0 f02;
        InterfaceC2397i interfaceC2397i2;
        xe.B0 b02;
        InterfaceC2397i interfaceC2397i3;
        Object w11;
        xe.B0 b03;
        InterfaceC2397i interfaceC2397i4;
        if (dVar instanceof D0) {
            d02 = (D0) dVar;
            int i12 = d02.f790j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d02.f790j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d02.f788h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d02.f790j;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            b03 = d02.f787g;
                            f02 = d02.f786f;
                            interfaceC2397i4 = d02.f785e;
                            c03 = d02.f784d;
                        } else {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b03 = d02.f787g;
                            f02 = d02.f786f;
                            interfaceC2397i4 = d02.f785e;
                            c03 = d02.f784d;
                        }
                        try {
                            Sc.s.b(obj);
                            interfaceC2397i3 = interfaceC2397i4;
                            b02 = b03;
                            c02 = c03;
                            while (true) {
                                w11 = c02.w(f02);
                                if (w11 == E0.f797a) {
                                    d02.f784d = c02;
                                    d02.f785e = interfaceC2397i3;
                                    d02.f786f = f02;
                                    d02.f787g = b02;
                                    d02.f790j = 2;
                                    if (c02.l(f02, d02) == aVar) {
                                        break;
                                    }
                                } else {
                                    if (b02 != null && !b02.isActive()) {
                                        throw b02.Z();
                                    }
                                    d02.f784d = c02;
                                    d02.f785e = interfaceC2397i3;
                                    d02.f786f = f02;
                                    d02.f787g = b02;
                                    d02.f790j = 3;
                                    if (interfaceC2397i3.emit(w11, d02) == aVar) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } else {
                        f02 = d02.f786f;
                        InterfaceC2397i interfaceC2397i5 = d02.f785e;
                        C0 c04 = d02.f784d;
                        try {
                            Sc.s.b(obj);
                            interfaceC2397i2 = interfaceC2397i5;
                            c02 = c04;
                        } catch (Throwable th4) {
                            th2 = th4;
                            c03 = c04;
                        }
                    }
                    c03.h(f02);
                    throw th2;
                }
                Sc.s.b(obj);
                F0 e11 = c02.e();
                try {
                    if (interfaceC2397i instanceof R0) {
                        d02.f784d = c02;
                        d02.f785e = interfaceC2397i;
                        d02.f786f = e11;
                        d02.f790j = 1;
                    }
                    interfaceC2397i2 = interfaceC2397i;
                    f02 = e11;
                } catch (Throwable th5) {
                    c03 = c02;
                    th2 = th5;
                    f02 = e11;
                }
                b02 = (xe.B0) d02.getContext().get(xe.B0.f105374o0);
                interfaceC2397i3 = interfaceC2397i2;
                while (true) {
                    w11 = c02.w(f02);
                    if (w11 == E0.f797a) {
                    }
                }
            }
        }
        d02 = new D0(c02, dVar);
        Object obj2 = d02.f788h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d02.f790j;
        if (i11 == 0) {
        }
        b02 = (xe.B0) d02.getContext().get(xe.B0.f105374o0);
        interfaceC2397i3 = interfaceC2397i2;
        while (true) {
            w11 = c02.w(f02);
            if (w11 == E0.f797a) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r2 = ((Be.AbstractC2630b) r10).f3567a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void o() {
        int i11;
        AbstractC2632d[] abstractC2632dArr;
        Object[] objArr = this.f771h;
        Intrinsics.f(objArr);
        E0.c(objArr, r(), null);
        this.f774k--;
        long r11 = r() + 1;
        if (this.f772i < r11) {
            this.f772i = r11;
        }
        if (this.f773j < r11) {
            i11 = ((AbstractC2630b) this).f3568b;
            if (i11 != 0 && abstractC2632dArr != null) {
                for (AbstractC2632d abstractC2632d : abstractC2632dArr) {
                    if (abstractC2632d != null) {
                        F0 f02 = (F0) abstractC2632d;
                        long j11 = f02.f802a;
                        if (j11 >= 0 && j11 < r11) {
                            f02.f802a = r11;
                        }
                    }
                }
            }
            this.f773j = r11;
        }
    }

    private final void p(Object obj) {
        int i11 = this.f774k + this.f775l;
        Object[] objArr = this.f771h;
        if (objArr == null) {
            objArr = t(0, 2, null);
        } else if (i11 >= objArr.length) {
            objArr = t(i11, objArr.length * 2, objArr);
        }
        E0.c(objArr, r() + i11, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = ((Be.AbstractC2630b) r10).f3567a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlin.coroutines.d<Unit>[] q(kotlin.coroutines.d<Unit>[] dVarArr) {
        int i11;
        AbstractC2632d[] abstractC2632dArr;
        F0 f02;
        C10737n c10737n;
        int length = dVarArr.length;
        i11 = ((AbstractC2630b) this).f3568b;
        if (i11 != 0 && abstractC2632dArr != null) {
            int length2 = abstractC2632dArr.length;
            int i12 = 0;
            dVarArr = dVarArr;
            while (i12 < length2) {
                AbstractC2632d abstractC2632d = abstractC2632dArr[i12];
                if (abstractC2632d != null && (c10737n = (f02 = (F0) abstractC2632d).f803b) != null && v(f02) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c10737n;
                    f02.f803b = null;
                    length++;
                }
                i12++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long r() {
        return Math.min(this.f773j, this.f772i);
    }

    private final Object[] t(int i11, int i12, Object[] objArr) {
        if (i12 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i12];
        this.f771h = objArr2;
        if (objArr != null) {
            long r11 = r();
            for (int i13 = 0; i13 < i11; i13++) {
                long j11 = i13 + r11;
                E0.c(objArr2, j11, objArr[((int) j11) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    private final boolean u(T t2) {
        int i11 = i();
        int i12 = this.f768e;
        if (i11 != 0) {
            int i13 = this.f774k;
            int i14 = this.f769f;
            if (i13 >= i14 && this.f773j <= this.f772i) {
                int i15 = b.f780a[this.f770g.ordinal()];
                if (i15 == 1) {
                    return false;
                }
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new Sc.o();
                    }
                }
            }
            p(t2);
            int i16 = this.f774k + 1;
            this.f774k = i16;
            if (i16 > i14) {
                o();
            }
            long r11 = r() + this.f774k;
            long j11 = this.f772i;
            if (((int) (r11 - j11)) > i12) {
                x(1 + j11, this.f773j, r() + this.f774k, r() + this.f774k + this.f775l);
            }
        } else if (i12 != 0) {
            p(t2);
            int i17 = this.f774k + 1;
            this.f774k = i17;
            if (i17 > i12) {
                o();
            }
            this.f773j = r() + this.f774k;
            return true;
        }
        return true;
    }

    private final long v(F0 f02) {
        long j11 = f02.f802a;
        if (j11 < r() + this.f774k) {
            return j11;
        }
        if (this.f769f <= 0 && j11 <= r() && this.f775l != 0) {
            return j11;
        }
        return -1L;
    }

    private final Object w(F0 f02) {
        Object obj;
        kotlin.coroutines.d<Unit>[] dVarArr = C2631c.f3571a;
        synchronized (this) {
            try {
                long v11 = v(f02);
                if (v11 < 0) {
                    obj = E0.f797a;
                } else {
                    long j11 = f02.f802a;
                    Object[] objArr = this.f771h;
                    Intrinsics.f(objArr);
                    Object obj2 = objArr[((int) v11) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f778c;
                    }
                    f02.f802a = v11 + 1;
                    Object obj3 = obj2;
                    dVarArr = y(j11);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kotlin.coroutines.d<Unit> dVar : dVarArr) {
            if (dVar != null) {
                r.Companion companion = Sc.r.INSTANCE;
                dVar.resumeWith(Unit.f71690a);
            }
        }
        return obj;
    }

    private final void x(long j11, long j12, long j13, long j14) {
        long min = Math.min(j12, j11);
        for (long r11 = r(); r11 < min; r11++) {
            Object[] objArr = this.f771h;
            Intrinsics.f(objArr);
            E0.c(objArr, r11, null);
        }
        this.f772i = j11;
        this.f773j = j12;
        this.f774k = (int) (j13 - min);
        this.f775l = (int) (j14 - j13);
    }

    @Override // Be.w
    @NotNull
    public final InterfaceC2395h<T> a(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return E0.d(this, coroutineContext, i11, enumC11113a);
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<?> dVar) {
        return n(this, interfaceC2397i, dVar);
    }

    @Override // Ae.w0, Ae.InterfaceC2397i
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        Throwable th2;
        kotlin.coroutines.d<Unit>[] q11;
        a aVar;
        if (tryEmit(t2)) {
            return Unit.f71690a;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        kotlin.coroutines.d<Unit>[] dVarArr = C2631c.f3571a;
        synchronized (this) {
            try {
                if (u(t2)) {
                    try {
                        r.Companion companion = Sc.r.INSTANCE;
                        c10737n.resumeWith(Unit.f71690a);
                        q11 = q(dVarArr);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, r() + this.f774k + this.f775l, t2, c10737n);
                        p(aVar);
                        this.f775l++;
                        if (this.f769f == 0) {
                            dVarArr = q(dVarArr);
                        }
                        q11 = dVarArr;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    C10741p.a(c10737n, aVar);
                }
                for (kotlin.coroutines.d<Unit> dVar : q11) {
                    if (dVar != null) {
                        r.Companion companion2 = Sc.r.INSTANCE;
                        dVar.resumeWith(Unit.f71690a);
                    }
                }
                Object n11 = c10737n.n();
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                if (n11 == aVar2) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (n11 != aVar2) {
                    n11 = Unit.f71690a;
                }
                return n11 == aVar2 ? n11 : Unit.f71690a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // Be.AbstractC2630b
    public final F0 f() {
        return new F0();
    }

    @Override // Be.AbstractC2630b
    public final AbstractC2632d[] g() {
        return new F0[2];
    }

    @Override // Ae.B0
    @NotNull
    public final List<T> getReplayCache() {
        synchronized (this) {
            int r11 = (int) ((r() + this.f774k) - this.f772i);
            if (r11 == 0) {
                return kotlin.collections.K.f71697a;
            }
            ArrayList arrayList = new ArrayList(r11);
            Object[] objArr = this.f771h;
            Intrinsics.f(objArr);
            for (int i11 = 0; i11 < r11; i11++) {
                arrayList.add(objArr[((int) (this.f772i + i11)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // Ae.w0
    public final void resetReplayCache() {
        synchronized (this) {
            try {
                try {
                    x(r() + this.f774k, this.f773j, r() + this.f774k, r() + this.f774k + this.f775l);
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    protected final T s() {
        Object[] objArr = this.f771h;
        Intrinsics.f(objArr);
        return (T) objArr[((int) ((this.f772i + ((int) ((r() + this.f774k) - this.f772i))) - 1)) & (objArr.length - 1)];
    }

    @Override // Ae.w0
    public final boolean tryEmit(T t2) {
        int i11;
        boolean z11;
        kotlin.coroutines.d<Unit>[] dVarArr = C2631c.f3571a;
        synchronized (this) {
            if (u(t2)) {
                dVarArr = q(dVarArr);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        for (kotlin.coroutines.d<Unit> dVar : dVarArr) {
            if (dVar != null) {
                r.Companion companion = Sc.r.INSTANCE;
                dVar.resumeWith(Unit.f71690a);
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r9 = ((Be.AbstractC2630b) r21).f3567a;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.coroutines.d<Unit>[] y(long j11) {
        int i11;
        long j12;
        long j13;
        long j14;
        int i12;
        kotlin.coroutines.d<Unit>[] dVarArr;
        AbstractC2632d[] abstractC2632dArr;
        long j15 = this.f773j;
        kotlin.coroutines.d<Unit>[] dVarArr2 = C2631c.f3571a;
        if (j11 <= j15) {
            long r11 = r();
            long j16 = this.f774k + r11;
            int i13 = this.f769f;
            if (i13 == 0 && this.f775l > 0) {
                j16++;
            }
            i11 = ((AbstractC2630b) this).f3568b;
            int i14 = 0;
            if (i11 != 0 && abstractC2632dArr != null) {
                for (AbstractC2632d abstractC2632d : abstractC2632dArr) {
                    if (abstractC2632d != null) {
                        long j17 = ((F0) abstractC2632d).f802a;
                        if (j17 >= 0 && j17 < j16) {
                            j16 = j17;
                        }
                    }
                }
            }
            if (j16 > this.f773j) {
                long r12 = r() + this.f774k;
                int min = i() > 0 ? Math.min(this.f775l, i13 - ((int) (r12 - j16))) : this.f775l;
                long j18 = this.f775l + r12;
                C2857A c2857a = E0.f797a;
                if (min > 0) {
                    kotlin.coroutines.d<Unit>[] dVarArr3 = new kotlin.coroutines.d[min];
                    j14 = 1;
                    Object[] objArr = this.f771h;
                    Intrinsics.f(objArr);
                    i12 = i13;
                    long j19 = r12;
                    while (true) {
                        if (r12 >= j18) {
                            j12 = r11;
                            j13 = j16;
                            break;
                        }
                        j12 = r11;
                        Object obj = objArr[((int) r12) & (objArr.length - 1)];
                        if (obj != c2857a) {
                            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            a aVar = (a) obj;
                            int i15 = i14 + 1;
                            j13 = j16;
                            dVarArr3[i14] = aVar.f779d;
                            E0.c(objArr, r12, c2857a);
                            E0.c(objArr, j19, aVar.f778c);
                            j19++;
                            if (i15 >= min) {
                                break;
                            }
                            i14 = i15;
                        } else {
                            j13 = j16;
                        }
                        r12++;
                        r11 = j12;
                        j16 = j13;
                    }
                    r12 = j19;
                    dVarArr = dVarArr3;
                } else {
                    j12 = r11;
                    j13 = j16;
                    j14 = 1;
                    i12 = i13;
                    dVarArr = dVarArr2;
                }
                int i16 = (int) (r12 - j12);
                long j21 = i() == 0 ? r12 : j13;
                long max = Math.max(this.f772i, r12 - Math.min(this.f768e, i16));
                if (i12 == 0 && max < j18) {
                    Object[] objArr2 = this.f771h;
                    Intrinsics.f(objArr2);
                    if (Intrinsics.d(objArr2[((int) max) & (objArr2.length - 1)], c2857a)) {
                        r12 += j14;
                        max += j14;
                    }
                }
                x(max, j21, r12, j18);
                m();
                return dVarArr.length == 0 ? dVarArr : q(dVarArr);
            }
        }
        return dVarArr2;
    }

    public final long z() {
        long j11 = this.f772i;
        if (j11 < this.f773j) {
            this.f773j = j11;
        }
        return j11;
    }
}
