package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import xe.C10727i;

/* renamed from: Ve.y0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4773y0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4748x3 f32523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4087a4 f32524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773y0(C4748x3 c4748x3, C4087a4 c4087a4, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32523e = c4748x3;
        this.f32524f = c4087a4;
        this.f32525g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4773y0(this.f32523e, this.f32524f, this.f32525g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4773y0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f9, code lost:
    
        if (r10 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
    
        if (r10 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0063, code lost:
    
        if (r10 == r0) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ki c4085a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32522d;
        C4087a4 c4087a4 = this.f32524f;
        C4748x3 c4748x3 = this.f32523e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4748x3.f32454d).b(new C4209eb(new C4351j9()));
            if (((C4654tn) c4748x3.f32452b).f32131H.length() == 0) {
                c4085a2 = new C4085a2(new Sd(ErrorEntity.Unknown.INSTANCE));
                ((C4238fb) c4748x3.f32454d).b(c4085a2);
                return Unit.f71690a;
            }
            InterfaceC4524p8 interfaceC4524p8 = c4748x3.f32451a;
            PayOnlineRequestBody payOnlineRequestBody = c4087a4.f30631b;
            this.f32522d = 1;
            obj = ((C4710vl) interfaceC4524p8).n(payOnlineRequestBody, this);
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    Sc.s.b(obj);
                    c4085a2 = (Ki) obj;
                    ((C4238fb) c4748x3.f32454d).b(c4085a2);
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                c4085a2 = (Ki) obj;
                ((C4238fb) c4748x3.f32454d).b(c4085a2);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        ContentResponse contentResponse = (ContentResponse) obj;
        if (!(contentResponse instanceof ContentResponse.Failure)) {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            c4085a2 = new C4085a2(Ze.f30586a);
            ((C4238fb) c4748x3.f32454d).b(c4085a2);
            return Unit.f71690a;
        }
        boolean d11 = Intrinsics.d(c4087a4.f30631b.getPaymentInBonuses(), Boolean.TRUE);
        xe.I i12 = this.f32525g;
        if (d11) {
            ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
            this.f32522d = 3;
            c4748x3.getClass();
            ErrorEntity error = failure.getError();
            if (Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE)) {
                obj = new O0(new Jr(new K1(c4748x3, c4087a4, i12, null)));
            } else {
                obj = error instanceof ErrorEntity.UnknownApiResult ? true : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? C10727i.f(i12, new T2(c4748x3, c4087a4, i12, null), this) : new O0(new Ya(failure.getError(), new C4518p2(c4748x3, c4087a4, i12, null)));
            }
        } else {
            ContentResponse.Failure failure2 = (ContentResponse.Failure) contentResponse;
            this.f32522d = 2;
            c4748x3.getClass();
            ErrorEntity error2 = failure2.getError();
            if (error2 instanceof ErrorEntity.PayBnplPartsFail) {
                obj = new O0(C4346j4.f31341a);
            } else if (error2 instanceof ErrorEntity.ApiError) {
                obj = new O0(new Cb(failure2.getError()));
            } else if (error2 instanceof ErrorEntity.BadRequest) {
                obj = M1.b.e(((ErrorEntity.BadRequest) failure2.getError()).getFraudMonCheckResult(), c4748x3.f32456f);
            } else if (Intrinsics.d(error2, ErrorEntity.NoInternet.INSTANCE)) {
                obj = new O0(new Jr(new C4199e1(c4748x3, c4087a4, i12, null)));
            } else {
                obj = error2 instanceof ErrorEntity.UnknownApiResult ? true : Intrinsics.d(error2, ErrorEntity.TimeOut.INSTANCE) ? C10727i.f(i12, new T2(c4748x3, c4087a4, i12, null), this) : new O0(new Sm("Системная или внутренняя ошибка"));
            }
        }
        return aVar;
    }
}
