package com.paypal.oslo.feature.identity.analytics.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/domain/ErrorSource;", "", "", "p0", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "AuthAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSource {
    public static final com.paypal.oslo.feature.identity.analytics.domain.ErrorSource AuthAttempt;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.analytics.domain.ErrorSource[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private ErrorSource(java.lang.String str, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.analytics.domain.ErrorSource errorSource = new com.paypal.oslo.feature.identity.analytics.domain.ErrorSource("AuthAttempt", "auth_attempt");
        AuthAttempt = errorSource;
        com.paypal.oslo.feature.identity.analytics.domain.ErrorSource[] errorSourceArr = {errorSource};
        getHighSpeedVideoFpsRanges = errorSourceArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(errorSourceArr);
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.ErrorSource[] values() {
        return (com.paypal.oslo.feature.identity.analytics.domain.ErrorSource[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.ErrorSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.analytics.domain.ErrorSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.analytics.domain.ErrorSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.analytics.domain.ErrorSource> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
