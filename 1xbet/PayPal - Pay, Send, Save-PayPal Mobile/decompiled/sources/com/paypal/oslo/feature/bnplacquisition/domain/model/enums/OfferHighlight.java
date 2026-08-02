package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/OfferHighlight;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "LOWEST_MONTHLY_COST", "LOWEST_TOTAL_COST", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OfferHighlight {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight LOWEST_MONTHLY_COST;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight LOWEST_TOTAL_COST;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private OfferHighlight(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight offerHighlight = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight("LOWEST_MONTHLY_COST", 0, "LOWEST_MONTHLY_COST");
        LOWEST_MONTHLY_COST = offerHighlight;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight offerHighlight2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight("LOWEST_TOTAL_COST", 1, "LOWEST_TOTAL_COST");
        LOWEST_TOTAL_COST = offerHighlight2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight offerHighlight3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = offerHighlight3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight[] offerHighlightArr = {offerHighlight, offerHighlight2, offerHighlight3};
        getHighSpeedVideoFpsRanges = offerHighlightArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(offerHighlightArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/OfferHighlight$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/OfferHighlight;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/OfferHighlight;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight) obj).getValue(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight offerHighlight = (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight) obj;
            return offerHighlight == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.UNKNOWN__ : offerHighlight;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.OfferHighlight> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
