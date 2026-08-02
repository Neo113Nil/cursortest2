package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "T", "", "Landroidx/navigation3/scene/SceneStrategy;", "sceneStrategies", "Landroidx/navigation3/scene/SceneStrategyScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateSceneWithSinglePaneFallback", "(Ljava/util/List;Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;", "Landroidx/navigation3/scene/SceneDecoratorStrategy;", "Landroidx/navigation3/scene/SceneDecoratorStrategyScope;", "scene", "decorateScene", "(Landroidx/navigation3/scene/SceneDecoratorStrategy;Landroidx/navigation3/scene/SceneDecoratorStrategyScope;Landroidx/navigation3/scene/Scene;)Landroidx/navigation3/scene/Scene;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SinglePaneSceneKt {
    public static final <T> androidx.navigation3.scene.Scene<T> calculateSceneWithSinglePaneFallback(java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list, androidx.navigation3.scene.SceneStrategyScope<T> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list2) {
        int size = list.size();
        androidx.navigation3.scene.Scene<T> scene = null;
        for (int i = 0; i < size; i++) {
            scene = list.get(i).calculateScene(sceneStrategyScope, list2);
            if (scene != null) {
                break;
            }
        }
        return scene == null ? new androidx.navigation3.scene.SinglePaneSceneStrategy().calculateScene(sceneStrategyScope, list2) : scene;
    }

    public static final <T> androidx.navigation3.scene.Scene<T> decorateScene(androidx.navigation3.scene.SceneDecoratorStrategy<T> sceneDecoratorStrategy, androidx.navigation3.scene.SceneDecoratorStrategyScope<T> sceneDecoratorStrategyScope, androidx.navigation3.scene.Scene<T> scene) {
        return sceneDecoratorStrategy.decorateScene(sceneDecoratorStrategyScope, scene);
    }
}
