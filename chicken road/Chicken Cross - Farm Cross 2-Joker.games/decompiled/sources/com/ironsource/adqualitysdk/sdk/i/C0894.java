package com.ironsource.adqualitysdk.sdk.i;

import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0894 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2519;

    public C0894(C0759 c0759) {
        this.f2519 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2519;
        AppLovinBroadcastManager appLovinBroadcastManager = (AppLovinBroadcastManager) arrayList.get(0);
        AppLovinBroadcastManager.Receiver receiver = (AppLovinBroadcastManager.Receiver) arrayList.get(1);
        IntentFilter intentFilter = (IntentFilter) arrayList.get(2);
        c0759.getClass();
        appLovinBroadcastManager.registerReceiver(receiver, intentFilter);
        return null;
    }
}
