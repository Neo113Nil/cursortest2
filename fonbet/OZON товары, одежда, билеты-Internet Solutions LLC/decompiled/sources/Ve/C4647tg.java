package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.tg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4647tg extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Hk f32107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D f32110h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4647tg(Hk hk, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, D d11) {
        super(2, dVar);
        this.f32107e = hk;
        this.f32108f = bVar;
        this.f32109g = c2406m0;
        this.f32110h = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4647tg(this.f32107e, this.f32108f, this.f32109g, dVar, this.f32110h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4647tg) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32106d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4529pd c4529pd = new C4529pd(this.f32109g, null, this.f32110h, 1);
            this.f32106d = 1;
            if (C5412d0.b(this.f32107e, this.f32108f, c4529pd, this) == aVar) {
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
