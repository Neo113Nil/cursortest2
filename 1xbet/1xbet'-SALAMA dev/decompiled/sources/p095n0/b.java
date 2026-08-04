package p095n0;

import B3.g;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC0724t;
import p033e3.c;
import p102o0.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f15293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC0724t f15294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f15295n;

    public b(c cVar) {
        this.f15293l = cVar;
        if (cVar.f12658a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        cVar.f12658a = this;
    }

    @Override // androidx.lifecycle.B
    public final void e() {
        c cVar = this.f15293l;
        cVar.f12659b = true;
        cVar.f12661d = false;
        cVar.f12660c = false;
        cVar.f12666i.drainPermits();
        cVar.a();
        cVar.f12664g = new a(cVar);
        cVar.b();
    }

    @Override // androidx.lifecycle.B
    public final void f() {
        this.f15293l.f12659b = false;
    }

    @Override // androidx.lifecycle.B
    public final void h(C c3) {
        super.h(c3);
        this.f15294m = null;
        this.f15295n = null;
    }

    public final void j() {
        InterfaceC0724t interfaceC0724t = this.f15294m;
        g gVar = this.f15295n;
        if (interfaceC0724t == null || gVar == null) {
            return;
        }
        super.h(gVar);
        d(interfaceC0724t, gVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        p003a.a.d(sb, this.f15293l);
        sb.append("}}");
        return sb.toString();
    }
}
