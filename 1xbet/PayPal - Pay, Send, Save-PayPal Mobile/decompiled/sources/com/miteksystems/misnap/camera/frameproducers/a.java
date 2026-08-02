package com.miteksystems.misnap.camera.frameproducers;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 ¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/a;", "Lcom/miteksystems/misnap/core/Frame;", "", "close", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/util/Size;", "a", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "imageSize", util.h.xy.cb.b.f1091, com.visa.cbp.getEncExpo.warmup, "getImageFormat", "()I", "imageFormat", "c", "getRotationDegrees", "rotationDegrees", "", "d", "[B", "getImageBytes", "()[B", "imageBytes", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getCloseCallBack", "()Lkotlin/jvm/functions/Function0;", "closeCallBack", "<init>", "(Landroid/util/Size;II[BLkotlin/jvm/functions/Function0;)V", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class a implements com.miteksystems.misnap.core.Frame {
    private final android.util.Size Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TestFrame(imageSize=");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(", imageFormat=");
        sb.append(getGetHighResolutionOutputSizeshNQ4ISI());
        sb.append(", rotationDegrees=");
        sb.append(getGetHighSpeedVideoFpsRangesFor());
        sb.append(", imageBytes=");
        sb.append(java.util.Arrays.toString(getGetHighSpeedVideoSizes()));
        sb.append(", closeCallBack=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((getCamera2StreamConfigurationMap().hashCode() * 31) + java.lang.Integer.hashCode(getGetHighResolutionOutputSizeshNQ4ISI())) * 31) + java.lang.Integer.hashCode(getGetHighSpeedVideoFpsRangesFor())) * 31) + java.util.Arrays.hashCode(getGetHighSpeedVideoSizes())) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getRotationDegrees, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getImageSize, reason: from getter */
    public final android.util.Size getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getImageFormat, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.miteksystems.misnap.core.Frame
    /* renamed from: getImageBytes, reason: from getter */
    public final byte[] getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final com.miteksystems.misnap.core.Frame.FrameInfo[] getFrameInfos() {
        return com.miteksystems.misnap.core.Frame.DefaultImpls.getFrameInfos(this);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.camera.frameproducers.a)) {
            return false;
        }
        com.miteksystems.misnap.camera.frameproducers.a aVar = (com.miteksystems.misnap.camera.frameproducers.a) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getCamera2StreamConfigurationMap(), aVar.getCamera2StreamConfigurationMap()) && getGetHighResolutionOutputSizeshNQ4ISI() == aVar.getGetHighResolutionOutputSizeshNQ4ISI() && getGetHighSpeedVideoFpsRangesFor() == aVar.getGetHighSpeedVideoFpsRangesFor() && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoSizes(), aVar.getGetHighSpeedVideoSizes()) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, aVar.getHighSpeedVideoFpsRanges);
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final void close() {
        this.getHighSpeedVideoFpsRanges.invoke();
    }

    public a(android.util.Size size, int i, byte[] bArr, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = size;
        this.getHighResolutionOutputSizeshNQ4ISI = 256;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = bArr;
        this.getHighSpeedVideoFpsRanges = function0;
    }
}
