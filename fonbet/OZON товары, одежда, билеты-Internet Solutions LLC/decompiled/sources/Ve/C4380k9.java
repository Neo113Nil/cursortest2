package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.k9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4380k9 implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N9 f31429b;

    public C4380k9(C2406m0 c2406m0, N9 n92) {
        this.f31428a = c2406m0;
        this.f31429b = n92;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f31428a.collect(new H8(interfaceC2397i, this.f31429b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
