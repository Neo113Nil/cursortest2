package N;

import C.S;
import C.f0;
import C.s0;
import Cm.RunnableC2781a;
import P.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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
public final class l implements C, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final n f18233a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f18234b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18235c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f18236d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f18237e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f18238f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f18239g;

    /* renamed from: h, reason: collision with root package name */
    final LinkedHashMap f18240h;

    /* renamed from: i, reason: collision with root package name */
    private int f18241i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18242j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f18243k;

    public static class a {
        @NonNull
        public static l a(@NonNull C.A a11) {
            return new l(a11);
        }
    }

    static abstract class b {
        b() {
        }

        @NonNull
        abstract b.a<Void> a();

        abstract int b();

        abstract int c();
    }

    l(@NonNull final C.A a11) {
        Map map = Collections.EMPTY_MAP;
        this.f18237e = new AtomicBoolean(false);
        this.f18238f = new float[16];
        this.f18239g = new float[16];
        this.f18240h = new LinkedHashMap();
        this.f18241i = 0;
        this.f18242j = false;
        this.f18243k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f18234b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f18236d = handler;
        this.f18235c = H.c.f(handler);
        this.f18233a = new n();
        try {
            try {
                androidx.concurrent.futures.b.a(new b.c(this) { // from class: N.d

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ l f18211a;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Map f18213c;

                    {
                        Map map2 = Collections.EMPTY_MAP;
                        this.f18211a = this;
                        this.f18213c = map2;
                    }

                    @Override // androidx.concurrent.futures.b.c
                    public final Object c(b.a aVar) {
                        Map map2 = Collections.EMPTY_MAP;
                        l.k(this.f18211a, a11, aVar);
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

    public static /* synthetic */ void d(l lVar, s0 s0Var, SurfaceTexture surfaceTexture, Surface surface) {
        lVar.getClass();
        s0Var.b();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        lVar.f18241i--;
        lVar.n();
    }

    public static /* synthetic */ void e(l lVar) {
        lVar.f18242j = true;
        lVar.n();
    }

    public static /* synthetic */ void f(l lVar, C.A a11, b.a aVar) {
        Map map = Collections.EMPTY_MAP;
        lVar.getClass();
        try {
            lVar.f18233a.g(a11);
            aVar.c(null);
        } catch (RuntimeException e11) {
            aVar.e(e11);
        }
    }

    public static void g(final l lVar, int i11, int i12, b.a aVar) {
        lVar.getClass();
        final C3643a c3643a = new C3643a(i11, i12, aVar);
        lVar.o(new Runnable() { // from class: N.g
            @Override // java.lang.Runnable
            public final void run() {
                l.this.f18243k.add(c3643a);
            }
        }, new B50.l(aVar, 2));
    }

    public static /* synthetic */ void h(l lVar, s0 s0Var, s0.d dVar) {
        lVar.getClass();
        d.e eVar = d.e.DEFAULT;
        if (s0Var.e().c() && dVar.e()) {
            eVar = d.e.YUV;
        }
        lVar.f18233a.n(eVar);
    }

    public static /* synthetic */ void i(final l lVar, final f0 f0Var) {
        Surface I12 = f0Var.I1(lVar.f18235c, new InterfaceC10646a() { // from class: N.h
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                l.j(l.this, f0Var);
            }
        });
        lVar.f18233a.i(I12);
        lVar.f18240h.put(f0Var, I12);
    }

    public static /* synthetic */ void j(l lVar, f0 f0Var) {
        lVar.getClass();
        f0Var.close();
        Surface surface = (Surface) lVar.f18240h.remove(f0Var);
        if (surface != null) {
            lVar.f18233a.p(surface);
        }
    }

    public static void k(final l lVar, final C.A a11, final b.a aVar) {
        Map map = Collections.EMPTY_MAP;
        lVar.getClass();
        lVar.o(new Runnable(lVar) { // from class: N.j

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f18229a;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map f18231c;

            {
                Map map2 = Collections.EMPTY_MAP;
                this.f18229a = lVar;
                this.f18231c = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Map map2 = Collections.EMPTY_MAP;
                l.f(this.f18229a, a11, aVar);
            }
        }, new RunnableC10106j());
    }

    public static /* synthetic */ void l(final l lVar, final s0 s0Var) {
        lVar.f18241i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(lVar.f18233a.f());
        surfaceTexture.setDefaultBufferSize(s0Var.g().getWidth(), s0Var.g().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        Executor executor = lVar.f18235c;
        s0Var.l(executor, new E.D(lVar, s0Var));
        s0Var.k(surface, executor, new InterfaceC10646a() { // from class: N.i
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                Surface surface2 = surface;
                l.d(l.this, s0Var, surfaceTexture, surface2);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(lVar, lVar.f18236d);
    }

    public static /* synthetic */ void m(l lVar, Runnable runnable, Runnable runnable2) {
        if (lVar.f18242j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private void n() {
        if (this.f18242j && this.f18241i == 0) {
            LinkedHashMap linkedHashMap = this.f18240h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f0) it.next()).close();
            }
            Iterator it2 = this.f18243k.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a().e(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            this.f18233a.j();
            this.f18234b.quit();
        }
    }

    private void o(@NonNull Runnable runnable, @NonNull Runnable runnable2) {
        try {
            this.f18235c.execute(new RunnableC3647e(this, runnable2, runnable, 0));
        } catch (RejectedExecutionException e11) {
            S.l("DefaultSurfaceProcessor", "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    private void p(@NonNull Exception exc) {
        ArrayList arrayList = this.f18243k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().e(exc);
        }
        arrayList.clear();
    }

    private void q(Sc.v<Surface, Size, float[]> vVar) {
        ArrayList arrayList = this.f18243k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (vVar == null) {
            p(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i11 = -1;
                int i12 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (i11 != bVar.c() || bitmap == null) {
                        i11 = bVar.c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Size f7 = vVar.f();
                        float[] fArr = (float[]) vVar.g().clone();
                        G.o.a(i11, fArr);
                        G.o.b(fArr);
                        bitmap = this.f18233a.o(G.r.g(f7, i11), fArr);
                        i12 = -1;
                    }
                    if (i12 != bVar.b()) {
                        byteArrayOutputStream.reset();
                        i12 = bVar.b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface e11 = vVar.e();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.i(bArr, e11);
                    bVar.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e12) {
            p(e12);
        }
    }

    @Override // N.C
    public final void a(@NonNull s0 s0Var) {
        if (this.f18237e.get()) {
            s0Var.n();
        } else {
            o(new RunnableC2781a(2, this, s0Var), new Ec0.b(s0Var, 2));
        }
    }

    @Override // N.C
    public final void b(@NonNull f0 f0Var) {
        if (this.f18237e.get()) {
            f0Var.close();
            return;
        }
        L3.q qVar = new L3.q(1, this, f0Var);
        Objects.requireNonNull(f0Var);
        o(qVar, new E.r(f0Var, 1));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        if (this.f18237e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f18238f;
        surfaceTexture.getTransformMatrix(fArr);
        Sc.v<Surface, Size, float[]> vVar = null;
        for (Map.Entry entry : this.f18240h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            f0 f0Var = (f0) entry.getKey();
            float[] fArr2 = this.f18239g;
            f0Var.f0(fArr2, fArr);
            if (f0Var.g() == 34) {
                try {
                    this.f18233a.m(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e11) {
                    S.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e11);
                }
            } else {
                x2.i.f("Unsupported format: " + f0Var.g(), f0Var.g() == 256);
                x2.i.f("Only one JPEG output is supported.", vVar == null);
                vVar = new Sc.v<>(surface, f0Var.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            q(vVar);
        } catch (RuntimeException e12) {
            p(e12);
        }
    }

    @Override // N.C
    public final void release() {
        if (this.f18237e.getAndSet(true)) {
            return;
        }
        o(new H30.i(this, 1), new RunnableC10106j());
    }
}
