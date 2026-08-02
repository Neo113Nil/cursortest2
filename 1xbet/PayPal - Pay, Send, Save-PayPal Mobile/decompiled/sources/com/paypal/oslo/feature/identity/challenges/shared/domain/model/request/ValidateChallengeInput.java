package com.paypal.oslo.feature.identity.challenges.shared.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b7\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b8\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;", "", "", "id", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidationInput;", "oneTimePasscodeValidationInput", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SecurityQuestionValidationInput;", "securityQuestionValidationInput", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/CreditCardValidationInput;", "creditCardValidationInput", "", "rememberDeviceUserConsent", "nonce", "partialToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SilentAuthValidationInput;", "silentAuthValidationInput", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidationInput;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SecurityQuestionValidationInput;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/CreditCardValidationInput;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SilentAuthValidationInput;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidationInput;", "component3", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SecurityQuestionValidationInput;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/CreditCardValidationInput;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "component9", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SilentAuthValidationInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidationInput;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SecurityQuestionValidationInput;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/CreditCardValidationInput;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SilentAuthValidationInput;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidationInput;", "getOneTimePasscodeValidationInput", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SecurityQuestionValidationInput;", "getSecurityQuestionValidationInput", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/CreditCardValidationInput;", "getCreditCardValidationInput", "Ljava/lang/Boolean;", "getRememberDeviceUserConsent", "getNonce", "getPartialToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/SilentAuthValidationInput;", "getSilentAuthValidationInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ValidateChallengeInput {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput;
    private final java.lang.String id;
    private final java.lang.String nonce;
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput oneTimePasscodeValidationInput;
    private final java.lang.String partialToken;
    private final java.lang.Boolean rememberDeviceUserConsent;
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput;
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput;

    public ValidateChallengeInput(java.lang.String str, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput validationInput, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.id = str;
        this.oneTimePasscodeValidationInput = validationInput;
        this.securityQuestionValidationInput = securityQuestionValidationInput;
        this.creditCardValidationInput = creditCardValidationInput;
        this.rememberDeviceUserConsent = bool;
        this.nonce = str2;
        this.partialToken = str3;
        this.authIntent = authIntent;
        this.silentAuthValidationInput = silentAuthValidationInput;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput getOneTimePasscodeValidationInput() {
        return this.oneTimePasscodeValidationInput;
    }

    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput getSecurityQuestionValidationInput() {
        return this.securityQuestionValidationInput;
    }

    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput getCreditCardValidationInput() {
        return this.creditCardValidationInput;
    }

    public final java.lang.Boolean getRememberDeviceUserConsent() {
        return this.rememberDeviceUserConsent;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    public /* synthetic */ ValidateChallengeInput(java.lang.String str, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput validationInput, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : validationInput, (i & 4) != 0 ? null : securityQuestionValidationInput, (i & 8) != 0 ? null : creditCardValidationInput, (i & 16) != 0 ? null : bool, str2, str3, (i & 128) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent, (i & 256) != 0 ? null : silentAuthValidationInput);
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
        return this.authIntent;
    }

    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput getSilentAuthValidationInput() {
        return this.silentAuthValidationInput;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput validationInput = this.oneTimePasscodeValidationInput;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput = this.securityQuestionValidationInput;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput = this.creditCardValidationInput;
        java.lang.Boolean bool = this.rememberDeviceUserConsent;
        java.lang.String str2 = this.nonce;
        java.lang.String str3 = this.partialToken;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.authIntent;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput = this.silentAuthValidationInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateChallengeInput(id=");
        sb.append(str);
        sb.append(", oneTimePasscodeValidationInput=");
        sb.append(validationInput);
        sb.append(", securityQuestionValidationInput=");
        sb.append(securityQuestionValidationInput);
        sb.append(", creditCardValidationInput=");
        sb.append(creditCardValidationInput);
        sb.append(", rememberDeviceUserConsent=");
        sb.append(bool);
        sb.append(", nonce=");
        sb.append(str2);
        sb.append(", partialToken=");
        sb.append(str3);
        sb.append(", authIntent=");
        sb.append(authIntent);
        sb.append(", silentAuthValidationInput=");
        sb.append(silentAuthValidationInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput validationInput = this.oneTimePasscodeValidationInput;
        int hashCode2 = validationInput == null ? 0 : validationInput.hashCode();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput = this.securityQuestionValidationInput;
        int hashCode3 = securityQuestionValidationInput == null ? 0 : securityQuestionValidationInput.hashCode();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput = this.creditCardValidationInput;
        int hashCode4 = creditCardValidationInput == null ? 0 : creditCardValidationInput.hashCode();
        java.lang.Boolean bool = this.rememberDeviceUserConsent;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.nonce;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.partialToken;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        int hashCode8 = this.authIntent.hashCode();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput = this.silentAuthValidationInput;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (silentAuthValidationInput != null ? silentAuthValidationInput.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, validateChallengeInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.oneTimePasscodeValidationInput, validateChallengeInput.oneTimePasscodeValidationInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityQuestionValidationInput, validateChallengeInput.securityQuestionValidationInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditCardValidationInput, validateChallengeInput.creditCardValidationInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.rememberDeviceUserConsent, validateChallengeInput.rememberDeviceUserConsent) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, validateChallengeInput.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, validateChallengeInput.partialToken) && this.authIntent == validateChallengeInput.authIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.silentAuthValidationInput, validateChallengeInput.silentAuthValidationInput);
    }

    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput copy(java.lang.String id, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput oneTimePasscodeValidationInput, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput, java.lang.Boolean rememberDeviceUserConsent, java.lang.String nonce, java.lang.String partialToken, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput(id, oneTimePasscodeValidationInput, securityQuestionValidationInput, creditCardValidationInput, rememberDeviceUserConsent, nonce, partialToken, authIntent, silentAuthValidationInput);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput getSilentAuthValidationInput() {
        return this.silentAuthValidationInput;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
        return this.authIntent;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Boolean getRememberDeviceUserConsent() {
        return this.rememberDeviceUserConsent;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput getCreditCardValidationInput() {
        return this.creditCardValidationInput;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput getSecurityQuestionValidationInput() {
        return this.securityQuestionValidationInput;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput getOneTimePasscodeValidationInput() {
        return this.oneTimePasscodeValidationInput;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
