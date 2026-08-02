package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class P1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K4 f29659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4514or f29662h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(K4 k42, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4514or c4514or) {
        super(2, dVar);
        this.f29659e = k42;
        this.f29660f = bVar;
        this.f29661g = c2406m0;
        this.f29662h = c4514or;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new P1(this.f29659e, this.f29660f, this.f29661g, dVar, this.f29662h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P1) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29658d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4315i1 c4315i1 = new C4315i1(this.f29661g, null, this.f29662h, 0);
            this.f29658d = 1;
            if (C5412d0.b(this.f29659e, this.f29660f, c4315i1, this) == aVar) {
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
