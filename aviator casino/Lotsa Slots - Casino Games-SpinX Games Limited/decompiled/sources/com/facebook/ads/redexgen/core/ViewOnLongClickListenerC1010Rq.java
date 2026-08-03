package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnLongClickListenerC1010Rq implements android.view.View.OnLongClickListener {
    public static java.lang.String[] A02 = {"kWMETALBgXQPxa1caUNWOxECFuDqqQMg", "ZdkMlJfyQLC9xkOOBWIiDwjfHp6c9jbv", "0ZcfP2jVUcrv9OHIQZTLnU8", "f1ui83cs7IfjD0PNLw4msBb2GPSJERBF", "Csxj5aYvqiT2vPBDwP7", "SUYUZZDjraqMGfRe", "xuktTTnzvvF5Ho58lD7oBLq", ""};

    @javax.annotation.Nullable
    public final android.widget.RelativeLayout A00;

    @javax.annotation.Nullable
    public final com.facebook.ads.redexgen.core.C1290b6 A01;

    public ViewOnLongClickListenerC1010Rq(com.facebook.ads.redexgen.core.C1290b6 c1290b6, android.widget.RelativeLayout relativeLayout) {
        this.A01 = c1290b6;
        this.A00 = relativeLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        if (this.A01 != null && this.A00 != null) {
            com.facebook.ads.redexgen.core.C1290b6 c1290b6 = this.A01;
            int width = this.A00.getWidth();
            android.widget.RelativeLayout relativeLayout = this.A00;
            java.lang.String[] strArr = A02;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "";
            c1290b6.setBounds(0, 0, width, relativeLayout.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
