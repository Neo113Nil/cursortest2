package com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR:\u0010\u0014\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R:\u0010\u0012\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R:\u0010\u0017\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R:\u0010\u0015\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R:\u0010\u0016\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/domain/usecase/ValidateAddressUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "addressData", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "fieldsToValidate", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/util/Set;)Ljava/util/Map;", "Lkotlin/Function1;", "", "Lcom/paypal/oslo/feature/onboarding/validators/domain/Validator;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidateAddressUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getHighSpeedVideoFpsRangesFor = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_address_line1_required);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getHighResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_address_line3_required);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getHighSpeedVideoSizes = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_admin_area1_required);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> Camera2StreamConfigurationMap = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_admin_area2_required);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getHighSpeedVideoFpsRanges = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.then(com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_postal_code_required), com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.regex$default(com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCaseKt.PostalCodeRegex, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_postal_code_invalid, null, null, 12, null));

    @javax.inject.Inject
    public ValidateAddressUseCase() {
    }

    public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> invoke(com.paypal.oslo.core.i18n.domain.model.Address addressData, java.util.Set<? extends com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType> fieldsToValidate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldsToValidate, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (fieldsToValidate.contains(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE1)) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType = com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE1;
            kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> function1 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String m11248getAddressLine1rVKqk9c = addressData.m11248getAddressLine1rVKqk9c();
            if (m11248getAddressLine1rVKqk9c == null) {
                m11248getAddressLine1rVKqk9c = null;
            }
            createMapBuilder.put(signupFieldType, function1.invoke(m11248getAddressLine1rVKqk9c));
        }
        if (fieldsToValidate.contains(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE3)) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType2 = com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE3;
            kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String m11250getAddressLine3z9ldjEo = addressData.m11250getAddressLine3z9ldjEo();
            if (m11250getAddressLine3z9ldjEo == null) {
                m11250getAddressLine3z9ldjEo = null;
            }
            createMapBuilder.put(signupFieldType2, function12.invoke(m11250getAddressLine3z9ldjEo));
        }
        if (fieldsToValidate.contains(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADMIN_AREA1)) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType3 = com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADMIN_AREA1;
            kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> function13 = this.getHighSpeedVideoSizes;
            java.lang.String m11251getAdminArea1bsDj6rY = addressData.m11251getAdminArea1bsDj6rY();
            if (m11251getAdminArea1bsDj6rY == null) {
                m11251getAdminArea1bsDj6rY = null;
            }
            createMapBuilder.put(signupFieldType3, function13.invoke(m11251getAdminArea1bsDj6rY));
        }
        if (fieldsToValidate.contains(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADMIN_AREA2)) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType4 = com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADMIN_AREA2;
            kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> function14 = this.Camera2StreamConfigurationMap;
            java.lang.String m11252getAdminArea2DR8a_90 = addressData.m11252getAdminArea2DR8a_90();
            if (m11252getAdminArea2DR8a_90 == null) {
                m11252getAdminArea2DR8a_90 = null;
            }
            createMapBuilder.put(signupFieldType4, function14.invoke(m11252getAdminArea2DR8a_90));
        }
        if (fieldsToValidate.contains(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.POSTAL_CODE)) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType5 = com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.POSTAL_CODE;
            kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> function15 = this.getHighSpeedVideoFpsRanges;
            java.lang.String m11256getPostalCodeyjZ2Xzc = addressData.m11256getPostalCodeyjZ2Xzc();
            createMapBuilder.put(signupFieldType5, function15.invoke(m11256getPostalCodeyjZ2Xzc != null ? m11256getPostalCodeyjZ2Xzc : null));
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }
}
