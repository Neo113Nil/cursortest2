package com.unity3d.ads.core.domain;

/* compiled from: AndroidShow.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidShow$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.UnityAdsShowOptions $showOptions;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidShow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidShow$invoke$1(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.AndroidShow androidShow, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow$invoke$1> continuation) {
        super(2, continuation);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.AndroidShow$invoke$1 androidShow$invoke$1 = new com.unity3d.ads.core.domain.AndroidShow$invoke$1(this.$adObject, this.this$0, this.$showOptions, continuation);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidShow$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.data.repository.AdRepository adRepository;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            if (!(!this.$adObject.getOpportunityId().isEmpty())) {
                throw new java.lang.IllegalArgumentException("No opportunityId".toString());
            }
            com.google.protobuf.ByteString opportunityId = this.$adObject.getOpportunityId();
            adRepository = this.this$0.adRepository;
            com.unity3d.ads.core.data.model.AdObject ad = adRepository.getAd(opportunityId);
            if (ad != null) {
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                com.unity3d.ads.adplayer.AdPlayer adPlayer = ad.getAdPlayer();
                if (adPlayer == null) {
                    throw new java.lang.IllegalStateException("No adPlayer associated with ad");
                }
                this.label = 1;
                if (kotlinx.coroutines.flow.FlowKt.transformWhile(kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.onStart(adPlayer.getOnShowEvent(), new com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass2(ad, this.this$0, this.$adObject, this.$showOptions, null)), new com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass3(this.$adObject, this.this$0, opportunityId, null)), new com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.unity3d.ads.core.domain.AndroidShow$invoke$1.5
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return emit((com.unity3d.ads.core.data.model.ShowEvent) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                    }

                    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object emit = flowCollector.emit(showEvent, continuation);
                        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new java.lang.IllegalStateException("No ad associated with opportunityId");
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: AndroidShow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $ad;
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ com.unity3d.ads.core.domain.AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.AndroidShow androidShow, com.unity3d.ads.core.data.model.AdObject adObject2, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ad = adObject;
            this.this$0 = androidShow;
            this.$adObject = adObject2;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        
            if (r1 == null) goto L11;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.configuration.GameServerIdReader gameServerIdReader;
            org.json.JSONObject data;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.model.AdObject adObject = this.$ad;
            gameServerIdReader = this.this$0.gameServerIdReader;
            com.unity3d.ads.core.configuration.GameServerIdReader gameServerIdReader2 = gameServerIdReader;
            java.lang.Object obj2 = gameServerIdReader2.getJsonStorage().get(gameServerIdReader2.getKey());
            java.util.Map<java.lang.String, java.lang.Object> map = null;
            if (obj2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
                if (!(obj2 instanceof java.lang.String)) {
                    obj2 = null;
                }
            }
            obj2 = null;
            java.lang.Object obj3 = gameServerIdReader2.getJsonStorage().get(gameServerIdReader2.getKey());
            if (obj3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(key)");
                gameServerIdReader2.getJsonStorage().delete(gameServerIdReader2.getKey());
            }
            adObject.setPlayerServerId((java.lang.String) obj2);
            this.$adObject.getState().setValue(com.unity3d.ads.core.data.model.AdObjectState.SHOWING);
            com.unity3d.ads.adplayer.AdPlayer adPlayer = this.$ad.getAdPlayer();
            com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            if (unityAdsShowOptions != null && (data = unityAdsShowOptions.getData()) != null) {
                map = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(data);
            }
            adPlayer.show(new com.unity3d.ads.adplayer.AndroidShowOptions(map, this.$ad.getPlacementId(), this.$ad.isScarAd(), this.$ad.getScarQueryId(), this.$ad.getScarAdString(), this.$ad.getScarAdUnitId(), this.$ad.isOfferwallAd(), this.$ad.getOfferwallPlacementName()));
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidShow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        int label;
        final /* synthetic */ com.unity3d.ads.core.domain.AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.AndroidShow androidShow, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass3> continuation) {
            super(3, continuation);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$opportunityId = byteString;
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass3(this.$adObject, this.this$0, this.$opportunityId, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.data.repository.AdRepository adRepository;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.$adObject.getState().setValue(com.unity3d.ads.core.data.model.AdObjectState.COMPLETED);
            adRepository = this.this$0.adRepository;
            adRepository.removeAd(this.$opportunityId);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidShow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", i = {0}, l = {54}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, com.unity3d.ads.core.data.model.ShowEvent, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        AnonymousClass4(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass4 anonymousClass4 = new com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass4(continuation);
            anonymousClass4.L$0 = flowCollector;
            anonymousClass4.L$1 = showEvent;
            return anonymousClass4.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.data.model.ShowEvent showEvent;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                com.unity3d.ads.core.data.model.ShowEvent showEvent2 = (com.unity3d.ads.core.data.model.ShowEvent) this.L$1;
                this.L$0 = showEvent2;
                this.label = 1;
                if (flowCollector.emit(showEvent2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                showEvent = showEvent2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                showEvent = (com.unity3d.ads.core.data.model.ShowEvent) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) || (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Error)) ? false : true);
        }
    }
}
