package com.paypal.oslo.feature.consumerprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "PARTIAL", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConsentType {
    public static final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType DENY;
    public static final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType FULL;
    public static final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType PARTIAL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType[] getHighSpeedVideoSizes;

    private ConsentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType = new com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType("FULL", 0);
        FULL = consentType;
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType2 = new com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType("PARTIAL", 1);
        PARTIAL = consentType2;
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType3 = new com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, 2);
        DENY = consentType3;
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType[] consentTypeArr = {consentType, consentType2, consentType3};
        getHighSpeedVideoSizes = consentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(consentTypeArr);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType[] values() {
        return (com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
