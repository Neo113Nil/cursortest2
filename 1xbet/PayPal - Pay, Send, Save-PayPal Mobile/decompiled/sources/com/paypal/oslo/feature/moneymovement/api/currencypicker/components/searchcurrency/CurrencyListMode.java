package com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "", "<init>", "()V", "FlatList", "TwoSections", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$FlatList;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CurrencyListMode {
    public static final int $stable = 0;

    private CurrencyListMode() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$FlatList;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "currencies", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$FlatList;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCurrencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FlatList extends com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode {
        public static final int $stable = 0;
        private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlatList(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.currencies = list;
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getCurrencies() {
            return this.currencies;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list = this.currencies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlatList(currencies=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currencies.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, ((com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList) other).currencies);
        }

        public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
            return new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList(currencies);
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> component1() {
            return this.currencies;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList copy$default(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList flatList, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = flatList.currencies;
            }
            return flatList.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;", "primarySection", "secondarySection", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;", "component2", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;)Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;", "getPrimarySection", "getSecondarySection", "Section"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TwoSections extends com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section primarySection;
        private final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section secondarySection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TwoSections(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section2, "");
            this.primarySection = section;
            this.secondarySection = section2;
        }

        public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section getPrimarySection() {
            return this.primarySection;
        }

        public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section getSecondarySection() {
            return this.secondarySection;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;", "", "", "headerTitle", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "currencies", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode$TwoSections$Section;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getHeaderTitle", "Ljava/util/List;", "getCurrencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Section {
            public static final int $stable = 0;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies;
            private final java.lang.String headerTitle;

            public Section(java.lang.String str, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.headerTitle = str;
                this.currencies = list;
            }

            public final java.lang.String getHeaderTitle() {
                return this.headerTitle;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getCurrencies() {
                return this.currencies;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.headerTitle;
                java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list = this.currencies;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Section(headerTitle=");
                sb.append(str);
                sb.append(", currencies=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.headerTitle.hashCode() * 31) + this.currencies.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section = (com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.headerTitle, section.headerTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, section.currencies);
            }

            public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section copy(java.lang.String headerTitle, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerTitle, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
                return new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section(headerTitle, currencies);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> component2() {
                return this.currencies;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getHeaderTitle() {
                return this.headerTitle;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section copy$default(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = section.headerTitle;
                }
                if ((i & 2) != 0) {
                    list = section.currencies;
                }
                return section.copy(str, list);
            }
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section = this.primarySection;
            com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section2 = this.secondarySection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TwoSections(primarySection=");
            sb.append(section);
            sb.append(", secondarySection=");
            sb.append(section2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.primarySection.hashCode() * 31) + this.secondarySection.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections)) {
                return false;
            }
            com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections twoSections = (com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.primarySection, twoSections.primarySection) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondarySection, twoSections.secondarySection);
        }

        public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections copy(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section primarySection, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section secondarySection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primarySection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondarySection, "");
            return new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections(primarySection, secondarySection);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section getSecondarySection() {
            return this.secondarySection;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section getPrimarySection() {
            return this.primarySection;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections copy$default(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections twoSections, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections.Section section2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = twoSections.primarySection;
            }
            if ((i & 2) != 0) {
                section2 = twoSections.secondarySection;
            }
            return twoSections.copy(section, section2);
        }
    }

    public /* synthetic */ CurrencyListMode(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
