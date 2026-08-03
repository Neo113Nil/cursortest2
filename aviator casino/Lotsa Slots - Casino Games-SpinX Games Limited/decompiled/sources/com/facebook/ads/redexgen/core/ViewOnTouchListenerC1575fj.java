package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1575fj implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"9YpvPFzq4gA4ILum2PFw7tT2EwcxI8wV", "F47KlILUbWaCosO0", "IjRysyutmgGRdQsMt2txP2GECpx3k3Q1", "ciBLF0rumq0WEGUsEh07nHxU", "yDOgyb3x0PSD2bFM5iTRFbbFTymIPux3", "Sxy6px61nfjJHTffPjDZVR3ZYpa4rtVn", "5GXF5D2qooFEcnp1hk94nU2dqySkSdML", "AxzUGf"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy A00;

    public ViewOnTouchListenerC1575fj(com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy textureViewSurfaceTextureListenerC0635Cy) {
        this.A00 = textureViewSurfaceTextureListenerC0635Cy;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        android.widget.MediaController mediaController;
        android.widget.MediaController mediaController2;
        android.widget.MediaController mediaController3;
        android.widget.MediaController mediaController4;
        z = this.A00.A0G;
        if (z) {
            return true;
        }
        mediaController = this.A00.A0A;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A0A;
            boolean isShowing = mediaController2.isShowing();
            if (A01[4].charAt(17) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "HYvtDEBsv2VZCb1XBIl4ljHb";
            if (isShowing) {
                mediaController4 = this.A00.A0A;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A0A;
                mediaController3.show();
            }
        }
        return true;
    }
}
