package com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/domain/usecase/UpdateSignupFieldUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;", "signupDataManager", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;)V", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldType;", "fieldType", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "invoke-hlZgF5g", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "invoke", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/SignupDataManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateSignupFieldUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public UpdateSignupFieldUseCase(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupDataManager, "");
        this.getHighSpeedVideoFpsRanges = signupDataManager;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0131, code lost:
    
        return r0;
     */
    /* renamed from: invoke-hlZgF5g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType m16382invokehlZgF5g(java.lang.String fieldType, java.lang.String value) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM2;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM3;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM4;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM5;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String upperCase = fieldType.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.valueOf(upperCase));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            m23436constructorimpl = null;
        }
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType = (com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType) ((java.lang.Enum) m23436constructorimpl);
        if (signupFieldType != null) {
            com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData currentState = this.getHighSpeedVideoFpsRanges.getCurrentState();
            switch (com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase.WhenMappings.$EnumSwitchMapping$0[signupFieldType.ordinal()]) {
                case 1:
                    this.getHighSpeedVideoFpsRanges.updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.Name.m16300copyRV_47s$default(currentState.getName(), com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl(value), null, 2, null));
                    break;
                case 2:
                    this.getHighSpeedVideoFpsRanges.updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.Name.m16300copyRV_47s$default(currentState.getName(), null, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15970constructorimpl(value), 1, null));
                    break;
                case 3:
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager = this.getHighSpeedVideoFpsRanges;
                    m11247copye42MVwM = r5.m11247copye42MVwM((r22 & 1) != 0 ? r5.addressLine1 : com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(value), (r22 & 2) != 0 ? r5.addressLine2 : null, (r22 & 4) != 0 ? r5.addressLine3 : null, (r22 & 8) != 0 ? r5.adminArea4 : null, (r22 & 16) != 0 ? r5.adminArea3 : null, (r22 & 32) != 0 ? r5.adminArea2 : null, (r22 & 64) != 0 ? r5.adminArea1 : null, (r22 & 128) != 0 ? r5.postalCode : null, (r22 & 256) != 0 ? r5.countryCode : null, (r22 & 512) != 0 ? currentState.getAddress().detail : null);
                    signupDataManager.updateAddress(m11247copye42MVwM);
                    break;
                case 4:
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager2 = this.getHighSpeedVideoFpsRanges;
                    m11247copye42MVwM2 = r5.m11247copye42MVwM((r22 & 1) != 0 ? r5.addressLine1 : null, (r22 & 2) != 0 ? r5.addressLine2 : com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(value), (r22 & 4) != 0 ? r5.addressLine3 : null, (r22 & 8) != 0 ? r5.adminArea4 : null, (r22 & 16) != 0 ? r5.adminArea3 : null, (r22 & 32) != 0 ? r5.adminArea2 : null, (r22 & 64) != 0 ? r5.adminArea1 : null, (r22 & 128) != 0 ? r5.postalCode : null, (r22 & 256) != 0 ? r5.countryCode : null, (r22 & 512) != 0 ? currentState.getAddress().detail : null);
                    signupDataManager2.updateAddress(m11247copye42MVwM2);
                    break;
                case 5:
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager3 = this.getHighSpeedVideoFpsRanges;
                    m11247copye42MVwM3 = r5.m11247copye42MVwM((r22 & 1) != 0 ? r5.addressLine1 : null, (r22 & 2) != 0 ? r5.addressLine2 : null, (r22 & 4) != 0 ? r5.addressLine3 : com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(value), (r22 & 8) != 0 ? r5.adminArea4 : null, (r22 & 16) != 0 ? r5.adminArea3 : null, (r22 & 32) != 0 ? r5.adminArea2 : null, (r22 & 64) != 0 ? r5.adminArea1 : null, (r22 & 128) != 0 ? r5.postalCode : null, (r22 & 256) != 0 ? r5.countryCode : null, (r22 & 512) != 0 ? currentState.getAddress().detail : null);
                    signupDataManager3.updateAddress(m11247copye42MVwM3);
                    break;
                case 6:
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager4 = this.getHighSpeedVideoFpsRanges;
                    m11247copye42MVwM4 = r5.m11247copye42MVwM((r22 & 1) != 0 ? r5.addressLine1 : null, (r22 & 2) != 0 ? r5.addressLine2 : null, (r22 & 4) != 0 ? r5.addressLine3 : null, (r22 & 8) != 0 ? r5.adminArea4 : null, (r22 & 16) != 0 ? r5.adminArea3 : null, (r22 & 32) != 0 ? r5.adminArea2 : null, (r22 & 64) != 0 ? r5.adminArea1 : com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(value), (r22 & 128) != 0 ? r5.postalCode : null, (r22 & 256) != 0 ? r5.countryCode : null, (r22 & 512) != 0 ? currentState.getAddress().detail : null);
                    signupDataManager4.updateAddress(m11247copye42MVwM4);
                    break;
                case 7:
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager5 = this.getHighSpeedVideoFpsRanges;
                    m11247copye42MVwM5 = r5.m11247copye42MVwM((r22 & 1) != 0 ? r5.addressLine1 : null, (r22 & 2) != 0 ? r5.addressLine2 : null, (r22 & 4) != 0 ? r5.addressLine3 : null, (r22 & 8) != 0 ? r5.adminArea4 : null, (r22 & 16) != 0 ? r5.adminArea3 : null, (r22 & 32) != 0 ? r5.adminArea2 : com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(value), (r22 & 64) != 0 ? r5.adminArea1 : null, (r22 & 128) != 0 ? r5.postalCode : null, (r22 & 256) != 0 ? r5.countryCode : null, (r22 & 512) != 0 ? currentState.getAddress().detail : null);
                    signupDataManager5.updateAddress(m11247copye42MVwM5);
                    break;
                case 8:
                    com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager6 = this.getHighSpeedVideoFpsRanges;
                    m11247copye42MVwM6 = r5.m11247copye42MVwM((r22 & 1) != 0 ? r5.addressLine1 : null, (r22 & 2) != 0 ? r5.addressLine2 : null, (r22 & 4) != 0 ? r5.addressLine3 : null, (r22 & 8) != 0 ? r5.adminArea4 : null, (r22 & 16) != 0 ? r5.adminArea3 : null, (r22 & 32) != 0 ? r5.adminArea2 : null, (r22 & 64) != 0 ? r5.adminArea1 : null, (r22 & 128) != 0 ? r5.postalCode : com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(value), (r22 & 256) != 0 ? r5.countryCode : null, (r22 & 512) != 0 ? currentState.getAddress().detail : null);
                    signupDataManager6.updateAddress(m11247copye42MVwM6);
                    break;
            }
        } else {
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.FIRST_NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.LAST_NAME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE1.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADDRESS_LINE3.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADMIN_AREA1.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.ADMIN_AREA2.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.POSTAL_CODE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
