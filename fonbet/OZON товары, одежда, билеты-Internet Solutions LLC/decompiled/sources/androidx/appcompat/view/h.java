package androidx.appcompat.view;

import android.view.animation.BaseInterpolator;
import androidx.core.view.C5326k0;
import androidx.core.view.C5330m0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private BaseInterpolator f37311c;

    /* renamed from: d, reason: collision with root package name */
    C5330m0 f37312d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37313e;

    /* renamed from: b, reason: collision with root package name */
    private long f37310b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final C5330m0 f37314f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<C5326k0> f37309a = new ArrayList<>();

    final class a extends C5330m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f37315a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f37316b = 0;

        a() {
        }

        @Override // androidx.core.view.C5330m0, androidx.core.view.InterfaceC5328l0
        public final void a() {
            if (this.f37315a) {
                return;
            }
            this.f37315a = true;
            C5330m0 c5330m0 = h.this.f37312d;
            if (c5330m0 != null) {
                c5330m0.a();
            }
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationEnd() {
            int i11 = this.f37316b + 1;
            this.f37316b = i11;
            h hVar = h.this;
            if (i11 == hVar.f37309a.size()) {
                C5330m0 c5330m0 = hVar.f37312d;
                if (c5330m0 != null) {
                    c5330m0.onAnimationEnd();
                }
                this.f37316b = 0;
                this.f37315a = false;
                hVar.b();
            }
        }
    }

    public final void a() {
        if (this.f37313e) {
            Iterator<C5326k0> it = this.f37309a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f37313e = false;
        }
    }

    final void b() {
        this.f37313e = false;
    }

    public final void c(C5326k0 c5326k0) {
        if (this.f37313e) {
            return;
        }
        this.f37309a.add(c5326k0);
    }

    public final void d(C5326k0 c5326k0, C5326k0 c5326k02) {
        ArrayList<C5326k0> arrayList = this.f37309a;
        arrayList.add(c5326k0);
        c5326k02.g(c5326k0.c());
        arrayList.add(c5326k02);
    }

    public final void e() {
        if (this.f37313e) {
            return;
        }
        this.f37310b = 250L;
    }

    public final void f(BaseInterpolator baseInterpolator) {
        if (this.f37313e) {
            return;
        }
        this.f37311c = baseInterpolator;
    }

    public final void g(C5330m0 c5330m0) {
        if (this.f37313e) {
            return;
        }
        this.f37312d = c5330m0;
    }

    public final void h() {
        if (this.f37313e) {
            return;
        }
        Iterator<C5326k0> it = this.f37309a.iterator();
        while (it.hasNext()) {
            C5326k0 next = it.next();
            long j11 = this.f37310b;
            if (j11 >= 0) {
                next.d(j11);
            }
            BaseInterpolator baseInterpolator = this.f37311c;
            if (baseInterpolator != null) {
                next.e(baseInterpolator);
            }
            if (this.f37312d != null) {
                next.f(this.f37314f);
            }
            next.i();
        }
        this.f37313e = true;
    }
}
