package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "", "", "name", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "version", "verfCaptureSdkVersion", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getPlatform", "getVersion", "getVerfCaptureSdkVersion", "getContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SdkInfo {
    public static final int $stable = 0;
    private final java.lang.String context;
    private final java.lang.String name;
    private final java.lang.String platform;
    private final java.lang.String verfCaptureSdkVersion;
    private final java.lang.String version;

    public SdkInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.platform = str2;
        this.version = str3;
        this.verfCaptureSdkVersion = str4;
        this.context = str5;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getPlatform() {
        return this.platform;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String getVerfCaptureSdkVersion() {
        return this.verfCaptureSdkVersion;
    }

    public /* synthetic */ SdkInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5);
    }

    public final java.lang.String getContext() {
        return this.context;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.platform;
        java.lang.String str3 = this.version;
        java.lang.String str4 = this.verfCaptureSdkVersion;
        java.lang.String str5 = this.context;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkInfo(name=");
        sb.append(str);
        sb.append(", platform=");
        sb.append(str2);
        sb.append(", version=");
        sb.append(str3);
        sb.append(", verfCaptureSdkVersion=");
        sb.append(str4);
        sb.append(", context=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.platform.hashCode()) * 31) + this.version.hashCode()) * 31) + this.verfCaptureSdkVersion.hashCode()) * 31) + this.context.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, sdkInfo.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.platform, sdkInfo.platform) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, sdkInfo.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.verfCaptureSdkVersion, sdkInfo.verfCaptureSdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, sdkInfo.context);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo copy(java.lang.String name2, java.lang.String platform, java.lang.String version, java.lang.String verfCaptureSdkVersion, java.lang.String context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verfCaptureSdkVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo(name2, platform, version, verfCaptureSdkVersion, context);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getContext() {
        return this.context;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVerfCaptureSdkVersion() {
        return this.verfCaptureSdkVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlatform() {
        return this.platform;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sdkInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = sdkInfo.platform;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = sdkInfo.version;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = sdkInfo.verfCaptureSdkVersion;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = sdkInfo.context;
        }
        return sdkInfo.copy(str, str6, str7, str8, str5);
    }
}
