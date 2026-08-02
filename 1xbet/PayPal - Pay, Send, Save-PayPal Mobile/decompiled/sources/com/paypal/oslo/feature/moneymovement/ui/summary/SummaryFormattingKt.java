package com.paypal.oslo.feature.moneymovement.ui.summary;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0000\u001a'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\r\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\r\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"LocalMoneyAmountFormatter", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "getLocalMoneyAmountFormatter", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getTrailingAmountText", "", "amount", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "isInternationalFormat", "", "rememberFormattedAmount", "formatter", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;ZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberFormattedFee", "money-movement_prodRelease", "formatted"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SummaryFormattingKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getHighSpeedVideoSizes = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.$r8$lambda$VvyrEGfPOK58RzY0xxnnjSFhUew();
        }
    });

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter $r8$lambda$VvyrEGfPOK58RzY0xxnnjSFhUew() {
        return null;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getLocalMoneyAmountFormatter() {
        return getHighSpeedVideoSizes;
    }

    public static /* synthetic */ java.lang.String getTrailingAmountText$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return getTrailingAmountText(moneyAmount, z);
    }

    public static final java.lang.String getTrailingAmountText(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        if (com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()] == 1) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
            if (fiat == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String currencyCode = fiat.getCurrencyCode();
                java.util.Locale locale = java.util.Locale.ROOT;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = currencyCode.toUpperCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(upperCase).getSymbol());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.String currencyCode2 = fiat.getCurrencyCode();
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = currencyCode2;
            }
            java.lang.String str = (java.lang.String) m23436constructorimpl;
            if (z) {
                java.lang.String quantity = fiat.getQuantity();
                java.lang.String currencyCode3 = fiat.getCurrencyCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(quantity);
                sb.append(" ");
                sb.append(currencyCode3);
                return sb.toString();
            }
            java.lang.String quantity2 = fiat.getQuantity();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(quantity2);
            return sb2.toString();
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto = moneyAmount.getCrypto();
        java.lang.String quantity3 = crypto != null ? crypto.getQuantity() : null;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto2 = moneyAmount.getCrypto();
        java.lang.String assetSymbol = crypto2 != null ? crypto2.getAssetSymbol() : null;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(quantity3);
        sb3.append(" ");
        sb3.append(assetSymbol);
        return sb3.toString();
    }

    public static final java.lang.String rememberFormattedAmount(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, boolean z, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        composer.startReplaceGroup(1265952273);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1265952273, i, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.rememberFormattedAmount (SummaryFormatting.kt:75)");
        }
        java.lang.String trailingAmountText = getTrailingAmountText(moneyAmount, z);
        if (moneyAmountFormatter == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return trailingAmountText;
        }
        boolean changedInstance = composer.changedInstance(moneyAmountFormatter);
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(moneyAmount)) || (i & 6) == 4;
        int i2 = i & 896;
        if (((i2 ^ 384) <= 256 || !composer.changed(z)) && (i & 384) != 256) {
            z2 = false;
        }
        com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedAmount$formatted$2$1 rememberedValue = composer.rememberedValue();
        if ((changedInstance | z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedAmount$formatted$2$1(moneyAmountFormatter, moneyAmount, z, null);
            composer.updateRememberedValue(rememberedValue);
        }
        java.lang.String str = (java.lang.String) androidx.compose.runtime.SnapshotStateKt.produceState(trailingAmountText, moneyAmount, java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2) rememberedValue, composer, ((i << 3) & 112) | i2).getValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    public static final java.lang.String rememberFormattedFee(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, boolean z, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        composer.startReplaceGroup(1568770117);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1568770117, i, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.rememberFormattedFee (SummaryFormatting.kt:105)");
        }
        java.lang.String trailingAmountText = getTrailingAmountText(moneyAmount, z);
        if (moneyAmountFormatter == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return trailingAmountText;
        }
        boolean changedInstance = composer.changedInstance(moneyAmountFormatter);
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(moneyAmount)) || (i & 6) == 4;
        int i2 = i & 896;
        if (((i2 ^ 384) <= 256 || !composer.changed(z)) && (i & 384) != 256) {
            z2 = false;
        }
        com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1 rememberedValue = composer.rememberedValue();
        if ((changedInstance | z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1(moneyAmountFormatter, moneyAmount, z, null);
            composer.updateRememberedValue(rememberedValue);
        }
        java.lang.String str = (java.lang.String) androidx.compose.runtime.SnapshotStateKt.produceState(trailingAmountText, moneyAmount, java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2) rememberedValue, composer, ((i << 3) & 112) | i2).getValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
