package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class AudioFocusRequestCompat {
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.common.AudioAttributes getHighSpeedVideoFpsRanges;
    private final android.media.AudioManager.OnAudioFocusChangeListener getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final boolean getInputFormats;

    AudioFocusRequestCompat(int i, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler, androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = handler;
        this.getHighSpeedVideoFpsRanges = audioAttributes;
        this.getInputFormats = z;
        this.getHighSpeedVideoFpsRangesFor = onAudioFocusChangeListener;
        this.Camera2StreamConfigurationMap = new android.media.AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes.getPlatformAudioAttributes()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final int getFocusGain() {
        return this.getHighSpeedVideoSizes;
    }

    public final androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean willPauseWhenDucked() {
        return this.getInputFormats;
    }

    public final android.media.AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final android.os.Handler getFocusChangeHandler() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.media3.common.audio.AudioFocusRequestCompat.Builder buildUpon() {
        return new androidx.media3.common.audio.AudioFocusRequestCompat.Builder();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.audio.AudioFocusRequestCompat)) {
            return false;
        }
        androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat = (androidx.media3.common.audio.AudioFocusRequestCompat) obj;
        return this.getHighSpeedVideoSizes == audioFocusRequestCompat.getHighSpeedVideoSizes && this.getInputFormats == audioFocusRequestCompat.getInputFormats && java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, audioFocusRequestCompat.getHighSpeedVideoFpsRangesFor) && java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, audioFocusRequestCompat.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, audioFocusRequestCompat.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        return java.util.Objects.hash(java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, java.lang.Boolean.valueOf(this.getInputFormats));
    }

    final android.media.AudioFocusRequest getHighSpeedVideoSizes() {
        return (android.media.AudioFocusRequest) com.google.common.base.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap);
    }

    public static final class Builder {
        private int Camera2StreamConfigurationMap;
        private androidx.media3.common.AudioAttributes getHighResolutionOutputSizeshNQ4ISI;
        private android.media.AudioManager.OnAudioFocusChangeListener getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private android.os.Handler getHighSpeedVideoSizes;

        private static boolean getHighSpeedVideoFpsRanges(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public Builder(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.AudioAttributes.DEFAULT;
            this.Camera2StreamConfigurationMap = i;
        }

        private Builder(androidx.media3.common.audio.AudioFocusRequestCompat audioFocusRequestCompat) {
            this.Camera2StreamConfigurationMap = audioFocusRequestCompat.getFocusGain();
            this.getHighSpeedVideoFpsRanges = audioFocusRequestCompat.getOnAudioFocusChangeListener();
            this.getHighSpeedVideoSizes = audioFocusRequestCompat.getFocusChangeHandler();
            this.getHighResolutionOutputSizeshNQ4ISI = audioFocusRequestCompat.getAudioAttributes();
            this.getHighSpeedVideoFpsRangesFor = audioFocusRequestCompat.willPauseWhenDucked();
        }

        public final androidx.media3.common.audio.AudioFocusRequestCompat.Builder setFocusGain(int i) {
            com.google.common.base.Preconditions.checkArgument(getHighSpeedVideoFpsRanges(i));
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public final androidx.media3.common.audio.AudioFocusRequestCompat.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new android.os.Handler(android.os.Looper.getMainLooper()));
        }

        public final androidx.media3.common.audio.AudioFocusRequestCompat.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
            com.google.common.base.Preconditions.checkNotNull(onAudioFocusChangeListener);
            com.google.common.base.Preconditions.checkNotNull(handler);
            this.getHighSpeedVideoFpsRanges = onAudioFocusChangeListener;
            this.getHighSpeedVideoSizes = handler;
            return this;
        }

        public final androidx.media3.common.audio.AudioFocusRequestCompat.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
            com.google.common.base.Preconditions.checkNotNull(audioAttributes);
            this.getHighResolutionOutputSizeshNQ4ISI = audioAttributes;
            return this;
        }

        public final androidx.media3.common.audio.AudioFocusRequestCompat.Builder setWillPauseWhenDucked(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public final androidx.media3.common.audio.AudioFocusRequestCompat build() {
            android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.getHighSpeedVideoFpsRanges;
            if (onAudioFocusChangeListener == null) {
                throw new java.lang.IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
            }
            return new androidx.media3.common.audio.AudioFocusRequestCompat(this.Camera2StreamConfigurationMap, onAudioFocusChangeListener, (android.os.Handler) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoSizes), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    static class OnAudioFocusChangeListenerHandlerCompat implements android.media.AudioManager.OnAudioFocusChangeListener {
        private final android.os.Handler Camera2StreamConfigurationMap;
        private final android.media.AudioManager.OnAudioFocusChangeListener getHighSpeedVideoFpsRangesFor;

        /* synthetic */ void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoFpsRangesFor.onAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            androidx.media3.common.util.Util.postOrRun(this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: androidx.media3.common.audio.AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.common.audio.AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat.this.getHighSpeedVideoSizes(i);
                }
            });
        }
    }
}
