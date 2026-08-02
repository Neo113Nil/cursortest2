package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.r6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4579r6 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f31953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4091a8 f31954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D8 f31955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f31956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4579r6(C4091a8 c4091a8, D8 d82, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f31954e = c4091a8;
        this.f31955f = d82;
        this.f31956g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4579r6(this.f31954e, this.f31955f, this.f31956g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4579r6) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31953d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31953d = 1;
            if (this.f31954e.k(this.f31955f, this.f31956g, this) == aVar) {
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
