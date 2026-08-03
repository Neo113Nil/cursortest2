package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidScarManager.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011JA\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0010H\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidScarManager;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarEventReceiver", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "gmaBridge", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "scarTimeHackFixer", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "(Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;)V", "getSignals", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "adFormat", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAd", "", "placementId", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_STRING, "adUnitId", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_QUERY_ID, "videoLength", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBannerAd", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "context", "Landroid/content/Context;", "bannerView", "Lcom/unity3d/services/banners/BannerView;", "scarAdMetadata", "Lcom/unity3d/scar/adapter/common/scarads/ScarAdMetadata;", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", "opportunityId", com.ironsource.C3232q2.v, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidScarManager implements com.unity3d.ads.core.data.manager.ScarManager {
    private final com.unity3d.services.ads.gmascar.GMAScarAdapterBridge gmaBridge;
    private final com.unity3d.ads.core.domain.scar.CommonScarEventReceiver scarEventReceiver;
    private final com.unity3d.ads.core.domain.scar.ScarTimeHackFixer scarTimeHackFixer;

    public AndroidScarManager(com.unity3d.ads.core.domain.scar.CommonScarEventReceiver scarEventReceiver, com.unity3d.services.ads.gmascar.GMAScarAdapterBridge gmaBridge, com.unity3d.ads.core.domain.scar.ScarTimeHackFixer scarTimeHackFixer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarEventReceiver, "scarEventReceiver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gmaBridge, "gmaBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(5000L, new com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2(this, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public java.lang.Object getSignals(java.util.List<? extends gatewayprotocol.v1.AdFormatOuterClass.AdFormat> list, kotlin.coroutines.Continuation<? super com.unity3d.services.ads.gmascar.models.BiddingSignals> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2(list, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object loadAd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 androidScarManager$loadAd$1;
        int i2;
        com.unity3d.ads.core.domain.scar.GmaEventData gmaEventData;
        if (continuation instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1) {
            androidScarManager$loadAd$1 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1) continuation;
            if ((androidScarManager$loadAd$1.label & Integer.MIN_VALUE) != 0) {
                androidScarManager$loadAd$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 androidScarManager$loadAd$12 = androidScarManager$loadAd$1;
                java.lang.Object obj = androidScarManager$loadAd$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = androidScarManager$loadAd$12.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(this.scarEventReceiver.getGmaEventFlow(), new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2(this, kotlin.text.StringsKt.equals(str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL.toString(), true), str2, str5, str3, str4, i, null));
                    com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 androidScarManager$loadAd$3 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3(str2, null);
                    androidScarManager$loadAd$12.label = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(onSubscription, androidScarManager$loadAd$3, androidScarManager$loadAd$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                gmaEventData = (com.unity3d.ads.core.domain.scar.GmaEventData) (((com.unity3d.ads.core.domain.scar.GmaEventData) obj).getGmaEvent() != com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED ? obj : null);
                if (gmaEventData == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error loading SCAR ad: ");
                    java.lang.Object errorMessage = gmaEventData.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = gmaEventData.getGmaEvent();
                    }
                    sb.append(errorMessage);
                    throw new com.unity3d.ads.core.data.model.exception.LoadException(0, sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidScarManager$loadAd$1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1(this, continuation);
        com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 androidScarManager$loadAd$122 = androidScarManager$loadAd$1;
        java.lang.Object obj2 = androidScarManager$loadAd$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = androidScarManager$loadAd$122.label;
        if (i2 != 0) {
        }
        gmaEventData = (com.unity3d.ads.core.domain.scar.GmaEventData) (((com.unity3d.ads.core.domain.scar.GmaEventData) obj2).getGmaEvent() != com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED ? obj2 : null);
        if (gmaEventData == null) {
        }
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.scar.GmaEventData> loadBannerAd(android.content.Context context, com.unity3d.services.banners.BannerView bannerView, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.services.banners.UnityBannerSize bannerSize, final java.lang.String opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarAdMetadata, "scarAdMetadata");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        final kotlinx.coroutines.flow.Flow onStart = kotlinx.coroutines.flow.FlowKt.onStart(this.scarEventReceiver.getGmaEventFlow(), new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1(this, context, bannerView, opportunityId, scarAdMetadata, bannerSize, null));
        return new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.scar.GmaEventData>() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ java.lang.String $opportunityId$inlined;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                com.unity3d.ads.core.domain.scar.GmaEventData gmaEventData = (com.unity3d.ads.core.domain.scar.GmaEventData) obj;
                                if (gmaEventData.getGmaEvent() == com.unity3d.scar.adapter.common.GMAEvent.BANNER && kotlin.jvm.internal.Intrinsics.areEqual(gmaEventData.getOpportunityId(), this.$opportunityId$inlined)) {
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
                    anonymousClass1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.domain.scar.GmaEventData> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2(flowCollector, opportunityId), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.domain.scar.GmaEventData> show(java.lang.String placementId, java.lang.String queryId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryId, "queryId");
        return kotlinx.coroutines.flow.FlowKt.transformWhile(kotlinx.coroutines.flow.FlowKt.onSubscription(this.scarEventReceiver.getGmaEventFlow(), new com.unity3d.ads.core.data.manager.AndroidScarManager$show$1(this, placementId, queryId, null)), new com.unity3d.ads.core.data.manager.AndroidScarManager$show$2(null));
    }
}
