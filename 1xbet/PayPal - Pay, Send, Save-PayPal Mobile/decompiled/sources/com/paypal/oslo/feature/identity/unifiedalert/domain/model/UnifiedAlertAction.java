package com.paypal.oslo.feature.identity.unifiedalert.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;", "", "<init>", "(Ljava/lang/String;I)V", "APPROVED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnifiedAlertAction {
    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction APPROVED;
    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction DENIED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction[] getHighSpeedVideoSizes;

    private UnifiedAlertAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction("APPROVED", 0);
        APPROVED = unifiedAlertAction;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction2 = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 1);
        DENIED = unifiedAlertAction2;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction[] unifiedAlertActionArr = {unifiedAlertAction, unifiedAlertAction2};
        getHighSpeedVideoSizes = unifiedAlertActionArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(unifiedAlertActionArr);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction[] values() {
        return (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
