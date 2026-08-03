package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1569fd implements android.widget.MediaController.MediaPlayerControl {
    public final /* synthetic */ com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0636Cz A00;

    public C1569fd(com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0636Cz textureViewSurfaceTextureListenerC0636Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0636Cz;
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
        com.facebook.ads.redexgen.core.C1563fX c1563fX;
        com.facebook.ads.redexgen.core.C1563fX c1563fX2;
        c1563fX = this.A00.A0C;
        if (c1563fX == null) {
            return 0;
        }
        c1563fX2 = this.A00.A0C;
        return c1563fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        com.facebook.ads.redexgen.core.C1563fX c1563fX;
        com.facebook.ads.redexgen.core.C1563fX c1563fX2;
        c1563fX = this.A00.A0C;
        if (c1563fX == null) {
            return 0;
        }
        c1563fX2 = this.A00.A0C;
        return c1563fX2.A05();
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
        com.facebook.ads.redexgen.core.C1563fX c1563fX;
        com.facebook.ads.redexgen.core.C1563fX c1563fX2;
        c1563fX = this.A00.A0C;
        if (c1563fX != null) {
            c1563fX2 = this.A00.A0C;
            if (c1563fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn;
        com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn2;
        interfaceC1579fn = this.A00.A0F;
        if (interfaceC1579fn != null) {
            interfaceC1579fn2 = this.A00.A0F;
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
        interfaceC1579fn = this.A00.A0F;
        if (interfaceC1579fn != null) {
            interfaceC1579fn2 = this.A00.A0F;
            interfaceC1579fn2.AEp();
        }
    }
}
