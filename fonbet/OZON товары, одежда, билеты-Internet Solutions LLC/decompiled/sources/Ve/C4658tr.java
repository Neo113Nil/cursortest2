package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.tr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4658tr extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f32165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f32167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f32168h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4658tr(C1 c12, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f32165e = c12;
        this.f32166f = bVar;
        this.f32167g = m02;
        this.f32168h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4658tr(this.f32165e, this.f32166f, this.f32167g, dVar, this.f32168h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4658tr) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32164d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4281gp c4281gp = new C4281gp(this.f32167g, null, this.f32168h, 1);
            this.f32164d = 1;
            if (C5412d0.b(this.f32165e, this.f32166f, c4281gp, this) == aVar) {
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
