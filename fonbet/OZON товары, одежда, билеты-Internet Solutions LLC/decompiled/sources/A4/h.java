package A4;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import Sc.C4005g;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import j3.AbstractC7252H;
import j3.C7248D;
import j3.Q;
import j3.y;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f410a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f411b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f412c;

    /* renamed from: d, reason: collision with root package name */
    private y f413d;

    /* renamed from: e, reason: collision with root package name */
    private Object f414e;

    public h() {
        this(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r4.R() == r5.getPeriod(r1, r6).f68939c) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Unit a(h hVar, y yVar, y listen, y.b events) {
        Intrinsics.checkNotNullParameter(listen, "$this$listen");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.a(25) && !Intrinsics.d(listen.M(), Q.f69042d) && listen.P() != 1) {
            hVar.getClass();
            hVar.f410a.setValue(d(yVar));
        }
        if (events.a(26)) {
            hVar.f411b.setValue(Boolean.FALSE);
        }
        if (events.a(2)) {
            hVar.getClass();
            AbstractC7252H G11 = yVar.l(17) ? yVar.G() : AbstractC7252H.EMPTY;
            Intrinsics.f(G11);
            if (G11.isEmpty()) {
                hVar.f414e = null;
            } else {
                AbstractC7252H.b bVar = new AbstractC7252H.b();
                if (!yVar.l(30) || yVar.i().b()) {
                    Object obj = hVar.f414e;
                    if (obj != null) {
                        int indexOfPeriod = G11.getIndexOfPeriod(obj);
                        if (indexOfPeriod != -1) {
                        }
                        hVar.f414e = null;
                    }
                } else {
                    hVar.f414e = G11.getPeriod(yVar.r(), bVar, true).f68938b;
                }
            }
            hVar.e(yVar);
        }
        return Unit.f71690a;
    }

    private static C7464j d(y yVar) {
        if (yVar == null) {
            return null;
        }
        long a11 = C7465k.a(yVar.M().f69043a, yVar.M().f69044b);
        if (C7464j.f(a11) == 0.0f || C7464j.d(a11) == 0.0f) {
            return null;
        }
        float f7 = yVar.M().f69045c;
        double d11 = f7;
        if (d11 < 1.0d) {
            a11 = C7464j.b(C7464j.f(a11) * f7, 0.0f, 2, a11);
        } else if (d11 > 1.0d) {
            a11 = C7464j.b(0.0f, C7464j.d(a11) / f7, 1, a11);
        }
        return C7464j.a(a11);
    }

    private final void e(y yVar) {
        boolean z11 = this.f412c;
        C3991w0 c3991w0 = this.f411b;
        if (yVar == null) {
            c3991w0.setValue(Boolean.valueOf(b() || !z11));
            return;
        }
        if (yVar.l(30) && !yVar.i().b()) {
            r2 = true;
        }
        if (!z11 && !r2) {
            c3991w0.setValue(Boolean.TRUE);
        }
        if (r2) {
            if (yVar.l(30) && yVar.i().c(2)) {
                return;
            }
            c3991w0.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f411b.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7464j c() {
        return (C7464j) this.f410a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(final y yVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f409g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f409g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f407e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f409g;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        this.f413d = yVar;
                        try {
                            this.f410a.setValue(d(yVar));
                            e(yVar);
                            if (yVar == null) {
                                return Unit.f71690a;
                            }
                            Function2 function2 = new Function2() { // from class: A4.f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return h.a(h.this, yVar, (y) obj2, (y.b) obj3);
                                }
                            };
                            gVar.f406d = this;
                            gVar.f409g = 1;
                            if (C7248D.b(yVar, function2, gVar) == aVar) {
                                return aVar;
                            }
                            hVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            hVar = this;
                            hVar.getClass();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = gVar.f406d;
                    try {
                        s.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        hVar.getClass();
                        throw th;
                    }
                }
                throw new C4005g();
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f407e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f409g;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    public h(boolean z11) {
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(null, D1.f25195a);
        this.f410a = f7;
        f11 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f411b = f11;
        this.f412c = z11;
    }
}
