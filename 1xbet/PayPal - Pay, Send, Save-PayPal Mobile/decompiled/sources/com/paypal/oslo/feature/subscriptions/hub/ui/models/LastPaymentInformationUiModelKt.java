package com.paypal.oslo.feature.subscriptions.hub.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/LastPaymentInformationUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LastPaymentInformationUiModelKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModel(com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel> continuation) {
        com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt$toUiModel$1 lastPaymentInformationUiModelKt$toUiModel$1;
        int i;
        int i2;
        java.time.OffsetDateTime offsetDateTime;
        java.lang.Object formatBalance;
        java.time.ZonedDateTime zonedDateTime;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt$toUiModel$1) {
            lastPaymentInformationUiModelKt$toUiModel$1 = (com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt$toUiModel$1) continuation;
            if ((lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = lastPaymentInformationUiModelKt$toUiModel$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor;
                java.lang.String str = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    try {
                        offsetDateTime = java.time.OffsetDateTime.parse(lastPaymentInformation.getPaidDate());
                    } catch (java.time.format.DateTimeParseException e) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "error parsing paidDate in LastPaymentInformation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paidDate", lastPaymentInformation.getPaidDate()), kotlin.TuplesKt.to("exception", e.getMessage())), null, 4, null);
                        offsetDateTime = null;
                    }
                    java.lang.Integer boxInt = (offsetDateTime == null || (zonedDateTime = offsetDateTime.toZonedDateTime()) == null) ? null : kotlin.coroutines.jvm.internal.Boxing.boxInt(zonedDateTime.getYear());
                    int year = java.time.OffsetDateTime.now(java.time.ZoneId.systemDefault()).getYear();
                    if (boxInt != null && boxInt.intValue() == year) {
                        i2 = 1;
                    }
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance amount = lastPaymentInformation.getAmount();
                    lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = lastPaymentInformation;
                    lastPaymentInformationUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = formatHelper;
                    lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(offsetDateTime);
                    lastPaymentInformationUiModelKt$toUiModel$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(boxInt);
                    lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = year;
                    lastPaymentInformationUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                    lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor = 1;
                    formatBalance = formatHelper.formatBalance(amount, lastPaymentInformationUiModelKt$toUiModel$1);
                    if (formatBalance == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = lastPaymentInformationUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                    formatHelper = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) lastPaymentInformationUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation2 = (com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation) lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i3;
                    lastPaymentInformation = lastPaymentInformation2;
                    formatBalance = obj;
                }
                java.lang.String str2 = (java.lang.String) formatBalance;
                if (lastPaymentInformation.getPaidDate().length() > 0) {
                    str = formatHelper.formatDate(lastPaymentInformation.getPaidDate(), i2 != 0 ? new com.paypal.oslo.core.i18n.domain.model.CustomStyle(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem.INSTALLMENT_DATE_OUTPUT_PATTERN) : com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_MEDIUM);
                }
                return new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel(str2, str);
            }
        }
        lastPaymentInformationUiModelKt$toUiModel$1 = new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt$toUiModel$1(continuation);
        java.lang.Object obj2 = lastPaymentInformationUiModelKt$toUiModel$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lastPaymentInformationUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor;
        java.lang.String str3 = null;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) formatBalance;
        if (lastPaymentInformation.getPaidDate().length() > 0) {
        }
        return new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel(str22, str3);
    }
}
