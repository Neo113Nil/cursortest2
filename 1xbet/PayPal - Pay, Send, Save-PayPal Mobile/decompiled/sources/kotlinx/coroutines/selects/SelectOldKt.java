package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0080H¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0080H¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "selectOld", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectUnbiasedOld"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectOldKt {
    public static final <R> java.lang.Object selectOld(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectBuilderImpl selectBuilderImpl = new kotlinx.coroutines.selects.SelectBuilderImpl(continuation);
        try {
            function1.invoke(selectBuilderImpl);
        } catch (java.lang.Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        java.lang.Object result = selectBuilderImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <R> java.lang.Object selectUnbiasedOld(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl(continuation);
        try {
            function1.invoke(unbiasedSelectBuilderImpl);
        } catch (java.lang.Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        java.lang.Object initSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (initSelectResult == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return initSelectResult;
    }

    public static final /* synthetic */ void access$resumeUndispatched(kotlinx.coroutines.CancellableContinuation cancellableContinuation, java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = (kotlinx.coroutines.CoroutineDispatcher) cancellableContinuation.getGetInputFormats().get(kotlinx.coroutines.CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, obj);
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(obj));
        }
    }

    public static final /* synthetic */ void access$resumeUndispatchedWithException(kotlinx.coroutines.CancellableContinuation cancellableContinuation, java.lang.Throwable th) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = (kotlinx.coroutines.CoroutineDispatcher) cancellableContinuation.getGetInputFormats().get(kotlinx.coroutines.CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th);
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }
}
