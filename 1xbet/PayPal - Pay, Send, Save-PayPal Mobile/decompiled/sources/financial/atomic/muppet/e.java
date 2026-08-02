package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class e implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.a f6867a;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(financial.atomic.muppet.Emitter.Event event, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.d dVar;
        int i;
        if (continuation instanceof financial.atomic.muppet.d) {
            dVar = (financial.atomic.muppet.d) continuation;
            int i2 = dVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.c = i2 - 2147483648;
                java.lang.Object obj = dVar.f6858a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2 a2 = this.f6867a.a();
                    dVar.c = 1;
                    if (a2.invoke(event, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (this.f6867a.b()) {
                    this.b.element = true;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        dVar = new financial.atomic.muppet.d(this, continuation);
        java.lang.Object obj2 = dVar.f6858a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.c;
        if (i != 0) {
        }
        if (this.f6867a.b()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public e(financial.atomic.muppet.a aVar, kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        this.f6867a = aVar;
        this.b = booleanRef;
    }
}
