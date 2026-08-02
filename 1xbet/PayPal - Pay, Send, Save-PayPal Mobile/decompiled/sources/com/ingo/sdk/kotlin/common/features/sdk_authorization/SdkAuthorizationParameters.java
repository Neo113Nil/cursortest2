package com.ingo.sdk.kotlin.common.features.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationParameters;", "", "", "ingoSdkVersion", "partnerAppName", "partnerAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIngoSdkVersion", "getPartnerAppName", "getPartnerAppVersion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SdkAuthorizationParameters {
    private final java.lang.String ingoSdkVersion;
    private final java.lang.String partnerAppName;
    private final java.lang.String partnerAppVersion;

    public SdkAuthorizationParameters(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.ingoSdkVersion = str;
        this.partnerAppName = str2;
        this.partnerAppVersion = str3;
    }

    public final java.lang.String getIngoSdkVersion() {
        return this.ingoSdkVersion;
    }

    public final java.lang.String getPartnerAppName() {
        return this.partnerAppName;
    }

    public final java.lang.String getPartnerAppVersion() {
        return this.partnerAppVersion;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.ingoSdkVersion;
        java.lang.String str2 = this.partnerAppName;
        java.lang.String str3 = this.partnerAppVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkAuthorizationParameters(ingoSdkVersion=");
        sb.append(str);
        sb.append(", partnerAppName=");
        sb.append(str2);
        sb.append(", partnerAppVersion=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.ingoSdkVersion.hashCode() * 31) + this.partnerAppName.hashCode()) * 31) + this.partnerAppVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters = (com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.ingoSdkVersion, sdkAuthorizationParameters.ingoSdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerAppName, sdkAuthorizationParameters.partnerAppName) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerAppVersion, sdkAuthorizationParameters.partnerAppVersion);
    }

    public final com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters copy(java.lang.String ingoSdkVersion, java.lang.String partnerAppName, java.lang.String partnerAppVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerAppName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerAppVersion, "");
        return new com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters(ingoSdkVersion, partnerAppName, partnerAppVersion);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPartnerAppVersion() {
        return this.partnerAppVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPartnerAppName() {
        return this.partnerAppName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIngoSdkVersion() {
        return this.ingoSdkVersion;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters copy$default(com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sdkAuthorizationParameters.ingoSdkVersion;
        }
        if ((i & 2) != 0) {
            str2 = sdkAuthorizationParameters.partnerAppName;
        }
        if ((i & 4) != 0) {
            str3 = sdkAuthorizationParameters.partnerAppVersion;
        }
        return sdkAuthorizationParameters.copy(str, str2, str3);
    }
}
