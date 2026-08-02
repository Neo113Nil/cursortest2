package com.paypal.oslo.feature.p2p.ui.currencypicker.events;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadCurrencies", "LoadCryptos", "TabChanged", "SearchQueryChanged", "CurrencyClicked", "CurrencyClickedWithProcessor", com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_CURRENCIES_LOADED, "CurrenciesLoadFailed", "CryptosLoaded", "UpdateDisplayedCurrencies", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CryptosLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrenciesLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrenciesLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrencyClicked;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrencyClickedWithProcessor;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$LoadCryptos;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$LoadCurrencies;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$TabChanged;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$UpdateDisplayedCurrencies;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CurrencyPickerEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CurrencyPickerEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$LoadCurrencies;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "transferAttemptID", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$LoadCurrencies;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadCurrencies extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        private final java.lang.String transferAttemptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadCurrencies(java.lang.String str) {
            super("LoadCurrencies", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transferAttemptID = str;
        }

        public final java.lang.String getTransferAttemptID() {
            return this.transferAttemptID;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadCurrencies(transferAttemptID=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferAttemptID.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptID, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies) other).transferAttemptID);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies copy(java.lang.String transferAttemptID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptID, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies(transferAttemptID);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptID() {
            return this.transferAttemptID;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies loadCurrencies, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loadCurrencies.transferAttemptID;
            }
            return loadCurrencies.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$LoadCryptos;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadCryptos extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCryptos INSTANCE = new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCryptos();

        public final int hashCode() {
            return 371809834;
        }

        private LoadCryptos() {
            super("LoadCryptos", null);
        }

        public final java.lang.String toString() {
            return "LoadCryptos";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCryptos)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$TabChanged;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "type", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$TabChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TabChanged extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabChanged(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType) {
            super("TabChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
            this.type = currencyType;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TabChanged(type=");
            sb.append(currencyType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged) && this.type == ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged) other).type;
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged tabChanged, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencyType = tabChanged.type;
            }
            return tabChanged.copy(currencyType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$SearchQueryChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchQueryChanged extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        private final java.lang.String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchQueryChanged(java.lang.String str) {
            super("SearchQueryChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.query = str;
        }

        public final java.lang.String getQuery() {
            return this.query;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.query;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchQueryChanged(query=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged) other).query);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged copy(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged(query);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQuery() {
            return this.query;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged searchQueryChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchQueryChanged.query;
            }
            return searchQueryChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrencyClicked;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "currencyId", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrencyClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyId", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrencyClicked extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String currencyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyClicked(java.lang.String str, java.lang.String str2) {
            super("CurrencyClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyId = str;
            this.currencyCode = str2;
        }

        public final java.lang.String getCurrencyId() {
            return this.currencyId;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currencyId;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyClicked(currencyId=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyId.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked currencyClicked = (com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyId, currencyClicked.currencyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, currencyClicked.currencyCode);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked copy(java.lang.String currencyId, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked(currencyId, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrencyId() {
            return this.currencyId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked currencyClicked, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currencyClicked.currencyId;
            }
            if ((i & 2) != 0) {
                str2 = currencyClicked.currencyCode;
            }
            return currencyClicked.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrencyClickedWithProcessor;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "selectedCurrency", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrencyClickedWithProcessor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "getSelectedCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrencyClickedWithProcessor extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem selectedCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyClickedWithProcessor(com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem) {
            super("CurrencyClickedWithProcessor", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
            this.selectedCurrency = currencyItem;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem getSelectedCurrency() {
            return this.selectedCurrency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem = this.selectedCurrency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyClickedWithProcessor(selectedCurrency=");
            sb.append(currencyItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedCurrency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCurrency, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor) other).selectedCurrency);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor copy(com.paypal.oslo.feature.p2p.domain.model.CurrencyItem selectedCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor(selectedCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem getSelectedCurrency() {
            return this.selectedCurrency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor currencyClickedWithProcessor, com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencyItem = currencyClickedWithProcessor.selectedCurrency;
            }
            return currencyClickedWithProcessor.copy(currencyItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrenciesLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "currencies", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrenciesLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCurrencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrenciesLoaded extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrenciesLoaded(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_CURRENCIES_LOADED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.currencies = list;
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getCurrencies() {
            return this.currencies;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list = this.currencies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrenciesLoaded(currencies=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded) other).currencies);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded(currencies);
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> component1() {
            return this.currencies;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded currenciesLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = currenciesLoaded.currencies;
            }
            return currenciesLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrenciesLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CurrenciesLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrenciesLoadFailed extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        public CurrenciesLoadFailed(java.lang.String str) {
            super("CurrenciesLoadFailed", null);
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrenciesLoadFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed copy(java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed currenciesLoadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currenciesLoadFailed.errorMessage;
            }
            return currenciesLoadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CryptosLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "cryptos", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$CryptosLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCryptos"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptosLoaded extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> cryptos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptosLoaded(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
            super("CryptosLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.cryptos = list;
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getCryptos() {
            return this.cryptos;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list = this.cryptos;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptosLoaded(cryptos=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cryptos.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptos, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded) other).cryptos);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> cryptos) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptos, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded(cryptos);
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> component1() {
            return this.cryptos;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded cryptosLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = cryptosLoaded.cryptos;
            }
            return cryptosLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$UpdateDisplayedCurrencies;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "filteredCurrencies", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent$UpdateDisplayedCurrencies;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFilteredCurrencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateDisplayedCurrencies extends com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> filteredCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDisplayedCurrencies(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
            super("UpdateDisplayedCurrencies", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.filteredCurrencies = list;
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getFilteredCurrencies() {
            return this.filteredCurrencies;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list = this.filteredCurrencies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateDisplayedCurrencies(filteredCurrencies=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filteredCurrencies.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.filteredCurrencies, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies) other).filteredCurrencies);
        }

        public final com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> filteredCurrencies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filteredCurrencies, "");
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies(filteredCurrencies);
        }

        public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> component1() {
            return this.filteredCurrencies;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies updateDisplayedCurrencies, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = updateDisplayedCurrencies.filteredCurrencies;
            }
            return updateDisplayedCurrencies.copy(list);
        }
    }

    public /* synthetic */ CurrencyPickerEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
