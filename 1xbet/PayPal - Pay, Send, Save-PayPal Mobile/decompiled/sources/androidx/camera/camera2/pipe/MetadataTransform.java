package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/MetadataTransform;", "", "", "past", "future", "Landroidx/camera/camera2/pipe/MetadataTransform$TransformFn;", "transformFn", "<init>", "(IILandroidx/camera/camera2/pipe/MetadataTransform$TransformFn;)V", "component1", "()I", "component2", "component3", "()Landroidx/camera/camera2/pipe/MetadataTransform$TransformFn;", "copy", "(IILandroidx/camera/camera2/pipe/MetadataTransform$TransformFn;)Landroidx/camera/camera2/pipe/MetadataTransform;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPast", "getFuture", "Landroidx/camera/camera2/pipe/MetadataTransform$TransformFn;", "getTransformFn", "TransformFn"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MetadataTransform {
    private final int future;
    private final int past;
    private final androidx.camera.camera2.pipe.MetadataTransform.TransformFn transformFn;

    public MetadataTransform(int i, int i2, androidx.camera.camera2.pipe.MetadataTransform.TransformFn transformFn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformFn, "");
        this.past = i;
        this.future = i2;
        this.transformFn = transformFn;
        if (i < 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final int getPast() {
        return this.past;
    }

    public final int getFuture() {
        return this.future;
    }

    public /* synthetic */ MetadataTransform(int i, int i2, androidx.camera.camera2.pipe.MetadataTransform.TransformFn transformFn, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new androidx.camera.camera2.pipe.MetadataTransform.TransformFn() { // from class: androidx.camera.camera2.pipe.MetadataTransform.1
        } : transformFn);
    }

    public final androidx.camera.camera2.pipe.MetadataTransform.TransformFn getTransformFn() {
        return this.transformFn;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/MetadataTransform$TransformFn;", "", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "", "related", "", "computeOverridesFor-F8oR-dw", "(Landroidx/camera/camera2/pipe/FrameInfo;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;", "computeOverridesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TransformFn {

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            /* renamed from: computeOverridesFor-F8oR-dw, reason: not valid java name */
            public static java.util.Map<?, java.lang.Object> m535computeOverridesForF8oRdw(androidx.camera.camera2.pipe.MetadataTransform.TransformFn transformFn, androidx.camera.camera2.pipe.FrameInfo frameInfo, java.lang.String str, java.util.List<? extends androidx.camera.camera2.pipe.FrameInfo> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                return androidx.camera.camera2.pipe.MetadataTransform.TransformFn.super.m534computeOverridesForF8oRdw(frameInfo, str, list);
            }
        }

        /* renamed from: computeOverridesFor-F8oR-dw, reason: not valid java name */
        default java.util.Map<?, java.lang.Object> m534computeOverridesForF8oRdw(androidx.camera.camera2.pipe.FrameInfo result, java.lang.String camera, java.util.List<? extends androidx.camera.camera2.pipe.FrameInfo> related) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(related, "");
            return kotlin.collections.MapsKt.emptyMap();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataTransform(past=");
        sb.append(this.past);
        sb.append(", future=");
        sb.append(this.future);
        sb.append(", transformFn=");
        sb.append(this.transformFn);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.past) * 31) + java.lang.Integer.hashCode(this.future)) * 31) + this.transformFn.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.MetadataTransform)) {
            return false;
        }
        androidx.camera.camera2.pipe.MetadataTransform metadataTransform = (androidx.camera.camera2.pipe.MetadataTransform) other;
        return this.past == metadataTransform.past && this.future == metadataTransform.future && kotlin.jvm.internal.Intrinsics.areEqual(this.transformFn, metadataTransform.transformFn);
    }

    public final androidx.camera.camera2.pipe.MetadataTransform copy(int past, int future, androidx.camera.camera2.pipe.MetadataTransform.TransformFn transformFn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformFn, "");
        return new androidx.camera.camera2.pipe.MetadataTransform(past, future, transformFn);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.camera.camera2.pipe.MetadataTransform.TransformFn getTransformFn() {
        return this.transformFn;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFuture() {
        return this.future;
    }

    /* renamed from: component1, reason: from getter */
    public final int getPast() {
        return this.past;
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.MetadataTransform copy$default(androidx.camera.camera2.pipe.MetadataTransform metadataTransform, int i, int i2, androidx.camera.camera2.pipe.MetadataTransform.TransformFn transformFn, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = metadataTransform.past;
        }
        if ((i3 & 2) != 0) {
            i2 = metadataTransform.future;
        }
        if ((i3 & 4) != 0) {
            transformFn = metadataTransform.transformFn;
        }
        return metadataTransform.copy(i, i2, transformFn);
    }

    public MetadataTransform() {
        this(0, 0, null, 7, null);
    }
}
