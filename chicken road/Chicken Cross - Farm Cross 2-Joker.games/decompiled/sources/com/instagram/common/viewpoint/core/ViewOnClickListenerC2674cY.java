package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2674cY implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC2674cY(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView;
        Handler handler;
        Runnable runnable;
        ImageView imageView2;
        Handler handler2;
        Runnable runnable2;
        if (WU.A02(this)) {
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
                    handler2.postDelayed(runnable2, c.m);
                    return;
                }
            }
            this.A00.A0P();
            handler = this.A00.A0B;
            runnable = this.A00.A0V;
            handler.removeCallbacks(runnable);
            this.A00.A0T(8);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
