package com.paypal.oslo.feature.starpay.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/ResumeProvisioningMetaData;", "", "", "tokenReferenceId", "Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "network", "Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "tokenServiceProvider", "displayName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/starpay/api/CardNetwork;Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "component3", "()Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/starpay/api/CardNetwork;Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/ResumeProvisioningMetaData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTokenReferenceId", "Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "getNetwork", "Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "getTokenServiceProvider", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ResumeProvisioningMetaData {
    public static final int $stable = 0;
    private final java.lang.String displayName;
    private final com.paypal.oslo.feature.starpay.api.CardNetwork network;
    private final java.lang.String tokenReferenceId;
    private final com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider;

    public ResumeProvisioningMetaData(java.lang.String str, com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork, com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenServiceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.tokenReferenceId = str;
        this.network = cardNetwork;
        this.tokenServiceProvider = tokenServiceProvider;
        this.displayName = str2;
    }

    public final java.lang.String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    public final com.paypal.oslo.feature.starpay.api.CardNetwork getNetwork() {
        return this.network;
    }

    public final com.paypal.oslo.feature.starpay.api.TokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tokenReferenceId;
        com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork = this.network;
        com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider = this.tokenServiceProvider;
        java.lang.String str2 = this.displayName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResumeProvisioningMetaData(tokenReferenceId=");
        sb.append(str);
        sb.append(", network=");
        sb.append(cardNetwork);
        sb.append(", tokenServiceProvider=");
        sb.append(tokenServiceProvider);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.tokenReferenceId.hashCode() * 31) + this.network.hashCode()) * 31) + this.tokenServiceProvider.hashCode()) * 31) + this.displayName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData)) {
            return false;
        }
        com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData resumeProvisioningMetaData = (com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenReferenceId, resumeProvisioningMetaData.tokenReferenceId) && this.network == resumeProvisioningMetaData.network && this.tokenServiceProvider == resumeProvisioningMetaData.tokenServiceProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, resumeProvisioningMetaData.displayName);
    }

    public final com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData copy(java.lang.String tokenReferenceId, com.paypal.oslo.feature.starpay.api.CardNetwork network, com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider, java.lang.String displayName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenServiceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData(tokenReferenceId, network, tokenServiceProvider, displayName);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.starpay.api.TokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.starpay.api.CardNetwork getNetwork() {
        return this.network;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData copy$default(com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData resumeProvisioningMetaData, java.lang.String str, com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork, com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = resumeProvisioningMetaData.tokenReferenceId;
        }
        if ((i & 2) != 0) {
            cardNetwork = resumeProvisioningMetaData.network;
        }
        if ((i & 4) != 0) {
            tokenServiceProvider = resumeProvisioningMetaData.tokenServiceProvider;
        }
        if ((i & 8) != 0) {
            str2 = resumeProvisioningMetaData.displayName;
        }
        return resumeProvisioningMetaData.copy(str, cardNetwork, tokenServiceProvider, str2);
    }
}
