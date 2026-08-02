package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscriptionBackendSnapshot;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "deviceId", "cloudIdentity", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/model/TokenSubscriptionBackendSnapshot;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToken", "Z", "getConsent", "getDeviceId", "getCloudIdentity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TokenSubscriptionBackendSnapshot {
    public static final int $stable = 0;
    private final java.lang.String cloudIdentity;
    private final boolean consent;
    private final java.lang.String deviceId;
    private final java.lang.String token;

    public TokenSubscriptionBackendSnapshot(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.token = str;
        this.consent = z;
        this.deviceId = str2;
        this.cloudIdentity = str3;
    }

    public /* synthetic */ TokenSubscriptionBackendSnapshot(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final boolean getConsent() {
        return this.consent;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getCloudIdentity() {
        return this.cloudIdentity;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.token;
        boolean z = this.consent;
        java.lang.String str2 = this.deviceId;
        java.lang.String str3 = this.cloudIdentity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenSubscriptionBackendSnapshot(token=");
        sb.append(str);
        sb.append(", consent=");
        sb.append(z);
        sb.append(", deviceId=");
        sb.append(str2);
        sb.append(", cloudIdentity=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.consent);
        int hashCode3 = this.deviceId.hashCode();
        java.lang.String str = this.cloudIdentity;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, tokenSubscriptionBackendSnapshot.token) && this.consent == tokenSubscriptionBackendSnapshot.consent && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, tokenSubscriptionBackendSnapshot.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudIdentity, tokenSubscriptionBackendSnapshot.cloudIdentity);
    }

    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot copy(java.lang.String token, boolean consent, java.lang.String deviceId, java.lang.String cloudIdentity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot(token, consent, deviceId, cloudIdentity);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCloudIdentity() {
        return this.cloudIdentity;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getConsent() {
        return this.consent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot copy$default(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.model.TokenSubscriptionBackendSnapshot tokenSubscriptionBackendSnapshot, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tokenSubscriptionBackendSnapshot.token;
        }
        if ((i & 2) != 0) {
            z = tokenSubscriptionBackendSnapshot.consent;
        }
        if ((i & 4) != 0) {
            str2 = tokenSubscriptionBackendSnapshot.deviceId;
        }
        if ((i & 8) != 0) {
            str3 = tokenSubscriptionBackendSnapshot.cloudIdentity;
        }
        return tokenSubscriptionBackendSnapshot.copy(str, z, str2, str3);
    }
}
