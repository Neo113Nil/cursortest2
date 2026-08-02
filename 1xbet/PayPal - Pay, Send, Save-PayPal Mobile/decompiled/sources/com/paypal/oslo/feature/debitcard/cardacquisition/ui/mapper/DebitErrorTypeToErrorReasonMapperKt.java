package com.paypal.oslo.feature.debitcard.cardacquisition.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "toErrorReason", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitErrorTypeToErrorReasonMapperKt {
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason toErrorReason(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
        int i = com.paypal.oslo.feature.debitcard.cardacquisition.ui.mapper.DebitErrorTypeToErrorReasonMapperKt.WhenMappings.$EnumSwitchMapping$0[debitErrorType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.InternetConnectionError.INSTANCE;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.ApiError.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.INELIGIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
