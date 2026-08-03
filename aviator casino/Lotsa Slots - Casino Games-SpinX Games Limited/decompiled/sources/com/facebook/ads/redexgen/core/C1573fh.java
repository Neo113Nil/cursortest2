package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1573fh implements android.widget.MediaController.MediaPlayerControl {
    public static java.lang.String[] A01 = {"G2jsbExkD9brib249v9eCTdtCCMiwFzU", "MybJItuTTwvMgUX2RH23VAkcAJ", "ow4pie4IyD8vnQFKIBNl8mdJIY6Q5gW8", "kaFU92mf6AOB2B7qFy6jCknY9pgFVbwN", "XSYkluwu3NIdD0aesrZFwy6vCjOS", "MBQtVF6anIuSN", "XyB5XGE3kPOvBkLqSfjYtL", "1ylIFWR"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy A00;

    public C1573fh(com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy textureViewSurfaceTextureListenerC0635Cy) {
        this.A00 = textureViewSurfaceTextureListenerC0635Cy;
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
        android.media.MediaPlayer mediaPlayer;
        android.media.MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer == null) {
            return 0;
        }
        com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy textureViewSurfaceTextureListenerC0635Cy = this.A00;
        if (A01[1].length() != 26) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[0] = "Hfs5YLVNykkKsniRiyykCGhMklelUedO";
        strArr[3] = "ZNxy2mQzqI9R708Jl4ViCzH0rbFY1aBC";
        mediaPlayer2 = textureViewSurfaceTextureListenerC0635Cy.A06;
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
        android.media.MediaPlayer mediaPlayer;
        android.media.MediaPlayer mediaPlayer2;
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
        com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn;
        com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn2;
        interfaceC1579fn = this.A00.A0E;
        if (interfaceC1579fn != null) {
            interfaceC1579fn2 = this.A00.A0E;
            interfaceC1579fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn;
        com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn2;
        interfaceC1579fn = this.A00.A0E;
        if (interfaceC1579fn != null) {
            interfaceC1579fn2 = this.A00.A0E;
            interfaceC1579fn2.AEp();
        }
    }
}
