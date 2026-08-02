package Ge;

import Ae.InterfaceC2395h;
import io.reactivex.r;
import io.reactivex.s;
import kotlin.coroutines.CoroutineContext;
import xe.AbstractC10711a;
import xe.C10720e0;
import xe.C10727i;
import xe.C10749t0;
import xe.O;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f10094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f10095b;

    public /* synthetic */ l(InterfaceC2395h interfaceC2395h, CoroutineContext coroutineContext) {
        this.f10094a = coroutineContext;
        this.f10095b = interfaceC2395h;
    }

    public final void a(r rVar) {
        rVar.a(new g((AbstractC10711a) C10727i.b(C10749t0.f105499a, C10720e0.b().plus(this.f10094a), O.ATOMIC, new o(this.f10095b, rVar, null))));
    }
}
