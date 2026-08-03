package com.unity3d.ads.core.domain;

/* compiled from: LegacyShowUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "emit", "(Lcom/unity3d/ads/core/data/model/ShowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LegacyShowUseCase$invoke$4<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
    final /* synthetic */ java.lang.String $placement;
    final /* synthetic */ kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase this$0;

    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$4(com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase, long j, java.lang.String str, com.unity3d.ads.core.data.model.Listeners listeners, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.jvm.functions.Function6<? super java.lang.String, ? super com.unity3d.ads.UnityAds.UnityAdsShowError, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$adObject = adObject;
        this.$reportShowError = function6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4 legacyShowUseCase$invoke$4;
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4<T> legacyShowUseCase$invoke$42;
        kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError;
        java.lang.String shortenedStackTrace$default;
        kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function62;
        java.lang.String reason;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError2;
        java.lang.String message;
        java.lang.Integer boxInt;
        java.lang.String message2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object sendOperativeError;
        com.unity3d.ads.core.data.model.ShowEvent showEvent2 = showEvent;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1) {
            legacyShowUseCase$invoke$4$emit$1 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1) continuation;
            if ((legacyShowUseCase$invoke$4$emit$1.label & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$4$emit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = legacyShowUseCase$invoke$4$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                legacyShowUseCase$invoke$4 = legacyShowUseCase$invoke$4$emit$1.label;
                if (legacyShowUseCase$invoke$4 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        if (showEvent2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Started) {
                            this.this$0.showStarted(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.$startTime), this.$placement, this.$listeners);
                        } else if (showEvent2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Clicked) {
                            this.this$0.showClicked(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.$startTime), this.$placement, this.$listeners);
                        } else if (showEvent2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) {
                            this.this$0.showCompleted(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.$startTime), this.$placement, ((com.unity3d.ads.core.data.model.ShowEvent.Completed) showEvent2).getStatus(), this.$listeners, ((com.unity3d.ads.core.data.model.ShowEvent.Completed) showEvent2).getReason(), ((com.unity3d.ads.core.data.model.ShowEvent.Completed) showEvent2).getReasonDebug());
                        } else if (showEvent2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error) {
                            mutableStateFlow = this.this$0.hasStarted;
                            if (((java.lang.Boolean) mutableStateFlow.getValue()).booleanValue()) {
                                this.this$0.showCompleted(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.$startTime), this.$placement, com.unity3d.ads.adplayer.model.ShowStatus.ERROR, this.$listeners, ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getReason(), ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getMessage());
                            } else {
                                com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase = this.this$0;
                                gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                                java.lang.String message3 = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getMessage();
                                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                                legacyShowUseCase$invoke$4$emit$1.L$0 = this;
                                legacyShowUseCase$invoke$4$emit$1.L$1 = showEvent2;
                                legacyShowUseCase$invoke$4$emit$1.label = 1;
                                sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$1);
                                if (sendOperativeError == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                legacyShowUseCase$invoke$42 = this;
                                function62 = legacyShowUseCase$invoke$42.$reportShowError;
                                reason = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getReason();
                                unityAdsShowError2 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                message = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getMessage();
                                boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getErrorCode());
                                message2 = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getMessage();
                                legacyShowUseCase$invoke$4$emit$1.L$0 = legacyShowUseCase$invoke$42;
                                legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                                legacyShowUseCase$invoke$4$emit$1.label = 2;
                                if (function62.invoke(reason, unityAdsShowError2, message, boxInt, message2, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
                                }
                            }
                        } else if (showEvent2 instanceof com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout) {
                            this.this$0.cancelTimeout(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.$startTime));
                        } else if (showEvent2 instanceof com.unity3d.ads.core.data.model.ShowEvent.LeftApplication) {
                            this.this$0.bannerLeftApplication(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.$startTime), this.$placement, this.$listeners);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        legacyShowUseCase$invoke$4 = this;
                        function6 = legacyShowUseCase$invoke$4.$reportShowError;
                        unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                        shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                        legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                        legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                        legacyShowUseCase$invoke$4$emit$1.label = 3;
                        if (function6.invoke("uncaught_exception", unityAdsShowError, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    try {
                        if (legacyShowUseCase$invoke$4 == 1) {
                            showEvent2 = (com.unity3d.ads.core.data.model.ShowEvent) legacyShowUseCase$invoke$4$emit$1.L$1;
                            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4<T> legacyShowUseCase$invoke$43 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4) legacyShowUseCase$invoke$4$emit$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            legacyShowUseCase$invoke$42 = legacyShowUseCase$invoke$43;
                            try {
                                function62 = legacyShowUseCase$invoke$42.$reportShowError;
                                reason = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getReason();
                                unityAdsShowError2 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                message = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getMessage();
                                boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getErrorCode());
                                message2 = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent2).getMessage();
                                legacyShowUseCase$invoke$4$emit$1.L$0 = legacyShowUseCase$invoke$42;
                                legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                                legacyShowUseCase$invoke$4$emit$1.label = 2;
                                if (function62.invoke(reason, unityAdsShowError2, message, boxInt, message2, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                legacyShowUseCase$invoke$4 = legacyShowUseCase$invoke$42;
                                function6 = legacyShowUseCase$invoke$4.$reportShowError;
                                unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                                legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                                legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                                legacyShowUseCase$invoke$4$emit$1.label = 3;
                                if (function6.invoke("uncaught_exception", unityAdsShowError, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        } else if (legacyShowUseCase$invoke$4 == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } else {
                            if (legacyShowUseCase$invoke$4 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        function6 = legacyShowUseCase$invoke$4.$reportShowError;
                        unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                        shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                        legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                        legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                        legacyShowUseCase$invoke$4$emit$1.label = 3;
                        if (function6.invoke("uncaught_exception", unityAdsShowError, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$4$emit$1) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        legacyShowUseCase$invoke$4$emit$1 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1(this, continuation);
        java.lang.Object obj2 = legacyShowUseCase$invoke$4$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        legacyShowUseCase$invoke$4 = legacyShowUseCase$invoke$4$emit$1.label;
        if (legacyShowUseCase$invoke$4 != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return emit((com.unity3d.ads.core.data.model.ShowEvent) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }
}
