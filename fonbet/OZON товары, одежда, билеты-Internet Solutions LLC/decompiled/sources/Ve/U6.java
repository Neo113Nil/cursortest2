package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class U6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4091a8 f30103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D8 f30104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(C4091a8 c4091a8, D8 d82, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30103e = c4091a8;
        this.f30104f = d82;
        this.f30105g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new U6(this.f30103e, this.f30104f, this.f30105g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U6) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0041, code lost:
    
        if (r9 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ki c4085a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30102d;
        D8 d82 = this.f30104f;
        C4091a8 c4091a8 = this.f30103e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4091a8.f30643b).b(new C4209eb(new C4351j9()));
            InterfaceC4524p8 interfaceC4524p8 = c4091a8.f30642a;
            PaymentOrderRequestBody paymentOrderRequestBody = d82.f28843b;
            this.f30102d = 1;
            obj = ((C4710vl) interfaceC4524p8).p(paymentOrderRequestBody, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                c4085a2 = (Ki) obj;
                ((C4238fb) c4091a8.f30643b).b(c4085a2);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        ContentResponse contentResponse = (ContentResponse) obj;
        if (contentResponse instanceof ContentResponse.Failure) {
            ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
            ErrorEntity error = failure.getError();
            if (error instanceof ErrorEntity.ApiError) {
                c4085a2 = new O0(new Cb(failure.getError()));
            } else if (error instanceof ErrorEntity.BadRequest) {
                c4085a2 = new C4085a2(new Sd(failure.getError()));
            } else {
                boolean d11 = Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE);
                xe.I i12 = this.f30105g;
                if (d11) {
                    c4085a2 = new O0(new Jr(new C4579r6(c4091a8, d82, i12, null)));
                } else {
                    if (!(Intrinsics.d(error, ErrorEntity.UnknownApiResult.INSTANCE) ? true : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE))) {
                        c4085a2 = new O0(new Sm("Системная или внутренняя ошибка"));
                    } else if (Lf.a.r0(c4091a8.f30644c, EnumC4290h5.RETRIES, null)) {
                        this.f30102d = 2;
                        obj = C10727i.f(i12, new C4696v7(c4091a8, d82, i12, null), this);
                    } else {
                        c4085a2 = new C4085a2(C4731we.f32365a);
                    }
                }
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            c4085a2 = new C4085a2(Ze.f30586a);
        }
        ((C4238fb) c4091a8.f30643b).b(c4085a2);
        return Unit.f71690a;
    }
}
