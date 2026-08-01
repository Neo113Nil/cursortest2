package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1248 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1237 f3537;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f3538;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0881 f3539;

    public C1248(C1237 c1237, C0881 c0881, MediaPlayer mediaPlayer) {
        this.f3537 = c1237;
        this.f3539 = c0881;
        this.f3538 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f3537.f3518.mo5727(this.f3539, this.f3538);
    }
}
