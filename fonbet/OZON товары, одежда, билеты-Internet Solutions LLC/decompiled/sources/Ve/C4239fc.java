package Ve;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.fc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4239fc implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4442md f31022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qd f31023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe.I f31024d;

    public C4239fc(InterfaceC2395h interfaceC2395h, C4442md c4442md, Qd qd2, xe.I i11) {
        this.f31021a = interfaceC2395h;
        this.f31022b = c4442md;
        this.f31023c = qd2;
        this.f31024d = i11;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f31021a.collect(new Bb(interfaceC2397i, this.f31022b, this.f31023c, this.f31024d), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
