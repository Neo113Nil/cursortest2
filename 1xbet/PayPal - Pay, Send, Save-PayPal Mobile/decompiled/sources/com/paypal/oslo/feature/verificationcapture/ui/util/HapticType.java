package com.paypal.oslo.feature.verificationcapture.ui.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/util/HapticType;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "WARNING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HapticType {
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.HapticType ERROR;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.HapticType SUCCESS;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.HapticType WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.HapticType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private HapticType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.util.HapticType hapticType = new com.paypal.oslo.feature.verificationcapture.ui.util.HapticType("SUCCESS", 0);
        SUCCESS = hapticType;
        com.paypal.oslo.feature.verificationcapture.ui.util.HapticType hapticType2 = new com.paypal.oslo.feature.verificationcapture.ui.util.HapticType("ERROR", 1);
        ERROR = hapticType2;
        com.paypal.oslo.feature.verificationcapture.ui.util.HapticType hapticType3 = new com.paypal.oslo.feature.verificationcapture.ui.util.HapticType("WARNING", 2);
        WARNING = hapticType3;
        com.paypal.oslo.feature.verificationcapture.ui.util.HapticType[] hapticTypeArr = {hapticType, hapticType2, hapticType3};
        getHighSpeedVideoFpsRanges = hapticTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(hapticTypeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.HapticType[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.HapticType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.HapticType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.HapticType) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.util.HapticType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.util.HapticType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
