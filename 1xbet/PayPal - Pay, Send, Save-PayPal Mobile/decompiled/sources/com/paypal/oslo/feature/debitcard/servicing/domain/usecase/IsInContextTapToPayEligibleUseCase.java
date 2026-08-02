package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/IsInContextTapToPayEligibleUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/IsTapToPayEnabled;", "isTapToPayEnabled", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/IsTapToPayEnabled;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "countryCode", "", "invoke", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Z", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/IsTapToPayEnabled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IsInContextTapToPayEligibleUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled getHighSpeedVideoSizes;

    @javax.inject.Inject
    public IsInContextTapToPayEligibleUseCase(com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled isTapToPayEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isTapToPayEnabled, "");
        this.getHighSpeedVideoSizes = isTapToPayEnabled;
    }

    public final boolean invoke(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        if (productName == com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD && kotlin.jvm.internal.Intrinsics.areEqual(countryCode, "DE")) {
            return this.getHighSpeedVideoSizes.invoke();
        }
        return true;
    }
}
