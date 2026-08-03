package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1545fF implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass34 A00;

    public ViewOnClickListenerC1545fF(com.facebook.ads.redexgen.core.AnonymousClass34 anonymousClass34) {
        this.A00 = anonymousClass34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.C0673Ek videoView;
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C0673Ek videoView2;
        com.facebook.ads.redexgen.core.C0673Ek videoView3;
        com.facebook.ads.redexgen.core.C0673Ek videoView4;
        com.facebook.ads.redexgen.core.VI vi2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                vi = this.A00.A02;
                if (vi != null) {
                    vi2 = this.A00.A02;
                    vi2.A04(com.facebook.ads.redexgen.core.VH.A0x, null);
                }
                c1636gi = this.A00.A01;
                c1636gi.A0F().A3g();
                int[] iArr = com.facebook.ads.redexgen.core.C1546fG.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A04, 12);
                        break;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0i(true, 8);
                        break;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
