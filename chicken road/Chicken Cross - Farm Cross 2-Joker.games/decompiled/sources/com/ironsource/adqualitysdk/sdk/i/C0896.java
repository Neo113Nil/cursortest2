package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᗁ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0896 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2521;

    public C0896(C0759 c0759) {
        this.f2521 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2521;
        Context context = (Context) arrayList.get(0);
        c0759.getClass();
        return AppLovinBroadcastManager.getInstance(context);
    }
}
