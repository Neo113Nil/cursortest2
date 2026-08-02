package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J&\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H&¢\u0006\u0004\b\u000f\u0010\u0013J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000bH&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001e\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001e\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%R\u001e\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "Landroidx/camera/camera2/pipe/Metadata;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "T", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "key", "get", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "imageFormat", "", "Landroid/util/Size;", "getOutputSizes", "(I)Ljava/util/Set;", "Ljava/lang/Class;", "klass", "(Ljava/lang/Class;)Ljava/util/Set;", "captureSize", "format", "getPostviewSizes", "(Landroid/util/Size;I)Ljava/util/Set;", "Landroidx/camera/camera2/pipe/CameraId;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "getCameraExtension", "()I", "cameraExtension", "", "isRedacted", "()Z", "isPostviewSupported", "isCaptureProgressSupported", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroid/hardware/camera2/CaptureRequest$Key;", "getRequestKeys", "requestKeys", "Landroid/hardware/camera2/CaptureResult$Key;", "getResultKeys", "resultKeys"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraExtensionMetadata extends androidx.camera.camera2.pipe.Metadata, androidx.camera.camera2.pipe.UnsafeWrapper {
    <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key);

    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    java.lang.String mo344getCameraDz_R5H8();

    int getCameraExtension();

    java.util.Set<android.hardware.camera2.CameraCharacteristics.Key<?>> getKeys();

    <T> T getOrDefault(android.hardware.camera2.CameraCharacteristics.Key<T> key, T r2);

    java.util.Set<android.util.Size> getOutputSizes(int imageFormat);

    java.util.Set<android.util.Size> getOutputSizes(java.lang.Class<?> klass);

    java.util.Set<android.util.Size> getPostviewSizes(android.util.Size captureSize, int format);

    java.util.Set<android.hardware.camera2.CaptureRequest.Key<?>> getRequestKeys();

    java.util.Set<android.hardware.camera2.CaptureResult.Key<?>> getResultKeys();

    boolean isCaptureProgressSupported();

    boolean isPostviewSupported();

    boolean isRedacted();
}
