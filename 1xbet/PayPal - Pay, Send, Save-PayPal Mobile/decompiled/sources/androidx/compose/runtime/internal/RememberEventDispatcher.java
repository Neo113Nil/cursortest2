package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u000f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001b¢\u0006\u0004\b&\u0010\u001dJ\u001b\u0010)\u001a\u00020\t2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001a\u00020\t¢\u0006\u0004\b.\u0010\u0003R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0012098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010CR$\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001205\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010F"}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "<init>", "()V", "", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "traceContext", "", "prepare", "(Ljava/util/Set;Landroidx/compose/runtime/tooling/CompositionErrorContext;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "use", "(Ljava/util/Set;Landroidx/compose/runtime/tooling/CompositionErrorContext;Lkotlin/jvm/functions/Function1;)V", "clear", "Landroidx/compose/runtime/RememberObserverHolder;", "instance", "remembering", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;)V", "releasing", "Landroidx/compose/runtime/RecomposeScopeImpl;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "dispatchRememberObservers", "dispatchOnDeactivateIfNecessary", "Landroidx/collection/ScatterSet;", "ignoreSet", "ignoreForgotten", "(Landroidx/collection/ScatterSet;)V", "extractRememberSet", "()Landroidx/collection/ScatterSet;", "dispatchSideEffects", "dispatchAbandons", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "getHighSpeedVideoSizes", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/collection/MutableVector;", "getInputFormats", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoSizesFor", "Landroidx/collection/MutableScatterSet;", "getHighResolutionOutputSizeshNQ4ISI", "", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "getOutputFormats", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "Landroidx/collection/ScatterSet;", "getOutputSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RememberEventDispatcher implements androidx.compose.runtime.RememberManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.ScatterSet<androidx.compose.runtime.RememberObserverHolder> getOutputSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.ArrayList<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder>> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.Set<androidx.compose.runtime.RememberObserver> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<java.lang.Object> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.collection.MutableScatterSet<androidx.compose.runtime.RememberObserverHolder> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.collection.MutableScatterMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.internal.PausedCompositionRemembers> getInputFormats;
    private androidx.collection.MutableScatterSet<androidx.compose.runtime.ComposeNodeLifecycleCallback> getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.compose.runtime.tooling.CompositionErrorContext Camera2StreamConfigurationMap;

    public RememberEventDispatcher() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.runtime.RememberObserverHolder[16], 0);
        this.getHighSpeedVideoFpsRanges = mutableVector;
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterSetKt.mutableScatterSetOf();
        this.getHighResolutionOutputSizeshNQ4ISI = mutableVector;
        this.getInputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new java.lang.Object[16], 0);
        this.getHighSpeedVideoSizesFor = new androidx.compose.runtime.collection.MutableVector<>(new kotlin.jvm.functions.Function0[16], 0);
    }

    public final void prepare(java.util.Set<androidx.compose.runtime.RememberObserver> abandoning, androidx.compose.runtime.tooling.CompositionErrorContext traceContext) {
        clear();
        this.getHighSpeedVideoSizes = abandoning;
        this.Camera2StreamConfigurationMap = traceContext;
    }

    public final void use(java.util.Set<androidx.compose.runtime.RememberObserver> abandoning, androidx.compose.runtime.tooling.CompositionErrorContext traceContext, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.internal.RememberEventDispatcher, kotlin.Unit> block) {
        try {
            prepare(abandoning, traceContext);
            block.invoke(this);
        } finally {
            clear();
        }
    }

    public final void clear() {
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
        this.getInputSizeshNQ4ISI.clear();
        this.getHighSpeedVideoSizesFor.clear();
        this.getOutputFormats = null;
        this.getInputFormats = null;
        this.getOutputMinFrameDuration = null;
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void remembering(androidx.compose.runtime.RememberObserverHolder instance) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(instance);
        this.getHighSpeedVideoFpsRangesFor.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void forgetting(androidx.compose.runtime.RememberObserverHolder instance) {
        if (this.getHighSpeedVideoFpsRangesFor.contains(instance)) {
            this.getHighSpeedVideoFpsRangesFor.remove(instance);
            if (!this.getHighResolutionOutputSizeshNQ4ISI.remove(instance) && !this.getHighSpeedVideoFpsRanges.remove(instance)) {
                getHighSpeedVideoFpsRanges(instance, this.getHighSpeedVideoFpsRanges);
            }
            java.util.Set<androidx.compose.runtime.RememberObserver> set = this.getHighSpeedVideoSizes;
            if (set != null) {
                set.add(instance.getWrapped());
                return;
            }
            return;
        }
        androidx.collection.ScatterSet<androidx.compose.runtime.RememberObserverHolder> scatterSet = this.getOutputSizes;
        if (scatterSet == null || !scatterSet.contains(instance)) {
            this.getInputSizeshNQ4ISI.add(instance);
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        this.getHighSpeedVideoSizesFor.add(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void releasing(androidx.compose.runtime.ComposeNodeLifecycleCallback instance) {
        androidx.collection.MutableScatterSet<androidx.compose.runtime.ComposeNodeLifecycleCallback> mutableScatterSet = this.getOutputFormats;
        if (mutableScatterSet == null) {
            mutableScatterSet = androidx.collection.ScatterSetKt.mutableScatterSetOf();
            this.getOutputFormats = mutableScatterSet;
        }
        mutableScatterSet.plusAssign((androidx.collection.MutableScatterSet<androidx.compose.runtime.ComposeNodeLifecycleCallback>) instance);
        this.getInputSizeshNQ4ISI.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void rememberPausingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        java.util.Set<androidx.compose.runtime.RememberObserver> set = this.getHighSpeedVideoSizes;
        if (set == null) {
            return;
        }
        androidx.compose.runtime.internal.PausedCompositionRemembers pausedCompositionRemembers = new androidx.compose.runtime.internal.PausedCompositionRemembers(set);
        androidx.collection.MutableScatterMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.internal.PausedCompositionRemembers> mutableScatterMap = this.getInputFormats;
        if (mutableScatterMap == null) {
            mutableScatterMap = androidx.collection.ScatterMapKt.mutableScatterMapOf();
            this.getInputFormats = mutableScatterMap;
        }
        mutableScatterMap.set(scope, pausedCompositionRemembers);
        this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.compose.runtime.RememberObserverHolder(pausedCompositionRemembers, -1));
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void startResumingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        androidx.collection.MutableScatterMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.internal.PausedCompositionRemembers> mutableScatterMap = this.getInputFormats;
        androidx.compose.runtime.internal.PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(scope) : null;
        if (pausedCompositionRemembers != null) {
            java.util.ArrayList<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder>> arrayList = this.getOutputMinFrameDuration;
            if (arrayList == null) {
                arrayList = androidx.compose.runtime.Stack.m5282constructorimpl$default(null, 1, null);
                this.getOutputMinFrameDuration = arrayList;
            }
            androidx.compose.runtime.Stack.m5292pushimpl(arrayList, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = pausedCompositionRemembers.getPausedRemembers();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void endResumingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> mutableVector;
        androidx.collection.MutableScatterMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.internal.PausedCompositionRemembers> mutableScatterMap = this.getInputFormats;
        if (mutableScatterMap == null || mutableScatterMap.get(scope) == null) {
            return;
        }
        java.util.ArrayList<androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder>> arrayList = this.getOutputMinFrameDuration;
        if (arrayList != null && (mutableVector = (androidx.compose.runtime.collection.MutableVector) androidx.compose.runtime.Stack.m5291popimpl(arrayList)) != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = mutableVector;
        }
        mutableScatterMap.remove(scope);
    }

    public final void dispatchRememberObservers() {
        java.lang.Object beginSection;
        java.util.Set<androidx.compose.runtime.RememberObserver> set = this.getHighSpeedVideoSizes;
        if (set == null) {
            return;
        }
        this.getOutputSizes = null;
        if (this.getInputSizeshNQ4ISI.getSize() != 0) {
            beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                androidx.collection.ScatterSet scatterSet = this.getOutputFormats;
                for (int size = this.getInputSizeshNQ4ISI.getSize() - 1; size >= 0; size--) {
                    java.lang.Object obj = this.getInputSizeshNQ4ISI.content[size];
                    if (obj instanceof androidx.compose.runtime.RememberObserverHolder) {
                        try {
                            androidx.compose.runtime.RememberObserver wrapped = ((androidx.compose.runtime.RememberObserverHolder) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        } catch (java.lang.Throwable th) {
                            androidx.compose.runtime.tooling.CompositionErrorContext compositionErrorContext = this.Camera2StreamConfigurationMap;
                            if (compositionErrorContext != null) {
                                compositionErrorContext.attachComposeStackTrace(th, obj);
                            }
                            throw th;
                        }
                    }
                    if (obj instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
                        if (scatterSet != null && scatterSet.contains(obj)) {
                            ((androidx.compose.runtime.ComposeNodeLifecycleCallback) obj).onRelease();
                        } else {
                            ((androidx.compose.runtime.ComposeNodeLifecycleCallback) obj).onDeactivate();
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
            }
        }
        if (this.getHighSpeedVideoFpsRanges.getSize() != 0) {
            beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> mutableVector = this.getHighSpeedVideoFpsRanges;
                java.util.Set<androidx.compose.runtime.RememberObserver> set2 = this.getHighSpeedVideoSizes;
                if (set2 != null) {
                    androidx.compose.runtime.RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
                    int size2 = mutableVector.getSize();
                    for (int i = 0; i < size2; i++) {
                        androidx.compose.runtime.RememberObserverHolder rememberObserverHolder = rememberObserverHolderArr[i];
                        androidx.compose.runtime.RememberObserver wrapped2 = rememberObserverHolder.getWrapped();
                        set2.remove(wrapped2);
                        try {
                            wrapped2.onRemembered();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th2) {
                            androidx.compose.runtime.tooling.CompositionErrorContext compositionErrorContext2 = this.Camera2StreamConfigurationMap;
                            if (compositionErrorContext2 != null) {
                                compositionErrorContext2.attachComposeStackTrace(th2, rememberObserverHolder);
                            }
                            throw th2;
                        }
                    }
                }
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            } finally {
            }
        }
    }

    public final void dispatchOnDeactivateIfNecessary(androidx.compose.runtime.ComposeNodeLifecycleCallback instance) {
        if (this.getInputSizeshNQ4ISI.remove(instance)) {
            instance.onDeactivate();
        }
    }

    public final void ignoreForgotten(androidx.collection.ScatterSet<androidx.compose.runtime.RememberObserverHolder> ignoreSet) {
        this.getOutputSizes = ignoreSet;
    }

    public final androidx.collection.ScatterSet<androidx.compose.runtime.RememberObserverHolder> extractRememberSet() {
        if (!this.getHighSpeedVideoFpsRangesFor.isNotEmpty()) {
            return null;
        }
        androidx.collection.MutableScatterSet<androidx.compose.runtime.RememberObserverHolder> mutableScatterSet = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterSetKt.mutableScatterSetOf();
        this.getHighSpeedVideoFpsRanges.clear();
        return mutableScatterSet;
    }

    public final void dispatchSideEffects() {
        if (this.getHighSpeedVideoSizesFor.getSize() != 0) {
            java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableVector = this.getHighSpeedVideoSizesFor;
                kotlin.jvm.functions.Function0<kotlin.Unit>[] function0Arr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    function0Arr[i].invoke();
                }
                this.getHighSpeedVideoSizesFor.clear();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
            }
        }
    }

    public final void dispatchAbandons() {
        java.util.Set<androidx.compose.runtime.RememberObserver> set = this.getHighSpeedVideoSizes;
        if (set == null || set.isEmpty()) {
            return;
        }
        java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            java.util.Iterator<androidx.compose.runtime.RememberObserver> it = set.iterator();
            while (it.hasNext()) {
                androidx.compose.runtime.RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
        }
    }

    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.runtime.RememberObserverHolder rememberObserverHolder, androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> mutableVector) {
        androidx.compose.runtime.RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            if (wrapped instanceof androidx.compose.runtime.internal.PausedCompositionRemembers) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> pausedRemembers = ((androidx.compose.runtime.internal.PausedCompositionRemembers) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || getHighSpeedVideoFpsRanges(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void deactivating(androidx.compose.runtime.ComposeNodeLifecycleCallback instance) {
        this.getInputSizeshNQ4ISI.add(instance);
    }
}
