package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ງ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0719 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f1986;

    public C0719(C0588 c0588) {
        this.f1986 = c0588;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        this.f1986.getClass();
        AdManagerAdView adManagerAdView = (AdManagerAdView) AbstractC0599.m5554(arrayList, 0, AdManagerAdView.class);
        this.f1986.getClass();
        adManagerAdView.setAdListener((AdListener) AbstractC0599.m5554(arrayList, 1, AdListener.class));
        return null;
    }
}
