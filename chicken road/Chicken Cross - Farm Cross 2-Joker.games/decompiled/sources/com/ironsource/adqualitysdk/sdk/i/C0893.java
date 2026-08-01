package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0893 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2518;

    public C0893(C0759 c0759) {
        this.f2518 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2518;
        AppLovinBroadcastManager appLovinBroadcastManager = (AppLovinBroadcastManager) arrayList.get(0);
        AppLovinBroadcastManager.Receiver receiver = (AppLovinBroadcastManager.Receiver) arrayList.get(1);
        c0759.getClass();
        appLovinBroadcastManager.unregisterReceiver(receiver);
        return null;
    }
}
