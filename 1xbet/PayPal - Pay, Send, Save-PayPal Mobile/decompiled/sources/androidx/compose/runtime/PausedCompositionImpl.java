package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R%\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103R\u001e\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R&\u0010<\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010 \u001a\u00020=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010BR\u001a\u0010D\u001a\u00020C8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130H8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u00100R\u0014\u0010O\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u00100R\u0014\u0010P\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u00100R\u0014\u0010Q\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u00100"}, d2 = {"Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedComposition;", "Landroidx/compose/runtime/CompositionImpl;", "composition", "Landroidx/compose/runtime/CompositionContext;", "context", "Landroidx/compose/runtime/ComposerImpl;", "composer", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "", "reusable", "Landroidx/compose/runtime/Applier;", "applier", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "<init>", "(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/ComposerImpl;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Applier;Ljava/lang/Object;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "resume", "(Landroidx/compose/runtime/ShouldPauseCallback;)Z", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "markIncomplete$runtime", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/CompositionContext;", "getContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/ComposerImpl;", "getComposer", "()Landroidx/compose/runtime/ComposerImpl;", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Z", "getReusable", "()Z", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/PausedCompositionState;", "Landroidx/compose/runtime/internal/getHighSpeedVideoSizes;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes", "", "getHighResolutionOutputSizeshNQ4ISI", "J", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "getRememberManager$runtime", "()Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RecordingApplier;", "pausableApplier", "Landroidx/compose/runtime/RecordingApplier;", "getPausableApplier$runtime", "()Landroidx/compose/runtime/RecordingApplier;", "isRecomposing$runtime", "isRecomposing", "isComplete", "isApplied", "isCancelled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PausedCompositionImpl implements androidx.compose.runtime.PausedComposition {
    public static final int $stable = 8;
    private final androidx.compose.runtime.Applier<?> applier;
    private final androidx.compose.runtime.ComposerImpl composer;
    private final androidx.compose.runtime.CompositionImpl composition;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final androidx.compose.runtime.CompositionContext context;
    private final java.lang.Object lock;
    private final androidx.compose.runtime.RecordingApplier<java.lang.Object> pausableApplier;
    private final androidx.compose.runtime.internal.RememberEventDispatcher rememberManager;
    private final boolean reusable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.PausedCompositionState> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(androidx.compose.runtime.PausedCompositionState.InitialPending);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> Camera2StreamConfigurationMap = androidx.collection.ScatterSetKt.emptyScatterSet();

    /* JADX WARN: Multi-variable type inference failed */
    public PausedCompositionImpl(androidx.compose.runtime.CompositionImpl compositionImpl, androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.ComposerImpl composerImpl, java.util.Set<androidx.compose.runtime.RememberObserver> set, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z, androidx.compose.runtime.Applier<?> applier, java.lang.Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = composerImpl;
        this.content = function2;
        this.reusable = z;
        this.applier = applier;
        this.lock = obj;
        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = new androidx.compose.runtime.internal.RememberEventDispatcher();
        rememberEventDispatcher.prepare(set, composerImpl.getErrorContext$runtime());
        this.rememberManager = rememberEventDispatcher;
        this.pausableApplier = new androidx.compose.runtime.RecordingApplier<>(applier.getCurrent());
    }

    public final androidx.compose.runtime.CompositionImpl getComposition() {
        return this.composition;
    }

    public final androidx.compose.runtime.CompositionContext getContext() {
        return this.context;
    }

    public final androidx.compose.runtime.ComposerImpl getComposer() {
        return this.composer;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    public final androidx.compose.runtime.Applier<?> getApplier() {
        return this.applier;
    }

    public final java.lang.Object getLock() {
        return this.lock;
    }

    /* renamed from: getRememberManager$runtime, reason: from getter */
    public final androidx.compose.runtime.internal.RememberEventDispatcher getRememberManager() {
        return this.rememberManager;
    }

    public final androidx.compose.runtime.RecordingApplier<java.lang.Object> getPausableApplier$runtime() {
        return this.pausableApplier;
    }

    public final boolean isRecomposing$runtime() {
        return this.getHighSpeedVideoSizes.get() == androidx.compose.runtime.PausedCompositionState.Recomposing && this.getHighSpeedVideoFpsRanges == androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId();
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean isComplete() {
        return this.getHighSpeedVideoSizes.get().compareTo(androidx.compose.runtime.PausedCompositionState.ApplyPending) >= 0;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean isApplied() {
        return this.getHighSpeedVideoSizes.get() == androidx.compose.runtime.PausedCompositionState.Applied;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean isCancelled() {
        return this.getHighSpeedVideoSizes.get() == androidx.compose.runtime.PausedCompositionState.Cancelled;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean resume(androidx.compose.runtime.ShouldPauseCallback shouldPause) {
        try {
            switch (androidx.compose.runtime.PausedCompositionImpl.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.get().ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot();
                    }
                    try {
                        this.Camera2StreamConfigurationMap = this.context.composeInitialPaused$runtime(this.composition, shouldPause, this.content);
                        androidx.compose.runtime.PausedCompositionState pausedCompositionState = androidx.compose.runtime.PausedCompositionState.InitialPending;
                        androidx.compose.runtime.PausedCompositionState pausedCompositionState2 = androidx.compose.runtime.PausedCompositionState.RecomposePending;
                        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, pausedCompositionState, pausedCompositionState2)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected state change from: ");
                            sb.append(pausedCompositionState);
                            sb.append(" to: ");
                            sb.append(pausedCompositionState2);
                            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
                        }
                        if (this.Camera2StreamConfigurationMap.isEmpty()) {
                            getHighSpeedVideoFpsRanges();
                        }
                        return isComplete();
                    } finally {
                        if (this.reusable) {
                            this.composer.endReuseFromRoot();
                        }
                    }
                case 2:
                    androidx.compose.runtime.PausedCompositionState pausedCompositionState3 = androidx.compose.runtime.PausedCompositionState.RecomposePending;
                    androidx.compose.runtime.PausedCompositionState pausedCompositionState4 = androidx.compose.runtime.PausedCompositionState.Recomposing;
                    if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, pausedCompositionState3, pausedCompositionState4)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected state change from: ");
                        sb2.append(pausedCompositionState3);
                        sb2.append(" to: ");
                        sb2.append(pausedCompositionState4);
                        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb2.toString());
                    }
                    long j = this.getHighSpeedVideoFpsRanges;
                    try {
                        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId();
                        this.Camera2StreamConfigurationMap = this.context.recomposePaused$runtime(this.composition, shouldPause, this.Camera2StreamConfigurationMap);
                        if (this.Camera2StreamConfigurationMap.isEmpty()) {
                            getHighSpeedVideoFpsRanges();
                        }
                        return isComplete();
                    } finally {
                        this.getHighSpeedVideoFpsRanges = j;
                        androidx.compose.runtime.PausedCompositionState pausedCompositionState5 = androidx.compose.runtime.PausedCompositionState.Recomposing;
                        androidx.compose.runtime.PausedCompositionState pausedCompositionState6 = androidx.compose.runtime.PausedCompositionState.RecomposePending;
                        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, pausedCompositionState5, pausedCompositionState6)) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unexpected state change from: ");
                            sb3.append(pausedCompositionState5);
                            sb3.append(" to: ");
                            sb3.append(pausedCompositionState6);
                            sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb3.toString());
                        }
                    }
                case 3:
                    androidx.compose.runtime.ComposerKt.composeRuntimeError("Recursive call to resume()");
                    throw new kotlin.KotlinNothingValueException();
                case 4:
                    throw new java.lang.IllegalStateException("Pausable composition is complete and apply() should be applied".toString());
                case 5:
                    throw new java.lang.IllegalStateException("The paused composition has been applied".toString());
                case 6:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled".toString());
                case 7:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception".toString());
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        } catch (java.lang.Exception e) {
            this.getHighSpeedVideoSizes.set(androidx.compose.runtime.PausedCompositionState.Invalid);
            throw e;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final void apply() {
        try {
            switch (androidx.compose.runtime.PausedCompositionImpl.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new java.lang.IllegalStateException("The paused composition has not completed yet".toString());
                case 4:
                    getHighSpeedVideoFpsRangesFor();
                    androidx.compose.runtime.PausedCompositionState pausedCompositionState = androidx.compose.runtime.PausedCompositionState.ApplyPending;
                    androidx.compose.runtime.PausedCompositionState pausedCompositionState2 = androidx.compose.runtime.PausedCompositionState.Applied;
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, pausedCompositionState, pausedCompositionState2)) {
                        return;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected state change from: ");
                    sb.append(pausedCompositionState);
                    sb.append(" to: ");
                    sb.append(pausedCompositionState2);
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
                    return;
                case 5:
                    throw new java.lang.IllegalStateException("The paused composition has already been applied".toString());
                case 6:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled".toString());
                case 7:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception".toString());
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        } catch (java.lang.Exception e) {
            this.getHighSpeedVideoSizes.set(androidx.compose.runtime.PausedCompositionState.Invalid);
            throw e;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final void cancel() {
        this.getHighSpeedVideoSizes.set(androidx.compose.runtime.PausedCompositionState.Cancelled);
        androidx.collection.ScatterSet<androidx.compose.runtime.RememberObserverHolder> extractRememberSet = this.rememberManager.extractRememberSet();
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime(extractRememberSet);
    }

    public final void markIncomplete$runtime() {
        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, androidx.compose.runtime.PausedCompositionState.ApplyPending, androidx.compose.runtime.PausedCompositionState.RecomposePending);
    }

    private final void getHighSpeedVideoFpsRanges() {
        androidx.compose.runtime.PausedCompositionState pausedCompositionState = androidx.compose.runtime.PausedCompositionState.RecomposePending;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState2 = androidx.compose.runtime.PausedCompositionState.ApplyPending;
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, pausedCompositionState, pausedCompositionState2)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected state change from: ");
        sb.append(pausedCompositionState);
        sb.append(" to: ");
        sb.append(pausedCompositionState2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.lock) {
                try {
                    androidx.compose.runtime.RecordingApplier<java.lang.Object> recordingApplier = this.pausableApplier;
                    androidx.compose.runtime.Applier<?> applier = this.applier;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
                    recordingApplier.playTo(applier, this.rememberManager);
                    this.rememberManager.dispatchRememberObservers();
                    this.rememberManager.dispatchSideEffects();
                    this.rememberManager.dispatchAbandons();
                    this.composition.pausedCompositionFinished$runtime(null);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    this.rememberManager.dispatchAbandons();
                    this.composition.pausedCompositionFinished$runtime(null);
                    throw th;
                }
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        } finally {
            androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.runtime.PausedCompositionState.values().length];
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.Applied.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.runtime.PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
