package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.wi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4735wi extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f32373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bj f32374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Al f32375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4735wi(Bj bj2, Al al, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f32374e = bj2;
        this.f32375f = al;
        this.f32376g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4735wi(this.f32374e, this.f32375f, this.f32376g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4735wi) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32373d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f32373d = 1;
            if (this.f32374e.k(this.f32375f, this.f32376g, this) == aVar) {
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
