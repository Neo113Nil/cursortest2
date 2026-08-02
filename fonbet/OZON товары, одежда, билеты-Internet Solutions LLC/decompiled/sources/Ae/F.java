package Ae;

import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class F extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<InterfaceC2397i<Object>, Throwable, Long, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f798d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Throwable f799e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ long f800f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<Throwable, kotlin.coroutines.d<? super Boolean>, Object> f801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(Function2 function2, kotlin.coroutines.d dVar) {
        super(4, dVar);
        this.f801g = function2;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Throwable th2, Long l11, kotlin.coroutines.d<? super Boolean> dVar) {
        long longValue = l11.longValue();
        F f7 = new F(this.f801g, dVar);
        f7.f799e = th2;
        f7.f800f = longValue;
        return f7.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f798d;
        boolean z11 = true;
        if (i11 == 0) {
            Sc.s.b(obj);
            Throwable th2 = this.f799e;
            if (this.f800f < Long.MAX_VALUE) {
                this.f798d = 1;
                obj = this.f801g.invoke(th2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Sc.s.b(obj);
    }
}
