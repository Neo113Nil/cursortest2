package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "INSTANT", "STANDARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentMode {
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode INSTANT;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode STANDARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private FundingInstrumentMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode("INSTANT", 0);
        INSTANT = fundingInstrumentMode;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode2 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode("STANDARD", 1);
        STANDARD = fundingInstrumentMode2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode[] fundingInstrumentModeArr = {fundingInstrumentMode, fundingInstrumentMode2};
        Camera2StreamConfigurationMap = fundingInstrumentModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentModeArr);
        INSTANCE = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "fromStringOrDefault", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fromStringOrDefault(java.lang.String value) {
            java.lang.Object m23436constructorimpl;
            java.lang.String str = value;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.STANDARD;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.Companion companion2 = this;
                java.lang.String upperCase = value.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.STANDARD;
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = fundingInstrumentMode;
            }
            return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode) m23436constructorimpl;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
