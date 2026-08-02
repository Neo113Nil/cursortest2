package Ve;

import Ae.InterfaceC2397i;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Jo implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f29313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f29314b;

    public Jo(InterfaceC2397i interfaceC2397i, f.a aVar) {
        this.f29313a = interfaceC2397i;
        this.f29314b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4309ho c4309ho;
        int i11;
        if (dVar instanceof C4309ho) {
            c4309ho = (C4309ho) dVar;
            int i12 = c4309ho.f31210e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4309ho.f31210e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4309ho.f31209d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4309ho.f31210e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    Object c11 = ((W2.f) obj).c(this.f29314b);
                    c4309ho.f31210e = 1;
                    if (this.f29313a.emit(c11, c4309ho) == aVar) {
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
        c4309ho = new C4309ho(this, dVar);
        Object obj22 = c4309ho.f31209d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4309ho.f31210e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
