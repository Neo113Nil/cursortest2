package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/I18nError$NotInitialized;", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolutionData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$1", f = "LocaleResolverUseCase.kt", i = {0, 1, 1}, l = {67, 75}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "result"}, nl = {69, 77}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes4.dex */
final class LocaleResolverUseCase$resolveLocale$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r0.emit(r4, r8) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.Either.Left left;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository localeResolverRepository;
        com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData localeResolverMetadata;
        arrow.core.Either left2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase.access$isLocaleSame(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges)) {
                arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                    com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Cached cached = com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Cached.INSTANCE;
                    defaultRaise2.complete();
                    left2 = new arrow.core.Either.Right(cached);
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise2.complete();
                    left2 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                } catch (java.lang.Throwable th) {
                    defaultRaise2.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getHighSpeedVideoSizes = 1;
            } else {
                com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<java.lang.String> list = this.Camera2StreamConfigurationMap;
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                try {
                    defaultRaise = defaultRaise4;
                    localeResolverRepository = localeResolverUseCase.getHighSpeedVideoFpsRanges;
                    localeResolverMetadata = localeResolverRepository.getLocaleResolverMetadata();
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    defaultRaise4.complete();
                    left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise4));
                } catch (java.lang.Throwable th2) {
                    defaultRaise4.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
                }
                if (localeResolverMetadata != null) {
                    com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData.Resolved access$createResolvedResult = com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase.access$createResolvedResult(localeResolverUseCase, list, str, localeResolverMetadata);
                    defaultRaise4.complete();
                    left = new arrow.core.Either.Right(access$createResolvedResult);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                    this.getHighSpeedVideoSizes = 2;
                } else {
                    defaultRaise.raise(new com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized("MetaData is null after configuration", null, 2, null));
                    throw new kotlin.KotlinNothingValueException();
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.I18nError.NotInitialized, ? extends com.paypal.oslo.core.i18n.domain.model.LocaleResolutionData>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$1 localeResolverUseCase$resolveLocale$1 = new com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        localeResolverUseCase$resolveLocale$1.getOutputMinFrameDuration = obj;
        return localeResolverUseCase$resolveLocale$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocaleResolverUseCase$resolveLocale$1(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase, java.util.List<java.lang.String> list, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase$resolveLocale$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = localeResolverUseCase;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
