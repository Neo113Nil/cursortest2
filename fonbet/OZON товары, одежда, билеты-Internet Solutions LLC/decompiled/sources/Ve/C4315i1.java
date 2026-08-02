package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.i1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4315i1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31224d;

    /* renamed from: e, reason: collision with root package name */
    public int f31225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31227g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4315i1(C2406m0 c2406m0, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f31224d = i11;
        this.f31226f = c2406m0;
        this.f31227g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31224d) {
            case 0:
                return new C4315i1(this.f31226f, dVar, (C4514or) this.f31227g, 0);
            default:
                return new C4315i1(this.f31226f, dVar, (Kd) this.f31227g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31224d) {
            case 0:
                return new C4315i1(this.f31226f, dVar, (C4514or) this.f31227g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4315i1(this.f31226f, dVar, (Kd) this.f31227g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31224d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31225e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    D0 d02 = new D0((C4514or) this.f31227g, 0);
                    this.f31225e = 1;
                    if (this.f31226f.collect(d02, this) == aVar) {
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
                int i12 = this.f31225e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    W2 w22 = new W2((Kd) this.f31227g, 1);
                    this.f31225e = 1;
                    if (this.f31226f.collect(w22, this) == aVar2) {
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
