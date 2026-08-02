package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Di extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f28870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Di(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4400l0 c4400l0) {
        super(2, dVar);
        this.f28869e = c2406m0;
        this.f28870f = c4400l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Di(this.f28869e, dVar, this.f28870f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Di(this.f28869e, (kotlin.coroutines.d) obj2, this.f28870f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28868d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4430m1 c4430m1 = new C4430m1(this.f28870f, 1);
            this.f28868d = 1;
            if (this.f28869e.collect(c4430m1, this) == aVar) {
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
