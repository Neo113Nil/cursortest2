package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class B8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4236f9 f28679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28681g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4796yn f28682h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(C4236f9 c4236f9, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4796yn c4796yn) {
        super(2, dVar);
        this.f28679e = c4236f9;
        this.f28680f = bVar;
        this.f28681g = c2406m0;
        this.f28682h = c4796yn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new B8(this.f28679e, this.f28680f, this.f28681g, dVar, this.f28682h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B8) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28678d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Y7 y72 = new Y7(this.f28681g, null, this.f28682h);
            this.f28678d = 1;
            if (C5412d0.b(this.f28679e, this.f28680f, y72, this) == aVar) {
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
