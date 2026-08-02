package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNKNOWN", "INITIAL", "DRAFT", "SENT", "PAID", "SCHEDULED", "MARKED_AS_PAID", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "REFUNDED", "PARTIALLY_PAID", "PARTIALLY_REFUNDED", "MARKED_AS_REFUNDED", "UNPAID", "PAYMENT_PENDING", "AUTOCANCELLED"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class InvoiceStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus AUTOCANCELLED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus CANCELLED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus DRAFT;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus INITIAL;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus MARKED_AS_PAID;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus MARKED_AS_REFUNDED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus PAID;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus PARTIALLY_PAID;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus PARTIALLY_REFUNDED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus PAYMENT_PENDING;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus REFUND;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus REFUNDED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus SCHEDULED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus SENT;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus UNKNOWN;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus UNPAID;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InvoiceStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("UNKNOWN", 0);
        UNKNOWN = invoiceStatus;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus2 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("INITIAL", 1);
        INITIAL = invoiceStatus2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus3 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("DRAFT", 2);
        DRAFT = invoiceStatus3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus4 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("SENT", 3);
        SENT = invoiceStatus4;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus5 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("PAID", 4);
        PAID = invoiceStatus5;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus6 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("SCHEDULED", 5);
        SCHEDULED = invoiceStatus6;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus7 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("MARKED_AS_PAID", 6);
        MARKED_AS_PAID = invoiceStatus7;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus8 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 7);
        CANCELLED = invoiceStatus8;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus9 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 8);
        REFUND = invoiceStatus9;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus10 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("REFUNDED", 9);
        REFUNDED = invoiceStatus10;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus11 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("PARTIALLY_PAID", 10);
        PARTIALLY_PAID = invoiceStatus11;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus12 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("PARTIALLY_REFUNDED", 11);
        PARTIALLY_REFUNDED = invoiceStatus12;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus13 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("MARKED_AS_REFUNDED", 12);
        MARKED_AS_REFUNDED = invoiceStatus13;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus14 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("UNPAID", 13);
        UNPAID = invoiceStatus14;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus15 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("PAYMENT_PENDING", 14);
        PAYMENT_PENDING = invoiceStatus15;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus16 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus("AUTOCANCELLED", 15);
        AUTOCANCELLED = invoiceStatus16;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus[] invoiceStatusArr = {invoiceStatus, invoiceStatus2, invoiceStatus3, invoiceStatus4, invoiceStatus5, invoiceStatus6, invoiceStatus7, invoiceStatus8, invoiceStatus9, invoiceStatus10, invoiceStatus11, invoiceStatus12, invoiceStatus13, invoiceStatus14, invoiceStatus15, invoiceStatus16};
        $VALUES = invoiceStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(invoiceStatusArr);
        INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus", com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus> getEntries() {
        return $ENTRIES;
    }
}
