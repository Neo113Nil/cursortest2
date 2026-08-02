package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/payair/logic/remote/model/ResponseRequestAuthenticationCodeDto;", "Lcom/payair/hce/communication/JsonResponse;", "", "maxOTPVerificationAllowed", "maxOTPRequestsAllowed", "codeExpiration", "threeDSecureActivationUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/ResponseRequestAuthenticationCodeDto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCodeExpiration", "getMaxOTPRequestsAllowed", "getMaxOTPVerificationAllowed", "getThreeDSecureActivationUrl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ResponseRequestAuthenticationCodeDto extends com.payair.hce.communication.JsonResponse {
    private final java.lang.String codeExpiration;
    private final java.lang.String maxOTPRequestsAllowed;
    private final java.lang.String maxOTPVerificationAllowed;
    private final java.lang.String threeDSecureActivationUrl;

    public ResponseRequestAuthenticationCodeDto() {
        this(null, null, null, null, 15, null);
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

    public /* synthetic */ ResponseRequestAuthenticationCodeDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public ResponseRequestAuthenticationCodeDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.maxOTPVerificationAllowed = str;
        this.maxOTPRequestsAllowed = str2;
        this.codeExpiration = str3;
        this.threeDSecureActivationUrl = str4;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.lang.String str = this.maxOTPVerificationAllowed;
        java.lang.String str2 = this.maxOTPRequestsAllowed;
        java.lang.String str3 = this.codeExpiration;
        java.lang.String str4 = this.threeDSecureActivationUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseRequestAuthenticationCodeDto(maxOTPVerificationAllowed=");
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
        if (!(other instanceof com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto)) {
            return false;
        }
        com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto responseRequestAuthenticationCodeDto = (com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.maxOTPVerificationAllowed, responseRequestAuthenticationCodeDto.maxOTPVerificationAllowed) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxOTPRequestsAllowed, responseRequestAuthenticationCodeDto.maxOTPRequestsAllowed) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeExpiration, responseRequestAuthenticationCodeDto.codeExpiration) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureActivationUrl, responseRequestAuthenticationCodeDto.threeDSecureActivationUrl);
    }

    public final com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto copy(java.lang.String maxOTPVerificationAllowed, java.lang.String maxOTPRequestsAllowed, java.lang.String codeExpiration, java.lang.String threeDSecureActivationUrl) {
        return new com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto(maxOTPVerificationAllowed, maxOTPRequestsAllowed, codeExpiration, threeDSecureActivationUrl);
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

    public static /* synthetic */ com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto copy$default(com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto responseRequestAuthenticationCodeDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = responseRequestAuthenticationCodeDto.maxOTPVerificationAllowed;
        }
        if ((i & 2) != 0) {
            str2 = responseRequestAuthenticationCodeDto.maxOTPRequestsAllowed;
        }
        if ((i & 4) != 0) {
            str3 = responseRequestAuthenticationCodeDto.codeExpiration;
        }
        if ((i & 8) != 0) {
            str4 = responseRequestAuthenticationCodeDto.threeDSecureActivationUrl;
        }
        return responseRequestAuthenticationCodeDto.copy(str, str2, str3, str4);
    }
}
