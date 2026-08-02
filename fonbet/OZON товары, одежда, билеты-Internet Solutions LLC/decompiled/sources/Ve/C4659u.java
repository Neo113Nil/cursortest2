package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* renamed from: Ve.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4659u implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f32169a;

    public C4659u(InterfaceC2397i interfaceC2397i) {
        this.f32169a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Kr kr;
        int i11;
        if (dVar instanceof Kr) {
            kr = (Kr) dVar;
            int i12 = kr.f29374e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kr.f29374e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = kr.f29373d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kr.f29374e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    if (obj instanceof C4755xa) {
                        kr.f29374e = 1;
                        if (this.f32169a.emit(obj, kr) == aVar) {
                            return aVar;
                        }
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
        kr = new Kr(this, dVar);
        Object obj22 = kr.f29373d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kr.f29374e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
