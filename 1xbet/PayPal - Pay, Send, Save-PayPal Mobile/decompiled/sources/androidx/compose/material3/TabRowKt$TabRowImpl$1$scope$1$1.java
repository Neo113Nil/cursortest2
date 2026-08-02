package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002JD\u0010\r\u001a\u00020\u0003*\u00020\u00032/\u0010\f\u001a+\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1;", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/material3/TabPositionsHolder;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measure", "tabIndicatorLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;)Landroidx/compose/ui/Modifier;", "", "selectedTabIndex", "", "matchContentSize", "tabIndicatorOffset", "(Landroidx/compose/ui/Modifier;IZ)Landroidx/compose/ui/Modifier;", "positions", "", "setTabPositions", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MutableState;", "tabPositions", "Landroidx/compose/runtime/MutableState;", "getTabPositions", "()Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabRowKt$TabRowImpl$1$scope$1$1 implements androidx.compose.material3.TabIndicatorScope, androidx.compose.material3.TabPositionsHolder {
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.Dp> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.MutableState<java.util.List<androidx.compose.material3.TabPosition>> tabPositions = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);

    TabRowKt$TabRowImpl$1$scope$1$1(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.Dp> finiteAnimationSpec) {
        this.getHighSpeedVideoSizes = finiteAnimationSpec;
    }

    public final androidx.compose.runtime.MutableState<java.util.List<androidx.compose.material3.TabPosition>> getTabPositions() {
        return this.tabPositions;
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public final androidx.compose.ui.Modifier tabIndicatorLayout(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function4<? super androidx.compose.ui.layout.MeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? super java.util.List<androidx.compose.material3.TabPosition>, ? extends androidx.compose.ui.layout.MeasureResult> function4) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1.$r8$lambda$3hWEZpU0Kox6TJOrIY4V2NxG36A(kotlin.jvm.functions.Function4.this, this, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        });
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public final androidx.compose.ui.Modifier tabIndicatorOffset(androidx.compose.ui.Modifier modifier, int i, boolean z) {
        return modifier.then(new androidx.compose.material3.TabIndicatorModifier(this.tabPositions, i, z, this.getHighSpeedVideoSizes));
    }

    @Override // androidx.compose.material3.TabPositionsHolder
    public final void setTabPositions(java.util.List<androidx.compose.material3.TabPosition> positions) {
        this.tabPositions.setValue(positions);
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$3hWEZpU0Kox6TJOrIY4V2NxG36A(kotlin.jvm.functions.Function4 function4, androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        return (androidx.compose.ui.layout.MeasureResult) function4.invoke(measureScope, measurable, constraints, tabRowKt$TabRowImpl$1$scope$1$1.tabPositions.getValue());
    }
}
