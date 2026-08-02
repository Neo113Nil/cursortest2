package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Tn extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Vl f30072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4744x f30073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tn(Vl vl, C4744x c4744x, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30072e = vl;
        this.f30073f = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Tn(this.f30072e, this.f30073f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Tn(this.f30072e, this.f30073f, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30071d;
        Unit unit = null;
        Object[] objArr = 0;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4508ol c4508ol = new C4508ol(this.f30072e, objArr == true ? 1 : 0, 1);
            this.f30071d = 1;
            obj = xe.f1.c(20000L, c4508ol, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        if (((Unit) obj) != null) {
            ((C4238fb) this.f30073f.f32424m).b(Xo.f30415a);
            unit = Unit.f71690a;
        }
        if (unit != null) {
            return Unit.f71690a;
        }
        throw C5.f28737a;
    }
}
