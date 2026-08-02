package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.ErrorEntity;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.vg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4705vg extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f32280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4705vg(C4318i4 c4318i4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32280e = c4318i4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4705vg(this.f32280e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4705vg(this.f32280e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32279d;
        C4318i4 c4318i4 = this.f32280e;
        if (i11 == 0) {
            Sc.s.b(obj);
            Nl nl = c4318i4.f31246i;
            this.f32279d = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            nl.getClass();
            obj = C10727i.f(bVar.plus(xe.X0.b()), new C4421ll(nl, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ((C4238fb) c4318i4.f31243f).b(new C4085a2(new Sd(ErrorEntity.NotEnoughMoneyForPayment.INSTANCE)));
        }
        return Unit.f71690a;
    }
}
