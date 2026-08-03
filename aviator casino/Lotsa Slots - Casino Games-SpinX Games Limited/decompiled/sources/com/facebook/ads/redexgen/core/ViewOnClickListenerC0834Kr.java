package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC0834Kr extends com.facebook.ads.redexgen.core.AbstractC1321bb implements android.view.View.OnClickListener {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0G;
    public int A00;
    public int A01;
    public android.graphics.Bitmap A02;
    public android.graphics.Paint A03;
    public android.graphics.Rect A04;
    public com.facebook.ads.redexgen.core.C1636gi A05;
    public com.facebook.ads.redexgen.core.XO A06;
    public com.facebook.ads.redexgen.core.C0840Kx A07;
    public java.lang.String A08;
    public java.lang.String A09;
    public boolean A0A;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.C1315bV A0C;
    public final java.util.Map<java.lang.String, java.lang.String> A0D;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, com.google.common.base.Ascii.FS, 38, com.google.common.base.Ascii.DC2, 41, -27, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, 38, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, 33, 93, 91, 77, 90, 75, 84, 81, 75, 83};
    }

    static {
        A04();
        A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 24.0f);
    }

    public ViewOnClickListenerC0834Kr(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C0894Na c0894Na, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh) {
        this(c1636gi, abstractC1801jd.A0w(), c0894Na, abstractC1801jd.A29().A0J().A06(), va, interfaceC1177Yh, c1581fp, y2, abstractC1801jd.A2A(), interfaceC1151Xh);
        this.A0C.A08(abstractC1801jd);
    }

    public ViewOnClickListenerC0834Kr(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C0894Na c0894Na, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        this(c1636gi, str, c0894Na, false, va, interfaceC1177Yh, c1581fp, y2, c0900Ng);
    }

    public ViewOnClickListenerC0834Kr(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        super(c1636gi, c0894Na);
        this.A0D = new java.util.HashMap();
        this.A0B = false;
        this.A05 = c1636gi;
        this.A0A = z;
        this.A0C = new com.facebook.ads.redexgen.core.C1315bV(c1636gi, str, c1581fp, y2, va, c0900Ng, interfaceC1177Yh);
        setOnClickListener(this);
        com.facebook.ads.redexgen.core.YB.A0G(1001, this);
    }

    public ViewOnClickListenerC0834Kr(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh) {
        super(c1636gi, c0894Na);
        this.A0D = new java.util.HashMap();
        this.A0B = false;
        this.A05 = c1636gi;
        this.A0A = z;
        this.A0C = new com.facebook.ads.redexgen.core.C1315bV(c1636gi, str, c1581fp, y2, va, c0900Ng, interfaceC1177Yh, interfaceC1151Xh);
        setOnClickListener(this);
        com.facebook.ads.redexgen.core.YB.A0G(1001, this);
    }

    public static android.graphics.Bitmap A00(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(com.facebook.ads.redexgen.core.YN.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? com.facebook.ads.redexgen.core.YM.MESSENGER : com.facebook.ads.redexgen.core.YM.WHATSAPP));
            this.A03 = new android.graphics.Paint();
            setPadding(A0G, 0, A0G, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            com.facebook.ads.redexgen.core.XO xo = this.A06;
            if (A0F[0].charAt(27) != 'K') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0F;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            xo.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        return ((long) abstractC1801jd.A25()) > 0 && abstractC1801jd.A23() >= 0;
    }

    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0E(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.A08) || android.text.TextUtils.isEmpty(this.A09)) {
            return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        }
        A03();
        this.A0D.put(A01(0, 12, 6), str);
        this.A0D.put(A01(24, 12, 58), java.lang.String.valueOf(this.A0B));
        return this.A0C.A05(this.A08, this.A09, this.A0D);
    }

    public final boolean A0F(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        if (this.A06 != null || !A05(abstractC1801jd) || abstractC1801jd.A2D().A02() == null || abstractC1801jd.A2D().A01() == null) {
            return false;
        }
        this.A07 = new com.facebook.ads.redexgen.core.C0840Kx(abstractC1801jd.A23(), abstractC1801jd.A25(), abstractC1801jd.A24(), abstractC1801jd.A2D().A02(), abstractC1801jd.A2D().A01(), abstractC1171Yb, this);
        this.A06 = new com.facebook.ads.redexgen.core.XO(abstractC1801jd.A25(), this.A07);
        this.A06.A07();
        return true;
    }

    public com.facebook.ads.redexgen.core.C1315bV getCtaActionHelper() {
        return this.A0C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            A0E(A01(36, 9, 111));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new android.graphics.Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((java.lang.String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            android.graphics.Rect destRect = new android.graphics.Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(com.facebook.ads.redexgen.core.XS xs) {
        this.A0C.A09(xs);
    }

    public void setCta(com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData) {
        setCta(c0896Nc, str, extraData, null);
    }

    public void setCta(com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        setCta(c0896Nc, str, extraData, interfaceC1314bU);
        this.A0C.A0A(interfaceC1151Xh);
    }

    public void setCta(com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        this.A08 = str;
        this.A09 = c0896Nc.A05();
        this.A0D.putAll(extraData);
        this.A0C.A0B(interfaceC1314bU);
        java.lang.String A04 = c0896Nc.A04();
        if (!android.text.TextUtils.isEmpty(A04)) {
            java.lang.String buttonText = this.A09;
            if (!android.text.TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0C.A0C(z);
    }

    public void setV2Design(boolean z) {
        this.A0B = z;
    }
}
