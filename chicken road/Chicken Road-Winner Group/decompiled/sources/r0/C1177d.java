package r0;

import A0.h;
import I1.AbstractActivityC0027d;
import kotlin.jvm.internal.j;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177d implements P1.b, Q1.a {

    /* renamed from: a, reason: collision with root package name */
    public h f10277a;

    @Override // Q1.a
    public final void onAttachedToActivity(Q1.b binding) {
        j.e(binding, "binding");
        h hVar = this.f10277a;
        if (hVar == null) {
            return;
        }
        hVar.j((AbstractActivityC0027d) ((h) binding).f54b);
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a binding) {
        j.e(binding, "binding");
        this.f10277a = new h(4);
        C1175b c1175b = InterfaceC1176c.f10276a;
        T1.f fVar = binding.f1153b;
        j.d(fVar, "getBinaryMessenger(...)");
        C1175b.a(c1175b, fVar, this.f10277a);
    }

    @Override // Q1.a
    public final void onDetachedFromActivity() {
        h hVar = this.f10277a;
        if (hVar == null) {
            return;
        }
        hVar.j(null);
    }

    @Override // Q1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a binding) {
        j.e(binding, "binding");
        if (this.f10277a == null) {
            return;
        }
        C1175b c1175b = InterfaceC1176c.f10276a;
        T1.f fVar = binding.f1153b;
        j.d(fVar, "getBinaryMessenger(...)");
        C1175b.a(c1175b, fVar, null);
        this.f10277a = null;
    }

    @Override // Q1.a
    public final void onReattachedToActivityForConfigChanges(Q1.b binding) {
        j.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
