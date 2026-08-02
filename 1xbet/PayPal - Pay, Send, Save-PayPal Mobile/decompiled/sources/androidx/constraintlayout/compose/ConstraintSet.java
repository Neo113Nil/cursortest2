package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "applyTo", "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "type", "(Landroidx/constraintlayout/core/state/Transition;I)V", "", "isDirty", "(Ljava/util/List;)Z", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "override", "(Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConstraintSet {
    void applyTo(androidx.constraintlayout.compose.State state, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables);

    default void applyTo(androidx.constraintlayout.core.state.Transition transition, int type) {
    }

    default boolean isDirty(java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables) {
        return true;
    }

    default androidx.constraintlayout.compose.ConstraintSet override(java.lang.String name2, float value) {
        return this;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.constraintlayout.compose.ConstraintSet override(androidx.constraintlayout.compose.ConstraintSet constraintSet, java.lang.String str, float f) {
            return androidx.constraintlayout.compose.ConstraintSet.super.override(str, f);
        }

        @java.lang.Deprecated
        public static void applyTo(androidx.constraintlayout.compose.ConstraintSet constraintSet, androidx.constraintlayout.core.state.Transition transition, int i) {
            androidx.constraintlayout.compose.ConstraintSet.super.applyTo(transition, i);
        }

        @java.lang.Deprecated
        public static boolean isDirty(androidx.constraintlayout.compose.ConstraintSet constraintSet, java.util.List<? extends androidx.compose.ui.layout.Measurable> list) {
            return androidx.constraintlayout.compose.ConstraintSet.super.isDirty(list);
        }
    }
}
