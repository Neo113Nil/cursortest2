package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$2", f = "I18NConfiguratorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class I18NConfiguratorImpl$configure$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData localeResolutionData = (com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData) ((arrow.core.Either.Right) either).getValue();
            if (localeResolutionData instanceof com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Cached) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Locale Resolution cached", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", "cached")), null, 4, null);
            } else {
                if (!(localeResolutionData instanceof com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved resolved = (com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved) localeResolutionData;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Locale Resolution successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", "success"), kotlin.TuplesKt.to("resolved_language", resolved.getResolvedLanguage().getLanguage()), kotlin.TuplesKt.to("resolved_country", resolved.getResolvedCountry().getCountry())), null, 4, null);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.i18n.domain.error.I18nError i18nError = (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) either).getValue();
            if (!(i18nError instanceof com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Locale Resolution Failed to Initialize", null, null, ((com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized) i18nError).getCause(), 6, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$2) create(either, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$2 i18NConfiguratorImpl$configure$2 = new com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$2(continuation);
        i18NConfiguratorImpl$configure$2.getHighSpeedVideoFpsRangesFor = obj;
        return i18NConfiguratorImpl$configure$2;
    }

    I18NConfiguratorImpl$configure$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$2> continuation) {
        super(2, continuation);
    }
}
