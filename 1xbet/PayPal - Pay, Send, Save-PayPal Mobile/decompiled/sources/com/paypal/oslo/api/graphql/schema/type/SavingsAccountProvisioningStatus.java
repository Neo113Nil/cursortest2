package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountProvisioningStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "IN_REVIEW", "SUBSCRIBED", "NEED_MORE_DATA", com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavingsAccountProvisioningStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus ACTIVE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus INELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus IN_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus NEED_MORE_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus PAUSED;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus SUBSCRIBED;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private SavingsAccountProvisioningStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus("IN_REVIEW", 0, "IN_REVIEW");
        IN_REVIEW = savingsAccountProvisioningStatus;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus2 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus("SUBSCRIBED", 1, "SUBSCRIBED");
        SUBSCRIBED = savingsAccountProvisioningStatus2;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus3 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus("NEED_MORE_DATA", 2, "NEED_MORE_DATA");
        NEED_MORE_DATA = savingsAccountProvisioningStatus3;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus4 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, 3, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED);
        PAUSED = savingsAccountProvisioningStatus4;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus5 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 4, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = savingsAccountProvisioningStatus5;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus6 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 5, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE);
        INELIGIBLE = savingsAccountProvisioningStatus6;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus7 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 6, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = savingsAccountProvisioningStatus7;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus8 = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = savingsAccountProvisioningStatus8;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[] savingsAccountProvisioningStatusArr = {savingsAccountProvisioningStatus, savingsAccountProvisioningStatus2, savingsAccountProvisioningStatus3, savingsAccountProvisioningStatus4, savingsAccountProvisioningStatus5, savingsAccountProvisioningStatus6, savingsAccountProvisioningStatus7, savingsAccountProvisioningStatus8};
        getHighSpeedVideoSizes = savingsAccountProvisioningStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(savingsAccountProvisioningStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("SavingsAccountProvisioningStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"IN_REVIEW", "SUBSCRIBED", "NEED_MORE_DATA", com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, com.payair.model.TokenStatusKt.TOKEN_ACTIVE}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountProvisioningStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountProvisioningStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountProvisioningStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountProvisioningStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[]{com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.IN_REVIEW, com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.SUBSCRIBED, com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.NEED_MORE_DATA, com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.PAUSED, com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.DENIED, com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.INELIGIBLE, com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.ACTIVE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus savingsAccountProvisioningStatus = (com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus) obj;
            return savingsAccountProvisioningStatus == null ? com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.UNKNOWN__ : savingsAccountProvisioningStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.SavingsAccountProvisioningStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
