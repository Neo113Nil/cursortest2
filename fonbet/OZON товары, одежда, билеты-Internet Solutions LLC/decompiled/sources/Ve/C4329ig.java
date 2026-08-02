package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ig, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4329ig extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f31295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4192dm f31298h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4329ig(C4192dm c4192dm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4192dm c4192dm2) {
        super(2, dVar);
        this.f31295e = c4192dm;
        this.f31296f = bVar;
        this.f31297g = c2406m0;
        this.f31298h = c4192dm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4329ig(this.f31295e, this.f31296f, this.f31297g, dVar, this.f31298h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4329ig) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31294d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I3 i32 = new I3(this.f31297g, null, this.f31298h, 1);
            this.f31294d = 1;
            if (C5412d0.b(this.f31295e, this.f31296f, i32, this) == aVar) {
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
