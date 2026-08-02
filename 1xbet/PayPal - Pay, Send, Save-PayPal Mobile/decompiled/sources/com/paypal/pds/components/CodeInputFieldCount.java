package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/pds/components/CodeInputFieldCount;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, com.visa.cbp.getEncExpo.warmup, "getCount", "()I", "THREE", "FOUR", "FIVE", "SIX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CodeInputFieldCount {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.CodeInputFieldCount FIVE;
    public static final com.paypal.pds.components.CodeInputFieldCount FOUR;
    public static final com.paypal.pds.components.CodeInputFieldCount SIX;
    public static final com.paypal.pds.components.CodeInputFieldCount THREE;
    private static final /* synthetic */ com.paypal.pds.components.CodeInputFieldCount[] getHighSpeedVideoFpsRangesFor;
    private final int count;

    private CodeInputFieldCount(java.lang.String str, int i, int i2) {
        this.count = i2;
    }

    public final int getCount() {
        return this.count;
    }

    static {
        com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount = new com.paypal.pds.components.CodeInputFieldCount("THREE", 0, 3);
        THREE = codeInputFieldCount;
        com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount2 = new com.paypal.pds.components.CodeInputFieldCount("FOUR", 1, 4);
        FOUR = codeInputFieldCount2;
        com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount3 = new com.paypal.pds.components.CodeInputFieldCount("FIVE", 2, 5);
        FIVE = codeInputFieldCount3;
        com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount4 = new com.paypal.pds.components.CodeInputFieldCount("SIX", 3, 6);
        SIX = codeInputFieldCount4;
        com.paypal.pds.components.CodeInputFieldCount[] codeInputFieldCountArr = {codeInputFieldCount, codeInputFieldCount2, codeInputFieldCount3, codeInputFieldCount4};
        getHighSpeedVideoFpsRangesFor = codeInputFieldCountArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(codeInputFieldCountArr);
    }

    public static com.paypal.pds.components.CodeInputFieldCount[] values() {
        return (com.paypal.pds.components.CodeInputFieldCount[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.pds.components.CodeInputFieldCount valueOf(java.lang.String str) {
        return (com.paypal.pds.components.CodeInputFieldCount) java.lang.Enum.valueOf(com.paypal.pds.components.CodeInputFieldCount.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.CodeInputFieldCount> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
