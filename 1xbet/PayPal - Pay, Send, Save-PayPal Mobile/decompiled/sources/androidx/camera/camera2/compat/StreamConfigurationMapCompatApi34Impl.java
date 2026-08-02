package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/compat/StreamConfigurationMapCompatApi34Impl;", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompatBaseImpl;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "map", "<init>", "(Landroid/hardware/camera2/params/StreamConfigurationMap;)V", "", "", "getOutputFormats", "()[Ljava/lang/Integer;", "format", "Landroid/util/Size;", "getOutputSizes", "(I)[Landroid/util/Size;", "getHighResolutionOutputSizes", io.ktor.http.ContentDisposition.Parameters.Size, "", "getOutputMinFrameDuration", "(ILandroid/util/Size;)J", "", "getHighSpeedVideoFpsRangesFor", "()Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamConfigurationMapCompatApi34Impl extends androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl {
    public StreamConfigurationMapCompatApi34Impl(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        return androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public final java.lang.Integer[] getOutputFormats() {
        java.lang.Integer[] outputFormats = super.getOutputFormats();
        if (!getHighSpeedVideoFpsRangesFor()) {
            return outputFormats;
        }
        if (outputFormats == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : outputFormats) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (java.lang.Integer[]) arrayList.toArray(new java.lang.Integer[0]);
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public final android.util.Size[] getOutputSizes(int format) {
        if (format == 4101 && getHighSpeedVideoFpsRangesFor()) {
            return null;
        }
        return super.getOutputSizes(format);
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public final android.util.Size[] getHighResolutionOutputSizes(int format) {
        if (format == 4101 && getHighSpeedVideoFpsRangesFor()) {
            return null;
        }
        return super.getHighResolutionOutputSizes(format);
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public final long getOutputMinFrameDuration(int format, android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        if (format == 4101 && getHighSpeedVideoFpsRangesFor()) {
            return 0L;
        }
        return super.getOutputMinFrameDuration(format, size);
    }
}
