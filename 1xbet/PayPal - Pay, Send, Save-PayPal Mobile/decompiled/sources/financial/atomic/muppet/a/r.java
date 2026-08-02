package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class r extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function1 f6794a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.functions.Function1 function1, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6794a = function1;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.r(this.f6794a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.r(this.f6794a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f6794a.invoke(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
