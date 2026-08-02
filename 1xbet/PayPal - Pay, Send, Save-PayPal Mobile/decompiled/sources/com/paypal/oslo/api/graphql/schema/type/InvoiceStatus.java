package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "DRAFT", "SENT", "SCHEDULED", "PAID", "MARKED_AS_PAID", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "REFUNDED", "PARTIALLY_PAID", "PARTIALLY_REFUNDED", "MARKED_AS_REFUNDED", "UNPAID", "PAYMENT_PENDING", "AUTO_CANCELLED", "PAID_EXTERNAL", "REFUNDED_EXTERNAL", "SHARED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoiceStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus AUTO_CANCELLED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus CANCELLED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus DRAFT;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus MARKED_AS_PAID;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus MARKED_AS_REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus PAID;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus PAID_EXTERNAL;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus PARTIALLY_PAID;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus PARTIALLY_REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus PAYMENT_PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus REFUNDED_EXTERNAL;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus SCHEDULED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus SENT;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus SHARED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus UNPAID;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoiceStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("DRAFT", 0, "DRAFT");
        DRAFT = invoiceStatus;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus2 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("SENT", 1, "SENT");
        SENT = invoiceStatus2;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus3 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("SCHEDULED", 2, "SCHEDULED");
        SCHEDULED = invoiceStatus3;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus4 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("PAID", 3, "PAID");
        PAID = invoiceStatus4;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus5 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("MARKED_AS_PAID", 4, "MARKED_AS_PAID");
        MARKED_AS_PAID = invoiceStatus5;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus6 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 5, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        CANCELLED = invoiceStatus6;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus7 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("REFUNDED", 6, "REFUNDED");
        REFUNDED = invoiceStatus7;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus8 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("PARTIALLY_PAID", 7, "PARTIALLY_PAID");
        PARTIALLY_PAID = invoiceStatus8;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus9 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("PARTIALLY_REFUNDED", 8, "PARTIALLY_REFUNDED");
        PARTIALLY_REFUNDED = invoiceStatus9;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus10 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("MARKED_AS_REFUNDED", 9, "MARKED_AS_REFUNDED");
        MARKED_AS_REFUNDED = invoiceStatus10;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus11 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("UNPAID", 10, "UNPAID");
        UNPAID = invoiceStatus11;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus12 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("PAYMENT_PENDING", 11, "PAYMENT_PENDING");
        PAYMENT_PENDING = invoiceStatus12;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus13 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("AUTO_CANCELLED", 12, "AUTO_CANCELLED");
        AUTO_CANCELLED = invoiceStatus13;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus14 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("PAID_EXTERNAL", 13, "PAID_EXTERNAL");
        PAID_EXTERNAL = invoiceStatus14;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus15 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("REFUNDED_EXTERNAL", 14, "REFUNDED_EXTERNAL");
        REFUNDED_EXTERNAL = invoiceStatus15;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus16 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("SHARED", 15, "SHARED");
        SHARED = invoiceStatus16;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus17 = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus("UNKNOWN__", 16, "UNKNOWN__");
        UNKNOWN__ = invoiceStatus17;
        com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[] invoiceStatusArr = {invoiceStatus, invoiceStatus2, invoiceStatus3, invoiceStatus4, invoiceStatus5, invoiceStatus6, invoiceStatus7, invoiceStatus8, invoiceStatus9, invoiceStatus10, invoiceStatus11, invoiceStatus12, invoiceStatus13, invoiceStatus14, invoiceStatus15, invoiceStatus16, invoiceStatus17};
        Camera2StreamConfigurationMap = invoiceStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(invoiceStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoiceStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"DRAFT", "SENT", "SCHEDULED", "PAID", "MARKED_AS_PAID", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "REFUNDED", "PARTIALLY_PAID", "PARTIALLY_REFUNDED", "MARKED_AS_REFUNDED", "UNPAID", "PAYMENT_PENDING", "AUTO_CANCELLED", "PAID_EXTERNAL", "REFUNDED_EXTERNAL", "SHARED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoiceStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[]{com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.DRAFT, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.SENT, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.SCHEDULED, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PAID, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.MARKED_AS_PAID, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.CANCELLED, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.REFUNDED, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PARTIALLY_PAID, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PARTIALLY_REFUNDED, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.MARKED_AS_REFUNDED, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.UNPAID, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PAYMENT_PENDING, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.AUTO_CANCELLED, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PAID_EXTERNAL, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.REFUNDED_EXTERNAL, com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.SHARED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoiceStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoiceStatus invoiceStatus = (com.paypal.oslo.api.graphql.schema.type.InvoiceStatus) obj;
            return invoiceStatus == null ? com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.UNKNOWN__ : invoiceStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoiceStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
