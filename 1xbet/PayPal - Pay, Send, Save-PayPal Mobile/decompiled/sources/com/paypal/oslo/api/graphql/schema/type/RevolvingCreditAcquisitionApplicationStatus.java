package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "APPROVED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "DECLINED", "EXPIRED", "FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PENDING_ACCOUNT_CREATION", "PENDING_MANUAL_REMEDIATION", "SOFT_DECLINED", "UNKNOWN_DECISION", "WITHDRAWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RevolvingCreditAcquisitionApplicationStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus APPROVED;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus CANCELED;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus CREATED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus DECLINED;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus INELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus PENDING_ACCOUNT_CREATION;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus PENDING_MANUAL_REMEDIATION;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus SOFT_DECLINED;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus UNKNOWN_DECISION;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus WITHDRAWN;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private RevolvingCreditAcquisitionApplicationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("APPROVED", 0, "APPROVED");
        APPROVED = revolvingCreditAcquisitionApplicationStatus;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus2 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS);
        CANCELED = revolvingCreditAcquisitionApplicationStatus2;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus3 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 2, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED);
        CREATED = revolvingCreditAcquisitionApplicationStatus3;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus4 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("DECLINED", 3, "DECLINED");
        DECLINED = revolvingCreditAcquisitionApplicationStatus4;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus5 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("EXPIRED", 4, "EXPIRED");
        EXPIRED = revolvingCreditAcquisitionApplicationStatus5;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus6 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER", 5, "FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER");
        FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER = revolvingCreditAcquisitionApplicationStatus6;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus7 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 6, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE);
        INELIGIBLE = revolvingCreditAcquisitionApplicationStatus7;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus8 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 7, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = revolvingCreditAcquisitionApplicationStatus8;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus9 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("PENDING_ACCOUNT_CREATION", 8, "PENDING_ACCOUNT_CREATION");
        PENDING_ACCOUNT_CREATION = revolvingCreditAcquisitionApplicationStatus9;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus10 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("PENDING_MANUAL_REMEDIATION", 9, "PENDING_MANUAL_REMEDIATION");
        PENDING_MANUAL_REMEDIATION = revolvingCreditAcquisitionApplicationStatus10;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus11 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("SOFT_DECLINED", 10, "SOFT_DECLINED");
        SOFT_DECLINED = revolvingCreditAcquisitionApplicationStatus11;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus12 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("UNKNOWN_DECISION", 11, "UNKNOWN_DECISION");
        UNKNOWN_DECISION = revolvingCreditAcquisitionApplicationStatus12;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus13 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("WITHDRAWN", 12, "WITHDRAWN");
        WITHDRAWN = revolvingCreditAcquisitionApplicationStatus13;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus14 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus("UNKNOWN__", 13, "UNKNOWN__");
        UNKNOWN__ = revolvingCreditAcquisitionApplicationStatus14;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[] revolvingCreditAcquisitionApplicationStatusArr = {revolvingCreditAcquisitionApplicationStatus, revolvingCreditAcquisitionApplicationStatus2, revolvingCreditAcquisitionApplicationStatus3, revolvingCreditAcquisitionApplicationStatus4, revolvingCreditAcquisitionApplicationStatus5, revolvingCreditAcquisitionApplicationStatus6, revolvingCreditAcquisitionApplicationStatus7, revolvingCreditAcquisitionApplicationStatus8, revolvingCreditAcquisitionApplicationStatus9, revolvingCreditAcquisitionApplicationStatus10, revolvingCreditAcquisitionApplicationStatus11, revolvingCreditAcquisitionApplicationStatus12, revolvingCreditAcquisitionApplicationStatus13, revolvingCreditAcquisitionApplicationStatus14};
        getHighSpeedVideoFpsRanges = revolvingCreditAcquisitionApplicationStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(revolvingCreditAcquisitionApplicationStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("RevolvingCreditAcquisitionApplicationStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"APPROVED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "DECLINED", "EXPIRED", "FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PENDING_ACCOUNT_CREATION", "PENDING_MANUAL_REMEDIATION", "SOFT_DECLINED", "UNKNOWN_DECISION", "WITHDRAWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicationStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicationStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicationStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicationStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[]{com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.APPROVED, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.CANCELED, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.CREATED, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.DECLINED, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.EXPIRED, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.FUNDING_INSTRUMENT_ASSOCIATED_WITH_DIFFERENT_MEMBER, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.INELIGIBLE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.PENDING, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.PENDING_ACCOUNT_CREATION, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.PENDING_MANUAL_REMEDIATION, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.SOFT_DECLINED, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.UNKNOWN_DECISION, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.WITHDRAWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus revolvingCreditAcquisitionApplicationStatus = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus) obj;
            return revolvingCreditAcquisitionApplicationStatus == null ? com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.UNKNOWN__ : revolvingCreditAcquisitionApplicationStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicationStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
