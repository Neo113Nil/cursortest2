package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJG\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0016\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J+\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/ValidationErrorMapper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "", "", "fieldLabels", "buildFieldErrorMap", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;", "", "p0", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "p1", "p2", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ValidationErrorMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ValidationErrorMapper(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
    }

    public final java.util.Map<java.lang.String, java.lang.String> buildFieldErrorMap(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError> errors, java.util.Map<java.lang.String, java.lang.String> fieldLabels) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldLabels, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (com.paypal.oslo.core.i18n.domain.model.AddressValidationError addressValidationError : errors) {
            if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) {
                getHighSpeedVideoFpsRanges(linkedHashMap, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) addressValidationError).getFields(), fieldLabels);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) {
                getHighSpeedVideoSizes(linkedHashMap, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) addressValidationError).getFields(), fieldLabels);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) {
                getHighSpeedVideoSizes(linkedHashMap, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) addressValidationError).getFields(), fieldLabels);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) {
                getHighSpeedVideoSizes(linkedHashMap, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidAllOffensive) addressValidationError).getFields(), fieldLabels);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf) {
                getHighSpeedVideoFpsRanges(linkedHashMap, ((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingOneOf) addressValidationError).getFields(), fieldLabels);
            } else if (!(addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) && !(addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsRuralRoute) && !(addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return linkedHashMap;
    }

    private final void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> p0, java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> p1, java.util.Map<java.lang.String, java.lang.String> p2) {
        for (com.paypal.oslo.core.i18n.domain.model.Field field : p1) {
            if (field != null) {
                java.lang.String fieldKey = com.paypal.oslo.feature.userprofile.ui.utils.AddressUtilsKt.getFieldKey(field);
                p0.put(fieldKey, this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_enter_your_field, getHighSpeedVideoFpsRangesFor(fieldKey, p2)));
            }
        }
    }

    private final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.String> p0, java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> p1, java.util.Map<java.lang.String, java.lang.String> p2) {
        for (com.paypal.oslo.core.i18n.domain.model.Field field : p1) {
            if (field != null) {
                java.lang.String fieldKey = com.paypal.oslo.feature.userprofile.ui.utils.AddressUtilsKt.getFieldKey(field);
                p0.put(fieldKey, this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_field_error, getHighSpeedVideoFpsRangesFor(fieldKey, p2)));
            }
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) {
        java.lang.String str = p1.get(p0);
        if (str != null) {
            return str;
        }
        java.lang.String lowerCase = p0.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }
}
