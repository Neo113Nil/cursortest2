package Ge;

import Sc.r;
import Sc.s;
import io.reactivex.A;
import nc.InterfaceC8487b;
import xe.C10737n;

/* loaded from: classes.dex */
public final class d implements A<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f10082a;

    d(C10737n c10737n) {
        this.f10082a = c10737n;
    }

    @Override // io.reactivex.A
    public final void onError(Throwable th2) {
        r.Companion companion = r.INSTANCE;
        this.f10082a.resumeWith(s.a(th2));
    }

    @Override // io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        this.f10082a.q(new C3097b(interfaceC8487b));
    }

    @Override // io.reactivex.A
    public final void onSuccess(Object obj) {
        r.Companion companion = r.INSTANCE;
        this.f10082a.resumeWith(obj);
    }
}
