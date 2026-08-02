package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "", "index", "", "Landroidx/compose/ui/layout/Measurable;", "compose", "(I)Ljava/util/List;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends androidx.compose.ui.layout.MeasureScope {
    java.util.List<androidx.compose.ui.layout.Measurable> compose(int index);

    @kotlin.Deprecated(message = "Please use compose and call Measurable.measure", replaceWith = @kotlin.ReplaceWith(expression = "compose(index).map { it.measure(constraints) }", imports = {}))
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    java.util.List<androidx.compose.ui.layout.Placeable> mo1857measure0kLqBqw(int index, long constraints);
}
