package com.paypal.oslo.feature.userprofile.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "", "", "webBaseUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getWebBaseUrl", "getNameEditUrl", "nameEditUrl", "getEmailManagementUrl", "emailManagementUrl", "getPhoneManagementUrl", "phoneManagementUrl", "getAddressManagementUrl", "addressManagementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserProfileConfig {
    public static final int $stable = 0;
    private final java.lang.String webBaseUrl;

    public UserProfileConfig(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.webBaseUrl = str;
    }

    public final java.lang.String getWebBaseUrl() {
        return this.webBaseUrl;
    }

    public final java.lang.String getNameEditUrl() {
        java.lang.String str = this.webBaseUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/myaccount/profile/name-edit");
        return sb.toString();
    }

    public final java.lang.String getEmailManagementUrl() {
        java.lang.String str = this.webBaseUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/myaccount/profile/email/list");
        return sb.toString();
    }

    public final java.lang.String getPhoneManagementUrl() {
        java.lang.String str = this.webBaseUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/myaccount/profile/getPhones");
        return sb.toString();
    }

    public final java.lang.String getAddressManagementUrl() {
        java.lang.String str = this.webBaseUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/myaccount/profile/flow/addresses?flow=cmV0dXJuVXJsPS9teWFjY291bnQvcHJvZmlsZSZjYW5jZWxVcmw9L215YWNjb3VudC9wcm9maWxl");
        return sb.toString();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.webBaseUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfileConfig(webBaseUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.webBaseUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.userprofile.config.UserProfileConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.webBaseUrl, ((com.paypal.oslo.feature.userprofile.config.UserProfileConfig) other).webBaseUrl);
    }

    public final com.paypal.oslo.feature.userprofile.config.UserProfileConfig copy(java.lang.String webBaseUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webBaseUrl, "");
        return new com.paypal.oslo.feature.userprofile.config.UserProfileConfig(webBaseUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWebBaseUrl() {
        return this.webBaseUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.config.UserProfileConfig copy$default(com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userProfileConfig.webBaseUrl;
        }
        return userProfileConfig.copy(str);
    }
}
