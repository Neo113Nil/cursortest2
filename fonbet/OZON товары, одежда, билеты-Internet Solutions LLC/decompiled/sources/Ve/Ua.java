package Ve;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Ua extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f30111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f30112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ua(Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0, Context context) {
        super(2, dVar);
        this.f30110e = m02;
        this.f30111f = c4400l0;
        this.f30112g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ua(this.f30110e, dVar, this.f30111f, this.f30112g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ua) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30109d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4641ta c4641ta = new C4641ta(this.f30111f, this.f30112g);
            this.f30109d = 1;
            if (this.f30110e.collect(c4641ta, this) == aVar) {
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
