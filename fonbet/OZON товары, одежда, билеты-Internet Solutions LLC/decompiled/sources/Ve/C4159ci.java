package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ci, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4159ci extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Hk f30811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D f30814h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Hk f30815i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4159ci(Hk hk, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, D d11, Hk hk2) {
        super(2, dVar);
        this.f30811e = hk;
        this.f30812f = bVar;
        this.f30813g = c2406m0;
        this.f30814h = d11;
        this.f30815i = hk2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4159ci(this.f30811e, this.f30812f, this.f30813g, dVar, this.f30814h, this.f30815i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4159ci) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30810d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Ch ch2 = new Ch(this.f30813g, null, this.f30814h, this.f30815i);
            this.f30810d = 1;
            if (C5412d0.b(this.f30811e, this.f30812f, ch2, this) == aVar) {
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
