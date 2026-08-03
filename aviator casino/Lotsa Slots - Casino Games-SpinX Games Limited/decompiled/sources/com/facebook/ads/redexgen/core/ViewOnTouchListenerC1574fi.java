package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1574fi implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"Bd4iK263MdiqVEckgiEcXaEaZ4uIweBG", "Jp1QSGfkJ8Z9zXekFuJltl48GgKydEoc", "fEEbeUwQeH7COVlxXKNmLl1Z50afP2Mj", "r02s0ULWktGw0R0gNTqzpE9xc", "EB9Y4EIWcixhOmounHH1kGqbNZmcFzXh", "JuYgfl", "oFT1QXZER3M49OH4cjLW2BEWWzLsdZXt", "I5"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy A00;

    public ViewOnTouchListenerC1574fi(com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0635Cy textureViewSurfaceTextureListenerC0635Cy) {
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
        if (mediaController != null) {
            int action = motionEvent.getAction();
            if (A01[7].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[0] = "zVWiAAuOepyWFcYkLQ4ZoGrmpQGPeEmc";
            strArr[1] = "wkRU6nfkZfVncc0k3MPDpaJGMcStJhoI";
            if (action == 1) {
                mediaController2 = this.A00.A0A;
                if (mediaController2.isShowing()) {
                    mediaController4 = this.A00.A0A;
                    mediaController4.hide();
                } else {
                    mediaController3 = this.A00.A0A;
                    mediaController3.show();
                }
            }
        }
        return true;
    }
}
