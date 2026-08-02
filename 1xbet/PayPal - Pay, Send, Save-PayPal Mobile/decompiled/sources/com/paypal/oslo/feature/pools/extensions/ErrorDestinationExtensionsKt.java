package com.paypal.oslo.feature.pools.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pools/navigation/ErrorDestination;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorScreenConfig;", "toErrorScreenConfig", "(Lcom/paypal/oslo/feature/pools/navigation/ErrorDestination;)Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorScreenConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorDestinationExtensionsKt {
    public static final com.paypal.oslo.feature.pools.shared.ui.error.ErrorScreenConfig toErrorScreenConfig(com.paypal.oslo.feature.pools.navigation.ErrorDestination errorDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDestination, "");
        com.paypal.oslo.feature.pools.shared.ui.error.StyleConfig styleConfig = com.paypal.oslo.feature.pools.extensions.ErrorTypeExtensionsKt.toStyleConfig(errorDestination.getErrorType());
        return new com.paypal.oslo.feature.pools.shared.ui.error.ErrorScreenConfig(errorDestination.getErrorTitle(), errorDestination.getErrorDescription(), errorDestination.getButtonText(), errorDestination.getTopBarTitle(), styleConfig.getIcon(), styleConfig.getButtonStyle(), styleConfig.getButtonSize(), styleConfig.getShowBackButton(), styleConfig.getShowCloseButton(), styleConfig.getShowDescription());
    }
}
