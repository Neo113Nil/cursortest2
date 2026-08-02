package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class L6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S7 f29391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29393g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S7 f29394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(S7 s72, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S7 s73) {
        super(2, dVar);
        this.f29391e = s72;
        this.f29392f = bVar;
        this.f29393g = c2406m0;
        this.f29394h = s73;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new L6(this.f29391e, this.f29392f, this.f29393g, dVar, this.f29394h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L6) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29390d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4348j6 c4348j6 = new C4348j6(this.f29393g, null, this.f29394h, 0);
            this.f29390d = 1;
            if (C5412d0.b(this.f29391e, this.f29392f, c4348j6, this) == aVar) {
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
