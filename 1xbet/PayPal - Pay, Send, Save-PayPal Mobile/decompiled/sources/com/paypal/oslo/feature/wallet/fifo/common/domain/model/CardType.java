package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CREDIT", "DEBIT", "PREPAID", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardType {
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType CREDIT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType DEBIT;
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType PREPAID;
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType[] getHighSpeedVideoSizes;

    private CardType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType("CREDIT", 0);
        CREDIT = cardType;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType2 = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType("DEBIT", 1);
        DEBIT = cardType2;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType3 = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType("PREPAID", 2);
        PREPAID = cardType3;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType4 = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType("UNKNOWN", 3);
        UNKNOWN = cardType4;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType[] cardTypeArr = {cardType, cardType2, cardType3, cardType4};
        getHighSpeedVideoSizes = cardTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cardTypeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType) obj;
            return cardType == null ? com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType.UNKNOWN : cardType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
