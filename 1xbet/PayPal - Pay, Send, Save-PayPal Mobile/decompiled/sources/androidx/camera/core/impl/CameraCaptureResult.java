package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraCaptureResult {
    androidx.camera.core.impl.CameraCaptureMetaData.AeMode getAeMode();

    androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState();

    androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode();

    androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState();

    androidx.camera.core.impl.CameraCaptureMetaData.AwbMode getAwbMode();

    androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState();

    default android.hardware.camera2.CaptureResult getCaptureResult() {
        return null;
    }

    androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState();

    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    default void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
        builder.setFlashState(getFlashState());
    }

    public static final class EmptyCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final android.hardware.camera2.CaptureResult getCaptureResult() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final long getTimestamp() {
            return -1L;
        }

        public static androidx.camera.core.impl.CameraCaptureResult create() {
            return new androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult();
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.AeMode getAeMode() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.CameraCaptureMetaData.AwbMode getAwbMode() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final androidx.camera.core.impl.TagBundle getTagBundle() {
            return androidx.camera.core.impl.TagBundle.emptyBundle();
        }
    }
}
