package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "", "", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphIds", "Landroidx/camera/camera2/pipe/CameraId;", "cameraIds", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "component2", "copy", "(Ljava/util/Set;Ljava/util/Set;)Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getCameraGraphIds", "getCameraIds"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConcurrentCameraGraphs {
    private final java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> cameraGraphIds;
    private final java.util.Set<androidx.camera.camera2.pipe.CameraId> cameraIds;

    public ConcurrentCameraGraphs(java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> set, java.util.Set<androidx.camera.camera2.pipe.CameraId> set2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        this.cameraGraphIds = set;
        this.cameraIds = set2;
        if (set.size() <= 1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (set.size() != set2.size()) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> getCameraGraphIds() {
        return this.cameraGraphIds;
    }

    public final java.util.Set<androidx.camera.camera2.pipe.CameraId> getCameraIds() {
        return this.cameraIds;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConcurrentCameraGraphs(cameraGraphIds=");
        sb.append(this.cameraGraphIds);
        sb.append(", cameraIds=");
        sb.append(this.cameraIds);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.cameraGraphIds.hashCode() * 31) + this.cameraIds.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.ConcurrentCameraGraphs)) {
            return false;
        }
        androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs = (androidx.camera.camera2.pipe.ConcurrentCameraGraphs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cameraGraphIds, concurrentCameraGraphs.cameraGraphIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraIds, concurrentCameraGraphs.cameraIds);
    }

    public final androidx.camera.camera2.pipe.ConcurrentCameraGraphs copy(java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> cameraGraphIds, java.util.Set<androidx.camera.camera2.pipe.CameraId> cameraIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphIds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIds, "");
        return new androidx.camera.camera2.pipe.ConcurrentCameraGraphs(cameraGraphIds, cameraIds);
    }

    public final java.util.Set<androidx.camera.camera2.pipe.CameraId> component2() {
        return this.cameraIds;
    }

    public final java.util.Set<androidx.camera.camera2.pipe.CameraGraphId> component1() {
        return this.cameraGraphIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.camera.camera2.pipe.ConcurrentCameraGraphs copy$default(androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs, java.util.Set set, java.util.Set set2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = concurrentCameraGraphs.cameraGraphIds;
        }
        if ((i & 2) != 0) {
            set2 = concurrentCameraGraphs.cameraIds;
        }
        return concurrentCameraGraphs.copy(set, set2);
    }
}
