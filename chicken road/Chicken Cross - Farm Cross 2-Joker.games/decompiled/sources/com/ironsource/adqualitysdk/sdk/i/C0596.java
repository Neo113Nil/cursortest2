package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ث, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0596 extends FullScreenContentCallback implements InterfaceC0997 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f1555;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0807 f1556;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final FullScreenContentCallback f1557;

    public C0596(C0588 c0588, FullScreenContentCallback fullScreenContentCallback, C0807 c0807) {
        this.f1555 = c0588;
        this.f1557 = fullScreenContentCallback;
        this.f1556 = c0807;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        this.f1555.m5529(this, this.f1556, StringFog.decrypt("TOG9PLl0UcFv+pI/hGNGyn7XsDyGdULHYbq+PqtzYMhj97o1jg==\n", "CpTRUOoXI6Q=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1557;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f1555.m5529(this, this.f1556, StringFog.decrypt("/mAhBpgD46bdew4FpRT0rcxWLAanAvCg0zsiBIoE1arLeCQZuAX1hc15ITmoEvSm1lYiBL8F/7c=\n", "uBVNastgkcM=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1557;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        this.f1555.m5529(this, this.f1556, StringFog.decrypt("z2oCBB004ZTscS0HICP2n/1cDwQiNfKS4jEBBg8z1ZDgcwsMGjjAmeZoKB0iO8CS+3oLBg04/YXs\ncRo=\n", "iR9uaE5Xk/E=\n"), adError);
        FullScreenContentCallback fullScreenContentCallback = this.f1557;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(adError);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        this.f1555.m5529(this, this.f1556, StringFog.decrypt("g20FnkQD5n6gdiqdeRTxdbFbCJ57AvV4rjYGnFYE3Xa1agyBZAn7dQ==\n", "xRhp8hdglBs=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1557;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f1555.m5529(this, this.f1556, StringFog.decrypt("C1egEf2PmQcoTI8SwJiODDlhrRHCjooBJgyjE++IuAoiVakZ6JmHDh5BvhjLgqgNI1apE9o=\n", "TSLMfa7s62I=\n"), new Object[0]);
        FullScreenContentCallback fullScreenContentCallback = this.f1557;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this.f1557;
    }
}
