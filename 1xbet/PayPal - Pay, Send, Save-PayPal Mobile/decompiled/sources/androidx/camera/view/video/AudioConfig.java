package androidx.camera.view.video;

/* loaded from: classes6.dex */
public class AudioConfig {
    public static final androidx.camera.view.video.AudioConfig AUDIO_DISABLED = new androidx.camera.view.video.AudioConfig(false);
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    private AudioConfig(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public static androidx.camera.view.video.AudioConfig create(boolean z) {
        return new androidx.camera.view.video.AudioConfig(z);
    }

    public boolean getAudioEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
