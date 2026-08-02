package androidx.camera.core;

import B90.B;
import C.S;
import C.d0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.concurrent.futures.b;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
abstract class k implements InterfaceC5104l0.a {

    /* renamed from: a, reason: collision with root package name */
    private B f38410a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f38411b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f38412c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f38414e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f38415f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f38416g;

    /* renamed from: h, reason: collision with root package name */
    private u f38417h;

    /* renamed from: i, reason: collision with root package name */
    private ImageWriter f38418i;

    /* renamed from: n, reason: collision with root package name */
    ByteBuffer f38423n;

    /* renamed from: o, reason: collision with root package name */
    ByteBuffer f38424o;

    /* renamed from: p, reason: collision with root package name */
    ByteBuffer f38425p;

    /* renamed from: q, reason: collision with root package name */
    ByteBuffer f38426q;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f38413d = 1;

    /* renamed from: j, reason: collision with root package name */
    private Rect f38419j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private Rect f38420k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    private Matrix f38421l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private Matrix f38422m = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    private final Object f38427r = new Object();

    /* renamed from: s, reason: collision with root package name */
    protected boolean f38428s = true;

    k() {
    }

    public static void b(k kVar, p pVar, Matrix matrix, p pVar2, Rect rect, B b11, b.a aVar) {
        if (!kVar.f38428s) {
            aVar.e(new androidx.core.os.l("ImageAnalysis is detached"));
            return;
        }
        d0 d0Var = new d0(pVar2, null, new e(pVar.x0().a(), pVar.x0().getTimestamp(), kVar.f38414e ? 0 : kVar.f38411b, matrix));
        if (!rect.isEmpty()) {
            d0Var.d(rect);
        }
        b11.analyze(d0Var);
        aVar.c(null);
    }

