package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ya, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4783ya extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4817zg f32557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4817zg f32560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4783ya(C4817zg c4817zg, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4817zg c4817zg2) {
        super(2, dVar);
        this.f32557e = c4817zg;
        this.f32558f = bVar;
        this.f32559g = c2406m0;
        this.f32560h = c4817zg2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4783ya(this.f32557e, this.f32558f, this.f32559g, dVar, this.f32560h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4783ya) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32556d;
        if (i11 == 0) {
            Sc.s.b(obj);
            G0 g02 = new G0(this.f32559g, null, this.f32560h, 1);
            this.f32556d = 1;
            if (C5412d0.b(this.f32557e, this.f32558f, g02, this) == aVar) {
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
