package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Saving", "Error", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Error;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Initial;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Loading;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Ready;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Saving;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FundingSourceSelectorUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private FundingSourceSelectorUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Initial;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial();

        public final int hashCode() {
            return -2088925272;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Loading;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading();

        public final int hashCode() {
            return 594350496;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Ready;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "", "selectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "availableFundingSources", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "variant", "", "showContingencyBanner", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SecondaryFundingOptionType;", "secondaryFundingOptions", "isEmptyState", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;ZLjava/util/Set;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "component4", "()Z", "component5", "()Ljava/util/Set;", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;ZLjava/util/Set;Z)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "getAvailableFundingSources", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "getVariant", "Z", "getShowContingencyBanner", "Ljava/util/Set;", "getSecondaryFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingSources;
        private final boolean isEmptyState;
        private final java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> secondaryFundingOptions;
        private final java.lang.String selectedFundingSourceId;
        private final boolean showContingencyBanner;
        private final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, boolean z, java.util.Set<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set, boolean z2) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAvailableFundingOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorVariant, "");
            this.selectedFundingSourceId = str;
            this.availableFundingSources = debitCardAvailableFundingOptions;
            this.variant = fundingSourceSelectorVariant;
            this.showContingencyBanner = z;
            this.secondaryFundingOptions = set;
            this.isEmptyState = z2;
        }

        public /* synthetic */ Ready(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, boolean z, java.util.Set set, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, debitCardAvailableFundingOptions, fundingSourceSelectorVariant, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : set, (i & 32) != 0 ? false : z2);
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingSources() {
            return this.availableFundingSources;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        public final boolean getShowContingencyBanner() {
            return this.showContingencyBanner;
        }

        public final java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> getSecondaryFundingOptions() {
            return this.secondaryFundingOptions;
        }

        public final boolean isEmptyState() {
            return this.isEmptyState;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedFundingSourceId;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions = this.availableFundingSources;
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = this.variant;
            boolean z = this.showContingencyBanner;
            java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set = this.secondaryFundingOptions;
            boolean z2 = this.isEmptyState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(selectedFundingSourceId=");
            sb.append(str);
            sb.append(", availableFundingSources=");
            sb.append(debitCardAvailableFundingOptions);
            sb.append(", variant=");
            sb.append(fundingSourceSelectorVariant);
            sb.append(", showContingencyBanner=");
            sb.append(z);
            sb.append(", secondaryFundingOptions=");
            sb.append(set);
            sb.append(", isEmptyState=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.selectedFundingSourceId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.availableFundingSources.hashCode();
            int hashCode3 = this.variant.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.showContingencyBanner);
            java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> set = this.secondaryFundingOptions;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (set != null ? set.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isEmptyState);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready ready = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, ready.selectedFundingSourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableFundingSources, ready.availableFundingSources) && this.variant == ready.variant && this.showContingencyBanner == ready.showContingencyBanner && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryFundingOptions, ready.secondaryFundingOptions) && this.isEmptyState == ready.isEmptyState;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready copy(java.lang.String selectedFundingSourceId, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingSources, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant, boolean showContingencyBanner, java.util.Set<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> secondaryFundingOptions, boolean isEmptyState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableFundingSources, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready(selectedFundingSourceId, availableFundingSources, variant, showContingencyBanner, secondaryFundingOptions, isEmptyState);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsEmptyState() {
            return this.isEmptyState;
        }

        public final java.util.Set<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType> component5() {
            return this.secondaryFundingOptions;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowContingencyBanner() {
            return this.showContingencyBanner;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingSources() {
            return this.availableFundingSources;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready ready, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, boolean z, java.util.Set set, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ready.selectedFundingSourceId;
            }
            if ((i & 2) != 0) {
                debitCardAvailableFundingOptions = ready.availableFundingSources;
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions2 = debitCardAvailableFundingOptions;
            if ((i & 4) != 0) {
                fundingSourceSelectorVariant = ready.variant;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant2 = fundingSourceSelectorVariant;
            if ((i & 8) != 0) {
                z = ready.showContingencyBanner;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                set = ready.secondaryFundingOptions;
            }
            java.util.Set set2 = set;
            if ((i & 32) != 0) {
                z2 = ready.isEmptyState;
            }
            return ready.copy(str, debitCardAvailableFundingOptions2, fundingSourceSelectorVariant2, z3, set2, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Saving;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "", "selectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "availableFundingSources", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "variant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Saving;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedFundingSourceId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "getAvailableFundingSources", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "getVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Saving extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingSources;
        private final java.lang.String selectedFundingSourceId;
        private final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saving(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant) {
            super("Saving", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAvailableFundingOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSelectorVariant, "");
            this.selectedFundingSourceId = str;
            this.availableFundingSources = debitCardAvailableFundingOptions;
            this.variant = fundingSourceSelectorVariant;
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingSources() {
            return this.availableFundingSources;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedFundingSourceId;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions = this.availableFundingSources;
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = this.variant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Saving(selectedFundingSourceId=");
            sb.append(str);
            sb.append(", availableFundingSources=");
            sb.append(debitCardAvailableFundingOptions);
            sb.append(", variant=");
            sb.append(fundingSourceSelectorVariant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.selectedFundingSourceId.hashCode() * 31) + this.availableFundingSources.hashCode()) * 31) + this.variant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving saving = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, saving.selectedFundingSourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableFundingSources, saving.availableFundingSources) && this.variant == saving.variant;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving copy(java.lang.String selectedFundingSourceId, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions availableFundingSources, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant variant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingSourceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableFundingSources, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving(selectedFundingSourceId, availableFundingSources, variant);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions getAvailableFundingSources() {
            return this.availableFundingSources;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving saving, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = saving.selectedFundingSourceId;
            }
            if ((i & 2) != 0) {
                debitCardAvailableFundingOptions = saving.availableFundingSources;
            }
            if ((i & 4) != 0) {
                fundingSourceSelectorVariant = saving.variant;
            }
            return saving.copy(str, debitCardAvailableFundingOptions, fundingSourceSelectorVariant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState$Error;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error();

        public final int hashCode() {
            return 1853475692;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FundingSourceSelectorUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
