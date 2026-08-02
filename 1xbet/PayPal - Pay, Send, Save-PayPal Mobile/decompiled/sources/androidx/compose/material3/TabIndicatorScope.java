package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\f\u001a\u00020\u0002*\u00020\u00022/\u0010\u000b\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\nH&¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TabIndicatorScope;", "", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measure", "tabIndicatorLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;)Landroidx/compose/ui/Modifier;", "", "selectedTabIndex", "", "matchContentSize", "tabIndicatorOffset", "(Landroidx/compose/ui/Modifier;IZ)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TabIndicatorScope {
    androidx.compose.ui.Modifier tabIndicatorLayout(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function4<? super androidx.compose.ui.layout.MeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? super java.util.List<androidx.compose.material3.TabPosition>, ? extends androidx.compose.ui.layout.MeasureResult> function4);

    androidx.compose.ui.Modifier tabIndicatorOffset(androidx.compose.ui.Modifier modifier, int i, boolean z);

    static /* synthetic */ androidx.compose.ui.Modifier tabIndicatorOffset$default(androidx.compose.material3.TabIndicatorScope tabIndicatorScope, androidx.compose.ui.Modifier modifier, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return tabIndicatorScope.tabIndicatorOffset(modifier, i, z);
    }
}
