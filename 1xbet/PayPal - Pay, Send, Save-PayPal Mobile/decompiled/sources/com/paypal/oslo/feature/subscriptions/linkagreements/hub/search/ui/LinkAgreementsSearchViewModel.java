package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/usecase/GetAvailableMerchantsUseCase;", "getAvailableMerchantsUseCase", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/usecase/GetAvailableMerchantsUseCase;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/usecase/GetAvailableMerchantsUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/SearchQuery;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsSearchViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
    private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchViewModel$Factory;", "", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchViewModel;", "create", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType);
    }

    @dagger.assisted.AssistedInject
    public LinkAgreementsSearchViewModel(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getAvailableMerchantsUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAvailableMerchantsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.getHighSpeedVideoSizes = getAvailableMerchantsUseCase;
        this.agreementType = agreementType;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery("", false));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState(null, null, null, 7, null));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow2;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.Camera2StreamConfigurationMap = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery> mutableStateFlow = MutableStateFlow;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel = this;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.debounce(new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                if (((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery) obj).getHighSpeedVideoFpsRanges.length() > 0) {
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.Camera2StreamConfigurationMap = 0;
                                    anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1$2", f = "LinkAgreementsSearchViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, 500L), new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$2(this, null)), androidx.view.ViewModelKt.getViewModelScope(linkAgreementsSearchViewModel));
        final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery> mutableStateFlow2 = MutableStateFlow;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                if (((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery) obj).getHighSpeedVideoFpsRanges.length() == 0) {
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getHighSpeedVideoSizes = 0;
                                    anonymousClass1.getOutputMinFrameDuration = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2$2", f = "LinkAgreementsSearchViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$$inlined$filter$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$4(this, null)), androidx.view.ViewModelKt.getViewModelScope(linkAgreementsSearchViewModel));
    }

    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
        return this.agreementType;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void onEvent(final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnBackClicked.INSTANCE)) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.NavigateBack.INSTANCE));
            return;
        }
        if (event instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchQueryChanged) {
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchQueryChanged onSearchQueryChanged = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchQueryChanged) event;
            this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery(onSearchQueryChanged.getQuery(), onSearchQueryChanged.getSilentRefresh()));
        } else if (event instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantSelected) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState.copy$default(mutableStateFlow.getValue(), null, null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants(kotlin.collections.CollectionsKt.listOf(((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantSelected) event).getMerchantAgreement())), 3, null));
        } else if (event instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantLinkClicked) {
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUtilKt.handleOnLinkMerchantClicked(((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantLinkClicked) event).getMerchantAgreement(), com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModelKt.LinkAgreementInAppBrowserSearchSource, this.agreementType, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.$r8$lambda$I8FW9q1AdKNtpjO9b_x_X9fsJfc(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.this, event, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnSearchCleared.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery("", false));
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I8FW9q1AdKNtpjO9b_x_X9fsJfc(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent linkAgreementsSearchEvent, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        linkAgreementsSearchViewModel.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchUiEffect.ReturnWithMerchant(((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent.OnMerchantLinkClicked) linkAgreementsSearchEvent).getMerchantAgreement().getId(), str3, str, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$checkPopularCache(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, java.lang.String str) {
        java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> popularAgreements = linkAgreementsSearchViewModel.uiState.getValue().getPopularAgreements();
        if (popularAgreements == null || popularAgreements.isEmpty()) {
            return false;
        }
        linkAgreementsSearchViewModel.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState.copy$default(linkAgreementsSearchViewModel.uiState.getValue(), str, null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants(popularAgreements), 2, null));
        return true;
    }

    public static final /* synthetic */ void access$handleErrorOnSuggestedMerchants(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError) {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType;
        if (str.length() == 0) {
            merchantSearchErrorType = com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.ERROR_FETCH_POPULAR;
        } else {
            merchantSearchErrorType = com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.GENERIC_ERROR;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> mutableStateFlow = linkAgreementsSearchViewModel.getHighSpeedVideoFpsRanges;
        mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState.copy$default(mutableStateFlow.getValue(), str, null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error(merchantSearchErrorType, subscriptionsError.toErrorContext()), 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final /* synthetic */ void access$handleSuccessOnSuggestedMerchants(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, java.lang.String str, java.util.List list) {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults searchResults;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants popularMerchants;
        int i = 2;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = null;
        ?? r2 = 0;
        ?? r22 = 0;
        ?? r23 = 0;
        if (str.length() == 0) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> mutableStateFlow = linkAgreementsSearchViewModel.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState value = mutableStateFlow.getValue();
            if (list.isEmpty()) {
                popularMerchants = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.ERROR_FETCH_POPULAR, errorContext, i, r23 == true ? 1 : 0);
            } else {
                popularMerchants = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.PopularMerchants(list);
            }
            mutableStateFlow.setValue(value.copy(str, list, popularMerchants));
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState> mutableStateFlow2 = linkAgreementsSearchViewModel.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState value2 = mutableStateFlow2.getValue();
        if (list.isEmpty()) {
            searchResults = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Error(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.SEARCH_NOT_FOUND, r22 == true ? 1 : 0, i, r2 == true ? 1 : 0);
        } else {
            searchResults = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.SearchResults(list);
        }
        mutableStateFlow2.setValue(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState.copy$default(value2, str, null, searchResults, 2, null));
    }

    public static final /* synthetic */ boolean access$isPopularSearchType(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, java.lang.String str) {
        return str.length() == 0;
    }

    public static final /* synthetic */ void access$performSearch(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, java.lang.String str, boolean z) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = linkAgreementsSearchViewModel.getHighResolutionOutputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(linkAgreementsSearchViewModel), null, null, new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$performSearch$1(linkAgreementsSearchViewModel, str, z, null), 3, null);
        linkAgreementsSearchViewModel.getHighResolutionOutputSizeshNQ4ISI = launch$default;
    }
}
