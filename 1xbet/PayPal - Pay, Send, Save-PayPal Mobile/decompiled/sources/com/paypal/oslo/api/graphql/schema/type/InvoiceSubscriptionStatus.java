package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSubscriptionStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "PENDING_CANCELLATION", "PENDING_ACTIVATION", "TRIAL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoiceSubscriptionStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus CANCELLED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus PENDING_ACTIVATION;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus PENDING_CANCELLATION;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus TRIAL;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoiceSubscriptionStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = invoiceSubscriptionStatus;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus2 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 1, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        CANCELLED = invoiceSubscriptionStatus2;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus3 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus("PENDING_CANCELLATION", 2, "PENDING_CANCELLATION");
        PENDING_CANCELLATION = invoiceSubscriptionStatus3;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus4 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus("PENDING_ACTIVATION", 3, "PENDING_ACTIVATION");
        PENDING_ACTIVATION = invoiceSubscriptionStatus4;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus5 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus("TRIAL", 4, "TRIAL");
        TRIAL = invoiceSubscriptionStatus5;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus6 = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = invoiceSubscriptionStatus6;
        com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[] invoiceSubscriptionStatusArr = {invoiceSubscriptionStatus, invoiceSubscriptionStatus2, invoiceSubscriptionStatus3, invoiceSubscriptionStatus4, invoiceSubscriptionStatus5, invoiceSubscriptionStatus6};
        getHighResolutionOutputSizeshNQ4ISI = invoiceSubscriptionStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(invoiceSubscriptionStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoiceSubscriptionStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "PENDING_CANCELLATION", "PENDING_ACTIVATION", "TRIAL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSubscriptionStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSubscriptionStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSubscriptionStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceSubscriptionStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[]{com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.ACTIVE, com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.CANCELLED, com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.PENDING_CANCELLATION, com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.PENDING_ACTIVATION, com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.TRIAL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus invoiceSubscriptionStatus = (com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus) obj;
            return invoiceSubscriptionStatus == null ? com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.UNKNOWN__ : invoiceSubscriptionStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoiceSubscriptionStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
