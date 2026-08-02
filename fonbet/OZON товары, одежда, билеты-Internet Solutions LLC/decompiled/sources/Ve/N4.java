package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class N4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f29526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f29529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(C4699va c4699va, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f29526e = c4699va;
        this.f29527f = bVar;
        this.f29528g = c2406m0;
        this.f29529h = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new N4(this.f29526e, this.f29527f, this.f29528g, dVar, this.f29529h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N4) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29525d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I i12 = new I(this.f29528g, null, this.f29529h, 1);
            this.f29525d = 1;
            if (C5412d0.b(this.f29526e, this.f29527f, i12, this) == aVar) {
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
