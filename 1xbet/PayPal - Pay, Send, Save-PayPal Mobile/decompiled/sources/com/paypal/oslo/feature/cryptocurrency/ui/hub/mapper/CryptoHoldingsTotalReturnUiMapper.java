package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingsTotalReturnUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;", "cryptoGainLossFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "input", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHoldingsTotalReturnUiMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CryptoHoldingsTotalReturnUiMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter cryptoGainLossFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoGainLossFormatter, "");
        this.getHighSpeedVideoSizes = cryptoGainLossFormatter;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState map(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn input) {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi cryptoGainOrLossStatusUi;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String format = this.getHighSpeedVideoSizes.format(input);
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus status = input.getStatus();
        int i = status == null ? -1 : com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            cryptoGainOrLossStatusUi = com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi.GAIN;
        } else if (i == 2) {
            cryptoGainOrLossStatusUi = com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi.LOSS;
        } else {
            cryptoGainOrLossStatusUi = com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi.NONE;
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState(format, cryptoGainOrLossStatusUi);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.GAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.LOSS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
