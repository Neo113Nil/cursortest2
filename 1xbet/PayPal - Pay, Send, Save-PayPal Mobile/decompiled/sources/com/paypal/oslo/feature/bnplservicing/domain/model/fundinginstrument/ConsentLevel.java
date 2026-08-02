package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/ConsentLevel;", "", "<init>", "(Ljava/lang/String;)V", "CUSTOMER_CONSENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConsentLevel {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel CUSTOMER_CONSENT;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ConsentLevel(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel consentLevel = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel("CUSTOMER_CONSENT");
        CUSTOMER_CONSENT = consentLevel;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel[] consentLevelArr = {consentLevel};
        getHighResolutionOutputSizeshNQ4ISI = consentLevelArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(consentLevelArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.ConsentLevel> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
