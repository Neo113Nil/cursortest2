package O;

import B90.s0;
import C.S;
import C.f0;
import G.q;
import G.r;
import N.C;
import N.G;
import N.y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.T0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final C f19722a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final I f19723b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final I f19724c;

    /* renamed from: d, reason: collision with root package name */
    private c f19725d;

    /* renamed from: e, reason: collision with root package name */
    private b f19726e;

    final class a implements I.c<f0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f19727a;

        a(y yVar) {
            this.f19727a = yVar;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            y yVar = this.f19727a;
            if (yVar.q() == 2 && (th2 instanceof CancellationException)) {
                S.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            S.l("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + G.a(yVar.q()), th2);
        }

        @Override // I.c
        public final void onSuccess(f0 f0Var) {
            f0 f0Var2 = f0Var;
            f0Var2.getClass();
            m.this.f19722a.b(f0Var2);
        }
    }

    public static abstract class b {
        @NonNull
        public static b d(@NonNull y yVar, @NonNull y yVar2, @NonNull ArrayList arrayList) {
            return new O.b(yVar, yVar2, arrayList);
        }

        @NonNull
        public abstract List<d> a();

        @NonNull
        public abstract y b();

        @NonNull
        public abstract y c();
    }

    public static class c extends HashMap<d, y> {
    }

    public m(@NonNull I i11, @NonNull I i12, @NonNull C c11) {
        this.f19723b = i11;
        this.f19724c = i12;
        this.f19722a = c11;
    }

    public static /* synthetic */ void a(m mVar) {
        c cVar = mVar.f19725d;
        if (cVar != null) {
            Iterator<y> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(@NonNull I i11, @NonNull I i12, @NonNull y yVar, @NonNull y yVar2, Map.Entry<d, y> entry) {
        y value = entry.getValue();
        Size e11 = yVar.p().e();
        Rect a11 = entry.getKey().a().a();
        if (!yVar.r()) {
            i11 = null;
        }
        f0.a f7 = f0.a.f(e11, a11, i11, entry.getKey().a().c(), entry.getKey().a().g());
        Size e12 = yVar2.p().e();
        Rect a12 = entry.getKey().b().a();
        if (!yVar2.r()) {
            i12 = null;
        }
        I.k.b(value.h(entry.getKey().a().b(), f7, f0.a.f(e12, a12, i12, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), H.c.e());
    }

    public final void d() {
        this.f19722a.release();
        q.c(new s0(this, 1));
    }

    @NonNull
    public final c e(@NonNull b bVar) {
        m mVar = this;
        q.a();
        mVar.f19726e = bVar;
        mVar.f19725d = new c();
        y b11 = mVar.f19726e.b();
        y c11 = mVar.f19726e.c();
        for (d dVar : mVar.f19726e.a()) {
            c cVar = mVar.f19725d;
            P.f a11 = dVar.a();
            Rect a12 = a11.a();
            int c12 = a11.c();
            boolean g10 = a11.g();
            Matrix matrix = new Matrix();
            x2.i.b(r.d(r.g(r.e(a12), c12), false, a11.d()));
            Size d11 = a11.d();
            Rect rect = new Rect(0, 0, d11.getWidth(), d11.getHeight());
            T0.a g11 = b11.p().g();
            g11.e(a11.d());
            cVar.put(dVar, new y(a11.e(), a11.b(), g11.a(), matrix, false, rect, b11.n() - c12, -1, b11.t() != g10));
        }
        C.s0 i11 = b11.i(mVar.f19723b, true);
        C c13 = mVar.f19722a;
        c13.a(i11);
        c13.a(c11.i(mVar.f19724c, false));
        for (final Map.Entry<d, y> entry : mVar.f19725d.entrySet()) {
            final I i12 = mVar.f19723b;
            final I i13 = mVar.f19724c;
            mVar.c(i12, i13, b11, c11, entry);
            y value = entry.getValue();
            final y yVar = c11;
            final y yVar2 = b11;
            Runnable runnable = new Runnable() { // from class: O.l
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar3 = yVar;
                    Map.Entry entry2 = entry;
                    m.this.c(i12, i13, yVar2, yVar3, entry2);
                }
            };
            mVar = this;
            b11 = yVar2;
            c11 = yVar;
            value.d(runnable);
        }
        return mVar.f19725d;
    }
}
