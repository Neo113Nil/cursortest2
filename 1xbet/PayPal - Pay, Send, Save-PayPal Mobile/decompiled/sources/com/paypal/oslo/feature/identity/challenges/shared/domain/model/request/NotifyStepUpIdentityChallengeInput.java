package com.paypal.oslo.feature.identity.challenges.shared.domain.model.request;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\\\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\u00020\u001c8\u0017X\u0097D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "", "id", "challengeId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "type", "deliveryTarget", "nonce", "partialToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyStepUpIdentityChallengeInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getChallengeId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "getType", "getDeliveryTarget", "getNonce", "getPartialToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent", "requestId", "getRequestId", "isAuthRequired", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotifyStepUpIdentityChallengeInput implements com.paypal.oslo.feature.identity.login.domain.model.LoginRequest {
    public static final int $stable = 0;
    private final java.lang.String challengeId;
    private final java.lang.String deliveryTarget;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent;
    private final boolean isAuthRequired;
    private final java.lang.String nonce;
    private final java.lang.String partialToken;
    private final java.lang.String requestId;
    private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type;

    public NotifyStepUpIdentityChallengeInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.id = str;
        this.challengeId = str2;
        this.type = challengeType;
        this.deliveryTarget = str3;
        this.nonce = str4;
        this.partialToken = str5;
        this.intent = authIntent;
        this.requestId = "notify_stepup_challenge_".concat(java.lang.String.valueOf(str));
        this.isAuthRequired = true;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getType() {
        return this.type;
    }

    public final java.lang.String getDeliveryTarget() {
        return this.deliveryTarget;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    public /* synthetic */ NotifyStepUpIdentityChallengeInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, challengeType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent);
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    /* renamed from: isAuthRequired, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.challengeId;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = this.type;
        java.lang.String str3 = this.deliveryTarget;
        java.lang.String str4 = this.nonce;
        java.lang.String str5 = this.partialToken;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyStepUpIdentityChallengeInput(id=");
        sb.append(str);
        sb.append(", challengeId=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(challengeType);
        sb.append(", deliveryTarget=");
        sb.append(str3);
        sb.append(", nonce=");
        sb.append(str4);
        sb.append(", partialToken=");
        sb.append(str5);
        sb.append(", intent=");
        sb.append(authIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.challengeId.hashCode();
        int hashCode3 = this.type.hashCode();
        java.lang.String str = this.deliveryTarget;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.nonce;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.partialToken;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, notifyStepUpIdentityChallengeInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, notifyStepUpIdentityChallengeInput.challengeId) && this.type == notifyStepUpIdentityChallengeInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTarget, notifyStepUpIdentityChallengeInput.deliveryTarget) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, notifyStepUpIdentityChallengeInput.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, notifyStepUpIdentityChallengeInput.partialToken) && this.intent == notifyStepUpIdentityChallengeInput.intent;
    }

    public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput copy(java.lang.String id, java.lang.String challengeId, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type, java.lang.String deliveryTarget, java.lang.String nonce, java.lang.String partialToken, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput(id, challengeId, type, deliveryTarget, nonce, partialToken, intent);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDeliveryTarget() {
        return this.deliveryTarget;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput copy$default(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = notifyStepUpIdentityChallengeInput.id;
        }
        if ((i & 2) != 0) {
            str2 = notifyStepUpIdentityChallengeInput.challengeId;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            challengeType = notifyStepUpIdentityChallengeInput.type;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = challengeType;
        if ((i & 8) != 0) {
            str3 = notifyStepUpIdentityChallengeInput.deliveryTarget;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = notifyStepUpIdentityChallengeInput.nonce;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = notifyStepUpIdentityChallengeInput.partialToken;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            authIntent = notifyStepUpIdentityChallengeInput.intent;
        }
        return notifyStepUpIdentityChallengeInput.copy(str, str6, challengeType2, str7, str8, str9, authIntent);
    }
}
