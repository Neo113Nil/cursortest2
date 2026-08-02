package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.z7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4808z7 implements InterfaceC2395h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vl f32627b;

    public C4808z7(C2406m0 c2406m0, Vl vl) {
        this.f32626a = c2406m0;
        this.f32627b = vl;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar) {
        Object collect = this.f32626a.collect(new X6(0, interfaceC2397i, this.f32627b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
