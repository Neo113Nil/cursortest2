package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1019Rz implements com.facebook.ads.internal.api.MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"4Iqv8cTE9pbJV", "CYHnjvYzZ1Zp8VPlfffkEyqwlctrpQBL", "X8G7CA2UCcBTYjTzfkqICRpH9C9x48uG", "IuynGJFHahmt0", "YKtJTe5IUh", "gPGIa6LKGgSGxdMiTt4aCF2OLs57juUg", "T83", "DMaEshMk8cfihQw150z6d7U8VPkriS4i"};
    public static final java.lang.String A0I;
    public com.facebook.ads.MediaViewVideoRenderer A00;
    public com.facebook.ads.VideoAutoplayBehavior A01;
    public com.facebook.ads.redexgen.core.C1636gi A03;
    public com.facebook.ads.redexgen.core.VX A04;
    public com.facebook.ads.redexgen.core.C04916r A05;
    public boolean A06;
    public boolean A07;
    public com.facebook.ads.NativeAd A08;
    public final com.facebook.ads.redexgen.core.E0 A0D = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.7K
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onPrepared();
        }
    };
    public final com.facebook.ads.redexgen.core.E2 A0C = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.7J
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            if (com.facebook.ads.redexgen.core.C1019Rz.this.A08 != null) {
                com.facebook.ads.redexgen.core.UK.A0L(com.facebook.ads.redexgen.core.C1019Rz.this.A08.getInternalNativeAd()).A1o(true, true);
            }
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onPlayed();
        }
    };
    public final com.facebook.ads.redexgen.core.E4 A0B = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.7I
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onPaused();
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC0660Dx A0E = new com.facebook.ads.redexgen.core.AbstractC0660Dx() { // from class: com.facebook.ads.redexgen.X.7H
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C0661Dy c0661Dy) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onSeek();
        }
    };
    public final com.facebook.ads.redexgen.core.EA A09 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.7G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer2;
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer3;
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onCompleted();
            mediaViewVideoRenderer2 = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            if (!com.facebook.ads.redexgen.core.C1086Up.A1j(mediaViewVideoRenderer2.getContext())) {
                return;
            }
            mediaViewVideoRenderer3 = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer3.play(com.facebook.ads.VideoStartReason.AUTO_STARTED);
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC0654Dr A0F = new com.facebook.ads.redexgen.core.AbstractC0654Dr() { // from class: com.facebook.ads.redexgen.X.7F
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C0655Ds c0655Ds) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onVolumeChanged();
        }
    };
    public final com.facebook.ads.redexgen.core.E8 A0A = new com.facebook.ads.redexgen.core.E8() { // from class: com.facebook.ads.redexgen.X.7D
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.E9 e9) {
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer;
            if (com.facebook.ads.redexgen.core.C1019Rz.this.A08 != null) {
                com.facebook.ads.redexgen.core.UK.A0L(com.facebook.ads.redexgen.core.C1019Rz.this.A08.getInternalNativeAd()).A1o(false, true);
            }
            mediaViewVideoRenderer = com.facebook.ads.redexgen.core.C1019Rz.this.A00;
            mediaViewVideoRenderer.onError();
        }
    };
    public com.facebook.ads.redexgen.core.C1006Rm A02 = new com.facebook.ads.redexgen.core.C1006Rm();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{com.google.common.base.Ascii.US, 56, 32, 55, 58, 63, 50, 118, 0, 63, 51, 33, 118, 53, 57, 56, 37, 34, 36, 35, 53, 34, 57, 36, 118, 38, 55, 36, 55, 59, 37, 118, 34, 47, 38, 51, 120, 126, 72, 72, 70, 68, 67, 74, com.google.common.base.Ascii.CR, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 88, 94, 89, com.google.common.base.Ascii.CR, 79, 72, com.google.common.base.Ascii.CR, 93, 95, 72, 78, 72, 73, 72, 73, com.google.common.base.Ascii.CR, 79, 84, com.google.common.base.Ascii.CR, 76, com.google.common.base.Ascii.CR, 78, 76, 65, 65, com.google.common.base.Ascii.CR, 89, 66, com.google.common.base.Ascii.CR, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 1, com.google.common.base.Ascii.CR, 76, 67, 73, com.google.common.base.Ascii.CR, 75, 66, 65, 65, 66, 90, 72, 73, com.google.common.base.Ascii.CR, 79, 84, com.google.common.base.Ascii.CR, 76, com.google.common.base.Ascii.CR, 78, 76, 65, 65, com.google.common.base.Ascii.CR, 89, 66, com.google.common.base.Ascii.CR, 73, 68, 94, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 3, 38, 43, 49, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 98, 33, 35, 46, 46, 39, 38, 98, 53, 43, 54, 42, 45, 55, 54, 98, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 108, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 41, 106, 104, 101, 101, 108, 109, 41, 126, 96, 125, 97, 102, 124, 125, 41, 109, 96, 122, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 39};
    }

    static {
        A02();
        A0I = com.facebook.ads.MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((android.net.Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.UK.A0L(this.A08.getInternalNativeAd()).A1o(false, false);
        }
        this.A08 = null;
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.VX vx = this.A04;
            if (A0H[6].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            A0H[6] = "qaG";
            vx.AKY();
        }
    }

    public final void A04(com.facebook.ads.NativeAd nativeAd) {
        this.A08 = nativeAd;
        com.facebook.ads.redexgen.core.C1636gi A16 = ((com.facebook.ads.redexgen.core.UK) nativeAd.getInternalNativeAd()).A16();
        com.facebook.ads.redexgen.core.C1636gi adObjectContext = this.A03;
        adObjectContext.A0L(A16);
        com.facebook.ads.redexgen.core.S2 s2 = (com.facebook.ads.redexgen.core.S2) nativeAd.getNativeAdApi();
        this.A05.setClientToken(com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd()).A1H());
        this.A05.setVideoMPD(s2.A02());
        this.A05.setVideoURI(s2.A03());
        com.facebook.ads.redexgen.core.C1818ju A12 = com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd()).A12();
        if (A12 != null) {
            this.A05.setVideoProgressReportIntervalMs(A12.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = s2.getVideoAutoplayBehavior();
        if (this.A04 != null) {
            this.A04.AJZ(nativeAd);
        }
    }

    public final void A05(com.facebook.ads.redexgen.core.VA va) {
        this.A05.setAdEventManager(va);
    }

    public final void A06(com.facebook.ads.redexgen.core.VX vx) {
        this.A04 = vx;
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv) {
        this.A05.setListener(interfaceC1191Yv);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0W();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(com.facebook.ads.VideoStartReason videoStartReason) {
        if (!this.A06) {
            if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                java.lang.String str = A0I;
                java.lang.String A01 = A01(127, 40, 65);
                if (A0H[6].length() != 3) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0H;
                strArr[0] = "GDpgiWeynUT3r";
                strArr[4] = "Fcrjr5dO1W";
                android.util.Log.w(str, A01);
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0e(com.facebook.ads.redexgen.core.Y6.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                android.util.Log.w(A0I, A01(167, 40, 10));
            }
        } else {
            this.A06 = true;
            this.A07 = com.facebook.ads.redexgen.core.EnumC1578fm.A0A.equals(this.A05.getState());
            this.A05.A0i(false, 1);
            this.A00.onSeekEngaged();
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final android.view.View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer) {
        com.facebook.ads.redexgen.core.C1636gi A03;
        this.A00 = mediaViewVideoRenderer;
        android.content.Context context = adViewConstructorParams.getContext();
        if (context instanceof com.facebook.ads.redexgen.core.C1636gi) {
            A03 = (com.facebook.ads.redexgen.core.C1636gi) context;
        } else {
            A03 = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
        }
        this.A03 = A03;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new com.facebook.ads.redexgen.core.C04916r(A03);
                break;
            case 1:
                this.A05 = new com.facebook.ads.redexgen.core.C04916r(A03, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new com.facebook.ads.redexgen.core.C04916r(A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new com.facebook.ads.redexgen.core.C04916r(A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new java.lang.IllegalArgumentException(A01(0, 37, 85));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A05, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0i(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(com.facebook.ads.VideoStartReason videoStartReason) {
        this.A05.A0e(com.facebook.ads.redexgen.core.Y6.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i) {
        if (!this.A06) {
            boolean isDebugBuild = com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild();
            java.lang.String[] strArr = A0H;
            if (strArr[0].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0H[1] = "0wh1LQIbECU2tB2xLmMlqLa216eizCy3";
            if (isDebugBuild) {
                android.util.Log.w(A0I, A01(37, 90, 46));
                return;
            }
            return;
        }
        this.A05.A0a(i);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        if (this.A05 == null || this.A05.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06) {
            return false;
        }
        return this.A01 == com.facebook.ads.VideoAutoplayBehavior.ON || this.A01 == com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
    }
}
