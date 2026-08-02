package com.paypal.oslo.core.navigation.scene;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/DismissType;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DismissType {
    public static final com.paypal.oslo.core.navigation.scene.DismissType Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.navigation.scene.DismissType getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.core.navigation.scene.DismissType getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.core.navigation.scene.DismissType getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final /* synthetic */ com.paypal.oslo.core.navigation.scene.DismissType[] getHighSpeedVideoSizesFor;

    static {
        com.paypal.oslo.core.navigation.scene.DismissType dismissType = new com.paypal.oslo.core.navigation.scene.DismissType("NONE", 0);
        getHighSpeedVideoFpsRangesFor = dismissType;
        com.paypal.oslo.core.navigation.scene.DismissType dismissType2 = new com.paypal.oslo.core.navigation.scene.DismissType("SCRIM", 1);
        Camera2StreamConfigurationMap = dismissType2;
        com.paypal.oslo.core.navigation.scene.DismissType dismissType3 = new com.paypal.oslo.core.navigation.scene.DismissType(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 2);
        getHighSpeedVideoFpsRanges = dismissType3;
        com.paypal.oslo.core.navigation.scene.DismissType dismissType4 = new com.paypal.oslo.core.navigation.scene.DismissType(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, 3);
        getHighResolutionOutputSizeshNQ4ISI = dismissType4;
        com.paypal.oslo.core.navigation.scene.DismissType[] dismissTypeArr = {dismissType, dismissType2, dismissType3, dismissType4};
        getHighSpeedVideoSizesFor = dismissTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(dismissTypeArr);
    }

    private DismissType(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.core.navigation.scene.DismissType[] values() {
        return (com.paypal.oslo.core.navigation.scene.DismissType[]) getHighSpeedVideoSizesFor.clone();
    }

    public static com.paypal.oslo.core.navigation.scene.DismissType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.navigation.scene.DismissType) java.lang.Enum.valueOf(com.paypal.oslo.core.navigation.scene.DismissType.class, str);
    }
}
