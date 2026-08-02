package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.mb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4440mb extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f31575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31577g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H2 f31578h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4440mb(C4192dm c4192dm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, H2 h22) {
        super(2, dVar);
        this.f31575e = c4192dm;
        this.f31576f = bVar;
        this.f31577g = c2406m0;
        this.f31578h = h22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4440mb(this.f31575e, this.f31576f, this.f31577g, dVar, this.f31578h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4440mb) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31574d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4291h6 c4291h6 = new C4291h6(this.f31577g, null, this.f31578h, 1);
            this.f31574d = 1;
            if (C5412d0.b(this.f31575e, this.f31576f, c4291h6, this) == aVar) {
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
