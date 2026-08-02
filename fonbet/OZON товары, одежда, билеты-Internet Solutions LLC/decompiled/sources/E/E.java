package E;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.camera.core.impl.X0;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class E implements InterfaceC5104l0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final InterfaceC5104l0 f6795a;

    /* renamed from: b, reason: collision with root package name */
    private P f6796b;

    E(@NonNull InterfaceC5104l0 interfaceC5104l0) {
        this.f6795a = interfaceC5104l0;
    }

    private C.d0 j(androidx.camera.core.p pVar) {
        if (pVar == null) {
            return null;
        }
        X0 b11 = this.f6796b == null ? X0.b() : X0.a(new Pair(this.f6796b.h(), this.f6796b.g().get(0)));
        this.f6796b = null;
        return new C.d0(pVar, new Size(pVar.getWidth(), pVar.getHeight()), new J.c(new R.i(b11, pVar.x0().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final Surface a() {
        return this.f6795a.a();
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int b() {
        return this.f6795a.b();
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int c() {
        return this.f6795a.c();
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void close() {
        this.f6795a.close();
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final androidx.camera.core.p d() {
        return j(this.f6795a.d());
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final androidx.camera.core.p e() {
        return j(this.f6795a.e());
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void f() {
        this.f6795a.f();
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void g(@NonNull InterfaceC5104l0.a aVar, @NonNull Executor executor) {
        this.f6795a.g(new D(this, aVar), executor);
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getHeight() {
        return this.f6795a.getHeight();
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getWidth() {
        return this.f6795a.getWidth();
    }

    final void h(@NonNull P p11) {
        x2.i.f("Pending request should be null", this.f6796b == null);
        this.f6796b = p11;
    }

    final void i() {
        this.f6796b = null;
    }
}
