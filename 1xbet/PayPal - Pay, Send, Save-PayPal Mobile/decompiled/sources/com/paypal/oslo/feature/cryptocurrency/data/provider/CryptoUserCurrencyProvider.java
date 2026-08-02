package com.paypal.oslo.feature.cryptocurrency.data.provider;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/provider/CryptoUserCurrencyProvider;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "<init>", "()V", "", "getCurrencyCode", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoUserCurrencyProvider implements com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CryptoUserCurrencyProvider() {
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider
    public final java.lang.String getCurrencyCode() {
        return "USD";
    }
}
