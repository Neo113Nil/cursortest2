package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/data/model/InitChallengeSdkResponse;", "", "", "version", "acsSignedContent", "Lcom/paypal/android/threeds/data/model/AcsRenderingType;", "acsRenderingType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/AcsRenderingType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/android/threeds/data/model/AcsRenderingType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/AcsRenderingType;)Lcom/paypal/android/threeds/data/model/InitChallengeSdkResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVersion", "getAcsSignedContent", "Lcom/paypal/android/threeds/data/model/AcsRenderingType;", "getAcsRenderingType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InitChallengeSdkResponse {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("acs_rendering_type")
    private final com.paypal.android.threeds.data.model.AcsRenderingType acsRenderingType;

    @com.google.gson.annotations.SerializedName("acs_signed_content")
    private final java.lang.String acsSignedContent;
    private final java.lang.String version;

    public InitChallengeSdkResponse(java.lang.String str, java.lang.String str2, com.paypal.android.threeds.data.model.AcsRenderingType acsRenderingType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsRenderingType, "");
        this.version = str;
        this.acsSignedContent = str2;
        this.acsRenderingType = acsRenderingType;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final com.paypal.android.threeds.data.model.AcsRenderingType getAcsRenderingType() {
        return this.acsRenderingType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.version;
        java.lang.String str2 = this.acsSignedContent;
        com.paypal.android.threeds.data.model.AcsRenderingType acsRenderingType = this.acsRenderingType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitChallengeSdkResponse(version=");
        sb.append(str);
        sb.append(", acsSignedContent=");
        sb.append(str2);
        sb.append(", acsRenderingType=");
        sb.append(acsRenderingType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.version.hashCode() * 31) + this.acsSignedContent.hashCode()) * 31) + this.acsRenderingType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.InitChallengeSdkResponse)) {
            return false;
        }
        com.paypal.android.threeds.data.model.InitChallengeSdkResponse initChallengeSdkResponse = (com.paypal.android.threeds.data.model.InitChallengeSdkResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, initChallengeSdkResponse.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.acsSignedContent, initChallengeSdkResponse.acsSignedContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.acsRenderingType, initChallengeSdkResponse.acsRenderingType);
    }

    public final com.paypal.android.threeds.data.model.InitChallengeSdkResponse copy(java.lang.String version, java.lang.String acsSignedContent, com.paypal.android.threeds.data.model.AcsRenderingType acsRenderingType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsSignedContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsRenderingType, "");
        return new com.paypal.android.threeds.data.model.InitChallengeSdkResponse(version, acsSignedContent, acsRenderingType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.android.threeds.data.model.AcsRenderingType getAcsRenderingType() {
        return this.acsRenderingType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.InitChallengeSdkResponse copy$default(com.paypal.android.threeds.data.model.InitChallengeSdkResponse initChallengeSdkResponse, java.lang.String str, java.lang.String str2, com.paypal.android.threeds.data.model.AcsRenderingType acsRenderingType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = initChallengeSdkResponse.version;
        }
        if ((i & 2) != 0) {
            str2 = initChallengeSdkResponse.acsSignedContent;
        }
        if ((i & 4) != 0) {
            acsRenderingType = initChallengeSdkResponse.acsRenderingType;
        }
        return initChallengeSdkResponse.copy(str, str2, acsRenderingType);
    }
}
