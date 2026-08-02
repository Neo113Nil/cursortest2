package J0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import m0.C7980b;
import m0.C8006o;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.s;

/* loaded from: classes8.dex */
final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private float f12784a;

    /* renamed from: b, reason: collision with root package name */
    private float f12785b;

    /* renamed from: c, reason: collision with root package name */
    private float f12786c;

    /* renamed from: d, reason: collision with root package name */
    private float f12787d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7980b<Z1.h, C8008p> f12788e;

    /* renamed from: f, reason: collision with root package name */
    private t0.n f12789f;

    /* renamed from: g, reason: collision with root package name */
    private t0.n f12790g;

    public G0(float f7, float f11, float f12, float f13) {
        this.f12784a = f7;
        this.f12785b = f11;
        this.f12786c = f12;
        this.f12787d = f13;
        this.f12788e = new C7980b<>(Z1.h.a(f7), m0.W0.e(), null, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kotlin.coroutines.jvm.internal.c cVar) {
        F0 f02;
        int i11;
        G0 g02;
        if (cVar instanceof F0) {
            f02 = (F0) cVar;
            int i12 = f02.f12772g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                f02.f12772g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = f02.f12770e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = f02.f12772g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    t0.n nVar = this.f12790g;
                    float f7 = nVar instanceof s.b ? this.f12785b : nVar instanceof t0.j ? this.f12786c : nVar instanceof C9717f ? this.f12787d : this.f12784a;
                    C7980b<Z1.h, C8008p> c7980b = this.f12788e;
                    if (!Z1.h.b(c7980b.i().d(), f7)) {
                        try {
                            Z1.h a11 = Z1.h.a(f7);
                            f02.f12769d = this;
                            f02.f12772g = 1;
                            if (c7980b.m(a11, f02) == aVar) {
                                return aVar;
                            }
                            g02 = this;
                        } catch (Throwable th2) {
                            th = th2;
                            g02 = this;
                            g02.f12789f = g02.f12790g;
                            throw th;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g02 = (G0) f02.f12769d;
                try {
                    Sc.s.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    g02.f12789f = g02.f12790g;
                    throw th;
                }
                g02.f12789f = g02.f12790g;
                return Unit.f71690a;
            }
        }
        f02 = new F0(this, cVar);
        Object obj2 = f02.f12770e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = f02.f12772g;
        if (i11 != 0) {
        }
        g02.f12789f = g02.f12790g;
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(t0.n nVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        E0 e02;
        int i11;
        G0 g02;
        C7980b<Z1.h, C8008p> c7980b = this.f12788e;
        if (cVar instanceof E0) {
            e02 = (E0) cVar;
            int i12 = e02.f12758h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                e02.f12758h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = e02.f12756f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = e02.f12758h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    float f7 = nVar instanceof s.b ? this.f12785b : nVar instanceof t0.j ? this.f12786c : nVar instanceof C9717f ? this.f12787d : this.f12784a;
                    this.f12790g = nVar;
                    try {
                        if (!Z1.h.b(c7980b.i().d(), f7)) {
                            t0.n nVar2 = this.f12789f;
                            e02.f12754d = this;
                            e02.f12755e = nVar;
                            e02.f12758h = 1;
                            if (Z.a(c7980b, f7, nVar2, nVar, e02) == aVar) {
                                return aVar;
                            }
                        }
                        g02 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        g02 = this;
                        g02.f12789f = nVar;
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = e02.f12755e;
                    g02 = (G0) e02.f12754d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        g02.f12789f = nVar;
                        throw th;
                    }
                }
                g02.f12789f = nVar;
                return Unit.f71690a;
            }
        }
        e02 = new E0(this, cVar);
        Object obj2 = e02.f12756f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = e02.f12758h;
        if (i11 != 0) {
        }
        g02.f12789f = nVar;
        return Unit.f71690a;
    }

    @NotNull
    public final C8006o c() {
        return this.f12788e.g();
    }

    public final Object e(float f7, float f11, float f12, float f13, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f12784a = f7;
        this.f12785b = f11;
        this.f12786c = f12;
        this.f12787d = f13;
        Object d11 = d((kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
