package Ve;

import Ae.InterfaceC2397i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.m5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4434m5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31562d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O5 f31564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4341j f31565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ He.b f31566h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4434m5(O5 o52, C4341j c4341j, He.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31564f = o52;
        this.f31565g = c4341j;
        this.f31566h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4434m5 c4434m5 = new C4434m5(this.f31564f, this.f31565g, this.f31566h, dVar);
        c4434m5.f31563e = obj;
        return c4434m5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4434m5) create((InterfaceC2397i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f7, code lost:
    
        if (r1.emit(r2, r8) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r9 == r0) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        AbstractC4245fi abstractC4245fi;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31562d;
        C4341j c4341j = this.f31565g;
        O5 o52 = this.f31564f;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.f31563e;
            Bq bq = new Bq(new G8());
            this.f31563e = interfaceC2397i2;
            this.f31562d = 1;
            if (interfaceC2397i2.emit(bq, this) != aVar) {
                interfaceC2397i = interfaceC2397i2;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.f31563e;
            Sc.s.b(obj);
            ContentResponse contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Failure) {
                ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                ErrorEntity error = failure.getError();
                abstractC4245fi = error instanceof ErrorEntity.ApiError ? new Cb(failure.getError()) : Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE) ? new Jr(new F4(o52, c4341j, this.f31566h, null)) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new C4761xg() : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new Sm("Системная или внутренняя ошибка") : new Sm("Некорректный формат запроса или ответа");
            } else {
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    throw new Sc.o();
                }
                ContentResponse.Success success = (ContentResponse.Success) contentResponse;
                ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) success.getData();
                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = (listOfCardsResponseBody == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo.getToolList();
                if (toolList == null || toolList.isEmpty()) {
                    abstractC4245fi = Ql.f29798a;
                } else {
                    ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) success.getData();
                    abstractC4245fi = listOfCardsResponseBody2 != null ? new C4167cq(listOfCardsResponseBody2) : null;
                }
            }
            if (abstractC4245fi != null) {
                this.f31563e = null;
                this.f31562d = 3;
            }
            return Unit.f71690a;
        }
        interfaceC2397i = (InterfaceC2397i) this.f31563e;
        Sc.s.b(obj);
        InterfaceC4524p8 interfaceC4524p8 = o52.f29594b;
        this.f31563e = interfaceC2397i;
        this.f31562d = 2;
        obj = ((C4710vl) interfaceC4524p8).v(c4341j.f31329b, this);
    }
}
