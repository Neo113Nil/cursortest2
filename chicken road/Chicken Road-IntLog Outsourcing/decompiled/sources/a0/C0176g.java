package a0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0245o;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.EnumC0244n;
import androidx.lifecycle.InterfaceC0249t;
import androidx.lifecycle.InterfaceC0250u;
import kotlin.jvm.internal.i;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3830a;

    /* renamed from: b, reason: collision with root package name */
    public final C0175f f3831b = new C0175f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3832c;

    public C0176g(h hVar) {
        this.f3830a = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void a() {
        ?? r0 = this.f3830a;
        AbstractC0245o lifecycle = r0.getLifecycle();
        if (((C0252w) lifecycle).f4592d != EnumC0244n.f4577b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C0171b(0, r0));
        final C0175f c0175f = this.f3831b;
        c0175f.getClass();
        if (c0175f.f3825b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC0249t() { // from class: a0.c
            @Override // androidx.lifecycle.InterfaceC0249t
            public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
                C0175f this$0 = C0175f.this;
                i.e(this$0, "this$0");
                if (enumC0243m == EnumC0243m.ON_START) {
                    this$0.f3829f = true;
                } else if (enumC0243m == EnumC0243m.ON_STOP) {
                    this$0.f3829f = false;
                }
            }
        });
        c0175f.f3825b = true;
        this.f3832c = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void b(Bundle bundle) {
        if (!this.f3832c) {
            a();
        }
        C0252w c0252w = (C0252w) this.f3830a.getLifecycle();
        if (c0252w.f4592d.compareTo(EnumC0244n.f4579d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0252w.f4592d).toString());
        }
        C0175f c0175f = this.f3831b;
        if (!c0175f.f3825b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0175f.f3827d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0175f.f3826c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0175f.f3827d = true;
    }
}
