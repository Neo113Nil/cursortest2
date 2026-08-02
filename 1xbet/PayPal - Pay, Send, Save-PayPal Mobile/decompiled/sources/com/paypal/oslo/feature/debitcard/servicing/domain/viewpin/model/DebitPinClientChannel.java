package com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinClientChannel;", "", "<init>", "(Ljava/lang/String;I)V", "MOBILE", "WEB", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitPinClientChannel {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel MOBILE;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel UNKNOWN;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel WEB;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel[] getHighSpeedVideoSizes;

    private DebitPinClientChannel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel("MOBILE", 0);
        MOBILE = debitPinClientChannel;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel2 = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel("WEB", 1);
        WEB = debitPinClientChannel2;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel3 = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel("UNKNOWN", 2);
        UNKNOWN = debitPinClientChannel3;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel[] debitPinClientChannelArr = {debitPinClientChannel, debitPinClientChannel2, debitPinClientChannel3};
        getHighSpeedVideoSizes = debitPinClientChannelArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitPinClientChannelArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
