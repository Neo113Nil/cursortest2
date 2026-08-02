package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.w4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4721w4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S7 f32344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4721w4(C2406m0 c2406m0, kotlin.coroutines.d dVar, S7 s72) {
        super(2, dVar);
        this.f32343e = c2406m0;
        this.f32344f = s72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4721w4(this.f32343e, dVar, this.f32344f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4721w4(this.f32343e, (kotlin.coroutines.d) obj2, this.f32344f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32342d;
        if (i11 == 0) {
            Sc.s.b(obj);
            S3 s32 = new S3(this.f32344f, 0);
            this.f32342d = 1;
            if (this.f32343e.collect(s32, this) == aVar) {
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
