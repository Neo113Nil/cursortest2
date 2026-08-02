package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PRESENT", "DAY", "WEEK", "MONTH", "SIX_MONTH", "YEAR", "ALL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyPriceTimeRange {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange ALL;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange DAY;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange MONTH;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange PRESENT;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange SIX_MONTH;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange WEEK;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange YEAR;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyPriceTimeRange(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("PRESENT", 0, "PRESENT");
        PRESENT = cryptocurrencyPriceTimeRange;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("DAY", 1, "DAY");
        DAY = cryptocurrencyPriceTimeRange2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("WEEK", 2, "WEEK");
        WEEK = cryptocurrencyPriceTimeRange3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("MONTH", 3, "MONTH");
        MONTH = cryptocurrencyPriceTimeRange4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("SIX_MONTH", 4, "SIX_MONTH");
        SIX_MONTH = cryptocurrencyPriceTimeRange5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("YEAR", 5, "YEAR");
        YEAR = cryptocurrencyPriceTimeRange6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("ALL", 6, "ALL");
        ALL = cryptocurrencyPriceTimeRange7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyPriceTimeRange8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[] cryptocurrencyPriceTimeRangeArr = {cryptocurrencyPriceTimeRange, cryptocurrencyPriceTimeRange2, cryptocurrencyPriceTimeRange3, cryptocurrencyPriceTimeRange4, cryptocurrencyPriceTimeRange5, cryptocurrencyPriceTimeRange6, cryptocurrencyPriceTimeRange7, cryptocurrencyPriceTimeRange8};
        Camera2StreamConfigurationMap = cryptocurrencyPriceTimeRangeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyPriceTimeRangeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyPriceTimeRange", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PRESENT", "DAY", "WEEK", "MONTH", "SIX_MONTH", "YEAR", "ALL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.PRESENT, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.DAY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.WEEK, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.MONTH, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.SIX_MONTH, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.YEAR, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.ALL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange) obj;
            return cryptocurrencyPriceTimeRange == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.UNKNOWN__ : cryptocurrencyPriceTimeRange;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
