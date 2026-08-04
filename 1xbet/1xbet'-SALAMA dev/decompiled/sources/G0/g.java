package G0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.EnumC0719n;
import androidx.lifecycle.InterfaceC0724t;
import androidx.lifecycle.r;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2847b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2848c;

    public g(h hVar) {
        this.f2846a = hVar;
    }

    public final void a() {
        h hVar = this.f2846a;
        AbstractC0720o lifecycle = hVar.getLifecycle();
        if (((C0726v) lifecycle).f9637c != EnumC0719n.f9627b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new b(hVar, 0));
        final f fVar = this.f2847b;
        fVar.getClass();
        if (fVar.f2841b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new r() { // from class: G0.c
            @Override // androidx.lifecycle.r
            public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
                f fVar2 = fVar;
                t6.h.e(fVar2, "this$0");
                if (enumC0718m == EnumC0718m.ON_START) {
                    fVar2.f2845f = true;
                } else if (enumC0718m == EnumC0718m.ON_STOP) {
                    fVar2.f2845f = false;
                }
            }
        });
        fVar.f2841b = true;
        this.f2848c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2848c) {
            a();
        }
        C0726v c0726v = (C0726v) this.f2846a.getLifecycle();
        if (c0726v.f9637c.compareTo(EnumC0719n.f9629d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0726v.f9637c).toString());
        }
        f fVar = this.f2847b;
        if (!fVar.f2841b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (fVar.f2843d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        fVar.f2842c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        fVar.f2843d = true;
    }

    public final void c(Bundle bundle) {
        t6.h.e(bundle, "outBundle");
        f fVar = this.f2847b;
        fVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = fVar.f2842c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p101o.f fVar2 = fVar.f2840a;
        fVar2.getClass();
        p101o.d dVar = new p101o.d(fVar2);
        fVar2.f15534c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((e) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
