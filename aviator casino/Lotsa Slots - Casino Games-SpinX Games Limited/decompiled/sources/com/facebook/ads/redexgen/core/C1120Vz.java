package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1120Vz extends com.facebook.ads.redexgen.core.C1006Rm implements com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final java.lang.String A0K;
    public com.facebook.ads.MediaViewVideoRenderer A01;
    public com.facebook.ads.NativeAd.NativeOptions A02;
    public com.facebook.ads.internal.api.MediaViewVideoRendererApi A03;
    public com.facebook.ads.redexgen.core.C1636gi A04;
    public com.facebook.ads.redexgen.core.VV A05;
    public com.facebook.ads.redexgen.core.C04916r A07;
    public com.facebook.ads.redexgen.core.C3S A08;
    public com.facebook.ads.redexgen.core.C3L A09;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A0A;
    public com.facebook.ads.redexgen.core.C1581fp A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC1519ep A0F = new com.facebook.ads.redexgen.core.W5(this);
    public final java.util.concurrent.atomic.AtomicBoolean A0G = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean A0H = new java.util.concurrent.atomic.AtomicBoolean(false);
    public com.facebook.ads.redexgen.core.EnumC1102Vf A06 = com.facebook.ads.redexgen.core.EnumC1102Vf.A03;
    public float A00 = 0.0f;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0K() {
        A0I = new byte[]{com.google.common.base.Ascii.VT, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, com.google.common.base.Ascii.FS, 35, 47, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.FS, 35, 46, 47, 37, 106, 35, 57, 106, 36, 63, 38, 38, 113, 106, 63, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, com.google.common.base.Ascii.SI, 91, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SI, 73, 70, 65, 75, com.google.common.base.Ascii.SI, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SI, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0K();
        A0K = com.facebook.ads.redexgen.core.C1120Vz.class.getSimpleName();
    }

    private com.facebook.ads.redexgen.core.W4 A03(com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new com.facebook.ads.redexgen.core.W4(this, mediaViewVideoRendererApi);
    }

    private com.facebook.ads.redexgen.core.W3 A04(com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new com.facebook.ads.redexgen.core.W3(this, mediaViewVideoRendererApi);
    }

    private com.facebook.ads.redexgen.core.W1 A05() {
        return new com.facebook.ads.redexgen.core.W1(this);
    }

    private com.facebook.ads.redexgen.core.C1581fp A08() {
        return new com.facebook.ads.redexgen.core.C1581fp(this.A01, 50, true, new java.lang.ref.WeakReference(this.A0A), this.A04);
    }

    private void A0C() {
        if (this.A07 != null) {
            com.facebook.ads.redexgen.core.C04916r c04916r = this.A07;
            if (A0J[6].charAt(16) != 'd') {
                throw new java.lang.RuntimeException();
            }
            A0J[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((com.facebook.ads.redexgen.core.C1520eq) c04916r.getVideoView()).setViewImplInflationListener(this.A0F);
        }
    }

    private void A0D() {
        if (this.A07 != null) {
            this.A07.getVideoView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.VQ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return com.facebook.ads.redexgen.core.C1120Vz.A0U(view, motionEvent);
                }
            });
        }
    }

    private void A0E() {
        if (this.A07 != null) {
            this.A07.getVideoView().setOnTouchListener(new com.facebook.ads.redexgen.core.VU(this));
        }
    }

    private void A0F() {
        if (this.A07 != null) {
            ((com.facebook.ads.redexgen.core.C1520eq) this.A07.getVideoView()).setViewImplInflationListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        if (this.A02 != null && this.A02.getHideMediaControls() != null) {
            this.A04.A0F().ABi();
        }
        if (!com.facebook.ads.redexgen.core.C1086Up.A1Z(this.A04)) {
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A04;
            java.lang.String[] strArr = A0J;
            if (strArr[7].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "KtstU60KqEiOpYkS6KSDXNWKu5PITYtK";
            c1636gi.A0F().ABh();
        }
        if (this.A09 != null) {
            if (this.A02 != null && this.A02.getHideMediaControls() != null && this.A02.getHideMediaControls().booleanValue() && !com.facebook.ads.redexgen.core.C1086Up.A1Z(this.A04)) {
                this.A09.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.VR
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.C1120Vz.this.A0a();
                    }
                });
            } else {
                if (this.A07 == null) {
                    return;
                }
                this.A07.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.VS
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.C1120Vz.this.A0b();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        if (this.A02 != null && this.A02.getUnMuteVolume() != null) {
            this.A04.A0F().ABk();
        }
        if (!com.facebook.ads.redexgen.core.C1086Up.A1a(this.A04)) {
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A04.A0F();
            java.lang.String[] strArr = A0J;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0J;
            strArr2[0] = "1A270iucPH7yQTpQVcY6WmFhLzvmB0Is";
            strArr2[3] = "1BN9a3kcQdFnn1rDq6e2xRSvc5Sglw92";
            A0F.ABj();
        }
        if (this.A03 != null) {
            com.facebook.ads.NativeAd.NativeOptions nativeOptions = this.A02;
            if (A0J[6].charAt(16) != 'd') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A0J;
            strArr3[7] = "9BSaV1qwv2wk9zKsNbmqgYOZ4C9vO";
            strArr3[1] = "GTOoQ0M5k2g8J0XGcddyc87MnH9r3";
            if (nativeOptions != null && this.A02.getUnMuteVolume() != null && this.A02.getUnMuteVolume().booleanValue() && !com.facebook.ads.redexgen.core.C1086Up.A1a(this.A04)) {
                this.A03.setVolume(1.0f);
            } else {
                this.A03.setVolume(this.A00);
            }
        }
    }

    private void A0I() {
        if (this.A01.getVisibility() == 0 && this.A0C && this.A01.hasWindowFocus()) {
            this.A0B.A0U();
            return;
        }
        if (this.A07 != null) {
            com.facebook.ads.redexgen.core.EnumC1578fm state = this.A07.getState();
            java.lang.String[] strArr = A0J;
            if (strArr[7].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == com.facebook.ads.redexgen.core.EnumC1578fm.A05) {
                this.A0E = true;
            }
        }
        this.A0B.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A06 = com.facebook.ads.redexgen.core.EnumC1102Vf.A03;
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(com.facebook.ads.redexgen.core.UK uk, com.facebook.ads.redexgen.core.VV vv) {
        java.lang.String str;
        this.A0D = false;
        this.A0E = false;
        this.A05 = vv;
        A0C();
        com.facebook.ads.redexgen.core.C3S c3s = this.A08;
        if (uk != null && uk.getAdCoverImage() != null) {
            com.facebook.ads.redexgen.core.C1098Vb adCoverImage = uk.getAdCoverImage();
            java.lang.String[] strArr = A0J;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            A0J[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            str = adCoverImage.getUrl();
        } else {
            str = null;
        }
        c3s.setImage(str, new com.facebook.ads.redexgen.core.W2(this));
        this.A06 = uk.A1D();
        this.A09.setPlayAccessibilityLabel(uk.A1K());
        this.A09.setPauseAccessibilityLabel(uk.A1J());
        this.A0B.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(com.facebook.ads.redexgen.core.EnumC1523et enumC1523et) {
        if (this.A07 != null) {
            this.A07.A0e(enumC1523et, 24);
        } else {
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            android.util.Log.e(A0K, A09(30, 42, 7));
        }
    }

    private boolean A0S() {
        if (this.A02 != null && this.A02.getDisableFullScreen() != null) {
            this.A04.A0F().ABg();
        }
        if (!com.facebook.ads.redexgen.core.C1086Up.A1Y(this.A04)) {
            this.A04.A0F().ABf();
        }
        return (this.A02 == null || this.A02.getDisableFullScreen() == null || !this.A02.getDisableFullScreen().booleanValue() || com.facebook.ads.redexgen.core.C1086Up.A1Y(this.A04)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T() {
        if (this.A07 == null || this.A07.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06) {
            return false;
        }
        return this.A06 == com.facebook.ads.redexgen.core.EnumC1102Vf.A05 || this.A06 == com.facebook.ads.redexgen.core.EnumC1102Vf.A03;
    }

    public static /* synthetic */ boolean A0U(android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ void A0a() {
        if (this.A07 != null) {
            this.A07.A0g(this.A09);
        }
    }

    public final /* synthetic */ void A0b() {
        if (this.A07 != null) {
            this.A07.A0f(this.A09);
        }
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(android.content.Context context, com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer, com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        com.facebook.ads.redexgen.core.VX A04;
        ((com.facebook.ads.redexgen.core.C1006Rm) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        this.A03 = mediaViewVideoRendererApi;
        switch (i) {
            case 0:
                A04 = A04(mediaViewVideoRendererApi);
                break;
            case 1:
                A04 = A03(mediaViewVideoRendererApi);
                break;
            default:
                throw new java.lang.IllegalArgumentException(A09(0, 30, 15));
        }
        ((com.facebook.ads.redexgen.core.C1019Rz) mediaViewVideoRendererApi).A06(A04);
        this.A04 = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
        this.A01 = mediaViewVideoRenderer;
        this.A08 = new com.facebook.ads.redexgen.core.C3S(this.A04);
        this.A0A = A05();
        this.A0B = A08();
        float density = com.facebook.ads.redexgen.core.XX.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A09 = new com.facebook.ads.redexgen.core.C3L(this.A04);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A09.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A09.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A01.getChildCount();
            if (A0J[2].length() == 26) {
                throw new java.lang.RuntimeException();
            }
            A0J[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                android.view.View childAt = this.A01.getChildAt(0);
                if (childAt instanceof com.facebook.ads.redexgen.core.C04916r) {
                    this.A07 = (com.facebook.ads.redexgen.core.C04916r) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A07 == null) {
            if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                android.util.Log.e(A0K, A09(72, 36, 98));
            }
        } else {
            this.A07.A0f(this.A08);
            com.facebook.ads.redexgen.core.C04916r c04916r = this.A07;
            com.facebook.ads.redexgen.core.C3L c3l = this.A09;
            java.lang.String[] strArr = A0J;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c04916r.A0f(c3l);
            } else {
                A0J[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c04916r.A0f(c3l);
            }
        }
        this.A0B.A0W(0);
        this.A0B.A0X(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        A04.AJU();
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0C = true;
        A0I();
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0C = false;
        A0I();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0s = com.facebook.ads.redexgen.core.C1086Up.A0s(this.A04);
        boolean A0S = A0S();
        this.A01.setOnTouchListener(new com.facebook.ads.redexgen.core.VT(this, A0s, A0S));
        boolean disableVideoFullscreenOnNative = A0s || A0S;
        if (!disableVideoFullscreenOnNative) {
            A0E();
        } else {
            A0D();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        A0I();
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0I();
    }
}
