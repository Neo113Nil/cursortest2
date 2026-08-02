package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "toBalanceErrorBottomSheetEnum", "(Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;)Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadErrorMapperKt {
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum toBalanceErrorBottomSheetEnum(com.paypal.oslo.feature.balance.domain.error.AutoReloadError autoReloadError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadError, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Nsf.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.NSF;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FiDeclined.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.FI_DECLINED;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_AUTO_RELOAD_ERROR;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FundsError.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.FUNDS_ERROR;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericError.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_ERROR;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_API_ERROR;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.RiskDeclined.INSTANCE)) {
            return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.RISK_DECLINED;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Business.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_API_ERROR;
    }
}
