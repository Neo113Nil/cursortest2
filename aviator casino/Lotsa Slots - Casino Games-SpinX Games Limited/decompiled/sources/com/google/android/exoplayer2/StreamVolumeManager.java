package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class StreamVolumeManager {
    private static final java.lang.String TAG = "StreamVolumeManager";
    private static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private static final int VOLUME_FLAGS = 1;
    private final android.content.Context applicationContext;
    private final android.media.AudioManager audioManager;
    private final android.os.Handler eventHandler;
    private final com.google.android.exoplayer2.StreamVolumeManager.Listener listener;
    private boolean muted;
    private com.google.android.exoplayer2.StreamVolumeManager.VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    public StreamVolumeManager(android.content.Context context, android.os.Handler handler, com.google.android.exoplayer2.StreamVolumeManager.Listener listener) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.eventHandler = handler;
        this.listener = listener;
        android.media.AudioManager audioManager = (android.media.AudioManager) com.google.android.exoplayer2.util.Assertions.checkStateNotNull((android.media.AudioManager) applicationContext.getSystemService("audio"));
        this.audioManager = audioManager;
        this.streamType = 3;
        this.volume = getVolumeFromManager(audioManager, 3);
        this.muted = getMutedFromManager(audioManager, this.streamType);
        com.google.android.exoplayer2.StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = new com.google.android.exoplayer2.StreamVolumeManager.VolumeChangeReceiver();
        try {
            com.google.android.exoplayer2.util.Util.registerReceiverNotExported(applicationContext, volumeChangeReceiver, new android.content.IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (java.lang.RuntimeException e) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Error registering stream volume receiver", e);
        }
    }

    public void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        updateVolumeAndNotifyIfChanged();
        this.listener.onStreamTypeChanged(i);
    }

    public int getMinVolume() {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 28) {
            return this.audioManager.getStreamMinVolume(this.streamType);
        }
        return 0;
    }

    public int getMaxVolume() {
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isMuted() {
        return this.muted;
    }

    public void setVolume(int i) {
        if (i < getMinVolume() || i > getMaxVolume()) {
            return;
        }
        this.audioManager.setStreamVolume(this.streamType, i, 1);
        updateVolumeAndNotifyIfChanged();
    }

    public void increaseVolume() {
        if (this.volume >= getMaxVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, 1, 1);
        updateVolumeAndNotifyIfChanged();
    }

    public void decreaseVolume() {
        if (this.volume <= getMinVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, -1, 1);
        updateVolumeAndNotifyIfChanged();
    }

    public void setMuted(boolean z) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(this.streamType, z ? -100 : 100, 1);
        } else {
            this.audioManager.setStreamMute(this.streamType, z);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void release() {
        com.google.android.exoplayer2.StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (java.lang.RuntimeException e) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Error unregistering stream volume receiver", e);
            }
            this.receiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.audioManager, this.streamType);
        boolean mutedFromManager = getMutedFromManager(this.audioManager, this.streamType);
        if (this.volume == volumeFromManager && this.muted == mutedFromManager) {
            return;
        }
        this.volume = volumeFromManager;
        this.muted = mutedFromManager;
        this.listener.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
    }

    private static int getVolumeFromManager(android.media.AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (java.lang.RuntimeException e) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean getMutedFromManager(android.media.AudioManager audioManager, int i) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(i);
        }
        return getVolumeFromManager(audioManager, i) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class VolumeChangeReceiver extends android.content.BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.os.Handler handler = com.google.android.exoplayer2.StreamVolumeManager.this.eventHandler;
            final com.google.android.exoplayer2.StreamVolumeManager streamVolumeManager = com.google.android.exoplayer2.StreamVolumeManager.this;
            handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.StreamVolumeManager.this.updateVolumeAndNotifyIfChanged();
                }
            });
        }
    }
}
