package R00;

import G.g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private RZ.b f24228a;

    @NotNull
    public abstract String a();

    public final RZ.b b() {
        return this.f24228a;
    }

    @NotNull
    public abstract String c();

    @NotNull
    public final String d() {
        return g.c(c(), ".", a());
    }

    public abstract String e();

    public final void f(RZ.b bVar) {
        this.f24228a = bVar;
    }
}
