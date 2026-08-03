package androidx.privacysandbox.ads.adservices.adid;

/* compiled from: AdIdManagerImplCommon.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0083@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "mAdIdManager", "Landroid/adservices/adid/AdIdManager;", "(Landroid/adservices/adid/AdIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", com.ironsource.Ve.n, "Landroid/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class AdIdManagerImplCommon extends androidx.privacysandbox.ads.adservices.adid.AdIdManager {
    private final android.adservices.adid.AdIdManager mAdIdManager;

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    public java.lang.Object getAdId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> continuation) {
        return getAdId$suspendImpl(this, continuation);
    }

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object getAdId$suspendImpl(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon adIdManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> continuation) {
        androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 adIdManagerImplCommon$getAdId$1;
        int i;
        if (continuation instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1) {
            adIdManagerImplCommon$getAdId$1 = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1) continuation;
            if ((adIdManagerImplCommon$getAdId$1.label & Integer.MIN_VALUE) != 0) {
                adIdManagerImplCommon$getAdId$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = adIdManagerImplCommon$getAdId$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adIdManagerImplCommon$getAdId$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    adIdManagerImplCommon$getAdId$1.L$0 = adIdManagerImplCommon;
                    adIdManagerImplCommon$getAdId$1.label = 1;
                    obj = adIdManagerImplCommon.getAdIdAsyncInternal(adIdManagerImplCommon$getAdId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adIdManagerImplCommon = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon) adIdManagerImplCommon$getAdId$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return adIdManagerImplCommon.convertResponse((android.adservices.adid.AdId) obj);
            }
        }
        adIdManagerImplCommon$getAdId$1 = new androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, continuation);
        java.lang.Object obj2 = adIdManagerImplCommon$getAdId$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adIdManagerImplCommon$getAdId$1.label;
        if (i != 0) {
        }
        return adIdManagerImplCommon.convertResponse((android.adservices.adid.AdId) obj2);
    }

    private final androidx.privacysandbox.ads.adservices.adid.AdId convertResponse(android.adservices.adid.AdId response) {
        java.lang.String adId = response.getAdId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
        return new androidx.privacysandbox.ads.adservices.adid.AdId(adId, response.isLimitAdTrackingEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getAdIdAsyncInternal(kotlin.coroutines.Continuation<? super android.adservices.adid.AdId> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mAdIdManager.getAdId(new androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
