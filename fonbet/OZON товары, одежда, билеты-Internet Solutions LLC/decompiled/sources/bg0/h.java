package bg0;

import We.G;
import kotlin.jvm.internal.Intrinsics;
import of.C8724c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private C8724c f56011a;

    /* renamed from: b, reason: collision with root package name */
    private g f56012b;

    private final C8724c d() {
        C8724c c8724c = this.f56011a;
        if (c8724c != null) {
            return c8724c;
        }
        throw new IllegalStateException("mockWebSever called before call start method");
    }

    public final void a() {
        g gVar = this.f56012b;
        if (gVar == null) {
            throw new IllegalStateException("mock response called before call start method");
        }
        gVar.b();
    }

    public final void b() {
        g gVar = this.f56012b;
        if (gVar == null) {
            throw new IllegalStateException("mock response called before call start method");
        }
        gVar.c();
    }

    public final void c(int i11) {
        g gVar = this.f56012b;
        if (gVar == null) {
            throw new IllegalStateException("mock response called before call start method");
        }
        gVar.d(i11);
    }

    @NotNull
    public final G e(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        G.a aVar = new G.a();
        aVar.j(d().J1(path));
        return aVar.b();
    }

    public final void f() {
        d().y1();
        this.f56011a = null;
        this.f56012b = null;
    }

    public final void g() {
        this.f56011a = new C8724c();
        this.f56012b = new g(d());
        C8724c.B1(d());
    }

    public final void h() {
        d().E1();
    }
}
