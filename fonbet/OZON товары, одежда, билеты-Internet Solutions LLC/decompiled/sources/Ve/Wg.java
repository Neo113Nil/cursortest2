package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Wg extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f30275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Pm f30278h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wg(Pm pm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Pm pm2) {
        super(2, dVar);
        this.f30275e = pm;
        this.f30276f = bVar;
        this.f30277g = c2406m0;
        this.f30278h = pm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Wg(this.f30275e, this.f30276f, this.f30277g, dVar, this.f30278h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Wg) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30274d;
        if (i11 == 0) {
            Sc.s.b(obj);
            E4 e42 = new E4(this.f30277g, null, this.f30278h, 1);
            this.f30274d = 1;
            if (C5412d0.b(this.f30275e, this.f30276f, e42, this) == aVar) {
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
