package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;", "", "isLoading", "setPyusdRewardsLoadingState", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHubUiStateKt {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState setPyusdRewardsLoadingState(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadedCryptoHubUiState, "");
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState = loadedCryptoHubUiState.getPyusdRewardsCardUiState();
        return com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState.copy$default(loadedCryptoHubUiState, null, pyusdRewardsCardUiState != null ? com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState.copy$default(pyusdRewardsCardUiState, z, null, null, 6, null) : null, null, null, null, false, 61, null);
    }
}
