package com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "APPLE_WALLET", "GOOGLE_WALLET", "NFC_WALLET", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WalletProviderType {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType APPLE_WALLET;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType GOOGLE_WALLET;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType NFC_WALLET;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private WalletProviderType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType("APPLE_WALLET", 0);
        APPLE_WALLET = walletProviderType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType("GOOGLE_WALLET", 1);
        GOOGLE_WALLET = walletProviderType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType("NFC_WALLET", 2);
        NFC_WALLET = walletProviderType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType("UNKNOWN__", 3);
        UNKNOWN__ = walletProviderType4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType[] walletProviderTypeArr = {walletProviderType, walletProviderType2, walletProviderType3, walletProviderType4};
        Camera2StreamConfigurationMap = walletProviderTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(walletProviderTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/WalletProviderType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType walletProviderType = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType) obj;
            return walletProviderType == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.UNKNOWN__ : walletProviderType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
