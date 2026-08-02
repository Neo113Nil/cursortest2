package androidx.camera.core;

import C.c0;
import E.Y;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.f;
import androidx.camera.core.impl.InterfaceC5104l0;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class u implements InterfaceC5104l0 {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5104l0 f38456d;

    /* renamed from: e, reason: collision with root package name */
    private final Surface f38457e;

    /* renamed from: f, reason: collision with root package name */
    private Y f38458f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f38453a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private int f38454b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38455c = false;

    /* renamed from: g, reason: collision with root package name */
    private final c0 f38459g = new f.a() { // from class: C.c0
        @Override // androidx.camera.core.f.a
        public final void h(androidx.camera.core.f fVar) {
            androidx.camera.core.u.h(androidx.camera.core.u.this, fVar);
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [C.c0] */
    public u(@NonNull InterfaceC5104l0 interfaceC5104l0) {
        this.f38456d = interfaceC5104l0;
        this.f38457e = interfaceC5104l0.a();
    }

    public static /* synthetic */ void h(u uVar, f fVar) {
        Y y11;
        synchronized (uVar.f38453a) {
            try {
                int i11 = uVar.f38454b - 1;
                uVar.f38454b = i11;
                if (uVar.f38455c && i11 == 0) {
                    uVar.close();
                }
                y11 = uVar.f38458f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (y11 != null) {
            y11.h(fVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final Surface a() {
        Surface a11;
        synchronized (this.f38453a) {
            a11 = this.f38456d.a();
        }
        return a11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int b() {
        int b11;
        synchronized (this.f38453a) {
            b11 = this.f38456d.b();
        }
        return b11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int c() {
        int c11;
        synchronized (this.f38453a) {
            c11 = this.f38456d.c();
        }
        return c11;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void close() {
        synchronized (this.f38453a) {
            try {
                Surface surface = this.f38457e;
                if (surface != null) {
                    surface.release();
                }
                this.f38456d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final p d() {
        v vVar;
        synchronized (this.f38453a) {
            p d11 = this.f38456d.d();
            if (d11 != null) {
                this.f38454b++;
                vVar = new v(d11);
                vVar.c(this.f38459g);
            } else {
                vVar = null;
            }
        }
        return vVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final p e() {
        v vVar;
        synchronized (this.f38453a) {
            p e11 = this.f38456d.e();
            if (e11 != null) {
                this.f38454b++;
                vVar = new v(e11);
                vVar.c(this.f38459g);
            } else {
                vVar = null;
            }
        }
        return vVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void f() {
        synchronized (this.f38453a) {
            this.f38456d.f();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final void g(@NonNull final InterfaceC5104l0.a aVar, @NonNull Executor executor) {
        synchronized (this.f38453a) {
            this.f38456d.g(new InterfaceC5104l0.a() { // from class: C.b0
                @Override // androidx.camera.core.impl.InterfaceC5104l0.a
                public final void a(InterfaceC5104l0 interfaceC5104l0) {
                    androidx.camera.core.u uVar = androidx.camera.core.u.this;
                    uVar.getClass();
                    aVar.a(uVar);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getHeight() {
        int height;
        synchronized (this.f38453a) {
            height = this.f38456d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0
    public final int getWidth() {
        int width;
        synchronized (this.f38453a) {
            width = this.f38456d.getWidth();
        }
        return width;
    }

    public final int i() {
        int c11;
        synchronized (this.f38453a) {
            c11 = this.f38456d.c() - this.f38454b;
        }
        return c11;
    }

    public final void j() {
        synchronized (this.f38453a) {
            try {
                this.f38455c = true;
                this.f38456d.f();
                if (this.f38454b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(@NonNull Y y11) {
        synchronized (this.f38453a) {
            this.f38458f = y11;
        }
    }
}
