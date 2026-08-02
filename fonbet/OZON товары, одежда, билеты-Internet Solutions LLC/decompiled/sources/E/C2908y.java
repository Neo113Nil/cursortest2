package E;

import C.AbstractC2690j;
import C.C2705z;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.b1;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: E.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2908y {

    /* renamed from: f, reason: collision with root package name */
    private static int f6932f;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C5098i0 f6933a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.Q f6934b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final C2904u f6935c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final O f6936d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final C2886b f6937e;

    public C2908y(@NonNull C5098i0 c5098i0, @NonNull Size size, AbstractC2690j abstractC2690j, boolean z11, Size size2, int i11) {
        int i12;
        int i13;
        G.q.a();
        this.f6933a = c5098i0;
        Q.b bVar = (Q.b) c5098i0.c(b1.f38270y, null);
        if (bVar == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + c5098i0.l(c5098i0.toString()));
        }
        Q.a aVar = new Q.a();
        bVar.a(c5098i0, aVar);
        this.f6934b = aVar.h();
        C2904u c2904u = new C2904u();
        this.f6935c = c2904u;
        Executor executor = (Executor) c5098i0.c(J.h.f12636a, H.c.d());
        Objects.requireNonNull(executor);
        Executor executor2 = executor;
        if (abstractC2690j != null) {
            x2.i.b(false);
            throw null;
        }
        O o11 = new O(executor2);
        this.f6936d = o11;
        int i14 = c5098i0.i();
        Integer num = (Integer) c5098i0.c(C5098i0.f38316K, null);
        if (num != null) {
            i12 = num.intValue();
        } else {
            Integer num2 = (Integer) c5098i0.c(InterfaceC5100j0.f38330j, null);
            if (num2 != null && num2.intValue() == 4101) {
                i13 = 4101;
                C2886b c2886b = new C2886b(size, i14, i13, z11, (C.O) c5098i0.c(C5098i0.f38318M, null), size2, i11, new N.m(), new N.m());
                this.f6937e = c2886b;
                o11.d(c2904u.h(c2886b));
            }
            i12 = 256;
        }
        i13 = i12;
        C2886b c2886b2 = new C2886b(size, i14, i13, z11, (C.O) c5098i0.c(C5098i0.f38318M, null), size2, i11, new N.m(), new N.m());
        this.f6937e = c2886b2;
        o11.d(c2904u.h(c2886b2));
    }

    public final void a() {
        G.q.a();
        this.f6935c.f();
        this.f6936d.getClass();
    }

    @NonNull
    final x2.d b(@NonNull d0 d0Var, @NonNull Q q11, @NonNull com.google.common.util.concurrent.m mVar) {
        G.q.a();
        androidx.camera.core.impl.P p11 = (androidx.camera.core.impl.P) this.f6933a.c(C5098i0.f38315J, C2705z.a());
        Objects.requireNonNull(p11);
        int i11 = f6932f;
        f6932f = i11 + 1;
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(p11.hashCode());
        List<androidx.camera.core.impl.S> a11 = p11.a();
        Objects.requireNonNull(a11);
        for (androidx.camera.core.impl.S s11 : a11) {
            Q.a aVar = new Q.a();
            androidx.camera.core.impl.Q q12 = this.f6934b;
            aVar.s(q12.j());
            aVar.e(q12.f());
            aVar.a(d0Var.k());
            C2886b c2886b = this.f6937e;
            aVar.f(c2886b.k());
            aVar.r(c2886b.h() != null);
            if (M.b.b(c2886b.d())) {
                if (((ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    T.a<Integer> aVar2 = androidx.camera.core.impl.Q.f38177i;
                } else {
                    aVar.d(androidx.camera.core.impl.Q.f38177i, Integer.valueOf(d0Var.i()));
                }
                aVar.d(androidx.camera.core.impl.Q.f38178j, Integer.valueOf(((d0Var.g() != null) && G.r.b(d0Var.d(), c2886b.j())) ? d0Var.c() == 0 ? 100 : 95 : d0Var.f()));
            }
            aVar.e(s11.a().f());
            aVar.g(0, valueOf);
            aVar.p(i11);
            aVar.c(c2886b.a());
            arrayList.add(aVar.h());
        }
        return new x2.d(new C2895k(arrayList, q11), new P(p11, d0Var.h(), d0Var.d(), d0Var.i(), d0Var.f(), d0Var.j(), q11, mVar, i11));
    }

    @NonNull
    public final O0.b c(@NonNull Size size) {
        O0.b m11 = O0.b.m(this.f6933a, size);
        C2886b c2886b = this.f6937e;
        m11.f(c2886b.k(), C.A.f4076d);
        if (c2886b.h() != null) {
            m11.t(c2886b.h());
        }
        return m11;
    }

    public final int d() {
        G.q.a();
        C2904u c2904u = this.f6935c;
        c2904u.getClass();
        G.q.a();
        x2.i.f("The ImageReader is not initialized.", c2904u.f6921b != null);
        return c2904u.f6921b.i();
    }

    final void e(@NonNull C2891g c2891g) {
        G.q.a();
        this.f6937e.b().accept(c2891g);
    }

    public final void f(@NonNull Y y11) {
        G.q.a();
        C2904u c2904u = this.f6935c;
        c2904u.getClass();
        G.q.a();
        x2.i.f("The ImageReader is not initialized.", c2904u.f6921b != null);
        c2904u.f6921b.k(y11);
    }

    final void g(@NonNull P p11) {
        G.q.a();
        this.f6937e.i().accept(p11);
    }
}
