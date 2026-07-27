package com.instagram.common.viewpoint.core;

import android.media.MediaPlayer;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2867fh implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"G2jsbExkD9brib249v9eCTdtCCMiwFzU", "MybJItuTTwvMgUX2RH23VAkcAJ", "ow4pie4IyD8vnQFKIBNl8mdJIY6Q5gW8", "kaFU92mf6AOB2B7qFy6jCknY9pgFVbwN", "XSYkluwu3NIdD0aesrZFwy6vCjOS", "MBQtVF6anIuSN", "XyB5XGE3kPOvBkLqSfjYtL", "1ylIFWR"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1929Cy A00;

    public C2867fh(TextureViewSurfaceTextureListenerC1929Cy textureViewSurfaceTextureListenerC1929Cy) {
        this.A00 = textureViewSurfaceTextureListenerC1929Cy;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer == null) {
            return 0;
        }
        TextureViewSurfaceTextureListenerC1929Cy textureViewSurfaceTextureListenerC1929Cy = this.A00;
        if (A01[1].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "Hfs5YLVNykkKsniRiyykCGhMklelUedO";
        strArr[3] = "ZNxy2mQzqI9R708Jl4ViCzH0rbFY1aBC";
        mediaPlayer2 = textureViewSurfaceTextureListenerC1929Cy.A06;
        return mediaPlayer2.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            mediaPlayer2 = this.A00.A06;
            if (mediaPlayer2.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC2873fn interfaceC2873fn;
        InterfaceC2873fn interfaceC2873fn2;
        interfaceC2873fn = this.A00.A0E;
        if (interfaceC2873fn != null) {
            interfaceC2873fn2 = this.A00.A0E;
            interfaceC2873fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC2873fn interfaceC2873fn;
        InterfaceC2873fn interfaceC2873fn2;
        interfaceC2873fn = this.A00.A0E;
        if (interfaceC2873fn != null) {
            interfaceC2873fn2 = this.A00.A0E;
            interfaceC2873fn2.AEp();
        }
    }
}
