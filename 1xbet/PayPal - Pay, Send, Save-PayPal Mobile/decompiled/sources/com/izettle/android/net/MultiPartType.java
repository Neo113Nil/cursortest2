package com.izettle.android.net;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/izettle/android/net/MultiPartType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class MultiPartType {
    private static final /* synthetic */ com.izettle.android.net.MultiPartType[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final com.izettle.android.net.MultiPartType getHighSpeedVideoFpsRanges;
    public static final com.izettle.android.net.MultiPartType getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;

    static {
        com.izettle.android.net.MultiPartType multiPartType = new com.izettle.android.net.MultiPartType("FORM_DATA", 0, "form-data");
        getHighSpeedVideoFpsRanges = multiPartType;
        com.izettle.android.net.MultiPartType multiPartType2 = new com.izettle.android.net.MultiPartType("RELATED", 1, "related");
        getHighSpeedVideoFpsRangesFor = multiPartType2;
        com.izettle.android.net.MultiPartType[] multiPartTypeArr = {multiPartType, multiPartType2};
        Camera2StreamConfigurationMap = multiPartTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(multiPartTypeArr);
    }

    private MultiPartType(java.lang.String str, int i, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = str2;
    }

    public static com.izettle.android.net.MultiPartType[] values() {
        return (com.izettle.android.net.MultiPartType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.izettle.android.net.MultiPartType valueOf(java.lang.String str) {
        return (com.izettle.android.net.MultiPartType) java.lang.Enum.valueOf(com.izettle.android.net.MultiPartType.class, str);
    }
}
