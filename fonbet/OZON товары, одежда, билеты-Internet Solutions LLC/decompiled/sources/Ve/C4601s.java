package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* renamed from: Ve.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4601s implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f31990a;

    public C4601s(InterfaceC2397i interfaceC2397i) {
        this.f31990a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Ir ir;
        int i11;
        if (dVar instanceof Ir) {
            ir = (Ir) dVar;
            int i12 = ir.f29250e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ir.f29250e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = ir.f29249d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ir.f29250e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((Eh) obj) == Eh.f28934b);
                    ir.f29250e = 1;
                    if (this.f31990a.emit(valueOf, ir) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        ir = new Ir(this, dVar);
        Object obj22 = ir.f29249d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ir.f29250e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
