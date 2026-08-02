package com.paypal.oslo.feature.userprofile.domain.model.phone;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "", "", "authId", "challengeId", "uniqueId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAuthId", "getChallengeId", "getUniqueId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PhoneConfirmationChallenge {
    public static final int $stable = 0;
    private final java.lang.String authId;
    private final java.lang.String challengeId;
    private final java.lang.String uniqueId;

    public PhoneConfirmationChallenge(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.authId = str;
        this.challengeId = str2;
        this.uniqueId = str3;
    }

    public final java.lang.String getAuthId() {
        return this.authId;
    }

    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public final java.lang.String getUniqueId() {
        return this.uniqueId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authId;
        java.lang.String str2 = this.challengeId;
        java.lang.String str3 = this.uniqueId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneConfirmationChallenge(authId=");
        sb.append(str);
        sb.append(", challengeId=");
        sb.append(str2);
        sb.append(", uniqueId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.authId.hashCode() * 31) + this.challengeId.hashCode()) * 31) + this.uniqueId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge = (com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authId, phoneConfirmationChallenge.authId) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, phoneConfirmationChallenge.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.uniqueId, phoneConfirmationChallenge.uniqueId);
    }

    public final com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge copy(java.lang.String authId, java.lang.String challengeId, java.lang.String uniqueId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uniqueId, "");
        return new com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge(authId, challengeId, uniqueId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthId() {
        return this.authId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge copy$default(com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phoneConfirmationChallenge.authId;
        }
        if ((i & 2) != 0) {
            str2 = phoneConfirmationChallenge.challengeId;
        }
        if ((i & 4) != 0) {
            str3 = phoneConfirmationChallenge.uniqueId;
        }
        return phoneConfirmationChallenge.copy(str, str2, str3);
    }
}
