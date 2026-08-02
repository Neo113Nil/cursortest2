package N;

import C.S;
import C.f0;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
final class B implements f0 {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Surface f18179b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18180c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final Size f18181d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final float[] f18182e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC10646a<f0.b> f18183f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f18184g;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final com.google.common.util.concurrent.m<Void> f18187j;

    /* renamed from: k, reason: collision with root package name */
    private b.a<Void> f18188k;

    /* renamed from: a, reason: collision with root package name */
    private final Object f18178a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private boolean f18185h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18186i = false;

    B(@NonNull Surface surface, int i11, @NonNull Size size, @NonNull f0.a aVar, f0.a aVar2) {
        float[] fArr = new float[16];
        this.f18182e = fArr;
        this.f18179b = surface;
        this.f18180c = i11;
        this.f18181d = size;
        d(fArr, new float[16], aVar);
        d(new float[16], new float[16], aVar2);
        this.f18187j = androidx.concurrent.futures.b.a(new b.c() { // from class: N.z
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar3) {
                B.this.f18188k = aVar3;
                return "SurfaceOutputImpl close future complete";
            }
        });
    }

    private static void d(@NonNull float[] fArr, @NonNull float[] fArr2, f0.a aVar) {
        Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        G.o.b(fArr);
        G.o.a(aVar.e(), fArr);
        if (aVar.d()) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size g10 = G.r.g(aVar.c(), aVar.e());
        Size c11 = aVar.c();
        float f7 = 0;
        android.graphics.Matrix a11 = G.r.a(new RectF(f7, f7, c11.getWidth(), c11.getHeight()), new RectF(f7, f7, g10.getWidth(), g10.getHeight()), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        a11.mapRect(rectF);
        float width = rectF.left / g10.getWidth();
        float height = ((g10.getHeight() - rectF.height()) - rectF.top) / g10.getHeight();
        float width2 = rectF.width() / g10.getWidth();
        float height2 = rectF.height() / g10.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        I a12 = aVar.a();
        Matrix.setIdentityM(fArr2, 0);
        G.o.b(fArr2);
        if (a12 != null) {
            x2.i.f("Camera has no transform.", a12.p());
            G.o.a(a12.b().i(), fArr2);
            if (a12.f()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // C.f0
    @NonNull
    public final Surface I1(@NonNull Executor executor, @NonNull InterfaceC10646a<f0.b> interfaceC10646a) {
        boolean z11;
        synchronized (this.f18178a) {
            this.f18184g = executor;
            this.f18183f = interfaceC10646a;
            z11 = this.f18185h;
        }
        if (z11) {
            k();
        }
        return this.f18179b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f18178a) {
            try {
                if (!this.f18186i) {
                    this.f18186i = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18188k.c(null);
    }

    @Override // C.f0
    public final void f0(@NonNull float[] fArr, @NonNull float[] fArr2) {
        i0(fArr, fArr2);
    }

    @Override // C.f0
    public final int g() {
        return this.f18180c;
    }

    @Override // C.f0
    @NonNull
    public final Size getSize() {
        return this.f18181d;
    }

    @Override // C.f0
    public final void i0(@NonNull float[] fArr, @NonNull float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f18182e, 0);
    }

    @NonNull
    public final com.google.common.util.concurrent.m<Void> j() {
        return this.f18187j;
    }

    public final void k() {
        Executor executor;
        InterfaceC10646a<f0.b> interfaceC10646a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f18178a) {
            try {
                if (this.f18184g != null && (interfaceC10646a = this.f18183f) != null) {
                    if (!this.f18186i) {
                        atomicReference.set(interfaceC10646a);
                        executor = this.f18184g;
                        this.f18185h = false;
                    }
                    executor = null;
                }
                this.f18185h = true;
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: N.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        B b11 = B.this;
                        b11.getClass();
                        ((InterfaceC10646a) atomicReference.get()).accept(f0.b.c(b11));
                    }
                });
            } catch (RejectedExecutionException e11) {
                S.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e11);
            }
        }
    }
}
