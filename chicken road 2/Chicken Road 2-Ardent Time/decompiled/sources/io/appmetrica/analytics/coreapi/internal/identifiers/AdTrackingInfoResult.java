package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdTrackingInfoResult {
    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo mAdTrackingInfo;
    public final java.lang.String mErrorExplanation;
    public final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus mStatus;

    public AdTrackingInfoResult() {
        this(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "identifier info has never been updated");
    }

    public static io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult getProviderUnavailableResult(java.lang.String str) {
        return new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, str);
    }

    public boolean isValid() {
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo = this.mAdTrackingInfo;
        return (adTrackingInfo == null || android.text.TextUtils.isEmpty(adTrackingInfo.advId)) ? false : true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb.append(this.mAdTrackingInfo);
        sb.append(", mStatus=");
        sb.append(this.mStatus);
        sb.append(", mErrorExplanation='");
        return B1.a.j(sb, this.mErrorExplanation, "'}");
    }

    public AdTrackingInfoResult(io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus, java.lang.String str) {
        this.mAdTrackingInfo = adTrackingInfo;
        this.mStatus = identifierStatus;
        this.mErrorExplanation = str;
    }
}
