package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraColorSpaceProfiles;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Landroidx/camera/camera2/pipe/StreamFormat;", "imageFormat", "", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "getSupportedColorSpaces-hNQ4ISI", "(I)Ljava/util/Set;", "getSupportedColorSpaces", "cameraColorSpace", "getSupportedImageFormatsForColorSpace-jRxjvBE", "(Ljava/lang/String;)Ljava/util/Set;", "getSupportedImageFormatsForColorSpace", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getSupportedDynamicRangeProfiles-6Yu6yh8", "(Ljava/lang/String;I)Ljava/util/Set;", "getSupportedDynamicRangeProfiles", "dynamicRangeProfile", "getSupportedColorSpacesForDynamicRange-sNWL0t8", "(IJ)Ljava/util/Set;", "getSupportedColorSpacesForDynamicRange"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraColorSpaceProfiles extends androidx.camera.camera2.pipe.UnsafeWrapper {
    /* renamed from: getSupportedColorSpaces-hNQ4ISI, reason: not valid java name */
    java.util.Set<androidx.camera.camera2.pipe.CameraColorSpace> mo268getSupportedColorSpaceshNQ4ISI(int imageFormat);

    /* renamed from: getSupportedColorSpacesForDynamicRange-sNWL0t8, reason: not valid java name */
    java.util.Set<androidx.camera.camera2.pipe.CameraColorSpace> mo269getSupportedColorSpacesForDynamicRangesNWL0t8(int imageFormat, long dynamicRangeProfile);

    /* renamed from: getSupportedDynamicRangeProfiles-6Yu6yh8, reason: not valid java name */
    java.util.Set<androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile> mo270getSupportedDynamicRangeProfiles6Yu6yh8(java.lang.String cameraColorSpace, int imageFormat);

    /* renamed from: getSupportedImageFormatsForColorSpace-jRxjvBE, reason: not valid java name */
    java.util.Set<androidx.camera.camera2.pipe.StreamFormat> mo271getSupportedImageFormatsForColorSpacejRxjvBE(java.lang.String cameraColorSpace);
}
