package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* loaded from: classes10.dex */
public final class Yi extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30468d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Dj f30470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4190dk f30471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ He.b f30472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yi(Dj dj2, C4190dk c4190dk, He.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30470f = dj2;
        this.f30471g = c4190dk;
        this.f30472h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Yi yi2 = new Yi(this.f30470f, this.f30471g, this.f30472h, dVar);
        yi2.f30469e = obj;
        return yi2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Yi) create((InterfaceC2397i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r9 == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        AbstractC4245fi abstractC4245fi;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30468d;
        C4190dk c4190dk = this.f30471g;
        Dj dj2 = this.f30470f;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.f30469e;
            Bq bq = new Bq(new G8());
            this.f30469e = interfaceC2397i2;
            this.f30468d = 1;
            if (interfaceC2397i2.emit(bq, this) != aVar) {
                interfaceC2397i = interfaceC2397i2;
            }
            return aVar;
        }
        if (i11 == 1) {
            interfaceC2397i = (InterfaceC2397i) this.f30469e;
            Sc.s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.f30469e;
            Sc.s.b(obj);
            ContentResponse contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Failure) {
                if (Intrinsics.d(((ContentResponse.Failure) contentResponse).getError(), ErrorEntity.NoInternet.INSTANCE)) {
                    abstractC4245fi = new Jr(new C4791yi(dj2, c4190dk, this.f30472h, null));
                } else {
                    Dj.E0(dj2);
                    abstractC4245fi = Rd.f29848a;
                }
            } else {
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    throw new Sc.o();
                }
                ContentResponse.Success success = (ContentResponse.Success) contentResponse;
                SpasiboBonusesResponseBody spasiboBonusesResponseBody = (SpasiboBonusesResponseBody) success.getData();
                if ((spasiboBonusesResponseBody != null ? spasiboBonusesResponseBody.getLoyaltyAppInfo() : null) == null || ((SpasiboBonusesResponseBody) success.getData()).getLoyaltyAppInfo().getMaxPointsAmount() <= 0) {
                    Dj.E0(dj2);
                    abstractC4245fi = Rd.f29848a;
                } else {
                    abstractC4245fi = new C4703ve((SpasiboBonusesResponseBody) success.getData());
                }
            }
            this.f30469e = null;
            this.f30468d = 3;
        }
        InterfaceC4524p8 interfaceC4524p8 = dj2.f28871b;
        this.f30469e = interfaceC2397i;
        this.f30468d = 2;
        obj = ((C4710vl) interfaceC4524p8).u(c4190dk.f30891b, this);
    }
}
