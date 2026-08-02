package com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationRequest;", "", "", "challengeId", "publicCredential", "nonce", "adsChallengeId", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getPublicCredential", "getNonce", "getAdsChallengeId", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OtpGenerationRequest {
    public static final int $stable = 0;
    private final java.lang.String adsChallengeId;
    private final java.lang.String challengeId;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent;
    private final java.lang.String nonce;
    private final java.lang.String publicCredential;

    public OtpGenerationRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.challengeId = str;
        this.publicCredential = str2;
        this.nonce = str3;
        this.adsChallengeId = str4;
        this.intent = authIntent;
    }

    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public final java.lang.String getPublicCredential() {
        return this.publicCredential;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getAdsChallengeId() {
        return this.adsChallengeId;
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.challengeId;
        java.lang.String str2 = this.publicCredential;
        java.lang.String str3 = this.nonce;
        java.lang.String str4 = this.adsChallengeId;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpGenerationRequest(challengeId=");
        sb.append(str);
        sb.append(", publicCredential=");
        sb.append(str2);
        sb.append(", nonce=");
        sb.append(str3);
        sb.append(", adsChallengeId=");
        sb.append(str4);
        sb.append(", intent=");
        sb.append(authIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.challengeId.hashCode() * 31) + this.publicCredential.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.adsChallengeId.hashCode()) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest otpGenerationRequest = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, otpGenerationRequest.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, otpGenerationRequest.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, otpGenerationRequest.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.adsChallengeId, otpGenerationRequest.adsChallengeId) && this.intent == otpGenerationRequest.intent;
    }

    public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest copy(java.lang.String challengeId, java.lang.String publicCredential, java.lang.String nonce, java.lang.String adsChallengeId, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsChallengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest(challengeId, publicCredential, nonce, adsChallengeId, intent);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAdsChallengeId() {
        return this.adsChallengeId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPublicCredential() {
        return this.publicCredential;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest copy$default(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest otpGenerationRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = otpGenerationRequest.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = otpGenerationRequest.publicCredential;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = otpGenerationRequest.nonce;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = otpGenerationRequest.adsChallengeId;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            authIntent = otpGenerationRequest.intent;
        }
        return otpGenerationRequest.copy(str, str5, str6, str7, authIntent);
    }
}
