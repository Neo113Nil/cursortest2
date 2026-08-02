package Ve;

import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.BnplPaymentData;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Pk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public Object f29726d;

    /* renamed from: e, reason: collision with root package name */
    public int f29727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4744x f29728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f29729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pk(C4744x c4744x, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29728f = c4744x;
        this.f29729g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Pk(this.f29728f, this.f29729g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Pk(this.f29728f, this.f29729g, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (r5.f32416e.f(r3, He.b.f10879b, r20) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r1 == r2) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object f7;
        String authorization;
        String merchantLogin;
        int i11 = 1;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f29727e;
        C4744x c4744x = this.f29728f;
        if (i12 == 0) {
            Sc.s.b(obj);
            Up up = c4744x.f32420i;
            str = "ip";
            this.f29726d = "ip";
            this.f29727e = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            up.getClass();
            f7 = C10727i.f(bVar, new Cn(up, null, i11), this);
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            String str2 = (String) this.f29726d;
            Sc.s.b(obj);
            str = str2;
            f7 = obj;
        }
        Map i13 = kotlin.collections.U.i(new Pair(str, f7));
        MerchantData m02 = c4744x.m0();
        EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
        Z8 z82 = Z8.f30578b;
        C4248fl c4248fl = c4744x.f32422k;
        boolean r02 = Lf.a.r0(c4248fl, enumC4290h5, z82);
        Vm vm = c4744x.f32413b;
        if (r02) {
            ((C4654tn) vm).getClass();
            authorization = BnplPaymentData.INSTANCE.getBnplPaymentData().getApiKey();
        } else {
            authorization = m02.getAuthorization();
        }
        if (Lf.a.r0(c4248fl, enumC4290h5, z82)) {
            ((C4654tn) vm).getClass();
            merchantLogin = BnplPaymentData.INSTANCE.getBnplPaymentData().getMerchantLogin();
        } else {
            merchantLogin = m02.getMerchantLogin();
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        String X9 = kotlin.text.h.X(uuid, "-", "", false);
        String str3 = ((C4654tn) vm).f32143l;
        if (str3 == null) {
            str3 = m02.getOrderId();
        }
        String str4 = authorization;
        String str5 = merchantLogin;
        D8 d82 = new D8(str4, new PaymentOrderRequestBody(X9, str5, str3, this.f29729g, null, i13, null, null, null, 464, null));
        this.f29726d = m02;
        this.f29727e = 2;
        C10720e0 c10720e02 = C10720e0.f105451a;
    }
}
