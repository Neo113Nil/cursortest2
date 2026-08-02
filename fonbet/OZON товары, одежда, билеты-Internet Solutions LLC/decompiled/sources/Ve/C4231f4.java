package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.f4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4231f4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K4 f31001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K4 f31004h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4231f4(K4 k42, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, K4 k43) {
        super(2, dVar);
        this.f31001e = k42;
        this.f31002f = bVar;
        this.f31003g = m02;
        this.f31004h = k43;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4231f4(this.f31001e, this.f31002f, this.f31003g, dVar, this.f31004h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4231f4) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31000d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B3 b32 = new B3(this.f31003g, null, this.f31004h, 0);
            this.f31000d = 1;
            if (C5412d0.b(this.f31001e, this.f31002f, b32, this) == aVar) {
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
