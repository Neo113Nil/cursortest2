package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;", "", "<init>", "(Ljava/lang/String;I)V", "CUSTOMER_SERVICE", "DIGITAL", "INTERACTIVE_VOICE_RESPONSE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RepaymentChannel {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel CUSTOMER_SERVICE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel DIGITAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel INTERACTIVE_VOICE_RESPONSE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel[] getHighSpeedVideoFpsRanges;

    private RepaymentChannel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel("CUSTOMER_SERVICE", 0);
        CUSTOMER_SERVICE = repaymentChannel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel("DIGITAL", 1);
        DIGITAL = repaymentChannel2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel("INTERACTIVE_VOICE_RESPONSE", 2);
        INTERACTIVE_VOICE_RESPONSE = repaymentChannel3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel("UNKNOWN", 3);
        UNKNOWN = repaymentChannel4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel[] repaymentChannelArr = {repaymentChannel, repaymentChannel2, repaymentChannel3, repaymentChannel4};
        getHighSpeedVideoFpsRanges = repaymentChannelArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(repaymentChannelArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
