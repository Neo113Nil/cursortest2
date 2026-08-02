package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.c1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4142c1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30763d;

    /* renamed from: e, reason: collision with root package name */
    public int f30764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f30766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4142c1(C2406m0 c2406m0, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f30763d = i11;
        this.f30765f = c2406m0;
        this.f30766g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30763d) {
            case 0:
                return new C4142c1(this.f30765f, dVar, (Zn) this.f30766g, 0);
            case 1:
                return new C4142c1(this.f30765f, dVar, (H2) this.f30766g, 1);
            default:
                return new C4142c1(this.f30765f, dVar, (C4592rj) this.f30766g, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f30763d) {
            case 0:
                return new C4142c1(this.f30765f, dVar, (Zn) this.f30766g, 0).invokeSuspend(Unit.f71690a);
            case 1:
                return new C4142c1(this.f30765f, dVar, (H2) this.f30766g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new C4142c1(this.f30765f, dVar, (C4592rj) this.f30766g, 2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30763d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f30764e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4717w0 c4717w0 = new C4717w0((Zn) this.f30766g);
                    this.f30764e = 1;
                    if (this.f30765f.collect(c4717w0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f30764e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    Pb pb2 = new Pb((H2) this.f30766g);
                    this.f30764e = 1;
                    if (this.f30765f.collect(pb2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f30764e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    W2 w22 = new W2((C4592rj) this.f30766g, 2);
                    this.f30764e = 1;
                    if (this.f30765f.collect(w22, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
