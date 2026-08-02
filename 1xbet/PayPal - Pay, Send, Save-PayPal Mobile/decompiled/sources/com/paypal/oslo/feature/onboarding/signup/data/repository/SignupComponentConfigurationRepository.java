package com.paypal.oslo.feature.onboarding.signup.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupComponentConfigurationRepository;", "", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupComponentConfigurationBuilder;", "componentBuilder", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupComponentConfigurationBuilder;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentType;", "componentType", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "buildComponentConfig-IPXNmLY", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "buildComponentConfig", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupComponentConfigurationBuilder;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupComponentConfigurationRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SignupComponentConfigurationRepository(com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder signupComponentConfigurationBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupComponentConfigurationBuilder, "");
        this.getHighSpeedVideoFpsRanges = signupComponentConfigurationBuilder;
    }

    /* renamed from: buildComponentConfig-IPXNmLY, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig m16267buildComponentConfigIPXNmLY(java.lang.String stepId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        java.lang.String lowerCase = stepId.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String lowerCase2 = componentType.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(lowerCase);
        sb.append(".");
        sb.append(lowerCase2);
        java.lang.String obj = sb.toString();
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16233getHEADERNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16261buildHeaderComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16232getEMAILNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16260buildEmailComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16237getPHONENvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16265buildPhoneComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16236getPASSWORDNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16264buildPasswordComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16235getNAMENvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16263buildNameComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16230getADDRESSNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16258buildAddressComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16238getTERMS_AND_CONDITIONSNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16266buildTermsAndConditionsComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16234getLINKNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16262buildLinkComponentf16IgvE(obj, componentType);
        }
        if (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(componentType, com.paypal.oslo.feature.onboarding.signup.data.repository.ComponentTypes.INSTANCE.m16231getBUTTONNvngK3s())) {
            return this.getHighSpeedVideoFpsRanges.m16259buildButtonComponentf16IgvE(obj, componentType);
        }
        throw new java.lang.IllegalArgumentException("Unsupported component type: ".concat(java.lang.String.valueOf(componentType)));
    }
}
