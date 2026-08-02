package com.paypal.oslo.feature.cryptocurrency.ui.receive.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0092\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b1\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b3\u0010\u0015R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b7\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b8\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveUiState;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "isLoading", "isError", "assetName", "networkName", "address", "logoUrl", "networkImageUrl", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/NetworkOption;", "availableNetworks", "selectedNetworkId", "memo", "displayMemo", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "Z", "getAssetName", "getNetworkName", "getAddress", "getLogoUrl", "getNetworkImageUrl", "Ljava/util/List;", "getAvailableNetworks", "getSelectedNetworkId", "getMemo", "getDisplayMemo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoReceiveUiState {
    public static final int $stable = 8;
    private final java.lang.String address;
    private final java.lang.String assetName;
    private final java.lang.String assetSymbol;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption> availableNetworks;
    private final boolean displayMemo;
    private final boolean isError;
    private final boolean isLoading;
    private final java.lang.String logoUrl;
    private final java.lang.String memo;
    private final java.lang.String networkImageUrl;
    private final java.lang.String networkName;
    private final java.lang.String selectedNetworkId;

    public CryptoReceiveUiState(java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption> list, java.lang.String str7, java.lang.String str8, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.assetSymbol = str;
        this.isLoading = z;
        this.isError = z2;
        this.assetName = str2;
        this.networkName = str3;
        this.address = str4;
        this.logoUrl = str5;
        this.networkImageUrl = str6;
        this.availableNetworks = list;
        this.selectedNetworkId = str7;
        this.memo = str8;
        this.displayMemo = z3;
    }

    public /* synthetic */ CryptoReceiveUiState(java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 512) == 0 ? str7 : "", (i & 1024) == 0 ? str8 : null, (i & 2048) == 0 ? z3 : false);
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    public final java.lang.String getAddress() {
        return this.address;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getNetworkImageUrl() {
        return this.networkImageUrl;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption> getAvailableNetworks() {
        return this.availableNetworks;
    }

    public final java.lang.String getSelectedNetworkId() {
        return this.selectedNetworkId;
    }

    public final java.lang.String getMemo() {
        return this.memo;
    }

    public final boolean getDisplayMemo() {
        return this.displayMemo;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        boolean z = this.isLoading;
        boolean z2 = this.isError;
        java.lang.String str2 = this.assetName;
        java.lang.String str3 = this.networkName;
        java.lang.String str4 = this.address;
        java.lang.String str5 = this.logoUrl;
        java.lang.String str6 = this.networkImageUrl;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption> list = this.availableNetworks;
        java.lang.String str7 = this.selectedNetworkId;
        java.lang.String str8 = this.memo;
        boolean z3 = this.displayMemo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoReceiveUiState(assetSymbol=");
        sb.append(str);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", isError=");
        sb.append(z2);
        sb.append(", assetName=");
        sb.append(str2);
        sb.append(", networkName=");
        sb.append(str3);
        sb.append(", address=");
        sb.append(str4);
        sb.append(", logoUrl=");
        sb.append(str5);
        sb.append(", networkImageUrl=");
        sb.append(str6);
        sb.append(", availableNetworks=");
        sb.append(list);
        sb.append(", selectedNetworkId=");
        sb.append(str7);
        sb.append(", memo=");
        sb.append(str8);
        sb.append(", displayMemo=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetSymbol.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isLoading);
        int hashCode3 = java.lang.Boolean.hashCode(this.isError);
        int hashCode4 = this.assetName.hashCode();
        int hashCode5 = this.networkName.hashCode();
        int hashCode6 = this.address.hashCode();
        int hashCode7 = this.logoUrl.hashCode();
        java.lang.String str = this.networkImageUrl;
        int hashCode8 = str == null ? 0 : str.hashCode();
        int hashCode9 = this.availableNetworks.hashCode();
        int hashCode10 = this.selectedNetworkId.hashCode();
        java.lang.String str2 = this.memo;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.displayMemo);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState cryptoReceiveUiState = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoReceiveUiState.assetSymbol) && this.isLoading == cryptoReceiveUiState.isLoading && this.isError == cryptoReceiveUiState.isError && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, cryptoReceiveUiState.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkName, cryptoReceiveUiState.networkName) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, cryptoReceiveUiState.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, cryptoReceiveUiState.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkImageUrl, cryptoReceiveUiState.networkImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableNetworks, cryptoReceiveUiState.availableNetworks) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedNetworkId, cryptoReceiveUiState.selectedNetworkId) && kotlin.jvm.internal.Intrinsics.areEqual(this.memo, cryptoReceiveUiState.memo) && this.displayMemo == cryptoReceiveUiState.displayMemo;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState copy(java.lang.String assetSymbol, boolean isLoading, boolean isError, java.lang.String assetName, java.lang.String networkName, java.lang.String address, java.lang.String logoUrl, java.lang.String networkImageUrl, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption> availableNetworks, java.lang.String selectedNetworkId, java.lang.String memo, boolean displayMemo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableNetworks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedNetworkId, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState(assetSymbol, isLoading, isError, assetName, networkName, address, logoUrl, networkImageUrl, availableNetworks, selectedNetworkId, memo, displayMemo);
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.receive.model.NetworkOption> component9() {
        return this.availableNetworks;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getNetworkImageUrl() {
        return this.networkImageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getDisplayMemo() {
        return this.displayMemo;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getMemo() {
        return this.memo;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getSelectedNetworkId() {
        return this.selectedNetworkId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }
}
