package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0640Dd extends android.widget.ImageView implements com.facebook.ads.redexgen.core.InterfaceC1524eu {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"4xWU9o1Qdv49zg4k19WdZrOQJ68qlBKJ", "QfpLWsUkij8dLfBb7Aagb5qXzjDoxZj6", "QolGMRpELvSET2", "SiemLW4oVdpf", "uXL2k0aAaj67psTeNQKHhn5IgBi2NdXT", "OArHsnP", "A54GrsZIV89x3qzJRphed5abiMfcDTpl", "7SQmPw6zIXtGY8y4ylHwiNNuEQdMSmlG"};
    public static final int A07;
    public static final int A08;
    public com.facebook.ads.redexgen.core.C0673Ek A00;
    public final android.graphics.Paint A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;
    public final com.facebook.ads.redexgen.core.VI A03;
    public final com.facebook.ads.redexgen.core.AbstractC0654Dr A04;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-100, -60, -61, -76, 111, -112, -77};
    }

    static {
        A06();
        A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 40.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
    }

    public C0640Dd(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VI vi) {
        super(c1636gi);
        this.A04 = new com.facebook.ads.redexgen.core.AbstractC0654Dr() { // from class: com.facebook.ads.redexgen.X.3V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0655Ds c0655Ds) {
                com.facebook.ads.redexgen.core.C0640Dd.this.A09();
            }
        };
        this.A03 = vi;
        this.A02 = c1636gi;
        this.A01 = new android.graphics.Paint();
        this.A01.setColor(Integer.MIN_VALUE);
        setColorFilter(-1);
        setPadding(A07, A07, A07, A07);
        setContentDescription(A03(0, 7, 17));
        A05();
        setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1542fC(this));
    }

    private void A04() {
        setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.ICON_MUTE));
    }

    private void A05() {
        setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.ICON_UN_MUTE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        boolean A072 = A07();
        if (A06[3].length() != 12) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[7] = "aX931uSfPaE8IiOHtPCxhipRkXbTn1t9";
        strArr[4] = "ET7wr0zhj8rUQx1GjBOUHwAZuNFVr5BQ";
        if (A072) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AAv(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AKV(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.UM<com.facebook.ads.redexgen.core.UN, com.facebook.ads.redexgen.core.UL> eventBus = this.A00.getEventBus();
            com.facebook.ads.redexgen.core.AbstractC0654Dr abstractC0654Dr = this.A04;
            java.lang.String[] strArr = A06;
            if (strArr[2].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[6] = "f5V50lgekxKfxPRjN4EQZ5T7YD8zyqkA";
            strArr2[1] = "6bYokHrcutoPgrqwaKTDD5vNcVht1LGT";
            eventBus.A06(abstractC0654Dr);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int y = getWidth() / 2;
        int x = getHeight() / 2;
        canvas.drawCircle(y, x, java.lang.Math.min(y, x), this.A01);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int height = A08;
        int width = A08;
        setMeasuredDimension(height, width);
    }
}
