package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1379cX implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KB A00;

    public RunnableC1379cX(com.facebook.ads.redexgen.core.KB kb) {
        this.A00 = kb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            imageView = this.A00.A03;
            if (imageView != null) {
                imageView2 = this.A00.A03;
                if (imageView2.getVisibility() == 0) {
                    this.A00.A0T(8);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
