package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\u0011J+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u0012J)\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u0005\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CorrectedFrameMetadata;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "frameMetadata", "", "", "extraMetadata", "<init>", "(Landroidx/camera/camera2/pipe/FrameMetadata;Ljava/util/Map;)V", "T", "Landroidx/camera/camera2/pipe/Metadata$Key;", "key", "get", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/hardware/camera2/CaptureResult$Key;", "(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;", "(Landroid/hardware/camera2/CaptureResult$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/FrameMetadata;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getExtraMetadata", "()Ljava/util/Map;", "setExtraMetadata", "(Ljava/util/Map;)V", "Landroidx/camera/camera2/pipe/CameraId;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "()J", "frameNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CorrectedFrameMetadata implements androidx.camera.camera2.pipe.FrameMetadata {
    private java.util.Map<?, ? extends java.lang.Object> extraMetadata;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.FrameMetadata Camera2StreamConfigurationMap;

    public CorrectedFrameMetadata(androidx.camera.camera2.pipe.FrameMetadata frameMetadata, java.util.Map<?, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.Camera2StreamConfigurationMap = frameMetadata;
        this.extraMetadata = map;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public final java.util.Map<?, java.lang.Object> getExtraMetadata() {
        return this.extraMetadata;
    }

    public final void setExtraMetadata(java.util.Map<?, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.extraMetadata = map;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public final <T> T get(androidx.camera.camera2.pipe.Metadata.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t = (T) getExtraMetadata().get(key);
        return t == null ? (T) this.Camera2StreamConfigurationMap.get(key) : t;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public final <T> T getOrDefault(androidx.camera.camera2.pipe.Metadata.Key<T> key, T r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t = (T) get(key);
        return t == null ? r3 : t;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public final <T> T get(android.hardware.camera2.CaptureResult.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t = (T) getExtraMetadata().get(key);
        return t == null ? (T) this.Camera2StreamConfigurationMap.get(key) : t;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public final <T> T getOrDefault(android.hardware.camera2.CaptureResult.Key<T> key, T r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t = (T) get(key);
        return t == null ? r3 : t;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getCamera-Dz_R5H8 */
    public final java.lang.String mo495getCameraDz_R5H8() {
        return this.Camera2StreamConfigurationMap.mo495getCameraDz_R5H8();
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getFrameNumber-Ugla2oM */
    public final long mo496getFrameNumberUgla2oM() {
        return this.Camera2StreamConfigurationMap.mo496getFrameNumberUgla2oM();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) this.Camera2StreamConfigurationMap.unwrapAs(type);
    }
}
