package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1303bJ implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.LK A00;

    public ViewOnClickListenerC1303bJ(com.facebook.ads.redexgen.core.LK lk) {
        this.A00 = lk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() != 8) {
                this.A00.A0W();
                this.A00.A0G.removeCallbacks(this.A00.A0X);
                this.A00.A0t(8);
            } else {
                this.A00.A0t(0);
                this.A00.A0G.postDelayed(this.A00.A0X, androidx.compose.foundation.BasicTooltipDefaults.TooltipDuration);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
