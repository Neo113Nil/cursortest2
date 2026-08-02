package com.paypal.oslo.feature.verificationcapture.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultType;", "", "<init>", "(Ljava/lang/String;I)V", "FILE", "WEB", "VP_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResultType {
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultType FILE;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultType VP_ID;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultType WEB;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.ResultType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ResultType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultType("FILE", 0);
        FILE = resultType;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType2 = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultType("WEB", 1);
        WEB = resultType2;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType3 = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultType("VP_ID", 2);
        VP_ID = resultType3;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType[] resultTypeArr = {resultType, resultType2, resultType3};
        getHighResolutionOutputSizeshNQ4ISI = resultTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(resultTypeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.ResultType[] values() {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.ResultType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.ResultType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.ResultType) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.domain.model.ResultType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
