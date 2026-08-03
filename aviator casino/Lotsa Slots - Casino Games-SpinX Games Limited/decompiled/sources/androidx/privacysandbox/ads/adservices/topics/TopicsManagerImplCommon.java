package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManagerImplCommon.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0097@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0083@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "mTopicsManager", "Landroid/adservices/topics/TopicsManager;", "(Landroid/adservices/topics/TopicsManager;)V", "convertRequest", "Landroid/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "convertRequest$ads_adservices_release", "convertResponse", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", com.ironsource.Ve.n, "Landroid/adservices/topics/GetTopicsResponse;", "convertResponse$ads_adservices_release", "getTopics", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopicsAsyncInternal", "getTopicsRequest", "(Landroid/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class TopicsManagerImplCommon extends androidx.privacysandbox.ads.adservices.topics.TopicsManager {
    private final android.adservices.topics.TopicsManager mTopicsManager;

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    public java.lang.Object getTopics(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> continuation) {
        return getTopics$suspendImpl(this, getTopicsRequest, continuation);
    }

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager mTopicsManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon topicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> continuation) {
        androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 topicsManagerImplCommon$getTopics$1;
        int i;
        if (continuation instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) {
            topicsManagerImplCommon$getTopics$1 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) continuation;
            if ((topicsManagerImplCommon$getTopics$1.label & Integer.MIN_VALUE) != 0) {
                topicsManagerImplCommon$getTopics$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = topicsManagerImplCommon$getTopics$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = topicsManagerImplCommon$getTopics$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release = topicsManagerImplCommon.convertRequest$ads_adservices_release(getTopicsRequest);
                    topicsManagerImplCommon$getTopics$1.L$0 = topicsManagerImplCommon;
                    topicsManagerImplCommon$getTopics$1.label = 1;
                    obj = topicsManagerImplCommon.getTopicsAsyncInternal(convertRequest$ads_adservices_release, topicsManagerImplCommon$getTopics$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    topicsManagerImplCommon = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) topicsManagerImplCommon$getTopics$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return topicsManagerImplCommon.convertResponse$ads_adservices_release((android.adservices.topics.GetTopicsResponse) obj);
            }
        }
        topicsManagerImplCommon$getTopics$1 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
        java.lang.Object obj2 = topicsManagerImplCommon$getTopics$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = topicsManagerImplCommon$getTopics$1.label;
        if (i != 0) {
        }
        return topicsManagerImplCommon.convertResponse$ads_adservices_release((android.adservices.topics.GetTopicsResponse) obj2);
    }

    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper.INSTANCE.convertRequestWithoutRecordObservation$ads_adservices_release(request);
    }

    public androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        return androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper.INSTANCE.convertResponse$ads_adservices_release(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, kotlin.coroutines.Continuation<? super android.adservices.topics.GetTopicsResponse> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mTopicsManager.getTopics(getTopicsRequest, new androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
