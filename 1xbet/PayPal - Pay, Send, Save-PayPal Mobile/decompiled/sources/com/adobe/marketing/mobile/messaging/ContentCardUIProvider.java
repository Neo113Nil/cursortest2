package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0004\u0012\u00020\n0\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00110\b0\u00070\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010R)\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R1\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00110\b0\u00070\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u0018R)\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00198\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/ContentCardUIProvider;", "Lcom/adobe/marketing/mobile/aepcomposeui/contentprovider/AepUIContentProvider;", "Lcom/adobe/marketing/mobile/messaging/Surface;", "surface", "<init>", "(Lcom/adobe/marketing/mobile/messaging/Surface;)V", "Lkotlin/Function1;", "Lkotlin/Result;", "", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "getContentCardUI", "refreshContent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/messaging/Surface;", "getSurface", "()Lcom/adobe/marketing/mobile/messaging/Surface;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCardUIProvider implements com.adobe.marketing.mobile.aepcomposeui.contentprovider.AepUIContentProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?>>>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.StateFlow<kotlin.Result<java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>> getHighSpeedVideoFpsRangesFor;
    private final com.adobe.marketing.mobile.messaging.Surface surface;
    public static final int $stable = 8;

    public ContentCardUIProvider(com.adobe.marketing.mobile.messaging.Surface surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        this.surface = surface;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.collections.CollectionsKt.emptyList())));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>> mutableStateFlow = MutableStateFlow;
        this.getHighResolutionOutputSizeshNQ4ISI = (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?>>>>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighResolutionOutputSizeshNQ4ISI;
                                java.util.ArrayList camera2StreamConfigurationMap = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                                if (kotlin.Result.m23442isSuccessimpl(camera2StreamConfigurationMap)) {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.util.Iterator<T> it = ((java.util.List) camera2StreamConfigurationMap).iterator();
                                    while (it.hasNext()) {
                                        com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?> aepUI$messaging_phoneRelease = com.adobe.marketing.mobile.messaging.ContentCardSchemaDataUtils.INSTANCE.getAepUI$messaging_phoneRelease((com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate) it.next());
                                        if (aepUI$messaging_phoneRelease != null) {
                                            arrayList.add(aepUI$messaging_phoneRelease);
                                        }
                                    }
                                    camera2StreamConfigurationMap = arrayList;
                                }
                                kotlin.Result m23435boximpl = kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(camera2StreamConfigurationMap));
                                anonymousClass1.Camera2StreamConfigurationMap = 1;
                                if (flowCollector.emit(m23435boximpl, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    anonymousClass1 = new com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1$2", f = "ContentCardUIProvider.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?>>>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.adobe.marketing.mobile.messaging.ContentCardUIProvider$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public final com.adobe.marketing.mobile.messaging.Surface getSurface() {
        return this.surface;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getContentCardUI(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?>>>>> continuation) {
        com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContentCardUI$1 contentCardUIProvider$getContentCardUI$1;
        int i;
        com.adobe.marketing.mobile.messaging.ContentCardUIProvider contentCardUIProvider;
        if (continuation instanceof com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContentCardUI$1) {
            contentCardUIProvider$getContentCardUI$1 = (com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContentCardUI$1) continuation;
            if ((contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = contentCardUIProvider$getContentCardUI$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRanges = this;
                    contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (getContent(contentCardUIProvider$getContentCardUI$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    contentCardUIProvider = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    contentCardUIProvider = (com.adobe.marketing.mobile.messaging.ContentCardUIProvider) contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return contentCardUIProvider.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        contentCardUIProvider$getContentCardUI$1 = new com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContentCardUI$1(this, continuation);
        java.lang.Object obj2 = contentCardUIProvider$getContentCardUI$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentCardUIProvider$getContentCardUI$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return contentCardUIProvider.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.contentprovider.AepUIContentProvider
    public final java.lang.Object refreshContent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object content = getContent(continuation);
        return content == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? content : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.adobe.marketing.mobile.aepcomposeui.contentprovider.AepUIContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getContent(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>>> continuation) {
        com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContent$1 contentCardUIProvider$getContent$1;
        int i;
        com.adobe.marketing.mobile.messaging.ContentCardUIProvider contentCardUIProvider;
        if (continuation instanceof com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContent$1) {
            contentCardUIProvider$getContent$1 = (com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContent$1) continuation;
            if ((contentCardUIProvider$getContent$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                contentCardUIProvider$getContent$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = contentCardUIProvider$getContent$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentCardUIProvider$getContent$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContent$2
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>> result) {
                            getHighSpeedVideoFpsRanges(result.getCamera2StreamConfigurationMap());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoFpsRanges(java.lang.Object obj2) {
                            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                            com.adobe.marketing.mobile.messaging.ContentCardUIProvider contentCardUIProvider2 = com.adobe.marketing.mobile.messaging.ContentCardUIProvider.this;
                            if (kotlin.Result.m23442isSuccessimpl(obj2)) {
                                mutableStateFlow2 = contentCardUIProvider2.getHighSpeedVideoFpsRanges;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                mutableStateFlow2.setValue(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl((java.util.List) obj2)));
                            }
                            com.adobe.marketing.mobile.messaging.ContentCardUIProvider contentCardUIProvider3 = com.adobe.marketing.mobile.messaging.ContentCardUIProvider.this;
                            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj2);
                            if (m23439exceptionOrNullimpl != null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to get content: ");
                                sb.append(m23439exceptionOrNullimpl.getMessage());
                                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ContentCardUIProvider", sb.toString(), new java.lang.Object[0]);
                                mutableStateFlow = contentCardUIProvider3.getHighSpeedVideoFpsRanges;
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                mutableStateFlow.setValue(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(m23439exceptionOrNullimpl))));
                            }
                        }

                        {
                            super(1);
                        }
                    };
                    contentCardUIProvider$getContent$1.getHighSpeedVideoFpsRanges = this;
                    contentCardUIProvider$getContent$1.getHighSpeedVideoSizes = 1;
                    if (Camera2StreamConfigurationMap(function1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    contentCardUIProvider = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    contentCardUIProvider = (com.adobe.marketing.mobile.messaging.ContentCardUIProvider) contentCardUIProvider$getContent$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return contentCardUIProvider.getHighSpeedVideoFpsRangesFor;
            }
        }
        contentCardUIProvider$getContent$1 = new com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContent$1(this, continuation);
        java.lang.Object obj2 = contentCardUIProvider$getContent$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentCardUIProvider$getContent$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return contentCardUIProvider.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(final kotlin.jvm.functions.Function1<? super kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit> p0) {
        final java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(this.surface);
        com.adobe.marketing.mobile.Messaging.getPropositionsForSurfaces(mutableListOf, new com.adobe.marketing.mobile.AdobeCallbackWithError<java.util.Map<com.adobe.marketing.mobile.messaging.Surface, ? extends java.util.List<? extends com.adobe.marketing.mobile.messaging.Proposition>>>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getAepUITemplateList$2
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public final void call(java.util.Map<com.adobe.marketing.mobile.messaging.Surface, ? extends java.util.List<? extends com.adobe.marketing.mobile.messaging.Proposition>> resultMap) {
                java.util.ArrayList emptyList;
                com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate aepUITemplate;
                if (resultMap == null) {
                    kotlin.jvm.functions.Function1<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit> function1 = p0;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("resultMap null for surfaces ");
                    sb.append(kotlin.collections.CollectionsKt.joinToString$default(mutableListOf, ",", null, null, 0, null, null, 62, null));
                    function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Throwable(sb.toString())))));
                    return;
                }
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ContentCardUIProvider", "getPropositionsForSurfaces callback contained Null Map", new java.lang.Object[0]);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List<? extends com.adobe.marketing.mobile.messaging.Proposition> list = resultMap.get(this.getSurface());
                if (list == null) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (com.adobe.marketing.mobile.messaging.Proposition proposition : list) {
                        try {
                            aepUITemplate = com.adobe.marketing.mobile.messaging.ContentCardSchemaDataUtils.INSTANCE.buildTemplate$messaging_phoneRelease(proposition);
                        } catch (java.lang.IllegalArgumentException e) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to build template: proposition ID : ");
                            sb2.append(proposition.getUniqueId());
                            sb2.append(' ');
                            sb2.append(e.getMessage());
                            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ContentCardUIProvider", sb2.toString(), new java.lang.Object[0]);
                            java.lang.String uniqueId = proposition.getUniqueId();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uniqueId, "");
                            arrayList.add(uniqueId);
                            aepUITemplate = null;
                        }
                        if (aepUITemplate != null) {
                            arrayList2.add(aepUITemplate);
                        }
                    }
                    emptyList = arrayList2;
                }
                if (!arrayList.isEmpty()) {
                    kotlin.jvm.functions.Function1<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit> function12 = p0;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to build template for propositions ");
                    sb3.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                    function12.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Throwable(sb3.toString())))));
                }
                kotlin.jvm.functions.Function1<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit> function13 = p0;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                function13.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(emptyList)));
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public final void fail(com.adobe.marketing.mobile.AdobeError error) {
                kotlin.jvm.functions.Function1<kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>, kotlin.Unit> function1 = p0;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to retrieve propositions for surface ");
                sb.append(kotlin.collections.CollectionsKt.joinToString$default(mutableListOf, ",", null, null, 0, null, new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.messaging.Surface, java.lang.CharSequence>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getAepUITemplateList$2$fail$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.CharSequence invoke(com.adobe.marketing.mobile.messaging.Surface surface) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
                        java.lang.String uri = surface.getUri();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "");
                        return uri;
                    }
                }, 30, null));
                sb.append(" Adobe Error : ");
                sb.append(error != null ? error.getErrorName() : null);
                function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Throwable(sb.toString())))));
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
