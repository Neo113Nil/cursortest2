package androidx.activity;

import androidx.fragment.app.H;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.InterfaceC0724t;

/* JADX INFO: loaded from: classes.dex */
public final class x implements androidx.lifecycle.r, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0720o f8135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f8136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f8137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f8138d;

    public x(A a2, AbstractC0720o abstractC0720o, H h6) {
        t6.h.e(abstractC0720o, "lifecycle");
        t6.h.e(h6, "onBackPressedCallback");
        this.f8138d = a2;
        this.f8135a = abstractC0720o;
        this.f8136b = h6;
        abstractC0720o.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        if (enumC0718m == EnumC0718m.ON_START) {
            A a2 = this.f8138d;
            H h6 = this.f8136b;
            t6.h.e(h6, "onBackPressedCallback");
            a2.f8081b.addLast(h6);
            y yVar = new y(a2, h6);
            h6.f9357b.add(yVar);
            a2.c();
            h6.f9358c = new z(0, a2, A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
            this.f8137c = yVar;
            return;
        }
        if (enumC0718m != EnumC0718m.ON_STOP) {
            if (enumC0718m == EnumC0718m.ON_DESTROY) {
                cancel();
            }
        } else {
            y yVar2 = this.f8137c;
            if (yVar2 != null) {
                yVar2.cancel();
            }
        }
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f8135a.b(this);
        this.f8136b.f9357b.remove(this);
        y yVar = this.f8137c;
        if (yVar != null) {
            yVar.cancel();
        }
        this.f8137c = null;
    }
}
