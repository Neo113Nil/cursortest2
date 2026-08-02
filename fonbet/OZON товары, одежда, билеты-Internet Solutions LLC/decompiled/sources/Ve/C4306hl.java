package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.hl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4306hl extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f31203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Hn f31204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4395ko f31205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f31206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4306hl(Hn hn, C4395ko c4395ko, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f31204e = hn;
        this.f31205f = c4395ko;
        this.f31206g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4306hl(this.f31204e, this.f31205f, this.f31206g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4306hl) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31203d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31203d = 1;
            if (this.f31204e.k(this.f31205f, this.f31206g, this) == aVar) {
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
