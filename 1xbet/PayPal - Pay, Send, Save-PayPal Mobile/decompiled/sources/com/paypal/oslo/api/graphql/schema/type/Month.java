package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/Month;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Month {
    public static final com.paypal.oslo.api.graphql.schema.type.Month APRIL;
    public static final com.paypal.oslo.api.graphql.schema.type.Month AUGUST;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.Month.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.Month DECEMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.Month FEBRUARY;
    public static final com.paypal.oslo.api.graphql.schema.type.Month JANUARY;
    public static final com.paypal.oslo.api.graphql.schema.type.Month JULY;
    public static final com.paypal.oslo.api.graphql.schema.type.Month JUNE;
    public static final com.paypal.oslo.api.graphql.schema.type.Month MARCH;
    public static final com.paypal.oslo.api.graphql.schema.type.Month MAY;
    public static final com.paypal.oslo.api.graphql.schema.type.Month NOVEMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.Month OCTOBER;
    public static final com.paypal.oslo.api.graphql.schema.type.Month SEPTEMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.Month UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.Month[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private Month(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.Month month = new com.paypal.oslo.api.graphql.schema.type.Month("JANUARY", 0, "JANUARY");
        JANUARY = month;
        com.paypal.oslo.api.graphql.schema.type.Month month2 = new com.paypal.oslo.api.graphql.schema.type.Month("FEBRUARY", 1, "FEBRUARY");
        FEBRUARY = month2;
        com.paypal.oslo.api.graphql.schema.type.Month month3 = new com.paypal.oslo.api.graphql.schema.type.Month("MARCH", 2, "MARCH");
        MARCH = month3;
        com.paypal.oslo.api.graphql.schema.type.Month month4 = new com.paypal.oslo.api.graphql.schema.type.Month("APRIL", 3, "APRIL");
        APRIL = month4;
        com.paypal.oslo.api.graphql.schema.type.Month month5 = new com.paypal.oslo.api.graphql.schema.type.Month("MAY", 4, "MAY");
        MAY = month5;
        com.paypal.oslo.api.graphql.schema.type.Month month6 = new com.paypal.oslo.api.graphql.schema.type.Month("JUNE", 5, "JUNE");
        JUNE = month6;
        com.paypal.oslo.api.graphql.schema.type.Month month7 = new com.paypal.oslo.api.graphql.schema.type.Month("JULY", 6, "JULY");
        JULY = month7;
        com.paypal.oslo.api.graphql.schema.type.Month month8 = new com.paypal.oslo.api.graphql.schema.type.Month("AUGUST", 7, "AUGUST");
        AUGUST = month8;
        com.paypal.oslo.api.graphql.schema.type.Month month9 = new com.paypal.oslo.api.graphql.schema.type.Month("SEPTEMBER", 8, "SEPTEMBER");
        SEPTEMBER = month9;
        com.paypal.oslo.api.graphql.schema.type.Month month10 = new com.paypal.oslo.api.graphql.schema.type.Month("OCTOBER", 9, "OCTOBER");
        OCTOBER = month10;
        com.paypal.oslo.api.graphql.schema.type.Month month11 = new com.paypal.oslo.api.graphql.schema.type.Month("NOVEMBER", 10, "NOVEMBER");
        NOVEMBER = month11;
        com.paypal.oslo.api.graphql.schema.type.Month month12 = new com.paypal.oslo.api.graphql.schema.type.Month("DECEMBER", 11, "DECEMBER");
        DECEMBER = month12;
        com.paypal.oslo.api.graphql.schema.type.Month month13 = new com.paypal.oslo.api.graphql.schema.type.Month("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = month13;
        com.paypal.oslo.api.graphql.schema.type.Month[] monthArr = {month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12, month13};
        getHighSpeedVideoSizes = monthArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(monthArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.Month.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("Month", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/Month$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/Month;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/Month;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/Month;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.Month.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.Month> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.Month[]{com.paypal.oslo.api.graphql.schema.type.Month.JANUARY, com.paypal.oslo.api.graphql.schema.type.Month.FEBRUARY, com.paypal.oslo.api.graphql.schema.type.Month.MARCH, com.paypal.oslo.api.graphql.schema.type.Month.APRIL, com.paypal.oslo.api.graphql.schema.type.Month.MAY, com.paypal.oslo.api.graphql.schema.type.Month.JUNE, com.paypal.oslo.api.graphql.schema.type.Month.JULY, com.paypal.oslo.api.graphql.schema.type.Month.AUGUST, com.paypal.oslo.api.graphql.schema.type.Month.SEPTEMBER, com.paypal.oslo.api.graphql.schema.type.Month.OCTOBER, com.paypal.oslo.api.graphql.schema.type.Month.NOVEMBER, com.paypal.oslo.api.graphql.schema.type.Month.DECEMBER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.Month[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.Month[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.Month[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.Month safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.Month.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.Month) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.Month month = (com.paypal.oslo.api.graphql.schema.type.Month) obj;
            return month == null ? com.paypal.oslo.api.graphql.schema.type.Month.UNKNOWN__ : month;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.Month[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.Month[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.Month valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.Month) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.Month.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.Month> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
