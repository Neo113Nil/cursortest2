package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DataSubjectRightsAssociation;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADHOC_CIP", "ADHOC_EE", "BACKUP", "KILL_SWITCH", "MANUAL_FULFILLMENT", "SUBSEQUENT_ERASURE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DataSubjectRightsAssociation {
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation ADHOC_CIP;
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation ADHOC_EE;
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation BACKUP;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation KILL_SWITCH;
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation MANUAL_FULFILLMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation SUBSEQUENT_ERASURE;
    public static final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DataSubjectRightsAssociation(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("ADHOC_CIP", 0, "ADHOC_CIP");
        ADHOC_CIP = dataSubjectRightsAssociation;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation2 = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("ADHOC_EE", 1, "ADHOC_EE");
        ADHOC_EE = dataSubjectRightsAssociation2;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation3 = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("BACKUP", 2, "BACKUP");
        BACKUP = dataSubjectRightsAssociation3;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation4 = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("KILL_SWITCH", 3, "KILL_SWITCH");
        KILL_SWITCH = dataSubjectRightsAssociation4;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation5 = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("MANUAL_FULFILLMENT", 4, "MANUAL_FULFILLMENT");
        MANUAL_FULFILLMENT = dataSubjectRightsAssociation5;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation6 = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("SUBSEQUENT_ERASURE", 5, "SUBSEQUENT_ERASURE");
        SUBSEQUENT_ERASURE = dataSubjectRightsAssociation6;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation7 = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = dataSubjectRightsAssociation7;
        com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[] dataSubjectRightsAssociationArr = {dataSubjectRightsAssociation, dataSubjectRightsAssociation2, dataSubjectRightsAssociation3, dataSubjectRightsAssociation4, dataSubjectRightsAssociation5, dataSubjectRightsAssociation6, dataSubjectRightsAssociation7};
        Camera2StreamConfigurationMap = dataSubjectRightsAssociationArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(dataSubjectRightsAssociationArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DataSubjectRightsAssociation", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADHOC_CIP", "ADHOC_EE", "BACKUP", "KILL_SWITCH", "MANUAL_FULFILLMENT", "SUBSEQUENT_ERASURE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DataSubjectRightsAssociation$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DataSubjectRightsAssociation;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DataSubjectRightsAssociation;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DataSubjectRightsAssociation;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[]{com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.ADHOC_CIP, com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.ADHOC_EE, com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.BACKUP, com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.KILL_SWITCH, com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.MANUAL_FULFILLMENT, com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.SUBSEQUENT_ERASURE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation dataSubjectRightsAssociation = (com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation) obj;
            return dataSubjectRightsAssociation == null ? com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.UNKNOWN__ : dataSubjectRightsAssociation;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DataSubjectRightsAssociation> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
