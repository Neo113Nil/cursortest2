package com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/TokenType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "BILLING", "ONETIME", "VAULTING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TokenType {
    public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType BILLING;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType ONETIME;
    public static final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType VAULTING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType[] getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private TokenType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType tokenType = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType("BILLING", 0, "billing");
        BILLING = tokenType;
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType tokenType2 = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType("ONETIME", 1, "onetime");
        ONETIME = tokenType2;
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType tokenType3 = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType("VAULTING", 2, "vaulting");
        VAULTING = tokenType3;
        com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType[] tokenTypeArr = {tokenType, tokenType2, tokenType3};
        getHighSpeedVideoFpsRanges = tokenTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tokenTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/TokenType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/TokenType;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/TokenType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType fromValue(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType) obj).getValue(), value)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.TokenType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
