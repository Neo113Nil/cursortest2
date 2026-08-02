package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\f\u0010\u0011J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u001d\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0013\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0013\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\""}, d2 = {"Landroidx/camera/camera2/compat/StreamConfigurationMapCompatBaseImpl;", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap", "<init>", "(Landroid/hardware/camera2/params/StreamConfigurationMap;)V", "", "", "getOutputFormats", "()[Ljava/lang/Integer;", "format", "Landroid/util/Size;", "getOutputSizes", "(I)[Landroid/util/Size;", "T", "Ljava/lang/Class;", "klass", "(Ljava/lang/Class;)[Landroid/util/Size;", "getHighResolutionOutputSizes", "Landroid/util/Range;", "getHighSpeedVideoFpsRanges", "()[Landroid/util/Range;", io.ktor.http.ContentDisposition.Parameters.Size, "getHighSpeedVideoFpsRangesFor", "(Landroid/util/Size;)[Landroid/util/Range;", "getHighSpeedVideoSizes", "()[Landroid/util/Size;", "fpsRange", "getHighSpeedVideoSizesFor", "(Landroid/util/Range;)[Landroid/util/Size;", "", "getOutputMinFrameDuration", "(ILandroid/util/Size;)J", "unwrap", "()Landroid/hardware/camera2/params/StreamConfigurationMap;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "getStreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class StreamConfigurationMapCompatBaseImpl implements androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {
    private final android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;

    public StreamConfigurationMapCompatBaseImpl(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        this.streamConfigurationMap = streamConfigurationMap;
    }

    public final android.hardware.camera2.params.StreamConfigurationMap getStreamConfigurationMap() {
        return this.streamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Integer[] getOutputFormats() {
        int[] iArr;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = this.streamConfigurationMap;
        } catch (java.lang.IllegalArgumentException e) {
            androidx.camera.core.Logger.w("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (java.lang.NullPointerException e2) {
            androidx.camera.core.Logger.w("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (streamConfigurationMap != null) {
            iArr = streamConfigurationMap.getOutputFormats();
            if (iArr == null) {
                return kotlin.collections.ArraysKt.toTypedArray(iArr);
            }
            return null;
        }
        iArr = null;
        if (iArr == null) {
        }
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getOutputSizes(int format) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(format);
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public <T> android.util.Size[] getOutputSizes(java.lang.Class<T> klass) {
        android.util.Size[] outputSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        return (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(klass)) == null) ? new android.util.Size[0] : outputSizes;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getHighResolutionOutputSizes(int format) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighResolutionOutputSizes(format);
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRanges() {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighSpeedVideoFpsRanges();
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRangesFor(android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getHighSpeedVideoSizes() {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighSpeedVideoSizes();
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getHighSpeedVideoSizesFor(android.util.Range<java.lang.Integer> fpsRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fpsRange, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighSpeedVideoSizesFor(fpsRange);
        }
        return null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public long getOutputMinFrameDuration(int format, android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(format, size);
        }
        return 0L;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.hardware.camera2.params.StreamConfigurationMap unwrap() {
        return this.streamConfigurationMap;
    }
}
