package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "PENDING_ACTIVE", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VirtualBankAccountStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus ACTIVE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus INACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus PENDING_ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private VirtualBankAccountStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = virtualBankAccountStatus;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus2 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus("PENDING_ACTIVE", 1, "PENDING_ACTIVE");
        PENDING_ACTIVE = virtualBankAccountStatus2;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus3 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 2, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        INACTIVE = virtualBankAccountStatus3;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus4 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = virtualBankAccountStatus4;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[] virtualBankAccountStatusArr = {virtualBankAccountStatus, virtualBankAccountStatus2, virtualBankAccountStatus3, virtualBankAccountStatus4};
        getHighResolutionOutputSizeshNQ4ISI = virtualBankAccountStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(virtualBankAccountStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("VirtualBankAccountStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "PENDING_ACTIVE", com.payair.model.TokenStatusKt.TOKEN_INACTIVE}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[]{com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.ACTIVE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.PENDING_ACTIVE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.INACTIVE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus virtualBankAccountStatus = (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus) obj;
            return virtualBankAccountStatus == null ? com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.UNKNOWN__ : virtualBankAccountStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
