package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/impl/CameraValidator;", "", "Landroidx/camera/core/impl/CameraRepository;", "cameraRepository", "", "validateOnFirstInit", "(Landroidx/camera/core/impl/CameraRepository;)V", "", "Landroidx/camera/core/impl/CameraInternal;", "currentCameras", "Landroidx/camera/core/CameraIdentifier;", "removedCameras", "", "isChangeInvalid", "(Ljava/util/Set;Ljava/util/Set;)Z", "Companion", "CameraIdListIncorrectException"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.impl.CameraValidator.Companion INSTANCE = androidx.camera.core.impl.CameraValidator.Companion.getHighResolutionOutputSizeshNQ4ISI;

    boolean isChangeInvalid(java.util.Set<? extends androidx.camera.core.impl.CameraInternal> currentCameras, java.util.Set<androidx.camera.core.CameraIdentifier> removedCameras);

    void validateOnFirstInit(androidx.camera.core.impl.CameraRepository cameraRepository) throws androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/core/impl/CameraValidator$CameraIdListIncorrectException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "message", "", "availableCameraCount", "", "cause", "<init>", "(Ljava/lang/String;ILjava/lang/Throwable;)V", com.visa.cbp.getEncExpo.warmup, "getAvailableCameraCount", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraIdListIncorrectException extends java.lang.Exception {
        private final int availableCameraCount;

        public CameraIdListIncorrectException(java.lang.String str, int i, java.lang.Throwable th) {
            super(str, th);
            this.availableCameraCount = i;
        }

        public final int getAvailableCameraCount() {
            return this.availableCameraCount;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/core/impl/CameraValidator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraSelector;", "availableCamerasSelector", "Landroidx/camera/core/impl/CameraValidator;", "create", "(Landroid/content/Context;Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/impl/CameraValidator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.core.impl.CameraValidator.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.CameraValidator.Companion();

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.CameraValidator create(android.content.Context context, androidx.camera.core.CameraSelector availableCamerasSelector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.camera.core.impl.CameraValidatorImpl(context, availableCamerasSelector);
        }
    }

    @kotlin.jvm.JvmStatic
    static androidx.camera.core.impl.CameraValidator create(android.content.Context context, androidx.camera.core.CameraSelector cameraSelector) {
        return INSTANCE.create(context, cameraSelector);
    }
}
