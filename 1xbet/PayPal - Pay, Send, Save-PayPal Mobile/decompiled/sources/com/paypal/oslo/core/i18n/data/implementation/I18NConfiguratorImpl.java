package com.paypal.oslo.core.i18n.data.implementation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/I18NConfiguratorImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/I18NConfigurator;", "Lcom/paypal/oslo/core/i18n/domain/usecase/LocaleResolverUseCase;", "localeResolverUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/LocaleResolverUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/I18nConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "configure", "(Lcom/paypal/oslo/core/i18n/domain/model/I18nConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/LocaleResolverUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class I18NConfiguratorImpl implements com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public I18NConfiguratorImpl(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = localeResolverUseCase;
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator
    public final java.lang.Object configure(com.paypal.oslo.core.i18n.domain.model.I18nConfiguration i18nConfiguration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String m11425getCountryALGuh4w = i18nConfiguration.m11425getCountryALGuh4w();
        java.util.List<java.lang.String> preferredLanguageList = i18nConfiguration.getPreferredLanguageList();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Locale Resolution Started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", m11425getCountryALGuh4w), kotlin.TuplesKt.to("languages", preferredLanguageList)), null, 4, null);
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.m24097catch(kotlinx.coroutines.flow.FlowKt.onEach(this.getHighResolutionOutputSizeshNQ4ISI.invoke(preferredLanguageList, m11425getCountryALGuh4w), new com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$2(null)), new com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$3(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
