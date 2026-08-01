package com.unity3d.ads.core.data.manager;

import com.ironsource.C4593pg;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: AndroidOfferwallManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallBridge", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;Lcom/unity3d/ads/core/log/Logger;)V", C4593pg.b, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "", "isAdReady", "placementName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAd", "", "showAd", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final Logger logger;
    private final OfferwallAdapterBridge offerwallBridge;

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallBridge, Logger logger) {
        Intrinsics.checkNotNullParameter(offerwallBridge, "offerwallBridge");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.offerwallBridge = offerwallBridge;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(Continuation<? super String> continuation) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.offerwallBridge.isConnected());
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.offerwallBridge.isAdReady(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(String str, Continuation<? super Unit> continuation) {
        AndroidOfferwallManager$loadAd$1 androidOfferwallManager$loadAd$1;
        int i;
        OfferwallEventData offerwallEventData;
        if (continuation instanceof AndroidOfferwallManager$loadAd$1) {
            androidOfferwallManager$loadAd$1 = (AndroidOfferwallManager$loadAd$1) continuation;
            if ((androidOfferwallManager$loadAd$1.label & Integer.MIN_VALUE) != 0) {
                androidOfferwallManager$loadAd$1.label -= Integer.MIN_VALUE;
                Object obj = androidOfferwallManager$loadAd$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidOfferwallManager$loadAd$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.logger.debug("Offerwall Manager - loadAd: " + str);
                    SharedFlow onSubscription = FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$loadAd$2(this, str, null));
                    AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new AndroidOfferwallManager$loadAd$3(str, null);
                    androidOfferwallManager$loadAd$1.label = 1;
                    obj = FlowKt.first(onSubscription, androidOfferwallManager$loadAd$3, androidOfferwallManager$loadAd$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                offerwallEventData = (OfferwallEventData) (((OfferwallEventData) obj).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? obj : null);
                if (offerwallEventData == null) {
                    Integer errorCode = offerwallEventData.getErrorCode();
                    int intValue = errorCode != null ? errorCode.intValue() : 0;
                    StringBuilder sb = new StringBuilder("Error loading offerwall ad: ");
                    Object errorMessage = offerwallEventData.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = offerwallEventData.getOfferwallEvent();
                    }
                    throw new LoadException(intValue, sb.append(errorMessage).toString());
                }
                return Unit.INSTANCE;
            }
        }
        androidOfferwallManager$loadAd$1 = new AndroidOfferwallManager$loadAd$1(this, continuation);
        Object obj2 = androidOfferwallManager$loadAd$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidOfferwallManager$loadAd$1.label;
        if (i != 0) {
        }
        offerwallEventData = (OfferwallEventData) (((OfferwallEventData) obj2).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? obj2 : null);
        if (offerwallEventData == null) {
        }
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Flow<OfferwallEventData> showAd(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.logger.debug("Offerwall Manager - showAd: " + placementName);
        return FlowKt.transformWhile(FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$showAd$1(this, placementName, null)), new AndroidOfferwallManager$showAd$2(null));
    }
}
