package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2593bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C2930gi A07;
    public final ViewOnClickListenerC2128Kr A08;
    public final C2624bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC2593bF(C2930gi c2930gi, ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr, int i, C2188Na c2188Na, boolean z, String str, VA va, InterfaceC2471Yh interfaceC2471Yh, C2875fp c2875fp, Y2 y2, C2194Ng c2194Ng, boolean z2, String str2) {
        super(c2930gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c2930gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C2624bk(c2930gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c2930gi);
            this.A01 = new TextView(c2930gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC2128Kr == null) {
            this.A08 = new ViewOnClickListenerC2128Kr(c2930gi, str, c2188Na, z, va, interfaceC2471Yh, c2875fp, y2, c2194Ng);
        } else {
            this.A08 = viewOnClickListenerC2128Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC2634bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c2930gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC2128Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C2190Nc c2190Nc, String str, String str2, InterfaceC2445Xh interfaceC2445Xh, InterfaceC2608bU interfaceC2608bU) {
        this.A08.setCta(c2190Nc, str, new HashMap(), interfaceC2445Xh, interfaceC2608bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
