package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\b\u001a\u00020\u0007*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launchWithDeferredDispatch", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeferredDispatchKt {
    public static final kotlinx.coroutines.Job launchWithDeferredDispatch(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.CoroutineDispatcher dispatcher = coil3.compose.internal.UtilsKt.getDispatcher(coroutineScope.getCoroutineContext());
        if (dispatcher == null || kotlin.jvm.internal.Intrinsics.areEqual(dispatcher, kotlinx.coroutines.Dispatchers.getUnconfined())) {
            return kotlinx.coroutines.BuildersKt.launch(coroutineScope, kotlinx.coroutines.Dispatchers.getUnconfined(), kotlinx.coroutines.CoroutineStart.UNDISPATCHED, function2);
        }
        return kotlinx.coroutines.BuildersKt.launch(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(new coil3.compose.internal.DeferredDispatchCoroutineContext(coroutineScope.getCoroutineContext())), new coil3.compose.internal.DeferredDispatchCoroutineDispatcher(dispatcher), kotlinx.coroutines.CoroutineStart.UNDISPATCHED, function2);
    }
}
