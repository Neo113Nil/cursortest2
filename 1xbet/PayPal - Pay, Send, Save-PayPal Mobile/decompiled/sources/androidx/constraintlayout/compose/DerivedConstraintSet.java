package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "applyTo", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "applyToState", "(Landroidx/constraintlayout/compose/State;)V", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DerivedConstraintSet extends androidx.constraintlayout.compose.ConstraintSet {
    void applyToState(androidx.constraintlayout.compose.State state);

    androidx.constraintlayout.compose.ConstraintSet getExtendFrom();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void applyTo(androidx.constraintlayout.compose.DerivedConstraintSet derivedConstraintSet, androidx.constraintlayout.core.state.Transition transition, int i) {
            androidx.constraintlayout.compose.DerivedConstraintSet.super.applyTo(transition, i);
        }

        @java.lang.Deprecated
        public static boolean isDirty(androidx.constraintlayout.compose.DerivedConstraintSet derivedConstraintSet, java.util.List<? extends androidx.compose.ui.layout.Measurable> list) {
            return androidx.constraintlayout.compose.DerivedConstraintSet.super.isDirty(list);
        }

        @java.lang.Deprecated
        public static androidx.constraintlayout.compose.ConstraintSet override(androidx.constraintlayout.compose.DerivedConstraintSet derivedConstraintSet, java.lang.String str, float f) {
            return androidx.constraintlayout.compose.DerivedConstraintSet.super.override(str, f);
        }

        @java.lang.Deprecated
        public static void applyTo(androidx.constraintlayout.compose.DerivedConstraintSet derivedConstraintSet, androidx.constraintlayout.compose.State state, java.util.List<? extends androidx.compose.ui.layout.Measurable> list) {
            androidx.constraintlayout.compose.DerivedConstraintSet.super.applyTo(state, list);
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    default void applyTo(androidx.constraintlayout.compose.State state, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables) {
        androidx.constraintlayout.compose.ConstraintSet extendFrom = getExtendFrom();
        if (extendFrom != null) {
            extendFrom.applyTo(state, measurables);
        }
        applyToState(state);
    }
}
