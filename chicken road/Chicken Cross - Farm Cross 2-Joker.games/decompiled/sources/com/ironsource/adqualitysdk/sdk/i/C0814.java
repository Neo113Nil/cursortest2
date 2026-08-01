package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓙ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0814 implements AppLovinCommunicatorSubscriber {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f2366;

    public C0814(String str) {
        this.f2366 = str;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return this.f2366;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
