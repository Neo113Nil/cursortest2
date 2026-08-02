package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J5\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H§\u0004¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/navigation3/scene/SceneStrategy;", "", "T", "Landroidx/navigation3/scene/SceneStrategyScope;", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateScene", "(Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;", "sceneStrategy", "then", "(Landroidx/navigation3/scene/SceneStrategy;)Landroidx/navigation3/scene/SceneStrategy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SceneStrategy<T> {
    androidx.navigation3.scene.Scene<T> calculateScene(androidx.navigation3.scene.SceneStrategyScope<T> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    default androidx.navigation3.scene.SceneStrategy<T> then(final androidx.navigation3.scene.SceneStrategy<T> sceneStrategy) {
        return new androidx.navigation3.scene.SceneStrategy() { // from class: androidx.navigation3.scene.SceneStrategy$$ExternalSyntheticLambda0
            @Override // androidx.navigation3.scene.SceneStrategy
            public final androidx.navigation3.scene.Scene calculateScene(androidx.navigation3.scene.SceneStrategyScope sceneStrategyScope, java.util.List list) {
                return androidx.navigation3.scene.SceneStrategy.m9238$r8$lambda$dM9PjoW1eqonrz4MMHdsMycy7c(androidx.navigation3.scene.SceneStrategy.this, sceneStrategy, sceneStrategyScope, list);
            }
        };
    }

    /* renamed from: $r8$lambda$dM9PjoW1eqonrz-4MMHdsMycy7c, reason: not valid java name */
    static /* synthetic */ androidx.navigation3.scene.Scene m9238$r8$lambda$dM9PjoW1eqonrz4MMHdsMycy7c(androidx.navigation3.scene.SceneStrategy sceneStrategy, androidx.navigation3.scene.SceneStrategy sceneStrategy2, androidx.navigation3.scene.SceneStrategyScope sceneStrategyScope, java.util.List list) {
        androidx.navigation3.scene.Scene<T> calculateScene = sceneStrategy.calculateScene(sceneStrategyScope, list);
        return calculateScene == null ? sceneStrategy2.calculateScene(sceneStrategyScope, list) : calculateScene;
    }
}
