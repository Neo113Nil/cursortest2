package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0738 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0588 f2010;

    public C0738(C0588 c0588) {
        this.f2010 = c0588;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0588 c0588 = this.f2010;
        c0588.getClass();
        return new C0613(c0588, (AppOpenAd.AppOpenAdLoadCallback) AbstractC0599.m5554(arrayList, 0, AppOpenAd.AppOpenAdLoadCallback.class), c0807);
    }
}
