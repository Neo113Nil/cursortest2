package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u0011X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$annotations", "()V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "rootIncomingConstraints", "Landroidx/compose/ui/unit/Constraints;", "getRootIncomingConstraints-msEJaDk", "()J", "setRootIncomingConstraints-BRTryo0", "(J)V", "J", "convertDimension", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "getKeyId", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "getKeyId$constraintlayout_compose_release", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;
    private final androidx.compose.ui.unit.Density getHighSpeedVideoSizesFor;
    private long getOutputMinFrameDuration = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private androidx.compose.ui.unit.LayoutDirection getInputFormats = androidx.compose.ui.unit.LayoutDirection.Ltr;

    @kotlin.Deprecated(message = "Use #isLtr instead")
    public static /* synthetic */ void getLayoutDirection$annotations() {
    }

    public State(androidx.compose.ui.unit.Density density) {
        this.getHighSpeedVideoSizesFor = density;
        setDpToPixel(new androidx.constraintlayout.core.state.CorePixelDp() { // from class: androidx.constraintlayout.compose.State$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f) {
                return androidx.constraintlayout.compose.State.$r8$lambda$GGFjcY2wBRdf4QH5q9FTQsWfwY0(androidx.constraintlayout.compose.State.this, f);
            }
        });
    }

    /* renamed from: getDensity, reason: from getter */
    public final androidx.compose.ui.unit.Density getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    /* renamed from: getRootIncomingConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0, reason: not valid java name */
    public final void m9041setRootIncomingConstraintsBRTryo0(long j) {
        this.getOutputMinFrameDuration = j;
    }

    /* renamed from: getLayoutDirection, reason: from getter */
    public final androidx.compose.ui.unit.LayoutDirection getGetInputFormats() {
        return this.getInputFormats;
    }

    public final void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.getInputFormats = layoutDirection;
    }

    @Override // androidx.constraintlayout.core.state.State
    public final int convertDimension(java.lang.Object value) {
        if (value instanceof androidx.compose.ui.unit.Dp) {
            return this.getHighSpeedVideoSizesFor.mo1412roundToPx0680j_4(((androidx.compose.ui.unit.Dp) value).m8615unboximpl());
        }
        return super.convertDimension(value);
    }

    public final java.lang.Object getKeyId$constraintlayout_compose_release(androidx.constraintlayout.core.widgets.HelperWidget helperWidget) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.mHelperReferences.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.constraintlayout.core.state.HelperReference) ((java.util.Map.Entry) obj).getValue()).getHelperWidget(), helperWidget)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public static /* synthetic */ float $r8$lambda$GGFjcY2wBRdf4QH5q9FTQsWfwY0(androidx.constraintlayout.compose.State state, float f) {
        return state.getHighSpeedVideoSizesFor.getGetHighResolutionOutputSizeshNQ4ISI() * f;
    }
}
