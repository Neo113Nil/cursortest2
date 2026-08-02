package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\"#$%&'B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0001\u0006()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "answers", "Ljava/util/Map;", "getAnswers", "()Ljava/util/Map;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "Ljava/util/List;", "getLatestChallenges", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "bottomSheetState", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "getBottomSheetState", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "", "getShowMoreOptions", "()Z", "showMoreOptions", "Initial", "Loading", "ValidationSuccess", "Error", "TechnicalError", "MaxAttemptsReached", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Error;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$TechnicalError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$ValidationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupSecurityQuestionState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> answers;
    private final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState;
    private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge();

    private StepupSecurityQuestionState(java.lang.String str) {
        this.name = str;
        this.answers = kotlin.collections.MapsKt.emptyMap();
        this.latestChallenges = kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public java.util.Map<java.lang.String, java.lang.String> getAnswers() {
        return this.answers;
    }

    public java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
        return this.latestChallenges;
    }

    public com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final boolean getShowMoreOptions() {
        return getLatestChallenges().size() > 1;
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "", "answers", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", "Ljava/util/Map;", "getAnswers", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> answers;
        private final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState) {
            super("StepupSecurityQuestionState.Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = securityQuestionChallenge;
            this.answers = map;
            this.latestChallenges = list;
            this.bottomSheetState = securityQuestionBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(securityQuestionChallenge, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : securityQuestionBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.Map<java.lang.String, java.lang.String> getAnswers() {
            return this.answers;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge = this.challenge;
            java.util.Map<java.lang.String, java.lang.String> map = this.answers;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(challenge=");
            sb.append(securityQuestionChallenge);
            sb.append(", answers=");
            sb.append(map);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(securityQuestionBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.answers.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (securityQuestionBottomSheetState == null ? 0 : securityQuestionBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, initial.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.answers, initial.answers) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, initial.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, initial.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge, java.util.Map<java.lang.String, java.lang.String> answers, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(answers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial(challenge, answers, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.answers;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial copy$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Initial initial, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                securityQuestionChallenge = initial.challenge;
            }
            if ((i & 2) != 0) {
                map = initial.answers;
            }
            if ((i & 4) != 0) {
                list = initial.latestChallenges;
            }
            if ((i & 8) != 0) {
                securityQuestionBottomSheetState = initial.bottomSheetState;
            }
            return initial.copy(securityQuestionChallenge, map, list, securityQuestionBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "", "answers", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", "Ljava/util/Map;", "getAnswers", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> answers;
        private final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState) {
            super("StepupSecurityQuestionState.Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = securityQuestionChallenge;
            this.answers = map;
            this.latestChallenges = list;
            this.bottomSheetState = securityQuestionBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.Map<java.lang.String, java.lang.String> getAnswers() {
            return this.answers;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(securityQuestionChallenge, map, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : securityQuestionBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge = this.challenge;
            java.util.Map<java.lang.String, java.lang.String> map = this.answers;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(challenge=");
            sb.append(securityQuestionChallenge);
            sb.append(", answers=");
            sb.append(map);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(securityQuestionBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.answers.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (securityQuestionBottomSheetState == null ? 0 : securityQuestionBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, loading.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.answers, loading.answers) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, loading.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, loading.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge, java.util.Map<java.lang.String, java.lang.String> answers, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(answers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading(challenge, answers, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.answers;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading copy$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Loading loading, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                securityQuestionChallenge = loading.challenge;
            }
            if ((i & 2) != 0) {
                map = loading.answers;
            }
            if ((i & 4) != 0) {
                list = loading.latestChallenges;
            }
            if ((i & 8) != 0) {
                securityQuestionBottomSheetState = loading.bottomSheetState;
            }
            return loading.copy(securityQuestionChallenge, map, list, securityQuestionBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$ValidationSuccess;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "", "nonce", "partialToken", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$ValidationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", "Ljava/util/List;", "getLatestChallenges", "Ljava/lang/String;", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationSuccess extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationSuccess(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.lang.String str, java.lang.String str2) {
            super("StepupSecurityQuestionState.ValidationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = securityQuestionChallenge;
            this.latestChallenges = list;
            this.nonce = str;
            this.partialToken = str2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ ValidationSuccess(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(securityQuestionChallenge, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
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
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge = this.challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.String str = this.nonce;
            java.lang.String str2 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationSuccess(challenge=");
            sb.append(securityQuestionChallenge);
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
            int hashCode2 = this.latestChallenges.hashCode();
            java.lang.String str = this.nonce;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, validationSuccess.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, validationSuccess.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, validationSuccess.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, validationSuccess.partialToken);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess(challenge, latestChallenges, nonce, partialToken);
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
            return this.latestChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess copy$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.ValidationSuccess validationSuccess, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                securityQuestionChallenge = validationSuccess.challenge;
            }
            if ((i & 2) != 0) {
                list = validationSuccess.latestChallenges;
            }
            if ((i & 4) != 0) {
                str = validationSuccess.nonce;
            }
            if ((i & 8) != 0) {
                str2 = validationSuccess.partialToken;
            }
            return validationSuccess.copy(securityQuestionChallenge, list, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Error;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "errorMessageResId", "", "", "answers", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;ILjava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "component2", "()I", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;ILjava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Ljava/util/Map;", "getAnswers", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> answers;
        private final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge;
        private final int errorMessageResId;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Error(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, int i, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState) {
            super("StepupSecurityQuestionState.Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = securityQuestionChallenge;
            this.errorMessageResId = i;
            this.answers = map;
            this.latestChallenges = list;
            this.bottomSheetState = securityQuestionBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, int i, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(securityQuestionChallenge, i, (i2 & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? null : securityQuestionBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.Map<java.lang.String, java.lang.String> getAnswers() {
            return this.answers;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge = this.challenge;
            int i = this.errorMessageResId;
            java.util.Map<java.lang.String, java.lang.String> map = this.answers;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(challenge=");
            sb.append(securityQuestionChallenge);
            sb.append(", errorMessageResId=");
            sb.append(i);
            sb.append(", answers=");
            sb.append(map);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(securityQuestionBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.errorMessageResId);
            int hashCode3 = this.answers.hashCode();
            int hashCode4 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (securityQuestionBottomSheetState == null ? 0 : securityQuestionBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error error = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, error.challenge) && this.errorMessageResId == error.errorMessageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.answers, error.answers) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, error.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, error.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge, int errorMessageResId, java.util.Map<java.lang.String, java.lang.String> answers, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(answers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error(challenge, errorMessageResId, answers, latestChallenges, bottomSheetState);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component4() {
            return this.latestChallenges;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component3() {
            return this.answers;
        }

        /* renamed from: component2, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error copy$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.Error error, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, int i, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                securityQuestionChallenge = error.challenge;
            }
            if ((i2 & 2) != 0) {
                i = error.errorMessageResId;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                map = error.answers;
            }
            java.util.Map map2 = map;
            if ((i2 & 8) != 0) {
                list = error.latestChallenges;
            }
            java.util.List list2 = list;
            if ((i2 & 16) != 0) {
                securityQuestionBottomSheetState = error.bottomSheetState;
            }
            return error.copy(securityQuestionChallenge, i3, map2, list2, securityQuestionBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$TechnicalError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "errorMessageResId", "", "", "answers", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;ILjava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "component2", "()I", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;ILjava/util/Map;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$TechnicalError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Ljava/util/Map;", "getAnswers", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/SecurityQuestionBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TechnicalError extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> answers;
        private final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge;
        private final int errorMessageResId;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TechnicalError(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, int i, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState) {
            super("StepupSecurityQuestionState.TechnicalError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = securityQuestionChallenge;
            this.errorMessageResId = i;
            this.answers = map;
            this.latestChallenges = list;
            this.bottomSheetState = securityQuestionBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public /* synthetic */ TechnicalError(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, int i, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(securityQuestionChallenge, i, (i2 & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? null : securityQuestionBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.Map<java.lang.String, java.lang.String> getAnswers() {
            return this.answers;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge = this.challenge;
            int i = this.errorMessageResId;
            java.util.Map<java.lang.String, java.lang.String> map = this.answers;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TechnicalError(challenge=");
            sb.append(securityQuestionChallenge);
            sb.append(", errorMessageResId=");
            sb.append(i);
            sb.append(", answers=");
            sb.append(map);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(securityQuestionBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.errorMessageResId);
            int hashCode3 = this.answers.hashCode();
            int hashCode4 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState = this.bottomSheetState;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (securityQuestionBottomSheetState == null ? 0 : securityQuestionBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError technicalError = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, technicalError.challenge) && this.errorMessageResId == technicalError.errorMessageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.answers, technicalError.answers) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, technicalError.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, technicalError.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge, int errorMessageResId, java.util.Map<java.lang.String, java.lang.String> answers, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(answers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError(challenge, errorMessageResId, answers, latestChallenges, bottomSheetState);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component4() {
            return this.latestChallenges;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component3() {
            return this.answers;
        }

        /* renamed from: component2, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError copy$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.TechnicalError technicalError, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, int i, java.util.Map map, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.SecurityQuestionBottomSheetState securityQuestionBottomSheetState, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                securityQuestionChallenge = technicalError.challenge;
            }
            if ((i2 & 2) != 0) {
                i = technicalError.errorMessageResId;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                map = technicalError.answers;
            }
            java.util.Map map2 = map;
            if ((i2 & 8) != 0) {
                list = technicalError.latestChallenges;
            }
            java.util.List list2 = list;
            if ((i2 & 16) != 0) {
                securityQuestionBottomSheetState = technicalError.bottomSheetState;
            }
            return technicalError.copy(securityQuestionChallenge, i3, map2, list2, securityQuestionBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "availableChallenges", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupsecurityquestion/ui/mvi/StepupSecurityQuestionState$MaxAttemptsReached;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SecurityQuestionChallenge;", "getChallenge", "Ljava/util/List;", "getAvailableChallenges", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxAttemptsReached extends com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MaxAttemptsReached(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2) {
            super("StepupSecurityQuestionState.MaxAttemptsReached", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.challenge = securityQuestionChallenge;
            this.availableChallenges = list;
            this.latestChallenges = list2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ MaxAttemptsReached(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(securityQuestionChallenge, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getAvailableChallenges() {
            return this.availableChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge = this.challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.availableChallenges;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2 = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxAttemptsReached(challenge=");
            sb.append(securityQuestionChallenge);
            sb.append(", availableChallenges=");
            sb.append(list);
            sb.append(", latestChallenges=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.challenge.hashCode() * 31) + this.availableChallenges.hashCode()) * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, maxAttemptsReached.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableChallenges, maxAttemptsReached.availableChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, maxAttemptsReached.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableChallenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached(challenge, availableChallenges, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.availableChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached copy$default(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionState.MaxAttemptsReached maxAttemptsReached, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                securityQuestionChallenge = maxAttemptsReached.challenge;
            }
            if ((i & 2) != 0) {
                list = maxAttemptsReached.availableChallenges;
            }
            if ((i & 4) != 0) {
                list2 = maxAttemptsReached.latestChallenges;
            }
            return maxAttemptsReached.copy(securityQuestionChallenge, list, list2);
        }
    }

    public /* synthetic */ StepupSecurityQuestionState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
