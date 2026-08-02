package O;

import B90.k0;
import C.A;
import C.Q;
import C.S;
import C.Z;
import C.f0;
import C.s0;
import E.r;
import N.C;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import v.RunnableC10106j;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class k implements C, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final c f19706a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f19707b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19708c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f19709d;

    /* renamed from: e, reason: collision with root package name */
    private int f19710e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19711f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f19712g;

    /* renamed from: h, reason: collision with root package name */
    final LinkedHashMap f19713h;

    /* renamed from: i, reason: collision with root package name */
    private SurfaceTexture f19714i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f19715j;

    public static class a {
        @NonNull
        public static C a(@NonNull A a11, @NonNull Q q11, @NonNull Q q12) {
            return new k(a11, q11, q12);
        }
    }

    k(@NonNull final A a11, @NonNull Q q11, @NonNull Q q12) {
        Map map = Collections.EMPTY_MAP;
        this.f19710e = 0;
        this.f19711f = false;
        this.f19712g = new AtomicBoolean(false);
        this.f19713h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f19707b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f19709d = handler;
        this.f19708c = H.c.f(handler);
        this.f19706a = new c(q11, q12);
        try {
            try {
                androidx.concurrent.futures.b.a(new b.c(this) { // from class: O.e

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ k f19691a;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Map f19693c;

                    {
                        Map map2 = Collections.EMPTY_MAP;
                        this.f19691a = this;
                        this.f19693c = map2;
                    }

                    @Override // androidx.concurrent.futures.b.c
                    public final Object c(b.a aVar) {
                        Map map2 = Collections.EMPTY_MAP;
                        k.j(this.f19691a, a11, aVar);
                        return "Init GlRenderer";
                    }
                }).get();
            } catch (InterruptedException | ExecutionException e11) {
                e = e11;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e12) {
            release();
            throw e12;
        }
    }

    public static /* synthetic */ void c(k kVar, Runnable runnable, Runnable runnable2) {
        if (kVar.f19711f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void d(k kVar, SurfaceTexture surfaceTexture, Surface surface) {
        kVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        kVar.f19710e--;
        kVar.k();
    }

    public static /* synthetic */ void e(k kVar) {
        kVar.f19711f = true;
        kVar.k();
    }

    public static /* synthetic */ void f(k kVar, f0 f0Var) {
        kVar.getClass();
        f0Var.close();
        Surface surface = (Surface) kVar.f19713h.remove(f0Var);
        if (surface != null) {
            kVar.f19706a.p(surface);
        }
    }

    public static /* synthetic */ void g(final k kVar, final f0 f0Var) {
        Surface I12 = f0Var.I1(kVar.f19708c, new InterfaceC10646a() { // from class: O.g
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                k.f(k.this, f0Var);
            }
        });
        kVar.f19706a.i(I12);
        kVar.f19713h.put(f0Var, I12);
    }

    public static /* synthetic */ void h(final k kVar, s0 s0Var) {
        kVar.f19710e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(kVar.f19706a.r(s0Var.i()));
        surfaceTexture.setDefaultBufferSize(s0Var.g().getWidth(), s0Var.g().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        s0Var.k(surface, kVar.f19708c, new InterfaceC10646a() { // from class: O.i
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                Surface surface2 = surface;
                k.d(k.this, surfaceTexture, surface2);
            }
        });
        if (s0Var.i()) {
            kVar.f19714i = surfaceTexture;
        } else {
            kVar.f19715j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(kVar, kVar.f19709d);
        }
    }

    public static /* synthetic */ void i(k kVar, A a11, b.a aVar) {
        Map map = Collections.EMPTY_MAP;
        kVar.getClass();
        try {
            kVar.f19706a.g(a11);
            aVar.c(null);
        } catch (RuntimeException e11) {
            aVar.e(e11);
        }
    }

    public static void j(final k kVar, final A a11, final b.a aVar) {
        Map map = Collections.EMPTY_MAP;
        kVar.getClass();
        kVar.l(new Runnable(kVar) { // from class: O.f

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f19694a;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map f19696c;

            {
                Map map2 = Collections.EMPTY_MAP;
                this.f19694a = kVar;
                this.f19696c = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Map map2 = Collections.EMPTY_MAP;
                k.i(this.f19694a, a11, aVar);
            }
        }, new RunnableC10106j());
    }

    private void k() {
        if (this.f19711f && this.f19710e == 0) {
            LinkedHashMap linkedHashMap = this.f19713h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f0) it.next()).close();
            }
            linkedHashMap.clear();
            this.f19706a.j();
            this.f19707b.quit();
        }
    }

    private void l(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.f19708c.execute(new Runnable() { // from class: O.h
                @Override // java.lang.Runnable
                public final void run() {
                    k.c(k.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e11) {
            S.l("DualSurfaceProcessor", "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    @Override // N.C
    public final void a(@NonNull s0 s0Var) throws Z {
        if (this.f19712g.get()) {
            s0Var.n();
        } else {
            l(new L2.c(1, this, s0Var), new Ec0.b(s0Var, 2));
        }
    }

    @Override // N.C
    public final void b(@NonNull f0 f0Var) throws Z {
        if (this.f19712g.get()) {
            f0Var.close();
            return;
        }
        Dc0.i iVar = new Dc0.i(2, this, f0Var);
        Objects.requireNonNull(f0Var);
        l(iVar, new r(f0Var, 1));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f19712g.get() || (surfaceTexture2 = this.f19714i) == null || this.f19715j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f19715j.updateTexImage();
        for (Map.Entry entry : this.f19713h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            f0 f0Var = (f0) entry.getKey();
            if (f0Var.g() == 34) {
                try {
                    this.f19706a.s(surfaceTexture.getTimestamp(), surface, f0Var, this.f19714i, this.f19715j);
                } catch (RuntimeException e11) {
                    S.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e11);
                }
            }
        }
    }

    @Override // N.C
    public final void release() {
        if (this.f19712g.getAndSet(true)) {
            return;
        }
        l(new k0(this, 4), new RunnableC10106j());
    }
}
