package F5;

import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10754w;
import xe.InterfaceC10750u;

/* loaded from: classes8.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<B5.g> f9067a = C10754w.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9068b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9069c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A1 f9070d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final A1 f9071e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final A1 f9072f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final A1 f9073g;

    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            q qVar = q.this;
            return Boolean.valueOf((qVar.getValue() == null && qVar.m() == null) ? false : true);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(q.this.m() != null);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            q qVar = q.this;
            return Boolean.valueOf(qVar.getValue() == null && qVar.m() == null);
        }
    }

    static final class d extends AbstractC7737t implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(q.this.getValue() != null);
        }
    }

    public q() {
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(null, D1.f25195a);
        this.f9068b = f7;
        f11 = n1.f(null, D1.f25195a);
        this.f9069c = f11;
        this.f9070d = n1.e(new c());
        this.f9071e = n1.e(new a());
        this.f9072f = n1.e(new b());
        this.f9073g = n1.e(new d());
    }

    public final synchronized void b(@NotNull B5.g composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (s()) {
            return;
        }
        this.f9068b.setValue(composition);
        this.f9067a.complete(composition);
    }

    public final synchronized void k(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (s()) {
            return;
        }
        this.f9069c.setValue(error);
        this.f9067a.L(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable m() {
        return (Throwable) this.f9069c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.A1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final B5.g getValue() {
        return (B5.g) this.f9068b.getValue();
    }

    public final boolean s() {
        return ((Boolean) this.f9071e.getValue()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.f9073g.getValue()).booleanValue();
    }
}
