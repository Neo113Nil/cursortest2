package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aX\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launch", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "T", "Lkotlinx/coroutines/Deferred;", "async", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuidanceKt {
    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return launch(coroutineContext, coroutineStart, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'launch' can not be called without the corresponding coroutine scope. Consider wrapping 'launch' in 'coroutineScope { }', using 'runBlocking { }', or using some other 'CoroutineScope'")
    public static final kotlinx.coroutines.Job launch(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        throw new java.lang.UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return async(coroutineContext, coroutineStart, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'async' can not be called without the corresponding coroutine scope. Consider wrapping 'async' in 'coroutineScope { }', using 'runBlocking { }', or using some other 'CoroutineScope'")
    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        throw new java.lang.UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }
}
