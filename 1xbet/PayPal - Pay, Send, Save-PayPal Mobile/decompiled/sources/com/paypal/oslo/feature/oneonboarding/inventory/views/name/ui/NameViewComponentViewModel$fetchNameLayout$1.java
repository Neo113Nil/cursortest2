package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$fetchNameLayout$1", f = "NameViewComponentViewModel.kt", i = {0, 0}, l = {95}, m = "invokeSuspend", n = {"nameInput", "config"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class NameViewComponentViewModel$fetchNameLayout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase nameLayoutUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.i18n.domain.model.NameInput.Person person = new com.paypal.oslo.core.i18n.domain.model.NameInput.Person(new com.paypal.oslo.core.i18n.domain.model.PersonName(null, null, null, null, 15, null));
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person2 = str != null ? new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person((com.paypal.oslo.core.i18n.domain.model.NameStyle) null, str, (com.paypal.oslo.core.i18n.domain.model.PersonType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 29, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
            nameLayoutUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person2);
            this.getHighSpeedVideoSizes = 1;
            invoke = nameLayoutUseCase.invoke(person, person2, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout = (com.paypal.oslo.core.i18n.domain.model.NameLayout) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = nameViewComponentViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModelKt.access$filterToRequiredOnly(nameLayout));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.i18n.domain.model.NameError nameError = (com.paypal.oslo.core.i18n.domain.model.NameError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            if (str2 == null) {
                str2 = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("nationality", str2);
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(nameError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
            com.paypal.android.logger.Logger.e$default(logger, "Failed to fetch name layout, using fallback", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            mutableStateFlow = nameViewComponentViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModelKt.access$filterToRequiredOnly(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.UsNameLayoutProvider.INSTANCE.createUsNameLayout()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$fetchNameLayout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$fetchNameLayout$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameViewComponentViewModel$fetchNameLayout$1(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$fetchNameLayout$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = nameViewComponentViewModel;
    }
}
