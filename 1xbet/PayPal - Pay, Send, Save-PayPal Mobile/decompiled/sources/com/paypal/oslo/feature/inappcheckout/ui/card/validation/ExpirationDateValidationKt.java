package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "expirationDate", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lkotlin/Pair;", "", "validateExpirationDate", "(Ljava/lang/String;Landroid/content/res/Resources;)Lkotlin/Pair;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpirationDateValidationKt {
    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateExpirationDate(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        if (str.length() == 4) {
            java.lang.String take = kotlin.text.StringsKt.take(str, 2);
            java.lang.String substring = str.substring(2, 4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(take);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(substring);
            str = sb.toString();
        }
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateFormat(str, resources, com.paypal.oslo.feature.inappcheckout.ui.card.validation.ExpirationDateValidationKt$validateExpirationDate$1.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.ExpirationDateValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ExpirationDateValidationKt.$r8$lambda$eDkNvFVzsILgE9DtDrQVydnxA3E((android.content.res.Resources) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.ExpirationDateValidationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ExpirationDateValidationKt.$r8$lambda$oqLnXNFPUtOGzpAFgnPgR2CQvzU((android.content.res.Resources) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.String $r8$lambda$eDkNvFVzsILgE9DtDrQVydnxA3E(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_expiration_date_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$oqLnXNFPUtOGzpAFgnPgR2CQvzU(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_expiration_date_invalid_format_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ boolean access$isValidExpirationDate(java.lang.String str) {
        kotlin.Pair pair;
        int intValue;
        java.lang.String str2 = str;
        if (new kotlin.text.Regex("^\\d{2}/\\d{2}$").matches(str2)) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR}, false, 0, 6, (java.lang.Object) null);
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull((java.lang.String) split$default.get(0));
            java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull((java.lang.String) split$default.get(1));
            if (intOrNull != null && intOrNull2 != null && (intValue = intOrNull.intValue()) > 0 && intValue < 13) {
                pair = new kotlin.Pair(intOrNull, intOrNull2);
                if (pair != null) {
                    return false;
                }
                int intValue2 = ((java.lang.Number) pair.component1()).intValue();
                int intValue3 = ((java.lang.Number) pair.component2()).intValue();
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                int i = calendar.get(1) % 100;
                return intValue3 > i || (intValue3 == i && intValue2 >= calendar.get(2) + 1);
            }
        }
        pair = null;
        if (pair != null) {
        }
    }
}
