package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraMultiResolutionStreamConfigurationMap;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "", "Landroidx/camera/camera2/pipe/StreamFormat;", "getOutputFormats", "()Ljava/util/List;", "getInputFormats", "format", "Landroid/hardware/camera2/params/MultiResolutionStreamInfo;", "getOutputInfo-hNQ4ISI", "(I)Ljava/util/List;", "getOutputInfo", "getInputInfo-hNQ4ISI", "getInputInfo", "", "isConcurrentReadersSupported-hNQ4ISI", "(I)Z", "isConcurrentReadersSupported"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraMultiResolutionStreamConfigurationMap extends androidx.camera.camera2.pipe.UnsafeWrapper {
    java.util.List<androidx.camera.camera2.pipe.StreamFormat> getInputFormats();

    /* renamed from: getInputInfo-hNQ4ISI, reason: not valid java name */
    java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo> mo413getInputInfohNQ4ISI(int format);

    java.util.List<androidx.camera.camera2.pipe.StreamFormat> getOutputFormats();

    /* renamed from: getOutputInfo-hNQ4ISI, reason: not valid java name */
    java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo> mo414getOutputInfohNQ4ISI(int format);

    /* renamed from: isConcurrentReadersSupported-hNQ4ISI, reason: not valid java name */
    boolean mo415isConcurrentReadersSupportedhNQ4ISI(int format);
}
