package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotificationsInterface;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0847 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2458;

    public C0847(C0441 c0441) {
        this.f2458 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2458;
        EventListenerNotificationsInterface eventListenerNotificationsInterface = (EventListenerNotificationsInterface) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0441.getClass();
        eventListenerNotificationsInterface.setEventListener(eventListener);
        return null;
    }
}
