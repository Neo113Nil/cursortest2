package com.paypal.oslo.feature.cryptocurrency.ui.details.components;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u001aß\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0001¢\u0006\u0002\u0010#\u001a$\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002\u001a;\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010'\u001a\u0085\u0001\u0010(\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t26\u0010+\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010-\u001a)\u0010.\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010/\u001a\r\u00100\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a1\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0002\u00105\u001a@\u00108\u001a\u0004\u0018\u0001092\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\r\u0010A\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a\r\u0010B\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a\r\u0010C\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a\r\u0010D\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\"\u000e\u00106\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"AssetPriceDetailsCard", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/AssetPriceDetailsData;", "priceHistoryData", "Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;", "chartInteractionData", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;", "selectedTimeframeIndex", "", "onTimeframeSelect", "Lkotlin/Function1;", "onChartDataPointSelect", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "timestamp", "", "price", "onChartSelectionClear", "Lkotlin/Function0;", "timeframeChangeData", "onBuyClick", "onSellClick", "isRecurringBuysEnabled", "", "currencyCode", "", "cryptoPriceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "timeframeForChangeData", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/AssetPriceDetailsData;Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;Landroidx/compose/runtime/Composer;III)V", "resolveDisplayData", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/PriceDisplayData;", "AssetPriceHeader", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/AssetPriceDetailsData;Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;ILandroidx/compose/runtime/Composer;I)V", "AssetPriceChartSection", "isPositiveChange", "assetName", "onDataPointSelect", "onSelectionClear", "(Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;ZLjava/lang/String;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Landroidx/compose/runtime/Composer;I)V", "TimeframeSelector", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RecurringBuysRow", "(Landroidx/compose/runtime/Composer;I)V", "CryptoAssetCapabilitiesRow", "actionsState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsCardActionsUiState;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsCardActionsUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChartSegmentCount", "SegmentCenterOffset", "buildChartAccessibilityInfo", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", "chartSummaryFormat", "dataPoints", "", "Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "includeTime", "previewBitcoinGain", "previewBitcoinLoss", "AssetPriceDetailsCardGainPreview", "AssetPriceDetailsCardLossPreview", "AssetPriceDetailsCardLoadingChartPreview", "AssetPriceDetailsCardWithChartDataPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AssetPriceDetailsCardKt {
    private static final com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData("Bitcoin", "BTC", "$67,234.56", "1.87%", "↑ +$1,234.78", true, "https://www.paypalobjects.com/cryptocurrency/coin-bitcoin.png", new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState(true, true, false, false, false, 24, null));
    private static final com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData("Bitcoin", "BTC", "$63,892.14", "2.45%", "↓ $1,567.23", false, "https://www.paypalobjects.com/cryptocurrency/coin-bitcoin.png", new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState(true, true, false, false, false, 24, null));

    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetPriceDetailsCard(final com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData, final com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, final com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Double, kotlin.Unit> function2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData2, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final boolean z, final java.lang.String str, final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPriceDetailsData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1914597949);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(assetPriceDetailsData) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? startRestartGroup.changed(timeSeriesData) : startRestartGroup.changedInstance(timeSeriesData) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(chartInteractionData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= startRestartGroup.changed(chartInteractionData2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changedInstance(function03) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= startRestartGroup.changed(cryptoPriceFormatter) ? 256 : 128;
        }
        int i8 = i6;
        int i9 = i4 & 8192;
        if (i9 != 0) {
            i8 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i8 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i7 = i4 & 16384;
            if (i7 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i8 |= startRestartGroup.changed(priceTimeRange == null ? -1 : priceTimeRange.ordinal()) ? 16384 : 8192;
            }
            if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i8 & 9363) != 9362, i5 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
                priceTimeRange2 = priceTimeRange;
            } else {
                androidx.compose.ui.Modifier modifier3 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange3 = i7 != 0 ? null : priceTimeRange;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1914597949, i5, i8, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCard (AssetPriceDetailsCard.kt:98)");
                }
                final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange4 = priceTimeRange3;
                modifier2 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1711164317, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.m13896$r8$lambda$gqsNGUfiCBQ4PSFSbzizTZ8NCs(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData.this, chartInteractionData, chartInteractionData2, priceTimeRange4, i, timeSeriesData, function2, function0, str, cryptoPriceFormatter, function1, z, function02, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, 500);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                priceTimeRange2 = priceTimeRange3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$03bsyiBigsj5lO32ofAsvZPN1yg(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData.this, timeSeriesData, chartInteractionData, i, function1, function2, function0, chartInteractionData2, function02, function03, z, str, cryptoPriceFormatter, modifier4, priceTimeRange2, i2, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 = i4 & 16384;
        if (i7 == 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i8 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final com.paypal.oslo.feature.cryptocurrency.ui.details.components.PriceDisplayData getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData2) {
        java.lang.String currentPrice;
        java.lang.String changeAmountWithIndicator;
        java.lang.String changePercentage;
        if (chartInteractionData != null) {
            chartInteractionData2 = chartInteractionData;
        }
        if (chartInteractionData == null || (currentPrice = chartInteractionData.getSelectedPrice()) == null) {
            currentPrice = assetPriceDetailsData.getCurrentPrice();
        }
        if (chartInteractionData2 == null || (changeAmountWithIndicator = chartInteractionData2.getChangeAmountWithIndicator()) == null) {
            changeAmountWithIndicator = assetPriceDetailsData.getChangeAmountWithIndicator();
        }
        if (chartInteractionData2 == null || (changePercentage = chartInteractionData2.getChangePercentage()) == null) {
            changePercentage = assetPriceDetailsData.getChangePercentage();
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.components.PriceDisplayData(currentPrice, changeAmountWithIndicator, changePercentage, chartInteractionData2 != null ? chartInteractionData2.isPositiveChange() : assetPriceDetailsData.isPositiveChange());
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData, final com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, final com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData2, final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, final int i, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        com.paypal.pds.core.Color.ContentRoleBaseNegative contentRoleBaseNegative;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1864515349);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(assetPriceDetailsData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(chartInteractionData) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(chartInteractionData2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(priceTimeRange == null ? -1 : priceTimeRange.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1864515349, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceHeader (AssetPriceDetailsCard.kt:185)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.components.PriceDisplayData highSpeedVideoSizes = getHighSpeedVideoSizes(assetPriceDetailsData, chartInteractionData, chartInteractionData2);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(assetPriceDetailsData.getAssetName(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(highSpeedVideoSizes.Camera2StreamConfigurationMap, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            java.lang.String str = highSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str2 = highSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" (");
            sb.append(str2);
            sb.append(")");
            java.lang.String obj = sb.toString();
            if (highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor) {
                contentRoleBaseNegative = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
            } else {
                contentRoleBaseNegative = com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE;
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(obj, null, contentRoleBaseNegative, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, startRestartGroup, 0, 6, 1018);
            int ordinal = (chartInteractionData != null || chartInteractionData2 == null || priceTimeRange == null) ? i : priceTimeRange.ordinal();
            if (ordinal == 0) {
                startRestartGroup.startReplaceGroup(-326456596);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_24_hours, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (ordinal == 1) {
                startRestartGroup.startReplaceGroup(-326453496);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_week, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (ordinal == 2) {
                startRestartGroup.startReplaceGroup(-326450519);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_month, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (ordinal == 3) {
                startRestartGroup.startReplaceGroup(-326447508);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_6_months, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (ordinal == 4) {
                startRestartGroup.startReplaceGroup(-326444408);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_year, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (ordinal == 5) {
                startRestartGroup.startReplaceGroup(-326441433);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_all_time, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-326438388);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_24_hours, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoAvatarKt.CryptoAvatar(assetPriceDetailsData.getLogoUrl(), assetPriceDetailsData.getAssetName(), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$Oo9CUz9fXtC0YYcbW__vCzDa4HU(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData.this, chartInteractionData, chartInteractionData2, priceTimeRange, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, final boolean z, final java.lang.String str, final int i, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Double, kotlin.Unit> function2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str2, final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1989652485);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? startRestartGroup.changed(timeSeriesData) : startRestartGroup.changedInstance(timeSeriesData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changed(cryptoPriceFormatter) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1989652485, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceChartSection (AssetPriceDetailsCard.kt:261)");
            }
            if (i != 0) {
                if (i == 1) {
                    i4 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_chart_summary_1w;
                } else if (i == 2) {
                    i4 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_chart_summary_1m;
                } else if (i == 3) {
                    i4 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_chart_summary_6m;
                } else if (i == 4) {
                    i4 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_chart_summary_1y;
                } else if (i == 5) {
                    i4 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_chart_summary_all;
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, startRestartGroup, 0);
                int i5 = i3 & 14;
                z2 = i5 != 4 || ((i3 & 8) != 0 && startRestartGroup.changed(timeSeriesData));
                z3 = (i3 & 896) != 256;
                z4 = (i3 & 7168) != 2048;
                z5 = (3670016 & i3) != 1048576;
                changed = startRestartGroup.changed(stringResource);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(z2 | z3 | z4 | z5 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    if (timeSeriesData == null) {
                        rememberedValue = getHighSpeedVideoSizes(str, stringResource, timeSeriesData.getDataPoints(), i <= 1, str2, cryptoPriceFormatter);
                    } else {
                        rememberedValue = null;
                    }
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo = (com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo) rememberedValue;
                if (timeSeriesData == null) {
                    startRestartGroup.startReplaceGroup(1108070474);
                    com.paypal.oslo.core.commonui.components.chart.PriceChartKt.PriceChart(timeSeriesData, androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(155.0f)), z ? com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.Positive.INSTANCE : com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.Negative.INSTANCE, priceChartAccessibilityInfo, function2, function0, startRestartGroup, (458752 & i3) | i5 | com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.$stable | 48 | (com.paypal.oslo.core.commonui.components.chart.PriceChartStyle.$stable << 6) | (com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo.$stable << 9) | (i3 & 57344), 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1108485719);
                    androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(155.0f));
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1726height3ABfNKs);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_chart_summary_24h;
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, startRestartGroup, 0);
            int i52 = i3 & 14;
            if (i52 != 4) {
            }
            if ((i3 & 896) != 256) {
            }
            if ((i3 & 7168) != 2048) {
            }
            if ((3670016 & i3) != 1048576) {
            }
            changed = startRestartGroup.changed(stringResource2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(z2 | z3 | z4 | z5 | changed)) {
            }
            if (timeSeriesData == null) {
            }
            startRestartGroup.updateRememberedValue(rememberedValue);
            com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo2 = (com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo) rememberedValue;
            if (timeSeriesData == null) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.m13894$r8$lambda$NhPi6krGveIYTpo5fQlq0oNXuA(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.this, z, str, i, function2, function0, str2, cryptoPriceFormatter, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2066510631);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2066510631, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeSelector (AssetPriceDetailsCard.kt:321)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt.TimeframeButtonGroup(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_timeframe_24h, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_timeframe_1w, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_timeframe_1m, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_timeframe_6m, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_timeframe_1y, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_timeframe_all, startRestartGroup, 0)}), i, function1, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_24_hours, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_week, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_month, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_6_months, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_past_year, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_all_time, startRestartGroup, 0)}), startRestartGroup, (i3 << 3) & 1008, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.m13889$r8$lambda$Mk_OYDgW8z3EOhRfl0t9XGu58(i, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-238485826);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-238485826, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.RecurringBuysRow (AssetPriceDetailsCard.kt:345)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_recurring_buys, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_status_off, composer2, 0), null, com.paypal.pds.components.BadgeStyle.Warning.INSTANCE, null, null, null, null, composer2, 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            composer2.endNode();
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_recurring_buys_details, composer2, 0), null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer2, 27654, 4);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$O1l3lQcYMXLj80_8Kammk4zjNUE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState assetPriceDetailsCardActionsUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-814491040);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(assetPriceDetailsCardActionsUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-814491040, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetCapabilitiesRow (AssetPriceDetailsCard.kt:383)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (assetPriceDetailsCardActionsUiState.getShowSellButton()) {
                startRestartGroup.startReplaceGroup(672272202);
                i3 = i4;
                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_sell_button, startRestartGroup, 0), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i4 >> 6) & 14) | 1769472, 408);
                startRestartGroup.endReplaceGroup();
                startRestartGroup = startRestartGroup;
            } else {
                i3 = i4;
                startRestartGroup.startReplaceGroup(672555046);
                startRestartGroup.endReplaceGroup();
            }
            if (assetPriceDetailsCardActionsUiState.getShowBuyButton()) {
                startRestartGroup.startReplaceGroup(672620487);
                androidx.compose.runtime.Composer composer3 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_buy_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), "crypto_details_buy_button"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i3 >> 3) & 14) | 1769472, 408);
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(672936966);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.m13891$r8$lambda$4x1crNJTnYb__qya1UUEeMRlNM(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> list, boolean z, java.lang.String str3, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        if (list.isEmpty()) {
            return null;
        }
        java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        double price = ((com.paypal.oslo.core.commonui.components.chart.PriceDataPoint) it.next()).getPrice();
        while (it.hasNext()) {
            price = java.lang.Math.max(price, ((com.paypal.oslo.core.commonui.components.chart.PriceDataPoint) it.next()).getPrice());
        }
        java.util.Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        double price2 = ((com.paypal.oslo.core.commonui.components.chart.PriceDataPoint) it2.next()).getPrice();
        while (it2.hasNext()) {
            price2 = java.lang.Math.min(price2, ((com.paypal.oslo.core.commonui.components.chart.PriceDataPoint) it2.next()).getPrice());
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{str, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, java.lang.String.valueOf(price), str3, null, false, false, 28, null), com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, java.lang.String.valueOf(price2), str3, null, false, false, 28, null)}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(z ? "MMMM d, yyyy, h:mm a" : com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting.DATE_DISPLAY_FORMAT, java.util.Locale.getDefault());
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(10, list.size());
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, coerceAtMost);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it3 = until.iterator();
        while (it3.hasNext()) {
            com.paypal.oslo.core.commonui.components.chart.PriceDataPoint priceDataPoint = list.get(kotlin.ranges.RangesKt.coerceIn((int) (((((kotlin.collections.IntIterator) it3).nextInt() + 0.5d) / coerceAtMost) * list.size()), 0, list.size() - 1));
            java.lang.String format2 = simpleDateFormat.format(new java.util.Date(priceDataPoint.getTimestamp()));
            java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, java.lang.String.valueOf(priceDataPoint.getPrice()), str3, null, false, false, 28, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(format2);
            sb.append(", ");
            sb.append(formatPrice$default);
            arrayList.add(sb.toString());
        }
        return new com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo(format, arrayList);
    }

    /* renamed from: $r8$lambda$-Mk_OY-DgW8z3EOhRfl0t9XGu58, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13889$r8$lambda$Mk_OYDgW8z3EOhRfl0t9XGu58(int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$03bsyiBigsj5lO32ofAsvZPN1yg(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData, com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData2, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, boolean z, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        AssetPriceDetailsCard(assetPriceDetailsData, timeSeriesData, chartInteractionData, i, function1, function2, function0, chartInteractionData2, function02, function03, z, str, cryptoPriceFormatter, modifier, priceTimeRange, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$09_FwKlM_dNK0t13gi8va1tc388(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-138781951);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-138781951, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardLoadingChartPreview (AssetPriceDetailsCard.kt:533)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData = getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit unit;
                        ((java.lang.Long) obj).longValue();
                        ((java.lang.Double) obj2).doubleValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            AssetPriceDetailsCard(assetPriceDetailsData, null, null, 0, function1, function2, function0, null, function02, function03, false, "USD", cryptoPriceFormatter, null, null, composer2, 920350134, 54, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$09_FwKlM_dNK0t13gi8va1tc388(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4x1crNJTnYb__qya1UU-EeMRlNM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13891$r8$lambda$4x1crNJTnYb__qya1UUEeMRlNM(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState assetPriceDetailsCardActionsUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(assetPriceDetailsCardActionsUiState, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A5wGukiccmExslSH2waaANFvXYI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(425237410);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(425237410, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardLossPreview (AssetPriceDetailsCard.kt:510)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData = Camera2StreamConfigurationMap;
            com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData = (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData) kotlin.collections.MapsKt.getValue(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.Companion.mockBitcoinTimeSeries$default(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.INSTANCE, 0L, 1, null), "1W");
            com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit unit;
                        ((java.lang.Long) obj).longValue();
                        ((java.lang.Double) obj2).doubleValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            AssetPriceDetailsCard(assetPriceDetailsData, timeSeriesData, null, 1, function1, function2, function0, null, function02, (kotlin.jvm.functions.Function0) rememberedValue5, true, "USD", cryptoPriceFormatter, null, null, composer2, (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.$stable << 3) | 920350086, 54, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$A5wGukiccmExslSH2waaANFvXYI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N-hPi6krGveIYTpo5fQlq0oNXuA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13894$r8$lambda$NhPi6krGveIYTpo5fQlq0oNXuA(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, boolean z, java.lang.String str, int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(timeSeriesData, z, str, i, function2, function0, str2, cryptoPriceFormatter, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nlez8LamPILFZx1t1cBDS6VnQXI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1394962315);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1394962315, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardWithChartDataPreview (AssetPriceDetailsCard.kt:556)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData = getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData = (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData) kotlin.collections.MapsKt.getValue(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.Companion.mockBitcoinTimeSeries$default(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.INSTANCE, 0L, 1, null), "1M");
            com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit unit;
                        ((java.lang.Long) obj).longValue();
                        ((java.lang.Double) obj2).doubleValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            AssetPriceDetailsCard(assetPriceDetailsData, timeSeriesData, null, 2, function1, function2, function0, null, function02, (kotlin.jvm.functions.Function0) rememberedValue5, false, "USD", cryptoPriceFormatter, null, null, composer2, (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.$stable << 3) | 920350086, 54, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$Nlez8LamPILFZx1t1cBDS6VnQXI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O1l3lQcYMXLj80_8Kammk4zjNUE(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Oo9CUz9fXtC0YYcbW__vCzDa4HU(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData2, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(assetPriceDetailsData, chartInteractionData, chartInteractionData2, priceTimeRange, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gqsNGUfiCBQ4PSFSbzizTZ8N-Cs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13896$r8$lambda$gqsNGUfiCBQ4PSFSbzizTZ8NCs(com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData2, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, int i, com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, kotlin.jvm.functions.Function1 function1, boolean z, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1711164317, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCard.<anonymous> (AssetPriceDetailsCard.kt:104)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            getHighResolutionOutputSizeshNQ4ISI(assetPriceDetailsData, chartInteractionData, chartInteractionData2, priceTimeRange, i, composer, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData3 = chartInteractionData == null ? chartInteractionData2 : chartInteractionData;
            Camera2StreamConfigurationMap(timeSeriesData, chartInteractionData3 != null ? chartInteractionData3.isPositiveChange() : assetPriceDetailsData.isPositiveChange(), assetPriceDetailsData.getAssetName(), i, function2, function0, str, cryptoPriceFormatter, composer, com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.$stable);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            getHighSpeedVideoFpsRangesFor(i, function1, composer, 0);
            if (z) {
                composer.startReplaceGroup(1536549418);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing28()), composer, 0);
                getHighSpeedVideoFpsRanges(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1536658011);
                composer.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing28()), composer, 0);
            com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState assetPriceDetailsCardActionsUiState = assetPriceDetailsData.getAssetPriceDetailsCardActionsUiState();
            if (assetPriceDetailsCardActionsUiState == null) {
                composer.startReplaceGroup(1536779747);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1536779748);
                getHighResolutionOutputSizeshNQ4ISI(assetPriceDetailsCardActionsUiState, function02, function03, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gsBo4YLEl9owmjSK3_D_Dw1rqNk(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1738201602);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1738201602, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardGainPreview (AssetPriceDetailsCard.kt:486)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceDetailsData = getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData = (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData) kotlin.collections.MapsKt.getValue(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.Companion.mockBitcoinTimeSeries$default(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.INSTANCE, 0L, 1, null), "24H");
            com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit unit;
                        ((java.lang.Long) obj).longValue();
                        ((java.lang.Double) obj2).doubleValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            AssetPriceDetailsCard(assetPriceDetailsData, timeSeriesData, null, 0, function1, function2, function0, null, function02, (kotlin.jvm.functions.Function0) rememberedValue5, true, "USD", cryptoPriceFormatter, null, null, composer2, (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.$stable << 3) | 920350086, 54, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsCardKt.$r8$lambda$gsBo4YLEl9owmjSK3_D_Dw1rqNk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
