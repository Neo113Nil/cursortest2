package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class P3 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f29665a;

    public P3(C4378k7 c4378k7) {
        this.f29665a = c4378k7;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.f29665a.f31425e.setBonusCount(((Number) obj).intValue());
        return Unit.f71690a;
    }
}
