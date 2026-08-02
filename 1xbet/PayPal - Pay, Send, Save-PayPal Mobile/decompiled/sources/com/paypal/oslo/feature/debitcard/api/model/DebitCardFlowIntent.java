package com.paypal.oslo.feature.debitcard.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "REQUEST_PHYSICAL_CARD", "STAR_PAY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardFlowIntent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent REQUEST_PHYSICAL_CARD;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent STAR_PAY;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private DebitCardFlowIntent(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent("REQUEST_PHYSICAL_CARD", 0, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REQUEST_PHYSICAL_CARD_FEATURE);
        REQUEST_PHYSICAL_CARD = debitCardFlowIntent;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent2 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent("STAR_PAY", 1, "star_pay");
        STAR_PAY = debitCardFlowIntent2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent3 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent("UNKNOWN", 2, "unknown");
        UNKNOWN = debitCardFlowIntent3;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent[] debitCardFlowIntentArr = {debitCardFlowIntent, debitCardFlowIntent2, debitCardFlowIntent3};
        getHighSpeedVideoFpsRanges = debitCardFlowIntentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(debitCardFlowIntentArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent = (com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent) obj;
            return debitCardFlowIntent == null ? com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.UNKNOWN : debitCardFlowIntent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent[] values() {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
