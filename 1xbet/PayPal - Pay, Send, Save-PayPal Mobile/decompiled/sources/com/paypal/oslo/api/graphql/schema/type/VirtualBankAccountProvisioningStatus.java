package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PROVISIONED", "NOT_PROVISIONED", "NEED_MORE_DATA", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "STEP_UP_AUTH", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VirtualBankAccountProvisioningStatus {
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus INELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus NEED_MORE_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus NOT_PROVISIONED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus PROVISIONED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus STEP_UP_AUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private VirtualBankAccountProvisioningStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus("PROVISIONED", 0, "PROVISIONED");
        PROVISIONED = virtualBankAccountProvisioningStatus;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus2 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus("NOT_PROVISIONED", 1, "NOT_PROVISIONED");
        NOT_PROVISIONED = virtualBankAccountProvisioningStatus2;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus3 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus("NEED_MORE_DATA", 2, "NEED_MORE_DATA");
        NEED_MORE_DATA = virtualBankAccountProvisioningStatus3;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus4 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 3, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE);
        INELIGIBLE = virtualBankAccountProvisioningStatus4;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus5 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus("STEP_UP_AUTH", 4, "STEP_UP_AUTH");
        STEP_UP_AUTH = virtualBankAccountProvisioningStatus5;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus6 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 5, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = virtualBankAccountProvisioningStatus6;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus7 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = virtualBankAccountProvisioningStatus7;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[] virtualBankAccountProvisioningStatusArr = {virtualBankAccountProvisioningStatus, virtualBankAccountProvisioningStatus2, virtualBankAccountProvisioningStatus3, virtualBankAccountProvisioningStatus4, virtualBankAccountProvisioningStatus5, virtualBankAccountProvisioningStatus6, virtualBankAccountProvisioningStatus7};
        Camera2StreamConfigurationMap = virtualBankAccountProvisioningStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(virtualBankAccountProvisioningStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("VirtualBankAccountProvisioningStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PROVISIONED", "NOT_PROVISIONED", "NEED_MORE_DATA", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "STEP_UP_AUTH", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[]{com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.PROVISIONED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.NOT_PROVISIONED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.NEED_MORE_DATA, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.INELIGIBLE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.STEP_UP_AUTH, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.DENIED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus = (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus) obj;
            return virtualBankAccountProvisioningStatus == null ? com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.UNKNOWN__ : virtualBankAccountProvisioningStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
