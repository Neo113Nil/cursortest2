package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J&\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/FrameMetadata;", "Landroidx/camera/camera2/pipe/Metadata;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "T", "Landroid/hardware/camera2/CaptureResult$Key;", "key", "get", "(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroid/hardware/camera2/CaptureResult$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/CameraId;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "()J", "frameNumber", "", "", "getExtraMetadata", "()Ljava/util/Map;", "extraMetadata"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FrameMetadata extends androidx.camera.camera2.pipe.Metadata, androidx.camera.camera2.pipe.UnsafeWrapper {
    <T> T get(android.hardware.camera2.CaptureResult.Key<T> key);

    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    java.lang.String mo495getCameraDz_R5H8();

    java.util.Map<?, java.lang.Object> getExtraMetadata();

    /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
    long mo496getFrameNumberUgla2oM();

    <T> T getOrDefault(android.hardware.camera2.CaptureResult.Key<T> key, T r2);
}
