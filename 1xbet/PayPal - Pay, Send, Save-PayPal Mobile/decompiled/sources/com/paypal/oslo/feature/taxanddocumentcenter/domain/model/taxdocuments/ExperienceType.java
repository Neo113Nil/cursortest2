package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "baseKey", "Ljava/lang/String;", "getBaseKey", "()Ljava/lang/String;", "NOT_AVAILABLE", "PENDING_REVIEW", "NOT_ELIGIBLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExperienceType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType NOT_AVAILABLE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType NOT_ELIGIBLE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType PENDING_REVIEW;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String baseKey;

    private ExperienceType(java.lang.String str, int i, java.lang.String str2) {
        this.baseKey = str2;
    }

    public final java.lang.String getBaseKey() {
        return this.baseKey;
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType("NOT_AVAILABLE", 0, "not_available_message");
        NOT_AVAILABLE = experienceType;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType("PENDING_REVIEW", 1, "pending_review_message");
        PENDING_REVIEW = experienceType2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType("NOT_ELIGIBLE", 2, null);
        NOT_ELIGIBLE = experienceType3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType[] experienceTypeArr = {experienceType, experienceType2, experienceType3};
        getHighSpeedVideoFpsRangesFor = experienceTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(experienceTypeArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
