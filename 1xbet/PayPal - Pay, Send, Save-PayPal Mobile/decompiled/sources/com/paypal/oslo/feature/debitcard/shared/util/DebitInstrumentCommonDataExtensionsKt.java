package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00000\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "", "formattedBillingAddress", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Ljava/lang/String;", "", "isAdditionalCardholderManagementEnabled", "shouldCheckSecondaryCardActivation", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Z)Z", "", "hasSecondaryCardPendingActivation", "(Ljava/util/List;)Z", "isPinUnset", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Z", "instrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "toDebitCardActivationInfo", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentCommonDataExtensionsKt {
    public static final java.lang.String formattedBillingAddress(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        java.util.List<java.lang.String> displayAddress;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress billingAddress = debitInstrument.getCardHolder().getBillingAddress();
        java.lang.String joinToString$default = (billingAddress == null || (displayAddress = billingAddress.getDisplayAddress()) == null) ? null : kotlin.collections.CollectionsKt.joinToString$default(displayAddress, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
        return joinToString$default == null ? "" : joinToString$default;
    }

    public static final boolean shouldCheckSecondaryCardActivation(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        return z && debitInstrument.getPrimary();
    }

    public static final boolean hasSecondaryCardPendingActivation(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        for (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument : list2) {
            if (!debitInstrument.getPrimary() && debitInstrument.getStatus().getDisplayState() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVATE) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isPinUnset(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        return debitInstrument.getPinStatus() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.UNSET;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo toDebitCardActivationInfo$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrument.getId();
        }
        return toDebitCardActivationInfo(debitInstrument, str);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo toDebitCardActivationInfo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitInstrument.getProductName());
        java.lang.String url = debitInstrument.getProductDetails().getLargeImage().getFront().getUrl();
        java.lang.String lastNChars = debitInstrument.getLastNChars();
        boolean z = debitInstrument.getPinStatus() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.SET;
        java.lang.String formattedBillingAddress = formattedBillingAddress(debitInstrument);
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress billingAddress = debitInstrument.getCardHolder().getBillingAddress();
        java.lang.String id = billingAddress != null ? billingAddress.getId() : null;
        java.lang.String estimatedArrivalDate = debitInstrument.getShipmentDetails().getEstimatedArrivalDate();
        java.lang.String formatToMonthDayYear = estimatedArrivalDate != null ? com.paypal.oslo.feature.debitcard.shared.util.DateFormattingExtensionsKt.formatToMonthDayYear(estimatedArrivalDate) : null;
        return new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo(str, fromValue, url, lastNChars, z, formattedBillingAddress, debitInstrument.getStatus().getLifecycleState(), id, formatToMonthDayYear != null ? formatToMonthDayYear : "", debitInstrument.getPrimary(), null, null, 3072, null);
    }
}
