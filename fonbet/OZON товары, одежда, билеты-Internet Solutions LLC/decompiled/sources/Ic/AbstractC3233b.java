package Ic;

import Gc.g;
import io.reactivex.w;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: Ic.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3233b<T> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC8487b f12160a;

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        InterfaceC8487b interfaceC8487b2 = this.f12160a;
        Class<?> cls = getClass();
        C9656b.c(interfaceC8487b, "next is null");
        if (interfaceC8487b2 == null) {
            this.f12160a = interfaceC8487b;
            return;
        }
        interfaceC8487b.dispose();
        if (interfaceC8487b2 != rc.d.DISPOSED) {
            g.a(cls);
        }
    }
}
