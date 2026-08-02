package androidx.camera.core.featuregroup.impl.feature;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/ImageFormatFeature;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "", "imageCaptureOutputFormat", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getImageCaptureOutputFormat", "()I", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageFormatFeature extends androidx.camera.core.featuregroup.GroupableFeature {
    public static final int DEFAULT_IMAGE_CAPTURE_OUTPUT_FORMAT = 0;
    private final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal = androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.IMAGE_FORMAT;
    private final int imageCaptureOutputFormat;

    public ImageFormatFeature(int i) {
        this.imageCaptureOutputFormat = i;
    }

    public final int getImageCaptureOutputFormat() {
        return this.imageCaptureOutputFormat;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.imageCaptureOutputFormat;
        if (i == 0) {
            str = "JPEG";
        } else if (i == 1) {
            str = "JPEG_R";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("UNDEFINED(");
            sb2.append(this.imageCaptureOutputFormat);
            sb2.append(')');
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
