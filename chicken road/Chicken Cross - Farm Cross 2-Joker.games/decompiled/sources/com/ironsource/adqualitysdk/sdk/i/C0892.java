package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖽ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0892 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2517;

    public C0892(C0759 c0759) {
        this.f2517 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2517;
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = (AppLovinCommunicatorMessage) arrayList.get(0);
        c0759.getClass();
        return appLovinCommunicatorMessage.getMessageData();
    }
}
