package com.inmobi.media;

/* renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2595mj implements com.applovin.communicator.AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function2 f5340a;

    public C2595mj(kotlin.jvm.functions.Function2 function2) {
        this.f5340a = function2;
    }

    public final java.lang.String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    public final void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        android.net.Uri data = message.getData();
        message.getTopic();
        java.util.Objects.toString(data);
        kotlin.jvm.functions.Function2 function2 = this.f5340a;
        android.os.Bundle messageData = message.getMessageData();
        java.lang.String topic = message.getTopic();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(topic, "getTopic(...)");
        function2.invoke(messageData, topic);
    }
}
