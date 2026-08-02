package S0;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class H0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G0 f25208a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25209b;

    /* renamed from: c, reason: collision with root package name */
    private final l1<T> f25210c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<InterfaceC3994y, T> f25211d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25212e;

    /* renamed from: f, reason: collision with root package name */
    private final T f25213f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25214g = true;

    /* JADX WARN: Multi-variable type inference failed */
    public H0(@NotNull G0 g02, Object obj, boolean z11, l1 l1Var, Function1 function1, boolean z12) {
        this.f25208a = g02;
        this.f25209b = z11;
        this.f25210c = l1Var;
        this.f25211d = function1;
        this.f25212e = z12;
        this.f25213f = obj;
    }

    public final boolean a() {
        return this.f25214g;
    }

    @NotNull
    public final AbstractC3992x<T> b() {
        return this.f25208a;
    }

    public final Function1<InterfaceC3994y, T> c() {
        return this.f25211d;
    }

    public final T d() {
        if (this.f25209b) {
            return null;
        }
        T t2 = this.f25213f;
        if (t2 != null) {
            return t2;
        }
        r.k("Unexpected form of a provided value");
        throw null;
    }

    public final l1<T> e() {
        return this.f25210c;
    }

    public final T f() {
        return this.f25213f;
    }

    @NotNull
    public final void g() {
        this.f25214g = false;
    }

    public final boolean h() {
        return this.f25212e;
    }

    public final boolean i() {
        return (this.f25209b || this.f25213f != null) && !this.f25212e;
    }
}
