package com.microblink.blinkid.fragment.overlay.components;

/* loaded from: classes10.dex */
public class ScanSoundPlayer {
    private android.media.SoundPool getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes = -1;

    public void clear() {
        android.media.SoundPool soundPool = this.getHighSpeedVideoFpsRanges;
        if (soundPool != null) {
            try {
                soundPool.release();
            } catch (java.lang.IllegalStateException unused) {
            }
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = -1;
        }
    }

    public void initialize(android.content.Context context, int i) {
        if (i > 0) {
            android.media.SoundPool build = new android.media.SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            this.getHighSpeedVideoFpsRanges = build;
            this.getHighSpeedVideoSizes = build.load(context, i, 1);
        }
    }

    public void play() {
        int i;
        android.media.SoundPool soundPool = this.getHighSpeedVideoFpsRanges;
        if (soundPool == null || (i = this.getHighSpeedVideoSizes) == -1) {
            return;
        }
        soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
    }
}
