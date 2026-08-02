package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class B3 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28658d;

    /* renamed from: e, reason: collision with root package name */
    public int f28659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f28660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28661g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B3(Ae.M0 m02, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f28658d = i11;
        this.f28660f = m02;
        this.f28661g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28658d) {
            case 0:
                return new B3(this.f28660f, dVar, (K4) this.f28661g, 0);
            default:
                return new B3(this.f28660f, dVar, (S0) this.f28661g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f28658d) {
            case 0:
                return new B3(this.f28660f, dVar, (K4) this.f28661g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new B3(this.f28660f, dVar, (S0) this.f28661g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28658d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f28659e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    L0 l02 = new L0((K4) this.f28661g, 1);
                    this.f28659e = 1;
                    if (this.f28660f.collect(l02, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f28659e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    D0 d02 = new D0((S0) this.f28661g, 2);
                    this.f28659e = 1;
                    if (this.f28660f.collect(d02, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
