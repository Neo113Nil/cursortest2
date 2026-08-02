package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Um extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4625sn f30140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4625sn f30143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Um(C4625sn c4625sn, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4625sn c4625sn2) {
        super(2, dVar);
        this.f30140e = c4625sn;
        this.f30141f = bVar;
        this.f30142g = c2406m0;
        this.f30143h = c4625sn2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Um(this.f30140e, this.f30141f, this.f30142g, dVar, this.f30143h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Um) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30139d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4682um c4682um = new C4682um(this.f30142g, (kotlin.coroutines.d) null, this.f30143h);
            this.f30139d = 1;
            if (C5412d0.b(this.f30140e, this.f30141f, c4682um, this) == aVar) {
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
