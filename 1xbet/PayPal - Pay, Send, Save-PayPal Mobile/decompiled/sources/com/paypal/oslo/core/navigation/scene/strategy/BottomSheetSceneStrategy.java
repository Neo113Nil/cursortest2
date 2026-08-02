package com.paypal.oslo.core.navigation.scene.strategy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/strategy/BottomSheetSceneStrategy;", "", "T", "Landroidx/navigation3/scene/SceneStrategy;", "<init>", "()V", "Landroidx/navigation3/scene/SceneStrategyScope;", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateScene", "(Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomSheetSceneStrategy<T> implements androidx.navigation3.scene.SceneStrategy<T> {
    public static final int $stable = 0;

    @Override // androidx.navigation3.scene.SceneStrategy
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public final /* bridge */ androidx.navigation3.scene.SceneStrategy<T> then(androidx.navigation3.scene.SceneStrategy<T> sceneStrategy) {
        return super.then(sceneStrategy);
    }

    @Override // androidx.navigation3.scene.SceneStrategy
    public final androidx.navigation3.scene.Scene<T> calculateScene(androidx.navigation3.scene.SceneStrategyScope<T> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list) {
        java.util.Map<java.lang.String, java.lang.Object> metadata;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sceneStrategyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
        if (!kotlin.jvm.internal.Intrinsics.areEqual((navEntry == null || (metadata = navEntry.getMetadata()) == null) ? null : (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET()), java.lang.Boolean.TRUE)) {
            return null;
        }
        java.lang.Object contentKey = navEntry.getContentKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(contentKey, "");
        return new com.paypal.oslo.core.navigation.scene.BottomSheetScene(contentKey, kotlin.collections.CollectionsKt.dropLast(list, 1), kotlin.collections.CollectionsKt.dropLast(list, 1), navEntry, sceneStrategyScope.getOnBack());
    }
}
