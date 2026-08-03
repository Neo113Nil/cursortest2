package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleOpenUrl.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "context", "Landroid/content/Context;", "intentCreation", "Lcom/unity3d/ads/core/domain/IntentCreation;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/IntentCreation;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "url", "", "packageName", "action", "extras", "", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidHandleOpenUrl implements com.unity3d.ads.core.domain.HandleOpenUrl {
    private final android.content.Context context;
    private final com.unity3d.ads.core.domain.IntentCreation intentCreation;

    public AndroidHandleOpenUrl(android.content.Context context, com.unity3d.ads.core.domain.IntentCreation intentCreation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(final com.unity3d.ads.core.data.model.AdObject adObject, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 androidHandleOpenUrl$invoke$1;
        int i;
        java.lang.Object m10798constructorimpl;
        boolean m10805isSuccessimpl;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1) {
            androidHandleOpenUrl$invoke$1 = (com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1) continuation;
            if ((androidHandleOpenUrl$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleOpenUrl$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidHandleOpenUrl$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleOpenUrl$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    android.content.Intent invoke = this.intentCreation.invoke(str, str2, str3, map);
                    if (adObject.getAdType() == gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                        invoke.setFlags(268435456);
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            com.unity3d.ads.core.domain.AndroidHandleOpenUrl androidHandleOpenUrl = this;
                            this.context.startActivity(invoke);
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        m10805isSuccessimpl = kotlin.Result.m10805isSuccessimpl(m10798constructorimpl);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(m10805isSuccessimpl);
                    }
                    final kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1(adObject, invoke, z, null));
                    kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.DisplayMessage> flow = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.DisplayMessage>() { // from class: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject$inlined;
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2", f = "AndroidHandleOpenUrl.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                            /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                java.lang.Object L$0;
                                java.lang.Object L$1;
                                int label;
                                /* synthetic */ java.lang.Object result;

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.unity3d.ads.core.data.model.AdObject adObject) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$adObject$inlined = adObject;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        java.lang.Object obj2 = anonymousClass1.result;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                            com.unity3d.ads.adplayer.DisplayMessage displayMessage = (com.unity3d.ads.adplayer.DisplayMessage) obj;
                                            if ((displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) && kotlin.jvm.internal.Intrinsics.areEqual(displayMessage.getOpportunityId(), com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(this.$adObject$inlined.getOpportunityId()).toString())) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.result;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.DisplayMessage> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1.AnonymousClass2(flowCollector, adObject), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    };
                    androidHandleOpenUrl$invoke$1.label = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(flow, androidHandleOpenUrl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult");
                m10805isSuccessimpl = ((com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) obj).getSuccess();
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(m10805isSuccessimpl);
            }
        }
        androidHandleOpenUrl$invoke$1 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1(this, continuation);
        java.lang.Object obj2 = androidHandleOpenUrl$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleOpenUrl$invoke$1.label;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult");
        m10805isSuccessimpl = ((com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) obj2).getSuccess();
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(m10805isSuccessimpl);
    }
}
