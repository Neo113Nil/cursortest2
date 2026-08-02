package androidx.camera.core.streamsharing;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Landroidx/camera/core/streamsharing/PreferredChildSize;", "", "Landroid/graphics/Rect;", "cropRectBeforeScaling", "Landroid/util/Size;", "childSizeToScale", "originalSelectedChildSize", "<init>", "(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)V", "component1", "()Landroid/graphics/Rect;", "component2", "()Landroid/util/Size;", "component3", "copy", "(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)Landroidx/camera/core/streamsharing/PreferredChildSize;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Rect;", "getCropRectBeforeScaling", "Landroid/util/Size;", "getChildSizeToScale", "getOriginalSelectedChildSize"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PreferredChildSize {
    private final android.util.Size childSizeToScale;
    private final android.graphics.Rect cropRectBeforeScaling;
    private final android.util.Size originalSelectedChildSize;

    public PreferredChildSize(android.graphics.Rect rect, android.util.Size size, android.util.Size size2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size2, "");
        this.cropRectBeforeScaling = rect;
        this.childSizeToScale = size;
        this.originalSelectedChildSize = size2;
    }

    public final android.graphics.Rect getCropRectBeforeScaling() {
        return this.cropRectBeforeScaling;
    }

    public final android.util.Size getChildSizeToScale() {
        return this.childSizeToScale;
    }

    public final android.util.Size getOriginalSelectedChildSize() {
        return this.originalSelectedChildSize;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PreferredChildSize(cropRectBeforeScaling=");
        sb.append(this.cropRectBeforeScaling);
        sb.append(", childSizeToScale=");
        sb.append(this.childSizeToScale);
        sb.append(", originalSelectedChildSize=");
        sb.append(this.originalSelectedChildSize);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.cropRectBeforeScaling.hashCode() * 31) + this.childSizeToScale.hashCode()) * 31) + this.originalSelectedChildSize.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.core.streamsharing.PreferredChildSize)) {
            return false;
        }
        androidx.camera.core.streamsharing.PreferredChildSize preferredChildSize = (androidx.camera.core.streamsharing.PreferredChildSize) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cropRectBeforeScaling, preferredChildSize.cropRectBeforeScaling) && kotlin.jvm.internal.Intrinsics.areEqual(this.childSizeToScale, preferredChildSize.childSizeToScale) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalSelectedChildSize, preferredChildSize.originalSelectedChildSize);
    }

    public final androidx.camera.core.streamsharing.PreferredChildSize copy(android.graphics.Rect cropRectBeforeScaling, android.util.Size childSizeToScale, android.util.Size originalSelectedChildSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cropRectBeforeScaling, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childSizeToScale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalSelectedChildSize, "");
        return new androidx.camera.core.streamsharing.PreferredChildSize(cropRectBeforeScaling, childSizeToScale, originalSelectedChildSize);
    }

    /* renamed from: component3, reason: from getter */
    public final android.util.Size getOriginalSelectedChildSize() {
        return this.originalSelectedChildSize;
    }

    /* renamed from: component2, reason: from getter */
    public final android.util.Size getChildSizeToScale() {
        return this.childSizeToScale;
    }

    /* renamed from: component1, reason: from getter */
    public final android.graphics.Rect getCropRectBeforeScaling() {
        return this.cropRectBeforeScaling;
    }

    public static /* synthetic */ androidx.camera.core.streamsharing.PreferredChildSize copy$default(androidx.camera.core.streamsharing.PreferredChildSize preferredChildSize, android.graphics.Rect rect, android.util.Size size, android.util.Size size2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rect = preferredChildSize.cropRectBeforeScaling;
        }
        if ((i & 2) != 0) {
            size = preferredChildSize.childSizeToScale;
        }
        if ((i & 4) != 0) {
            size2 = preferredChildSize.originalSelectedChildSize;
        }
        return preferredChildSize.copy(rect, size, size2);
    }
}
