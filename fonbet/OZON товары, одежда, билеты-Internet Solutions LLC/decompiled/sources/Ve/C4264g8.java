package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.g8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4264g8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f31095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f31098h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4264g8(Pm pm, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0) {
        super(2, dVar);
        this.f31095e = pm;
        this.f31096f = bVar;
        this.f31097g = m02;
        this.f31098h = c4400l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4264g8(this.f31095e, this.f31096f, this.f31097g, dVar, this.f31098h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4264g8) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31094d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B7 b72 = new B7(this.f31097g, null, this.f31098h, 0);
            this.f31094d = 1;
            if (C5412d0.b(this.f31095e, this.f31096f, b72, this) == aVar) {
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
