package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u000f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0017\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "applyTo", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "", "isDirty", "(Ljava/util/List;)Z", "onAbandoned", "()V", "onForgotten", "onRemembered", "Landroid/os/Handler;", "Camera2StreamConfigurationMap", "Landroid/os/Handler;", "getHighSpeedVideoFpsRangesFor", "knownDirty", "Z", "getKnownDirty", "()Z", "setKnownDirty", "(Z)V", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Lkotlin/Function1;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "getScope", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintSetForInlineDsl implements androidx.constraintlayout.compose.ConstraintSet, androidx.compose.runtime.RememberObserver {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.os.Handler getHighSpeedVideoFpsRangesFor;
    private final androidx.constraintlayout.compose.ConstraintLayoutScope scope;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateObserver Camera2StreamConfigurationMap = new androidx.compose.runtime.snapshots.SnapshotStateObserver(new androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1(this));
    private boolean knownDirty = true;
    private final kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
        public final void getHighSpeedVideoFpsRanges(kotlin.Unit unit) {
            androidx.constraintlayout.compose.ConstraintSetForInlineDsl.this.setKnownDirty(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
            getHighSpeedVideoFpsRanges(unit);
            return kotlin.Unit.INSTANCE;
        }

        {
            super(1);
        }
    };
    private final java.util.List<androidx.constraintlayout.compose.ConstraintLayoutParentData> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    public ConstraintSetForInlineDsl(androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope) {
        this.scope = constraintLayoutScope;
    }

    public final androidx.constraintlayout.compose.ConstraintLayoutScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void applyTo(final androidx.constraintlayout.compose.State state, final java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.Camera2StreamConfigurationMap.observeReads(kotlin.Unit.INSTANCE, this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap() {
                java.util.List list;
                java.util.List<androidx.compose.ui.layout.Measurable> list2 = measurables;
                androidx.constraintlayout.compose.ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object parentData = list2.get(i).getParentData();
                    androidx.constraintlayout.compose.ConstraintLayoutParentData constraintLayoutParentData = parentData instanceof androidx.constraintlayout.compose.ConstraintLayoutParentData ? (androidx.constraintlayout.compose.ConstraintLayoutParentData) parentData : null;
                    if (constraintLayoutParentData != null) {
                        androidx.constraintlayout.compose.ConstrainedLayoutReference getHighResolutionOutputSizeshNQ4ISI = constraintLayoutParentData.getGetHighResolutionOutputSizeshNQ4ISI();
                        constraintLayoutParentData.getHighSpeedVideoFpsRangesFor().invoke(new androidx.constraintlayout.compose.ConstrainScope(getHighResolutionOutputSizeshNQ4ISI.getId(), constraintSetForInlineDsl.getScope().asCLContainer$constraintlayout_compose_release(getHighResolutionOutputSizeshNQ4ISI)));
                    }
                    list = constraintSetForInlineDsl.getHighResolutionOutputSizeshNQ4ISI;
                    list.add(constraintLayoutParentData);
                }
                this.getScope().applyTo(state);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
        this.knownDirty = false;
    }

    public final boolean getKnownDirty() {
        return this.knownDirty;
    }

    public final void setKnownDirty(boolean z) {
        this.knownDirty = z;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final boolean isDirty(java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables) {
        if (this.knownDirty || measurables.size() != this.getHighResolutionOutputSizeshNQ4ISI.size()) {
            return true;
        }
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object parentData = measurables.get(i).getParentData();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(parentData instanceof androidx.constraintlayout.compose.ConstraintLayoutParentData ? (androidx.constraintlayout.compose.ConstraintLayoutParentData) parentData : null, this.getHighResolutionOutputSizeshNQ4ISI.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.Camera2StreamConfigurationMap.start();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.Camera2StreamConfigurationMap.stop();
        this.Camera2StreamConfigurationMap.clear();
    }
}
