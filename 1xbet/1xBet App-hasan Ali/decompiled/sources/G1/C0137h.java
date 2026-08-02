package G1;

import a3.AbstractC0467k;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import m4.InterfaceC2100c;

/* renamed from: G1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137h extends V implements U {

    /* renamed from: a, reason: collision with root package name */
    public v3.g f1893a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.L f1894b;

    @Override // androidx.lifecycle.V
    public final void a(S s2) {
        v3.g gVar = this.f1893a;
        if (gVar != null) {
            androidx.lifecycle.L l5 = this.f1894b;
            kotlin.jvm.internal.l.c(l5);
            androidx.lifecycle.L.b(s2, gVar, l5);
        }
    }

    @Override // androidx.lifecycle.U
    public final /* synthetic */ S create(InterfaceC2100c interfaceC2100c, D1.b bVar) {
        return AbstractC0467k.b(this, interfaceC2100c, bVar);
    }

    @Override // androidx.lifecycle.U
    public final S create(Class cls, D1.b bVar) {
        kotlin.jvm.internal.l.f("extras", bVar);
        String str = (String) bVar.a(W.f7041b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        v3.g gVar = this.f1893a;
        if (gVar == null) {
            return new C0138i(androidx.lifecycle.L.d(bVar));
        }
        kotlin.jvm.internal.l.c(gVar);
        androidx.lifecycle.L l5 = this.f1894b;
        kotlin.jvm.internal.l.c(l5);
        androidx.lifecycle.K c5 = androidx.lifecycle.L.c(gVar, l5, str, null);
        C0138i c0138i = new C0138i(c5.f7017l);
        c0138i.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5);
        return c0138i;
    }

    @Override // androidx.lifecycle.U
    public final S create(Class cls) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f1894b != null) {
                v3.g gVar = this.f1893a;
                kotlin.jvm.internal.l.c(gVar);
                androidx.lifecycle.L l5 = this.f1894b;
                kotlin.jvm.internal.l.c(l5);
                androidx.lifecycle.K c5 = androidx.lifecycle.L.c(gVar, l5, canonicalName, null);
                C0138i c0138i = new C0138i(c5.f7017l);
                c0138i.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5);
                return c0138i;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
