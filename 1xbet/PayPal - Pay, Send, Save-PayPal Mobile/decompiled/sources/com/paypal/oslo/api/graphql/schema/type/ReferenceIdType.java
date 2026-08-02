package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "FI_ID", "ADDRESS_ID", "TRANSACTION_ID", "CRITICAL_USER_ACTION", "WEB_TRUST_LEVEL", "ALIAS_ID", "SERVICE_NOTE_ID", "SERVICE_NOTE_CATEGORY", "AFS_TYPE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReferenceIdType {
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType ADDRESS_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType AFS_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType ALIAS_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType CRITICAL_USER_ACTION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType FI_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType SERVICE_NOTE_CATEGORY;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType SERVICE_NOTE_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType TRANSACTION_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType WEB_TRUST_LEVEL;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ReferenceIdType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("FI_ID", 0, "FI_ID");
        FI_ID = referenceIdType;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType2 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("ADDRESS_ID", 1, "ADDRESS_ID");
        ADDRESS_ID = referenceIdType2;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType3 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("TRANSACTION_ID", 2, "TRANSACTION_ID");
        TRANSACTION_ID = referenceIdType3;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType4 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("CRITICAL_USER_ACTION", 3, "CRITICAL_USER_ACTION");
        CRITICAL_USER_ACTION = referenceIdType4;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType5 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("WEB_TRUST_LEVEL", 4, "WEB_TRUST_LEVEL");
        WEB_TRUST_LEVEL = referenceIdType5;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType6 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("ALIAS_ID", 5, "ALIAS_ID");
        ALIAS_ID = referenceIdType6;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType7 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("SERVICE_NOTE_ID", 6, "SERVICE_NOTE_ID");
        SERVICE_NOTE_ID = referenceIdType7;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType8 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("SERVICE_NOTE_CATEGORY", 7, "SERVICE_NOTE_CATEGORY");
        SERVICE_NOTE_CATEGORY = referenceIdType8;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType9 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("AFS_TYPE", 8, "AFS_TYPE");
        AFS_TYPE = referenceIdType9;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType10 = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = referenceIdType10;
        com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[] referenceIdTypeArr = {referenceIdType, referenceIdType2, referenceIdType3, referenceIdType4, referenceIdType5, referenceIdType6, referenceIdType7, referenceIdType8, referenceIdType9, referenceIdType10};
        getHighSpeedVideoFpsRanges = referenceIdTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(referenceIdTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ReferenceIdType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"FI_ID", "ADDRESS_ID", "TRANSACTION_ID", "CRITICAL_USER_ACTION", "WEB_TRUST_LEVEL", "ALIAS_ID", "SERVICE_NOTE_ID", "SERVICE_NOTE_CATEGORY", "AFS_TYPE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ReferenceIdType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ReferenceIdType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[]{com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.FI_ID, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.ADDRESS_ID, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.TRANSACTION_ID, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.CRITICAL_USER_ACTION, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.WEB_TRUST_LEVEL, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.ALIAS_ID, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.SERVICE_NOTE_ID, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.SERVICE_NOTE_CATEGORY, com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.AFS_TYPE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ReferenceIdType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ReferenceIdType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ReferenceIdType referenceIdType = (com.paypal.oslo.api.graphql.schema.type.ReferenceIdType) obj;
            return referenceIdType == null ? com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.UNKNOWN__ : referenceIdType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ReferenceIdType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ReferenceIdType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ReferenceIdType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ReferenceIdType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ReferenceIdType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
