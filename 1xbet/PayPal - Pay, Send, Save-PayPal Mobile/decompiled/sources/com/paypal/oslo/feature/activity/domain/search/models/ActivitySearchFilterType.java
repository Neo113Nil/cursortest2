package com.paypal.oslo.feature.activity.domain.search.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "", "<init>", "()V", "Companion", "SearchTextFilterType", "MoneyMovementFilterType", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivitySearchFilterType {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.Companion INSTANCE = new com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.Companion(null);
    private static final java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> entries = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType[]{com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Refunds.INSTANCE, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Invoices.INSTANCE, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyIn.INSTANCE, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyOut.INSTANCE});

    private ActivitySearchFilterType() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "", "p0", "<init>", "(Ljava/lang/String;)V", "searchText", "Ljava/lang/String;", "getSearchText", "()Ljava/lang/String;", "Refunds", "Invoices", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType$Invoices;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType$Refunds;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SearchTextFilterType extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType {
        public static final int $stable = 0;
        private final java.lang.String searchText;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType$Refunds;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Refunds extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Refunds INSTANCE = new com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Refunds();

            public final int hashCode() {
                return 63253727;
            }

            private Refunds() {
                super(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySearchConstants.KEY_SEARCH_FILTER_TYPE_REFUNDS, null);
            }

            public final java.lang.String toString() {
                return "Refunds";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Refunds)) {
                    return false;
                }
                return true;
            }
        }

        private SearchTextFilterType(java.lang.String str) {
            super(null);
            this.searchText = str;
        }

        public final java.lang.String getSearchText() {
            return this.searchText;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType$Invoices;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$SearchTextFilterType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invoices extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Invoices INSTANCE = new com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Invoices();

            public final int hashCode() {
                return -989551998;
            }

            private Invoices() {
                super(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySearchConstants.KEY_SEARCH_FILTER_TYPE_INVOICES, null);
            }

            public final java.lang.String toString() {
                return "Invoices";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Invoices)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ SearchTextFilterType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "p0", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;)V", "moneyMovementDirection", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "getMoneyMovementDirection", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "MoneyIn", "MoneyOut", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType$MoneyIn;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType$MoneyOut;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class MoneyMovementFilterType extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection;

        private MoneyMovementFilterType(com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection) {
            super(null);
            this.moneyMovementDirection = moneyMovementDirection;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection getMoneyMovementDirection() {
            return this.moneyMovementDirection;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType$MoneyIn;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MoneyIn extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyIn INSTANCE = new com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyIn();

            public final int hashCode() {
                return -1256409459;
            }

            private MoneyIn() {
                super(com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.CREDIT, null);
            }

            public final java.lang.String toString() {
                return "MoneyIn";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyIn)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType$MoneyOut;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$MoneyMovementFilterType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MoneyOut extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyOut INSTANCE = new com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyOut();

            public final int hashCode() {
                return -293981466;
            }

            private MoneyOut() {
                super(com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.DEBIT, null);
            }

            public final java.lang.String toString() {
                return "MoneyOut";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyOut)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ MoneyMovementFilterType(com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(moneyMovementDirection);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "entries", "Ljava/util/List;", "getEntries", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> getEntries() {
            return com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.entries;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivitySearchFilterType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
