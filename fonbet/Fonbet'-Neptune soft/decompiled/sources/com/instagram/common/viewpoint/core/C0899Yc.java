package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0899Yc extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final O2 A02;
    public final C1153dL A03;
    public final InterfaceC0902Yf A04;
    public final boolean A05;
    public static final int A09 = (int) (AbstractC0856Wl.A02 * 16.0f);
    public static final int A0A = (int) (AbstractC0856Wl.A02 * 8.0f);
    public static final int A0D = (int) (AbstractC0856Wl.A02 * 44.0f);
    public static final int A08 = (int) (AbstractC0856Wl.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (AbstractC0856Wl.A02 * 75.0f);
    public static final int A0B = (int) (AbstractC0856Wl.A02 * 25.0f);
    public static final int A0F = (int) (AbstractC0856Wl.A02 * 45.0f);
    public static final int A0C = (int) (AbstractC0856Wl.A02 * 15.0f);
    public static final int A06 = (int) (AbstractC0856Wl.A02 * 16.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0899Yc(C0898Yb c0898Yb) {
        super(r0);
        C1153dL c1153dL;
        C1153dL c1153dL2;
        InterfaceC0902Yf interfaceC0902Yf;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        c1153dL = c0898Yb.A0C;
        c1153dL2 = c0898Yb.A0C;
        this.A03 = c1153dL2;
        this.A02 = O3.A00(this.A03.A02());
        interfaceC0902Yf = c0898Yb.A02;
        this.A04 = interfaceC0902Yf;
        z = c0898Yb.A0B;
        this.A01 = z ? A0E : A0F;
        z2 = c0898Yb.A0B;
        this.A00 = z2 ? A0B : A0C;
        z3 = c0898Yb.A07;
        this.A05 = z3;
        setFocusable(true);
        View A01 = A01(c0898Yb);
        View A00 = A00(c0898Yb);
        View footerView = getFooterView();
        XP.A0I(A01);
        XP.A0I(A00);
        XP.A0I(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, A01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(A01, contentParams);
        addView(A00, layoutParams);
        addView(footerView, footerParams);
        z4 = c0898Yb.A08;
        footerView.setVisibility(z4 ? 0 : 8);
    }

    public /* synthetic */ C0899Yc(C0898Yb c0898Yb, YZ yz) {
        this(c0898Yb);
    }

    private View A00(C0898Yb c0898Yb) {
        XX xx;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        xx = c0898Yb.A01;
        imageView.setImageBitmap(XY.A01(xx));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i = c0898Yb.A00;
        gradientDrawable.setColor(i);
        XP.A0Q(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        XP.A0W(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        str = c0898Yb.A06;
        subtitleView.setText(str);
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        XP.A0W(titleView, false, 16);
        titleView.setTextColor(-10459280);
        str2 = c0898Yb.A05;
        titleView.setText(str2);
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        z = c0898Yb.A09;
        if (z) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = c0898Yb.A04;
            if (!TextUtils.isEmpty(str3)) {
                C0967aK c0967aK = new C0967aK(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c0967aK.setFullCircleCorners(true);
                KZ A05 = new KZ(c0967aK, this.A03).A05(A0F, A0F);
                str5 = c0898Yb.A04;
                A05.A07(str5);
                linearLayout2.addView(c0967aK, iconParams);
            }
            C0904Yh c0904Yh = new C0904Yh(this.A03);
            str4 = c0898Yb.A03;
            c0904Yh.setData(str4, XX.CHECKMARK);
            c0904Yh.setSelected(true);
            linearLayout2.addView(c0904Yh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0898Yb c0898Yb) {
        boolean z;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z = c0898Yb.A0A;
        if (z) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(XY.A01(XX.CROSS));
            imageView.setOnClickListener(new YZ(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(XY.A01(XX.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        XP.A0W(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0897Ya(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
