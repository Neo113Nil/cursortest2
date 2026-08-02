package Ve;

import Ae.C2399j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.yi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4791yi extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f32580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Dj f32581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4190dk f32582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ He.b f32583g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4791yi(Dj dj2, C4190dk c4190dk, He.b bVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f32581e = dj2;
        this.f32582f = c4190dk;
        this.f32583g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4791yi(this.f32581e, this.f32582f, this.f32583g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4791yi) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32580d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f32580d = 1;
            if (C2399j.A(new Yi(this.f32581e, this.f32582f, this.f32583g, null)) == aVar) {
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
