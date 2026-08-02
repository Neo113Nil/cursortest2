package com.paypal.oslo.feature.moneymovement.ui.currencypicker.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem;", "", "<init>", "()V", "", "getKey", "()Ljava/lang/String;", "key", "getContentType", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Header", "Currency", "Position", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Currency;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Header;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CurrencyListItem {
    public static final int $stable = 0;

    public abstract java.lang.String getContentType();

    public abstract java.lang.String getKey();

    private CurrencyListItem() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Header;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem;", "", "title", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Header;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "key", "getKey", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "getContentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Header extends com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem {
        public static final int $stable = 0;
        private final java.lang.String contentType;
        private final java.lang.String key;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            this.key = "header_".concat(java.lang.String.valueOf(str));
            this.contentType = com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        @Override // com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override // com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Header(title=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header) other).title);
        }

        public final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header copy(java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header(title);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header copy$default(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header header, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = header.title;
            }
            return header.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Currency;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem;", "Lcom/paypal/pds/components/ListItem;", "listItem", "", "currencyCode", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(Lcom/paypal/pds/components/ListItem;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;)V", "component1", "()Lcom/paypal/pds/components/ListItem;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;", "copy", "(Lcom/paypal/pds/components/ListItem;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;)Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Currency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/components/ListItem;", "getListItem", "Ljava/lang/String;", "getCurrencyCode", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;", "getPosition", "key", "getKey", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "getContentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Currency extends com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem {
        public static final int $stable = com.paypal.pds.components.ListItem.$stable;
        private final java.lang.String contentType;
        private final java.lang.String currencyCode;
        private final java.lang.String key;
        private final com.paypal.pds.components.ListItem listItem;
        private final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Currency(com.paypal.pds.components.ListItem listItem, java.lang.String str, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
            this.listItem = listItem;
            this.currencyCode = str;
            this.position = position;
            this.key = str;
            this.contentType = "currency";
        }

        public final com.paypal.pds.components.ListItem getListItem() {
            return this.listItem;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public /* synthetic */ Currency(com.paypal.pds.components.ListItem listItem, java.lang.String str, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(listItem, str, (i & 4) != 0 ? com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.MIDDLE : position);
        }

        public final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position getPosition() {
            return this.position;
        }

        @Override // com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override // com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        public final java.lang.String toString() {
            com.paypal.pds.components.ListItem listItem = this.listItem;
            java.lang.String str = this.currencyCode;
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position = this.position;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Currency(listItem=");
            sb.append(listItem);
            sb.append(", currencyCode=");
            sb.append(str);
            sb.append(", position=");
            sb.append(position);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.listItem.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.position.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency currency = (com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.listItem, currency.listItem) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, currency.currencyCode) && this.position == currency.position;
        }

        public final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency copy(com.paypal.pds.components.ListItem listItem, java.lang.String currencyCode, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
            return new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency(listItem, currencyCode, position);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.components.ListItem getListItem() {
            return this.listItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency copy$default(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency currency, com.paypal.pds.components.ListItem listItem, java.lang.String str, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                listItem = currency.listItem;
            }
            if ((i & 2) != 0) {
                str = currency.currencyCode;
            }
            if ((i & 4) != 0) {
                position = currency.position;
            }
            return currency.copy(listItem, str, position);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "MIDDLE", "LAST", "ONLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position FIRST;
        public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position LAST;
        public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position MIDDLE;
        public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position ONLY;
        private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position[] getHighSpeedVideoFpsRanges;

        private Position(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position = new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position("FIRST", 0);
            FIRST = position;
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position2 = new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position("MIDDLE", 1);
            MIDDLE = position2;
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position3 = new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position("LAST", 2);
            LAST = position3;
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position4 = new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position("ONLY", 3);
            ONLY = position4;
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position[] positionArr = {position, position2, position3, position4};
            getHighSpeedVideoFpsRanges = positionArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(positionArr);
        }

        public static com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position[] values() {
            return (com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public /* synthetic */ CurrencyListItem(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
