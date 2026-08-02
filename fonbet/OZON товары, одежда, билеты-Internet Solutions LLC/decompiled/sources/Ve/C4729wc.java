package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import W2.f;
import kotlin.Unit;

/* renamed from: Ve.wc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4729wc implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f32360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f32361b;

    public C4729wc(InterfaceC2395h interfaceC2395h, f.a aVar) {
        this.f32360a = interfaceC2395h;
        this.f32361b = aVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f32360a.collect(new Tb(0, interfaceC2397i, this.f32361b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
