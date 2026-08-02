package Ve;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ol, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4508ol extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31738d;

    /* renamed from: e, reason: collision with root package name */
    public int f31739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4508ol(Object obj, kotlin.coroutines.d dVar, int i11) {
        super(2, dVar);
        this.f31738d = i11;
        this.f31740f = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31738d) {
            case 0:
                return new C4508ol((C4318i4) this.f31740f, dVar, 0);
            default:
                return new C4508ol((Vl) this.f31740f, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31738d) {
            case 0:
                return new C4508ol((C4318i4) this.f31740f, dVar, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4508ol((Vl) this.f31740f, dVar, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31738d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31739e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f31739e = 1;
                    if (xe.Y.b(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                C4318i4 c4318i4 = (C4318i4) this.f31740f;
                Ae.x0 x0Var = c4318i4.f31239C;
                x0Var.setValue(kotlin.collections.e0.c((Set) x0Var.getValue(), C7714v.J((Iterable) c4318i4.f31239C.getValue())));
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f31739e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    this.f31739e = 1;
                    if (((C4712vn) ((Vl) this.f31740f)).b(this) == aVar2) {
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
