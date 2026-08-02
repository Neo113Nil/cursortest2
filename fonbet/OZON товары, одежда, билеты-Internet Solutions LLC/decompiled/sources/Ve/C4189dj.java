package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.dj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4189dj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f30886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f30889h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4189dj(Pm pm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4400l0 c4400l0) {
        super(2, dVar);
        this.f30886e = pm;
        this.f30887f = bVar;
        this.f30888g = c2406m0;
        this.f30889h = c4400l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4189dj(this.f30886e, this.f30887f, this.f30888g, dVar, this.f30889h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4189dj) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30885d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Di di = new Di(this.f30888g, null, this.f30889h);
            this.f30885d = 1;
            if (C5412d0.b(this.f30886e, this.f30887f, di, this) == aVar) {
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
