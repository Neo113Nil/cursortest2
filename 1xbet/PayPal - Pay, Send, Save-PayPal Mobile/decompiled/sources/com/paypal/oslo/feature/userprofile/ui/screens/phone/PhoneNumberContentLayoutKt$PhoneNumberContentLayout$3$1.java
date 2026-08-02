package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneNumberContentLayoutKt$PhoneNumberContentLayout$3$1", f = "PhoneNumberContentLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PhoneNumberContentLayoutKt$PhoneNumberContentLayout$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.pds.components.MenuItem> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<com.paypal.pds.components.MenuItem> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = this.getHighResolutionOutputSizeshNQ4ISI;
        if (countryPhoneDetail != null) {
            androidx.compose.runtime.MutableState<com.paypal.pds.components.MenuItem> mutableState = this.getHighSpeedVideoFpsRanges;
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) obj2).getKey(), countryPhoneDetail.getCountryCode())) {
                    break;
                }
            }
            mutableState.setValue((com.paypal.pds.components.MenuItem) obj2);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneNumberContentLayoutKt$PhoneNumberContentLayout$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneNumberContentLayoutKt$PhoneNumberContentLayout$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberContentLayoutKt$PhoneNumberContentLayout$3$1(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail, java.util.List<com.paypal.pds.components.MenuItem> list, androidx.compose.runtime.MutableState<com.paypal.pds.components.MenuItem> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneNumberContentLayoutKt$PhoneNumberContentLayout$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = countryPhoneDetail;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
