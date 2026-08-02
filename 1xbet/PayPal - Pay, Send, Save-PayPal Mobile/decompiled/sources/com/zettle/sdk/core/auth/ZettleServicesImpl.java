package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010+\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010$\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/ZettleServicesImpl;", "Lcom/zettle/sdk/core/auth/ZettleService;", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/izettle/android/auth/BackendEnvironment;", "environment", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/core/auth/LoggedInState;", "authFlow", "Lokhttp3/OkHttpClient;", "httpClient", "", "isUatMode", "<init>", "(Lcom/izettle/android/auth/BackendEnvironment;Lkotlinx/coroutines/flow/Flow;Lokhttp3/OkHttpClient;Z)V", "", "service", "Lkotlin/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "getServiceUrls-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "getServiceUrls", "client", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "(Lokhttp3/OkHttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshServices", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "", "Lcom/zettle/sdk/core/auth/ServiceUrlsCache;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/auth/BackendEnvironment;", "Lokhttp3/OkHttpClient;", "Camera2StreamConfigurationMap", "Z", "Lkotlinx/coroutines/Job;", "getInputFormats", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "", "J", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/sync/Mutex;", "", "getOutputFormats"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleServicesImpl implements com.zettle.sdk.core.auth.ZettleService, com.zettle.sdk.core.auth.ServiceProvider, com.zettle.sdk.core.log.Loggable {
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.LoggedInState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.OkHttpClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.izettle.android.auth.BackendEnvironment getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.zettle.sdk.core.auth.ServiceUrlsCache> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;
    private final long getInputSizeshNQ4ISI;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private volatile long getInputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    public ZettleServicesImpl(com.izettle.android.auth.BackendEnvironment backendEnvironment, kotlinx.coroutines.flow.Flow<? extends com.zettle.sdk.core.auth.LoggedInState> flow, okhttp3.OkHttpClient okHttpClient, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.getHighSpeedVideoSizes = backendEnvironment;
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = okHttpClient;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        this.getOutputFormats = new java.util.LinkedHashMap();
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getInputSizeshNQ4ISI = 5000L;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.auth.ServiceProvider
    /* renamed from: getServiceUrls-IoAF18A */
    public final java.lang.Object mo23162getServiceUrlsIoAF18A(java.lang.String service) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getOutputFormats;
        java.lang.String upperCase = service.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.util.List<java.lang.String> list = map.get(upperCase);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Searching urls for key: '");
        sb.append(service);
        sb.append("' and found: ");
        sb.append(list);
        com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
        java.lang.String upperCase2 = service.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        java.util.List<java.lang.String> list2 = this.getOutputFormats.get(upperCase2);
        if (list2 != null) {
            com.zettle.sdk.core.auth.ServiceUrlsCache serviceUrlsCache = this.getHighSpeedVideoFpsRangesFor.get(upperCase2);
            if (serviceUrlsCache != null && serviceUrlsCache.getHighSpeedVideoFpsRangesFor.containsAll(list2) && serviceUrlsCache.getHighSpeedVideoFpsRangesFor.size() == list2.size()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m23436constructorimpl(serviceUrlsCache.getHighResolutionOutputSizeshNQ4ISI);
            }
            com.izettle.android.auth.model.ServiceUrls.Companion companion2 = com.izettle.android.auth.model.ServiceUrls.INSTANCE;
            java.util.List<java.lang.String> list3 = list2;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(com.izettle.android.net.HttpUrl.INSTANCE.parse((java.lang.String) it.next()));
            }
            com.izettle.android.auth.model.ServiceUrls create = companion2.create(arrayList);
            this.getHighSpeedVideoFpsRangesFor.put(upperCase2, new com.zettle.sdk.core.auth.ServiceUrlsCache(list2, create));
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(create);
        }
        com.zettle.sdk.core.auth.ServiceUrlsCache serviceUrlsCache2 = this.getHighSpeedVideoFpsRangesFor.get(upperCase2);
        com.izettle.android.auth.model.ServiceUrls serviceUrls = serviceUrlsCache2 != null ? serviceUrlsCache2.getHighResolutionOutputSizeshNQ4ISI : null;
        if (serviceUrls != null) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(serviceUrls);
        }
        com.izettle.android.auth.model.ServiceUrls serviceUrls2 = this.getHighSpeedVideoSizes.getFallbackUrls().get(upperCase2);
        if (serviceUrls2 != null) {
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(serviceUrls2);
        }
        kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalArgumentException("No url for service: ".concat(java.lang.String.valueOf(upperCase2)))));
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        final kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.LoggedInState> flow = this.getHighSpeedVideoFpsRanges;
        final kotlinx.coroutines.flow.Flow<java.lang.Object> flow2 = new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$Camera2StreamConfigurationMap;
                                if (obj instanceof com.zettle.sdk.core.auth.LoggedInState.LoggedIn) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
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
                    anonymousClass1 = new com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1$2", f = "ServiceProvider.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRanges = obj;
                        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                        return com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$Camera2StreamConfigurationMap = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.getOutputMinFrameDuration = kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.LoggedInState.LoggedIn>() { // from class: com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoFpsRanges;
                                if (!((com.zettle.sdk.core.auth.LoggedInState.LoggedIn) obj).getFailedToRetrieveToken()) {
                                    anonymousClass1.getHighSpeedVideoFpsRanges = 1;
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
                    anonymousClass1 = new com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1$2", f = "ServiceProvider.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$getHighSpeedVideoFpsRanges = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.zettle.sdk.core.auth.LoggedInState.LoggedIn> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.zettle.sdk.core.auth.ZettleServicesImpl$start$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.zettle.sdk.core.auth.ZettleServicesImpl$start$2(this, null)), kotlinx.coroutines.CoroutineScopeKt.plus(com.zettle.sdk.core.auth.AuthModule.INSTANCE.getScope$core_publicRelease(), kotlinx.coroutines.Dispatchers.getIO()));
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getOutputMinFrameDuration = null;
    }

    @Override // com.zettle.sdk.core.auth.ZettleService
    public final java.lang.Object refresh(okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.core.log.LogKt.log(this, "Refreshing base Urls");
        java.lang.Object supervisorScope = kotlinx.coroutines.SupervisorKt.supervisorScope(new com.zettle.sdk.core.auth.ZettleServicesImpl$refresh$2(this, new okhttp3.Request.Builder().url(okhttp3.HttpUrl.INSTANCE.get(this.getHighSpeedVideoSizes.getServiceLookupUrl()).newBuilder().addPathSegment("baseurls").build()).get().build(), okHttpClient, null), continuation);
        return supervisorScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? supervisorScope : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #1 {all -> 0x00ff, blocks: (B:25:0x006c, B:27:0x007a, B:30:0x00a0, B:32:0x00c2, B:33:0x00c8), top: B:24:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[Catch: all -> 0x00ff, TRY_ENTER, TryCatch #1 {all -> 0x00ff, blocks: (B:25:0x006c, B:27:0x007a, B:30:0x00a0, B:32:0x00c2, B:33:0x00c8), top: B:24:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.zettle.sdk.core.auth.ZettleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refreshServices(okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$1 zettleServicesImpl$refreshServices$1;
        int i;
        com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl;
        okhttp3.OkHttpClient okHttpClient2;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        long j;
        long j2;
        try {
            if (continuation instanceof com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$1) {
                zettleServicesImpl$refreshServices$1 = (com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$1) continuation;
                if ((zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = zettleServicesImpl$refreshServices$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex3 = this.getHighSpeedVideoSizesFor;
                        zettleServicesImpl$refreshServices$1.getHighSpeedVideoSizes = this;
                        zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRangesFor = okHttpClient;
                        zettleServicesImpl$refreshServices$1.getHighResolutionOutputSizeshNQ4ISI = mutex3;
                        zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRanges = 1;
                        if (mutex3.lock(null, zettleServicesImpl$refreshServices$1) != coroutine_suspended) {
                            zettleServicesImpl = this;
                            okHttpClient2 = okHttpClient;
                            mutex = mutex3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (kotlinx.coroutines.sync.Mutex) zettleServicesImpl$refreshServices$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            mutex2.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) zettleServicesImpl$refreshServices$1.getHighResolutionOutputSizeshNQ4ISI;
                    okhttp3.OkHttpClient okHttpClient3 = (okhttp3.OkHttpClient) zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRangesFor;
                    com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl2 = (com.zettle.sdk.core.auth.ZettleServicesImpl) zettleServicesImpl$refreshServices$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    okHttpClient2 = okHttpClient3;
                    zettleServicesImpl = zettleServicesImpl2;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    j = currentTimeMillis - zettleServicesImpl.getInputFormats;
                    j2 = zettleServicesImpl.getInputSizeshNQ4ISI;
                    if (j >= j2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Service URLs refreshed ");
                        sb.append(j);
                        sb.append("ms ago, skipping (min interval: ");
                        sb.append(j2);
                        sb.append("ms)");
                        com.zettle.sdk.core.log.LogKt.log(zettleServicesImpl, sb.toString());
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    com.zettle.sdk.core.log.LogKt.log(zettleServicesImpl, "Refreshing service Urls");
                    okhttp3.HttpUrl.Builder addPathSegment = okhttp3.HttpUrl.INSTANCE.get(zettleServicesImpl.getHighSpeedVideoSizes.getServiceLookupUrl()).newBuilder().addPathSegment("serviceurls");
                    if (zettleServicesImpl.Camera2StreamConfigurationMap) {
                        addPathSegment = addPathSegment.addPathSegment("uat");
                    }
                    com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$2$1 zettleServicesImpl$refreshServices$2$1 = new com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$2$1(zettleServicesImpl, new okhttp3.Request.Builder().url(addPathSegment.build()).get().build(), okHttpClient2, currentTimeMillis, null);
                    zettleServicesImpl$refreshServices$1.getHighSpeedVideoSizes = mutex;
                    zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRangesFor = null;
                    zettleServicesImpl$refreshServices$1.getHighResolutionOutputSizeshNQ4ISI = null;
                    zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRanges = 2;
                    if (kotlinx.coroutines.SupervisorKt.supervisorScope(zettleServicesImpl$refreshServices$2$1, zettleServicesImpl$refreshServices$1) != coroutine_suspended) {
                        mutex2 = mutex;
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            j = currentTimeMillis2 - zettleServicesImpl.getInputFormats;
            j2 = zettleServicesImpl.getInputSizeshNQ4ISI;
            if (j >= j2) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        zettleServicesImpl$refreshServices$1 = new com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$1(this, continuation);
        java.lang.Object obj2 = zettleServicesImpl$refreshServices$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zettleServicesImpl$refreshServices$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    public static final /* synthetic */ java.lang.Object access$fetchServiceUrls(final com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl, okhttp3.Request request, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() { // from class: com.zettle.sdk.core.auth.ZettleServicesImpl$fetchServiceUrls$2$callback$1
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                java.io.IOException iOException = e;
                com.zettle.sdk.core.log.LogKt.warn(com.zettle.sdk.core.auth.ZettleServicesImpl.this, "onFailure", iOException);
                kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.network.HttpPayload<java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(iOException)));
            }

            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                java.lang.Object m23436constructorimpl;
                int code;
                java.lang.Object obj;
                java.lang.String str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl2 = com.zettle.sdk.core.auth.ZettleServicesImpl.this;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    code = response.code();
                    obj = null;
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (200 > code || code >= 300) {
                    if (code == 499) {
                        com.zettle.sdk.core.log.LogKt.log(zettleServicesImpl2, "Token retrieval failed (499), skipping service URL parsing");
                        throw new java.io.IOException("Failed to retrieve token");
                    }
                    int code2 = response.code();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Service URL fetch failed with code: ");
                    sb.append(code2);
                    com.zettle.sdk.core.log.LogKt.warn$default(zettleServicesImpl2, sb.toString(), null, 2, null);
                    int code3 = response.code();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Service URL request failed with code: ");
                    sb2.append(code3);
                    throw new java.io.IOException(sb2.toString());
                }
                okhttp3.ResponseBody body = response.body();
                if (body == null || (str = body.string()) == null) {
                    str = "";
                }
                int code4 = response.code();
                java.lang.String message = response.message();
                java.util.List<kotlin.Pair> list = kotlin.collections.CollectionsKt.toList(response.headers());
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (kotlin.Pair pair : list) {
                    java.lang.Object first = pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(first);
                    sb3.append(": ");
                    sb3.append(second);
                    arrayList.add(sb3.toString());
                }
                java.util.ArrayList arrayList2 = arrayList;
                int code5 = response.code();
                if (200 <= code5 && code5 < 300) {
                    obj = com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), str);
                } else if (code5 == 499) {
                    obj = com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), str);
                }
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(new com.zettle.sdk.core.network.HttpPayload(code4, message, arrayList2, str, obj));
                cancellableContinuationImpl2.resumeWith(m23436constructorimpl);
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
