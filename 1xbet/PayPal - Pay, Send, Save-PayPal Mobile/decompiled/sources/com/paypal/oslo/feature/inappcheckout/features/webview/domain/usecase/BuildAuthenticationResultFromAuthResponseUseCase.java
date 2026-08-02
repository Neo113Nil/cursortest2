package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/BuildAuthenticationResultFromAuthResponseUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/converter/NativeRypDataConverter;", "converter", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;", "processOneShotAuthenticationDataUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/converter/NativeRypDataConverter;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;)V", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "authData", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/OneShotAuthenticationResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/converter/NativeRypDataConverter;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BuildAuthenticationResultFromAuthResponseUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public BuildAuthenticationResultFromAuthResponseUseCase(com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter nativeRypDataConverter, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase processOneShotAuthenticationDataUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeRypDataConverter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processOneShotAuthenticationDataUseCase, "");
        this.Camera2StreamConfigurationMap = nativeRypDataConverter;
        this.getHighSpeedVideoFpsRangesFor = processOneShotAuthenticationDataUseCase;
    }

    public final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult> invoke(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData authData) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult;
        arrow.core.Either right;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authData, "");
        com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData = authData.getCheckoutData();
        com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = null;
        if (checkoutData != null) {
            java.lang.String nativeCheckOutData = checkoutData.getNativeCheckOutData();
            if (nativeCheckOutData != null) {
                arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse> convert = this.Camera2StreamConfigurationMap.convert(nativeCheckOutData);
                if (convert instanceof arrow.core.Either.Left) {
                    arrow.core.Either.Left left = (arrow.core.Either.Left) convert;
                    if (kotlin.text.StringsKt.startsWith$default(((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) left.getValue()).getDescription(), com.paypal.oslo.feature.inappcheckout.Constants.ERROR_FUNDING_SELECTION_DESCRIPTION_PREFIX, false, 2, (java.lang.Object) null)) {
                        right = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError(((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) left.getValue()).getDescription()));
                    } else {
                        right = arrow.core.EitherKt.right(null);
                    }
                } else {
                    if (!(convert instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = arrow.core.EitherKt.right(((arrow.core.Either.Right) convert).getValue());
                }
                if (right instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left(((arrow.core.Either.Left) right).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                authenticationXOResponse = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse) ((arrow.core.Either.Right) right).getValue();
            }
            oneShotAuthenticationResult = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult(authData.getAuthCode(), this.getHighSpeedVideoFpsRangesFor.invoke(authData), authenticationXOResponse);
        } else {
            oneShotAuthenticationResult = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult(authData.getAuthCode(), null, null);
        }
        return arrow.core.EitherKt.right(oneShotAuthenticationResult);
    }
}
