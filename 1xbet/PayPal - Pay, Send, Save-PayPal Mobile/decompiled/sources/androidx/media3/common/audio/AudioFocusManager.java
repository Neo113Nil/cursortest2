package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class AudioFocusManager {
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private androidx.media3.common.AudioAttributes Camera2StreamConfigurationMap;
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
    private androidx.media3.common.audio.AudioFocusRequestCompat getHighSpeedVideoFpsRanges;
    private final com.google.common.base.Supplier<android.media.AudioManager> getHighSpeedVideoFpsRangesFor;
    private androidx.media3.common.audio.AudioFocusManager.PlayerControl getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private float getOutputMinFrameDuration = 1.0f;
    private int getHighSpeedVideoSizes = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    public AudioFocusManager(final android.content.Context context, android.os.Looper looper, androidx.media3.common.audio.AudioFocusManager.PlayerControl playerControl) {
        this.getHighSpeedVideoFpsRangesFor = com.google.common.base.Suppliers.memoize(new com.google.common.base.Supplier() { // from class: androidx.media3.common.audio.AudioFocusManager$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                android.media.AudioManager audioManager;
                audioManager = androidx.media3.common.audio.AudioManagerCompat.getAudioManager(context);
                return audioManager;
            }
        });
        this.getHighSpeedVideoSizesFor = playerControl;
        this.getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler(looper);
    }

    public final float getVolumeMultiplier() {
        return this.getOutputMinFrameDuration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r6.contentType == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        int i;
        if (java.util.Objects.equals(this.Camera2StreamConfigurationMap, audioAttributes)) {
            return;
        }
        this.Camera2StreamConfigurationMap = audioAttributes;
        if (audioAttributes != null) {
            i = 2;
            switch (audioAttributes.usage) {
                case 0:
                    androidx.media3.common.util.Log.w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                case 1:
                case 14:
                    i = 1;
                    break;
                case 2:
                case 4:
                    break;
                case 15:
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unidentified audio usage: ");
                    sb.append(audioAttributes.usage);
                    androidx.media3.common.util.Log.w("AudioFocusManager", sb.toString());
                case 3:
                    i = 0;
                    break;
                case 11:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    i = 3;
                    break;
                case 16:
                    i = 4;
                    break;
            }
            this.getInputFormats = i;
            com.google.common.base.Preconditions.checkArgument(i != 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        i = 0;
        this.getInputFormats = i;
        com.google.common.base.Preconditions.checkArgument(i != 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void release() {
        this.getHighSpeedVideoSizesFor = null;
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes(0);
    }

    private void getHighSpeedVideoFpsRanges() {
        int i = this.getHighSpeedVideoSizes;
        if (i == 1 || i == 0 || this.getHighSpeedVideoFpsRanges == null) {
            return;
        }
        androidx.media3.common.audio.AudioManagerCompat.abandonAudioFocusRequest(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges);
    }

    private void getHighSpeedVideoSizes(int i) {
        if (this.getHighSpeedVideoSizes != i) {
            this.getHighSpeedVideoSizes = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.getOutputMinFrameDuration != f) {
                this.getOutputMinFrameDuration = f;
                androidx.media3.common.audio.AudioFocusManager.PlayerControl playerControl = this.getHighSpeedVideoSizesFor;
                if (playerControl != null) {
                    playerControl.setVolumeMultiplier(f);
                }
            }
        }
    }

    /* renamed from: $r8$lambda$K-Cg37zmwP_RajgD4dsHtFvSy9M, reason: not valid java name */
    public static /* synthetic */ void m9176$r8$lambda$KCg37zmwP_RajgD4dsHtFvSy9M(androidx.media3.common.audio.AudioFocusManager audioFocusManager, int i) {
        androidx.media3.common.AudioAttributes audioAttributes;
        if (i == -3 || i == -2) {
            if (i != -2 && ((audioAttributes = audioFocusManager.Camera2StreamConfigurationMap) == null || audioAttributes.contentType != 1)) {
                audioFocusManager.getHighSpeedVideoSizes(4);
                return;
            }
            androidx.media3.common.audio.AudioFocusManager.PlayerControl playerControl = audioFocusManager.getHighSpeedVideoSizesFor;
            if (playerControl != null) {
                playerControl.executePlayerCommand(0);
            }
            audioFocusManager.getHighSpeedVideoSizes(3);
            return;
        }
        if (i == -1) {
            androidx.media3.common.audio.AudioFocusManager.PlayerControl playerControl2 = audioFocusManager.getHighSpeedVideoSizesFor;
            if (playerControl2 != null) {
                playerControl2.executePlayerCommand(-1);
            }
            audioFocusManager.getHighSpeedVideoFpsRanges();
            audioFocusManager.getHighSpeedVideoSizes(1);
            return;
        }
        if (i == 1) {
            audioFocusManager.getHighSpeedVideoSizes(2);
            androidx.media3.common.audio.AudioFocusManager.PlayerControl playerControl3 = audioFocusManager.getHighSpeedVideoSizesFor;
            if (playerControl3 != null) {
                playerControl3.executePlayerCommand(1);
                return;
            }
            return;
        }
        androidx.media3.common.util.Log.w("AudioFocusManager", "Unknown focus change type: ".concat(java.lang.String.valueOf(i)));
    }

    public final int updateAudioFocus(boolean z, int i) {
        int i2;
        androidx.media3.common.audio.AudioFocusRequestCompat.Builder buildUpon;
        if (i == 1 || (i2 = this.getInputFormats) != 1) {
            getHighSpeedVideoFpsRanges();
            getHighSpeedVideoSizes(0);
            return 1;
        }
        if (!z) {
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 != 1) {
                return i3 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.getHighSpeedVideoSizes == 2) {
            return 1;
        }
        androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat = this.getHighSpeedVideoFpsRanges;
        if (audioFocusRequestCompat == null || this.getInputSizeshNQ4ISI) {
            if (audioFocusRequestCompat == null) {
                buildUpon = new androidx.media3.common.audio.AudioFocusRequestCompat.Builder(i2);
            } else {
                buildUpon = audioFocusRequestCompat.buildUpon();
            }
            androidx.media3.common.AudioAttributes audioAttributes = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = buildUpon.setAudioAttributes((androidx.media3.common.AudioAttributes) com.google.common.base.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap)).setWillPauseWhenDucked(audioAttributes != null && audioAttributes.contentType == 1).setOnAudioFocusChangeListener(new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.common.audio.AudioFocusManager$$ExternalSyntheticLambda0
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i4) {
                    androidx.media3.common.audio.AudioFocusManager.m9176$r8$lambda$KCg37zmwP_RajgD4dsHtFvSy9M(androidx.media3.common.audio.AudioFocusManager.this, i4);
                }
            }, this.getHighResolutionOutputSizeshNQ4ISI).build();
            this.getInputSizeshNQ4ISI = false;
        }
        if (androidx.media3.common.audio.AudioManagerCompat.requestAudioFocus(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges) == 1) {
            getHighSpeedVideoSizes(2);
            return 1;
        }
        getHighSpeedVideoSizes(1);
        return -1;
    }
}
