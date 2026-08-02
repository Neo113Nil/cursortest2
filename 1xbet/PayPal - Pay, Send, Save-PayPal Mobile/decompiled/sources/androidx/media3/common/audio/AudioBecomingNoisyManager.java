package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class AudioBecomingNoisyManager {
    final androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    final android.content.Context getHighSpeedVideoFpsRanges;
    private final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoSizes;

    public interface Listener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.audio.AudioBecomingNoisyManager.Listener listener, androidx.media3.common.util.Clock clock) {
        this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
        this.getHighSpeedVideoSizes = clock.createHandler(looper, null);
        this.Camera2StreamConfigurationMap = new androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver(this, clock.createHandler(looper2, null), listener, (byte) 0);
    }

    public final void setEnabled(boolean z) {
        if (z == this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (z) {
            this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.media3.common.audio.AudioBecomingNoisyManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.common.audio.AudioBecomingNoisyManager audioBecomingNoisyManager = androidx.media3.common.audio.AudioBecomingNoisyManager.this;
                    audioBecomingNoisyManager.getHighSpeedVideoFpsRanges.registerReceiver(audioBecomingNoisyManager.Camera2StreamConfigurationMap, new android.content.IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        } else {
            this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.media3.common.audio.AudioBecomingNoisyManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.common.audio.AudioBecomingNoisyManager audioBecomingNoisyManager = androidx.media3.common.audio.AudioBecomingNoisyManager.this;
                    audioBecomingNoisyManager.getHighSpeedVideoFpsRanges.unregisterReceiver(audioBecomingNoisyManager.Camera2StreamConfigurationMap);
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    final class AudioBecomingNoisyReceiver extends android.content.BroadcastReceiver {
        private final androidx.media3.common.util.HandlerWrapper Camera2StreamConfigurationMap;
        private final androidx.media3.common.audio.AudioBecomingNoisyManager.Listener getHighSpeedVideoSizes;

        /* synthetic */ AudioBecomingNoisyReceiver(androidx.media3.common.audio.AudioBecomingNoisyManager audioBecomingNoisyManager, androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.common.audio.AudioBecomingNoisyManager.Listener listener, byte b) {
            this(handlerWrapper, listener);
        }

        private AudioBecomingNoisyReceiver(androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.common.audio.AudioBecomingNoisyManager.Listener listener) {
            this.Camera2StreamConfigurationMap = handlerWrapper;
            this.getHighSpeedVideoSizes = listener;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.Camera2StreamConfigurationMap.post(new java.lang.Runnable() { // from class: androidx.media3.common.audio.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver.getHighSpeedVideoSizes(androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver.this);
                    }
                });
            }
        }

        public static /* synthetic */ void getHighSpeedVideoSizes(androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver audioBecomingNoisyReceiver) {
            if (androidx.media3.common.audio.AudioBecomingNoisyManager.this.getHighResolutionOutputSizeshNQ4ISI) {
                audioBecomingNoisyReceiver.getHighSpeedVideoSizes.onAudioBecomingNoisy();
            }
        }
    }
}
