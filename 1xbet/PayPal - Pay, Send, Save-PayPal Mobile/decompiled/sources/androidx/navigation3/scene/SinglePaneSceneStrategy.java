package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/navigation3/scene/SinglePaneSceneStrategy;", "", "T", "Landroidx/navigation3/scene/SceneStrategy;", "<init>", "()V", "Landroidx/navigation3/scene/SceneStrategyScope;", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateScene", "(Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SinglePaneSceneStrategy<T> implements androidx.navigation3.scene.SceneStrategy<T> {
    public static final int $stable = 0;

    @Override // androidx.navigation3.scene.SceneStrategy
    public final androidx.navigation3.scene.Scene<T> calculateScene(androidx.navigation3.scene.SceneStrategyScope<T> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list) {
        return new androidx.navigation3.scene.SinglePaneScene(((androidx.navigation3.runtime.NavEntry) kotlin.collections.CollectionsKt.last((java.util.List) list)).getContentKey(), (androidx.navigation3.runtime.NavEntry) kotlin.collections.CollectionsKt.last((java.util.List) list), kotlin.collections.CollectionsKt.dropLast(list, 1));
    }
}
