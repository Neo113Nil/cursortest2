package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public interface EncoderCallback {
    public static final androidx.camera.video.internal.encoder.EncoderCallback EMPTY = new androidx.camera.video.internal.encoder.EncoderCallback() { // from class: androidx.camera.video.internal.encoder.EncoderCallback.1
        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(androidx.camera.video.internal.encoder.EncodeException encodeException) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(androidx.camera.video.internal.encoder.EncodedData encodedData) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(androidx.camera.video.internal.encoder.OutputConfig outputConfig) {
        }
    };

    void onEncodeError(androidx.camera.video.internal.encoder.EncodeException encodeException);

    default void onEncodePaused() {
    }

    void onEncodeStart();

    void onEncodeStop();

    void onEncodedData(androidx.camera.video.internal.encoder.EncodedData encodedData);

    void onOutputConfigUpdate(androidx.camera.video.internal.encoder.OutputConfig outputConfig);
}
