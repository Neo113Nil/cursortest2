package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;", "error", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$3", f = "I18NConfiguratorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class I18NConfiguratorImpl$configure$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.i18n.LoggerKt.log.e("Locale Resolution Failed", th);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$3 i18NConfiguratorImpl$configure$3 = new com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$3(continuation);
        i18NConfiguratorImpl$configure$3.getHighSpeedVideoFpsRanges = th;
        return i18NConfiguratorImpl$configure$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    I18NConfiguratorImpl$configure$3(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl$configure$3> continuation) {
        super(3, continuation);
    }
}
