package Qd0;

import Pd0.i;
import Pd0.j;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$2;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LimbActionInitializer$init$2 f23323a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23324b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23325c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23326d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23327e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23328f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23329g;

    public g(@NotNull LimbActionInitializer$init$2 dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f23323a = dependencies;
        this.f23324b = k.b(new d(this));
        this.f23325c = k.b(new c(this));
        this.f23326d = k.b(f.f23322b);
        this.f23327e = k.b(a.f23317b);
        this.f23328f = k.b(new e(this));
        this.f23329g = k.b(new b(this));
    }

    public static final Pd0.d a(g gVar) {
        return (Pd0.d) gVar.f23327e.getValue();
    }

    public static final Rd0.b b(g gVar) {
        return (Rd0.b) gVar.f23325c.getValue();
    }

    public static final j c(g gVar) {
        return (j) gVar.f23326d.getValue();
    }

    @NotNull
    public final Pd0.e d() {
        return (Pd0.e) this.f23329g.getValue();
    }

    @NotNull
    public final Kd0.e e() {
        return this.f23323a;
    }

    @NotNull
    public final Pd0.b f() {
        return (Pd0.b) this.f23328f.getValue();
    }

    public final void g() {
        ((i) this.f23324b.getValue()).a();
    }
}
