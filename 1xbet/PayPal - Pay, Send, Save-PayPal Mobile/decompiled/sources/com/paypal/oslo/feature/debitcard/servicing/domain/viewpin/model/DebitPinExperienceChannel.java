package com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinExperienceChannel;", "", "<init>", "(Ljava/lang/String;I)V", "OSLO", com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitPinExperienceChannel {
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel OSLO;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel UNKNOWN;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel VENICE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DebitPinExperienceChannel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel("OSLO", 0);
        OSLO = debitPinExperienceChannel;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel2 = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel(com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE, 1);
        VENICE = debitPinExperienceChannel2;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel3 = new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel("UNKNOWN", 2);
        UNKNOWN = debitPinExperienceChannel3;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel[] debitPinExperienceChannelArr = {debitPinExperienceChannel, debitPinExperienceChannel2, debitPinExperienceChannel3};
        Camera2StreamConfigurationMap = debitPinExperienceChannelArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(debitPinExperienceChannelArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
