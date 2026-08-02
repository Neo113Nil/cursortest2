package com.paypal.oslo.feature.p2p.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/common/util/CurrencyFlagHelper;", "", "<init>", "()V", "", "code", "getFlagEmoji", "(Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyFlagHelper {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper.Companion Companion = new com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper.Companion(null);
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("US", "🇺🇸"), kotlin.TuplesKt.to("USD", "🇺🇸"), kotlin.TuplesKt.to("GB", "🇬🇧"), kotlin.TuplesKt.to("GBP", "🇬🇧"), kotlin.TuplesKt.to("EU", "🇪🇺"), kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "🇪🇺"));

    @javax.inject.Inject
    public CurrencyFlagHelper() {
    }

    public final java.lang.String getFlagEmoji(java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        java.lang.String str = getHighSpeedVideoSizes.get(code);
        return str == null ? "🏳️" : str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/common/util/CurrencyFlagHelper$Companion;", "", "<init>", "()V", "", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
