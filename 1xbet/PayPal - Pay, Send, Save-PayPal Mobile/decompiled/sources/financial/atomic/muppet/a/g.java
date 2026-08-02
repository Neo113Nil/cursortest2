package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class g implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f6767a;
    public final /* synthetic */ java.lang.String b;

    public g(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
        this.f6767a = flowCollector;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.a.f fVar;
        int i;
        if (continuation instanceof financial.atomic.muppet.a.f) {
            fVar = (financial.atomic.muppet.a.f) continuation;
            int i2 = fVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.b = i2 - 2147483648;
                java.lang.Object obj2 = fVar.f6764a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fVar.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f6767a;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((financial.atomic.muppet.Emitter.Event) obj).getType())) {
                        fVar.b = 1;
                        if (flowCollector.emit(obj, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        fVar = new financial.atomic.muppet.a.f(this, continuation);
        java.lang.Object obj22 = fVar.f6764a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fVar.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
