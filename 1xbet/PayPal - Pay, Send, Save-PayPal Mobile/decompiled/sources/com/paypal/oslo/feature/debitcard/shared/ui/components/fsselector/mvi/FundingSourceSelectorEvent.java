package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000e\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FetchAvailableFundingSourcesFromCache", "FetchAvailableFundingSourcesFromRemote", "OnAvailableFundingSourcesFetched", "OnFundingSourceSelected", "OnDoneClicked", "OnCancelClicked", "OnLinkBankClicked", "OnLinkCardClicked", "LinkedEvent", "OnBankLinked", "OnCardLinked", "OnFetchFailed", "OnRetryClicked", "OnSaveFundingSourceSuccess", "OnSaveFundingSourceFailed", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$FetchAvailableFundingSourcesFromCache;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$FetchAvailableFundingSourcesFromRemote;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnAvailableFundingSourcesFetched;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnBankLinked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnCancelClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnCardLinked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnDoneClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnFetchFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnFundingSourceSelected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnLinkBankClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnLinkCardClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnRetryClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnSaveFundingSourceFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnSaveFundingSourceSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FundingSourceSelectorEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$LinkedEvent;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "getVariant", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "variant", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnBankLinked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnCardLinked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface LinkedEvent {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName();

        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant();
    }

    private FundingSourceSelectorEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$FetchAvailableFundingSourcesFromCache;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchAvailableFundingSourcesFromCache extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromCache INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromCache();

        public final int hashCode() {
            return -669354705;
        }

        private FetchAvailableFundingSourcesFromCache() {
            super("FetchAvailableFundingSourcesFromCache", null);
        }

        public final java.lang.String toString() {
            return "FetchAvailableFundingSourcesFromCache";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromCache)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$FetchAvailableFundingSourcesFromRemote;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$FetchAvailableFundingSourcesFromRemote;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchAvailableFundingSourcesFromRemote extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchAvailableFundingSourcesFromRemote(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
            super("FetchAvailableFundingSourcesFromRemote", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
            this.cardId = str;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchAvailableFundingSourcesFromRemote(productName=");
            sb.append(debitCardProductName);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.productName.hashCode();
            java.lang.String str = this.cardId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote fetchAvailableFundingSourcesFromRemote = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote) other;
            return this.productName == fetchAvailableFundingSourcesFromRemote.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, fetchAvailableFundingSourcesFromRemote.cardId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote(productName, cardId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote fetchAvailableFundingSourcesFromRemote, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = fetchAvailableFundingSourcesFromRemote.productName;
            }
            if ((i & 2) != 0) {
                str = fetchAvailableFundingSourcesFromRemote.cardId;
            }
            return fetchAvailableFundingSourcesFromRemote.copy(debitCardProductName, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnAvailableFundingSourcesFetched;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "availableFundingSources", "", "selectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "variant", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType;", "secondaryFundingOptions", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;Ljava/util/Set;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "component4", "()Ljava/util/Set;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;Ljava/util/Set;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnAvailableFundingSourcesFetched;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "getAvailableFundingSources", "Ljava/lang/String;", "getSelectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "getVariant", "Ljava/util/Set;", "getSecondaryFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAvailableFundingSourcesFetched extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingSources;
        private final java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> secondaryFundingOptions;
        private final java.lang.String selectedFundingSourceId;
        private final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnAvailableFundingSourcesFetched(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, java.util.Set<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set) {
            super("OnAvailableFundingSourcesFetched", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAvailableFundingOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorVariant, "");
            this.availableFundingSources = debitCardAvailableFundingOptions;
            this.selectedFundingSourceId = str;
            this.variant = fundingSourceSelectorVariant;
            this.secondaryFundingOptions = set;
        }

        public /* synthetic */ OnAvailableFundingSourcesFetched(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitCardAvailableFundingOptions, str, fundingSourceSelectorVariant, (i & 8) != 0 ? null : set);
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingSources() {
            return this.availableFundingSources;
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        public final java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> getSecondaryFundingOptions() {
            return this.secondaryFundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions = this.availableFundingSources;
            java.lang.String str = this.selectedFundingSourceId;
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = this.variant;
            java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set = this.secondaryFundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAvailableFundingSourcesFetched(availableFundingSources=");
            sb.append(debitCardAvailableFundingOptions);
            sb.append(", selectedFundingSourceId=");
            sb.append(str);
            sb.append(", variant=");
            sb.append(fundingSourceSelectorVariant);
            sb.append(", secondaryFundingOptions=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.availableFundingSources.hashCode();
            java.lang.String str = this.selectedFundingSourceId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.variant.hashCode();
            java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set = this.secondaryFundingOptions;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (set != null ? set.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched onAvailableFundingSourcesFetched = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.availableFundingSources, onAvailableFundingSourcesFetched.availableFundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, onAvailableFundingSourcesFetched.selectedFundingSourceId) && this.variant == onAvailableFundingSourcesFetched.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryFundingOptions, onAvailableFundingSourcesFetched.secondaryFundingOptions);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched copy(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingSources, java.lang.String selectedFundingSourceId, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant, java.util.Set<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> secondaryFundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableFundingSources, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched(availableFundingSources, selectedFundingSourceId, variant, secondaryFundingOptions);
        }

        public final java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> component4() {
            return this.secondaryFundingOptions;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingSources() {
            return this.availableFundingSources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched onAvailableFundingSourcesFetched, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardAvailableFundingOptions = onAvailableFundingSourcesFetched.availableFundingSources;
            }
            if ((i & 2) != 0) {
                str = onAvailableFundingSourcesFetched.selectedFundingSourceId;
            }
            if ((i & 4) != 0) {
                fundingSourceSelectorVariant = onAvailableFundingSourcesFetched.variant;
            }
            if ((i & 8) != 0) {
                set = onAvailableFundingSourcesFetched.secondaryFundingOptions;
            }
            return onAvailableFundingSourcesFetched.copy(debitCardAvailableFundingOptions, str, fundingSourceSelectorVariant, set);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnFundingSourceSelected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnFundingSourceSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "getFundingSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingSourceSelected extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource fundingSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFundingSourceSelected(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource) {
            super("OnFundingSourceSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingSource, "");
            this.fundingSource = debitCardFundingSource;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource getFundingSource() {
            return this.fundingSource;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource = this.fundingSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFundingSourceSelected(fundingSource=");
            sb.append(debitCardFundingSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, ((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected) other).fundingSource);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected copy(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource fundingSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSource, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected(fundingSource);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource getFundingSource() {
            return this.fundingSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected onFundingSourceSelected, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardFundingSource = onFundingSourceSelected.fundingSource;
            }
            return onFundingSourceSelected.copy(debitCardFundingSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnDoneClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDoneClicked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnDoneClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnDoneClicked();

        public final int hashCode() {
            return -515367161;
        }

        private OnDoneClicked() {
            super("OnDoneClicked", null);
        }

        public final java.lang.String toString() {
            return "OnDoneClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnDoneClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnCancelClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelClicked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked();

        public final int hashCode() {
            return 1394091151;
        }

        private OnCancelClicked() {
            super("OnCancelClicked", null);
        }

        public final java.lang.String toString() {
            return "OnCancelClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnLinkBankClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLinkBankClicked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkBankClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkBankClicked();

        public final int hashCode() {
            return 1024884147;
        }

        private OnLinkBankClicked() {
            super("OnLinkBankClicked", null);
        }

        public final java.lang.String toString() {
            return "OnLinkBankClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkBankClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnLinkCardClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLinkCardClicked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkCardClicked();

        public final int hashCode() {
            return 1273279071;
        }

        private OnLinkCardClicked() {
            super("OnLinkCardClicked", null);
        }

        public final java.lang.String toString() {
            return "OnLinkCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnBankLinked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$LinkedEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "variant", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnBankLinked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "getVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankLinked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent implements com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBankLinked(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant) {
            super("OnBankLinked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorVariant, "");
            this.productName = debitCardProductName;
            this.variant = fundingSourceSelectorVariant;
        }

        @Override // com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        @Override // com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = this.variant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankLinked(productName=");
            sb.append(debitCardProductName);
            sb.append(", variant=");
            sb.append(fundingSourceSelectorVariant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.productName.hashCode() * 31) + this.variant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked onBankLinked = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked) other;
            return this.productName == onBankLinked.productName && this.variant == onBankLinked.variant;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked(productName, variant);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked onBankLinked, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = onBankLinked.productName;
            }
            if ((i & 2) != 0) {
                fundingSourceSelectorVariant = onBankLinked.variant;
            }
            return onBankLinked.copy(debitCardProductName, fundingSourceSelectorVariant);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnCardLinked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$LinkedEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "variant", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnCardLinked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "getVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCardLinked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent implements com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCardLinked(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant) {
            super("OnCardLinked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorVariant, "");
            this.productName = debitCardProductName;
            this.variant = fundingSourceSelectorVariant;
        }

        @Override // com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        @Override // com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.LinkedEvent
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = this.variant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCardLinked(productName=");
            sb.append(debitCardProductName);
            sb.append(", variant=");
            sb.append(fundingSourceSelectorVariant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.productName.hashCode() * 31) + this.variant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked onCardLinked = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked) other;
            return this.productName == onCardLinked.productName && this.variant == onCardLinked.variant;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked(productName, variant);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked onCardLinked, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = onCardLinked.productName;
            }
            if ((i & 2) != 0) {
                fundingSourceSelectorVariant = onCardLinked.variant;
            }
            return onCardLinked.copy(debitCardProductName, fundingSourceSelectorVariant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnFetchFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFetchFailed extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFetchFailed INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFetchFailed();

        public final int hashCode() {
            return -1911831463;
        }

        private OnFetchFailed() {
            super("OnFetchFailed", null);
        }

        public final java.lang.String toString() {
            return "OnFetchFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFetchFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnRetryClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetryClicked extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnRetryClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnRetryClicked();

        public final int hashCode() {
            return -1715101731;
        }

        private OnRetryClicked() {
            super("OnRetryClicked", null);
        }

        public final java.lang.String toString() {
            return "OnRetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnRetryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnSaveFundingSourceSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "", "selectedFundingSourceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnSaveFundingSourceSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedFundingSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSaveFundingSourceSuccess extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        private final java.lang.String selectedFundingSourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSaveFundingSourceSuccess(java.lang.String str) {
            super("OnSaveFundingSourceSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.selectedFundingSourceId = str;
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedFundingSourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSaveFundingSourceSuccess(selectedFundingSourceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedFundingSourceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, ((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess) other).selectedFundingSourceId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess copy(java.lang.String selectedFundingSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingSourceId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess(selectedFundingSourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess onSaveFundingSourceSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSaveFundingSourceSuccess.selectedFundingSourceId;
            }
            return onSaveFundingSourceSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent$OnSaveFundingSourceFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSaveFundingSourceFailed extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed();

        public final int hashCode() {
            return 207183066;
        }

        private OnSaveFundingSourceFailed() {
            super("OnSaveFundingSourceFailed", null);
        }

        public final java.lang.String toString() {
            return "OnSaveFundingSourceFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FundingSourceSelectorEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
