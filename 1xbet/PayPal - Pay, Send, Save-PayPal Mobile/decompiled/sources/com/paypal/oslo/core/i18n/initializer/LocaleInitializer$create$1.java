package com.paypal.oslo.core.i18n.initializer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.initializer.LocaleInitializer$create$1", f = "LocaleInitializer.kt", i = {0}, l = {51}, m = "invokeSuspend", n = {"i18nConfiguration"}, nl = {52}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class LocaleInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.i18n.di.I18nEntryPoint getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List fetchDeviceLanguages$i18n_release$default = com.paypal.oslo.core.i18n.initializer.LocaleInitializer.Companion.fetchDeviceLanguages$i18n_release$default(com.paypal.oslo.core.i18n.initializer.LocaleInitializer.INSTANCE, null, 1, null);
            java.lang.String defaultCountryCode$i18n_release$default = com.paypal.oslo.core.i18n.initializer.LocaleInitializer.Companion.getDefaultCountryCode$i18n_release$default(com.paypal.oslo.core.i18n.initializer.LocaleInitializer.INSTANCE, null, 1, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCountryCode$i18n_release$default, "");
            com.paypal.oslo.core.i18n.domain.model.I18nConfiguration i18nConfiguration = new com.paypal.oslo.core.i18n.domain.model.I18nConfiguration(fetchDeviceLanguages$i18n_release$default, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(defaultCountryCode$i18n_release$default), null);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(i18nConfiguration);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.i18NConfigurator().configure(i18nConfiguration, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.core.i18n.initializer.LocaleInitializer$create$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.i18n.initializer.LocaleInitializer$create$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocaleInitializer$create$1(com.paypal.oslo.core.i18n.di.I18nEntryPoint i18nEntryPoint, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.initializer.LocaleInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = i18nEntryPoint;
    }
}
