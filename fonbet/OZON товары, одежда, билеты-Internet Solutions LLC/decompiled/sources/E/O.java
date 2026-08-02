package E;

import C.I;
import E.A;
import E.C2893i;
import E.C2906w;
import E.O;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final Executor f6811a;

    /* renamed from: b, reason: collision with root package name */
    private C2889e f6812b;

    /* renamed from: c, reason: collision with root package name */
    private N.o<b, N.p<androidx.camera.core.p>> f6813c;

    /* renamed from: d, reason: collision with root package name */
    private N.o<C2906w.a, N.p<byte[]>> f6814d;

    /* renamed from: e, reason: collision with root package name */
    private N.o<C2893i.b, N.p<byte[]>> f6815e;

    /* renamed from: f, reason: collision with root package name */
    private N.o<A.a, I.h> f6816f;

    /* renamed from: g, reason: collision with root package name */
    private N.o<N.p<byte[]>, N.p<Bitmap>> f6817g;

    /* renamed from: h, reason: collision with root package name */
    private C f6818h;

    /* renamed from: i, reason: collision with root package name */
    private B f6819i;

    /* renamed from: j, reason: collision with root package name */
    private C2905v f6820j;

    /* renamed from: k, reason: collision with root package name */
    private final I0 f6821k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f6822l;

    static abstract class a {
        a() {
        }

        abstract N.m<b> a();

        abstract int b();

        abstract int c();

        abstract N.m<b> d();
    }

    static abstract class b {
        b() {
        }

        @NonNull
        abstract androidx.camera.core.p a();

        @NonNull
        abstract P b();
    }

    O(@NonNull Executor executor) {
        I0 c11 = androidx.camera.core.internal.compat.quirk.a.c();
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f6811a = H.c.g(executor);
        } else {
            this.f6811a = executor;
        }
        this.f6821k = c11;
        this.f6822l = c11.a(IncorrectJpegMetadataQuirk.class);
    }

    public static void a(O o11, b bVar) {
        int c11 = o11.f6812b.c();
        x2.i.a("Postview only support YUV and JPEG output formats. Output format: " + c11, c11 == 35 || c11 == 256);
        final P b11 = bVar.b();
        try {
            final Bitmap bitmap = (Bitmap) o11.f6820j.a((N.p) ((F) o11.f6813c).a(bVar));
            H.c.e().execute(new Runnable() { // from class: E.M
                @Override // java.lang.Runnable
                public final void run() {
                    P.this.p(bitmap);
                }
            });
        } catch (Exception e11) {
            bVar.a().close();
            C.S.d("ProcessingNode", "process postview input packet failed.", e11);
        }
    }

    @NonNull
    final androidx.camera.core.p b(@NonNull b bVar) throws C.K {
        P b11 = bVar.b();
        N.p<androidx.camera.core.p> pVar = (N.p) ((F) this.f6813c).a(bVar);
        if ((pVar.e() == 35 || this.f6822l) && this.f6812b.c() == 256) {
            N.p pVar2 = (N.p) ((C2906w) this.f6814d).a(new C2887c(pVar, b11.b()));
            this.f6819i.getClass();
            androidx.camera.core.u uVar = new androidx.camera.core.u(androidx.camera.core.q.a(pVar2.h().getWidth(), pVar2.h().getHeight(), 256, 2));
            androidx.camera.core.p b12 = ImageProcessingUtil.b(uVar, (byte[]) pVar2.c());
            uVar.j();
            Objects.requireNonNull(b12);
            G.h d11 = pVar2.d();
            Objects.requireNonNull(d11);
            Rect b13 = pVar2.b();
            int f7 = pVar2.f();
            Matrix g10 = pVar2.g();
            InterfaceC5130z a11 = pVar2.a();
            androidx.camera.core.f fVar = (androidx.camera.core.f) b12;
            pVar = N.p.j(b12, d11, new Size(fVar.getWidth(), fVar.getHeight()), b13, f7, g10, a11);
        }
        this.f6818h.getClass();
        androidx.camera.core.p c11 = pVar.c();
        C.d0 d0Var = new C.d0(c11, pVar.h(), androidx.camera.core.r.d(c11.x0().a(), c11.x0().getTimestamp(), pVar.f(), pVar.g()));
        d0Var.d(pVar.b());
        return d0Var;
    }

    @NonNull
    final I.h c(@NonNull b bVar) throws C.K {
        int c11 = this.f6812b.c();
        x2.i.a("On-disk capture only support JPEG and JPEG/R output formats. Output format: " + c11, M.b.b(c11));
        P b11 = bVar.b();
        N.p<byte[]> pVar = (N.p) ((C2906w) this.f6814d).a(new C2887c((N.p) ((F) this.f6813c).a(bVar), b11.b()));
        if (G.r.b(pVar.b(), pVar.h())) {
            int b12 = b11.b();
            x2.i.f(null, M.b.b(pVar.e()));
            ((C2909z) this.f6817g).getClass();
            Rect b13 = pVar.b();
            byte[] c12 = pVar.c();
            try {
                Bitmap decodeRegion = BitmapRegionDecoder.newInstance(c12, 0, c12.length, false).decodeRegion(b13, new BitmapFactory.Options());
                G.h d11 = pVar.d();
                Objects.requireNonNull(d11);
                Rect rect = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
                int f7 = pVar.f();
                Matrix g10 = pVar.g();
                RectF rectF = G.r.f9647a;
                Matrix matrix = new Matrix(g10);
                matrix.postTranslate(-b13.left, -b13.top);
                N.p<Bitmap> i11 = N.p.i(decodeRegion, d11, rect, f7, matrix, pVar.a());
                N.o<C2893i.b, N.p<byte[]>> oVar = this.f6815e;
                C2885a c2885a = new C2885a(i11, b12);
                ((C2893i) oVar).getClass();
                N.p<Bitmap> b14 = c2885a.b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                b14.c().compress(Bitmap.CompressFormat.JPEG, c2885a.a(), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                G.h d12 = b14.d();
                Objects.requireNonNull(d12);
                pVar = N.p.k(byteArray, d12, (Build.VERSION.SDK_INT < 34 || !C2893i.a.a(b14.c())) ? 256 : 4101, b14.h(), b14.b(), b14.f(), b14.g(), b14.a());
            } catch (IOException e11) {
                throw new C.K("Failed to decode JPEG.", e11);
            }
        }
        N.o<A.a, I.h> oVar2 = this.f6816f;
        I.g c13 = b11.c();
        Objects.requireNonNull(c13);
        return (I.h) ((A) oVar2).a(new C2888d(pVar, c13));
    }

    @NonNull
    public final void d(@NonNull C2889e c2889e) {
        this.f6812b = c2889e;
        c2889e.a().a(new InterfaceC10646a() { // from class: E.G
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                final O.b bVar = (O.b) obj;
                final O o11 = O.this;
                o11.getClass();
                if (bVar.b().i()) {
                    bVar.a().close();
                } else {
                    o11.f6811a.execute(new Runnable() { // from class: E.J
                        @Override // java.lang.Runnable
                        public final void run() {
                            O o12 = O.this;
                            o12.getClass();
                            O.b bVar2 = bVar;
                            final P b11 = bVar2.b();
                            try {
                                if (bVar2.b().j()) {
                                    final androidx.camera.core.p b12 = o12.b(bVar2);
                                    H.c.e().execute(new Runnable() { // from class: E.K
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            P.this.n(b12);
                                        }
                                    });
                                } else {
                                    final I.h c11 = o12.c(bVar2);
                                    H.c.e().execute(new Runnable() { // from class: E.L
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            P.this.m(c11);
                                        }
                                    });
                                }
                            } catch (C.K e11) {
                                H.c.e().execute(new Runnable() { // from class: E.N
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        P.this.q(e11);
                                    }
                                });
                            } catch (OutOfMemoryError e12) {
                                final C.K k11 = new C.K("Processing failed due to low memory.", e12);
                                H.c.e().execute(new Runnable() { // from class: E.N
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        P.this.q(k11);
                                    }
                                });
                            } catch (RuntimeException e13) {
                                final C.K k12 = new C.K("Processing failed.", e13);
                                H.c.e().execute(new Runnable() { // from class: E.N
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        P.this.q(k12);
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
        c2889e.d().a(new InterfaceC10646a() { // from class: E.H
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                final O.b bVar = (O.b) obj;
                final O o11 = O.this;
                o11.getClass();
                if (bVar.b().i()) {
                    C.S.k("ProcessingNode", "The postview image is closed due to request aborted");
                    bVar.a().close();
                } else {
                    o11.f6811a.execute(new Runnable() { // from class: E.I
                        @Override // java.lang.Runnable
                        public final void run() {
                            O.a(O.this, bVar);
                        }
                    });
                }
            }
        });
        this.f6813c = new F();
        this.f6814d = new C2906w(this.f6821k);
        this.f6817g = new C2909z();
        this.f6815e = new C2893i();
        this.f6816f = new A();
        this.f6818h = new C();
        this.f6820j = new C2905v();
        if (c2889e.b() == 35 || this.f6822l) {
            this.f6819i = new B();
        }
    }
}
