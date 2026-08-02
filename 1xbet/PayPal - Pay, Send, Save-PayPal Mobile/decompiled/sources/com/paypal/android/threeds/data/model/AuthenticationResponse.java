package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/android/threeds/data/model/AuthenticationResponse;", "", "", "version", "Lcom/paypal/android/threeds/data/model/TenantData;", "tenantData", "Lcom/paypal/android/threeds/data/model/AuthenticationResponseData;", "authenticationResponseData", "<init>", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/TenantData;Lcom/paypal/android/threeds/data/model/AuthenticationResponseData;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/android/threeds/data/model/TenantData;", "component3", "()Lcom/paypal/android/threeds/data/model/AuthenticationResponseData;", "copy", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/TenantData;Lcom/paypal/android/threeds/data/model/AuthenticationResponseData;)Lcom/paypal/android/threeds/data/model/AuthenticationResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVersion", "Lcom/paypal/android/threeds/data/model/TenantData;", "getTenantData", "Lcom/paypal/android/threeds/data/model/AuthenticationResponseData;", "getAuthenticationResponseData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AuthenticationResponse {
    public static final int $stable = 8;

    @com.google.gson.annotations.SerializedName("authentication_response_data")
    private final com.paypal.android.threeds.data.model.AuthenticationResponseData authenticationResponseData;

    @com.google.gson.annotations.SerializedName("tenant_data")
    private final com.paypal.android.threeds.data.model.TenantData tenantData;
    private final java.lang.String version;

    public AuthenticationResponse(java.lang.String str, com.paypal.android.threeds.data.model.TenantData tenantData, com.paypal.android.threeds.data.model.AuthenticationResponseData authenticationResponseData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenantData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationResponseData, "");
        this.version = str;
        this.tenantData = tenantData;
        this.authenticationResponseData = authenticationResponseData;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final com.paypal.android.threeds.data.model.TenantData getTenantData() {
        return this.tenantData;
    }

    public final com.paypal.android.threeds.data.model.AuthenticationResponseData getAuthenticationResponseData() {
        return this.authenticationResponseData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.version;
        com.paypal.android.threeds.data.model.TenantData tenantData = this.tenantData;
        com.paypal.android.threeds.data.model.AuthenticationResponseData authenticationResponseData = this.authenticationResponseData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationResponse(version=");
        sb.append(str);
        sb.append(", tenantData=");
        sb.append(tenantData);
        sb.append(", authenticationResponseData=");
        sb.append(authenticationResponseData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.version.hashCode() * 31) + this.tenantData.hashCode()) * 31) + this.authenticationResponseData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.AuthenticationResponse)) {
            return false;
        }
        com.paypal.android.threeds.data.model.AuthenticationResponse authenticationResponse = (com.paypal.android.threeds.data.model.AuthenticationResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, authenticationResponse.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.tenantData, authenticationResponse.tenantData) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationResponseData, authenticationResponse.authenticationResponseData);
    }

    public final com.paypal.android.threeds.data.model.AuthenticationResponse copy(java.lang.String version, com.paypal.android.threeds.data.model.TenantData tenantData, com.paypal.android.threeds.data.model.AuthenticationResponseData authenticationResponseData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenantData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationResponseData, "");
        return new com.paypal.android.threeds.data.model.AuthenticationResponse(version, tenantData, authenticationResponseData);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.android.threeds.data.model.AuthenticationResponseData getAuthenticationResponseData() {
        return this.authenticationResponseData;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.threeds.data.model.TenantData getTenantData() {
        return this.tenantData;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.AuthenticationResponse copy$default(com.paypal.android.threeds.data.model.AuthenticationResponse authenticationResponse, java.lang.String str, com.paypal.android.threeds.data.model.TenantData tenantData, com.paypal.android.threeds.data.model.AuthenticationResponseData authenticationResponseData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationResponse.version;
        }
        if ((i & 2) != 0) {
            tenantData = authenticationResponse.tenantData;
        }
        if ((i & 4) != 0) {
            authenticationResponseData = authenticationResponse.authenticationResponseData;
        }
        return authenticationResponse.copy(str, tenantData, authenticationResponseData);
    }
}
