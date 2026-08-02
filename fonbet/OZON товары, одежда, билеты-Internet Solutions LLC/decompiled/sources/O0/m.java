package O0;

import Bl0.C2656q;
import Kk.C3532b;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7459e;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m0.C7980b;
import m0.C7984d;
import m0.C8008p;
import n1.C8408a;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import xe.C10754w;
import xe.InterfaceC10750u;
import xe.N;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private C7459e f19779a;

    /* renamed from: b, reason: collision with root package name */
    private final float f19780b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19781c;

    /* renamed from: d, reason: collision with root package name */
    private Float f19782d;

    /* renamed from: e, reason: collision with root package name */
    private C7459e f19783e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C7980b<Float, C8008p> f19784f = C7984d.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C7980b<Float, C8008p> f19785g = C7984d.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C7980b<Float, C8008p> f19786h = C7984d.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<Unit> f19787i = C10754w.a();

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3991w0 f19788j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3991w0 f19789k;

    public m(C7459e c7459e, float f7, boolean z11) {
        C3991w0 f11;
        C3991w0 f12;
        this.f19779a = c7459e;
        this.f19780b = f7;
        this.f19781c = z11;
        Boolean bool = Boolean.FALSE;
        f11 = n1.f(bool, D1.f25195a);
        this.f19788j = f11;
        f12 = n1.f(bool, D1.f25195a);
        this.f19789k = f12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r8.s(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        m mVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f19766g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f19766g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f19764e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f19766g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    jVar.f19763d = this;
                    jVar.f19766g = 1;
                    Object d11 = N.d(new k(this, null), jVar);
                    if (d11 != obj2) {
                        d11 = Unit.f71690a;
                    }
                    if (d11 != obj2) {
                        mVar = this;
                    }
                    return obj2;
                }
                if (i11 == 1) {
                    mVar = jVar.f19763d;
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    mVar = jVar.f19763d;
                    Sc.s.b(obj);
                    jVar.f19763d = null;
                    jVar.f19766g = 3;
                    mVar.getClass();
                    Object d12 = N.d(new l(mVar, null), jVar);
                    if (d12 != obj2) {
                        d12 = Unit.f71690a;
                    }
                }
                mVar.f19788j.setValue(Boolean.TRUE);
                InterfaceC10750u<Unit> interfaceC10750u = mVar.f19787i;
                jVar.f19763d = mVar;
                jVar.f19766g = 2;
            }
        }
        jVar = new j(this, cVar);
        Object obj3 = jVar.f19764e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f19766g;
        if (i11 != 0) {
        }
        mVar.f19788j.setValue(Boolean.TRUE);
        InterfaceC10750u<Unit> interfaceC10750u2 = mVar.f19787i;
        jVar.f19763d = mVar;
        jVar.f19766g = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull InterfaceC8410c interfaceC8410c, long j11) {
        if (this.f19782d == null) {
            long i11 = interfaceC8410c.i();
            int i12 = n.f19791b;
            this.f19782d = Float.valueOf(Math.max(C7464j.f(i11), C7464j.d(i11)) * 0.3f);
        }
        if (this.f19779a == null) {
            this.f19779a = C7459e.a(interfaceC8410c.A0());
        }
        if (this.f19783e == null) {
            this.f19783e = C7459e.a(P9.a.a(C7464j.f(interfaceC8410c.i()) / 2.0f, C7464j.d(interfaceC8410c.i()) / 2.0f));
        }
        float floatValue = (!((Boolean) this.f19789k.getValue()).booleanValue() || ((Boolean) this.f19788j.getValue()).booleanValue()) ? this.f19784f.k().floatValue() : 1.0f;
        Float f7 = this.f19782d;
        Intrinsics.f(f7);
        float b11 = C2656q.b(f7.floatValue(), this.f19780b, this.f19785g.k().floatValue());
        C7459e c7459e = this.f19779a;
        Intrinsics.f(c7459e);
        float g10 = C7459e.g(c7459e.n());
        C7459e c7459e2 = this.f19783e;
        Intrinsics.f(c7459e2);
        float g11 = C7459e.g(c7459e2.n());
        C7980b<Float, C8008p> c7980b = this.f19786h;
        float b12 = C2656q.b(g10, g11, c7980b.k().floatValue());
        C7459e c7459e3 = this.f19779a;
        Intrinsics.f(c7459e3);
        float h11 = C7459e.h(c7459e3.n());
        C7459e c7459e4 = this.f19783e;
        Intrinsics.f(c7459e4);
        long a11 = P9.a.a(b12, C2656q.b(h11, C7459e.h(c7459e4.n()), c7980b.k().floatValue()));
        long o11 = C7807Z.o(C7807Z.q(j11) * floatValue, j11);
        if (!this.f19781c) {
            InterfaceC8412e.m1(interfaceC8410c, o11, b11, a11, 120);
            return;
        }
        float f11 = C7464j.f(interfaceC8410c.i());
        float d11 = C7464j.d(interfaceC8410c.i());
        C8408a.b w02 = interfaceC8410c.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            w02.f().b(0.0f, 0.0f, f11, d11, 1);
            InterfaceC8412e.m1(interfaceC8410c, o11, b11, a11, 120);
        } finally {
            C3532b.b(w02, e11);
        }
    }

    public final void f() {
        this.f19789k.setValue(Boolean.TRUE);
        this.f19787i.complete(Unit.f71690a);
    }
}
