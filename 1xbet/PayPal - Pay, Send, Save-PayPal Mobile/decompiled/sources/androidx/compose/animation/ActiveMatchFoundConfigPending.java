package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010\u00068W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u001d"}, d2 = {"Landroidx/compose/animation/ActiveMatchFoundConfigPending;", "Landroidx/compose/animation/SharedTransitionStateMachine$State;", "Landroidx/compose/animation/BoundsProvider;", "targetBoundsProviderBeforeConfig", "Landroidx/compose/animation/TargetData;", "targetData", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "<init>", "(Landroidx/compose/animation/BoundsProvider;Landroidx/compose/animation/TargetData;Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/animation/SharedElement;", "sharedElement", "initializeCurrentBounds", "(Landroidx/compose/animation/SharedElement;)Landroidx/compose/ui/geometry/Rect;", "targetBoundsProvider", "Landroidx/compose/ui/geometry/Size;", "lookaheadSize", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "structuralOffset", "configureActiveMatch-38uP1EE", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsProvider;JJJ)Landroidx/compose/animation/SharedTransitionStateMachine$State;", "configureActiveMatch", "previousTargetBoundsProvider", "onMatchFound", "(Landroidx/compose/animation/BoundsProvider;)Landroidx/compose/animation/SharedTransitionStateMachine$State;", "bounds", "", "updateBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "onVisibleContentRemovedDuringTransition", "()Landroidx/compose/animation/SharedTransitionStateMachine$State;", "Landroidx/compose/animation/BoundsProvider;", "getTargetBoundsProviderBeforeConfig", "()Landroidx/compose/animation/BoundsProvider;", "setTargetBoundsProviderBeforeConfig", "(Landroidx/compose/animation/BoundsProvider;)V", "Landroidx/compose/animation/TargetData;", "getTargetData", "()Landroidx/compose/animation/TargetData;", "", "getActiveMatchFound", "()Z", "activeMatchFound", "<set-?>", "currentBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentBounds", "()Landroidx/compose/ui/geometry/Rect;", "setCurrentBounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActiveMatchFoundConfigPending extends androidx.compose.animation.SharedTransitionStateMachine.State {
    public static final int $stable = 8;

    /* renamed from: currentBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentBounds;
    private androidx.compose.animation.BoundsProvider targetBoundsProviderBeforeConfig;
    private final androidx.compose.animation.TargetData targetData;

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final boolean getActiveMatchFound() {
        return true;
    }

    public ActiveMatchFoundConfigPending(androidx.compose.animation.BoundsProvider boundsProvider, androidx.compose.animation.TargetData targetData, androidx.compose.ui.geometry.Rect rect) {
        super(null);
        this.targetBoundsProviderBeforeConfig = boundsProvider;
        this.targetData = targetData;
        this.currentBounds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    public /* synthetic */ ActiveMatchFoundConfigPending(androidx.compose.animation.BoundsProvider boundsProvider, androidx.compose.animation.TargetData targetData, androidx.compose.ui.geometry.Rect rect, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(boundsProvider, (i & 2) != 0 ? null : targetData, (i & 4) != 0 ? null : rect);
    }

    public final androidx.compose.animation.BoundsProvider getTargetBoundsProviderBeforeConfig() {
        return this.targetBoundsProviderBeforeConfig;
    }

    public final void setTargetBoundsProviderBeforeConfig(androidx.compose.animation.BoundsProvider boundsProvider) {
        this.targetBoundsProviderBeforeConfig = boundsProvider;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.TargetData getTargetData() {
        return this.targetData;
    }

    private void setCurrentBounds(androidx.compose.ui.geometry.Rect rect) {
        this.currentBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.ui.geometry.Rect getCurrentBounds() {
        return (androidx.compose.ui.geometry.Rect) this.currentBounds.getValue();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.ui.geometry.Rect initializeCurrentBounds(androidx.compose.animation.SharedElement sharedElement) {
        androidx.compose.animation.SharedElementEntry sharedElementEntry;
        androidx.compose.ui.geometry.Rect currentBounds = getCurrentBounds();
        if (currentBounds != null) {
            return currentBounds;
        }
        if (getCurrentBounds() == null) {
            androidx.compose.animation.BoundsProvider boundsProvider = this.targetBoundsProviderBeforeConfig;
            if (boundsProvider == null) {
                java.util.List<androidx.compose.animation.SharedElementEntry> allEntries = sharedElement.getAllEntries();
                int size = allEntries.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = allEntries.get(i);
                    if (sharedElement.getEnabledEntries().contains(sharedElementEntry)) {
                        break;
                    }
                    i++;
                }
                androidx.compose.animation.SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                boundsProvider = sharedElementEntry2 != null ? sharedElementEntry2.getBoundsProvider() : null;
            }
            androidx.compose.ui.geometry.Rect access$obtainBoundsFromLastTarget = androidx.compose.animation.SharedTransitionStateMachineKt.access$obtainBoundsFromLastTarget(sharedElement, boundsProvider);
            if (access$obtainBoundsFromLastTarget != null) {
                setCurrentBounds(access$obtainBoundsFromLastTarget);
            }
        }
        return getCurrentBounds();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.animation.SharedTransitionStateMachine.State mo1094configureActiveMatch38uP1EE(androidx.compose.animation.SharedElement sharedElement, androidx.compose.animation.BoundsProvider targetBoundsProvider, long lookaheadSize, long topLeft, long structuralOffset) {
        androidx.compose.animation.SharedElement sharedElement2;
        androidx.compose.animation.SharedElementEntry sharedElementEntry;
        androidx.compose.animation.TargetData targetData = getTargetData();
        if (targetData == null) {
            targetData = new androidx.compose.animation.TargetData(lookaheadSize, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(topLeft, structuralOffset), structuralOffset, null);
        }
        androidx.compose.ui.geometry.Rect currentBounds = getCurrentBounds();
        if (currentBounds == null) {
            androidx.compose.animation.BoundsProvider boundsProvider = this.targetBoundsProviderBeforeConfig;
            if (boundsProvider == null) {
                java.util.List<androidx.compose.animation.SharedElementEntry> allEntries = sharedElement.getAllEntries();
                int size = allEntries.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = allEntries.get(i);
                    if (sharedElement.getEnabledEntries().contains(sharedElementEntry)) {
                        break;
                    }
                    i++;
                }
                androidx.compose.animation.SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                if (sharedElementEntry2 == null) {
                    sharedElement2 = sharedElement;
                    boundsProvider = null;
                    currentBounds = androidx.compose.animation.SharedTransitionStateMachineKt.access$obtainBoundsFromLastTarget(sharedElement2, boundsProvider);
                    if (currentBounds == null) {
                        currentBounds = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(topLeft, lookaheadSize);
                    }
                } else {
                    boundsProvider = sharedElementEntry2.getBoundsProvider();
                }
            }
            sharedElement2 = sharedElement;
            currentBounds = androidx.compose.animation.SharedTransitionStateMachineKt.access$obtainBoundsFromLastTarget(sharedElement2, boundsProvider);
            if (currentBounds == null) {
            }
        }
        androidx.compose.animation.SharedTransitionStateMachineKt.m1147access$updateTargetDataBGTQxF0(targetData, lookaheadSize, topLeft, structuralOffset, true);
        return new androidx.compose.animation.ActiveMatchConfigured(targetData, targetBoundsProvider, currentBounds);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onMatchFound(androidx.compose.animation.BoundsProvider previousTargetBoundsProvider) {
        if (this.targetBoundsProviderBeforeConfig == null) {
            this.targetBoundsProviderBeforeConfig = previousTargetBoundsProvider;
        }
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final void updateBounds(androidx.compose.ui.geometry.Rect bounds) {
        setCurrentBounds(bounds);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return androidx.compose.animation.NoMatchFound.INSTANCE;
    }
}
