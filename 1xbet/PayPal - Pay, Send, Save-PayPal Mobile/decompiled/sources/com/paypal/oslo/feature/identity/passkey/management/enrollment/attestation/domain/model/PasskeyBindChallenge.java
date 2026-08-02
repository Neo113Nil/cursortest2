package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJ¶\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u001bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010$R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b@\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\bA\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bB\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\bE\u0010\u001bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\bF\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;", "", "", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "relyingPartyId", "relyingPartyName", "userId", "userName", "userDisplayName", "", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PubKeyCredentialParameter;", "pubKeyCredParams", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/ExcludedCredentialDescriptor;", "excludeCredentials", "attestation", "authenticatorAttachment", "", "requireResidentKey", "residentKey", "userVerification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "hasAuthenticatorSelectionCriteria", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/Long;", "component9", "component10", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallenge", "getRelyingPartyId", "getRelyingPartyName", "getUserId", "getUserName", "getUserDisplayName", "Ljava/util/List;", "getPubKeyCredParams", "Ljava/lang/Long;", "getTimeout", "getExcludeCredentials", "getAttestation", "getAuthenticatorAttachment", "Ljava/lang/Boolean;", "getRequireResidentKey", "getResidentKey", "getUserVerification"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyBindChallenge {
    public static final int $stable = 8;
    private final java.lang.String attestation;
    private final java.lang.String authenticatorAttachment;
    private final java.lang.String challenge;
    private final java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> excludeCredentials;
    private final java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> pubKeyCredParams;
    private final java.lang.String relyingPartyId;
    private final java.lang.String relyingPartyName;
    private final java.lang.Boolean requireResidentKey;
    private final java.lang.String residentKey;
    private final java.lang.Long timeout;
    private final java.lang.String userDisplayName;
    private final java.lang.String userId;
    private final java.lang.String userName;
    private final java.lang.String userVerification;

    public PasskeyBindChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> list, java.lang.Long l, java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> list2, java.lang.String str7, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.challenge = str;
        this.relyingPartyId = str2;
        this.relyingPartyName = str3;
        this.userId = str4;
        this.userName = str5;
        this.userDisplayName = str6;
        this.pubKeyCredParams = list;
        this.timeout = l;
        this.excludeCredentials = list2;
        this.attestation = str7;
        this.authenticatorAttachment = str8;
        this.requireResidentKey = bool;
        this.residentKey = str9;
        this.userVerification = str10;
    }

    public /* synthetic */ PasskeyBindChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, java.lang.Long l, java.util.List list2, java.lang.String str7, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, list, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10);
    }

    public final java.lang.String getChallenge() {
        return this.challenge;
    }

    public final java.lang.String getRelyingPartyId() {
        return this.relyingPartyId;
    }

    public final java.lang.String getRelyingPartyName() {
        return this.relyingPartyName;
    }

    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final java.lang.String getUserName() {
        return this.userName;
    }

    public final java.lang.String getUserDisplayName() {
        return this.userDisplayName;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    public final java.lang.Long getTimeout() {
        return this.timeout;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> getExcludeCredentials() {
        return this.excludeCredentials;
    }

    public final java.lang.String getAttestation() {
        return this.attestation;
    }

    public final java.lang.String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final java.lang.Boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    public final java.lang.String getResidentKey() {
        return this.residentKey;
    }

    public final java.lang.String getUserVerification() {
        return this.userVerification;
    }

    public final boolean hasAuthenticatorSelectionCriteria() {
        return (this.authenticatorAttachment == null && this.requireResidentKey == null && this.residentKey == null && this.userVerification == null) ? false : true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.challenge;
        java.lang.String str2 = this.relyingPartyId;
        java.lang.String str3 = this.relyingPartyName;
        java.lang.String str4 = this.userId;
        java.lang.String str5 = this.userName;
        java.lang.String str6 = this.userDisplayName;
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> list = this.pubKeyCredParams;
        java.lang.Long l = this.timeout;
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> list2 = this.excludeCredentials;
        java.lang.String str7 = this.attestation;
        java.lang.String str8 = this.authenticatorAttachment;
        java.lang.Boolean bool = this.requireResidentKey;
        java.lang.String str9 = this.residentKey;
        java.lang.String str10 = this.userVerification;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyBindChallenge(challenge=");
        sb.append(str);
        sb.append(", relyingPartyId=");
        sb.append(str2);
        sb.append(", relyingPartyName=");
        sb.append(str3);
        sb.append(", userId=");
        sb.append(str4);
        sb.append(", userName=");
        sb.append(str5);
        sb.append(", userDisplayName=");
        sb.append(str6);
        sb.append(", pubKeyCredParams=");
        sb.append(list);
        sb.append(", timeout=");
        sb.append(l);
        sb.append(", excludeCredentials=");
        sb.append(list2);
        sb.append(", attestation=");
        sb.append(str7);
        sb.append(", authenticatorAttachment=");
        sb.append(str8);
        sb.append(", requireResidentKey=");
        sb.append(bool);
        sb.append(", residentKey=");
        sb.append(str9);
        sb.append(", userVerification=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.challenge.hashCode();
        int hashCode2 = this.relyingPartyId.hashCode();
        int hashCode3 = this.relyingPartyName.hashCode();
        int hashCode4 = this.userId.hashCode();
        int hashCode5 = this.userName.hashCode();
        int hashCode6 = this.userDisplayName.hashCode();
        int hashCode7 = this.pubKeyCredParams.hashCode();
        java.lang.Long l = this.timeout;
        int hashCode8 = l == null ? 0 : l.hashCode();
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> list = this.excludeCredentials;
        int hashCode9 = list == null ? 0 : list.hashCode();
        java.lang.String str = this.attestation;
        int hashCode10 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.authenticatorAttachment;
        int hashCode11 = str2 == null ? 0 : str2.hashCode();
        java.lang.Boolean bool = this.requireResidentKey;
        int hashCode12 = bool == null ? 0 : bool.hashCode();
        java.lang.String str3 = this.residentKey;
        int hashCode13 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.userVerification;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, passkeyBindChallenge.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.relyingPartyId, passkeyBindChallenge.relyingPartyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.relyingPartyName, passkeyBindChallenge.relyingPartyName) && kotlin.jvm.internal.Intrinsics.areEqual(this.userId, passkeyBindChallenge.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.userName, passkeyBindChallenge.userName) && kotlin.jvm.internal.Intrinsics.areEqual(this.userDisplayName, passkeyBindChallenge.userDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.pubKeyCredParams, passkeyBindChallenge.pubKeyCredParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeout, passkeyBindChallenge.timeout) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeCredentials, passkeyBindChallenge.excludeCredentials) && kotlin.jvm.internal.Intrinsics.areEqual(this.attestation, passkeyBindChallenge.attestation) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAttachment, passkeyBindChallenge.authenticatorAttachment) && kotlin.jvm.internal.Intrinsics.areEqual(this.requireResidentKey, passkeyBindChallenge.requireResidentKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.residentKey, passkeyBindChallenge.residentKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.userVerification, passkeyBindChallenge.userVerification);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge copy(java.lang.String challenge, java.lang.String relyingPartyId, java.lang.String relyingPartyName, java.lang.String userId, java.lang.String userName, java.lang.String userDisplayName, java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> pubKeyCredParams, java.lang.Long timeout, java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> excludeCredentials, java.lang.String attestation, java.lang.String authenticatorAttachment, java.lang.Boolean requireResidentKey, java.lang.String residentKey, java.lang.String userVerification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relyingPartyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relyingPartyName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDisplayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubKeyCredParams, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge(challenge, relyingPartyId, relyingPartyName, userId, userName, userDisplayName, pubKeyCredParams, timeout, excludeCredentials, attestation, authenticatorAttachment, requireResidentKey, residentKey, userVerification);
    }

    public final java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor> component9() {
        return this.excludeCredentials;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Long getTimeout() {
        return this.timeout;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PubKeyCredentialParameter> component7() {
        return this.pubKeyCredParams;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getUserDisplayName() {
        return this.userDisplayName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRelyingPartyName() {
        return this.relyingPartyName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRelyingPartyId() {
        return this.relyingPartyId;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getUserVerification() {
        return this.userVerification;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getResidentKey() {
        return this.residentKey;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.Boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAttestation() {
        return this.attestation;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChallenge() {
        return this.challenge;
    }
}
