package Ge;

import Sc.r;
import Sc.s;
import kotlin.Unit;
import nc.InterfaceC8487b;
import xe.C10737n;

/* loaded from: classes.dex */
public final class c implements io.reactivex.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f10081a;

    c(C10737n c10737n) {
        this.f10081a = c10737n;
    }

    @Override // io.reactivex.d
    public final void onComplete() {
        r.Companion companion = r.INSTANCE;
        this.f10081a.resumeWith(Unit.f71690a);
    }

    @Override // io.reactivex.d
    public final void onError(Throwable th2) {
        r.Companion companion = r.INSTANCE;
        this.f10081a.resumeWith(s.a(th2));
    }

    @Override // io.reactivex.d
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        this.f10081a.q(new C3097b(interfaceC8487b));
    }
}
