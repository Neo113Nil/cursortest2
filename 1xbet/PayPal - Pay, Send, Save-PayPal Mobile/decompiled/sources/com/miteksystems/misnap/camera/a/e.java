package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u0019\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b \u0010\u001c"}, d2 = {"Lcom/miteksystems/misnap/camera/a/e;", "", "Landroid/util/Size;", "previewSize", "imageAnalysisSize", "pictureSize", "", androidx.constraintlayout.motion.widget.Key.ROTATION, "", "enableOutputRotation", "imageAnalysisHighResolutionSize", "pictureHighResolutionSize", "<init>", "(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;IZLandroid/util/Size;Landroid/util/Size;)V", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "cameraInfo", "(Lcom/miteksystems/misnap/core/MiSnapCameraInfo;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/util/Size;", "f", "()Landroid/util/Size;", util.h.xy.cb.b.f1091, "c", "e", "d", com.visa.cbp.getEncExpo.warmup, "g", "Z", "()Z"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.util.Size previewSize;

    /* renamed from: b, reason: from kotlin metadata */
    private final android.util.Size imageAnalysisSize;

    /* renamed from: c, reason: from kotlin metadata */
    private final android.util.Size pictureSize;

    /* renamed from: d, reason: from kotlin metadata */
    private final int rotation;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean enableOutputRotation;

    /* renamed from: f, reason: from kotlin metadata */
    private final android.util.Size imageAnalysisHighResolutionSize;

    /* renamed from: g, reason: from kotlin metadata */
    private final android.util.Size pictureHighResolutionSize;

    public e(android.util.Size size, android.util.Size size2, android.util.Size size3, int i, boolean z, android.util.Size size4, android.util.Size size5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size3, "");
        this.previewSize = size;
        this.imageAnalysisSize = size2;
        this.pictureSize = size3;
        this.rotation = i;
        this.enableOutputRotation = z;
        this.imageAnalysisHighResolutionSize = size4;
        this.pictureHighResolutionSize = size5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(com.miteksystems.misnap.core.MiSnapCameraInfo miSnapCameraInfo, int i, boolean z) {
        this(miSnapCameraInfo.getSupportedPreviewSize(), miSnapCameraInfo.getSupportedImageAnalysisSize(), miSnapCameraInfo.getSupportedPictureSize(), i, z, miSnapCameraInfo.getSupportedImageAnalysisHighResolutionSize(), miSnapCameraInfo.getSupportedPictureHighResolutionSize());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapCameraInfo, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraInternalSettings(previewSize=");
        sb.append(this.previewSize);
        sb.append(", imageAnalysisSize=");
        sb.append(this.imageAnalysisSize);
        sb.append(", pictureSize=");
        sb.append(this.pictureSize);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", enableOutputRotation=");
        sb.append(this.enableOutputRotation);
        sb.append(", imageAnalysisHighResolutionSize=");
        sb.append(this.imageAnalysisHighResolutionSize);
        sb.append(", pictureHighResolutionSize=");
        sb.append(this.pictureHighResolutionSize);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.previewSize.hashCode();
        int hashCode2 = this.imageAnalysisSize.hashCode();
        int hashCode3 = this.pictureSize.hashCode();
        int hashCode4 = java.lang.Integer.hashCode(this.rotation);
        boolean z = this.enableOutputRotation;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        android.util.Size size = this.imageAnalysisHighResolutionSize;
        int hashCode5 = size == null ? 0 : size.hashCode();
        android.util.Size size2 = this.pictureHighResolutionSize;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + hashCode5) * 31) + (size2 != null ? size2.hashCode() : 0);
    }

    /* renamed from: g, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    /* renamed from: f, reason: from getter */
    public final android.util.Size getPreviewSize() {
        return this.previewSize;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.camera.a.e)) {
            return false;
        }
        com.miteksystems.misnap.camera.a.e eVar = (com.miteksystems.misnap.camera.a.e) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.previewSize, eVar.previewSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageAnalysisSize, eVar.imageAnalysisSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.pictureSize, eVar.pictureSize) && this.rotation == eVar.rotation && this.enableOutputRotation == eVar.enableOutputRotation && kotlin.jvm.internal.Intrinsics.areEqual(this.imageAnalysisHighResolutionSize, eVar.imageAnalysisHighResolutionSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.pictureHighResolutionSize, eVar.pictureHighResolutionSize);
    }

    /* renamed from: e, reason: from getter */
    public final android.util.Size getPictureSize() {
        return this.pictureSize;
    }

    /* renamed from: d, reason: from getter */
    public final android.util.Size getPictureHighResolutionSize() {
        return this.pictureHighResolutionSize;
    }

    /* renamed from: c, reason: from getter */
    public final android.util.Size getImageAnalysisSize() {
        return this.imageAnalysisSize;
    }

    /* renamed from: b, reason: from getter */
    public final android.util.Size getImageAnalysisHighResolutionSize() {
        return this.imageAnalysisHighResolutionSize;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnableOutputRotation() {
        return this.enableOutputRotation;
    }
}
