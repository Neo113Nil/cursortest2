package androidx.privacysandbox.ads.adservices.appsetid;

/* compiled from: AppSetIdManagerImplCommon.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "mAppSetIdManager", "Landroid/adservices/appsetid/AppSetIdManager;", "(Landroid/adservices/appsetid/AppSetIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", com.ironsource.Ve.n, "Landroid/adservices/appsetid/AppSetId;", "getAppSetId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class AppSetIdManagerImplCommon extends androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager {
    private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

    @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
    public java.lang.Object getAppSetId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> continuation) {
        return getAppSetId$suspendImpl(this, continuation);
    }

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
        this.mAppSetIdManager = mAppSetIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object getAppSetId$suspendImpl(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon appSetIdManagerImplCommon, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> continuation) {
        androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 appSetIdManagerImplCommon$getAppSetId$1;
        int i;
        if (continuation instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1) {
            appSetIdManagerImplCommon$getAppSetId$1 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1) continuation;
            if ((appSetIdManagerImplCommon$getAppSetId$1.label & Integer.MIN_VALUE) != 0) {
                appSetIdManagerImplCommon$getAppSetId$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = appSetIdManagerImplCommon$getAppSetId$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appSetIdManagerImplCommon$getAppSetId$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    appSetIdManagerImplCommon$getAppSetId$1.L$0 = appSetIdManagerImplCommon;
                    appSetIdManagerImplCommon$getAppSetId$1.label = 1;
                    obj = appSetIdManagerImplCommon.getAppSetIdAsyncInternal(appSetIdManagerImplCommon$getAppSetId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appSetIdManagerImplCommon = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon) appSetIdManagerImplCommon$getAppSetId$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return appSetIdManagerImplCommon.convertResponse((android.adservices.appsetid.AppSetId) obj);
            }
        }
        appSetIdManagerImplCommon$getAppSetId$1 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1(appSetIdManagerImplCommon, continuation);
        java.lang.Object obj2 = appSetIdManagerImplCommon$getAppSetId$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appSetIdManagerImplCommon$getAppSetId$1.label;
        if (i != 0) {
        }
        return appSetIdManagerImplCommon.convertResponse((android.adservices.appsetid.AppSetId) obj2);
    }

    private final androidx.privacysandbox.ads.adservices.appsetid.AppSetId convertResponse(android.adservices.appsetid.AppSetId response) {
        if (response.getScope() == 1) {
            java.lang.String id = response.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "response.id");
            return new androidx.privacysandbox.ads.adservices.appsetid.AppSetId(id, 1);
        }
        java.lang.String id2 = response.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "response.id");
        return new androidx.privacysandbox.ads.adservices.appsetid.AppSetId(id2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getAppSetIdAsyncInternal(kotlin.coroutines.Continuation<? super android.adservices.appsetid.AppSetId> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mAppSetIdManager.getAppSetId(new androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0(), androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
