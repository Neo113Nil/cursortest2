package com.paypal.oslo.core.navigation.scene.strategy;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/strategy/L2SceneStrategy;", "Landroidx/navigation3/scene/SceneStrategy;", "Landroidx/navigation3/runtime/NavKey;", "<init>", "()V", "Landroidx/navigation3/scene/SceneStrategyScope;", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateScene", "(Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class L2SceneStrategy implements androidx.navigation3.scene.SceneStrategy<androidx.navigation3.runtime.NavKey> {
    public static final int $stable = 0;

    @Override // androidx.navigation3.scene.SceneStrategy
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public final /* bridge */ androidx.navigation3.scene.SceneStrategy<androidx.navigation3.runtime.NavKey> then(androidx.navigation3.scene.SceneStrategy<androidx.navigation3.runtime.NavKey> sceneStrategy) {
        return super.then(sceneStrategy);
    }

    @Override // androidx.navigation3.scene.SceneStrategy
    public final androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey> calculateScene(androidx.navigation3.scene.SceneStrategyScope<androidx.navigation3.runtime.NavKey> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sceneStrategyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
        if (navEntry == null || !com.paypal.oslo.core.navigation.NavEntryExtensionsKt.isL2(navEntry)) {
            return null;
        }
        return new com.paypal.oslo.core.navigation.scene.FullScreenL2Scene(navEntry.getContentKey(), kotlin.collections.CollectionsKt.dropLast(list, 1), navEntry, sceneStrategyScope.getOnBack());
    }
}
