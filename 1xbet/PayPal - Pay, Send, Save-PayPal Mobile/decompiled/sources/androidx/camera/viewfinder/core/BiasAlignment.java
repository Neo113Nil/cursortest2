package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/camera/viewfinder/core/BiasAlignment;", "Landroidx/camera/viewfinder/core/impl/Alignment;", "", "p0", "p1", "<init>", "(FF)V", "Landroid/util/SizeF;", "", "p2", "Landroidx/camera/viewfinder/core/impl/OffsetF;", "align-41g9ag8", "(Landroid/util/SizeF;Landroid/util/SizeF;I)J", "align", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class BiasAlignment implements androidx.camera.viewfinder.core.impl.Alignment {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;
    private final float getHighSpeedVideoSizes;

    public BiasAlignment(float f, float f2) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoSizes = f2;
    }

    @Override // androidx.camera.viewfinder.core.impl.Alignment
    /* renamed from: align-41g9ag8 */
    public final long mo1042align41g9ag8(android.util.SizeF p0, android.util.SizeF p1, int p2) {
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        float width = (p1.getWidth() - p0.getWidth()) / 2.0f;
        float height = (p1.getHeight() - p0.getHeight()) / 2.0f;
        if (p2 == 0) {
            f = this.Camera2StreamConfigurationMap;
        } else {
            f = (-1.0f) * this.Camera2StreamConfigurationMap;
        }
        return androidx.camera.viewfinder.core.impl.TransformationsKt.OffsetF(width * (f + 1.0f), height * (this.getHighSpeedVideoSizes + 1.0f));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BiasAlignment(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Float.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.camera.viewfinder.core.BiasAlignment)) {
            return false;
        }
        androidx.camera.viewfinder.core.BiasAlignment biasAlignment = (androidx.camera.viewfinder.core.BiasAlignment) p0;
        return java.lang.Float.compare(this.Camera2StreamConfigurationMap, biasAlignment.Camera2StreamConfigurationMap) == 0 && java.lang.Float.compare(this.getHighSpeedVideoSizes, biasAlignment.getHighSpeedVideoSizes) == 0;
    }
}
