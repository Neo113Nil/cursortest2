package com.zettle.sdk.feature.taptopay.core.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b#\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/models/AttestationInstanceInfo;", "", "", "deviceId", "instanceId", "", "sessionId", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenSignature", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/models/AttestationInstanceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "setDeviceId", "(Ljava/lang/String;)V", "getInstanceId", "J", "getSessionId", "getToken", "getTokenSignature"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AttestationInstanceInfo {
    private java.lang.String deviceId;
    private final java.lang.String instanceId;
    private final long sessionId;
    private final java.lang.String token;
    private final java.lang.String tokenSignature;

    public AttestationInstanceInfo(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.deviceId = str;
        this.instanceId = str2;
        this.sessionId = j;
        this.token = str3;
        this.tokenSignature = str4;
    }

    public /* synthetic */ AttestationInstanceInfo(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, j, str3, (i & 16) != 0 ? null : str4);
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final void setDeviceId(java.lang.String str) {
        this.deviceId = str;
    }

    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final java.lang.String getTokenSignature() {
        return this.tokenSignature;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        java.lang.String str2 = this.instanceId;
        long j = this.sessionId;
        java.lang.String str3 = this.token;
        java.lang.String str4 = this.tokenSignature;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AttestationInstanceInfo(deviceId=");
        sb.append(str);
        sb.append(", instanceId=");
        sb.append(str2);
        sb.append(", sessionId=");
        sb.append(j);
        sb.append(", token=");
        sb.append(str3);
        sb.append(", tokenSignature=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.deviceId;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.instanceId.hashCode();
        int hashCode3 = java.lang.Long.hashCode(this.sessionId);
        int hashCode4 = this.token.hashCode();
        java.lang.String str2 = this.tokenSignature;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo attestationInstanceInfo = (com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, attestationInstanceInfo.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instanceId, attestationInstanceInfo.instanceId) && this.sessionId == attestationInstanceInfo.sessionId && kotlin.jvm.internal.Intrinsics.areEqual(this.token, attestationInstanceInfo.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenSignature, attestationInstanceInfo.tokenSignature);
    }

    public final com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo copy(java.lang.String deviceId, java.lang.String instanceId, long sessionId, java.lang.String token, java.lang.String tokenSignature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        return new com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo(deviceId, instanceId, sessionId, token, tokenSignature);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTokenSignature() {
        return this.tokenSignature;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo copy$default(com.zettle.sdk.feature.taptopay.core.models.AttestationInstanceInfo attestationInstanceInfo, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = attestationInstanceInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = attestationInstanceInfo.instanceId;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            j = attestationInstanceInfo.sessionId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = attestationInstanceInfo.token;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = attestationInstanceInfo.tokenSignature;
        }
        return attestationInstanceInfo.copy(str, str5, j2, str6, str4);
    }
}
