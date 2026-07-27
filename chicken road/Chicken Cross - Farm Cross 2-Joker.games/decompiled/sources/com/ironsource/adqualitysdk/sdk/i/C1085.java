package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1085 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f3199;

    public C1085(C0588 c0588) {
        this.f3199 = c0588;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        this.f3199.getClass();
        PublisherAdView publisherAdView = (PublisherAdView) AbstractC0599.m5554(arrayList, 0, PublisherAdView.class);
        this.f3199.getClass();
        publisherAdView.setAdListener((AdListener) AbstractC0599.m5554(arrayList, 1, AdListener.class));
        return null;
    }
}
