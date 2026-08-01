package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Hk implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f6607a;

    public Hk(Function2 function2) {
        this.f6607a = function2;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "Received data " + message.getData() + " on topic: " + message.getTopic();
        Function2 function2 = this.f6607a;
        Bundle messageData = message.getMessageData();
        String topic = message.getTopic();
        Intrinsics.checkNotNullExpressionValue(topic, "getTopic(...)");
        function2.invoke(messageData, topic);
    }
}
