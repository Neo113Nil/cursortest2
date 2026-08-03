package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1171Yb extends android.widget.LinearLayout {
    public static int A00 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 56.0f);
    public static int A01 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f, int i);

    public abstract void A0D(com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract com.facebook.ads.redexgen.core.InterfaceC1170Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(android.view.View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, int i, com.facebook.ads.redexgen.core.C0912Ns c0912Ns);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(android.view.View.OnClickListener onClickListener);

    public abstract void setProgressImage(com.facebook.ads.redexgen.core.YM ym);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(java.lang.String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya);

    public AbstractC1171Yb(android.content.Context context) {
        super(context);
    }

    public void A08() {
    }

    public android.graphics.Rect getRequestedMargins() {
        return null;
    }
}
