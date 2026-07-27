package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮢ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1187 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1170 f3373;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ int f3374;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ int f3375;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f3376;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0976 f3377;

    public C1187(C1170 c1170, C0976 c0976, MediaPlayer mediaPlayer, int i, int i2) {
        this.f3373 = c1170;
        this.f3377 = c0976;
        this.f3376 = mediaPlayer;
        this.f3375 = i;
        this.f3374 = i2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f3373.f3349.mo5783(this.f3377, this.f3376, this.f3375, this.f3374);
    }
}
