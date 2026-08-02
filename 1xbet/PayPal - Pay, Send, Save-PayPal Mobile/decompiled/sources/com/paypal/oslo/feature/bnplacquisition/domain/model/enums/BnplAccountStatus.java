package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/BnplAccountStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplAccountStatus {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus ACTIVE;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus PENDING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private BnplAccountStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus bnplAccountStatus = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = bnplAccountStatus;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus bnplAccountStatus2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1);
        PENDING = bnplAccountStatus2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus[] bnplAccountStatusArr = {bnplAccountStatus, bnplAccountStatus2};
        Camera2StreamConfigurationMap = bnplAccountStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(bnplAccountStatusArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
