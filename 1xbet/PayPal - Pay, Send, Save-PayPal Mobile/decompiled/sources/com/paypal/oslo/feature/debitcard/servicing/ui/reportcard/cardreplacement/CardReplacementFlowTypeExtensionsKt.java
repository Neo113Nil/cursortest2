package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementFlowType;", "Landroid/content/Context;", "context", "", "cardLastFourDigits", "expectedArrivalDate", "Lkotlin/Triple;", "resolveInitialContent", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementFlowType;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Triple;", "estimatedDeliveryDate", "Lkotlin/Pair;", "resolveSuccessContent", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementFlowType;Landroid/content/Context;Ljava/lang/String;)Lkotlin/Pair;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;", "resolveReissueCardReason", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementFlowType;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardReplacementFlowTypeExtensionsKt {
    public static final kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> resolveInitialContent(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType cardReplacementFlowType, android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementFlowTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[cardReplacementFlowType.ordinal()];
        if (i == 1) {
            return new kotlin.Triple<>(context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_lost_stolen_title), context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_lost_stolen_description, str), context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_send_replacement_card));
        }
        if (i == 2) {
            return new kotlin.Triple<>(context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_not_received_title, str2), context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_not_received_description), context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_not_received_cta));
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new kotlin.Triple<>(context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_damaged_title), context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_damaged_description), context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_send_replacement_card));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> resolveSuccessContent(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType cardReplacementFlowType, android.content.Context context, java.lang.String str) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string2 = str != null ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_card_delivery_description, str) : null;
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementFlowTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[cardReplacementFlowType.ordinal()];
        if (i == 1) {
            return new kotlin.Pair<>(context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_lost_stolen_success_title), string2);
        }
        if (i != 2) {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new kotlin.Pair<>(context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_damaged_success_title), string2);
        }
        if (str == null || (string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_card_delivery_title, str)) == null) {
            string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_lost_stolen_success_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        }
        return new kotlin.Pair<>(string, null);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason resolveReissueCardReason(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType cardReplacementFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementFlowType, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementFlowTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[cardReplacementFlowType.ordinal()];
        if (i == 1 || i == 2) {
            return com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason.LOST_STOLEN;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason.WORN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.LOST_STOLEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.CARD_NOT_RECEIVED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.DAMAGED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
