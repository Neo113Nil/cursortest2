package com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR:\u0010\u0012\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\rj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R:\u0010\u0013\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\rj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/domain/usecase/ValidateNameUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "nameData", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "invoke", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;)Ljava/util/Map;", "Lkotlin/Function1;", "", "Lcom/paypal/oslo/feature/onboarding/validators/domain/Validator;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidateNameUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> Camera2StreamConfigurationMap = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_first_name_required);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.CharSequence, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> getHighSpeedVideoFpsRangesFor = com.paypal.oslo.feature.onboarding.validators.factory.ValidatorsFactoryKt.required(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_last_name_required);

    @javax.inject.Inject
    public ValidateNameUseCase() {
    }

    public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType, arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> invoke(com.paypal.oslo.feature.onboarding.signup.domain.model.Name nameData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameData, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.FIRST_NAME, this.Camera2StreamConfigurationMap.invoke(nameData.m16304getFirstNamew8YRmDk()));
        createMapBuilder.put(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.LAST_NAME, this.getHighSpeedVideoFpsRangesFor.invoke(nameData.m16305getLastNamei7KAUmI()));
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }
}
