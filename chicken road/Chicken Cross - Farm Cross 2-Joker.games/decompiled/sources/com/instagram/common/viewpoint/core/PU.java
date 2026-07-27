package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC2465Yb {
    public static byte[] A03;
    public C2930gi A00;
    public InterfaceC2464Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C2930gi c2930gi, AbstractC3095jd abstractC3095jd, int i) {
        super(c2930gi);
        this.A00 = c2930gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC3095jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC2481Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public final void A0C(float f, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public final void A0D(C2188Na c2188Na, boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public int getToolbarHeight() {
        return AbstractC2465Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public InterfaceC2464Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setCTAClickListener(ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setPageDetails(C2200Nm c2200Nm, String str, int i, C2206Ns c2206Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setProgress(float f) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2465Yb
    public void setToolbarListener(InterfaceC2464Ya interfaceC2464Ya) {
        this.A01 = interfaceC2464Ya;
    }
}
