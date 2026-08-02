package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a"}, d2 = {"Landroidx/constraintlayout/compose/RawConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/core/parser/CLObject;", "clObject", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "applyTo", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Landroidx/constraintlayout/core/parser/CLObject;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;", "Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RawConstraintSet implements androidx.constraintlayout.compose.ConstraintSet {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.parser.CLObject getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables();

    public RawConstraintSet(androidx.constraintlayout.core.parser.CLObject cLObject) {
        this.getHighResolutionOutputSizeshNQ4ISI = cLObject;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void applyTo(androidx.constraintlayout.compose.State state, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables) {
        androidx.constraintlayout.core.state.ConstraintSetParser.populateState(this.getHighResolutionOutputSizeshNQ4ISI, state, this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.constraintlayout.compose.RawConstraintSet) other).getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
