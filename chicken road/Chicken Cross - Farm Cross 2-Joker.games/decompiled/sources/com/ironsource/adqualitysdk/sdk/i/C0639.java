package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0639 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f1777;

    public C0639(C0588 c0588) {
        this.f1777 = c0588;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        this.f1777.getClass();
        AdView adView = (AdView) AbstractC0599.m5554(arrayList, 0, AdView.class);
        this.f1777.getClass();
        adView.setAdListener((AdListener) AbstractC0599.m5554(arrayList, 1, AdListener.class));
        return null;
    }
}
