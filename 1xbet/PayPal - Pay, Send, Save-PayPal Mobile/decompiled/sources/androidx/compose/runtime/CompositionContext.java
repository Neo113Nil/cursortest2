package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH ¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH ¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH ¢\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0010¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0010¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010(\u001a\u00020'H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0010¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0007H\u0010¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H ¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H ¢\u0006\u0004\b0\u0010/J+\u00105\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u00102\u001a\u0002012\n\u00104\u001a\u0006\u0012\u0002\b\u000303H ¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u0001012\u0006\u0010-\u001a\u00020,H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b9\u0010\u0019J\u001d\u0010<\u001a\u00020;2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b<\u0010=R\u0018\u0010B\u001a\u00060>j\u0002`?8!X \u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8!X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020C8!X \u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0014\u0010J\u001a\u00020C8!X \u0004¢\u0006\u0006\u001a\u0004\bI\u0010ER\u0014\u0010L\u001a\u00020C8!X \u0004¢\u0006\u0006\u001a\u0004\bK\u0010ER\u0016\u0010P\u001a\u0004\u0018\u00010M8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8'X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020Q8!X \u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0016\u0010\u0005\u001a\u0004\u0018\u00010W8!X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "<init>", "()V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "invalidScopes", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidate$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidateScope$runtime", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "unregisterComposer$runtime", "registerComposition$runtime", "unregisterComposition$runtime", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "startComposing$runtime", "doneComposing$runtime", "Landroidx/compose/runtime/MovableContentStateReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "deletedMovableContent$runtime", "Landroidx/compose/runtime/MovableContentState;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "reportRemovedComposition$runtime", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "()J", "compositeKeyHashCode", "", "getCollectingParameterInformation$runtime", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getStackTraceEnabled$runtime", "stackTraceEnabled", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime", "recomposeCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime(androidx.compose.runtime.ControlledComposition composition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content);

    public abstract androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> composeInitialPaused$runtime(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.ShouldPauseCallback shouldPause, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content);

    public abstract void deletedMovableContent$runtime(androidx.compose.runtime.MovableContentStateReference reference);

    public void doneComposing$runtime() {
    }

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract androidx.compose.runtime.Composition getComposition$runtime();

    public abstract kotlin.coroutines.CoroutineContext getEffectCoroutineContext();

    public androidx.compose.runtime.CompositionObserverHolder getObserverHolder$runtime() {
        return null;
    }

    public abstract kotlin.coroutines.CoroutineContext getRecomposeCoroutineContext$runtime();

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void insertMovableContent$runtime(androidx.compose.runtime.MovableContentStateReference reference);

    public abstract void invalidate$runtime(androidx.compose.runtime.ControlledComposition composition);

    public abstract void invalidateScope$runtime(androidx.compose.runtime.RecomposeScopeImpl scope);

    public abstract void movableContentStateReleased$runtime(androidx.compose.runtime.MovableContentStateReference reference, androidx.compose.runtime.MovableContentState data, androidx.compose.runtime.Applier<?> applier);

    public androidx.compose.runtime.MovableContentState movableContentStateResolve$runtime(androidx.compose.runtime.MovableContentStateReference reference) {
        return null;
    }

    public abstract androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> recomposePaused$runtime(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.ShouldPauseCallback shouldPause, androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> invalidScopes);

    public void recordInspectionTable$runtime(java.util.Set<androidx.compose.runtime.tooling.CompositionData> table) {
    }

    public void registerComposer$runtime(androidx.compose.runtime.Composer composer) {
    }

    public abstract void registerComposition$runtime(androidx.compose.runtime.ControlledComposition composition);

    public abstract void reportPausedScope$runtime(androidx.compose.runtime.RecomposeScopeImpl scope);

    public abstract void reportRemovedComposition$runtime(androidx.compose.runtime.ControlledComposition composition);

    public abstract androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action);

    public void startComposing$runtime() {
    }

    public void unregisterComposer$runtime(androidx.compose.runtime.Composer composer) {
    }

    public abstract void unregisterComposition$runtime(androidx.compose.runtime.ControlledComposition composition);

    public androidx.compose.runtime.PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap;
        persistentCompositionLocalMap = androidx.compose.runtime.CompositionContextKt.getHighSpeedVideoSizes;
        return persistentCompositionLocalMap;
    }
}
