package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formattedName$1", f = "NameViewDisplayComponentViewModel.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME}, nl = {64}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class NameViewDisplayComponentViewModel$formattedName$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.i18n.domain.model.PersonName, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.model.PersonName personName = (com.paypal.oslo.core.i18n.domain.model.PersonName) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (personName == null) {
                return "";
            }
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(personName);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel.access$formatNameWithFallback(this.getHighResolutionOutputSizeshNQ4ISI, personName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.lang.String) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.PersonName personName, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formattedName$1) create(personName, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formattedName$1 nameViewDisplayComponentViewModel$formattedName$1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formattedName$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        nameViewDisplayComponentViewModel$formattedName$1.getHighSpeedVideoSizes = obj;
        return nameViewDisplayComponentViewModel$formattedName$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameViewDisplayComponentViewModel$formattedName$1(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formattedName$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = nameViewDisplayComponentViewModel;
    }
}
