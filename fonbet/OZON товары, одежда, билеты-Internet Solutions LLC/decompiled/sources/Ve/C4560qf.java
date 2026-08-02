package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.qf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4560qf extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4474ng f31870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4560qf(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4474ng c4474ng) {
        super(2, dVar);
        this.f31869e = c2406m0;
        this.f31870f = c4474ng;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4560qf(this.f31869e, dVar, this.f31870f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4560qf(this.f31869e, (kotlin.coroutines.d) obj2, this.f31870f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31868d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Ne ne2 = new Ne(this.f31870f);
            this.f31868d = 1;
            if (this.f31869e.collect(ne2, this) == aVar) {
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
