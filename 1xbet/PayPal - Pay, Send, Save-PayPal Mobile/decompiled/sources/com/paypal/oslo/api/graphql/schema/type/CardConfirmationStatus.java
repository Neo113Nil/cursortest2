package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardConfirmationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "NOT_SUPPORTED", "NOT_APPLICABLE", "UNCONFIRMED", "CONFIRMED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "BLOCKED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardConfirmationStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus BLOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus NOT_APPLICABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus NOT_SUPPORTED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus UNCONFIRMED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardConfirmationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("NOT_SUPPORTED", 0, "NOT_SUPPORTED");
        NOT_SUPPORTED = cardConfirmationStatus;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus2 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("NOT_APPLICABLE", 1, "NOT_APPLICABLE");
        NOT_APPLICABLE = cardConfirmationStatus2;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus3 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("UNCONFIRMED", 2, "UNCONFIRMED");
        UNCONFIRMED = cardConfirmationStatus3;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus4 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("CONFIRMED", 3, "CONFIRMED");
        CONFIRMED = cardConfirmationStatus4;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus5 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 4, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = cardConfirmationStatus5;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus6 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("BLOCKED", 5, "BLOCKED");
        BLOCKED = cardConfirmationStatus6;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus7 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = cardConfirmationStatus7;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus8 = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = cardConfirmationStatus8;
        com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[] cardConfirmationStatusArr = {cardConfirmationStatus, cardConfirmationStatus2, cardConfirmationStatus3, cardConfirmationStatus4, cardConfirmationStatus5, cardConfirmationStatus6, cardConfirmationStatus7, cardConfirmationStatus8};
        getHighResolutionOutputSizeshNQ4ISI = cardConfirmationStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cardConfirmationStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardConfirmationStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NOT_SUPPORTED", "NOT_APPLICABLE", "UNCONFIRMED", "CONFIRMED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "BLOCKED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardConfirmationStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardConfirmationStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CardConfirmationStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CardConfirmationStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[]{com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.NOT_SUPPORTED, com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.NOT_APPLICABLE, com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.UNCONFIRMED, com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.CONFIRMED, com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.BLOCKED, com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus cardConfirmationStatus = (com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus) obj;
            return cardConfirmationStatus == null ? com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.UNKNOWN__ : cardConfirmationStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CardConfirmationStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
