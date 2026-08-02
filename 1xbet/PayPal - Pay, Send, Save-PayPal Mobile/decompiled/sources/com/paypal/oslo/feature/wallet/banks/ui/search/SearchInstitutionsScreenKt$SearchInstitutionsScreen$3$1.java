package com.paypal.oslo.feature.wallet.banks.ui.search;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1", f = "SearchInstitutionsScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "invokeSuspend", n = {}, nl = {236}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.runtime.State<java.lang.String> state = this.Camera2StreamConfigurationMap;
            final androidx.compose.runtime.State<java.lang.Boolean> state2 = this.getHighSpeedVideoFpsRanges;
            final kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, state2);
                }
            });
            kotlinx.coroutines.flow.Flow debounce = kotlinx.coroutines.flow.FlowKt.debounce(new kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>>() { // from class: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Pair<? extends java.lang.String, ? extends java.lang.Boolean>> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getOutputMinFrameDuration;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                    kotlin.Pair pair = (kotlin.Pair) obj;
                                    java.lang.String str = (java.lang.String) pair.component1();
                                    if (((java.lang.Boolean) pair.component2()).booleanValue() && str.length() > 0) {
                                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
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
                                    java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getOutputMinFrameDuration;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1$2", f = "SearchInstitutionsScreen.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        int getHighSpeedVideoSizes;
                        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                        int getOutputMinFrameDuration;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getHighSpeedVideoSizesFor = obj;
                            this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                            return com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    }
                }
            }, 150L);
            final com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel searchInstitutionsViewModel = this.getHighSpeedVideoSizes;
            final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (debounce.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.searchBanks$default(com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.this, str, (java.lang.String) ((kotlin.Pair) obj2).component1(), 0, 4, null);
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

    public static /* synthetic */ kotlin.Pair getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, androidx.compose.runtime.State state2) {
        boolean booleanValue;
        java.lang.String access$SearchInstitutionsScreen$lambda$2 = com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.access$SearchInstitutionsScreen$lambda$2(state);
        booleanValue = ((java.lang.Boolean) state2.getValue()).booleanValue();
        return kotlin.TuplesKt.to(access$SearchInstitutionsScreen$lambda$2, java.lang.Boolean.valueOf(booleanValue));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1(androidx.compose.runtime.State<java.lang.String> state, androidx.compose.runtime.State<java.lang.Boolean> state2, com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel searchInstitutionsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = state2;
        this.getHighSpeedVideoSizes = searchInstitutionsViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
