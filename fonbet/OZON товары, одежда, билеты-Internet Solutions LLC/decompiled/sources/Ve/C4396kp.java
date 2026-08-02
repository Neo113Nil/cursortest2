package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import W2.f;
import kotlin.Unit;

/* renamed from: Ve.kp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4396kp implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f31474b;

    public C4396kp(InterfaceC2395h interfaceC2395h, f.a aVar) {
        this.f31473a = interfaceC2395h;
        this.f31474b = aVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f31473a.collect(new Jo(interfaceC2397i, this.f31474b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
