package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class C0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J4 f28732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J4 f28735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(J4 j42, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, J4 j43) {
        super(2, dVar);
        this.f28732e = j42;
        this.f28733f = bVar;
        this.f28734g = c2406m0;
        this.f28735h = j43;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C0(this.f28732e, this.f28733f, this.f28734g, dVar, this.f28735h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28731d;
        if (i11 == 0) {
            Sc.s.b(obj);
            V v11 = new V(this.f28734g, null, this.f28735h);
            this.f28731d = 1;
            if (C5412d0.b(this.f28732e, this.f28733f, v11, this) == aVar) {
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
