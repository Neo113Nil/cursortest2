package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class k extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public k(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.k(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        new financial.atomic.muppet.b.k((kotlin.coroutines.Continuation) obj2);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(unit);
        return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
