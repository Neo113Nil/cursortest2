package Ve;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Fc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f28991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f28992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Pm f28993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f28994h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fc(Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0, Pm pm, Context context) {
        super(2, dVar);
        this.f28991e = m02;
        this.f28992f = c4400l0;
        this.f28993g = pm;
        this.f28994h = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Fc(this.f28991e, dVar, this.f28992f, this.f28993g, this.f28994h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28990d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4153cc c4153cc = new C4153cc(this.f28992f, this.f28993g, this.f28994h);
            this.f28990d = 1;
            if (this.f28991e.collect(c4153cc, this) == aVar) {
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
