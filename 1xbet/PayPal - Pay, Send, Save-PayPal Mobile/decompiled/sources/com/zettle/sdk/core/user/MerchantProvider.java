package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/user/MerchantProvider;", "", "Lcom/zettle/sdk/core/auth/Merchant$LoggedIn;", "getCurrentLoggedInMerchant", "()Lcom/zettle/sdk/core/auth/Merchant$LoggedIn;", "currentLoggedInMerchant", "Lcom/zettle/sdk/core/auth/Merchant;", "getCurrentMerchant", "()Lcom/zettle/sdk/core/auth/Merchant;", "currentMerchant"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MerchantProvider {
    com.zettle.sdk.core.auth.Merchant.LoggedIn getCurrentLoggedInMerchant();

    com.zettle.sdk.core.auth.Merchant getCurrentMerchant();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static com.zettle.sdk.core.auth.Merchant.LoggedIn getCurrentLoggedInMerchant(com.zettle.sdk.core.user.MerchantProvider merchantProvider) {
            com.zettle.sdk.core.auth.Merchant currentMerchant = merchantProvider.getCurrentMerchant();
            if (currentMerchant instanceof com.zettle.sdk.core.auth.Merchant.LoggedIn) {
                return (com.zettle.sdk.core.auth.Merchant.LoggedIn) currentMerchant;
            }
            return null;
        }
    }
}
