package androidx.compose.foundation.gestures;

import D1.AbstractC2813m;
import D1.C0;
import D1.InterfaceC2803h;
import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import t0.C9712a;
import t0.C9713b;
import t0.C9714c;
import x1.C10638m;
import x1.EnumC10640o;
import xe.C10727i;
import ze.C11115c;

/* loaded from: classes.dex */
public abstract class B extends AbstractC2813m implements C0, InterfaceC2803h {

    /* renamed from: c, reason: collision with root package name */
    private EnumC9142v f38951c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f38952d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38953e;

    /* renamed from: f, reason: collision with root package name */
    private t0.q f38954f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<x1.x, Boolean> f38955g = new a();

    /* renamed from: h, reason: collision with root package name */
    private C11115c f38956h;

    /* renamed from: i, reason: collision with root package name */
    private C9713b f38957i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f38958j;

    /* renamed from: k, reason: collision with root package name */
    private x1.N f38959k;

    static final class a extends AbstractC7737t implements Function1<x1.x, Boolean> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(x1.x xVar) {
            return B.this.X1().invoke(xVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(@NotNull Function1<? super x1.x, Boolean> function1, boolean z11, t0.q qVar, EnumC9142v enumC9142v) {
        this.f38951c = enumC9142v;
        this.f38952d = (AbstractC7737t) function1;
        this.f38953e = z11;
        this.f38954f = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q1(B b11, kotlin.coroutines.jvm.internal.c cVar) {
        D d11;
        int i11;
        b11.getClass();
        if (cVar instanceof D) {
            d11 = (D) cVar;
            int i12 = d11.f38984g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d11.f38984g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d11.f38982e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d11.f38984g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C9713b c9713b = b11.f38957i;
                    if (c9713b != null) {
                        t0.q qVar = b11.f38954f;
                        if (qVar != null) {
                            C9712a c9712a = new C9712a(c9713b);
                            d11.f38981d = b11;
                            d11.f38984g = 1;
                            if (qVar.emit(c9712a, d11) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    b11.a2(0L);
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b11 = d11.f38981d;
                Sc.s.b(obj);
                b11.f38957i = null;
                b11.a2(0L);
                return Unit.f71690a;
            }
        }
        d11 = new D(b11, cVar);
        Object obj2 = d11.f38982e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d11.f38984g;
        if (i11 != 0) {
        }
        b11.f38957i = null;
        b11.a2(0L);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R1(B b11, AbstractC5172o.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        E e11;
        int i11;
        C9713b c9713b;
        t0.q qVar;
        B b12;
        C9713b c9713b2;
        b11.getClass();
        if (cVar2 instanceof E) {
            e11 = (E) cVar2;
            int i12 = e11.f39000i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                e11.f39000i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = e11.f38998g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = e11.f39000i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C9713b c9713b3 = b11.f38957i;
                    if (c9713b3 != null && (r2 = b11.f38954f) != null) {
                        C9712a c9712a = new C9712a(c9713b3);
                        e11.f38995d = b11;
                        e11.f38996e = cVar;
                        e11.f39000i = 1;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c9713b2 = e11.f38997f;
                        cVar = e11.f38996e;
                        b12 = e11.f38995d;
                        Sc.s.b(obj);
                        c9713b = c9713b2;
                        b11 = b12;
                        b11.f38957i = c9713b;
                        b11.Z1(cVar.a());
                        return Unit.f71690a;
                    }
                    cVar = e11.f38996e;
                    b11 = e11.f38995d;
                    Sc.s.b(obj);
                }
                c9713b = new C9713b();
                qVar = b11.f38954f;
                if (qVar != null) {
                    e11.f38995d = b11;
                    e11.f38996e = cVar;
                    e11.f38997f = c9713b;
                    e11.f39000i = 2;
                    if (qVar.emit(c9713b, e11) != aVar) {
                        b12 = b11;
                        c9713b2 = c9713b;
                        c9713b = c9713b2;
                        b11 = b12;
                    }
                    return aVar;
                }
                b11.f38957i = c9713b;
                b11.Z1(cVar.a());
                return Unit.f71690a;
            }
        }
        e11 = new E(b11, cVar2);
        Object obj2 = e11.f38998g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = e11.f39000i;
        if (i11 != 0) {
        }
        c9713b = new C9713b();
        qVar = b11.f38954f;
        if (qVar != null) {
        }
        b11.f38957i = c9713b;
        b11.Z1(cVar.a());
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S1(B b11, AbstractC5172o.d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        F f7;
        int i11;
        b11.getClass();
        if (cVar instanceof F) {
            f7 = (F) cVar;
            int i12 = f7.f39005h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                f7.f39005h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = f7.f39003f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = f7.f39005h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C9713b c9713b = b11.f38957i;
                    if (c9713b != null) {
                        t0.q qVar = b11.f38954f;
                        if (qVar != null) {
                            C9714c c9714c = new C9714c(c9713b);
                            f7.f39001d = b11;
                            f7.f39002e = dVar;
                            f7.f39005h = 1;
                            if (qVar.emit(c9714c, f7) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    b11.a2(dVar.a());
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = f7.f39002e;
                b11 = f7.f39001d;
                Sc.s.b(obj);
                b11.f38957i = null;
                b11.a2(dVar.a());
                return Unit.f71690a;
            }
        }
        f7 = new F(b11, cVar);
        Object obj2 = f7.f39003f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = f7.f39005h;
        if (i11 != 0) {
        }
        b11.f38957i = null;
        b11.a2(dVar.a());
        return Unit.f71690a;
    }

    public static final void U1(B b11) {
        b11.f38958j = true;
        C10727i.c(b11.getCoroutineScope(), null, null, new G(b11, null), 3);
    }

    public final void V1() {
        C9713b c9713b = this.f38957i;
        if (c9713b != null) {
            t0.q qVar = this.f38954f;
            if (qVar != null) {
                qVar.tryEmit(new C9712a(c9713b));
            }
            this.f38957i = null;
        }
    }

    public abstract Object W1(@NotNull Function2<? super Function1<? super AbstractC5172o.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<x1.x, java.lang.Boolean>, kotlin.jvm.internal.t] */
    @NotNull
    protected final Function1<x1.x, Boolean> X1() {
        return this.f38952d;
    }

    protected final boolean Y1() {
        return this.f38953e;
    }

    public abstract void Z1(long j11);

    public abstract void a2(long j11);

    public abstract boolean b2();

    /* JADX WARN: Multi-variable type inference failed */
    public final void c2(@NotNull Function1<? super x1.x, Boolean> function1, boolean z11, t0.q qVar, EnumC9142v enumC9142v, boolean z12) {
        x1.N n11;
        this.f38952d = (AbstractC7737t) function1;
        boolean z13 = true;
        if (this.f38953e != z11) {
            this.f38953e = z11;
            if (!z11) {
                V1();
                x1.N n12 = this.f38959k;
                if (n12 != null) {
                    L1(n12);
                }
                this.f38959k = null;
            }
            z12 = true;
        }
        if (!Intrinsics.d(this.f38954f, qVar)) {
            V1();
            this.f38954f = qVar;
        }
        if (this.f38951c != enumC9142v) {
            this.f38951c = enumC9142v;
        } else {
            z13 = z12;
        }
        if (!z13 || (n11 = this.f38959k) == null) {
            return;
        }
        n11.v0();
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f38958j = false;
        V1();
    }

    @Override // D1.C0
    public void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        if (this.f38953e && this.f38959k == null) {
            C c11 = new C(this, null);
            int i11 = x1.L.f104834b;
            x1.S s11 = new x1.S(null, null, null, c11);
            I1(s11);
            this.f38959k = s11;
        }
        x1.N n11 = this.f38959k;
        if (n11 != null) {
            n11.p1(c10638m, enumC10640o, j11);
        }
    }

    @Override // D1.C0
    public final void r0() {
        x1.N n11 = this.f38959k;
        if (n11 != null) {
            n11.r0();
        }
    }
}
