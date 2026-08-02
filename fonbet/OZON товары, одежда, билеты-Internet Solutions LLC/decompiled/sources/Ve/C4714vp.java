package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.vp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4714vp implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4699va f32316a;

    public C4714vp(C4699va c4699va) {
        this.f32316a = c4699va;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Mg mg2 = (Mg) obj;
        C4699va c4699va = this.f32316a;
        X4.a aVar = c4699va.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((S0) aVar).f29936l.setClientData(mg2);
        X4.a aVar2 = c4699va.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        ((S0) aVar2).f29936l.setOnClickListener(new Xg(c4699va));
        return Unit.f71690a;
    }
}
