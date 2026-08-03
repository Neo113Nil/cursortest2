package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidOfferwallManager.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallBridge", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;)V", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAdReady", "", "placementName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "loadAd", "", "showAd", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidOfferwallManager implements com.unity3d.ads.core.data.manager.OfferwallManager {
    private final com.unity3d.services.ads.offerwall.OfferwallAdapterBridge offerwallBridge;

    public AndroidOfferwallManager(com.unity3d.services.ads.offerwall.OfferwallAdapterBridge offerwallBridge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerwallBridge, "offerwallBridge");
        this.offerwallBridge = offerwallBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public java.lang.Object isConnected(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.offerwallBridge.isConnected());
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public java.lang.Object isAdReady(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.offerwallBridge.isAdReady(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object loadAd(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 androidOfferwallManager$loadAd$1;
        int i;
        com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData;
        if (continuation instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1) {
            androidOfferwallManager$loadAd$1 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1) continuation;
            if ((androidOfferwallManager$loadAd$1.label & Integer.MIN_VALUE) != 0) {
                androidOfferwallManager$loadAd$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidOfferwallManager$loadAd$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidOfferwallManager$loadAd$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.services.core.log.DeviceLog.debug("Offerwall Manager - loadAd: " + str);
                    kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2(this, str, null));
                    com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3(str, null);
                    androidOfferwallManager$loadAd$1.label = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(onSubscription, androidOfferwallManager$loadAd$3, androidOfferwallManager$loadAd$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                offerwallEventData = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) (((com.unity3d.ads.core.domain.offerwall.OfferwallEventData) obj).getOfferwallEvent() != com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS ? obj : null);
                if (offerwallEventData == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error loading offerwall ad: ");
                    java.lang.Object errorMessage = offerwallEventData.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = offerwallEventData.getOfferwallEvent();
                    }
                    sb.append(errorMessage);
                    throw new com.unity3d.ads.core.data.model.exception.LoadException(0, sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidOfferwallManager$loadAd$1 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1(this, continuation);
        java.lang.Object obj2 = androidOfferwallManager$loadAd$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidOfferwallManager$loadAd$1.label;
        if (i != 0) {
        }
        offerwallEventData = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) (((com.unity3d.ads.core.domain.offerwall.OfferwallEventData) obj2).getOfferwallEvent() != com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS ? obj2 : null);
        if (offerwallEventData == null) {
        }
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.offerwall.OfferwallEventData> showAd(java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        com.unity3d.services.core.log.DeviceLog.debug("Offerwall Manager - showAd: " + placementName);
        return kotlinx.coroutines.flow.FlowKt.transformWhile(kotlinx.coroutines.flow.FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1(this, placementName, null)), new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2(null));
    }
}
