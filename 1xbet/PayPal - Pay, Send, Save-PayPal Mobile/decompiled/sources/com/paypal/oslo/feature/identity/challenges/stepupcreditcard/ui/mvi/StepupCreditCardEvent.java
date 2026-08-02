package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ChallengeInitialized", "CardNumberChanged", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, "ValidationSuccess", "ValidationFailed", "MultiChallengeStepUp", "TechnicalError", "MoreOptionsClicked", "ShowMoreOptions", "MoreOptionSelected", "MoreOptionsDismissed", "BackClicked", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "CardSelectorClicked", "CardSelected", "CardSelectionDismissed", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$BackClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardNumberChanged;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelectionDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelectorClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ChallengeInitialized;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$DismissError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionsClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionsDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MultiChallengeStepUp;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ShowMoreOptions;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$SubmitClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$TechnicalError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ValidationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupCreditCardEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupCreditCardEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ChallengeInitialized;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ChallengeInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCardChallenge;", "getChallenge", "Ljava/util/List;", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeInitialized extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChallengeInitialized(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupCreditCardEvent.ChallengeInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = creditCardChallenge;
            this.latestChallenges = list;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ ChallengeInitialized(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditCardChallenge, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge = this.challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeInitialized(challenge=");
            sb.append(creditCardChallenge);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.challenge.hashCode() * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized challengeInitialized = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, challengeInitialized.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, challengeInitialized.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized(challenge, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.latestChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ChallengeInitialized challengeInitialized, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditCardChallenge = challengeInitialized.challenge;
            }
            if ((i & 2) != 0) {
                list = challengeInitialized.latestChallenges;
            }
            return challengeInitialized.copy(creditCardChallenge, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardNumberChanged;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardNumberChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardNumberChanged extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        private final java.lang.String cardNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardNumberChanged(java.lang.String str) {
            super("StepupCreditCardEvent.CardNumberChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardNumber = str;
        }

        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardNumberChanged(cardNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged) other).cardNumber);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged copy(java.lang.String cardNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged(cardNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardNumber() {
            return this.cardNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardNumberChanged cardNumberChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardNumberChanged.cardNumber;
            }
            return cardNumberChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$SubmitClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitClicked extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.SubmitClicked INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.SubmitClicked();

        public final int hashCode() {
            return -974677950;
        }

        private SubmitClicked() {
            super("StepupCreditCardEvent.SubmitClicked", null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.SubmitClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011JT\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ValidationSuccess;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "", "nonce", "partialToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ValidationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "getToken", "Ljava/util/List;", "getChallenges", "Ljava/lang/String;", "getNonce", "getPartialToken", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationSuccess extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationSuccess(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list2) {
            super("StepupCreditCardEvent.ValidationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.token = userAccessToken;
            this.challenges = list;
            this.nonce = str;
            this.partialToken = str2;
            this.postAuthOperations = list2;
        }

        public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
            return this.token;
        }

        public /* synthetic */ ValidationSuccess(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, java.lang.String str, java.lang.String str2, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userAccessToken, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getChallenges() {
            return this.challenges;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
            return this.postAuthOperations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.challenges;
            java.lang.String str = this.nonce;
            java.lang.String str2 = this.partialToken;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list2 = this.postAuthOperations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationSuccess(token=");
            sb.append(userAccessToken);
            sb.append(", challenges=");
            sb.append(list);
            sb.append(", nonce=");
            sb.append(str);
            sb.append(", partialToken=");
            sb.append(str2);
            sb.append(", postAuthOperations=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
            int hashCode = userAccessToken == null ? 0 : userAccessToken.hashCode();
            int hashCode2 = this.challenges.hashCode();
            java.lang.String str = this.nonce;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.postAuthOperations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, validationSuccess.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, validationSuccess.challenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, validationSuccess.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, validationSuccess.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, validationSuccess.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess copy(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess(token, challenges, nonce, partialToken, postAuthOperations);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component5() {
            return this.postAuthOperations;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.challenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationSuccess validationSuccess, com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, java.lang.String str, java.lang.String str2, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessToken = validationSuccess.token;
            }
            if ((i & 2) != 0) {
                list = validationSuccess.challenges;
            }
            java.util.List list3 = list;
            if ((i & 4) != 0) {
                str = validationSuccess.nonce;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = validationSuccess.partialToken;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                list2 = validationSuccess.postAuthOperations;
            }
            return validationSuccess.copy(userAccessToken, list3, str3, str4, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\u0010R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "", "errorMessageResId", "", "canRetry", "isRateLimited", "isInlineError", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "availableChallenges", "<init>", "(IZZZLjava/util/List;)V", "component1", "()I", "component2", "()Z", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(IZZZLjava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ValidationFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Z", "getCanRetry", "Ljava/util/List;", "getAvailableChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges;
        private final boolean canRetry;
        private final int errorMessageResId;
        private final boolean isInlineError;
        private final boolean isRateLimited;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationFailed(int i, boolean z, boolean z2, boolean z3, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupCreditCardEvent.ValidationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorMessageResId = i;
            this.canRetry = z;
            this.isRateLimited = z2;
            this.isInlineError = z3;
            this.availableChallenges = list;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final boolean isRateLimited() {
            return this.isRateLimited;
        }

        public final boolean isInlineError() {
            return this.isInlineError;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getAvailableChallenges() {
            return this.availableChallenges;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageResId;
            boolean z = this.canRetry;
            boolean z2 = this.isRateLimited;
            boolean z3 = this.isInlineError;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.availableChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(errorMessageResId=");
            sb.append(i);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(", isRateLimited=");
            sb.append(z2);
            sb.append(", isInlineError=");
            sb.append(z3);
            sb.append(", availableChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.errorMessageResId) * 31) + java.lang.Boolean.hashCode(this.canRetry)) * 31) + java.lang.Boolean.hashCode(this.isRateLimited)) * 31) + java.lang.Boolean.hashCode(this.isInlineError)) * 31) + this.availableChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed) other;
            return this.errorMessageResId == validationFailed.errorMessageResId && this.canRetry == validationFailed.canRetry && this.isRateLimited == validationFailed.isRateLimited && this.isInlineError == validationFailed.isInlineError && kotlin.jvm.internal.Intrinsics.areEqual(this.availableChallenges, validationFailed.availableChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed copy(int errorMessageResId, boolean canRetry, boolean isRateLimited, boolean isInlineError, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed(errorMessageResId, canRetry, isRateLimited, isInlineError, availableChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component5() {
            return this.availableChallenges;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsInlineError() {
            return this.isInlineError;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed validationFailed, int i, boolean z, boolean z2, boolean z3, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = validationFailed.errorMessageResId;
            }
            if ((i2 & 2) != 0) {
                z = validationFailed.canRetry;
            }
            boolean z4 = z;
            if ((i2 & 4) != 0) {
                z2 = validationFailed.isRateLimited;
            }
            boolean z5 = z2;
            if ((i2 & 8) != 0) {
                z3 = validationFailed.isInlineError;
            }
            boolean z6 = z3;
            if ((i2 & 16) != 0) {
                list = validationFailed.availableChallenges;
            }
            return validationFailed.copy(i, z4, z5, z6, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MultiChallengeStepUp;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MultiChallengeStepUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallenges", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MultiChallengeStepUp extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MultiChallengeStepUp(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            super("StepupCreditCardEvent.MultiChallengeStepUp", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            this.challenges = list;
            this.authIntent = authIntent;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getChallenges() {
            return this.challenges;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.challenges;
            com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.authIntent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiChallengeStepUp(challenges=");
            sb.append(list);
            sb.append(", authIntent=");
            sb.append(authIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.challenges.hashCode() * 31) + this.authIntent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp multiChallengeStepUp = (com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, multiChallengeStepUp.challenges) && this.authIntent == multiChallengeStepUp.authIntent;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp copy(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp(challenges, authIntent);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MultiChallengeStepUp multiChallengeStepUp, java.util.List list, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = multiChallengeStepUp.challenges;
            }
            if ((i & 2) != 0) {
                authIntent = multiChallengeStepUp.authIntent;
            }
            return multiChallengeStepUp.copy(list, authIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$TechnicalError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "", "errorMessageResId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$TechnicalError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TechnicalError extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        private final int errorMessageResId;

        public TechnicalError(int i) {
            super("StepupCreditCardEvent.TechnicalError", null);
            this.errorMessageResId = i;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TechnicalError(errorMessageResId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.errorMessageResId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError) && this.errorMessageResId == ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError) other).errorMessageResId;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError copy(int errorMessageResId) {
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError(errorMessageResId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.TechnicalError technicalError, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = technicalError.errorMessageResId;
            }
            return technicalError.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionsClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptionsClicked extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked();

        public final int hashCode() {
            return -485539093;
        }

        private MoreOptionsClicked() {
            super("StepupCreditCardEvent.MoreOptionsClicked", null);
        }

        public final java.lang.String toString() {
            return "MoreOptionsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ShowMoreOptions;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$ShowMoreOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowMoreOptions extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowMoreOptions(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list) {
            super("StepupCreditCardEvent.ShowMoreOptions", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowMoreOptions(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions) other).options);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ShowMoreOptions showMoreOptions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = showMoreOptions.options;
            }
            return showMoreOptions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "optionType", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)V", "component1", "()Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "copy", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "getOptionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptionSelected extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreOptionSelected(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
            super("StepupCreditCardEvent.MoreOptionSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
            this.optionType = optionType;
        }

        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getOptionType() {
            return this.optionType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = this.optionType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoreOptionSelected(optionType=");
            sb.append(optionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.optionType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) && this.optionType == ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected) other).optionType;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected copy(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected(optionType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getOptionType() {
            return this.optionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionSelected moreOptionSelected, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optionType = moreOptionSelected.optionType;
            }
            return moreOptionSelected.copy(optionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$MoreOptionsDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptionsDismissed extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed();

        public final int hashCode() {
            return -622569875;
        }

        private MoreOptionsDismissed() {
            super("StepupCreditCardEvent.MoreOptionsDismissed", null);
        }

        public final java.lang.String toString() {
            return "MoreOptionsDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.MoreOptionsDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$BackClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked();

        public final int hashCode() {
            return -1637788333;
        }

        private BackClicked() {
            super("StepupCreditCardEvent.BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$DismissError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.DismissError INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.DismissError();

        public final int hashCode() {
            return 1050117099;
        }

        private DismissError() {
            super("StepupCreditCardEvent.DismissError", null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelectorClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardSelectorClicked extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectorClicked INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectorClicked();

        public final int hashCode() {
            return 25302827;
        }

        private CardSelectorClicked() {
            super("StepupCreditCardEvent.CardSelectorClicked", null);
        }

        public final java.lang.String toString() {
            return "CardSelectorClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectorClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "card", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;)Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardSelected extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardSelected(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard) {
            super("StepupCreditCardEvent.CardSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
            this.card = creditCard;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getCard() {
            return this.card;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard = this.card;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardSelected(card=");
            sb.append(creditCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.card.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected) other).card);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard card) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected(card);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getCard() {
            return this.card;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected copy$default(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelected cardSelected, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditCard = cardSelected.card;
            }
            return cardSelected.copy(creditCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent$CardSelectionDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupcreditcard/ui/mvi/StepupCreditCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardSelectionDismissed extends com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectionDismissed INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectionDismissed();

        public final int hashCode() {
            return -996076102;
        }

        private CardSelectionDismissed() {
            super("StepupCreditCardEvent.CardSelectionDismissed", null);
        }

        public final java.lang.String toString() {
            return "CardSelectionDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.CardSelectionDismissed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ StepupCreditCardEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
