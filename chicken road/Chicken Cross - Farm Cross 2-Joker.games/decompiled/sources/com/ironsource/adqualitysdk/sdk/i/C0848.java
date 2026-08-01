package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.viewmodel.RewardedAdEventListenerNotifications;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔊ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0848 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2459;

    public C0848(C0441 c0441) {
        this.f2459 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2459;
        RewardedAdEventListenerNotifications rewardedAdEventListenerNotifications = (RewardedAdEventListenerNotifications) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0441.getClass();
        rewardedAdEventListenerNotifications.setEventListener(eventListener);
        return null;
    }
}
