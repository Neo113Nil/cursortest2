package androidx.camera.video.internal.compat;

/* loaded from: classes6.dex */
public final class Api29Impl {
    private Api29Impl() {
    }

    public static android.media.AudioRecordingConfiguration getActiveRecordingConfiguration(android.media.AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static void registerAudioRecordingCallback(android.media.AudioRecord audioRecord, java.util.concurrent.Executor executor, android.media.AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    public static void unregisterAudioRecordingCallback(android.media.AudioRecord audioRecord, android.media.AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }

    public static boolean isClientSilenced(android.media.AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }
}
