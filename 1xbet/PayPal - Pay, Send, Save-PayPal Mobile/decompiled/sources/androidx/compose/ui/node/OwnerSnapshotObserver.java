package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0006\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u000f\u0010\rJ(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u0010\u0010\rJ(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u0011\u0010\rJ(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u0012\u0010\rJ(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\rJH\u0010\u0018\u001a\u00020\u0004\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00002\u0014\b\b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "block", "observeLayoutSnapshotReads$ui", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "observeLayoutSnapshotReadsAffectingLookahead$ui", "observeLayoutModifierSnapshotReads$ui", "observeLayoutModifierSnapshotReadsAffectingLookahead$ui", "observeMeasureSnapshotReads$ui", "observeMeasureSnapshotReadsAffectingLookahead$ui", "observeSemanticsReads$ui", "Landroidx/compose/ui/node/OwnerScope;", "T", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "onChanged", "observeReads$ui", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "clearInvalidObservations$ui", "()V", "clear$ui", "(Ljava/lang/Object;)V", "startObserving$ui", "stopObserving$ui", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRanges", "getInputFormats", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = androidx.compose.runtime.snapshots.SnapshotStateObserver.$stable;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateObserver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            getHighResolutionOutputSizeshNQ4ISI(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, false, false, false, 7, null);
            }
        }
    };

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            Camera2StreamConfigurationMap(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(layoutNode, false, false, false, 7, null);
            }
        }
    };

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            getHighSpeedVideoSizes(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                layoutNode.invalidateSemantics$ui();
            }
        }
    };

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            getHighSpeedVideoFpsRanges(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
            }
        }
    };

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> getInputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            getHighSpeedVideoFpsRangesFor(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
            }
        }
    };

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> getOutputFormats = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            getHighResolutionOutputSizeshNQ4ISI(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
            }
        }
    };

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit> getHighSpeedVideoSizesFor = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
            Camera2StreamConfigurationMap(layoutNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
            }
        }
    };

    public OwnerSnapshotObserver(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.snapshots.SnapshotStateObserver(function1);
    }

    public final void observeLayoutSnapshotReads$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final void observeLayoutSnapshotReadsAffectingLookahead$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.getHighSpeedVideoSizesFor;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final void observeLayoutModifierSnapshotReads$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.getInputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final void observeLayoutModifierSnapshotReadsAffectingLookahead$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.getOutputFormats;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final void observeMeasureSnapshotReads$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final void observeMeasureSnapshotReadsAffectingLookahead$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final void observeSemanticsReads$ui(androidx.compose.ui.node.LayoutNode node, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.functions.Function1 function1 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(node, function1, block);
    }

    public final <T extends androidx.compose.ui.node.OwnerScope> void observeReads$ui(T target, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onChanged, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(target, onChanged, block);
    }

    public final void clearInvalidObservations$ui() {
        this.getHighResolutionOutputSizeshNQ4ISI.clearIf(new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.lang.Object obj) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                return java.lang.Boolean.valueOf(!((androidx.compose.ui.node.OwnerScope) obj).isValidOwnerScope());
            }
        });
    }

    public final void clear$ui(java.lang.Object target) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear(target);
    }

    public final void startObserving$ui() {
        this.getHighResolutionOutputSizeshNQ4ISI.start();
    }

    public final void stopObserving$ui() {
        this.getHighResolutionOutputSizeshNQ4ISI.stop();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }
}
