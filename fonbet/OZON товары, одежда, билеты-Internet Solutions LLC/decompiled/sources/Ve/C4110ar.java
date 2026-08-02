package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ar, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4110ar extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Cr f30692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Cr f30695h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4110ar(Cr cr, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, Cr cr2) {
        super(2, dVar);
        this.f30692e = cr;
        this.f30693f = bVar;
        this.f30694g = m02;
        this.f30695h = cr2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4110ar(this.f30692e, this.f30693f, this.f30694g, dVar, this.f30695h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4110ar) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30691d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I i12 = new I(this.f30694g, null, this.f30695h, 2);
            this.f30691d = 1;
            if (C5412d0.b(this.f30692e, this.f30693f, i12, this) == aVar) {
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
