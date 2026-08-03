package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1380cY implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KB A00;

    public ViewOnClickListenerC1380cY(com.facebook.ads.redexgen.core.KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.ImageView imageView;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        android.widget.ImageView imageView2;
        android.os.Handler handler2;
        java.lang.Runnable runnable2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            imageView = this.A00.A03;
            if (imageView != null) {
                imageView2 = this.A00.A03;
                if (imageView2.getVisibility() == 8) {
                    this.A00.A0T(0);
                    handler2 = this.A00.A0B;
                    runnable2 = this.A00.A0V;
                    handler2.postDelayed(runnable2, androidx.compose.foundation.BasicTooltipDefaults.TooltipDuration);
                    return;
                }
            }
            this.A00.A0P();
            handler = this.A00.A0B;
            runnable = this.A00.A0V;
            handler.removeCallbacks(runnable);
            this.A00.A0T(8);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
