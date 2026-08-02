package com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/CryptoUserCapabilities;", "", "", "isBuyEnabled", "isSellEnabled", "isReceiveEnabled", "isSendEnabled", "isSwapEnabled", "<init>", "(ZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/CryptoUserCapabilities;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoUserCapabilities {
    public static final int $stable = 0;
    private final boolean isBuyEnabled;
    private final boolean isReceiveEnabled;
    private final boolean isSellEnabled;
    private final boolean isSendEnabled;
    private final boolean isSwapEnabled;

    public CryptoUserCapabilities(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isBuyEnabled = z;
        this.isSellEnabled = z2;
        this.isReceiveEnabled = z3;
        this.isSendEnabled = z4;
        this.isSwapEnabled = z5;
    }

    public final boolean isBuyEnabled() {
        return this.isBuyEnabled;
    }

    public final boolean isSellEnabled() {
        return this.isSellEnabled;
    }

    public final boolean isReceiveEnabled() {
        return this.isReceiveEnabled;
    }

    public final boolean isSendEnabled() {
        return this.isSendEnabled;
    }

    public final boolean isSwapEnabled() {
        return this.isSwapEnabled;
    }

    public final java.lang.String toString() {
        boolean z = this.isBuyEnabled;
        boolean z2 = this.isSellEnabled;
        boolean z3 = this.isReceiveEnabled;
        boolean z4 = this.isSendEnabled;
        boolean z5 = this.isSwapEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoUserCapabilities(isBuyEnabled=");
        sb.append(z);
        sb.append(", isSellEnabled=");
        sb.append(z2);
        sb.append(", isReceiveEnabled=");
        sb.append(z3);
        sb.append(", isSendEnabled=");
        sb.append(z4);
        sb.append(", isSwapEnabled=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.isBuyEnabled) * 31) + java.lang.Boolean.hashCode(this.isSellEnabled)) * 31) + java.lang.Boolean.hashCode(this.isReceiveEnabled)) * 31) + java.lang.Boolean.hashCode(this.isSendEnabled)) * 31) + java.lang.Boolean.hashCode(this.isSwapEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities cryptoUserCapabilities = (com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities) other;
        return this.isBuyEnabled == cryptoUserCapabilities.isBuyEnabled && this.isSellEnabled == cryptoUserCapabilities.isSellEnabled && this.isReceiveEnabled == cryptoUserCapabilities.isReceiveEnabled && this.isSendEnabled == cryptoUserCapabilities.isSendEnabled && this.isSwapEnabled == cryptoUserCapabilities.isSwapEnabled;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities copy(boolean isBuyEnabled, boolean isSellEnabled, boolean isReceiveEnabled, boolean isSendEnabled, boolean isSwapEnabled) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities(isBuyEnabled, isSellEnabled, isReceiveEnabled, isSendEnabled, isSwapEnabled);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSwapEnabled() {
        return this.isSwapEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSendEnabled() {
        return this.isSendEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsReceiveEnabled() {
        return this.isReceiveEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSellEnabled() {
        return this.isSellEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBuyEnabled() {
        return this.isBuyEnabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities cryptoUserCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cryptoUserCapabilities.isBuyEnabled;
        }
        if ((i & 2) != 0) {
            z2 = cryptoUserCapabilities.isSellEnabled;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = cryptoUserCapabilities.isReceiveEnabled;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = cryptoUserCapabilities.isSendEnabled;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = cryptoUserCapabilities.isSwapEnabled;
        }
        return cryptoUserCapabilities.copy(z, z6, z7, z8, z5);
    }
}
