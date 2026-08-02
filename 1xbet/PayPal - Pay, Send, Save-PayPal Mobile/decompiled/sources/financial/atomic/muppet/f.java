package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6868a;
    public final /* synthetic */ financial.atomic.muppet.Emitter b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ financial.atomic.muppet.a d;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.f) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6868a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            kotlinx.coroutines.flow.Flow takeWhile = kotlinx.coroutines.flow.FlowKt.takeWhile(new financial.atomic.muppet.a.h(this.b.getEvents(), this.c), new financial.atomic.muppet.c(booleanRef, null));
            financial.atomic.muppet.e eVar = new financial.atomic.muppet.e(this.d, booleanRef);
            this.f6868a = 1;
            if (takeWhile.collect(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.f(this.b, this.c, this.d, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(financial.atomic.muppet.Emitter emitter, java.lang.String str, financial.atomic.muppet.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = emitter;
        this.c = str;
        this.d = aVar;
    }
}
