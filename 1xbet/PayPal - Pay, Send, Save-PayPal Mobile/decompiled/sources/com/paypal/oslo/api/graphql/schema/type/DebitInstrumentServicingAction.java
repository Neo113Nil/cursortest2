package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UNLOCK", "LOCK", "ACTIVATE", "REISSUE", "UPGRADE", "REPORT_CARD_LOST", "REPLACE_DAMAGED_CARD", "REISSUE_DAMAGED_CARD", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "CHANGE_BILLING_ADDRESS", "CHANGE_PIN", "FUNDING_OPTIONS", "SHOW_PIN", "UPDATE_CASHBACK_ENROLLMENTS", "REMOVE_CASHBACK_ENROLLMENTS", "CASH_LOAD", "FIND_ATM", "CASH_BACK", "SHOW_CARD", "UPDATE_CARD_VERIFICATION_CODE", "DAILY_LIMITS", "FUNDED_BY_PAYPAL_BALANCE", "REQUEST_PHYSICAL_CARD", "REQUEST_PHYSICAL_CARD_WITH_FEE", "REPORT_DIGITAL_CARD_LOST", "PUSH_PROVISION", "PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL", "REPORT_CARD_LOST_REPLACE", "SET_PREFERRED_FINANCIAL_INSTRUMENT", "ADD_SECONDARY_CARDHOLDER", "MANAGE_SECONDARY_CARDHOLDER", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentServicingAction {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction ACTIVATE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction ADD_SECONDARY_CARDHOLDER;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction CASH_BACK;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction CASH_LOAD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction CHANGE_BILLING_ADDRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction CHANGE_PIN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction CLOSE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction DAILY_LIMITS;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction FIND_ATM;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction FUNDED_BY_PAYPAL_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction FUNDING_OPTIONS;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction LOCK;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction MANAGE_SECONDARY_CARDHOLDER;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction PUSH_PROVISION;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REISSUE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REISSUE_DAMAGED_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REMOVE_CASHBACK_ENROLLMENTS;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REPLACE_DAMAGED_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REPORT_CARD_LOST;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REPORT_CARD_LOST_REPLACE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REPORT_DIGITAL_CARD_LOST;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REQUEST_PHYSICAL_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction REQUEST_PHYSICAL_CARD_WITH_FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction SET_PREFERRED_FINANCIAL_INSTRUMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction SHOW_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction SHOW_PIN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction UNLOCK;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction UPDATE_CARD_VERIFICATION_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction UPDATE_CASHBACK_ENROLLMENTS;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction UPGRADE;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentServicingAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("UNLOCK", 0, "UNLOCK");
        UNLOCK = debitInstrumentServicingAction;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("LOCK", 1, "LOCK");
        LOCK = debitInstrumentServicingAction2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("ACTIVATE", 2, "ACTIVATE");
        ACTIVATE = debitInstrumentServicingAction3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REISSUE", 3, "REISSUE");
        REISSUE = debitInstrumentServicingAction4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("UPGRADE", 4, "UPGRADE");
        UPGRADE = debitInstrumentServicingAction5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REPORT_CARD_LOST", 5, "REPORT_CARD_LOST");
        REPORT_CARD_LOST = debitInstrumentServicingAction6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REPLACE_DAMAGED_CARD", 6, "REPLACE_DAMAGED_CARD");
        REPLACE_DAMAGED_CARD = debitInstrumentServicingAction7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REISSUE_DAMAGED_CARD", 7, "REISSUE_DAMAGED_CARD");
        REISSUE_DAMAGED_CARD = debitInstrumentServicingAction8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 8, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE);
        CLOSE = debitInstrumentServicingAction9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction10 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("CHANGE_BILLING_ADDRESS", 9, "CHANGE_BILLING_ADDRESS");
        CHANGE_BILLING_ADDRESS = debitInstrumentServicingAction10;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction11 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("CHANGE_PIN", 10, "CHANGE_PIN");
        CHANGE_PIN = debitInstrumentServicingAction11;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction12 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("FUNDING_OPTIONS", 11, "FUNDING_OPTIONS");
        FUNDING_OPTIONS = debitInstrumentServicingAction12;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction13 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("SHOW_PIN", 12, "SHOW_PIN");
        SHOW_PIN = debitInstrumentServicingAction13;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction14 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("UPDATE_CASHBACK_ENROLLMENTS", 13, "UPDATE_CASHBACK_ENROLLMENTS");
        UPDATE_CASHBACK_ENROLLMENTS = debitInstrumentServicingAction14;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction15 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REMOVE_CASHBACK_ENROLLMENTS", 14, "REMOVE_CASHBACK_ENROLLMENTS");
        REMOVE_CASHBACK_ENROLLMENTS = debitInstrumentServicingAction15;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction16 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("CASH_LOAD", 15, "CASH_LOAD");
        CASH_LOAD = debitInstrumentServicingAction16;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction17 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("FIND_ATM", 16, "FIND_ATM");
        FIND_ATM = debitInstrumentServicingAction17;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction18 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("CASH_BACK", 17, "CASH_BACK");
        CASH_BACK = debitInstrumentServicingAction18;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction19 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("SHOW_CARD", 18, "SHOW_CARD");
        SHOW_CARD = debitInstrumentServicingAction19;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction20 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("UPDATE_CARD_VERIFICATION_CODE", 19, "UPDATE_CARD_VERIFICATION_CODE");
        UPDATE_CARD_VERIFICATION_CODE = debitInstrumentServicingAction20;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction21 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("DAILY_LIMITS", 20, "DAILY_LIMITS");
        DAILY_LIMITS = debitInstrumentServicingAction21;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction22 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("FUNDED_BY_PAYPAL_BALANCE", 21, "FUNDED_BY_PAYPAL_BALANCE");
        FUNDED_BY_PAYPAL_BALANCE = debitInstrumentServicingAction22;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction23 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REQUEST_PHYSICAL_CARD", 22, "REQUEST_PHYSICAL_CARD");
        REQUEST_PHYSICAL_CARD = debitInstrumentServicingAction23;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction24 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REQUEST_PHYSICAL_CARD_WITH_FEE", 23, "REQUEST_PHYSICAL_CARD_WITH_FEE");
        REQUEST_PHYSICAL_CARD_WITH_FEE = debitInstrumentServicingAction24;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction25 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REPORT_DIGITAL_CARD_LOST", 24, "REPORT_DIGITAL_CARD_LOST");
        REPORT_DIGITAL_CARD_LOST = debitInstrumentServicingAction25;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction26 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("PUSH_PROVISION", 25, "PUSH_PROVISION");
        PUSH_PROVISION = debitInstrumentServicingAction26;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction27 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL", 26, "PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL");
        PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL = debitInstrumentServicingAction27;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction28 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("REPORT_CARD_LOST_REPLACE", 27, "REPORT_CARD_LOST_REPLACE");
        REPORT_CARD_LOST_REPLACE = debitInstrumentServicingAction28;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction29 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("SET_PREFERRED_FINANCIAL_INSTRUMENT", 28, "SET_PREFERRED_FINANCIAL_INSTRUMENT");
        SET_PREFERRED_FINANCIAL_INSTRUMENT = debitInstrumentServicingAction29;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction30 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("ADD_SECONDARY_CARDHOLDER", 29, "ADD_SECONDARY_CARDHOLDER");
        ADD_SECONDARY_CARDHOLDER = debitInstrumentServicingAction30;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction31 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("MANAGE_SECONDARY_CARDHOLDER", 30, "MANAGE_SECONDARY_CARDHOLDER");
        MANAGE_SECONDARY_CARDHOLDER = debitInstrumentServicingAction31;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction32 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("UNKNOWN", 31, "UNKNOWN");
        UNKNOWN = debitInstrumentServicingAction32;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction33 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction("UNKNOWN__", 32, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentServicingAction33;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[] debitInstrumentServicingActionArr = {debitInstrumentServicingAction, debitInstrumentServicingAction2, debitInstrumentServicingAction3, debitInstrumentServicingAction4, debitInstrumentServicingAction5, debitInstrumentServicingAction6, debitInstrumentServicingAction7, debitInstrumentServicingAction8, debitInstrumentServicingAction9, debitInstrumentServicingAction10, debitInstrumentServicingAction11, debitInstrumentServicingAction12, debitInstrumentServicingAction13, debitInstrumentServicingAction14, debitInstrumentServicingAction15, debitInstrumentServicingAction16, debitInstrumentServicingAction17, debitInstrumentServicingAction18, debitInstrumentServicingAction19, debitInstrumentServicingAction20, debitInstrumentServicingAction21, debitInstrumentServicingAction22, debitInstrumentServicingAction23, debitInstrumentServicingAction24, debitInstrumentServicingAction25, debitInstrumentServicingAction26, debitInstrumentServicingAction27, debitInstrumentServicingAction28, debitInstrumentServicingAction29, debitInstrumentServicingAction30, debitInstrumentServicingAction31, debitInstrumentServicingAction32, debitInstrumentServicingAction33};
        getHighResolutionOutputSizeshNQ4ISI = debitInstrumentServicingActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentServicingActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentServicingAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UNLOCK", "LOCK", "ACTIVATE", "REISSUE", "UPGRADE", "REPORT_CARD_LOST", "REPLACE_DAMAGED_CARD", "REISSUE_DAMAGED_CARD", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "CHANGE_BILLING_ADDRESS", "CHANGE_PIN", "FUNDING_OPTIONS", "SHOW_PIN", "UPDATE_CASHBACK_ENROLLMENTS", "REMOVE_CASHBACK_ENROLLMENTS", "CASH_LOAD", "FIND_ATM", "CASH_BACK", "SHOW_CARD", "UPDATE_CARD_VERIFICATION_CODE", "DAILY_LIMITS", "FUNDED_BY_PAYPAL_BALANCE", "REQUEST_PHYSICAL_CARD", "REQUEST_PHYSICAL_CARD_WITH_FEE", "REPORT_DIGITAL_CARD_LOST", "PUSH_PROVISION", "PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL", "REPORT_CARD_LOST_REPLACE", "SET_PREFERRED_FINANCIAL_INSTRUMENT", "ADD_SECONDARY_CARDHOLDER", "MANAGE_SECONDARY_CARDHOLDER", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.UNLOCK, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.LOCK, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.ACTIVATE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REISSUE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.UPGRADE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REPORT_CARD_LOST, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REPLACE_DAMAGED_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REISSUE_DAMAGED_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.CLOSE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.CHANGE_BILLING_ADDRESS, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.CHANGE_PIN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.FUNDING_OPTIONS, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.SHOW_PIN, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.UPDATE_CASHBACK_ENROLLMENTS, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REMOVE_CASHBACK_ENROLLMENTS, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.CASH_LOAD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.FIND_ATM, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.CASH_BACK, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.SHOW_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.UPDATE_CARD_VERIFICATION_CODE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.DAILY_LIMITS, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.FUNDED_BY_PAYPAL_BALANCE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REQUEST_PHYSICAL_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REQUEST_PHYSICAL_CARD_WITH_FEE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REPORT_DIGITAL_CARD_LOST, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.PUSH_PROVISION, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.REPORT_CARD_LOST_REPLACE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.SET_PREFERRED_FINANCIAL_INSTRUMENT, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.ADD_SECONDARY_CARDHOLDER, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.MANAGE_SECONDARY_CARDHOLDER, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction debitInstrumentServicingAction = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) obj;
            return debitInstrumentServicingAction == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.UNKNOWN__ : debitInstrumentServicingAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
