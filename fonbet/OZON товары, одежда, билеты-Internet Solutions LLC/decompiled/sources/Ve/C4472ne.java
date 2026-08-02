package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.ne, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4472ne extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f31655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4646tf f31656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Rf f31657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f31658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4472ne(C4646tf c4646tf, Rf rf2, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f31656e = c4646tf;
        this.f31657f = rf2;
        this.f31658g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4472ne(this.f31656e, this.f31657f, this.f31658g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4472ne) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31655d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31655d = 1;
            if (this.f31656e.k(this.f31657f, this.f31658g, this) == aVar) {
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
