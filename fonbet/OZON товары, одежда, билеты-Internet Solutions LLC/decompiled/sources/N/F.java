package N;

import B90.W;
import C.S;
import C.f0;
import C.s0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.T0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final l f18193a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final I f18194b;

    /* renamed from: c, reason: collision with root package name */
    private c f18195c;

    final class a implements I.c<f0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f18196a;

        a(y yVar) {
            this.f18196a = yVar;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            y yVar = this.f18196a;
            if (yVar.q() == 2 && (th2 instanceof CancellationException)) {
                S.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            S.l("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + G.a(yVar.q()), th2);
        }

        @Override // I.c
        public final void onSuccess(f0 f0Var) {
            f0 f0Var2 = f0Var;
            f0Var2.getClass();
            F.this.f18193a.b(f0Var2);
        }
    }

    public static abstract class b {
        @NonNull
        public static b c(@NonNull y yVar, @NonNull List<P.f> list) {
            return new C3645c(yVar, list);
        }

        @NonNull
        public abstract List<P.f> a();

        @NonNull
        public abstract y b();
    }

    public static class c extends HashMap<P.f, y> {
    }

    public F(@NonNull I i11, @NonNull l lVar) {
        this.f18194b = i11;
        this.f18193a = lVar;
    }

    public static /* synthetic */ void b(F f7) {
        c cVar = f7.f18195c;
        if (cVar != null) {
            Iterator<y> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(@NonNull y yVar, Map.Entry<P.f, y> entry) {
        y value = entry.getValue();
        I.k.b(value.h(entry.getKey().b(), f0.a.f(yVar.p().e(), entry.getKey().a(), yVar.r() ? this.f18194b : null, entry.getKey().c(), entry.getKey().g()), null), new a(value), H.c.e());
    }

    @NonNull
    public final C d() {
        return this.f18193a;
    }

    public final void e() {
        this.f18193a.release();
        G.q.c(new W(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [N.E] */
    @NonNull
    public final c f(@NonNull b bVar) {
        Rect rect;
        G.q.a();
        this.f18195c = new c();
        final y b11 = bVar.b();
        for (P.f fVar : bVar.a()) {
            c cVar = this.f18195c;
            Rect a11 = fVar.a();
            int c11 = fVar.c();
            boolean g10 = fVar.g();
            Matrix matrix = new Matrix(b11.o());
            RectF rectF = new RectF(a11);
            Size d11 = fVar.d();
            RectF rectF2 = G.r.f9647a;
            float f7 = 0;
            Matrix a12 = G.r.a(rectF, new RectF(f7, f7, d11.getWidth(), d11.getHeight()), c11, g10);
            matrix.postConcat(a12);
            x2.i.b(G.r.d(G.r.g(G.r.e(a11), c11), false, fVar.d()));
            if (fVar.i()) {
                x2.i.a("Output crop rect " + fVar.a() + " must contain input crop rect " + b11.k(), fVar.a().contains(b11.k()));
                Rect rect2 = new Rect();
                RectF rectF3 = new RectF(b11.k());
                a12.mapRect(rectF3);
                rectF3.round(rect2);
                rect = rect2;
            } else {
                Size d12 = fVar.d();
                rect = new Rect(0, 0, d12.getWidth(), d12.getHeight());
            }
            T0.a g11 = b11.p().g();
            g11.e(fVar.d());
            cVar.put(fVar, new y(fVar.e(), fVar.b(), g11.a(), matrix, false, rect, b11.n() - c11, -1, b11.t() != g10));
        }
        this.f18193a.a(b11.i(this.f18194b, true));
        for (final Map.Entry<P.f, y> entry : this.f18195c.entrySet()) {
            c(b11, entry);
            entry.getValue().d(new Runnable() { // from class: N.D
                @Override // java.lang.Runnable
                public final void run() {
                    F.this.c(b11, entry);
                }
            });
        }
        final c cVar2 = this.f18195c;
        b11.e(new InterfaceC10646a() { // from class: N.E
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                s0.d dVar = (s0.d) obj;
                for (Map.Entry entry2 : cVar2.entrySet()) {
                    int b12 = dVar.b() - ((P.f) entry2.getKey()).c();
                    if (((P.f) entry2.getKey()).g()) {
                        b12 = -b12;
                    }
                    int h11 = G.r.h(b12);
                    y yVar = (y) entry2.getValue();
                    yVar.getClass();
                    G.q.c(new t(yVar, h11, -1));
                }
            }
        });
        return this.f18195c;
    }
}
