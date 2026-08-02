package com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "isBuyEnabled", "isSellEnabled", "isReceiveEnabled", "isSendEnabled", "isSwapEnabled", "<init>", "(Ljava/lang/String;ZZZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZZZZZ)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AssetCapabilities {
    public static final int $stable = 0;
    private final java.lang.String assetSymbol;
    private final boolean isBuyEnabled;
    private final boolean isReceiveEnabled;
    private final boolean isSellEnabled;
    private final boolean isSendEnabled;
    private final boolean isSwapEnabled;

    public AssetCapabilities(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.assetSymbol = str;
        this.isBuyEnabled = z;
        this.isSellEnabled = z2;
        this.isReceiveEnabled = z3;
        this.isSendEnabled = z4;
        this.isSwapEnabled = z5;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
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
        java.lang.String str = this.assetSymbol;
        boolean z = this.isBuyEnabled;
        boolean z2 = this.isSellEnabled;
        boolean z3 = this.isReceiveEnabled;
        boolean z4 = this.isSendEnabled;
        boolean z5 = this.isSwapEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetCapabilities(assetSymbol=");
        sb.append(str);
        sb.append(", isBuyEnabled=");
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
        return (((((((((this.assetSymbol.hashCode() * 31) + java.lang.Boolean.hashCode(this.isBuyEnabled)) * 31) + java.lang.Boolean.hashCode(this.isSellEnabled)) * 31) + java.lang.Boolean.hashCode(this.isReceiveEnabled)) * 31) + java.lang.Boolean.hashCode(this.isSendEnabled)) * 31) + java.lang.Boolean.hashCode(this.isSwapEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities assetCapabilities = (com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, assetCapabilities.assetSymbol) && this.isBuyEnabled == assetCapabilities.isBuyEnabled && this.isSellEnabled == assetCapabilities.isSellEnabled && this.isReceiveEnabled == assetCapabilities.isReceiveEnabled && this.isSendEnabled == assetCapabilities.isSendEnabled && this.isSwapEnabled == assetCapabilities.isSwapEnabled;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities copy(java.lang.String assetSymbol, boolean isBuyEnabled, boolean isSellEnabled, boolean isReceiveEnabled, boolean isSendEnabled, boolean isSwapEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities(assetSymbol, isBuyEnabled, isSellEnabled, isReceiveEnabled, isSendEnabled, isSwapEnabled);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSwapEnabled() {
        return this.isSwapEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSendEnabled() {
        return this.isSendEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsReceiveEnabled() {
        return this.isReceiveEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSellEnabled() {
        return this.isSellEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBuyEnabled() {
        return this.isBuyEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities assetCapabilities, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = assetCapabilities.assetSymbol;
        }
        if ((i & 2) != 0) {
            z = assetCapabilities.isBuyEnabled;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = assetCapabilities.isSellEnabled;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = assetCapabilities.isReceiveEnabled;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = assetCapabilities.isSendEnabled;
        }
        boolean z9 = z4;
        if ((i & 32) != 0) {
            z5 = assetCapabilities.isSwapEnabled;
        }
        return assetCapabilities.copy(str, z6, z7, z8, z9, z5);
    }
}
