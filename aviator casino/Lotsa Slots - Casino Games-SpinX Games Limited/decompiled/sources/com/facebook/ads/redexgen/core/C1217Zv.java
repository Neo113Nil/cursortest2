package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1217Zv extends android.widget.LinearLayout {
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 40.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 20.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
    public final com.facebook.ads.redexgen.core.C0930Ok A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1201Zf A02;

    public C1217Zv(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf, com.facebook.ads.redexgen.core.YM ym) {
        this(c1636gi, c0930Ok, interfaceC1201Zf, null, ym);
    }

    public C1217Zv(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf, java.lang.String str, com.facebook.ads.redexgen.core.YM ym) {
        super(c1636gi);
        this.A01 = c1636gi;
        this.A00 = c0930Ok;
        this.A02 = interfaceC1201Zf;
        setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        if (!android.text.TextUtils.isEmpty(str)) {
            android.view.View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            android.view.View view = new android.view.View(getContext());
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 1));
            com.facebook.ads.redexgen.core.YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!android.text.TextUtils.isEmpty(this.A00.A03())) {
            android.view.View A00 = A00(ym, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        com.facebook.ads.redexgen.core.C1223a1 A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private android.view.View A00(com.facebook.ads.redexgen.core.YM ym, java.lang.String str) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private android.view.View A01(java.lang.String str) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        android.widget.LinearLayout.LayoutParams titleParams = new android.widget.LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1215Zt(this));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private com.facebook.ads.redexgen.core.C1223a1 A03() {
        com.facebook.ads.redexgen.core.C1223a1 c1223a1 = new com.facebook.ads.redexgen.core.C1223a1(this.A01);
        for (com.facebook.ads.redexgen.core.C0930Ok c0930Ok : this.A00.A05()) {
            com.facebook.ads.redexgen.core.C1203Zh c1203Zh = new com.facebook.ads.redexgen.core.C1203Zh(this.A01);
            c1203Zh.setData(c0930Ok.A04(), null);
            c1203Zh.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1216Zu(this, c1203Zh, c0930Ok));
            c1223a1.addView(c1203Zh);
        }
        return c1223a1;
    }
}
