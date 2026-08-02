package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "stringId", "Ljava/lang/Integer;", "getStringId", "()Ljava/lang/Integer;", "Companion", "CREDIT", "DEBIT", "PREPAID", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardProductType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType CREDIT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType DEBIT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType PREPAID;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.Integer stringId;

    private CardProductType(java.lang.String str, int i, java.lang.Integer num) {
        this.stringId = num;
    }

    public final java.lang.Integer getStringId() {
        return this.stringId;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType("CREDIT", 0, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_credit));
        CREDIT = cardProductType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType("DEBIT", 1, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_debit));
        DEBIT = cardProductType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType("PREPAID", 2, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_prepaid));
        PREPAID = cardProductType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType("UNKNOWN", 3, null);
        UNKNOWN = cardProductType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType[] cardProductTypeArr = {cardProductType, cardProductType2, cardProductType3, cardProductType4};
        getHighResolutionOutputSizeshNQ4ISI = cardProductTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cardProductTypeArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType) obj;
            return cardProductType == null ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN : cardProductType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
