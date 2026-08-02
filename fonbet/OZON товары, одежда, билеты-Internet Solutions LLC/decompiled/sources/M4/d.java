package M4;

import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f17387a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f17388b = new c();

    /* renamed from: c, reason: collision with root package name */
    private boolean f17389c;

    public d(e eVar) {
        this.f17387a = eVar;
    }

    @NotNull
    public final c a() {
        return this.f17388b;
    }

    public final void b() {
        e eVar = this.f17387a;
        AbstractC5434v lifecycle = eVar.getLifecycle();
        if (lifecycle.b() != AbstractC5434v.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new a(eVar));
        this.f17388b.d(lifecycle);
        this.f17389c = true;
    }

    public final void c(Bundle bundle) {
        if (!this.f17389c) {
            b();
        }
        AbstractC5434v lifecycle = this.f17387a.getLifecycle();
        if (!lifecycle.b().a(AbstractC5434v.b.STARTED)) {
            this.f17388b.e(bundle);
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
    }

    public final void d(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f17388b.f(outBundle);
    }
}
