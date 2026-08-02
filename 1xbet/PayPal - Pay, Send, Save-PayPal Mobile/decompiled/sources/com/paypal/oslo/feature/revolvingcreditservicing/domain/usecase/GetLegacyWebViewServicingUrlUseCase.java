package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlInput;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlError;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlsRepository;", "repository", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlsRepository;Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "input", "Larrow/core/Ior;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetLegacyWebViewServicingUrlInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingUrls;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingUrls;Ljava/lang/String;)Larrow/core/Ior;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlsRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetLegacyWebViewServicingUrlUseCase implements com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlInput, com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, java.lang.String> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetLegacyWebViewServicingUrlUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository legacyWebViewServicingUrlsRepository, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyWebViewServicingUrlsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.getHighSpeedVideoFpsRanges = legacyWebViewServicingUrlsRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = webEnvironmentProvider;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlInput getLegacyWebViewServicingUrlInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, ? extends java.lang.String>> continuation) {
        return invoke2(getLegacyWebViewServicingUrlInput, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlInput getLegacyWebViewServicingUrlInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase$invoke$1 getLegacyWebViewServicingUrlUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase$invoke$1) {
            getLegacyWebViewServicingUrlUseCase$invoke$1 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase$invoke$1) continuation;
            if ((getLegacyWebViewServicingUrlUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getLegacyWebViewServicingUrlUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getLegacyWebViewServicingUrlUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getLegacyWebViewServicingUrlUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository legacyWebViewServicingUrlsRepository = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = getLegacyWebViewServicingUrlInput.getCreditProductIdentifier();
                    getLegacyWebViewServicingUrlUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = getLegacyWebViewServicingUrlInput;
                    getLegacyWebViewServicingUrlUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = legacyWebViewServicingUrlsRepository.fetchServicingUrls(creditProductIdentifier, getLegacyWebViewServicingUrlUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getLegacyWebViewServicingUrlInput = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlInput) getLegacyWebViewServicingUrlUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls) ((arrow.core.Ior.Right) ior).getValue(), getLegacyWebViewServicingUrlInput.getRedirectUrlKey());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError legacyWebViewServicingUrlError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError) both.getLeftValue();
                    arrow.core.Ior<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, java.lang.String> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls) both.getRightValue(), getLegacyWebViewServicingUrlInput.getRedirectUrlKey());
                    if (Camera2StreamConfigurationMap instanceof arrow.core.Ior.Left) {
                        return new arrow.core.Ior.Left(legacyWebViewServicingUrlError);
                    }
                    if (Camera2StreamConfigurationMap instanceof arrow.core.Ior.Right) {
                        return new arrow.core.Ior.Both(legacyWebViewServicingUrlError, (java.lang.String) ((arrow.core.Ior.Right) Camera2StreamConfigurationMap).getValue());
                    }
                    if (Camera2StreamConfigurationMap instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) Camera2StreamConfigurationMap;
                        return new arrow.core.Ior.Both(legacyWebViewServicingUrlError, (java.lang.String) both2.getRightValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getLegacyWebViewServicingUrlUseCase$invoke$1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetLegacyWebViewServicingUrlUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getLegacyWebViewServicingUrlUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getLegacyWebViewServicingUrlUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Ior<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, java.lang.String> Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls p0, java.lang.String p1) {
        if (p0 == null) {
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.UrlNotAvailable.INSTANCE);
        }
        java.lang.String selectUrl = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKeyKt.selectUrl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.INSTANCE.fromString(p1), p0);
        java.lang.String str = selectUrl;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.UrlNotAvailable.INSTANCE);
        }
        if (!kotlin.text.StringsKt.startsWith$default(selectUrl, "https://", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(selectUrl, "http://", false, 2, (java.lang.Object) null)) {
            java.lang.String webBaseUrl = this.getHighResolutionOutputSizeshNQ4ISI.getWebBaseUrl();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(webBaseUrl);
            sb.append(selectUrl);
            selectUrl = sb.toString();
        }
        return new arrow.core.Ior.Right(selectUrl);
    }
}
