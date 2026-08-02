package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.zq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4827zq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f32681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4699va f32684h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4827zq(C4699va c4699va, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4699va c4699va2) {
        super(2, dVar);
        this.f32681e = c4699va;
        this.f32682f = bVar;
        this.f32683g = c2406m0;
        this.f32684h = c4699va2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4827zq(this.f32681e, this.f32682f, this.f32683g, dVar, this.f32684h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4827zq) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32680d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4109aq c4109aq = new C4109aq(this.f32683g, null, this.f32684h);
            this.f32680d = 1;
            if (C5412d0.b(this.f32681e, this.f32682f, c4109aq, this) == aVar) {
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
