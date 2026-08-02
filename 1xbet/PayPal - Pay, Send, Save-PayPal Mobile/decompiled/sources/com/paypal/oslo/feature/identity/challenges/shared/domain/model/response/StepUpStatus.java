package com.paypal.oslo.feature.identity.challenges.shared.domain.model.response;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/StepUpStatus;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "IN_PROGRESS", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepUpStatus {
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus COMPLETED;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus DEFAULT;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus FAILED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus IN_PROGRESS;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus PENDING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private StepUpStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus stepUpStatus = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus("DEFAULT", 0);
        DEFAULT = stepUpStatus;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus stepUpStatus2 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1);
        PENDING = stepUpStatus2;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus stepUpStatus3 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus("IN_PROGRESS", 2);
        IN_PROGRESS = stepUpStatus3;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus stepUpStatus4 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus("COMPLETED", 3);
        COMPLETED = stepUpStatus4;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus stepUpStatus5 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 4);
        FAILED = stepUpStatus5;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus[] stepUpStatusArr = {stepUpStatus, stepUpStatus2, stepUpStatus3, stepUpStatus4, stepUpStatus5};
        Camera2StreamConfigurationMap = stepUpStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(stepUpStatusArr);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus[] values() {
        return (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
