package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Sq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4794yl f29997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f29998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sq(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4794yl c4794yl, Context context) {
        super(2, dVar);
        this.f29996e = c2406m0;
        this.f29997f = c4794yl;
        this.f29998g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Sq(this.f29996e, dVar, this.f29997f, this.f29998g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sq) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29995d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4484nq c4484nq = new C4484nq(this.f29997f, this.f29998g);
            this.f29995d = 1;
            if (this.f29996e.collect(c4484nq, this) == aVar) {
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
