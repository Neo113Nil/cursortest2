package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2785eM {
    public ViewOnClickListenerC2128Kr A00;
    public final NN A01;
    public final NY A02;
    public final C2191Nd A03;
    public final C2200Nm A04;
    public final C2930gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C2785eM(C2930gi c2930gi, VA va, AbstractC3095jd abstractC3095jd) {
        this.A05 = c2930gi;
        this.A06 = new VI(abstractC3095jd.A2E(), va);
        this.A01 = abstractC3095jd.A28();
        this.A02 = abstractC3095jd.A29().A0I();
        this.A04 = abstractC3095jd.A2C();
        this.A03 = abstractC3095jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr) {
        C2630bq c2630bq = new C2630bq(this.A05, this.A01.A01(), true, false, false);
        c2630bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c2630bq.setAlignment(17);
        C2624bk c2624bk = new C2624bk(this.A05);
        YB.A0N(c2624bk, 0);
        c2624bk.setRadius(50);
        new LM(c2624bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c2624bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c2630bq, layoutParams);
        if (viewOnClickListenerC2128Kr != null) {
            YB.A0J(viewOnClickListenerC2128Kr);
            linearLayout.addView(viewOnClickListenerC2128Kr, layoutParams);
            viewOnClickListenerC2128Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC2128Kr.getText())) {
                YB.A0H(viewOnClickListenerC2128Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C3000hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC2784eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC2784eL.A03;
        }
        return EnumC2784eL.A02;
    }

    public final Pair<EnumC2784eL, View> A03(ViewOnClickListenerC2128Kr viewOnClickListenerC2128Kr) {
        View A01;
        this.A00 = viewOnClickListenerC2128Kr;
        EnumC2784eL A02 = A02();
        switch (A02) {
            case A03:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        VK.A04(A01, this.A06, VH.A0S);
        return new Pair<>(A02, A01);
    }
}
