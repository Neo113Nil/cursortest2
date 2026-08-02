package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1028bJ extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final KE A02;
    public static final int A05 = (int) (AbstractC0856Wl.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC0856Wl.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC0856Wl.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC0856Wl.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC0856Wl.A02 * 4.0f);

    public C1028bJ(C1153dL c1153dL, KE ke, AbstractC1428hy abstractC1428hy, US us, InterfaceC0884Xn interfaceC0884Xn, C1226eX c1226eX, XH xh, C0616My c0616My, InterfaceC0953a4 interfaceC0953a4) {
        super(c1153dL);
        this.A00 = c0616My.A09(true);
        this.A01 = new RelativeLayout(c1153dL);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1153dL, abstractC1428hy.A20().A0J().A04());
        if (ke == null) {
            this.A02 = new KE(c1153dL, abstractC1428hy.A0r(), (C0616My) null, us, interfaceC0884Xn, c1226eX, xh, abstractC1428hy.A21());
        } else {
            this.A02 = ke;
        }
        A03();
        this.A02.setCta(abstractC1428hy.A20().A0J(), abstractC1428hy.A25(), new HashMap(), interfaceC0953a4);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1153dL c1153dL, View view) {
        ImageView imageView = new ImageView(c1153dL);
        imageView.setImageBitmap(XY.A01(XX.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1153dL c1153dL, String str) {
        Button button = new Button(c1153dL);
        XP.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        XP.A0M(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1153dL, button);
    }

    public final ME A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1428hy abstractC1428hy, AbstractC0883Xm abstractC0883Xm) {
        this.A02.A0F(abstractC1428hy, abstractC0883Xm);
    }

    public void setCta(C0617Mz c0617Mz, String str, HashMap<String, String> extras, InterfaceC0953a4 interfaceC0953a4) {
        this.A02.setCta(c0617Mz, str, extras, interfaceC0953a4);
    }
}
