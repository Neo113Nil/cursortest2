package androidx.media3.exoplayer.image;

/* loaded from: classes2.dex */
public interface ImageOutput {
    public static final androidx.media3.exoplayer.image.ImageOutput NO_OP = new androidx.media3.exoplayer.image.ImageOutput() { // from class: androidx.media3.exoplayer.image.ImageOutput.1
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j, android.graphics.Bitmap bitmap) {
        }
    };

    void onDisabled();

    void onImageAvailable(long j, android.graphics.Bitmap bitmap);
}
