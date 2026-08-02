package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;", "", "<init>", "(Ljava/lang/String;I)V", "LOW_RISK", "MEDIUM_RISK", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScamRiskLevel {
    public static final com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel LOW_RISK;
    public static final com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel MEDIUM_RISK;
    public static final com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel[] getHighSpeedVideoFpsRangesFor;

    private ScamRiskLevel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel = new com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel("LOW_RISK", 0);
        LOW_RISK = scamRiskLevel;
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel2 = new com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel("MEDIUM_RISK", 1);
        MEDIUM_RISK = scamRiskLevel2;
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel3 = new com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel("UNKNOWN", 2);
        UNKNOWN = scamRiskLevel3;
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel[] scamRiskLevelArr = {scamRiskLevel, scamRiskLevel2, scamRiskLevel3};
        getHighSpeedVideoFpsRangesFor = scamRiskLevelArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(scamRiskLevelArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
