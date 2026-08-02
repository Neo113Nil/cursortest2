package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/miteksystems/misnap/core/internal/FrameWrapper;", "Lcom/miteksystems/misnap/core/Frame;", "Landroid/util/Size;", "p0", "", "p1", "p2", "", "p3", "<init>", "(Landroid/util/Size;II[B)V", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getImageFormat", "getHighSpeedVideoFpsRangesFor", "getRotationDegrees", "getHighSpeedVideoFpsRanges", "[B", "getImageBytes", "()[B"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final /* data */ class FrameWrapper implements com.miteksystems.misnap.core.Frame {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.util.Size getHighResolutionOutputSizeshNQ4ISI;

    @Override // com.miteksystems.misnap.core.Frame
    public final void close() {
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameWrapper(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(getGetHighResolutionOutputSizeshNQ4ISI());
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(getGetHighSpeedVideoFpsRangesFor());
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(java.util.Arrays.toString(getGetHighSpeedVideoFpsRanges()));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((getGetHighResolutionOutputSizeshNQ4ISI().hashCode() * 31) + java.lang.Integer.hashCode(getGetHighSpeedVideoFpsRangesFor())) * 31) + java.lang.Integer.hashCode(getCamera2StreamConfigurationMap())) * 31) + java.util.Arrays.hashCode(getGetHighSpeedVideoFpsRanges());
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getRotationDegrees, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getImageSize, reason: from getter */
    public final android.util.Size getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getImageFormat, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getImageBytes, reason: from getter */
    public final byte[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final com.miteksystems.misnap.core.Frame.FrameInfo[] getFrameInfos() {
        return com.miteksystems.misnap.core.Frame.DefaultImpls.getFrameInfos(this);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.miteksystems.misnap.core.internal.FrameWrapper)) {
            return false;
        }
        com.miteksystems.misnap.core.internal.FrameWrapper frameWrapper = (com.miteksystems.misnap.core.internal.FrameWrapper) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(getGetHighResolutionOutputSizeshNQ4ISI(), frameWrapper.getGetHighResolutionOutputSizeshNQ4ISI()) && getGetHighSpeedVideoFpsRangesFor() == frameWrapper.getGetHighSpeedVideoFpsRangesFor() && getCamera2StreamConfigurationMap() == frameWrapper.getCamera2StreamConfigurationMap() && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges(), frameWrapper.getGetHighSpeedVideoFpsRanges());
    }

    public FrameWrapper(android.util.Size size, int i, int i2, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = size;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = bArr;
    }
}
