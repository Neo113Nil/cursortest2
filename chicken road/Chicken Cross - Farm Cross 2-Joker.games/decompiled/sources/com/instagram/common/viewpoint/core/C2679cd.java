package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2679cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC2128Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C2679cd(C2930gi c2930gi, ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr, AbstractC3095jd abstractC3095jd, VA va, InterfaceC2471Yh interfaceC2471Yh, C2875fp c2875fp, Y2 y2, C2188Na c2188Na, InterfaceC2608bU interfaceC2608bU) {
        super(c2930gi);
        this.A00 = c2188Na.A09(true);
        this.A01 = new RelativeLayout(c2930gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c2930gi, abstractC3095jd.A29().A0J().A04());
        if (viewOnClickListenerC2128Kr == null) {
            this.A02 = new ViewOnClickListenerC2128Kr(c2930gi, abstractC3095jd.A0w(), (C2188Na) null, va, interfaceC2471Yh, c2875fp, y2, abstractC3095jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC2128Kr;
        }
        A03();
        this.A02.setCta(abstractC3095jd.A29().A0J(), abstractC3095jd.A2E(), new HashMap(), interfaceC2608bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C2930gi c2930gi, View view) {
        ImageView imageView = new ImageView(c2930gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C2930gi c2930gi, String str) {
        Button button = new Button(c2930gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c2930gi, button);
    }

    public final EnumC2179Mq A02(String str) {
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

    public void setAutoClickTime(AbstractC3095jd abstractC3095jd, AbstractC2465Yb abstractC2465Yb) {
        this.A02.A0F(abstractC3095jd, abstractC2465Yb);
    }

    public void setCta(C2190Nc c2190Nc, String str, HashMap<String, String> extras, InterfaceC2608bU interfaceC2608bU) {
        this.A02.setCta(c2190Nc, str, extras, interfaceC2608bU);
    }
}
