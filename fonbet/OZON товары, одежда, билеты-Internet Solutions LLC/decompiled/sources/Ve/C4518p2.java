package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.p2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4518p2 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f31755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4748x3 f31756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4087a4 f31757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f31758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4518p2(C4748x3 c4748x3, C4087a4 c4087a4, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f31756e = c4748x3;
        this.f31757f = c4087a4;
        this.f31758g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4518p2(this.f31756e, this.f31757f, this.f31758g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4518p2) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31755d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31755d = 1;
            if (this.f31756e.k(this.f31757f, this.f31758g, this) == aVar) {
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
