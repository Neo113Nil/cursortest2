package com.paypal.android.threeds.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/TrustListStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "TRUST_LISTED", "NOT_TRUST_LISTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TrustListStatus {
    private static final /* synthetic */ com.paypal.android.threeds.data.model.TrustListStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.android.threeds.data.model.TrustListStatus NOT_TRUST_LISTED;
    public static final com.paypal.android.threeds.data.model.TrustListStatus TRUST_LISTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private TrustListStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.android.threeds.data.model.TrustListStatus trustListStatus = new com.paypal.android.threeds.data.model.TrustListStatus("TRUST_LISTED", 0, "Y");
        TRUST_LISTED = trustListStatus;
        com.paypal.android.threeds.data.model.TrustListStatus trustListStatus2 = new com.paypal.android.threeds.data.model.TrustListStatus("NOT_TRUST_LISTED", 1, "N");
        NOT_TRUST_LISTED = trustListStatus2;
        com.paypal.android.threeds.data.model.TrustListStatus[] trustListStatusArr = {trustListStatus, trustListStatus2};
        Camera2StreamConfigurationMap = trustListStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(trustListStatusArr);
    }

    public static com.paypal.android.threeds.data.model.TrustListStatus[] values() {
        return (com.paypal.android.threeds.data.model.TrustListStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.android.threeds.data.model.TrustListStatus valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.data.model.TrustListStatus) java.lang.Enum.valueOf(com.paypal.android.threeds.data.model.TrustListStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.data.model.TrustListStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
