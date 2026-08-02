package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import xe.C10720e0;

/* renamed from: Ve.um, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4682um extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32229d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f32230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4682um(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4625sn c4625sn) {
        super(2, dVar);
        this.f32231f = c2406m0;
        this.f32232g = c4625sn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f32229d) {
            case 0:
                return new C4682um((C2406m0) this.f32231f, dVar, (C4625sn) this.f32232g);
            default:
                return new C4682um((Z2) this.f32231f, (String) this.f32232g, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f32229d) {
            case 0:
                return new C4682um((C2406m0) this.f32231f, dVar, (C4625sn) this.f32232g).invokeSuspend(Unit.f71690a);
            default:
                return new C4682um((Z2) this.f32231f, (String) this.f32232g, dVar).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.f32232g;
        Object obj3 = this.f32231f;
        switch (this.f32229d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f32230e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    W2 w22 = new W2((C4625sn) obj2, 3);
                    this.f32230e = 1;
                    if (((C2406m0) obj3).collect(w22, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f32230e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    Zc zc2 = ((Z2) obj3).f30539h;
                    Cd cd2 = new Cd(new CreateBindingOtpRequestBody((String) obj2), true);
                    this.f32230e = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    if (zc2.f(cd2, He.b.f10879b, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4682um(Z2 z22, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32231f = z22;
        this.f32232g = str;
    }
}
