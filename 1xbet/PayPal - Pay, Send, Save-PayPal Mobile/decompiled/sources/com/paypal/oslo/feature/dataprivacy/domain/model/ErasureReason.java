package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureReason;", "", "<init>", "(Ljava/lang/String;I)V", "ANOTHER_ACCOUNT", "DONT_USE_ACCOUNT", "PRIVACY_CONCERN", "TOO_MANY_EMAILS", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureReason {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason ANOTHER_ACCOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason DONT_USE_ACCOUNT;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason OTHER;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason PRIVACY_CONCERN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason TOO_MANY_EMAILS;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason[] getHighSpeedVideoFpsRanges;

    private ErasureReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason("ANOTHER_ACCOUNT", 0);
        ANOTHER_ACCOUNT = erasureReason;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason2 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason("DONT_USE_ACCOUNT", 1);
        DONT_USE_ACCOUNT = erasureReason2;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason3 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason("PRIVACY_CONCERN", 2);
        PRIVACY_CONCERN = erasureReason3;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason4 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason("TOO_MANY_EMAILS", 3);
        TOO_MANY_EMAILS = erasureReason4;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason5 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason("OTHER", 4);
        OTHER = erasureReason5;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason[] erasureReasonArr = {erasureReason, erasureReason2, erasureReason3, erasureReason4, erasureReason5};
        getHighSpeedVideoFpsRanges = erasureReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(erasureReasonArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
