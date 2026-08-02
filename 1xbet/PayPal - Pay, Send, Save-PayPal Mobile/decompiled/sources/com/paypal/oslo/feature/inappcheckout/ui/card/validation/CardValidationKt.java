package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000b2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\" \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"", "p0", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Lkotlin/text/Regex;", "cardNumber", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;", "metadata", "cardBrandRegex", "Lkotlin/Pair;", "", "validateCardNumber", "(Ljava/lang/String;Landroid/content/res/Resources;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;Ljava/lang/String;)Lkotlin/Pair;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "validateCvv", "(Ljava/lang/String;Landroid/content/res/Resources;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;)Lkotlin/Pair;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/text/Regex;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardValidationKt {
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.text.Regex> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap<>();
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("\\s");

    private static final kotlin.text.Regex Camera2StreamConfigurationMap(java.lang.String str) {
        kotlin.text.Regex putIfAbsent;
        java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.text.Regex> concurrentHashMap = Camera2StreamConfigurationMap;
        kotlin.text.Regex regex = concurrentHashMap.get(str);
        if (regex == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (regex = new kotlin.text.Regex(str)))) != null) {
            regex = putIfAbsent;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(regex, "");
        return regex;
    }

    public static /* synthetic */ kotlin.Pair validateCardNumber$default(java.lang.String str, android.content.res.Resources resources, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            metadataAttribute = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return validateCardNumber(str, resources, metadataAttribute, str2);
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateCardNumber(java.lang.String str, android.content.res.Resources resources, final com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateFormat(getHighResolutionOutputSizeshNQ4ISI.replace(str, ""), resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.$r8$lambda$0_7h9YBIeiIy0o_9EaB1IG6Bryo(com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute.this, str2, (java.lang.String) obj));
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.$r8$lambda$J2yhM655iI6zaswGHWKJdC7ZcoA((android.content.res.Resources) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.m15490$r8$lambda$sNt42xrVa9vDRQvGXUIRyhr80((android.content.res.Resources) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Pair validateCvv$default(java.lang.String str, android.content.res.Resources resources, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            metadataAttribute = null;
        }
        return validateCvv(str, resources, metadataAttribute);
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateCvv(java.lang.String str, android.content.res.Resources resources, final com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateFormat(getHighResolutionOutputSizeshNQ4ISI.replace(str, ""), resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.m15488$r8$lambda$ROWMG1T1IzjEnyrHTOxKZnAcjA(com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute.this, (java.lang.String) obj));
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.m15489$r8$lambda$pT3frcyz0l8diCT5OIteDEqtY((android.content.res.Resources) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.CardValidationKt.$r8$lambda$ECweFrP0PeSYrLCyrCItFW4AaeQ((android.content.res.Resources) obj);
            }
        });
    }

    public static /* synthetic */ boolean $r8$lambda$0_7h9YBIeiIy0o_9EaB1IG6Bryo(com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int minimumLength = metadataAttribute != null ? metadataAttribute.getMinimumLength() : 13;
        int maximumLength = metadataAttribute != null ? metadataAttribute.getMaximumLength() : 19;
        java.lang.String regex = metadataAttribute != null ? metadataAttribute.getRegex() : null;
        int length = str2.length();
        if (minimumLength > length || length > maximumLength) {
            return false;
        }
        java.lang.String str3 = regex;
        if (str3 != null && str3.length() != 0 && !Camera2StreamConfigurationMap(regex).matches(str2)) {
            return false;
        }
        java.lang.String str4 = str;
        return str4 == null || str4.length() == 0 || Camera2StreamConfigurationMap(str).matches(str2);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$ECweFrP0PeSYrLCyrCItFW4AaeQ(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_cvv_invalid_format_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$J2yhM655iI6zaswGHWKJdC7ZcoA(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_card_number_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$ROWMG1T1IzjEnyrH-TOxKZnAcjA, reason: not valid java name */
    public static /* synthetic */ boolean m15488$r8$lambda$ROWMG1T1IzjEnyrHTOxKZnAcjA(com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int minimumLength = metadataAttribute != null ? metadataAttribute.getMinimumLength() : 3;
        int maximumLength = metadataAttribute != null ? metadataAttribute.getMaximumLength() : 4;
        java.lang.String regex = metadataAttribute != null ? metadataAttribute.getRegex() : null;
        int length = str.length();
        if (minimumLength > length || length > maximumLength) {
            return false;
        }
        java.lang.String str2 = regex;
        return str2 == null || str2.length() == 0 || Camera2StreamConfigurationMap(regex).matches(str);
    }

    /* renamed from: $r8$lambda$pT3frcyz0l8diCT5O-Ite-DEqtY, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15489$r8$lambda$pT3frcyz0l8diCT5OIteDEqtY(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_cvv_empty_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$sNt42xrVa9-vDRQvGXUIRyhr8-0, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15490$r8$lambda$sNt42xrVa9vDRQvGXUIRyhr80(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_card_number_format_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
