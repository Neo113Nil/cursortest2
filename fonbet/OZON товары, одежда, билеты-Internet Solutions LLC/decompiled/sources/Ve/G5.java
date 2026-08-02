package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class G5 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S7 f29058a;

    public G5(S7 s72) {
        this.f29058a = s72;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        String str = (String) obj;
        X4.a aVar = this.f29058a.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((Vk) aVar).f30210d.setText(str);
        return Unit.f71690a;
    }
}
