package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.vj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4708vj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f32292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f32294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4192dm f32295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4708vj(C4192dm c4192dm, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4192dm c4192dm2) {
        super(2, dVar);
        this.f32292e = c4192dm;
        this.f32293f = bVar;
        this.f32294g = m02;
        this.f32295h = c4192dm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4708vj(this.f32292e, this.f32293f, this.f32294g, dVar, this.f32295h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4708vj) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32291d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4241fe c4241fe = new C4241fe(this.f32294g, null, this.f32295h, 1);
            this.f32291d = 1;
            if (C5412d0.b(this.f32292e, this.f32293f, c4241fe, this) == aVar) {
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
