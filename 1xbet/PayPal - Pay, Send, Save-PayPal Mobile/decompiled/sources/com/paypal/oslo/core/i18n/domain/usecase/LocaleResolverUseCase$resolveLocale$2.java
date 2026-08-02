package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError$NotInitialized;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$2", f = "LocaleResolverUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class LocaleResolverUseCase$resolveLocale$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase.access$handleResult(this.getHighSpeedVideoFpsRanges, either);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$2) create(either, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$2 localeResolverUseCase$resolveLocale$2 = new com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$2(this.getHighSpeedVideoFpsRanges, continuation);
        localeResolverUseCase$resolveLocale$2.getHighSpeedVideoSizes = obj;
        return localeResolverUseCase$resolveLocale$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocaleResolverUseCase$resolveLocale$2(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = localeResolverUseCase;
    }
}
