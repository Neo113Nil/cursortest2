package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/FrameInfo;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/FrameMetadata;", "get-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/FrameMetadata;", "get", "getMetadata", "()Landroidx/camera/camera2/pipe/FrameMetadata;", "metadata", "getCamera-Dz_R5H8", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "()J", "frameNumber", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FrameInfo extends androidx.camera.camera2.pipe.UnsafeWrapper {
    /* renamed from: get-EfqyGwQ */
    androidx.camera.camera2.pipe.FrameMetadata mo110getEfqyGwQ(java.lang.String camera);

    /* renamed from: getCamera-Dz_R5H8 */
    java.lang.String mo111getCameraDz_R5H8();

    /* renamed from: getFrameNumber-Ugla2oM */
    long mo112getFrameNumberUgla2oM();

    androidx.camera.camera2.pipe.FrameMetadata getMetadata();

    androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata();
}
