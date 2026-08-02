package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class J6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4407l7 f29274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f29276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f29277h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6(C4407l7 c4407l7, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4378k7 c4378k7) {
        super(2, dVar);
        this.f29274e = c4407l7;
        this.f29275f = bVar;
        this.f29276g = m02;
        this.f29277h = c4378k7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new J6(this.f29274e, this.f29275f, this.f29276g, dVar, this.f29277h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J6) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29273d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4291h6 c4291h6 = new C4291h6(this.f29276g, null, this.f29277h, 0);
            this.f29273d = 1;
            if (C5412d0.b(this.f29274e, this.f29275f, c4291h6, this) == aVar) {
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
