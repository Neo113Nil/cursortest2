package L5;

import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.InterfaceC0745t;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: L5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0323b implements androidx.lifecycle.r, A5.q, A5.i {

    /* renamed from: a, reason: collision with root package name */
    public A5.h f4455a;

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        A5.h hVar;
        A5.h hVar2;
        if (enumC0739m == EnumC0739m.ON_START && (hVar2 = this.f4455a) != null) {
            hVar2.c("foreground");
        } else {
            if (enumC0739m != EnumC0739m.ON_STOP || (hVar = this.f4455a) == null) {
                return;
            }
            hVar.c("background");
        }
    }

    @Override // A5.i
    public final void b() {
        this.f4455a = null;
    }

    @Override // A5.i
    public final void c(Object obj, A5.h hVar) {
        this.f4455a = hVar;
    }

    @Override // A5.q
    public final void onMethodCall(A5.o oVar, A5.r rVar) {
        String str = oVar.f676a;
        str.getClass();
        if (str.equals("stop")) {
            ProcessLifecycleOwner.f9594z.f9600f.b(this);
        } else if (str.equals("start")) {
            ProcessLifecycleOwner.f9594z.f9600f.a(this);
        } else {
            ((A5.p) rVar).notImplemented();
        }
    }
}
