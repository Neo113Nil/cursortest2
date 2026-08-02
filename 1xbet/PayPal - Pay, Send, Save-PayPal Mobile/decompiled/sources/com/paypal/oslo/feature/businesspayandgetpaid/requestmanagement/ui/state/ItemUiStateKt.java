package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;", "toUiState", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getNetTotal", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "netTotal"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemUiStateKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getNetTotal(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item item) {
        java.math.BigDecimal bigDecimal;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount = item.getUnitAmount();
        if (unitAmount == null) {
            return null;
        }
        java.lang.String quantity = item.getQuantity();
        if (quantity == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(quantity)) == null) {
            bigDecimal = java.math.BigDecimal.ONE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
        return unitAmount.times(bigDecimal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r6 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState toUiState(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item item) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String descriptionForLocale$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String quantity = item.getQuantity();
        if (quantity == null) {
            quantity = "1";
        }
        java.lang.String str4 = quantity;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount = item.getUnitAmount();
        java.lang.String str5 = "$0.00";
        if (unitAmount == null || (str = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(unitAmount, null, 1, null)) == null) {
            str = "$0.00";
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure = item.getUnitOfMeasure();
        int i = unitOfMeasure == null ? -1 : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiStateKt.WhenMappings.$EnumSwitchMapping$0[unitOfMeasure.ordinal()];
        if (i != -1) {
            if (i == 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("/hour");
                str = sb.toString();
            } else if (i != 2 && i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount2 = item.getUnitAmount();
        if (unitAmount2 != null) {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str4);
            if (bigDecimalOrNull == null) {
                bigDecimalOrNull = java.math.BigDecimal.ONE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
            str2 = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(unitAmount2.times(bigDecimalOrNull), null, 1, null);
        }
        str2 = "$0.00";
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax = item.getTax();
        if (tax != null) {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount amount = tax.getAmount();
            if (amount != null && (descriptionForLocale$default = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(amount, null, 1, null)) != null) {
                str5 = descriptionForLocale$default;
            }
            java.lang.String name2 = tax.getName();
            java.lang.String percent = tax.getPercent();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(name2);
            sb2.append(" ");
            sb2.append(percent);
            sb2.append("% (");
            sb2.append(str5);
            sb2.append(")");
            str3 = sb2.toString();
        } else {
            str3 = null;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str4);
        sb4.append(" x ");
        sb4.append(str);
        sb3.append(sb4.toString());
        if (str3 != null) {
            sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb3.append(str3);
        }
        java.lang.String obj = sb3.toString();
        java.lang.String name3 = item.getName();
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState(name3 == null ? "" : name3, str4, str, str2, str3, null, obj, 32, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.HOURS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.QUANTITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.AMOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
