package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Po extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Cr f29736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f29737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Po(C2406m0 c2406m0, kotlin.coroutines.d dVar, Cr cr, Context context) {
        super(2, dVar);
        this.f29735e = c2406m0;
        this.f29736f = cr;
        this.f29737g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Po(this.f29735e, dVar, this.f29736f, this.f29737g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Po) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29734d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4482no c4482no = new C4482no(this.f29736f, this.f29737g);
            this.f29734d = 1;
            if (this.f29735e.collect(c4482no, this) == aVar) {
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
