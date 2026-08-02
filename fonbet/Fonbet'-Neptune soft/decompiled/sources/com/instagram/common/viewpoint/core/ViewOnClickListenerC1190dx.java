package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1190dx implements View.OnClickListener {
    public final /* synthetic */ C2R A00;

    public ViewOnClickListenerC1190dx(C2R c2r) {
        this.A00 = c2r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        E1 videoView;
        C0796Ua c0796Ua;
        C1153dL c1153dL;
        E1 videoView2;
        E1 videoView3;
        E1 videoView4;
        C0796Ua c0796Ua2;
        if (AbstractC0832Vl.A02(this)) {
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                c0796Ua = this.A00.A02;
                if (c0796Ua != null) {
                    c0796Ua2 = this.A00.A02;
                    c0796Ua2.A04(UZ.A0x, null);
                }
                c1153dL = this.A00.A01;
                c1153dL.A0F().A3Y();
                int[] iArr = C1191dy.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0h(EnumC1169db.A04, 12);
                        break;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0l(true, 8);
                        break;
                }
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
