package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class So implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f29993a;

    public So(InterfaceC2397i interfaceC2397i) {
        this.f29993a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4626so c4626so;
        int i11;
        if (dVar instanceof C4626so) {
            c4626so = (C4626so) dVar;
            int i12 = c4626so.f32066e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4626so.f32066e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4626so.f32065d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4626so.f32066e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    ListOfCardsResponseBody.MerchantInfo merchantInfo = ((ListOfCardsResponseBody) obj).getMerchantInfo();
                    Mg mg2 = new Mg(merchantInfo != null ? merchantInfo.getMerchantLogoUrl() : null);
                    c4626so.f32066e = 1;
                    if (this.f29993a.emit(mg2, c4626so) == aVar) {
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
        c4626so = new C4626so(this, dVar);
        Object obj22 = c4626so.f32065d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4626so.f32066e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
