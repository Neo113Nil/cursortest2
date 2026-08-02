package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.l5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4405l5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N5 f31507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Co f31510h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4405l5(N5 n52, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Co co) {
        super(2, dVar);
        this.f31507e = n52;
        this.f31508f = bVar;
        this.f31509g = c2406m0;
        this.f31510h = co;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4405l5(this.f31507e, this.f31508f, this.f31509g, dVar, this.f31510h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4405l5) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31506d;
        if (i11 == 0) {
            Sc.s.b(obj);
            E4 e42 = new E4(this.f31509g, null, this.f31510h, 0);
            this.f31506d = 1;
            if (C5412d0.b(this.f31507e, this.f31508f, e42, this) == aVar) {
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
