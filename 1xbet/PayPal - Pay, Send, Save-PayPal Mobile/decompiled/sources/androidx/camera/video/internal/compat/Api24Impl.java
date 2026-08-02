package androidx.camera.video.internal.compat;

/* loaded from: classes6.dex */
public final class Api24Impl {
    private Api24Impl() {
    }

    public static int getTimestamp(android.media.AudioRecord audioRecord, android.media.AudioTimestamp audioTimestamp, int i) {
        return audioRecord.getTimestamp(audioTimestamp, i);
    }

    public static int getClientAudioSessionId(android.media.AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }
}
