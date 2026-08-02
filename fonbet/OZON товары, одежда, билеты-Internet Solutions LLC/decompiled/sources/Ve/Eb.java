package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Eb implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4744x f28919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vl f28920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T8 f28921c;

    public Eb(C4744x c4744x, Vl vl, T8 t82) {
        this.f28919a = c4744x;
        this.f28920b = vl;
        this.f28921c = t82;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object f02 = this.f28919a.f0((Fh) obj, this.f28920b, this.f28921c, dVar);
        return f02 == Wc.a.COROUTINE_SUSPENDED ? f02 : Unit.f71690a;
    }
}
