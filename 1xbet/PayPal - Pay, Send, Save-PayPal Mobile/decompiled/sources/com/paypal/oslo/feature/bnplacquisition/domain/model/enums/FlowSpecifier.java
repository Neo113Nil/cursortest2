package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "", "<init>", "(Ljava/lang/String;I)V", "STANDALONE_APPLICATION", "SELF_SERVICING", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowSpecifier {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier SELF_SERVICING;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier STANDALONE_APPLICATION;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private FlowSpecifier(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier("STANDALONE_APPLICATION", 0);
        STANDALONE_APPLICATION = flowSpecifier;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier("SELF_SERVICING", 1);
        SELF_SERVICING = flowSpecifier2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier("UNKNOWN__", 2);
        UNKNOWN__ = flowSpecifier3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier[] flowSpecifierArr = {flowSpecifier, flowSpecifier2, flowSpecifier3};
        getHighResolutionOutputSizeshNQ4ISI = flowSpecifierArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(flowSpecifierArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
