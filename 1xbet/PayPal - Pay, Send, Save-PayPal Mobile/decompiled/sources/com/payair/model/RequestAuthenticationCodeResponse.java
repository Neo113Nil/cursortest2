package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/model/RequestAuthenticationCodeResponse;", "", "", "maxOTPVerificationAllowed", "maxOTPRequestsAllowed", "codeExpiration", "threeDSecureActivationUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/RequestAuthenticationCodeResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCodeExpiration", "getMaxOTPRequestsAllowed", "getMaxOTPVerificationAllowed", "getThreeDSecureActivationUrl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RequestAuthenticationCodeResponse {
    private final java.lang.String codeExpiration;
    private final java.lang.String maxOTPRequestsAllowed;
    private final java.lang.String maxOTPVerificationAllowed;
    private final java.lang.String threeDSecureActivationUrl;

    public RequestAuthenticationCodeResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.maxOTPVerificationAllowed = str;
        this.maxOTPRequestsAllowed = str2;
        this.codeExpiration = str3;
        this.threeDSecureActivationUrl = str4;
    }

    public final java.lang.String getCodeExpiration() {
        return this.codeExpiration;
    }

    public final java.lang.String getMaxOTPRequestsAllowed() {
        return this.maxOTPRequestsAllowed;
    }

    public final java.lang.String getMaxOTPVerificationAllowed() {
        return this.maxOTPVerificationAllowed;
    }

    public final java.lang.String getThreeDSecureActivationUrl() {
        return this.threeDSecureActivationUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.maxOTPVerificationAllowed;
        java.lang.String str2 = this.maxOTPRequestsAllowed;
        java.lang.String str3 = this.codeExpiration;
        java.lang.String str4 = this.threeDSecureActivationUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestAuthenticationCodeResponse(maxOTPVerificationAllowed=");
        sb.append(str);
        sb.append(", maxOTPRequestsAllowed=");
        sb.append(str2);
        sb.append(", codeExpiration=");
        sb.append(str3);
        sb.append(", threeDSecureActivationUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.maxOTPVerificationAllowed;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.maxOTPRequestsAllowed;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.codeExpiration;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.threeDSecureActivationUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.RequestAuthenticationCodeResponse)) {
            return false;
        }
        com.payair.model.RequestAuthenticationCodeResponse requestAuthenticationCodeResponse = (com.payair.model.RequestAuthenticationCodeResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.maxOTPVerificationAllowed, requestAuthenticationCodeResponse.maxOTPVerificationAllowed) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxOTPRequestsAllowed, requestAuthenticationCodeResponse.maxOTPRequestsAllowed) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeExpiration, requestAuthenticationCodeResponse.codeExpiration) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureActivationUrl, requestAuthenticationCodeResponse.threeDSecureActivationUrl);
    }

    public final com.payair.model.RequestAuthenticationCodeResponse copy(java.lang.String maxOTPVerificationAllowed, java.lang.String maxOTPRequestsAllowed, java.lang.String codeExpiration, java.lang.String threeDSecureActivationUrl) {
        return new com.payair.model.RequestAuthenticationCodeResponse(maxOTPVerificationAllowed, maxOTPRequestsAllowed, codeExpiration, threeDSecureActivationUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getThreeDSecureActivationUrl() {
        return this.threeDSecureActivationUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCodeExpiration() {
        return this.codeExpiration;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMaxOTPRequestsAllowed() {
        return this.maxOTPRequestsAllowed;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMaxOTPVerificationAllowed() {
        return this.maxOTPVerificationAllowed;
    }

    public static /* synthetic */ com.payair.model.RequestAuthenticationCodeResponse copy$default(com.payair.model.RequestAuthenticationCodeResponse requestAuthenticationCodeResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestAuthenticationCodeResponse.maxOTPVerificationAllowed;
        }
        if ((i & 2) != 0) {
            str2 = requestAuthenticationCodeResponse.maxOTPRequestsAllowed;
        }
        if ((i & 4) != 0) {
            str3 = requestAuthenticationCodeResponse.codeExpiration;
        }
        if ((i & 8) != 0) {
            str4 = requestAuthenticationCodeResponse.threeDSecureActivationUrl;
        }
        return requestAuthenticationCodeResponse.copy(str, str2, str3, str4);
    }
}
