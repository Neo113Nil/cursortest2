package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class AudioCapabilitiesReceiver {
    com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities;
    private final android.content.Context context;
    private final com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final android.os.Handler handler;
    private final com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener listener;
    private final android.content.BroadcastReceiver receiver;
    private boolean registered;

    public interface Listener {
        void onAudioCapabilitiesChanged(com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(android.content.Context context, com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener listener) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = (com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener) com.google.android.exoplayer2.util.Assertions.checkNotNull(listener);
        android.os.Handler createHandlerForCurrentOrMainLooper = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper();
        this.handler = createHandlerForCurrentOrMainLooper;
        this.receiver = com.google.android.exoplayer2.util.Util.SDK_INT >= 21 ? new com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.HdmiAudioPlugBroadcastReceiver() : null;
        android.net.Uri externalSurroundSoundGlobalSettingUri = com.google.android.exoplayer2.audio.AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver(createHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }

    public com.google.android.exoplayer2.audio.AudioCapabilities register() {
        android.content.Intent intent;
        if (this.registered) {
            return (com.google.android.exoplayer2.audio.AudioCapabilities) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.audioCapabilities);
        }
        this.registered = true;
        com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.register();
        }
        if (this.receiver != null) {
            intent = com.google.android.exoplayer2.util.Util.registerReceiverNotExported(this.context, this.receiver, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), this.handler);
        } else {
            intent = null;
        }
        com.google.android.exoplayer2.audio.AudioCapabilities capabilities = com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(this.context, intent);
        this.audioCapabilities = capabilities;
        return capabilities;
    }

    public void unregister() {
        if (this.registered) {
            this.audioCapabilities = null;
            android.content.BroadcastReceiver broadcastReceiver = this.receiver;
            if (broadcastReceiver != null) {
                this.context.unregisterReceiver(broadcastReceiver);
            }
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
            if (externalSurroundSoundSettingObserver != null) {
                externalSurroundSoundSettingObserver.unregister();
            }
            this.registered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    private final class HdmiAudioPlugBroadcastReceiver extends android.content.BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.this.onNewAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(context, intent));
        }
    }

    private final class ExternalSurroundSoundSettingObserver extends android.database.ContentObserver {
        private final android.content.ContentResolver resolver;
        private final android.net.Uri settingUri;

        public ExternalSurroundSoundSettingObserver(android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.context));
        }
    }
}
