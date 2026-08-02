package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Hr extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f29190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f29191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hr(C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02, Context context) {
        super(2, dVar);
        this.f29189e = c2406m0;
        this.f29190f = s02;
        this.f29191g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Hr(this.f29189e, dVar, this.f29190f, this.f29191g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Hr) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29188d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Tb tb2 = new Tb(2, this.f29190f, this.f29191g);
            this.f29188d = 1;
            if (this.f29189e.collect(tb2, this) == aVar) {
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
