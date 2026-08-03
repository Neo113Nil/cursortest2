package com.unity3d.ads.core.domain;

/* compiled from: LegacyShowUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "diagnosticReason", "", "reason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "message", "code", "", "debugMessage"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LegacyShowUseCase$showError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
    final /* synthetic */ java.lang.String $opportunityId;
    final /* synthetic */ java.lang.String $placement;
    final /* synthetic */ kotlin.time.TimeMark $startTime;
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    /* synthetic */ java.lang.Object L$2;
    /* synthetic */ java.lang.Object L$3;
    /* synthetic */ java.lang.Object L$4;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$showError$1(com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase, java.lang.String str, kotlin.time.TimeMark timeMark, com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String str2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1> continuation) {
        super(6, continuation);
        this.this$0 = legacyShowUseCase;
        this.$opportunityId = str;
        this.$startTime = timeMark;
        this.$listeners = listeners;
        this.$placement = str2;
    }

    @Override // kotlin.jvm.functions.Function6
    public final java.lang.Object invoke(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1(this.this$0, this.$opportunityId, this.$startTime, this.$listeners, this.$placement, continuation);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.log.Logger logger;
        java.lang.String adInfoString;
        com.unity3d.ads.core.data.model.AdObject adObject;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        java.util.Map tags;
        com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = (java.lang.String) this.L$0;
            final com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError = (com.unity3d.ads.UnityAds.UnityAdsShowError) this.L$1;
            final java.lang.String str2 = (java.lang.String) this.L$2;
            java.lang.Integer num = (java.lang.Integer) this.L$3;
            java.lang.String str3 = (java.lang.String) this.L$4;
            logger = this.this$0.logger;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to show ad ");
            adInfoString = this.this$0.getAdInfoString();
            sb.append(adInfoString);
            sb.append(", error: ");
            sb.append(str2);
            com.unity3d.ads.core.log.Logger.DefaultImpls.error$default(logger, sb.toString(), null, 2, null);
            adObject = this.this$0.adObject;
            if (adObject == null) {
                adObject = this.this$0.getTmpAdObject(this.$opportunityId);
            }
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(this.$startTime));
            tags = this.this$0.getTags(str, num, str3);
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_failure_time", boxDouble, tags, null, adObject, null, 40, null);
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            final com.unity3d.ads.core.data.model.Listeners listeners = this.$listeners;
            final java.lang.String str4 = this.$placement;
            safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    com.unity3d.ads.core.data.model.Listeners.this.onError(str4, unityAdsShowError, str2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
