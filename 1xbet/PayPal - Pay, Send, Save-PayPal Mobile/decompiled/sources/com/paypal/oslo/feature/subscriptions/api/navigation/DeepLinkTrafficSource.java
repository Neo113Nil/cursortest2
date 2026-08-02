package com.paypal.oslo.feature.subscriptions.api.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/navigation/DeepLinkTrafficSource;", "", "", "p0", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "raw", "Ljava/lang/String;", "getRaw", "()Ljava/lang/String;", "InApp"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeepLinkTrafficSource {
    public static final com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource InApp;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource[] getHighSpeedVideoSizes;
    private final java.lang.String raw;

    private DeepLinkTrafficSource(java.lang.String str, java.lang.String str2) {
        this.raw = str2;
    }

    public final java.lang.String getRaw() {
        return this.raw;
    }

    static {
        com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource deepLinkTrafficSource = new com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource("InApp", "in-app");
        InApp = deepLinkTrafficSource;
        com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource[] deepLinkTrafficSourceArr = {deepLinkTrafficSource};
        getHighSpeedVideoSizes = deepLinkTrafficSourceArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(deepLinkTrafficSourceArr);
    }

    public static com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource[] values() {
        return (com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
