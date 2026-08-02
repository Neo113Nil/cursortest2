package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* renamed from: Ve.mr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4456mr implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4577r4 f31613a;

    public C4456mr(C4577r4 c4577r4) {
        this.f31613a = c4577r4;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object e02 = C4577r4.e0(this.f31613a, (Fh) obj, dVar);
        return e02 == Wc.a.COROUTINE_SUSPENDED ? e02 : Unit.f71690a;
    }
}
