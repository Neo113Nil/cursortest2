package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.co, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4165co extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f30829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f30832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165co(C1 c12, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f30829e = c12;
        this.f30830f = bVar;
        this.f30831g = c2406m0;
        this.f30832h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4165co(this.f30829e, this.f30830f, this.f30831g, dVar, this.f30832h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4165co) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30828d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4530pe c4530pe = new C4530pe(this.f30831g, null, this.f30832h, 2);
            this.f30828d = 1;
            if (C5412d0.b(this.f30829e, this.f30830f, c4530pe, this) == aVar) {
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
