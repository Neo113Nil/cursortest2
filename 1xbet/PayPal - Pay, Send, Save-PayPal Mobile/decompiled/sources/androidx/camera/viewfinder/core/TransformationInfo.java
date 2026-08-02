package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000  2\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c"}, d2 = {"Landroidx/camera/viewfinder/core/TransformationInfo;", "", "", "sourceRotation", "", "isSourceMirroredHorizontally", "isSourceMirroredVertically", "", "cropRectLeft", "cropRectTop", "cropRectRight", "cropRectBottom", "<init>", "(IZZFFFF)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getSourceRotation", "Z", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCropRectLeft", "()F", "getCropRectTop", "getCropRectRight", "getCropRectBottom", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformationInfo {
    public static final float CROP_NONE = Float.NaN;
    public static final androidx.camera.viewfinder.core.TransformationInfo DEFAULT = new androidx.camera.viewfinder.core.TransformationInfo(0, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 127, null);
    private final float cropRectBottom;
    private final float cropRectLeft;
    private final float cropRectRight;
    private final float cropRectTop;
    private final boolean isSourceMirroredHorizontally;
    private final boolean isSourceMirroredVertically;
    private final int sourceRotation;

    public TransformationInfo(int i, boolean z, boolean z2, float f, float f2, float f3, float f4) {
        this.sourceRotation = i;
        this.isSourceMirroredHorizontally = z;
        this.isSourceMirroredVertically = z2;
        this.cropRectLeft = f;
        this.cropRectTop = f2;
        this.cropRectRight = f3;
        this.cropRectBottom = f4;
    }

    public /* synthetic */ TransformationInfo(int i, boolean z, boolean z2, float f, float f2, float f3, float f4, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) == 0 ? z2 : false, (i2 & 8) != 0 ? Float.NaN : f, (i2 & 16) != 0 ? Float.NaN : f2, (i2 & 32) != 0 ? Float.NaN : f3, (i2 & 64) != 0 ? Float.NaN : f4);
    }

    public final int getSourceRotation() {
        return this.sourceRotation;
    }

    /* renamed from: isSourceMirroredHorizontally, reason: from getter */
    public final boolean getIsSourceMirroredHorizontally() {
        return this.isSourceMirroredHorizontally;
    }

    /* renamed from: isSourceMirroredVertically, reason: from getter */
    public final boolean getIsSourceMirroredVertically() {
        return this.isSourceMirroredVertically;
    }

    public final float getCropRectLeft() {
        return this.cropRectLeft;
    }

    public final float getCropRectTop() {
        return this.cropRectTop;
    }

    public final float getCropRectRight() {
        return this.cropRectRight;
    }

    public final float getCropRectBottom() {
        return this.cropRectBottom;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.viewfinder.core.TransformationInfo)) {
            return false;
        }
        androidx.camera.viewfinder.core.TransformationInfo transformationInfo = (androidx.camera.viewfinder.core.TransformationInfo) other;
        return this.sourceRotation == transformationInfo.sourceRotation && this.isSourceMirroredHorizontally == transformationInfo.isSourceMirroredHorizontally && this.isSourceMirroredVertically == transformationInfo.isSourceMirroredVertically && this.cropRectLeft == transformationInfo.cropRectLeft && this.cropRectTop == transformationInfo.cropRectTop && this.cropRectRight == transformationInfo.cropRectRight && this.cropRectBottom == transformationInfo.cropRectBottom;
    }

    public final int hashCode() {
        int i = this.sourceRotation;
        int hashCode = java.lang.Boolean.hashCode(this.isSourceMirroredHorizontally);
        int hashCode2 = java.lang.Boolean.hashCode(this.isSourceMirroredVertically);
        int hashCode3 = java.lang.Float.hashCode(this.cropRectLeft);
        return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + java.lang.Float.hashCode(this.cropRectTop)) * 31) + java.lang.Float.hashCode(this.cropRectRight)) * 31) + java.lang.Float.hashCode(this.cropRectBottom);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransformationInfo(sourceRotation=");
        sb.append(this.sourceRotation);
        sb.append(", isSourceMirroredHorizontally=");
        sb.append(this.isSourceMirroredHorizontally);
        sb.append(", isSourceMirroredVertically=");
        sb.append(this.isSourceMirroredVertically);
        sb.append(", cropRectLeft=");
        sb.append(this.cropRectLeft);
        sb.append(", cropRectTop=");
        sb.append(this.cropRectTop);
        sb.append(", cropRectRight=");
        sb.append(this.cropRectRight);
        sb.append(", cropRectBottom=");
        sb.append(this.cropRectBottom);
        sb.append(')');
        return sb.toString();
    }

    public TransformationInfo(int i, boolean z, boolean z2, float f, float f2, float f3) {
        this(i, z, z2, f, f2, f3, 0.0f, 64, null);
    }

    public TransformationInfo(int i, boolean z, boolean z2, float f, float f2) {
        this(i, z, z2, f, f2, 0.0f, 0.0f, 96, null);
    }

    public TransformationInfo(int i, boolean z, boolean z2, float f) {
        this(i, z, z2, f, 0.0f, 0.0f, 0.0f, 112, null);
    }

    public TransformationInfo(int i, boolean z, boolean z2) {
        this(i, z, z2, 0.0f, 0.0f, 0.0f, 0.0f, 120, null);
    }

    public TransformationInfo(int i, boolean z) {
        this(i, z, false, 0.0f, 0.0f, 0.0f, 0.0f, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }

    public TransformationInfo(int i) {
        this(i, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 126, null);
    }

    public TransformationInfo() {
        this(0, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 127, null);
    }
}
