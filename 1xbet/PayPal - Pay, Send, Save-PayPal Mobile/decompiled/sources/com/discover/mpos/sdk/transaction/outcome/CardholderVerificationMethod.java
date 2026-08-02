package com.discover.mpos.sdk.transaction.outcome;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/CardholderVerificationMethod;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "ONLINE_PIN", "CONFIRMATION_CODE_VERIFIED", "SIGNATURE", "NO_CVM", "N_A"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public enum CardholderVerificationMethod {
    ONLINE_PIN("Online PIN"),
    CONFIRMATION_CODE_VERIFIED("Confirmation Code Verified"),
    SIGNATURE("Obtain Signature"),
    NO_CVM("No CVM"),
    N_A(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);

    private final java.lang.String value;

    CardholderVerificationMethod(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.value;
    }
}
