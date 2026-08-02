package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2MultiResolutionStreamConfigurationMap;", "Landroidx/camera/camera2/pipe/CameraMultiResolutionStreamConfigurationMap;", "Landroid/hardware/camera2/params/MultiResolutionStreamConfigurationMap;", "multiResolutionStreamConfigurationMap", "<init>", "(Landroid/hardware/camera2/params/MultiResolutionStreamConfigurationMap;)V", "", "Landroidx/camera/camera2/pipe/StreamFormat;", "getOutputFormats", "()Ljava/util/List;", "getInputFormats", "format", "Landroid/hardware/camera2/params/MultiResolutionStreamInfo;", "getOutputInfo-hNQ4ISI", "(I)Ljava/util/List;", "getOutputInfo", "getInputInfo-hNQ4ISI", "getInputInfo", "", "isConcurrentReadersSupported-hNQ4ISI", "(I)Z", "isConcurrentReadersSupported", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/hardware/camera2/params/MultiResolutionStreamConfigurationMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2MultiResolutionStreamConfigurationMap implements androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.hardware.camera2.params.MultiResolutionStreamConfigurationMap getHighSpeedVideoSizes;

    public Camera2MultiResolutionStreamConfigurationMap(android.hardware.camera2.params.MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiResolutionStreamConfigurationMap, "");
        this.getHighSpeedVideoSizes = multiResolutionStreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    public final java.util.List<androidx.camera.camera2.pipe.StreamFormat> getOutputFormats() {
        int[] outputFormats = this.getHighSpeedVideoSizes.getOutputFormats();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputFormats, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(outputFormats.length);
        for (int i : outputFormats) {
            arrayList.add(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(i)));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    public final java.util.List<androidx.camera.camera2.pipe.StreamFormat> getInputFormats() {
        int[] inputFormats = this.getHighSpeedVideoSizes.getInputFormats();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputFormats, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(inputFormats.length);
        for (int i : inputFormats) {
            arrayList.add(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(i)));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    /* renamed from: getOutputInfo-hNQ4ISI */
    public final java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo> mo414getOutputInfohNQ4ISI(int format) {
        java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> outputInfo = this.getHighSpeedVideoSizes.getOutputInfo(format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputInfo, "");
        return kotlin.collections.CollectionsKt.toList(outputInfo);
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    /* renamed from: getInputInfo-hNQ4ISI */
    public final java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo> mo413getInputInfohNQ4ISI(int format) {
        java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> inputInfo = this.getHighSpeedVideoSizes.getInputInfo(format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputInfo, "");
        return kotlin.collections.CollectionsKt.toList(inputInfo);
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    /* renamed from: isConcurrentReadersSupported-hNQ4ISI */
    public final boolean mo415isConcurrentReadersSupportedhNQ4ISI(int format) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.params.MultiResolutionStreamConfigurationMap.class))) {
            java.lang.Object obj = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (T) obj;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.compat.Camera2MultiResolutionStreamConfigurationMap.class))) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return (T) this;
    }
}
