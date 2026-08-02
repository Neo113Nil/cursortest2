package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u001e\u001f !\"#B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0006$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "cardNumber", "getCardNumber", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "Ljava/util/List;", "getLatestChallenges", "()Ljava/util/List;", "", "getShowMoreOptions", "()Z", "showMoreOptions", "Initial", "Loading", "ValidationSuccess", "InlineError", "BannerError", "MaxAttemptsReached", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$BannerError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$InlineError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$ValidationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupCreditCardState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.lang.String cardNumber;
    private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge();

    public abstract com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard();

    private StepupCreditCardState(java.lang.String str) {
        this.name = str;
        this.cardNumber = "";
        this.latestChallenges = kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
        return this.latestChallenges;
    }

    public final boolean getShowMoreOptions() {
        return getLatestChallenges().size() > 1 || getChallenge().getCards().size() > 1;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJd\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0019R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0019R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001cR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b3\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "", "cardNumber", "", "showCardSelectionSheet", "hasCompletedInitialSelection", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "moreOptionsState", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Initial;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "Ljava/lang/String;", "getCardNumber", "Z", "getShowCardSelectionSheet", "getHasCompletedInitialSelection", "Ljava/util/List;", "getMoreOptionsState", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState {
        public static final int $stable = 8;
        private final java.lang.String cardNumber;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final boolean hasCompletedInitialSelection;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> moreOptionsState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard;
        private final boolean showCardSelectionSheet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, boolean z, boolean z2, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2) {
            super("StepupCreditCardState.Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.challenge = creditCardChallenge;
            this.selectedCard = creditCard;
            this.cardNumber = str;
            this.showCardSelectionSheet = z;
            this.hasCompletedInitialSelection = z2;
            this.moreOptionsState = list;
            this.latestChallenges = list2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        public /* synthetic */ Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, boolean z, boolean z2, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, creditCard, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public final boolean getShowCardSelectionSheet() {
            return this.showCardSelectionSheet;
        }

        public final boolean getHasCompletedInitialSelection() {
            return this.hasCompletedInitialSelection;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getMoreOptionsState() {
            return this.moreOptionsState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.selectedCard;
            java.lang.String str = this.cardNumber;
            boolean z = this.showCardSelectionSheet;
            boolean z2 = this.hasCompletedInitialSelection;
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.moreOptionsState;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2 = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", selectedCard=");
            sb.append(creditCard);
            sb.append(", cardNumber=");
            sb.append(str);
            sb.append(", showCardSelectionSheet=");
            sb.append(z);
            sb.append(", hasCompletedInitialSelection=");
            sb.append(z2);
            sb.append(", moreOptionsState=");
            sb.append(list);
            sb.append(", latestChallenges=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.selectedCard.hashCode();
            int hashCode3 = this.cardNumber.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.showCardSelectionSheet);
            int hashCode5 = java.lang.Boolean.hashCode(this.hasCompletedInitialSelection);
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.moreOptionsState;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, initial.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCard, initial.selectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, initial.cardNumber) && this.showCardSelectionSheet == initial.showCardSelectionSheet && this.hasCompletedInitialSelection == initial.hasCompletedInitialSelection && kotlin.jvm.internal.Intrinsics.areEqual(this.moreOptionsState, initial.moreOptionsState) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, initial.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard, java.lang.String cardNumber, boolean showCardSelectionSheet, boolean hasCompletedInitialSelection, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> moreOptionsState, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial(challenge, selectedCard, cardNumber, showCardSelectionSheet, hasCompletedInitialSelection, moreOptionsState, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component7() {
            return this.latestChallenges;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component6() {
            return this.moreOptionsState;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasCompletedInitialSelection() {
            return this.hasCompletedInitialSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowCardSelectionSheet() {
            return this.showCardSelectionSheet;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Initial initial, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, boolean z, boolean z2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditCardChallenge = initial.challenge;
            }
            if ((i & 2) != 0) {
                creditCard = initial.selectedCard;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard2 = creditCard;
            if ((i & 4) != 0) {
                str = initial.cardNumber;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                z = initial.showCardSelectionSheet;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = initial.hasCompletedInitialSelection;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                list = initial.moreOptionsState;
            }
            java.util.List list3 = list;
            if ((i & 64) != 0) {
                list2 = initial.latestChallenges;
            }
            return initial.copy(creditCardChallenge, creditCard2, str2, z3, z4, list3, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "", "cardNumber", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "Ljava/lang/String;", "getCardNumber", "Ljava/util/List;", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState {
        public static final int $stable = 8;
        private final java.lang.String cardNumber;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupCreditCardState.Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = creditCardChallenge;
            this.selectedCard = creditCard;
            this.cardNumber = str;
            this.latestChallenges = list;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, creditCard, str, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.selectedCard;
            java.lang.String str = this.cardNumber;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", selectedCard=");
            sb.append(creditCard);
            sb.append(", cardNumber=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.challenge.hashCode() * 31) + this.selectedCard.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, loading.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCard, loading.selectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, loading.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, loading.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard, java.lang.String cardNumber, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading(challenge, selectedCard, cardNumber, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component4() {
            return this.latestChallenges;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.Loading loading, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditCardChallenge = loading.challenge;
            }
            if ((i & 2) != 0) {
                creditCard = loading.selectedCard;
            }
            if ((i & 4) != 0) {
                str = loading.cardNumber;
            }
            if ((i & 8) != 0) {
                list = loading.latestChallenges;
            }
            return loading.copy(creditCardChallenge, creditCard, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015JL\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b*\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$ValidationSuccess;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "", "nonce", "partialToken", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$ValidationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "Ljava/util/List;", "getLatestChallenges", "Ljava/lang/String;", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationSuccess extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationSuccess(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.lang.String str, java.lang.String str2) {
            super("StepupCreditCardState.ValidationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = creditCardChallenge;
            this.selectedCard = creditCard;
            this.latestChallenges = list;
            this.nonce = str;
            this.partialToken = str2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        public /* synthetic */ ValidationSuccess(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, creditCard, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.selectedCard;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.String str = this.nonce;
            java.lang.String str2 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationSuccess(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", selectedCard=");
            sb.append(creditCard);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", nonce=");
            sb.append(str);
            sb.append(", partialToken=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.selectedCard.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            java.lang.String str = this.nonce;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, validationSuccess.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCard, validationSuccess.selectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, validationSuccess.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, validationSuccess.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, validationSuccess.partialToken);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess(challenge, selectedCard, latestChallenges, nonce, partialToken);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.ValidationSuccess validationSuccess, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditCardChallenge = validationSuccess.challenge;
            }
            if ((i & 2) != 0) {
                creditCard = validationSuccess.selectedCard;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard2 = creditCard;
            if ((i & 4) != 0) {
                list = validationSuccess.latestChallenges;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                str = validationSuccess.nonce;
            }
            java.lang.String str3 = str;
            if ((i & 16) != 0) {
                str2 = validationSuccess.partialToken;
            }
            return validationSuccess.copy(creditCardChallenge, creditCard2, list2, str3, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001aR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b/\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$InlineError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "", "cardNumber", "", "errorMessageResId", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "moreOptionsState", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "component3", "()Ljava/lang/String;", "component4", "()I", "component5", "()Ljava/util/List;", "component6", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$InlineError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "Ljava/lang/String;", "getCardNumber", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Ljava/util/List;", "getMoreOptionsState", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InlineError extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState {
        public static final int $stable = 8;
        private final java.lang.String cardNumber;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final int errorMessageResId;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> moreOptionsState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InlineError(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, int i, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2) {
            super("StepupCreditCardState.InlineError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.challenge = creditCardChallenge;
            this.selectedCard = creditCard;
            this.cardNumber = str;
            this.errorMessageResId = i;
            this.moreOptionsState = list;
            this.latestChallenges = list2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getMoreOptionsState() {
            return this.moreOptionsState;
        }

        public /* synthetic */ InlineError(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, int i, java.util.List list, java.util.List list2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, creditCard, str, i, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.selectedCard;
            java.lang.String str = this.cardNumber;
            int i = this.errorMessageResId;
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.moreOptionsState;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2 = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InlineError(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", selectedCard=");
            sb.append(creditCard);
            sb.append(", cardNumber=");
            sb.append(str);
            sb.append(", errorMessageResId=");
            sb.append(i);
            sb.append(", moreOptionsState=");
            sb.append(list);
            sb.append(", latestChallenges=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.selectedCard.hashCode();
            int hashCode3 = this.cardNumber.hashCode();
            int hashCode4 = java.lang.Integer.hashCode(this.errorMessageResId);
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.moreOptionsState;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError inlineError = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, inlineError.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCard, inlineError.selectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, inlineError.cardNumber) && this.errorMessageResId == inlineError.errorMessageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.moreOptionsState, inlineError.moreOptionsState) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, inlineError.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard, java.lang.String cardNumber, int errorMessageResId, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> moreOptionsState, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError(challenge, selectedCard, cardNumber, errorMessageResId, moreOptionsState, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component6() {
            return this.latestChallenges;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component5() {
            return this.moreOptionsState;
        }

        /* renamed from: component4, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.InlineError inlineError, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, int i, java.util.List list, java.util.List list2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                creditCardChallenge = inlineError.challenge;
            }
            if ((i2 & 2) != 0) {
                creditCard = inlineError.selectedCard;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard2 = creditCard;
            if ((i2 & 4) != 0) {
                str = inlineError.cardNumber;
            }
            java.lang.String str2 = str;
            if ((i2 & 8) != 0) {
                i = inlineError.errorMessageResId;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                list = inlineError.moreOptionsState;
            }
            java.util.List list3 = list;
            if ((i2 & 32) != 0) {
                list2 = inlineError.latestChallenges;
            }
            return inlineError.copy(creditCardChallenge, creditCard2, str2, i3, list3, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001aR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b/\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$BannerError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "", "cardNumber", "", "errorMessageResId", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "moreOptionsState", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "component3", "()Ljava/lang/String;", "component4", "()I", "component5", "()Ljava/util/List;", "component6", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$BannerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "Ljava/lang/String;", "getCardNumber", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Ljava/util/List;", "getMoreOptionsState", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BannerError extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState {
        public static final int $stable = 8;
        private final java.lang.String cardNumber;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final int errorMessageResId;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> moreOptionsState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BannerError(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, int i, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2) {
            super("StepupCreditCardState.BannerError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.challenge = creditCardChallenge;
            this.selectedCard = creditCard;
            this.cardNumber = str;
            this.errorMessageResId = i;
            this.moreOptionsState = list;
            this.latestChallenges = list2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getMoreOptionsState() {
            return this.moreOptionsState;
        }

        public /* synthetic */ BannerError(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, int i, java.util.List list, java.util.List list2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, creditCard, str, i, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.selectedCard;
            java.lang.String str = this.cardNumber;
            int i = this.errorMessageResId;
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.moreOptionsState;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2 = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BannerError(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", selectedCard=");
            sb.append(creditCard);
            sb.append(", cardNumber=");
            sb.append(str);
            sb.append(", errorMessageResId=");
            sb.append(i);
            sb.append(", moreOptionsState=");
            sb.append(list);
            sb.append(", latestChallenges=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.selectedCard.hashCode();
            int hashCode3 = this.cardNumber.hashCode();
            int hashCode4 = java.lang.Integer.hashCode(this.errorMessageResId);
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.moreOptionsState;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError bannerError = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, bannerError.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCard, bannerError.selectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, bannerError.cardNumber) && this.errorMessageResId == bannerError.errorMessageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.moreOptionsState, bannerError.moreOptionsState) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, bannerError.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard, java.lang.String cardNumber, int errorMessageResId, java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> moreOptionsState, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError(challenge, selectedCard, cardNumber, errorMessageResId, moreOptionsState, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component6() {
            return this.latestChallenges;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component5() {
            return this.moreOptionsState;
        }

        /* renamed from: component4, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.BannerError bannerError, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.lang.String str, int i, java.util.List list, java.util.List list2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                creditCardChallenge = bannerError.challenge;
            }
            if ((i2 & 2) != 0) {
                creditCard = bannerError.selectedCard;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard2 = creditCard;
            if ((i2 & 4) != 0) {
                str = bannerError.cardNumber;
            }
            java.lang.String str2 = str;
            if ((i2 & 8) != 0) {
                i = bannerError.errorMessageResId;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                list = bannerError.moreOptionsState;
            }
            java.util.List list3 = list;
            if ((i2 & 32) != 0) {
                list2 = bannerError.latestChallenges;
            }
            return bannerError.copy(creditCardChallenge, creditCard2, str2, i3, list3, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JD\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "selectedCard", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "availableChallenges", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "component3", "()Ljava/util/List;", "component4", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardState$MaxAttemptsReached;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getSelectedCard", "Ljava/util/List;", "getAvailableChallenges", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxAttemptsReached extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MaxAttemptsReached(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2) {
            super("StepupCreditCardState.MaxAttemptsReached", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.challenge = creditCardChallenge;
            this.selectedCard = creditCard;
            this.availableChallenges = list;
            this.latestChallenges = list2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getAvailableChallenges() {
            return this.availableChallenges;
        }

        public /* synthetic */ MaxAttemptsReached(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, creditCard, list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.selectedCard;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.availableChallenges;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2 = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxAttemptsReached(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", selectedCard=");
            sb.append(creditCard);
            sb.append(", availableChallenges=");
            sb.append(list);
            sb.append(", latestChallenges=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.challenge.hashCode() * 31) + this.selectedCard.hashCode()) * 31) + this.availableChallenges.hashCode()) * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, maxAttemptsReached.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCard, maxAttemptsReached.selectedCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableChallenges, maxAttemptsReached.availableChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, maxAttemptsReached.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard selectedCard, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableChallenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached(challenge, selectedCard, availableChallenges, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component4() {
            return this.latestChallenges;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.availableChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getSelectedCard() {
            return this.selectedCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardState.MaxAttemptsReached maxAttemptsReached, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditCardChallenge = maxAttemptsReached.challenge;
            }
            if ((i & 2) != 0) {
                creditCard = maxAttemptsReached.selectedCard;
            }
            if ((i & 4) != 0) {
                list = maxAttemptsReached.availableChallenges;
            }
            if ((i & 8) != 0) {
                list2 = maxAttemptsReached.latestChallenges;
            }
            return maxAttemptsReached.copy(creditCardChallenge, creditCard, list, list2);
        }
    }

    public /* synthetic */ StepupCreditCardState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
