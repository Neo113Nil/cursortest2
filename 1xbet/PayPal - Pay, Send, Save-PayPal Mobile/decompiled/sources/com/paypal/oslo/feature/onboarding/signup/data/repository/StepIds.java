package com.paypal.oslo.feature.onboarding.signup.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/StepIds;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "EMAIL_STEP", "Ljava/lang/String;", "getEMAIL_STEP-eVUBM90", "()Ljava/lang/String;", "PHONE_ENTRY_STEP", "getPHONE_ENTRY_STEP-eVUBM90", "PASSWORD_STEP", "getPASSWORD_STEP-eVUBM90", "PERSONAL_INFO_STEP", "getPERSONAL_INFO_STEP-eVUBM90", "ADDITIONAL_INFO_STEP", "getADDITIONAL_INFO_STEP-eVUBM90", "ADDRESS_INFO_STEP", "getADDRESS_INFO_STEP-eVUBM90"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepIds {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.signup.data.repository.StepIds INSTANCE = new com.paypal.oslo.feature.onboarding.signup.data.repository.StepIds();
    private static final java.lang.String EMAIL_STEP = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("EMAIL");
    private static final java.lang.String PHONE_ENTRY_STEP = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("PHONE_ENTRY");
    private static final java.lang.String PASSWORD_STEP = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("PASSWORD");
    private static final java.lang.String PERSONAL_INFO_STEP = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("PERSONAL_INFO");
    private static final java.lang.String ADDITIONAL_INFO_STEP = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("ADDITIONAL_INFO");
    private static final java.lang.String ADDRESS_INFO_STEP = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16030constructorimpl("ADDRESS_INFO");

    private StepIds() {
    }

    /* renamed from: getEMAIL_STEP-eVUBM90, reason: not valid java name */
    public final java.lang.String m16277getEMAIL_STEPeVUBM90() {
        return EMAIL_STEP;
    }

    /* renamed from: getPHONE_ENTRY_STEP-eVUBM90, reason: not valid java name */
    public final java.lang.String m16280getPHONE_ENTRY_STEPeVUBM90() {
        return PHONE_ENTRY_STEP;
    }

    /* renamed from: getPASSWORD_STEP-eVUBM90, reason: not valid java name */
    public final java.lang.String m16278getPASSWORD_STEPeVUBM90() {
        return PASSWORD_STEP;
    }

    /* renamed from: getPERSONAL_INFO_STEP-eVUBM90, reason: not valid java name */
    public final java.lang.String m16279getPERSONAL_INFO_STEPeVUBM90() {
        return PERSONAL_INFO_STEP;
    }

    /* renamed from: getADDITIONAL_INFO_STEP-eVUBM90, reason: not valid java name */
    public final java.lang.String m16275getADDITIONAL_INFO_STEPeVUBM90() {
        return ADDITIONAL_INFO_STEP;
    }

    /* renamed from: getADDRESS_INFO_STEP-eVUBM90, reason: not valid java name */
    public final java.lang.String m16276getADDRESS_INFO_STEPeVUBM90() {
        return ADDRESS_INFO_STEP;
    }
}
