package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2863fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1930Cz A00;

    public C2863fd(TextureViewSurfaceTextureListenerC1930Cz textureViewSurfaceTextureListenerC1930Cz) {
        this.A00 = textureViewSurfaceTextureListenerC1930Cz;
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
        C2857fX c2857fX;
        C2857fX c2857fX2;
        c2857fX = this.A00.A0C;
        if (c2857fX == null) {
            return 0;
        }
        c2857fX2 = this.A00.A0C;
        return c2857fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C2857fX c2857fX;
        C2857fX c2857fX2;
        c2857fX = this.A00.A0C;
        if (c2857fX == null) {
            return 0;
        }
        c2857fX2 = this.A00.A0C;
        return c2857fX2.A05();
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
        C2857fX c2857fX;
        C2857fX c2857fX2;
        c2857fX = this.A00.A0C;
        if (c2857fX != null) {
            c2857fX2 = this.A00.A0C;
            if (c2857fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC2873fn interfaceC2873fn;
        InterfaceC2873fn interfaceC2873fn2;
        interfaceC2873fn = this.A00.A0F;
        if (interfaceC2873fn != null) {
            interfaceC2873fn2 = this.A00.A0F;
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
        interfaceC2873fn = this.A00.A0F;
        if (interfaceC2873fn != null) {
            interfaceC2873fn2 = this.A00.A0F;
            interfaceC2873fn2.AEp();
        }
    }
}
