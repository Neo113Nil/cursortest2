package com.paypal.oslo.feature.businesshome.data.local;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorageKeys;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "DISMISSED_CARDS", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getDISMISSED_CARDS", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DismissedCardsStorageKeys {
    public static final com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageKeys INSTANCE = new com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageKeys();
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted DISMISSED_CARDS = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("dismissed_engagement_cards");
    public static final int $stable = 8;

    private DismissedCardsStorageKeys() {
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getDISMISSED_CARDS() {
        return DISMISSED_CARDS;
    }
}
