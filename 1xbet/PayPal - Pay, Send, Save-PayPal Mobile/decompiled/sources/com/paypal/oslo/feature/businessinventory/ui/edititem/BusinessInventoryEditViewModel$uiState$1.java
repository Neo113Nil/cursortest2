package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1", f = "BusinessInventoryEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryEditViewModel$uiState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1$1", f = "BusinessInventoryEditViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, nl = {90}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel Camera2StreamConfigurationMap;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase syncTaxOptionsUseCase;
            java.lang.Object value;
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
            java.lang.Object value2;
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                syncTaxOptionsUseCase = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                this.getHighSpeedVideoSizes = 1;
                obj = syncTaxOptionsUseCase.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = this.Camera2StreamConfigurationMap;
            if (either.isLeft()) {
                java.lang.Throwable th = (java.lang.Throwable) ((arrow.core.Either.Left) either).getValue();
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = businessInventoryEditViewModel.getOutputFormats;
                do {
                    value2 = mutableStateFlow.getValue();
                    copy2 = r3.copy((r18 & 1) != 0 ? r3.flowType : null, (r18 & 2) != 0 ? r3.taxOptions : null, (r18 & 4) != 0 ? r3.bannerError : com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.LoadTaxesError.INSTANCE, (r18 & 8) != 0 ? r3.validationErrors : null, (r18 & 16) != 0 ? r3.loading : false, (r18 & 32) != 0 ? r3.saving : false, (r18 & 64) != 0 ? r3.deleting : false, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState) value2).currency : null);
                } while (!mutableStateFlow.compareAndSet(value2, copy2));
                com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("BusinessInventoryEditViewModel failed to sync taxes", th);
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel2 = this.Camera2StreamConfigurationMap;
            if (either.isRight()) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = businessInventoryEditViewModel2.getOutputFormats;
                do {
                    value = mutableStateFlow2.getValue();
                    copy = r1.copy((r18 & 1) != 0 ? r1.flowType : null, (r18 & 2) != 0 ? r1.taxOptions : null, (r18 & 4) != 0 ? r1.bannerError : null, (r18 & 8) != 0 ? r1.validationErrors : null, (r18 & 16) != 0 ? r1.loading : false, (r18 & 32) != 0 ? r1.saving : false, (r18 & 64) != 0 ? r1.deleting : false, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState) value).currency : null);
                } while (!mutableStateFlow2.compareAndSet(value, copy));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = businessInventoryEditViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this.getHighSpeedVideoFpsRangesFor), null, null, new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this.getHighSpeedVideoFpsRangesFor), null, null, new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1$2", f = "BusinessInventoryEditViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, nl = {101}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase getCurrencyUseCase;
            java.lang.Object value;
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                getCurrencyUseCase = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = 1;
                obj = getCurrencyUseCase.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.lang.String str = (java.lang.String) obj;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighSpeedVideoFpsRanges.getOutputFormats;
            do {
                value = mutableStateFlow.getValue();
                copy = r0.copy((r18 & 1) != 0 ? r0.flowType : null, (r18 & 2) != 0 ? r0.taxOptions : null, (r18 & 4) != 0 ? r0.bannerError : null, (r18 & 8) != 0 ? r0.validationErrors : null, (r18 & 16) != 0 ? r0.loading : false, (r18 & 32) != 0 ? r0.saving : false, (r18 & 64) != 0 ? r0.deleting : false, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState) value).currency : str);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = businessInventoryEditViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryEditViewModel$uiState$1(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = businessInventoryEditViewModel;
    }
}
