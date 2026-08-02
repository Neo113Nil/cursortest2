package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/CreateZettleIntentUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "zettleSDKManager", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;)V", "Landroid/content/Context;", "context", "", "amount", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "Larrow/core/Either;", "", "Landroid/content/Intent;", "invoke", "(Landroid/content/Context;JLjava/lang/String;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreateZettleIntentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CreateZettleIntentUseCase(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager tapToPaySDKManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPaySDKManager, "");
        this.getHighSpeedVideoFpsRangesFor = tapToPaySDKManager;
    }

    public final arrow.core.Either<java.lang.Throwable, android.content.Intent> invoke(android.content.Context context, long amount, java.lang.String uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        arrow.core.Either<java.lang.Throwable, android.content.Intent> createPaymentIntent = this.getHighSpeedVideoFpsRangesFor.createPaymentIntent(context, uuid, amount);
        if (createPaymentIntent instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.InvalidLowAmount invalidLowAmount = (java.lang.Throwable) ((arrow.core.Either.Left) createPaymentIntent).getValue();
            if (invalidLowAmount.getCause() instanceof java.lang.IllegalArgumentException) {
                java.lang.Throwable cause = invalidLowAmount.getCause();
                if (kotlin.jvm.internal.Intrinsics.areEqual(cause != null ? cause.getMessage() : null, "amount can't be zero or negative")) {
                    invalidLowAmount = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.InvalidLowAmount.INSTANCE;
                }
            }
            return new arrow.core.Either.Left(invalidLowAmount);
        }
        if (createPaymentIntent instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) createPaymentIntent).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
