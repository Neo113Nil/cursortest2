package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.qb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4556qb extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ub f31850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ub f31853h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4556qb(Ub ub2, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, Ub ub3) {
        super(2, dVar);
        this.f31850e = ub2;
        this.f31851f = bVar;
        this.f31852g = m02;
        this.f31853h = ub3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4556qb(this.f31850e, this.f31851f, this.f31852g, dVar, this.f31853h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4556qb) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31849d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4348j6 c4348j6 = new C4348j6(this.f31852g, null, this.f31853h, 1);
            this.f31849d = 1;
            if (C5412d0.b(this.f31850e, this.f31851f, c4348j6, this) == aVar) {
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
