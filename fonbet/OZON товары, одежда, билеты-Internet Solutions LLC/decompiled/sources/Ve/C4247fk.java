package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.fk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4247fk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Hk f31043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Hk f31046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4247fk(Hk hk, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Hk hk2) {
        super(2, dVar);
        this.f31043e = hk;
        this.f31044f = bVar;
        this.f31045g = c2406m0;
        this.f31046h = hk2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4247fk(this.f31043e, this.f31044f, this.f31045g, dVar, this.f31046h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4247fk) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31042d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B7 b72 = new B7(this.f31045g, null, this.f31046h, 1);
            this.f31042d = 1;
            if (C5412d0.b(this.f31043e, this.f31044f, b72, this) == aVar) {
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
