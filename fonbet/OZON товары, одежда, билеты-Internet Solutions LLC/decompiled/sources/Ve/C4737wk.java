package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.wk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4737wk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1 f32380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4737wk(C2406m0 c2406m0, kotlin.coroutines.d dVar, C1 c12) {
        super(2, dVar);
        this.f32379e = c2406m0;
        this.f32380f = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4737wk(this.f32379e, dVar, this.f32380f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4737wk(this.f32379e, (kotlin.coroutines.d) obj2, this.f32380f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32378d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4111b c4111b = new C4111b(this.f32380f, 1);
            this.f32378d = 1;
            if (this.f32379e.collect(c4111b, this) == aVar) {
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
