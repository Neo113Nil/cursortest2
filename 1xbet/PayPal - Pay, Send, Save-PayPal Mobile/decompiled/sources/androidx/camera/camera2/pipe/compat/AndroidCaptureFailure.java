package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCaptureFailure;", "Landroidx/camera/camera2/pipe/RequestFailure;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroid/hardware/camera2/CaptureFailure;", "captureFailure", "<init>", "(Landroidx/camera/camera2/pipe/RequestMetadata;Landroid/hardware/camera2/CaptureFailure;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "getHighSpeedVideoFpsRangesFor", "Landroid/hardware/camera2/CaptureFailure;", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "J", "getFrameNumber-Ugla2oM", "()J", "", "reason", com.visa.cbp.getEncExpo.warmup, "getReason", "()I", "", "wasImageCaptured", "Z", "getWasImageCaptured", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidCaptureFailure implements androidx.camera.camera2.pipe.RequestFailure {
    private final long frameNumber;
    private final android.hardware.camera2.CaptureFailure getHighSpeedVideoFpsRangesFor;
    private final int reason;
    private final androidx.camera.camera2.pipe.RequestMetadata requestMetadata;
    private final boolean wasImageCaptured;

    public AndroidCaptureFailure(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, android.hardware.camera2.CaptureFailure captureFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureFailure, "");
        this.requestMetadata = requestMetadata;
        this.getHighSpeedVideoFpsRangesFor = captureFailure;
        this.frameNumber = androidx.camera.camera2.pipe.FrameNumber.m498constructorimpl(captureFailure.getFrameNumber());
        this.reason = captureFailure.getReason();
        this.wasImageCaptured = captureFailure.wasImageCaptured();
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    /* renamed from: getFrameNumber-Ugla2oM, reason: from getter */
    public final long getFrameNumber() {
        return this.frameNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final int getReason() {
        return this.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureFailure.class))) {
            return (T) this.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }
}
