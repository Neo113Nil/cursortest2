package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1570fe implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0636Cz A00;

    public ViewOnTouchListenerC1570fe(com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0636Cz textureViewSurfaceTextureListenerC0636Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0636Cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.MediaController mediaController;
        android.widget.MediaController mediaController2;
        android.widget.MediaController mediaController3;
        android.widget.MediaController mediaController4;
        mediaController = this.A00.A09;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A09;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A09;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A09;
                mediaController3.show();
            }
        }
        return true;
    }
}
