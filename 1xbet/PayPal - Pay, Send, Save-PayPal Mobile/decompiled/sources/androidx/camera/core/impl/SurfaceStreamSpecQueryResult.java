package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0011\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR'\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Landroidx/camera/core/impl/SurfaceStreamSpecQueryResult;", "", "", "Landroidx/camera/core/impl/UseCaseConfig;", "Landroidx/camera/core/impl/StreamSpec;", "useCaseStreamSpecs", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "attachedSurfaceStreamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;Ljava/util/Map;I)V", "component1", "()Ljava/util/Map;", "component2", "component3", "()I", "copy", "(Ljava/util/Map;Ljava/util/Map;I)Landroidx/camera/core/impl/SurfaceStreamSpecQueryResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getUseCaseStreamSpecs", "getAttachedSurfaceStreamSpecs", com.visa.cbp.getEncExpo.warmup, "getMaxSupportedFrameRate"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SurfaceStreamSpecQueryResult {
    private final java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> attachedSurfaceStreamSpecs;
    private final int maxSupportedFrameRate;
    private final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> useCaseStreamSpecs;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceStreamSpecQueryResult(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends androidx.camera.core.impl.StreamSpec> map, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, ? extends androidx.camera.core.impl.StreamSpec> map2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        this.useCaseStreamSpecs = map;
        this.attachedSurfaceStreamSpecs = map2;
        this.maxSupportedFrameRate = i;
    }

    public final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> getUseCaseStreamSpecs() {
        return this.useCaseStreamSpecs;
    }

    public final java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> getAttachedSurfaceStreamSpecs() {
        return this.attachedSurfaceStreamSpecs;
    }

    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.useCaseStreamSpecs);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.attachedSurfaceStreamSpecs);
        sb.append(", maxSupportedFrameRate=");
        sb.append(this.maxSupportedFrameRate);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.useCaseStreamSpecs.hashCode() * 31) + this.attachedSurfaceStreamSpecs.hashCode()) * 31) + java.lang.Integer.hashCode(this.maxSupportedFrameRate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.core.impl.SurfaceStreamSpecQueryResult)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult = (androidx.camera.core.impl.SurfaceStreamSpecQueryResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.useCaseStreamSpecs, surfaceStreamSpecQueryResult.useCaseStreamSpecs) && kotlin.jvm.internal.Intrinsics.areEqual(this.attachedSurfaceStreamSpecs, surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs) && this.maxSupportedFrameRate == surfaceStreamSpecQueryResult.maxSupportedFrameRate;
    }

    public final androidx.camera.core.impl.SurfaceStreamSpecQueryResult copy(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends androidx.camera.core.impl.StreamSpec> useCaseStreamSpecs, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, ? extends androidx.camera.core.impl.StreamSpec> attachedSurfaceStreamSpecs, int maxSupportedFrameRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseStreamSpecs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecs, "");
        return new androidx.camera.core.impl.SurfaceStreamSpecQueryResult(useCaseStreamSpecs, attachedSurfaceStreamSpecs, maxSupportedFrameRate);
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> component2() {
        return this.attachedSurfaceStreamSpecs;
    }

    public final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> component1() {
        return this.useCaseStreamSpecs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.camera.core.impl.SurfaceStreamSpecQueryResult copy$default(androidx.camera.core.impl.SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult, java.util.Map map, java.util.Map map2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            map = surfaceStreamSpecQueryResult.useCaseStreamSpecs;
        }
        if ((i2 & 2) != 0) {
            map2 = surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs;
        }
        if ((i2 & 4) != 0) {
            i = surfaceStreamSpecQueryResult.maxSupportedFrameRate;
        }
        return surfaceStreamSpecQueryResult.copy(map, map2, i);
    }
}
