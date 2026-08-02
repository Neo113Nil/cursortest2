package com.paypal.oslo.feature.verificationcapture.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", com.zettle.sdk.commons.network.JsonKt.KEY_REFUND_RESULT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL, "TIMEOUT", "FAILURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResultStatusCode {
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode CANCEL;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode FAILURE;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode RESULT;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode TIMEOUT;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ResultStatusCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode("UNKNOWN", 0);
        UNKNOWN = resultStatusCode;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode2 = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode(com.zettle.sdk.commons.network.JsonKt.KEY_REFUND_RESULT, 1);
        RESULT = resultStatusCode2;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode3 = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL, 2);
        CANCEL = resultStatusCode3;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode4 = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode("TIMEOUT", 3);
        TIMEOUT = resultStatusCode4;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode5 = new com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode("FAILURE", 4);
        FAILURE = resultStatusCode5;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode[] resultStatusCodeArr = {resultStatusCode, resultStatusCode2, resultStatusCode3, resultStatusCode4, resultStatusCode5};
        getHighResolutionOutputSizeshNQ4ISI = resultStatusCodeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(resultStatusCodeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode[] values() {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
