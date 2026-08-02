package com.paypal.oslo.core.navigation.scene.strategy;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/strategy/L0SceneStrategy;", "Landroidx/navigation3/scene/SceneStrategy;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "topBarConfig", "Lkotlin/Function0;", "", "onBack", "<init>", "(Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;Lkotlin/jvm/functions/Function0;)V", "Landroidx/navigation3/scene/SceneStrategyScope;", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateScene", "(Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class L0SceneStrategy implements androidx.navigation3.scene.SceneStrategy<androidx.navigation3.runtime.NavKey> {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.navigation.ui.TopBarConfig getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public L0SceneStrategy(com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = topBarConfig;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // androidx.navigation3.scene.SceneStrategy
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public final /* bridge */ androidx.navigation3.scene.SceneStrategy<androidx.navigation3.runtime.NavKey> then(androidx.navigation3.scene.SceneStrategy<androidx.navigation3.runtime.NavKey> sceneStrategy) {
        return super.then(sceneStrategy);
    }

    @Override // androidx.navigation3.scene.SceneStrategy
    public final androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey> calculateScene(androidx.navigation3.scene.SceneStrategyScope<androidx.navigation3.runtime.NavKey> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> list) {
        androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sceneStrategyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ListIterator<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navEntry = null;
                break;
            }
            navEntry = listIterator.previous();
            if (com.paypal.oslo.core.navigation.NavEntryExtensionsKt.isL0(navEntry)) {
                break;
            }
        }
        androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry2 = navEntry;
        return navEntry2 != null ? new com.paypal.oslo.core.navigation.scene.L0OnlyScene(navEntry2.getContentKey(), kotlin.collections.CollectionsKt.dropLast(list, 1), navEntry2, this.getHighSpeedVideoFpsRanges, sceneStrategyScope.getOnBack()) : null;
    }
}
