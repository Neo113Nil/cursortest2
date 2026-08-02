package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Gj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f29082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f29083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4699va f29084h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gj(C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02, Context context, C4699va c4699va) {
        super(2, dVar);
        this.f29081e = c2406m0;
        this.f29082f = s02;
        this.f29083g = context;
        this.f29084h = c4699va;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Gj(this.f29081e, dVar, this.f29082f, this.f29083g, this.f29084h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Gj) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29080d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4217ej c4217ej = new C4217ej(this.f29082f, this.f29083g, this.f29084h);
            this.f29080d = 1;
            if (this.f29081e.collect(c4217ej, this) == aVar) {
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
