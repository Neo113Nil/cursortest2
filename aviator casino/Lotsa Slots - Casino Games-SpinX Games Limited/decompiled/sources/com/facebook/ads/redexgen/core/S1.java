package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class S1 {
    public final com.facebook.ads.AudienceNetworkActivity A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;

    public S1(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity) {
        this.A01 = c1636gi;
        this.A00 = audienceNetworkActivity;
    }

    private int A00() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.Window window = this.A00.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    public final void A01() {
        if ((this.A01.A0H().A01() || com.facebook.ads.redexgen.core.C1086Up.A25(this.A01)) && android.os.Build.VERSION.SDK_INT >= 24) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.S0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.S1.this.A02();
                }
            }, 1000L);
        }
    }

    public final /* synthetic */ void A02() {
        if (this.A00.isInMultiWindowMode()) {
            this.A01.A0F().AC4(A00());
        }
    }
}
