package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TimerEventType;", "", "<init>", "(Ljava/lang/String;I)V", "START", "PAUSE", "RESUME", "STOP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimerEventType {
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType PAUSE;
    public static final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType RESUME;
    public static final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType START;
    public static final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType STOP;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TimerEventType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType("START", 0);
        START = timerEventType;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType2 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType("PAUSE", 1);
        PAUSE = timerEventType2;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType3 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType("RESUME", 2);
        RESUME = timerEventType3;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType timerEventType4 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType("STOP", 3);
        STOP = timerEventType4;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType[] timerEventTypeArr = {timerEventType, timerEventType2, timerEventType3, timerEventType4};
        Camera2StreamConfigurationMap = timerEventTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(timerEventTypeArr);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType[] values() {
        return (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimerEventType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
