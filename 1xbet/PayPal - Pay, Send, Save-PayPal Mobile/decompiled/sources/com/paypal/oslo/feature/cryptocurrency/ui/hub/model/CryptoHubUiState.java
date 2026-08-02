package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubUiState;", "", "", "isLoading", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;", "loadedCryptoHubUiState", "<init>", "(ZLcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;", "copy", "(ZLcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;", "getLoadedCryptoHubUiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoHubUiState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState;

    public CryptoHubUiState(boolean z, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState) {
        this.isLoading = z;
        this.loadedCryptoHubUiState = loadedCryptoHubUiState;
    }

    public /* synthetic */ CryptoHubUiState(boolean z, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : loadedCryptoHubUiState);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState getLoadedCryptoHubUiState() {
        return this.loadedCryptoHubUiState;
    }

    public final java.lang.String toString() {
        boolean z = this.isLoading;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState = this.loadedCryptoHubUiState;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHubUiState(isLoading=");
        sb.append(z);
        sb.append(", loadedCryptoHubUiState=");
        sb.append(loadedCryptoHubUiState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isLoading);
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState = this.loadedCryptoHubUiState;
        return (hashCode * 31) + (loadedCryptoHubUiState == null ? 0 : loadedCryptoHubUiState.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState cryptoHubUiState = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) other;
        return this.isLoading == cryptoHubUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.loadedCryptoHubUiState, cryptoHubUiState.loadedCryptoHubUiState);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState copy(boolean isLoading, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState(isLoading, loadedCryptoHubUiState);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState getLoadedCryptoHubUiState() {
        return this.loadedCryptoHubUiState;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState cryptoHubUiState, boolean z, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cryptoHubUiState.isLoading;
        }
        if ((i & 2) != 0) {
            loadedCryptoHubUiState = cryptoHubUiState.loadedCryptoHubUiState;
        }
        return cryptoHubUiState.copy(z, loadedCryptoHubUiState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHubUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
