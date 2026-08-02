package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.m1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4430m1 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31549b;

    public /* synthetic */ C4430m1(Object obj, int i11) {
        this.f31548a = i11;
        this.f31549b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        H0 h02;
        int i11;
        switch (this.f31548a) {
            case 0:
                if (dVar instanceof H0) {
                    h02 = (H0) dVar;
                    int i12 = h02.f29099e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        h02.f29099e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = h02.f29098d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = h02.f29099e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) obj;
                            ListOfCardsResponseBody.MerchantInfo merchantInfo = listOfCardsResponseBody.getMerchantInfo();
                            String merchantName = merchantInfo != null ? merchantInfo.getMerchantName() : null;
                            if (merchantName == null) {
                                merchantName = "";
                            }
                            C4543pr a11 = D40.b.a(merchantName, "text", merchantName);
                            ListOfCardsResponseBody.MerchantInfo merchantInfo2 = listOfCardsResponseBody.getMerchantInfo();
                            C4188di c4188di = new C4188di(a11, merchantInfo2 != null ? merchantInfo2.getMerchantLogoUrl() : null);
                            h02.f29099e = 1;
                            if (((InterfaceC2397i) this.f31549b).emit(c4188di, h02) == aVar) {
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
                h02 = new H0(this, dVar);
                Object obj22 = h02.f29098d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = h02.f29099e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            case 1:
                ((L5) obj).a(new nm0.w((C4400l0) this.f31549b, 2));
                return Unit.f71690a;
            default:
                Mg mg2 = (Mg) obj;
                J4 j42 = (J4) this.f31549b;
                X4.a aVar3 = j42.f28693b;
                if (aVar3 == null) {
                    throw M7.f29463a;
                }
                ((Hp) aVar3).f29183g.setClientData(mg2);
                X4.a aVar4 = j42.f28693b;
                if (aVar4 == null) {
                    throw M7.f29463a;
                }
                ((Hp) aVar4).f29183g.setOnClickListener(new Gk(j42));
                return Unit.f71690a;
        }
    }
}
