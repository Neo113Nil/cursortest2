package E;

import C.I;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    private final int f6823a;

    /* renamed from: b, reason: collision with root package name */
    private final I.g f6824b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final Rect f6825c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6826d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6827e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final Matrix f6828f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final Q f6829g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final String f6830h;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    final com.google.common.util.concurrent.m<Void> f6832j;

    /* renamed from: k, reason: collision with root package name */
    private int f6833k = -1;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final ArrayList f6831i = new ArrayList();

    P(@NonNull androidx.camera.core.impl.P p11, I.g gVar, @NonNull Rect rect, int i11, int i12, @NonNull Matrix matrix, @NonNull Q q11, @NonNull com.google.common.util.concurrent.m mVar, int i13) {
        this.f6823a = i13;
        this.f6824b = gVar;
        this.f6827e = i12;
        this.f6826d = i11;
        this.f6825c = rect;
        this.f6828f = matrix;
        this.f6829g = q11;
        this.f6830h = String.valueOf(p11.hashCode());
        List<androidx.camera.core.impl.S> a11 = p11.a();
        Objects.requireNonNull(a11);
        for (androidx.camera.core.impl.S s11 : a11) {
            ArrayList arrayList = this.f6831i;
            s11.getClass();
            arrayList.add(0);
        }
        this.f6832j = mVar;
    }

    @NonNull
    final Rect a() {
        return this.f6825c;
    }

    final int b() {
        return this.f6827e;
    }

    final I.g c() {
        return this.f6824b;
    }

    public final int d() {
        return this.f6823a;
    }

    final int e() {
        return this.f6826d;
    }

    @NonNull
    final Matrix f() {
        return this.f6828f;
    }

    @NonNull
    final ArrayList g() {
        return this.f6831i;
    }

    @NonNull
    final String h() {
        return this.f6830h;
    }

    final boolean i() {
        return this.f6829g.g();
    }

    final boolean j() {
        return this.f6824b == null;
    }

    final void k(@NonNull C.K k11) {
        this.f6829g.i(k11);
    }

    final void l() {
        this.f6829g.k();
    }

    final void m(@NonNull I.h hVar) {
        this.f6829g.l(hVar);
    }

    final void n(@NonNull androidx.camera.core.p pVar) {
        this.f6829g.m(pVar);
    }

    final void o() {
        if (this.f6833k != -1 && this.f6833k != 100) {
            this.f6833k = 100;
            this.f6829g.j(100);
        }
        this.f6829g.n();
    }

    final void p(@NonNull Bitmap bitmap) {
        this.f6829g.o(bitmap);
    }

    final void q(@NonNull C.K k11) {
        this.f6829g.p(k11);
    }
}
