package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "PAYMENT_CANCELED", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultKey {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey NONE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey PAYMENT_CANCELED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String key;

    private ResultKey(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey("PAYMENT_CANCELED", 0, "payment_canceled");
        PAYMENT_CANCELED = resultKey;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey2 = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey("NONE", 1, "none");
        NONE = resultKey2;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey[] resultKeyArr = {resultKey, resultKey2};
        Camera2StreamConfigurationMap = resultKeyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(resultKeyArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
