package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/UnsupportedCameraColorSpaceProfiles;", "Landroidx/camera/camera2/pipe/CameraColorSpaceProfiles;", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamFormat;", "imageFormat", "", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "getSupportedColorSpaces-hNQ4ISI", "(I)Ljava/util/Set;", "getSupportedColorSpaces", "cameraColorSpace", "getSupportedImageFormatsForColorSpace-jRxjvBE", "(Ljava/lang/String;)Ljava/util/Set;", "getSupportedImageFormatsForColorSpace", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getSupportedDynamicRangeProfiles-6Yu6yh8", "(Ljava/lang/String;I)Ljava/util/Set;", "getSupportedDynamicRangeProfiles", "dynamicRangeProfile", "getSupportedColorSpacesForDynamicRange-sNWL0t8", "(IJ)Ljava/util/Set;", "getSupportedColorSpacesForDynamicRange", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsupportedCameraColorSpaceProfiles implements androidx.camera.camera2.pipe.CameraColorSpaceProfiles {
    public static final androidx.camera.camera2.pipe.UnsupportedCameraColorSpaceProfiles INSTANCE = new androidx.camera.camera2.pipe.UnsupportedCameraColorSpaceProfiles();

    private UnsupportedCameraColorSpaceProfiles() {
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpaces-hNQ4ISI */
    public final java.util.Set<androidx.camera.camera2.pipe.CameraColorSpace> mo268getSupportedColorSpaceshNQ4ISI(int imageFormat) {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedImageFormatsForColorSpace-jRxjvBE */
    public final java.util.Set<androidx.camera.camera2.pipe.StreamFormat> mo271getSupportedImageFormatsForColorSpacejRxjvBE(java.lang.String cameraColorSpace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraColorSpace, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedDynamicRangeProfiles-6Yu6yh8 */
    public final java.util.Set<androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile> mo270getSupportedDynamicRangeProfiles6Yu6yh8(java.lang.String cameraColorSpace, int imageFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraColorSpace, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpacesForDynamicRange-sNWL0t8 */
    public final java.util.Set<androidx.camera.camera2.pipe.CameraColorSpace> mo269getSupportedColorSpacesForDynamicRangesNWL0t8(int imageFormat, long dynamicRangeProfile) {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return null;
    }
}
