package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/FiLinkError;", "", "<init>", "(Ljava/lang/String;I)V", "NONE_FOUND", "PARTIALLY_LINKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiLinkError {
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError NONE_FOUND;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError PARTIALLY_LINKED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private FiLinkError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError("NONE_FOUND", 0);
        NONE_FOUND = fiLinkError;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError2 = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError("PARTIALLY_LINKED", 1);
        PARTIALLY_LINKED = fiLinkError2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError[] fiLinkErrorArr = {fiLinkError, fiLinkError2};
        Camera2StreamConfigurationMap = fiLinkErrorArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fiLinkErrorArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
