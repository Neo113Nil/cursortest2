package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.al, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4104al extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4192dm f30680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H2 f30683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4104al(C4192dm c4192dm, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, H2 h22) {
        super(2, dVar);
        this.f30680e = c4192dm;
        this.f30681f = bVar;
        this.f30682g = m02;
        this.f30683h = h22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4104al(this.f30680e, this.f30681f, this.f30682g, dVar, this.f30683h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4104al) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30679d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4688v c4688v = new C4688v(this.f30682g, null, this.f30683h, 2);
            this.f30679d = 1;
            if (C5412d0.b(this.f30680e, this.f30681f, c4688v, this) == aVar) {
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
