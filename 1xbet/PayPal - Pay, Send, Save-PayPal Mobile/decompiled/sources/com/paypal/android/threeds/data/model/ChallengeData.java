package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/data/model/ChallengeData;", "", "", "challengeUrl", "acsChallengeMandated", "", "authenticationMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/android/threeds/data/model/ChallengeData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeUrl", "getAcsChallengeMandated", "Ljava/util/List;", "getAuthenticationMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChallengeData {
    public static final int $stable = 8;

    @com.google.gson.annotations.SerializedName("acs_challenge_mandated")
    private final java.lang.String acsChallengeMandated;

    @com.google.gson.annotations.SerializedName("authentication_method")
    private final java.util.List<java.lang.String> authenticationMethod;

    @com.google.gson.annotations.SerializedName("challenge_url")
    private final java.lang.String challengeUrl;

    public ChallengeData(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.challengeUrl = str;
        this.acsChallengeMandated = str2;
        this.authenticationMethod = list;
    }

    public final java.lang.String getChallengeUrl() {
        return this.challengeUrl;
    }

    public final java.lang.String getAcsChallengeMandated() {
        return this.acsChallengeMandated;
    }

    public final java.util.List<java.lang.String> getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.challengeUrl;
        java.lang.String str2 = this.acsChallengeMandated;
        java.util.List<java.lang.String> list = this.authenticationMethod;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeData(challengeUrl=");
        sb.append(str);
        sb.append(", acsChallengeMandated=");
        sb.append(str2);
        sb.append(", authenticationMethod=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.challengeUrl.hashCode() * 31) + this.acsChallengeMandated.hashCode()) * 31) + this.authenticationMethod.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.ChallengeData)) {
            return false;
        }
        com.paypal.android.threeds.data.model.ChallengeData challengeData = (com.paypal.android.threeds.data.model.ChallengeData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeUrl, challengeData.challengeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.acsChallengeMandated, challengeData.acsChallengeMandated) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationMethod, challengeData.authenticationMethod);
    }

    public final com.paypal.android.threeds.data.model.ChallengeData copy(java.lang.String challengeUrl, java.lang.String acsChallengeMandated, java.util.List<java.lang.String> authenticationMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsChallengeMandated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethod, "");
        return new com.paypal.android.threeds.data.model.ChallengeData(challengeUrl, acsChallengeMandated, authenticationMethod);
    }

    public final java.util.List<java.lang.String> component3() {
        return this.authenticationMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAcsChallengeMandated() {
        return this.acsChallengeMandated;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChallengeUrl() {
        return this.challengeUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.android.threeds.data.model.ChallengeData copy$default(com.paypal.android.threeds.data.model.ChallengeData challengeData, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = challengeData.challengeUrl;
        }
        if ((i & 2) != 0) {
            str2 = challengeData.acsChallengeMandated;
        }
        if ((i & 4) != 0) {
            list = challengeData.authenticationMethod;
        }
        return challengeData.copy(str, str2, list);
    }
}
