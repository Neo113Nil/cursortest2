package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Measurable;", "", "getAnyOrNullId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/String;", "anyOrNullId"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MeasurerKt {
    public static final java.lang.String getAnyOrNullId(androidx.compose.ui.layout.Measurable measurable) {
        java.lang.String obj;
        java.lang.Object layoutId = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable);
        if (layoutId == null) {
            layoutId = androidx.constraintlayout.compose.ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
        }
        return (layoutId == null || (obj = layoutId.toString()) == null) ? "null" : obj;
    }
}
