package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/navigation3/scene/SceneInfo;", "", "T", "Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/navigation3/scene/Scene;", "scene", "<init>", "(Landroidx/navigation3/scene/Scene;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/scene/Scene;", "getScene", "()Landroidx/navigation3/scene/Scene;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SceneInfo<T> extends androidx.view.NavigationEventInfo {
    public static final int $stable = 0;
    private final androidx.navigation3.scene.Scene<T> scene;

    public SceneInfo(androidx.navigation3.scene.Scene<T> scene) {
        this.scene = scene;
    }

    public final androidx.navigation3.scene.Scene<T> getScene() {
        return this.scene;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.scene, ((androidx.navigation3.scene.SceneInfo) other).scene);
    }

    public final int hashCode() {
        return this.scene.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SceneInfo(scene=");
        sb.append(this.scene);
        sb.append(')');
        return sb.toString();
    }
}
