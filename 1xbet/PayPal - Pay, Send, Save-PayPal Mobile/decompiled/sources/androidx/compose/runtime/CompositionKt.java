package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0012\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\u00142\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\u00072\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u0012\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0012\u0010\u001b\u001a)\u0010\u0017\u001a\u00020\u00072\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001c\"\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00078G¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\"\u0014\u0010$\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"&\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00028\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)"}, d2 = {"T", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionServiceKey;", "key", "getCompositionService", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Lkotlin/Function0;", "block", "pausable", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Composition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/ReusableComposition;", "ReusableComposition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;", "ControlledComposition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ControlledComposition;", "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/ControlledComposition;", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/tooling/ObservableComposition;", "ObservableCompositionServiceKey", "Landroidx/compose/runtime/CompositionServiceKey;", "getObservableCompositionServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "getObservableCompositionServiceKey$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionKt {
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private static final androidx.compose.runtime.CompositionServiceKey<androidx.compose.runtime.tooling.ObservableComposition> ObservableCompositionServiceKey = new androidx.compose.runtime.CompositionServiceKey<androidx.compose.runtime.tooling.ObservableComposition>() { // from class: androidx.compose.runtime.CompositionKt$ObservableCompositionServiceKey$1
    };

    public static /* synthetic */ void getObservableCompositionServiceKey$annotations() {
    }

    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(androidx.compose.runtime.ControlledComposition controlledComposition) {
    }

    public static final <T> T getCompositionService(androidx.compose.runtime.Composition composition, androidx.compose.runtime.CompositionServiceKey<T> compositionServiceKey) {
        androidx.compose.runtime.CompositionServices compositionServices = composition instanceof androidx.compose.runtime.CompositionServices ? (androidx.compose.runtime.CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    public static final <R> R pausable(androidx.compose.runtime.ControlledComposition controlledComposition, androidx.compose.runtime.ShouldPauseCallback shouldPauseCallback, kotlin.jvm.functions.Function0<? extends R> function0) {
        androidx.compose.runtime.ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
        try {
            return function0.invoke();
        } finally {
            controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
        }
    }

    public static final kotlin.coroutines.CoroutineContext getRecomposeCoroutineContext(androidx.compose.runtime.ControlledComposition controlledComposition) {
        kotlin.coroutines.CoroutineContext recomposeContext;
        androidx.compose.runtime.CompositionImpl compositionImpl = controlledComposition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    public static final androidx.compose.runtime.Composition Composition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final androidx.compose.runtime.ReusableComposition ReusableComposition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final androidx.compose.runtime.ControlledComposition ControlledComposition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final androidx.compose.runtime.Composition Composition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final androidx.compose.runtime.ControlledComposition ControlledComposition(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new androidx.compose.runtime.CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final androidx.compose.runtime.CompositionServiceKey<androidx.compose.runtime.tooling.ObservableComposition> getObservableCompositionServiceKey() {
        return ObservableCompositionServiceKey;
    }
}
