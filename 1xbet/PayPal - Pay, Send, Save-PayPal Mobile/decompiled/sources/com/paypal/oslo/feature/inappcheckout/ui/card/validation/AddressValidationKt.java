package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a-\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a-\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a-\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u0007"}, d2 = {"", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS, "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lkotlin/Pair;", "", "validateStreetAddress", "(Ljava/lang/String;Landroid/content/res/Resources;)Lkotlin/Pair;", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "validateCity", "state", "validateState", "zipCode", "validateZipCode"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressValidationKt {
    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateStreetAddress(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateEmpty(str, resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.$r8$lambda$tq_FPCjeWXByp6_jc32Ao2knZtg((android.content.res.Resources) obj);
            }
        });
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateCity(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateEmpty(str, resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.$r8$lambda$R5NMbu1LIo3byWN4T2f2yb458M8((android.content.res.Resources) obj);
            }
        });
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateState(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateEmpty(str, resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.$r8$lambda$E6i8IGfRRadu2ukX_eD33uHhJJQ((android.content.res.Resources) obj);
            }
        });
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateZipCode(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateFormat(str, resources, com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$validateZipCode$1.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.m15487$r8$lambda$mHvhcPCcIw_mA6G8lXPLft7iT4((android.content.res.Resources) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.m15486$r8$lambda$IWkPpG4pT_EEowq1E8Ndc_1NYQ((android.content.res.Resources) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.String $r8$lambda$E6i8IGfRRadu2ukX_eD33uHhJJQ(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_state_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$IWkPpG4pT_EEowq1E8N-dc_1NYQ, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15486$r8$lambda$IWkPpG4pT_EEowq1E8Ndc_1NYQ(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_zip_code_invalid_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$R5NMbu1LIo3byWN4T2f2yb458M8(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_city_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$mHvhc-PCcIw_mA6G8lXPLft7iT4, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15487$r8$lambda$mHvhcPCcIw_mA6G8lXPLft7iT4(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_zip_code_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$tq_FPCjeWXByp6_jc32Ao2knZtg(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_street_address_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
