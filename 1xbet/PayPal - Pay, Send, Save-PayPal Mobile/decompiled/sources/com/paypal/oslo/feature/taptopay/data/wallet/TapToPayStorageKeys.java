package com.paypal.oslo.feature.taptopay.data.wallet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/wallet/TapToPayStorageKeys;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "SELECTED_VENDOR", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getSELECTED_VENDOR", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPayStorageKeys {
    public static final com.paypal.oslo.feature.taptopay.data.wallet.TapToPayStorageKeys INSTANCE = new com.paypal.oslo.feature.taptopay.data.wallet.TapToPayStorageKeys();
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted SELECTED_VENDOR = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted(com.paypal.android.taptopay.domain.di.ImplementationSelector.KEY_SELECTED_VENDOR);
    public static final int $stable = 8;

    private TapToPayStorageKeys() {
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getSELECTED_VENDOR() {
        return SELECTED_VENDOR;
    }
}
