package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.qp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4570qp extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J4 f31917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J4 f31920h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4570qp(J4 j42, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, J4 j43) {
        super(2, dVar);
        this.f31917e = j42;
        this.f31918f = bVar;
        this.f31919g = c2406m0;
        this.f31920h = j43;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4570qp(this.f31917e, this.f31918f, this.f31919g, dVar, this.f31920h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4570qp) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31916d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4664u4 c4664u4 = new C4664u4(this.f31919g, null, this.f31920h, 1);
            this.f31916d = 1;
            if (C5412d0.b(this.f31917e, this.f31918f, c4664u4, this) == aVar) {
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
