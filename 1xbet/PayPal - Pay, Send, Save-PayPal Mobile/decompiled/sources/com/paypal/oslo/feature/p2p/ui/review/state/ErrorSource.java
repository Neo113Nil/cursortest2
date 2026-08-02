package com.paypal.oslo.feature.p2p.ui.review.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/ErrorSource;", "", "<init>", "(Ljava/lang/String;I)V", "CONTACT", "REVIEW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorSource {
    public static final com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource CONTACT;
    public static final com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource REVIEW;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ErrorSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource errorSource = new com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource("CONTACT", 0);
        CONTACT = errorSource;
        com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource errorSource2 = new com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource("REVIEW", 1);
        REVIEW = errorSource2;
        com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource[] errorSourceArr = {errorSource, errorSource2};
        getHighSpeedVideoFpsRanges = errorSourceArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(errorSourceArr);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource[] values() {
        return (com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
