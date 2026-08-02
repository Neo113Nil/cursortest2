package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/SpaceIndex;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "ACCOUNT_NUMBER", "ROUTING_NUMBER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SpaceIndex {
    public static final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex ACCOUNT_NUMBER;
    private static final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex ROUTING_NUMBER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final int value;

    private SpaceIndex(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex spaceIndex = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex("ACCOUNT_NUMBER", 0, 4);
        ACCOUNT_NUMBER = spaceIndex;
        com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex spaceIndex2 = new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex("ROUTING_NUMBER", 1, 3);
        ROUTING_NUMBER = spaceIndex2;
        com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex[] spaceIndexArr = {spaceIndex, spaceIndex2};
        Camera2StreamConfigurationMap = spaceIndexArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(spaceIndexArr);
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex[] values() {
        return (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex) java.lang.Enum.valueOf(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
