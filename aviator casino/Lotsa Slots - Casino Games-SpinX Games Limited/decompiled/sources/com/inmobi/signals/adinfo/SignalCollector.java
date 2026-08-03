package com.inmobi.signals.adinfo;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u0010\u001a\u00020\u000f28\u0010\u000e\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u0012\u001a\u00020\r28\u0010\u000e\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/inmobi/signals/adinfo/SignalCollector;", "", "", "", "listOfTopics", "<init>", "(Ljava/util/List;)V", "Lkotlin/Function2;", "Landroid/os/Bundle;", "Lkotlin/ParameterName;", "name", "bundle", "topic", "", "onEvent", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "createSubscriber", "(Lkotlin/jvm/functions/Function2;)Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", "setupAppLovinCommunicator", "(Lkotlin/jvm/functions/Function2;)V", "Ljava/util/List;", "getListOfTopics", "()Ljava/util/List;", "Lcom/applovin/communicator/AppLovinCommunicator;", "communicator", "Lcom/applovin/communicator/AppLovinCommunicator;", "communicatorSubscriber", "Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com/inmobi/media/lj", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignalCollector {
    public static final com.inmobi.media.C2569lj Companion = new com.inmobi.media.C2569lj();
    private static final java.lang.String TAG = "SignalCollector";
    private final com.applovin.communicator.AppLovinCommunicator communicator;
    private com.applovin.communicator.AppLovinCommunicatorSubscriber communicatorSubscriber;
    private final java.util.List<java.lang.String> listOfTopics;

    public SignalCollector(java.util.List<java.lang.String> listOfTopics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listOfTopics, "listOfTopics");
        this.listOfTopics = listOfTopics;
        com.applovin.communicator.AppLovinCommunicator appLovinCommunicator = com.applovin.communicator.AppLovinCommunicator.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appLovinCommunicator, "getInstance(...)");
        this.communicator = appLovinCommunicator;
    }

    private final com.applovin.communicator.AppLovinCommunicatorSubscriber createSubscriber(kotlin.jvm.functions.Function2<? super android.os.Bundle, ? super java.lang.String, kotlin.Unit> onEvent) {
        return new com.inmobi.media.C2595mj(onEvent);
    }

    public final java.util.List<java.lang.String> getListOfTopics() {
        return this.listOfTopics;
    }

    public final void setupAppLovinCommunicator(kotlin.jvm.functions.Function2<? super android.os.Bundle, ? super java.lang.String, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        try {
            com.applovin.communicator.AppLovinCommunicatorSubscriber createSubscriber = createSubscriber(onEvent);
            this.communicatorSubscriber = createSubscriber;
            this.communicator.subscribe(createSubscriber, this.listOfTopics);
            java.util.Objects.toString(this.listOfTopics);
        } catch (java.lang.Error | java.lang.Exception unused) {
        }
    }
}
