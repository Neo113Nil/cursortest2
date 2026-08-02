package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static android.content.Context Camera2StreamConfigurationMap;
    private static android.media.AudioManager getHighSpeedVideoFpsRanges;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AudioFocusGain {
    }

    public static android.media.AudioManager getAudioManager(android.content.Context context) {
        synchronized (androidx.media3.common.audio.AudioManagerCompat.class) {
            final android.content.Context applicationContext = context.getApplicationContext();
            if (Camera2StreamConfigurationMap != applicationContext) {
                getHighSpeedVideoFpsRanges = null;
            }
            android.media.AudioManager audioManager = getHighSpeedVideoFpsRanges;
            if (audioManager != null) {
                return audioManager;
            }
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null && myLooper != android.os.Looper.getMainLooper()) {
                final androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
                androidx.media3.common.util.BackgroundExecutor.get().execute(new java.lang.Runnable() { // from class: androidx.media3.common.audio.AudioManagerCompat$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.common.audio.AudioManagerCompat.getHighSpeedVideoFpsRangesFor(applicationContext, conditionVariable);
                    }
                });
                conditionVariable.blockUninterruptible();
                return (android.media.AudioManager) com.google.common.base.Preconditions.checkNotNull(getHighSpeedVideoFpsRanges);
            }
            android.media.AudioManager audioManager2 = (android.media.AudioManager) applicationContext.getSystemService("audio");
            getHighSpeedVideoFpsRanges = audioManager2;
            return (android.media.AudioManager) com.google.common.base.Preconditions.checkNotNull(audioManager2);
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(android.content.Context context, androidx.media3.common.util.ConditionVariable conditionVariable) {
        getHighSpeedVideoFpsRanges = (android.media.AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int requestAudioFocus(android.media.AudioManager audioManager, androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat) {
        return audioManager.requestAudioFocus(audioFocusRequestCompat.getHighSpeedVideoSizes());
    }

    public static int abandonAudioFocusRequest(android.media.AudioManager audioManager, androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequestCompat.getHighSpeedVideoSizes());
    }

    public static int getStreamMaxVolume(android.media.AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    public static int getStreamMinVolume(android.media.AudioManager audioManager, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i);
        }
        return 0;
    }

    public static int getStreamVolume(android.media.AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w("AudioManagerCompat", "Could not retrieve stream volume for stream type ".concat(java.lang.String.valueOf(i)), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public static boolean isStreamMute(android.media.AudioManager audioManager, int i) {
        return audioManager.isStreamMute(i);
    }

    private AudioManagerCompat() {
    }
}
