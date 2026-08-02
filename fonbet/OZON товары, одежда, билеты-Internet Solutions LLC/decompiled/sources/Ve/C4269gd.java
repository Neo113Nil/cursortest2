package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.gd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4269gd extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Kd f31104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Kd f31107h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4269gd(Kd kd2, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Kd kd3) {
        super(2, dVar);
        this.f31104e = kd2;
        this.f31105f = bVar;
        this.f31106g = c2406m0;
        this.f31107h = kd3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4269gd(this.f31104e, this.f31105f, this.f31106g, dVar, this.f31107h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4269gd) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31103d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4315i1 c4315i1 = new C4315i1(this.f31106g, null, this.f31107h, 1);
            this.f31103d = 1;
            if (C5412d0.b(this.f31104e, this.f31105f, c4315i1, this) == aVar) {
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
