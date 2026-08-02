package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a)\u0010\u0012\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\"\u0010\u0015\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\r8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\"\"\u0010\u001c\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\r8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "cancellable", "(Lkotlinx/coroutines/flow/SharedFlow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "flowOn", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "conflate", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "distinctUntilChanged", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "cause", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/concurrent/CancellationException;)V", "", "isActive", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "coroutineContext"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LintKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void getCoroutineContext$annotations(kotlinx.coroutines.flow.FlowCollector flowCollector) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void isActive$annotations(kotlinx.coroutines.flow.FlowCollector flowCollector) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static final boolean isActive(kotlinx.coroutines.flow.FlowCollector<?> flowCollector) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.flow.FlowCollector flowCollector, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void cancel(kotlinx.coroutines.flow.FlowCollector<?> flowCollector, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlin.coroutines.CoroutineContext getCoroutineContext(kotlinx.coroutines.flow.FlowCollector<?> flowCollector) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }
}
