package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Landroidx/camera/core/internal/StreamSpecQueryResult;", "", "", "Landroidx/camera/core/UseCase;", "Landroidx/camera/core/impl/StreamSpec;", "streamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;I)V", "component1", "()Ljava/util/Map;", "component2", "()I", "copy", "(Ljava/util/Map;I)Landroidx/camera/core/internal/StreamSpecQueryResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getStreamSpecs", com.visa.cbp.getEncExpo.warmup, "getMaxSupportedFrameRate"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StreamSpecQueryResult {
    private final int maxSupportedFrameRate;
    private final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> streamSpecs;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult(java.util.Map<androidx.camera.core.UseCase, ? extends androidx.camera.core.impl.StreamSpec> map, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.streamSpecs = map;
        this.maxSupportedFrameRate = i;
    }

    public /* synthetic */ StreamSpecQueryResult(java.util.Map map, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i2 & 2) != 0 ? Integer.MAX_VALUE : i);
    }

    public final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> getStreamSpecs() {
        return this.streamSpecs;
    }

    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.streamSpecs);
        sb.append(", maxSupportedFrameRate=");
        sb.append(this.maxSupportedFrameRate);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.streamSpecs.hashCode() * 31) + java.lang.Integer.hashCode(this.maxSupportedFrameRate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.core.internal.StreamSpecQueryResult)) {
            return false;
        }
        androidx.camera.core.internal.StreamSpecQueryResult streamSpecQueryResult = (androidx.camera.core.internal.StreamSpecQueryResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.streamSpecs, streamSpecQueryResult.streamSpecs) && this.maxSupportedFrameRate == streamSpecQueryResult.maxSupportedFrameRate;
    }

    public final androidx.camera.core.internal.StreamSpecQueryResult copy(java.util.Map<androidx.camera.core.UseCase, ? extends androidx.camera.core.impl.StreamSpec> streamSpecs, int maxSupportedFrameRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecs, "");
        return new androidx.camera.core.internal.StreamSpecQueryResult(streamSpecs, maxSupportedFrameRate);
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> component1() {
        return this.streamSpecs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.camera.core.internal.StreamSpecQueryResult copy$default(androidx.camera.core.internal.StreamSpecQueryResult streamSpecQueryResult, java.util.Map map, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            map = streamSpecQueryResult.streamSpecs;
        }
        if ((i2 & 2) != 0) {
            i = streamSpecQueryResult.maxSupportedFrameRate;
        }
        return streamSpecQueryResult.copy(map, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
