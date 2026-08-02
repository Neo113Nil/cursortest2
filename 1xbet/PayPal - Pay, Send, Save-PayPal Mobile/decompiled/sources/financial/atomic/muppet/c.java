package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef f6837a;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.c(this.f6837a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!this.f6837a.element);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.c(this.f6837a, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6837a = booleanRef;
    }
}
