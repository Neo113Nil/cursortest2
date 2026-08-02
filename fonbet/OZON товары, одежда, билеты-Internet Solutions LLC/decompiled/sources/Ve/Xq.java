package Ve;

import Ae.InterfaceC2397i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Xq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30418d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ar f30420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4341j f30421g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ He.b f30422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xq(Ar ar2, C4341j c4341j, He.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30420f = ar2;
        this.f30421g = c4341j;
        this.f30422h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Xq xq2 = new Xq(this.f30420f, this.f30421g, this.f30422h, dVar);
        xq2.f30419e = obj;
        return xq2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Xq) create((InterfaceC2397i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e6, code lost:
    
        if (r1.emit(r2, r8) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006c, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        AbstractC4245fi c4167cq;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30418d;
        C4341j c4341j = this.f30421g;
        Ar ar2 = this.f30420f;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.f30419e;
            List h11 = ((C4654tn) ar2.f28650c).h();
            if (h11 == null || h11.isEmpty()) {
                Bq bq = new Bq(new G8());
                this.f30419e = interfaceC2397i2;
                this.f30418d = 1;
            }
            interfaceC2397i = interfaceC2397i2;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = (InterfaceC2397i) this.f30419e;
                Sc.s.b(obj);
                ContentResponse contentResponse = (ContentResponse) obj;
                if (contentResponse instanceof ContentResponse.Failure) {
                    ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                    ErrorEntity error = failure.getError();
                    c4167cq = error instanceof ErrorEntity.ApiError ? new Cb(failure.getError()) : Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE) ? new Jr(new C4657tq(ar2, c4341j, this.f30422h, null)) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new C4761xg() : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new Sm("Системная или внутренняя ошибка") : new Sm("Некорректный формат запроса или ответа");
                } else {
                    if (!(contentResponse instanceof ContentResponse.Success)) {
                        throw new Sc.o();
                    }
                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) ((ContentResponse.Success) contentResponse).getData();
                    c4167cq = listOfCardsResponseBody != null ? new C4167cq(listOfCardsResponseBody) : null;
                }
                if (c4167cq != null) {
                    this.f30419e = null;
                    this.f30418d = 3;
                }
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.f30419e;
            Sc.s.b(obj);
        }
        InterfaceC4524p8 interfaceC4524p8 = ar2.f28649b;
        this.f30419e = interfaceC2397i;
        this.f30418d = 2;
        obj = ((C4710vl) interfaceC4524p8).l(c4341j.f31329b, this);
    }
}
