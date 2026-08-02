package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "isValidTaxValue", "(Ljava/lang/String;)Z", "Ljava/math/BigDecimal;", "getHighSpeedVideoFpsRangesFor", "Ljava/math/BigDecimal;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditTaxViewModelKt {
    private static final java.math.BigDecimal getHighSpeedVideoFpsRangesFor = new java.math.BigDecimal("100.0");

    public static final boolean isValidTaxValue(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            return true;
        }
        try {
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(java.lang.String.valueOf(com.paypal.oslo.feature.businessinventory.common.FormatAsPercentKt.percentToFraction(str)));
            if (!new kotlin.text.Regex("^\\d*\\.?\\d*$").matches(str) || bigDecimal.scale() > 5) {
                return false;
            }
            return bigDecimal.compareTo(getHighSpeedVideoFpsRangesFor) <= 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption access$toTaxOption(com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel) {
        java.lang.String id = taxUiModel.getId();
        if (id != null) {
            return new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption(id, kotlin.text.StringsKt.trim(taxUiModel.getLabel()).toString(), com.paypal.oslo.feature.businessinventory.common.FormatAsPercentKt.percentToFraction(taxUiModel.getPercentage()));
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    public static final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel access$toUiModel(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        java.lang.String id = taxOption.getId();
        java.lang.String label = taxOption.getLabel();
        double value = taxOption.getValue();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel(id, label, com.paypal.oslo.feature.businessinventory.common.FormatAsPercentKt.formatAsPercent(value, locale));
    }

    public static final /* synthetic */ java.lang.String access$transformEnteredTaxValue(java.lang.String str, java.lang.String str2) {
        return isValidTaxValue(str2) ? str2 : str;
    }
}
