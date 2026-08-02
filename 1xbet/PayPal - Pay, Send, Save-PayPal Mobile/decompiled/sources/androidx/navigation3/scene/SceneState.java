package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BS\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019"}, d2 = {"Landroidx/navigation3/scene/SceneState;", "", "T", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/OverlayScene;", "overlayScenes", "Landroidx/navigation3/scene/Scene;", "currentScene", "previousScenes", "<init>", "(Ljava/util/List;Ljava/util/List;Landroidx/navigation3/scene/Scene;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getEntries", "()Ljava/util/List;", "getOverlayScenes", "Landroidx/navigation3/scene/Scene;", "getCurrentScene", "()Landroidx/navigation3/scene/Scene;", "getPreviousScenes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SceneState<T> {
    public static final int $stable = 0;
    private final androidx.navigation3.scene.Scene<T> currentScene;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<T>> entries;
    private final java.util.List<androidx.navigation3.scene.OverlayScene<T>> overlayScenes;
    private final java.util.List<androidx.navigation3.scene.Scene<T>> previousScenes;

    /* JADX WARN: Multi-variable type inference failed */
    public SceneState(java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, java.util.List<? extends androidx.navigation3.scene.OverlayScene<T>> list2, androidx.navigation3.scene.Scene<T> scene, java.util.List<? extends androidx.navigation3.scene.Scene<T>> list3) {
        this.entries = list;
        this.overlayScenes = list2;
        this.currentScene = scene;
        this.previousScenes = list3;
    }

    public final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getEntries() {
        return this.entries;
    }

    public final java.util.List<androidx.navigation3.scene.OverlayScene<T>> getOverlayScenes() {
        return this.overlayScenes;
    }

    public final androidx.navigation3.scene.Scene<T> getCurrentScene() {
        return this.currentScene;
    }

    public final java.util.List<androidx.navigation3.scene.Scene<T>> getPreviousScenes() {
        return this.previousScenes;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.navigation3.scene.SceneState sceneState = (androidx.navigation3.scene.SceneState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.entries, sceneState.entries) && kotlin.jvm.internal.Intrinsics.areEqual(this.overlayScenes, sceneState.overlayScenes) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentScene, sceneState.currentScene) && kotlin.jvm.internal.Intrinsics.areEqual(this.previousScenes, sceneState.previousScenes);
    }

    public final int hashCode() {
        return (this.entries.hashCode() * 31) + (this.overlayScenes.hashCode() * 31) + (this.currentScene.hashCode() * 31) + (this.previousScenes.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SceneState(entries=");
        sb.append(this.entries);
        sb.append(", overlayScenes=");
        sb.append(this.overlayScenes);
        sb.append(", currentScene=");
        sb.append(this.currentScene);
        sb.append(", previousScenes=");
        sb.append(this.previousScenes);
        sb.append(')');
        return sb.toString();
    }
}
