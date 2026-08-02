package Ve;

import Ae.C2399j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.tq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4657tq extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f32160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ar f32161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4341j f32162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ He.b f32163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4657tq(Ar ar2, C4341j c4341j, He.b bVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f32161e = ar2;
        this.f32162f = c4341j;
        this.f32163g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4657tq(this.f32161e, this.f32162f, this.f32163g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4657tq) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32160d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f32160d = 1;
            Ar ar2 = this.f32161e;
            ar2.getClass();
            if (C2399j.A(new Xq(ar2, this.f32162f, this.f32163g, null)) == aVar) {
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
