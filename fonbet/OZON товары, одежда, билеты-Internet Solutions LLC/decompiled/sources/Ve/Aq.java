package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* loaded from: classes10.dex */
public final class Aq implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f28648a;

    public Aq(InterfaceC2397i interfaceC2397i) {
        this.f28648a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4138bq c4138bq;
        int i11;
        if (dVar instanceof C4138bq) {
            c4138bq = (C4138bq) dVar;
            int i12 = c4138bq.f30751e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4138bq.f30751e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4138bq.f30750d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4138bq.f30751e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) obj;
                    Eh eh2 = (orderScreenDataResponse == null || !orderScreenDataResponse.getMoreThanOneCard()) ? Eh.f28933a : Eh.f28934b;
                    c4138bq.f30751e = 1;
                    if (this.f28648a.emit(eh2, c4138bq) == aVar) {
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
        c4138bq = new C4138bq(this, dVar);
        Object obj22 = c4138bq.f30750d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4138bq.f30751e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
