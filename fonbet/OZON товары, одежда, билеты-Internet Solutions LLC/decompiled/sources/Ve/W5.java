package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class W5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f30248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f30249g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02, Context context) {
        super(2, dVar);
        this.f30247e = c2406m0;
        this.f30248f = s02;
        this.f30249g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new W5(this.f30247e, dVar, this.f30248f, this.f30249g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W5) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30246d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4607s5 c4607s5 = new C4607s5(this.f30248f, this.f30249g);
            this.f30246d = 1;
            if (this.f30247e.collect(c4607s5, this) == aVar) {
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
