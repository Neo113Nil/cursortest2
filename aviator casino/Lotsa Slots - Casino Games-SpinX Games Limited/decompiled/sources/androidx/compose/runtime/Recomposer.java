package androidx.compose.runtime;

/* compiled from: Recomposer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ¹\u00012\u00020\u0001:\n¹\u0001º\u0001»\u0001¼\u0001½\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0002J\u0010\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020aH\u0002J\u0006\u0010b\u001a\u00020cJ\u000e\u0010d\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u00020\\H\u0082@¢\u0006\u0002\u0010eJ\u0006\u0010g\u001a\u00020\\J\b\u0010h\u001a\u00020\\H\u0002J\u0006\u0010i\u001a\u00020\\J*\u0010j\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u00072\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\\0l¢\u0006\u0002\bmH\u0010¢\u0006\u0004\bn\u0010oJ:\u0010p\u001a\u0002Hq\"\u0004\b\u0000\u0010q2\u0006\u0010^\u001a\u00020\u00072\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010R2\f\u0010s\u001a\b\u0012\u0004\u0012\u0002Hq0lH\u0082\b¢\u0006\u0002\u0010tJ\u0015\u0010u\u001a\u00020\\2\u0006\u0010v\u001a\u00020\u001fH\u0010¢\u0006\u0002\bwJ\u0010\u0010x\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[H\u0002J\b\u0010y\u001a\u00020\\H\u0002J\u0015\u0010z\u001a\u00020\\2\u0006\u0010v\u001a\u00020\u001fH\u0010¢\u0006\u0002\b{J\u0015\u0010|\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0002\b}J\u0017\u0010~\u001a\u00020\\2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0010¢\u0006\u0003\b\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ \u0010\u0083\u0001\u001a\u00020\\2\u0006\u0010v\u001a\u00020\u001f2\u0007\u0010\u0084\u0001\u001a\u00020 H\u0010¢\u0006\u0003\b\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010v\u001a\u00020\u001fH\u0010¢\u0006\u0003\b\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020\\J\u0011\u0010\u0089\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0002J.\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010RH\u0002J#\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010^\u001a\u00020\u00072\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010RH\u0002J0\u0010\u008d\u0001\u001a\u00020\\2\r\u0010\u008e\u0001\u001a\b0\u008f\u0001j\u0003`\u0090\u00012\u000b\b\u0002\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00072\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u0017H\u0002J\u001e\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\\0\u0094\u00012\u0006\u0010^\u001a\u00020\u0007H\u0002JV\u0010\u0095\u0001\u001a\u00020\\2D\u0010s\u001a@\b\u0001\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0017\u0012\u00150\u0098\u0001¢\u0006\u000f\b\u0099\u0001\u0012\n\b\u009a\u0001\u0012\u0005\b\b(\u009b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\\0\u009c\u0001\u0012\u0006\u0012\u0004\u0018\u00010$0\u0096\u0001¢\u0006\u0003\b\u009d\u0001H\u0082@¢\u0006\u0003\u0010\u009e\u0001J\t\u0010\u009f\u0001\u001a\u00020\u0017H\u0002J \u0010\u009f\u0001\u001a\u00020\\2\u0014\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\\0\u0094\u0001H\u0082\bJ\u001f\u0010¡\u0001\u001a\u00020\\2\u000e\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010'H\u0010¢\u0006\u0003\b¤\u0001J\u0017\u0010¥\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0003\b¦\u0001J\u0012\u0010§\u0001\u001a\u00020\\2\u0007\u0010¨\u0001\u001a\u00020NH\u0002J\u0011\u0010©\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0002J\u0017\u0010ª\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0003\b«\u0001J\u000b\u0010¬\u0001\u001a\u0004\u0018\u000106H\u0002J\u0007\u0010\u00ad\u0001\u001a\u00020\\J\t\u0010®\u0001\u001a\u00020\\H\u0002J$\u0010¯\u0001\u001a\u00020\\2\b\u0010\u009b\u0001\u001a\u00030\u0098\u00012\b\u0010°\u0001\u001a\u00030±\u0001H\u0082@¢\u0006\u0003\u0010²\u0001J\u000f\u0010³\u0001\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010eJ\u0018\u0010´\u0001\u001a\u00020\\2\u0006\u0010I\u001a\u00020\u0003H\u0087@¢\u0006\u0003\u0010µ\u0001J\u0017\u0010¶\u0001\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0007H\u0010¢\u0006\u0003\b·\u0001J.\u0010¸\u0001\u001a\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\\0\u0094\u00012\u0006\u0010^\u001a\u00020\u00072\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010RH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\"\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0019R\u0011\u0010A\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0019R\u000e\u0010E\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bJ\u00102R\u0012\u0010K\u001a\u00060LR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0019R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020$0RX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010S\u001a\b\u0012\u0004\u0012\u00020\f0T8FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u000e\u0010Y\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010Z\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¾\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "_knownCompositions", "", "Landroidx/compose/runtime/ControlledComposition;", "_knownCompositionsCache", "", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "<set-?>", "", "changeCount", "getChangeCount", "()J", "closeCause", "", "collectingParameterInformation", "", "getCollectingParameterInformation$runtime_release", "()Z", "collectingSourceInformation", "getCollectingSourceInformation$runtime_release", "compositionInvalidations", "compositionValueStatesAvailable", "", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/MovableContentState;", "compositionValuesAwaitingInsert", "compositionValuesRemoved", "Landroidx/compose/runtime/MovableContent;", "", "compositionsAwaitingApply", "compositionsRemoved", "", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "concurrentCompositionsOutstanding", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "failedCompositions", "frameClockPaused", "hasBroadcastFrameClockAwaiters", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaitersLocked", "hasConcurrentFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasFrameWorkLocked", "getHasFrameWorkLocked", "hasPendingWork", "getHasPendingWork", "hasSchedulingWork", "getHasSchedulingWork", "isClosed", "knownCompositions", "getKnownCompositions", "()Ljava/util/List;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "runnerJob", "Lkotlinx/coroutines/Job;", "shouldKeepRecomposing", "getShouldKeepRecomposing", "snapshotInvalidations", "Landroidx/compose/runtime/collection/IdentityArraySet;", "state", "Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "()V", "getState", "()Lkotlinx/coroutines/flow/Flow;", "stateLock", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "addKnownCompositionLocked", "composition", "applyAndCheck", "snapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "asRecomposerInfo", "Landroidx/compose/runtime/RecomposerInfo;", "awaitIdle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "cancel", "clearKnownCompositionsLocked", "close", "composeInitial", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composing", "T", "modifiedValues", "block", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "deletedMovableContent", "reference", "deletedMovableContent$runtime_release", "deriveStateLocked", "discardUnusedValues", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "join", "movableContentStateReleased", "data", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "pauseCompositionFrameClock", "performInitialMovableContentInserts", "performInsertValues", "references", "performRecompose", "processCompositionError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failedInitialComposition", "recoverable", "readObserverOf", "Lkotlin/Function1;", "recompositionRunner", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordComposerModifications", "onEachInvalidComposition", "recordInspectionTable", com.ironsource.B5.R, "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposition", "registerComposition$runtime_release", "registerRunnerJob", "callingJob", "removeKnownCompositionLocked", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "resetErrorState", "resumeCompositionFrameClock", "retryFailedCompositions", "runFrameLoop", "frameSignal", "Landroidx/compose/runtime/ProduceFrameSignal;", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runRecomposeAndApplyChanges", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterComposition", "unregisterComposition$runtime_release", "writeObserverOf", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Recomposer extends androidx.compose.runtime.CompositionContext {
    private final java.util.List<androidx.compose.runtime.ControlledComposition> _knownCompositions;
    private java.util.List<? extends androidx.compose.runtime.ControlledComposition> _knownCompositionsCache;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.compose.runtime.Recomposer.State> _state;
    private final androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private java.lang.Throwable closeCause;
    private final java.util.List<androidx.compose.runtime.ControlledComposition> compositionInvalidations;
    private final java.util.Map<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> compositionValueStatesAvailable;
    private final java.util.List<androidx.compose.runtime.MovableContentStateReference> compositionValuesAwaitingInsert;
    private final java.util.Map<androidx.compose.runtime.MovableContent<java.lang.Object>, java.util.List<androidx.compose.runtime.MovableContentStateReference>> compositionValuesRemoved;
    private final java.util.List<androidx.compose.runtime.ControlledComposition> compositionsAwaitingApply;
    private java.util.Set<androidx.compose.runtime.ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final kotlin.coroutines.CoroutineContext effectCoroutineContext;
    private final kotlinx.coroutines.CompletableJob effectJob;
    private androidx.compose.runtime.Recomposer.RecomposerErrorState errorState;
    private java.util.List<androidx.compose.runtime.ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfo;
    private kotlinx.coroutines.Job runnerJob;
    private androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> snapshotInvalidations;
    private final java.lang.Object stateLock;
    private kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.Recomposer.Companion INSTANCE = new androidx.compose.runtime.Recomposer.Companion(null);
    public static final int $stable = 8;
    private static final kotlinx.coroutines.flow.MutableStateFlow<androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<androidx.compose.runtime.Recomposer.RecomposerInfoImpl>> _runningRecomposers = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.persistentSetOf());
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> _hotReloadEnabled = new java.util.concurrent.atomic.AtomicReference<>(false);

    /* compiled from: Recomposer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @kotlin.Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @kotlin.ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(java.util.Set<androidx.compose.runtime.tooling.CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
    }

    public Recomposer(kotlin.coroutines.CoroutineContext coroutineContext) {
        androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock = new androidx.compose.runtime.BroadcastFrameClock(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.CancellableContinuation deriveStateLocked;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                java.lang.Throwable th;
                java.lang.Object obj = androidx.compose.runtime.Recomposer.this.stateLock;
                androidx.compose.runtime.Recomposer recomposer = androidx.compose.runtime.Recomposer.this;
                synchronized (obj) {
                    deriveStateLocked = recomposer.deriveStateLocked();
                    mutableStateFlow = recomposer._state;
                    if (((androidx.compose.runtime.Recomposer.State) mutableStateFlow.getValue()).compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) <= 0) {
                        th = recomposer.closeCause;
                        throw kotlinx.coroutines.ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", th);
                    }
                }
                if (deriveStateLocked != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    deriveStateLocked.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new java.lang.Object();
        this._knownCompositions = new java.util.ArrayList();
        this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet<>();
        this.compositionInvalidations = new java.util.ArrayList();
        this.compositionsAwaitingApply = new java.util.ArrayList();
        this.compositionValuesAwaitingInsert = new java.util.ArrayList();
        this.compositionValuesRemoved = new java.util.LinkedHashMap();
        this.compositionValueStatesAvailable = new java.util.LinkedHashMap();
        this._state = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.compose.runtime.Recomposer.State.Inactive);
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
        Job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final java.lang.Throwable th) {
                kotlinx.coroutines.Job job;
                kotlinx.coroutines.CancellableContinuation cancellableContinuation;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                boolean z;
                kotlinx.coroutines.CancellableContinuation cancellableContinuation2;
                kotlinx.coroutines.CancellableContinuation cancellableContinuation3;
                java.util.concurrent.CancellationException CancellationException = kotlinx.coroutines.ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                java.lang.Object obj = androidx.compose.runtime.Recomposer.this.stateLock;
                final androidx.compose.runtime.Recomposer recomposer = androidx.compose.runtime.Recomposer.this;
                synchronized (obj) {
                    job = recomposer.runnerJob;
                    cancellableContinuation = null;
                    if (job != null) {
                        mutableStateFlow2 = recomposer._state;
                        mutableStateFlow2.setValue(androidx.compose.runtime.Recomposer.State.ShuttingDown);
                        z = recomposer.isClosed;
                        if (z) {
                            cancellableContinuation2 = recomposer.workContinuation;
                            if (cancellableContinuation2 != null) {
                                cancellableContinuation3 = recomposer.workContinuation;
                                recomposer.workContinuation = null;
                                job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th2) {
                                        invoke2(th2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(java.lang.Throwable th2) {
                                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
                                        java.lang.Object obj2 = androidx.compose.runtime.Recomposer.this.stateLock;
                                        androidx.compose.runtime.Recomposer recomposer2 = androidx.compose.runtime.Recomposer.this;
                                        java.lang.Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                if (!(!(th2 instanceof java.util.concurrent.CancellationException))) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            mutableStateFlow3 = recomposer2._state;
                                            mutableStateFlow3.setValue(androidx.compose.runtime.Recomposer.State.ShutDown);
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        }
                                    }
                                });
                                cancellableContinuation = cancellableContinuation3;
                            }
                        } else {
                            job.cancel(CancellationException);
                        }
                        cancellableContinuation3 = null;
                        recomposer.workContinuation = null;
                        job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th2) {
                                invoke2(th2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(java.lang.Throwable th2) {
                                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
                                java.lang.Object obj2 = androidx.compose.runtime.Recomposer.this.stateLock;
                                androidx.compose.runtime.Recomposer recomposer2 = androidx.compose.runtime.Recomposer.this;
                                java.lang.Throwable th3 = th;
                                synchronized (obj2) {
                                    if (th3 == null) {
                                        th3 = null;
                                    } else if (th2 != null) {
                                        if (!(!(th2 instanceof java.util.concurrent.CancellationException))) {
                                            th2 = null;
                                        }
                                        if (th2 != null) {
                                            kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                        }
                                    }
                                    recomposer2.closeCause = th3;
                                    mutableStateFlow3 = recomposer2._state;
                                    mutableStateFlow3.setValue(androidx.compose.runtime.Recomposer.State.ShutDown);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                            }
                        });
                        cancellableContinuation = cancellableContinuation3;
                    } else {
                        recomposer.closeCause = CancellationException;
                        mutableStateFlow = recomposer._state;
                        mutableStateFlow.setValue(androidx.compose.runtime.Recomposer.State.ShutDown);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
                if (cancellableContinuation != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                }
            }
        });
        this.effectJob = Job;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(Job);
        this.recomposerInfo = new androidx.compose.runtime.Recomposer.RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> getKnownCompositions() {
        java.util.List list = this._knownCompositionsCache;
        java.util.List list2 = list;
        if (list == null) {
            java.util.List<androidx.compose.runtime.ControlledComposition> list3 = this._knownCompositions;
            java.util.List emptyList = list3.isEmpty() ? kotlin.collections.CollectionsKt.emptyList() : new java.util.ArrayList(list3);
            this._knownCompositionsCache = emptyList;
            list2 = emptyList;
        }
        return list2;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public kotlin.coroutines.CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public kotlin.coroutines.CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> deriveStateLocked() {
        androidx.compose.runtime.Recomposer.State state;
        if (this._state.getValue().compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = androidx.compose.runtime.Recomposer.State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet<>();
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? androidx.compose.runtime.Recomposer.State.InactivePendingWork : androidx.compose.runtime.Recomposer.State.Inactive;
        } else if ((!this.compositionInvalidations.isEmpty()) || this.snapshotInvalidations.isNotEmpty() || (!this.compositionsAwaitingApply.isEmpty()) || (!this.compositionValuesAwaitingInsert.isEmpty()) || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) {
            state = androidx.compose.runtime.Recomposer.State.PendingWork;
        } else {
            state = androidx.compose.runtime.Recomposer.State.Idle;
        }
        this._state.setValue(state);
        if (state != androidx.compose.runtime.Recomposer.State.PendingWork) {
            return null;
        }
        kotlinx.coroutines.CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = !this.isClosed;
        }
        if (z) {
            return true;
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.compose.runtime.Recomposer.State> getState() {
        return getCurrentState();
    }

    public final kotlinx.coroutines.flow.StateFlow<androidx.compose.runtime.Recomposer.State> getCurrentState() {
        return this._state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", com.ironsource.X3.i.W, "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class RecomposerInfoImpl implements androidx.compose.runtime.RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public kotlinx.coroutines.flow.Flow<androidx.compose.runtime.Recomposer.State> getState() {
            return androidx.compose.runtime.Recomposer.this.getCurrentState();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return androidx.compose.runtime.Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return androidx.compose.runtime.Recomposer.this.getChangeCount();
        }

        public final androidx.compose.runtime.RecomposerErrorInfo getCurrentError() {
            androidx.compose.runtime.Recomposer.RecomposerErrorState recomposerErrorState;
            java.lang.Object obj = androidx.compose.runtime.Recomposer.this.stateLock;
            androidx.compose.runtime.Recomposer recomposer = androidx.compose.runtime.Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        public final void invalidateGroupsWithKey(int key) {
            java.util.List knownCompositions;
            java.lang.Object obj = androidx.compose.runtime.Recomposer.this.stateLock;
            androidx.compose.runtime.Recomposer recomposer = androidx.compose.runtime.Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) knownCompositions.get(i);
                androidx.compose.runtime.CompositionImpl compositionImpl = controlledComposition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((androidx.compose.runtime.CompositionImpl) arrayList2.get(i2)).invalidateGroupsWithKey(key);
            }
        }

        public final java.util.List<androidx.compose.runtime.Recomposer.HotReloadable> saveStateAndDisposeForHotReload() {
            java.util.List knownCompositions;
            java.lang.Object obj = androidx.compose.runtime.Recomposer.this.stateLock;
            androidx.compose.runtime.Recomposer recomposer = androidx.compose.runtime.Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) knownCompositions.get(i);
                androidx.compose.runtime.CompositionImpl compositionImpl = controlledComposition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.runtime.Recomposer.HotReloadable hotReloadable = new androidx.compose.runtime.Recomposer.HotReloadable((androidx.compose.runtime.CompositionImpl) arrayList2.get(i2));
                hotReloadable.clearContent();
                arrayList3.add(hotReloadable);
            }
            return arrayList3;
        }

        public final androidx.compose.runtime.Recomposer.RecomposerErrorState resetErrorState() {
            return androidx.compose.runtime.Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            androidx.compose.runtime.Recomposer.this.retryFailedCompositions();
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class HotReloadable {
        private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composable;
        private final androidx.compose.runtime.CompositionImpl composition;

        public HotReloadable(androidx.compose.runtime.CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(androidx.compose.runtime.ComposableSingletons$RecomposerKt.INSTANCE.m1610getLambda1$runtime_release());
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RecomposerErrorState implements androidx.compose.runtime.RecomposerErrorInfo {
        private final java.lang.Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, java.lang.Exception exc) {
            this.recoverable = z;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public java.lang.Exception getCause() {
            return this.cause;
        }
    }

    public final androidx.compose.runtime.RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        java.util.List<androidx.compose.runtime.ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> identityArraySet = this.snapshotInvalidations;
            this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet<>();
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                androidx.compose.runtime.Recomposer recomposer = this;
                int size = knownCompositions.size();
                for (int i = 0; i < size; i++) {
                    knownCompositions.get(i).recordModificationsOf(identityArraySet);
                    if (this._state.getValue().compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet<>();
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (java.lang.Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll((java.util.Collection<? extends java.lang.Object>) identityArraySet);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    throw th;
                }
            }
        }
    }

    private final void recordComposerModifications(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.ControlledComposition, kotlin.Unit> onEachInvalidComposition) {
        androidx.compose.runtime.collection.IdentityArraySet identityArraySet = this.snapshotInvalidations;
        if (identityArraySet.isNotEmpty()) {
            java.util.List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ((androidx.compose.runtime.ControlledComposition) knownCompositions.get(i)).recordModificationsOf(identityArraySet);
            }
            this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet();
        }
        java.util.List list = this.compositionInvalidations;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            onEachInvalidComposition.invoke(list.get(i2));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(kotlinx.coroutines.Job callingJob) {
        synchronized (this.stateLock) {
            java.lang.Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) <= 0) {
                throw new java.lang.IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new java.lang.IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    public final java.lang.Object runRecomposeAndApplyChanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object recompositionRunner = recompositionRunner(new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        return recompositionRunner == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ void processCompositionError$default(androidx.compose.runtime.Recomposer recomposer, java.lang.Exception exc, androidx.compose.runtime.ControlledComposition controlledComposition, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z);
    }

    private final void processCompositionError(java.lang.Exception e, androidx.compose.runtime.ControlledComposition failedInitialComposition, boolean recoverable) {
        if (_hotReloadEnabled.get().booleanValue() && !(e instanceof androidx.compose.runtime.ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                androidx.compose.runtime.ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet<>();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new androidx.compose.runtime.Recomposer.RecomposerErrorState(recoverable, e);
                if (failedInitialComposition != null) {
                    java.util.ArrayList arrayList = this.failedCompositions;
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        this.failedCompositions = arrayList;
                    }
                    if (!arrayList.contains(failedInitialComposition)) {
                        arrayList.add(failedInitialComposition);
                    }
                    removeKnownCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            }
            return;
        }
        synchronized (this.stateLock) {
            androidx.compose.runtime.Recomposer.RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new androidx.compose.runtime.Recomposer.RecomposerErrorState(false, e);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw e;
    }

    private final void clearKnownCompositionsLocked() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = kotlin.collections.CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(androidx.compose.runtime.ControlledComposition composition) {
        this._knownCompositions.remove(composition);
        this._knownCompositionsCache = null;
    }

    private final void addKnownCompositionLocked(androidx.compose.runtime.ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.runtime.Recomposer.RecomposerErrorState resetErrorState() {
        androidx.compose.runtime.Recomposer.RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        java.util.List<androidx.compose.runtime.ControlledComposition> list;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) kotlin.collections.CollectionsKt.removeLast(list);
                if (controlledComposition instanceof androidx.compose.runtime.CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((androidx.compose.runtime.CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (java.lang.Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        java.util.List<androidx.compose.runtime.ControlledComposition> list2 = this.failedCompositions;
                        if (list2 != null) {
                            list2.addAll(list);
                            if (list2 != null) {
                                list = list2;
                            }
                        }
                        this.failedCompositions = list;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
                throw th;
            }
        }
        if (!list.isEmpty()) {
            synchronized (this.stateLock) {
                java.util.List<androidx.compose.runtime.ControlledComposition> list3 = this.failedCompositions;
                if (list3 != null) {
                    list3.addAll(list);
                    if (list3 != null) {
                        list = list3;
                    }
                }
                this.failedCompositions = list;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final java.lang.Object runRecomposeConcurrentlyAndApplyChanges(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object recompositionRunner = recompositionRunner(new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, null), continuation);
        return recompositionRunner == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a9 -> B:11:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal produceFrameSignal, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.runtime.Recomposer$runFrameLoop$1 recomposer$runFrameLoop$1;
        int i;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        androidx.compose.runtime.Recomposer recomposer;
        final java.util.ArrayList arrayList3;
        final java.util.ArrayList arrayList4;
        final androidx.compose.runtime.Recomposer recomposer2;
        androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock2;
        final androidx.compose.runtime.ProduceFrameSignal produceFrameSignal2;
        kotlin.jvm.functions.Function1<java.lang.Long, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>> function1;
        java.lang.Object obj;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        if (continuation instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1) {
            recomposer$runFrameLoop$1 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) continuation;
            if ((recomposer$runFrameLoop$1.label & Integer.MIN_VALUE) != 0) {
                recomposer$runFrameLoop$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj2 = recomposer$runFrameLoop$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recomposer$runFrameLoop$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    arrayList = new java.util.ArrayList();
                    arrayList2 = new java.util.ArrayList();
                    recomposer = this;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    ?? r8 = (java.util.List) recomposer$runFrameLoop$1.L$4;
                    ?? r9 = (java.util.List) recomposer$runFrameLoop$1.L$3;
                    produceFrameSignal2 = (androidx.compose.runtime.ProduceFrameSignal) recomposer$runFrameLoop$1.L$2;
                    monotonicFrameClock2 = (androidx.compose.runtime.MonotonicFrameClock) recomposer$runFrameLoop$1.L$1;
                    recomposer2 = (androidx.compose.runtime.Recomposer) recomposer$runFrameLoop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    arrayList4 = r8;
                    arrayList3 = r9;
                    function1 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>>() { // from class: androidx.compose.runtime.Recomposer$runFrameLoop$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> invoke(java.lang.Long l) {
                            return invoke(l.longValue());
                        }

                        public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> invoke(long j) {
                            boolean hasBroadcastFrameClockAwaiters;
                            java.lang.Object beginSection;
                            java.util.List list;
                            int i2;
                            java.util.List list2;
                            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> deriveStateLocked;
                            androidx.compose.runtime.ControlledComposition performRecompose;
                            androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock;
                            hasBroadcastFrameClockAwaiters = androidx.compose.runtime.Recomposer.this.getHasBroadcastFrameClockAwaiters();
                            if (hasBroadcastFrameClockAwaiters) {
                                androidx.compose.runtime.Recomposer recomposer3 = androidx.compose.runtime.Recomposer.this;
                                beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Recomposer:animation");
                                try {
                                    broadcastFrameClock = recomposer3.broadcastFrameClock;
                                    broadcastFrameClock.sendFrame(j);
                                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                } finally {
                                }
                            }
                            androidx.compose.runtime.Recomposer recomposer4 = androidx.compose.runtime.Recomposer.this;
                            java.util.List<androidx.compose.runtime.ControlledComposition> list3 = arrayList3;
                            java.util.List<androidx.compose.runtime.ControlledComposition> list4 = arrayList4;
                            androidx.compose.runtime.ProduceFrameSignal produceFrameSignal3 = produceFrameSignal2;
                            beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Recomposer:recompose");
                            try {
                                recomposer4.recordComposerModifications();
                                synchronized (recomposer4.stateLock) {
                                    list = recomposer4.compositionsAwaitingApply;
                                    int size = list.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        list4.add((androidx.compose.runtime.ControlledComposition) list.get(i3));
                                    }
                                    list2 = recomposer4.compositionsAwaitingApply;
                                    list2.clear();
                                    java.util.List list5 = recomposer4.compositionInvalidations;
                                    int size2 = list5.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        list3.add((androidx.compose.runtime.ControlledComposition) list5.get(i4));
                                    }
                                    recomposer4.compositionInvalidations.clear();
                                    produceFrameSignal3.takeFrameRequestLocked();
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                                androidx.compose.runtime.collection.IdentityArraySet identityArraySet = new androidx.compose.runtime.collection.IdentityArraySet();
                                try {
                                    int size3 = list3.size();
                                    for (int i5 = 0; i5 < size3; i5++) {
                                        performRecompose = recomposer4.performRecompose(list3.get(i5), identityArraySet);
                                        if (performRecompose != null) {
                                            list4.add(performRecompose);
                                        }
                                    }
                                    list3.clear();
                                    if (!list4.isEmpty()) {
                                        recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                    }
                                    try {
                                        int size4 = list4.size();
                                        for (i2 = 0; i2 < size4; i2++) {
                                            list4.get(i2).applyChanges();
                                        }
                                        list4.clear();
                                        synchronized (recomposer4.stateLock) {
                                            deriveStateLocked = recomposer4.deriveStateLocked();
                                        }
                                        return deriveStateLocked;
                                    } catch (java.lang.Throwable th) {
                                        list4.clear();
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    list3.clear();
                                    throw th2;
                                }
                            } finally {
                            }
                        }
                    };
                    recomposer$runFrameLoop$1.L$0 = recomposer2;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock2;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal2;
                    recomposer$runFrameLoop$1.L$3 = arrayList3;
                    recomposer$runFrameLoop$1.L$4 = arrayList4;
                    recomposer$runFrameLoop$1.label = 2;
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    if (monotonicFrameClock2.withFrameNanos(function1, recomposer$runFrameLoop$1) == coroutine_suspended) {
                    }
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    recomposer = recomposer2;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r82 = (java.util.List) recomposer$runFrameLoop$1.L$4;
                    ?? r92 = (java.util.List) recomposer$runFrameLoop$1.L$3;
                    produceFrameSignal2 = (androidx.compose.runtime.ProduceFrameSignal) recomposer$runFrameLoop$1.L$2;
                    monotonicFrameClock2 = (androidx.compose.runtime.MonotonicFrameClock) recomposer$runFrameLoop$1.L$1;
                    recomposer2 = (androidx.compose.runtime.Recomposer) recomposer$runFrameLoop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    arrayList6 = r82;
                    arrayList5 = r92;
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    recomposer = recomposer2;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    recomposer2 = recomposer;
                    monotonicFrameClock2 = monotonicFrameClock;
                    arrayList4 = arrayList2;
                    produceFrameSignal2 = produceFrameSignal;
                    arrayList3 = arrayList;
                    function1 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>>() { // from class: androidx.compose.runtime.Recomposer$runFrameLoop$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> invoke(java.lang.Long l) {
                            return invoke(l.longValue());
                        }

                        public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> invoke(long j) {
                            boolean hasBroadcastFrameClockAwaiters;
                            java.lang.Object beginSection;
                            java.util.List list;
                            int i2;
                            java.util.List list2;
                            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> deriveStateLocked;
                            androidx.compose.runtime.ControlledComposition performRecompose;
                            androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock;
                            hasBroadcastFrameClockAwaiters = androidx.compose.runtime.Recomposer.this.getHasBroadcastFrameClockAwaiters();
                            if (hasBroadcastFrameClockAwaiters) {
                                androidx.compose.runtime.Recomposer recomposer3 = androidx.compose.runtime.Recomposer.this;
                                beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Recomposer:animation");
                                try {
                                    broadcastFrameClock = recomposer3.broadcastFrameClock;
                                    broadcastFrameClock.sendFrame(j);
                                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                } finally {
                                }
                            }
                            androidx.compose.runtime.Recomposer recomposer4 = androidx.compose.runtime.Recomposer.this;
                            java.util.List<androidx.compose.runtime.ControlledComposition> list3 = arrayList3;
                            java.util.List<androidx.compose.runtime.ControlledComposition> list4 = arrayList4;
                            androidx.compose.runtime.ProduceFrameSignal produceFrameSignal3 = produceFrameSignal2;
                            beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Recomposer:recompose");
                            try {
                                recomposer4.recordComposerModifications();
                                synchronized (recomposer4.stateLock) {
                                    list = recomposer4.compositionsAwaitingApply;
                                    int size = list.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        list4.add((androidx.compose.runtime.ControlledComposition) list.get(i3));
                                    }
                                    list2 = recomposer4.compositionsAwaitingApply;
                                    list2.clear();
                                    java.util.List list5 = recomposer4.compositionInvalidations;
                                    int size2 = list5.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        list3.add((androidx.compose.runtime.ControlledComposition) list5.get(i4));
                                    }
                                    recomposer4.compositionInvalidations.clear();
                                    produceFrameSignal3.takeFrameRequestLocked();
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                                androidx.compose.runtime.collection.IdentityArraySet identityArraySet = new androidx.compose.runtime.collection.IdentityArraySet();
                                try {
                                    int size3 = list3.size();
                                    for (int i5 = 0; i5 < size3; i5++) {
                                        performRecompose = recomposer4.performRecompose(list3.get(i5), identityArraySet);
                                        if (performRecompose != null) {
                                            list4.add(performRecompose);
                                        }
                                    }
                                    list3.clear();
                                    if (!list4.isEmpty()) {
                                        recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                    }
                                    try {
                                        int size4 = list4.size();
                                        for (i2 = 0; i2 < size4; i2++) {
                                            list4.get(i2).applyChanges();
                                        }
                                        list4.clear();
                                        synchronized (recomposer4.stateLock) {
                                            deriveStateLocked = recomposer4.deriveStateLocked();
                                        }
                                        return deriveStateLocked;
                                    } catch (java.lang.Throwable th) {
                                        list4.clear();
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    list3.clear();
                                    throw th2;
                                }
                            } finally {
                            }
                        }
                    };
                    recomposer$runFrameLoop$1.L$0 = recomposer2;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock2;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal2;
                    recomposer$runFrameLoop$1.L$3 = arrayList3;
                    recomposer$runFrameLoop$1.L$4 = arrayList4;
                    recomposer$runFrameLoop$1.label = 2;
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    if (monotonicFrameClock2.withFrameNanos(function1, recomposer$runFrameLoop$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    recomposer = recomposer2;
                    obj = recomposer.stateLock;
                    recomposer$runFrameLoop$1.L$0 = recomposer;
                    recomposer$runFrameLoop$1.L$1 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$2 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$3 = arrayList;
                    recomposer$runFrameLoop$1.L$4 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                }
            }
        }
        recomposer$runFrameLoop$1 = new androidx.compose.runtime.Recomposer$runFrameLoop$1(this, continuation);
        java.lang.Object obj22 = recomposer$runFrameLoop$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recomposer$runFrameLoop$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object awaitWorkAvailable(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (getHasSchedulingWork()) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this.stateLock) {
            if (!getHasSchedulingWork()) {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl2 = null;
            }
        }
        if (cancellableContinuationImpl2 != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object recompositionRunner(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.MonotonicFrameClock, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.broadcastFrameClock, new androidx.compose.runtime.Recomposer$recompositionRunner$2(this, function3, androidx.compose.runtime.MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(androidx.compose.runtime.Recomposer.State.Idle) >= 0) {
                this._state.setValue(androidx.compose.runtime.Recomposer.State.ShuttingDown);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this.effectJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(getCurrentState(), new androidx.compose.runtime.Recomposer$join$2(null), continuation);
        return first == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? first : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(androidx.compose.runtime.ControlledComposition composition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        boolean isComposing = composition.isComposing();
        try {
            androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = takeMutableSnapshot;
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = mutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (!isComposing) {
                        androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(androidx.compose.runtime.Recomposer.State.ShuttingDown) > 0 && !getKnownCompositions().contains(composition)) {
                            addKnownCompositionLocked(composition);
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    try {
                        performInitialMovableContentInserts(composition);
                        try {
                            composition.applyChanges();
                            composition.applyLateChanges();
                            if (isComposing) {
                                return;
                            }
                            androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
                        } catch (java.lang.Exception e) {
                            processCompositionError$default(this, e, null, false, 6, null);
                        }
                    } catch (java.lang.Exception e2) {
                        processCompositionError(e2, composition, true);
                    }
                } finally {
                    mutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        } catch (java.lang.Exception e3) {
            processCompositionError(e3, composition, true);
        }
    }

    private final void performInitialMovableContentInserts(androidx.compose.runtime.ControlledComposition composition) {
        synchronized (this.stateLock) {
            java.util.List<androidx.compose.runtime.MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(list.get(i).getComposition(), composition)) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(java.util.List<androidx.compose.runtime.MovableContentStateReference> list, androidx.compose.runtime.Recomposer recomposer, androidx.compose.runtime.ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            java.util.Iterator<androidx.compose.runtime.MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                androidx.compose.runtime.MovableContentStateReference next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.runtime.ControlledComposition performRecompose(final androidx.compose.runtime.ControlledComposition composition, final androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> modifiedValues) {
        java.util.Set<androidx.compose.runtime.ControlledComposition> set;
        if (composition.isComposing() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = takeMutableSnapshot;
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = mutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                invoke2();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> identityArraySet = modifiedValues;
                                androidx.compose.runtime.ControlledComposition controlledComposition = composition;
                                java.lang.Object[] values = identityArraySet.getValues();
                                int size = identityArraySet.size();
                                for (int i = 0; i < size; i++) {
                                    java.lang.Object obj = values[i];
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    controlledComposition.recordWriteOf(obj);
                                }
                            }
                        });
                    }
                } catch (java.lang.Throwable th) {
                    mutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            }
            boolean recompose = composition.recompose();
            mutableSnapshot.restoreCurrent(makeCurrent);
            if (recompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i;
        java.util.ArrayList emptyList;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                java.util.List flatten = kotlin.collections.CollectionsKt.flatten(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                java.util.ArrayList arrayList = new java.util.ArrayList(flatten.size());
                int size = flatten.size();
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.compose.runtime.MovableContentStateReference movableContentStateReference = (androidx.compose.runtime.MovableContentStateReference) flatten.get(i2);
                    arrayList.add(kotlin.TuplesKt.to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                emptyList = arrayList;
                this.compositionValueStatesAvailable.clear();
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
        }
        int size2 = emptyList.size();
        for (i = 0; i < size2; i++) {
            kotlin.Pair pair = (kotlin.Pair) emptyList.get(i);
            androidx.compose.runtime.MovableContentStateReference movableContentStateReference2 = (androidx.compose.runtime.MovableContentStateReference) pair.component1();
            androidx.compose.runtime.MovableContentState movableContentState = (androidx.compose.runtime.MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserverOf(final androidx.compose.runtime.ControlledComposition composition) {
        return new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke2(obj);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Object obj) {
                androidx.compose.runtime.ControlledComposition.this.recordReadOf(obj);
            }
        };
    }

    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserverOf(final androidx.compose.runtime.ControlledComposition composition, final androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> modifiedValues) {
        return new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke2(obj);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Object obj) {
                androidx.compose.runtime.ControlledComposition.this.recordWriteOf(obj);
                androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> identityArraySet = modifiedValues;
                if (identityArraySet != null) {
                    identityArraySet.add(obj);
                }
            }
        };
    }

    private final <T> T composing(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> modifiedValues, kotlin.jvm.functions.Function0<? extends T> block) {
        androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = takeMutableSnapshot;
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = mutableSnapshot.makeCurrent();
            try {
                return block.invoke();
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                mutableSnapshot.restoreCurrent(makeCurrent);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            applyAndCheck(takeMutableSnapshot);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    private final void applyAndCheck(androidx.compose.runtime.snapshots.MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof androidx.compose.runtime.snapshots.SnapshotApplyResult.Failure) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            snapshot.dispose();
        }
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    private final boolean getHasFrameWorkLocked() {
        return (this.compositionInvalidations.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return (this.compositionsAwaitingApply.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    public final java.lang.Object awaitIdle(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.collect(kotlinx.coroutines.flow.FlowKt.takeWhile(getCurrentState(), new androidx.compose.runtime.Recomposer$awaitIdle$2(null)), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void resumeCompositionFrameClock() {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuation = deriveStateLocked();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuation = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuation = deriveStateLocked();
            }
        }
        if (cancellableContinuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(androidx.compose.runtime.RecomposeScopeImpl scope) {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(scope);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            deriveStateLocked.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(androidx.compose.runtime.MovableContentStateReference reference) {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> deriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            deriveStateLocked.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(androidx.compose.runtime.MovableContentStateReference reference) {
        synchronized (this.stateLock) {
            androidx.compose.runtime.RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime_release(), reference);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(androidx.compose.runtime.MovableContentStateReference reference, androidx.compose.runtime.MovableContentState data) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
        synchronized (this.stateLock) {
            java.util.LinkedHashSet linkedHashSet = this.compositionsRemoved;
            if (linkedHashSet == null) {
                linkedHashSet = new java.util.LinkedHashSet();
                this.compositionsRemoved = linkedHashSet;
            }
            linkedHashSet.add(composition);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public androidx.compose.runtime.MovableContentState movableContentStateResolve$runtime_release(androidx.compose.runtime.MovableContentStateReference reference) {
        androidx.compose.runtime.MovableContentState remove;
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(reference);
        }
        return remove;
    }

    /* compiled from: Recomposer.kt */
    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\"J\u0014\u0010#\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010$\u001a\u00020\u0001H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0002\b(R.\u0010\u0003\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime_release", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "invalidateGroupsWithKey", com.ironsource.X3.i.W, "", "invalidateGroupsWithKey$runtime_release", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.coroutines.flow.StateFlow<java.util.Set<androidx.compose.runtime.RecomposerInfo>> getRunningRecomposers() {
            return androidx.compose.runtime.Recomposer._runningRecomposers;
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            androidx.compose.runtime.Recomposer._hotReloadEnabled.set(java.lang.Boolean.valueOf(value));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(androidx.compose.runtime.Recomposer.RecomposerInfoImpl info) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet persistentSet;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet add;
            do {
                persistentSet = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) androidx.compose.runtime.Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) info);
                if (persistentSet == add) {
                    return;
                }
            } while (!androidx.compose.runtime.Recomposer._runningRecomposers.compareAndSet(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(androidx.compose.runtime.Recomposer.RecomposerInfoImpl info) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet persistentSet;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet remove;
            do {
                persistentSet = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) androidx.compose.runtime.Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet) info);
                if (persistentSet == remove) {
                    return;
                }
            } while (!androidx.compose.runtime.Recomposer._runningRecomposers.compareAndSet(persistentSet, remove));
        }

        public final java.lang.Object saveStateAndDisposeForHotReload$runtime_release() {
            androidx.compose.runtime.Recomposer._hotReloadEnabled.set(true);
            java.lang.Iterable iterable = (java.lang.Iterable) androidx.compose.runtime.Recomposer._runningRecomposers.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.compose.runtime.Recomposer.RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(java.lang.Object token) {
            androidx.compose.runtime.Recomposer._hotReloadEnabled.set(true);
            java.util.Iterator it = ((java.lang.Iterable) androidx.compose.runtime.Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((androidx.compose.runtime.Recomposer.RecomposerInfoImpl) it.next()).resetErrorState();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            java.util.List list = (java.util.List) token;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((androidx.compose.runtime.Recomposer.HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((androidx.compose.runtime.Recomposer.HotReloadable) list.get(i2)).recompose();
            }
            java.util.Iterator it2 = ((java.lang.Iterable) androidx.compose.runtime.Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((androidx.compose.runtime.Recomposer.RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            androidx.compose.runtime.Recomposer._hotReloadEnabled.set(true);
            for (androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl : (java.lang.Iterable) androidx.compose.runtime.Recomposer._runningRecomposers.getValue()) {
                androidx.compose.runtime.RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(key);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final java.util.List<androidx.compose.runtime.RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            java.lang.Iterable iterable = (java.lang.Iterable) androidx.compose.runtime.Recomposer._runningRecomposers.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                androidx.compose.runtime.RecomposerErrorInfo currentError = ((androidx.compose.runtime.Recomposer.RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final void clearErrors$runtime_release() {
            java.lang.Iterable iterable = (java.lang.Iterable) androidx.compose.runtime.Recomposer._runningRecomposers.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                androidx.compose.runtime.Recomposer.RecomposerErrorState resetErrorState = ((androidx.compose.runtime.Recomposer.RecomposerInfoImpl) it.next()).resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> references, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> modifiedValues) {
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap = new java.util.HashMap(references.size());
        int size = references.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.MovableContentStateReference movableContentStateReference = references.get(i);
            androidx.compose.runtime.ControlledComposition composition = movableContentStateReference.getComposition();
            java.util.HashMap hashMap2 = hashMap;
            java.lang.Object obj = hashMap2.get(composition);
            if (obj == null) {
                obj = new java.util.ArrayList();
                hashMap2.put(composition, obj);
            }
            ((java.util.ArrayList) obj).add(movableContentStateReference);
        }
        java.util.HashMap hashMap3 = hashMap;
        java.util.Iterator it2 = hashMap3.entrySet().iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
            androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            androidx.compose.runtime.ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                        int size2 = list.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            androidx.compose.runtime.MovableContentStateReference movableContentStateReference2 = (androidx.compose.runtime.MovableContentStateReference) list.get(i2);
                            arrayList2.add(kotlin.TuplesKt.to(movableContentStateReference2, androidx.compose.runtime.RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                            i2++;
                            it2 = it2;
                        }
                        it = it2;
                        arrayList = arrayList2;
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    applyAndCheck(takeMutableSnapshot);
                    it2 = it;
                } finally {
                }
            } catch (java.lang.Throwable th) {
                applyAndCheck(takeMutableSnapshot);
                throw th;
            }
        }
        return kotlin.collections.CollectionsKt.toList(hashMap3.keySet());
    }
}