    private void f(@NonNull p pVar) {
        if (this.f38413d != 1) {
            if (this.f38413d == 2 && this.f38423n == null) {
                this.f38423n = ByteBuffer.allocateDirect(pVar.getHeight() * pVar.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f38424o == null) {
            this.f38424o = ByteBuffer.allocateDirect(pVar.getHeight() * pVar.getWidth());
        }
        this.f38424o.position(0);
        if (this.f38425p == null) {
            this.f38425p = ByteBuffer.allocateDirect((pVar.getHeight() * pVar.getWidth()) / 4);
        }
        this.f38425p.position(0);
        if (this.f38426q == null) {
            this.f38426q = ByteBuffer.allocateDirect((pVar.getHeight() * pVar.getWidth()) / 4);
        }
        this.f38426q.position(0);
    }

    private void h(int i11, int i12, int i13, int i14) {
        int i15 = this.f38411b;
        Matrix matrix = new Matrix();
        if (i15 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i11, i12);
            RectF rectF2 = G.r.f9647a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i15);
            RectF rectF3 = new RectF(0.0f, 0.0f, i13, i14);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f38419j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f38420k = rect;
        this.f38422m.setConcat(this.f38421l, matrix);
    }

    private void i(@NonNull p pVar, int i11) {
        u uVar = this.f38417h;
        if (uVar == null) {
            return;
        }
        uVar.j();
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        int b11 = this.f38417h.b();
        int c11 = this.f38417h.c();
        boolean z11 = i11 == 90 || i11 == 270;
        int i12 = z11 ? height : width;
        if (!z11) {
            width = height;
        }
        this.f38417h = new u(q.a(i12, width, b11, c11));
        if (this.f38413d == 1) {
            ImageWriter imageWriter = this.f38418i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f38418i = ImageWriter.newInstance(this.f38417h.a(), this.f38417h.c());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0.a
    public final void a(@NonNull InterfaceC5104l0 interfaceC5104l0) {
        try {
            p c11 = c(interfaceC5104l0);
            if (c11 != null) {
                g(c11);
            }
        } catch (IllegalStateException e11) {
            S.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e11);
        }
    }

    abstract p c(@NonNull InterfaceC5104l0 interfaceC5104l0);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.common.util.concurrent.m<Void> d(@NonNull final p pVar) {
        Object obj;
        final Executor executor;
        final B b11;
        boolean z11;
        u uVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        p pVar2;
        p h11;
        int i11 = this.f38414e ? this.f38411b : 0;
        Object obj2 = this.f38427r;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f38416g;
                    b11 = this.f38410a;
                    z11 = this.f38414e && i11 != this.f38412c;
                    if (z11) {
                        i(pVar, i11);
                    }
                    if (this.f38414e) {
                        f(pVar);
                    }
                    try {
                        uVar = this.f38417h;
                        try {
                            imageWriter = this.f38418i;
                            byteBuffer = this.f38423n;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            try {
                byteBuffer2 = this.f38424o;
                byteBuffer3 = this.f38425p;
                byteBuffer4 = this.f38426q;
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
                throw th;
            }
        }
        if (b11 == null || executor == null || !this.f38428s) {
            return I.k.f(new androidx.core.os.l("No analyzer or executor currently set."));
        }
        if (uVar != null) {
            if (this.f38413d == 2) {
                h11 = ImageProcessingUtil.d(pVar, uVar, byteBuffer, i11, this.f38415f);
            } else if (this.f38413d == 1) {
                if (this.f38415f) {
                    ImageProcessingUtil.a(pVar);
                }
                if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                    h11 = ImageProcessingUtil.h(pVar, uVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i11);
                }
            }
            pVar2 = h11;
            boolean z12 = pVar2 == null;
            final p pVar3 = !z12 ? pVar : pVar2;
            final Rect rect = new Rect();
            final Matrix matrix = new Matrix();
            synchronized (this.f38427r) {
                if (z11 && !z12) {
                    try {
                        h(pVar.getWidth(), pVar.getHeight(), pVar3.getWidth(), pVar3.getHeight());
                    } finally {
                    }
                }
                this.f38412c = i11;
                rect.set(this.f38420k);
                matrix.set(this.f38422m);
            }
            return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.i
                @Override // androidx.concurrent.futures.b.c
                public final Object c(final b.a aVar) {
                    final k kVar = k.this;
                    kVar.getClass();
                    final p pVar4 = pVar;
                    final Matrix matrix2 = matrix;
                    final Rect rect2 = rect;
                    final B b12 = b11;
                    final p pVar5 = pVar3;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.a aVar2 = aVar;
                            k.b(k.this, pVar4, matrix2, pVar5, rect2, b12, aVar2);
                        }
                    });
                    return "analyzeImage";
                }
            });
        }
        pVar2 = null;
        if (pVar2 == null) {
        }
        if (!z12) {
        }
        final Rect rect2 = new Rect();
        final Matrix matrix2 = new Matrix();
        synchronized (this.f38427r) {
        }
    }

    abstract void e();

    abstract void g(@NonNull p pVar);

    final void j(Executor executor, B b11) {
        synchronized (this.f38427r) {
            this.f38410a = b11;
            this.f38416g = executor;
        }
    }

    final void k(boolean z11) {
        this.f38415f = z11;
    }

    final void l(int i11) {
        this.f38413d = i11;
    }

    final void m(boolean z11) {
        this.f38414e = z11;
    }

    final void n(@NonNull u uVar) {
        synchronized (this.f38427r) {
            this.f38417h = uVar;
        }
    }

    final void o(int i11) {
        this.f38411b = i11;
    }

    final void p(@NonNull Matrix matrix) {
        synchronized (this.f38427r) {
            this.f38421l = matrix;
            this.f38422m = new Matrix(this.f38421l);
        }
    }

    final void q(@NonNull Rect rect) {
        synchronized (this.f38427r) {
            this.f38419j = rect;
            this.f38420k = new Rect(this.f38419j);
        }
    }
}
