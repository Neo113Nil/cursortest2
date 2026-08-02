package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.q0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4545q0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f31822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f31825h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4545q0(C1 c12, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f31822e = c12;
        this.f31823f = bVar;
        this.f31824g = m02;
        this.f31825h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4545q0(this.f31822e, this.f31823f, this.f31824g, dVar, this.f31825h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4545q0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31821d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I i12 = new I(this.f31824g, null, this.f31825h, 0);
            this.f31821d = 1;
            if (C5412d0.b(this.f31822e, this.f31823f, i12, this) == aVar) {
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
