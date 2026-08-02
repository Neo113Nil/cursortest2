package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/AccountStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "CLOSED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountStatus {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus ACTIVE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus CLOSED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus[] getHighSpeedVideoSizes;

    private AccountStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus accountStatus = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = accountStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus accountStatus2 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus("CLOSED", 1);
        CLOSED = accountStatus2;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus accountStatus3 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 2);
        PENDING = accountStatus3;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus accountStatus4 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus("UNKNOWN", 3);
        UNKNOWN = accountStatus4;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus[] accountStatusArr = {accountStatus, accountStatus2, accountStatus3, accountStatus4};
        getHighSpeedVideoSizes = accountStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(accountStatusArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/AccountStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/AccountStatus;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/AccountStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus accountStatus = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus) obj;
            return accountStatus == null ? com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.UNKNOWN : accountStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.AccountStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
