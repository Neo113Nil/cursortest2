package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.jo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4366jo extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Lo f31390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Lo f31393h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4366jo(Lo lo, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Lo lo2) {
        super(2, dVar);
        this.f31390e = lo;
        this.f31391f = bVar;
        this.f31392g = c2406m0;
        this.f31393h = lo2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4366jo(this.f31390e, this.f31391f, this.f31392g, dVar, this.f31393h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4366jo) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31389d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Gn gn = new Gn(this.f31392g, null, this.f31393h);
            this.f31389d = 1;
            if (C5412d0.b(this.f31390e, this.f31391f, gn, this) == aVar) {
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
