package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2", f = "SettingsViewModel.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, nl = {512}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsViewModel$initializeSettingsSections$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingSection> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.SharedFlow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.flow.Flow filterNotNull = kotlinx.coroutines.flow.FlowKt.filterNotNull(this.getHighSpeedVideoFpsRanges);
            kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>>() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getInputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getInputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                    if (((arrow.core.Either) obj).isRight()) {
                                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                        anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                        anonymousClass1.getInputFormats = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getInputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1$2", f = "SettingsViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        int getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        java.lang.Object getHighSpeedVideoSizes;
                        int getInputFormats;
                        /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getInputSizeshNQ4ISI = obj;
                            this.getInputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighSpeedVideoSizes = flowCollector;
                    }
                }
            });
            final java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingSection> list = this.Camera2StreamConfigurationMap;
            final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (distinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingSection> list2 = list;
                    com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel2 = settingsViewModel;
                    java.util.Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.access$loadSection(settingsViewModel2, (com.paypal.oslo.feature.settings.domain.model.SettingSection) it.next());
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SettingsViewModel$initializeSettingsSections$2(kotlinx.coroutines.flow.SharedFlow<? extends arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> sharedFlow, java.util.List<? extends com.paypal.oslo.feature.settings.domain.model.SettingSection> list, com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = sharedFlow;
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = settingsViewModel;
    }
}
