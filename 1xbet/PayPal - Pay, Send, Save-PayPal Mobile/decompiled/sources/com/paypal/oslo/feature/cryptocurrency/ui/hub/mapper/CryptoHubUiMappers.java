package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHubUiMappers;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingUiMapper;", "cryptoHoldingUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoMarketPriceUiMapper;", "cryptoMarketPriceUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingsTotalReturnUiMapper;", "cryptoHoldingsTotalReturnUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/HoldingsCardActionsUiMapper;", "holdingsCardActionsUiMapper", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoMarketPriceUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingsTotalReturnUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/HoldingsCardActionsUiMapper;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingUiMapper;", "getCryptoHoldingUiMapper", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingUiMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoMarketPriceUiMapper;", "getCryptoMarketPriceUiMapper", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoMarketPriceUiMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingsTotalReturnUiMapper;", "getCryptoHoldingsTotalReturnUiMapper", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingsTotalReturnUiMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/HoldingsCardActionsUiMapper;", "getHoldingsCardActionsUiMapper", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/HoldingsCardActionsUiMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHubUiMappers {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper cryptoHoldingUiMapper;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper cryptoHoldingsTotalReturnUiMapper;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper cryptoMarketPriceUiMapper;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper holdingsCardActionsUiMapper;

    @javax.inject.Inject
    public CryptoHubUiMappers(com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper cryptoHoldingUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper cryptoMarketPriceUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper cryptoHoldingsTotalReturnUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper holdingsCardActionsUiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoMarketPriceUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsTotalReturnUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdingsCardActionsUiMapper, "");
        this.cryptoHoldingUiMapper = cryptoHoldingUiMapper;
        this.cryptoMarketPriceUiMapper = cryptoMarketPriceUiMapper;
        this.cryptoHoldingsTotalReturnUiMapper = cryptoHoldingsTotalReturnUiMapper;
        this.holdingsCardActionsUiMapper = holdingsCardActionsUiMapper;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper getCryptoHoldingUiMapper() {
        return this.cryptoHoldingUiMapper;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper getCryptoMarketPriceUiMapper() {
        return this.cryptoMarketPriceUiMapper;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper getCryptoHoldingsTotalReturnUiMapper() {
        return this.cryptoHoldingsTotalReturnUiMapper;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper getHoldingsCardActionsUiMapper() {
        return this.holdingsCardActionsUiMapper;
    }
}
