package com.paypal.android.threeds.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/android/threeds/data/model/RequestorChallengePreference;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "NO_CHALLENGE_REQUESTED", "CHALLENGE_REQUESTED_PREFERENCE", "NO_CHALLENGE_REQUESTED_TRA", "NO_CHALLENGE_REQUESTED_SCA", "NO_CHALLENGE_REQUESTED_TRUST_LIST", "CHALLENGE_REQUESTED_TRUST_LIST"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RequestorChallengePreference {
    public static final com.paypal.android.threeds.data.model.RequestorChallengePreference CHALLENGE_REQUESTED_PREFERENCE;
    public static final com.paypal.android.threeds.data.model.RequestorChallengePreference CHALLENGE_REQUESTED_TRUST_LIST;
    public static final com.paypal.android.threeds.data.model.RequestorChallengePreference NO_CHALLENGE_REQUESTED;
    public static final com.paypal.android.threeds.data.model.RequestorChallengePreference NO_CHALLENGE_REQUESTED_SCA;
    public static final com.paypal.android.threeds.data.model.RequestorChallengePreference NO_CHALLENGE_REQUESTED_TRA;
    public static final com.paypal.android.threeds.data.model.RequestorChallengePreference NO_CHALLENGE_REQUESTED_TRUST_LIST;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.android.threeds.data.model.RequestorChallengePreference[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private RequestorChallengePreference(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.android.threeds.data.model.RequestorChallengePreference requestorChallengePreference = new com.paypal.android.threeds.data.model.RequestorChallengePreference("NO_CHALLENGE_REQUESTED", 0, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD);
        NO_CHALLENGE_REQUESTED = requestorChallengePreference;
        com.paypal.android.threeds.data.model.RequestorChallengePreference requestorChallengePreference2 = new com.paypal.android.threeds.data.model.RequestorChallengePreference("CHALLENGE_REQUESTED_PREFERENCE", 1, "03");
        CHALLENGE_REQUESTED_PREFERENCE = requestorChallengePreference2;
        com.paypal.android.threeds.data.model.RequestorChallengePreference requestorChallengePreference3 = new com.paypal.android.threeds.data.model.RequestorChallengePreference("NO_CHALLENGE_REQUESTED_TRA", 2, "05");
        NO_CHALLENGE_REQUESTED_TRA = requestorChallengePreference3;
        com.paypal.android.threeds.data.model.RequestorChallengePreference requestorChallengePreference4 = new com.paypal.android.threeds.data.model.RequestorChallengePreference("NO_CHALLENGE_REQUESTED_SCA", 3, "07");
        NO_CHALLENGE_REQUESTED_SCA = requestorChallengePreference4;
        com.paypal.android.threeds.data.model.RequestorChallengePreference requestorChallengePreference5 = new com.paypal.android.threeds.data.model.RequestorChallengePreference("NO_CHALLENGE_REQUESTED_TRUST_LIST", 4, "08");
        NO_CHALLENGE_REQUESTED_TRUST_LIST = requestorChallengePreference5;
        com.paypal.android.threeds.data.model.RequestorChallengePreference requestorChallengePreference6 = new com.paypal.android.threeds.data.model.RequestorChallengePreference("CHALLENGE_REQUESTED_TRUST_LIST", 5, "09");
        CHALLENGE_REQUESTED_TRUST_LIST = requestorChallengePreference6;
        com.paypal.android.threeds.data.model.RequestorChallengePreference[] requestorChallengePreferenceArr = {requestorChallengePreference, requestorChallengePreference2, requestorChallengePreference3, requestorChallengePreference4, requestorChallengePreference5, requestorChallengePreference6};
        getHighSpeedVideoFpsRangesFor = requestorChallengePreferenceArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(requestorChallengePreferenceArr);
    }

    public static com.paypal.android.threeds.data.model.RequestorChallengePreference[] values() {
        return (com.paypal.android.threeds.data.model.RequestorChallengePreference[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.android.threeds.data.model.RequestorChallengePreference valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.data.model.RequestorChallengePreference) java.lang.Enum.valueOf(com.paypal.android.threeds.data.model.RequestorChallengePreference.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.data.model.RequestorChallengePreference> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
