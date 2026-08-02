package Wa;

import Ja.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c implements Na.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Na.b[] f33414a;

    public c(@NotNull Na.b... listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f33414a = listeners;
    }

    @Override // Na.b
    public final void a(@NotNull i request, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(e11, "e");
        for (Na.b bVar : this.f33414a) {
            bVar.a(request, e11);
        }
    }

    @Override // Na.b
    public final void b(@NotNull i request, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(e11, "e");
        for (Na.b bVar : this.f33414a) {
            bVar.b(request, e11);
        }
    }

    @Override // Na.b
    public final void c(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.c(request);
        }
    }

    @Override // Na.b
    public final void d(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.d(request);
        }
    }

    @Override // Na.b
    public final void e(@NotNull i request, long j11) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.e(request, j11);
        }
    }

    @Override // Na.b
    public final void f(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.f(request);
        }
    }

    @Override // Na.b
    public final void g(@NotNull i request, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        for (Na.b bVar : this.f33414a) {
            bVar.g(request, error);
        }
    }

    @Override // Na.b
    public final void h(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.h(request);
        }
    }

    @Override // Na.b
    public final void i(@NotNull i request, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(e11, "e");
        for (Na.b bVar : this.f33414a) {
            bVar.i(request, e11);
        }
    }

    @Override // Na.b
    public final void j(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.j(request);
        }
    }

    @Override // Na.b
    public final void k(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.k(request);
        }
    }

    @Override // Na.b
    public final void l(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (Na.b bVar : this.f33414a) {
            bVar.l(request);
        }
    }
}
