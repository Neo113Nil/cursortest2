package com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "MDES", "VTS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TokenServiceProvider {
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider MDES;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider UNKNOWN__;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider VTS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private TokenServiceProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider("MDES", 0);
        MDES = tokenServiceProvider;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider("VTS", 1);
        VTS = tokenServiceProvider2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider("UNKNOWN__", 2);
        UNKNOWN__ = tokenServiceProvider3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider[] tokenServiceProviderArr = {tokenServiceProvider, tokenServiceProvider2, tokenServiceProvider3};
        Camera2StreamConfigurationMap = tokenServiceProviderArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tokenServiceProviderArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider) obj;
            return tokenServiceProvider == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.UNKNOWN__ : tokenServiceProvider;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
