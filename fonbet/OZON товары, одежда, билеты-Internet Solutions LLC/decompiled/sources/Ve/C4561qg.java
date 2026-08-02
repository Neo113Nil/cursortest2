package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.qg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4561qg extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f31871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4790yh f31872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Yh f31873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f31874g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4561qg(C4790yh c4790yh, Yh yh2, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f31872e = c4790yh;
        this.f31873f = yh2;
        this.f31874g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4561qg(this.f31872e, this.f31873f, this.f31874g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4561qg) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31871d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31871d = 1;
            if (this.f31872e.k(this.f31873f, this.f31874g, this) == aVar) {
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
