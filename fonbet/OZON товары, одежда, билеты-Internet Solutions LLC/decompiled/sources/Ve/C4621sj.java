package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.MerchantData;
import xe.C10720e0;

/* renamed from: Ve.sj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4621sj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4709vk f32057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4621sj(C4709vk c4709vk, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32057e = c4709vk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4621sj(this.f32057e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4621sj(this.f32057e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32056d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4709vk c4709vk = this.f32057e;
            C4187dh c4187dh = c4709vk.f32298d;
            MerchantData merchantData = ((C4654tn) c4709vk.f30498b).f32130G;
            if (merchantData == null) {
                throw L3.f29386a;
            }
            Jh jh2 = new Jh(merchantData.getAuthorization(), new Pi(c4709vk));
            this.f32056d = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            if (c4187dh.f(jh2, He.b.f10879b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
