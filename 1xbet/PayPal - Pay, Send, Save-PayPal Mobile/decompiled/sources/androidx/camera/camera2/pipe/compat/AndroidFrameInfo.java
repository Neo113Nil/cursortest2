package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010'\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidFrameInfo;", "Landroidx/camera/camera2/pipe/FrameInfo;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "<init>", "(Landroid/hardware/camera2/TotalCaptureResult;Ljava/lang/String;Landroidx/camera/camera2/pipe/RequestMetadata;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/FrameMetadata;", "get-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/FrameMetadata;", "get", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroid/hardware/camera2/TotalCaptureResult;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "Landroidx/camera/camera2/pipe/compat/AndroidFrameMetadata;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/compat/AndroidFrameMetadata;", "", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "getMetadata", "()Landroidx/camera/camera2/pipe/FrameMetadata;", "metadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "()J", "frameNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFrameInfo implements androidx.camera.camera2.pipe.FrameInfo {
    private final java.lang.String camera;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.hardware.camera2.TotalCaptureResult getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.CameraId, androidx.camera.camera2.pipe.FrameMetadata> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.camera2.pipe.compat.AndroidFrameMetadata getHighSpeedVideoSizes;
    private final androidx.camera.camera2.pipe.RequestMetadata requestMetadata;

    private AndroidFrameInfo(android.hardware.camera2.TotalCaptureResult totalCaptureResult, java.lang.String str, androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        java.util.Map<java.lang.String, android.hardware.camera2.CaptureResult> physicalCaptureResults;
        android.util.ArrayMap emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        this.getHighSpeedVideoFpsRangesFor = totalCaptureResult;
        this.camera = str;
        this.requestMetadata = requestMetadata;
        this.getHighSpeedVideoSizes = new androidx.camera.camera2.pipe.compat.AndroidFrameMetadata(totalCaptureResult, getCamera(), null);
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        try {
            android.os.Trace.beginSection("physicalCaptureResults");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                physicalCaptureResults = androidx.camera.camera2.pipe.compat.Api31Compat.getPhysicalCameraTotalResults(this.getHighSpeedVideoFpsRangesFor);
                kotlin.jvm.internal.Intrinsics.checkNotNull(physicalCaptureResults, "");
            } else {
                physicalCaptureResults = android.os.Build.VERSION.SDK_INT >= 28 ? androidx.camera.camera2.pipe.compat.Api28Compat.getPhysicalCaptureResults(this.getHighSpeedVideoFpsRangesFor) : kotlin.collections.MapsKt.emptyMap();
            }
            if (physicalCaptureResults != null && !physicalCaptureResults.isEmpty()) {
                android.util.ArrayMap arrayMap = new android.util.ArrayMap(physicalCaptureResults.size());
                for (java.util.Map.Entry<java.lang.String, android.hardware.camera2.CaptureResult> entry : physicalCaptureResults.entrySet()) {
                    java.lang.String m393constructorimpl = androidx.camera.camera2.pipe.CameraId.m393constructorimpl(entry.getKey());
                    arrayMap.put(androidx.camera.camera2.pipe.CameraId.m392boximpl(m393constructorimpl), new androidx.camera.camera2.pipe.compat.AndroidFrameMetadata(entry.getValue(), m393constructorimpl, null));
                }
                emptyMap = arrayMap;
                android.os.Trace.endSection();
                this.getHighResolutionOutputSizeshNQ4ISI = emptyMap;
            }
            emptyMap = kotlin.collections.MapsKt.emptyMap();
            android.os.Trace.endSection();
            this.getHighResolutionOutputSizeshNQ4ISI = emptyMap;
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    /* renamed from: getCamera-Dz_R5H8, reason: from getter */
    public final java.lang.String getCamera() {
        return this.camera;
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    public final androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    public final androidx.camera.camera2.pipe.FrameMetadata getMetadata() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    /* renamed from: get-EfqyGwQ */
    public final androidx.camera.camera2.pipe.FrameMetadata mo110getEfqyGwQ(java.lang.String camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(androidx.camera.camera2.pipe.CameraId.m392boximpl(camera));
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    /* renamed from: getFrameNumber-Ugla2oM */
    public final long getFrameNumber() {
        return this.getHighSpeedVideoSizes.mo496getFrameNumberUgla2oM();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureResult.class))) {
            java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (T) obj;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.TotalCaptureResult.class)) || (t = (T) this.getHighSpeedVideoFpsRangesFor) == null) {
            return null;
        }
        return t;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameInfo(camera: ");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.getHighSpeedVideoSizes.getCamera()));
        sb.append(", frameNumber: ");
        sb.append(this.getHighSpeedVideoSizes.mo496getFrameNumberUgla2oM());
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AndroidFrameInfo(android.hardware.camera2.TotalCaptureResult totalCaptureResult, java.lang.String str, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(totalCaptureResult, str, requestMetadata);
    }
}
