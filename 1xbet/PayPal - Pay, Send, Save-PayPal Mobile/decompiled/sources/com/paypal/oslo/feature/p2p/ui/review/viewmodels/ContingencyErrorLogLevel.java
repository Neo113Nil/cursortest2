package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContingencyErrorLogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARN", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContingencyErrorLogLevel {
    public static final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel ERROR;
    public static final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel WARN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ContingencyErrorLogLevel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel contingencyErrorLogLevel = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel("WARN", 0);
        WARN = contingencyErrorLogLevel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel contingencyErrorLogLevel2 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel("ERROR", 1);
        ERROR = contingencyErrorLogLevel2;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel[] contingencyErrorLogLevelArr = {contingencyErrorLogLevel, contingencyErrorLogLevel2};
        getHighResolutionOutputSizeshNQ4ISI = contingencyErrorLogLevelArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(contingencyErrorLogLevelArr);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel[] values() {
        return (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
