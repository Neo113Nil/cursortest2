package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\u0011J+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u0012J)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0014\u0010#\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R&\u0010%\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidFrameMetadata;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "Landroid/hardware/camera2/CaptureResult;", "captureResult", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "<init>", "(Landroid/hardware/camera2/CaptureResult;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "T", "Landroidx/camera/camera2/pipe/Metadata$Key;", "key", "get", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/hardware/camera2/CaptureResult$Key;", "(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;", "(Landroid/hardware/camera2/CaptureResult$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/hardware/camera2/CaptureResult;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "()J", "frameNumber", "", "extraMetadata", "Ljava/util/Map;", "getExtraMetadata", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFrameMetadata implements androidx.camera.camera2.pipe.FrameMetadata {
    private final java.lang.String camera;
    private final java.util.Map<?, java.lang.Object> extraMetadata;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.hardware.camera2.CaptureResult Camera2StreamConfigurationMap;

    private AndroidFrameMetadata(android.hardware.camera2.CaptureResult captureResult, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = captureResult;
        this.camera = str;
        this.extraMetadata = kotlin.collections.MapsKt.emptyMap();
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getCamera-Dz_R5H8, reason: from getter */
    public final java.lang.String getCamera() {
        return this.camera;
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
    /* renamed from: getFrameNumber-Ugla2oM */
    public final long mo496getFrameNumberUgla2oM() {
        return androidx.camera.camera2.pipe.FrameNumber.m498constructorimpl(this.Camera2StreamConfigurationMap.getFrameNumber());
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public final java.util.Map<?, java.lang.Object> getExtraMetadata() {
        return this.extraMetadata;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureResult.class))) {
            java.lang.Object obj = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (T) obj;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.TotalCaptureResult.class)) || (t = (T) this.Camera2StreamConfigurationMap) == null) {
            return null;
        }
        return t;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameMetadata(camera: ");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(getCamera()));
        sb.append(", frameNumber: ");
        sb.append(this.Camera2StreamConfigurationMap.getFrameNumber());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public final <T> T getOrDefault(androidx.camera.camera2.pipe.Metadata.Key<T> key, T r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return r3;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public final <T> T get(androidx.camera.camera2.pipe.Metadata.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return null;
    }

    public /* synthetic */ AndroidFrameMetadata(android.hardware.camera2.CaptureResult captureResult, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(captureResult, str);
    }
}
