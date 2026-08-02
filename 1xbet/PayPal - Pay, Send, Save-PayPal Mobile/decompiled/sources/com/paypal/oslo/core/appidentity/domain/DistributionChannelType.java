package com.paypal.oslo.core.appidentity.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DistributionChannelType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PLAYSTORE", "DEVELOPMENT", "ENTERPRISE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistributionChannelType {
    private static final /* synthetic */ com.paypal.oslo.core.appidentity.domain.DistributionChannelType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.appidentity.domain.DistributionChannelType DEVELOPMENT;
    public static final com.paypal.oslo.core.appidentity.domain.DistributionChannelType ENTERPRISE;
    public static final com.paypal.oslo.core.appidentity.domain.DistributionChannelType PLAYSTORE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private DistributionChannelType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.core.appidentity.domain.DistributionChannelType distributionChannelType = new com.paypal.oslo.core.appidentity.domain.DistributionChannelType("PLAYSTORE", 0, "playstore");
        PLAYSTORE = distributionChannelType;
        com.paypal.oslo.core.appidentity.domain.DistributionChannelType distributionChannelType2 = new com.paypal.oslo.core.appidentity.domain.DistributionChannelType("DEVELOPMENT", 1, "development");
        DEVELOPMENT = distributionChannelType2;
        com.paypal.oslo.core.appidentity.domain.DistributionChannelType distributionChannelType3 = new com.paypal.oslo.core.appidentity.domain.DistributionChannelType("ENTERPRISE", 2, "enterprise");
        ENTERPRISE = distributionChannelType3;
        com.paypal.oslo.core.appidentity.domain.DistributionChannelType[] distributionChannelTypeArr = {distributionChannelType, distributionChannelType2, distributionChannelType3};
        Camera2StreamConfigurationMap = distributionChannelTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(distributionChannelTypeArr);
    }

    public static com.paypal.oslo.core.appidentity.domain.DistributionChannelType[] values() {
        return (com.paypal.oslo.core.appidentity.domain.DistributionChannelType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.appidentity.domain.DistributionChannelType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.appidentity.domain.DistributionChannelType) java.lang.Enum.valueOf(com.paypal.oslo.core.appidentity.domain.DistributionChannelType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.appidentity.domain.DistributionChannelType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
