package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class I2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f29206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f29207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4378k7 c4378k7, Context context) {
        super(2, dVar);
        this.f29205e = c2406m0;
        this.f29206f = c4378k7;
        this.f29207g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new I2(this.f29205e, dVar, this.f29206f, this.f29207g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I2) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29204d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4229f2 c4229f2 = new C4229f2(this.f29206f, this.f29207g);
            this.f29204d = 1;
            if (this.f29205e.collect(c4229f2, this) == aVar) {
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
