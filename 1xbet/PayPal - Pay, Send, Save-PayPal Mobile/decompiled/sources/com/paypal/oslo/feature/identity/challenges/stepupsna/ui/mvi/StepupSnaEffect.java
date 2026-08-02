package com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToHome", "NavigateBack", "NavigateToStepupDestination", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateToHome;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateToStepupDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupSnaEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupSnaEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateToHome;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateToHome;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToHome extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToHome(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult) {
            super("NavigateToHome", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeResult, "");
            this.result = validateChallengeResult;
        }

        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToHome(result=");
            sb.append(validateChallengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome) other).result);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome copy(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToHome navigateToHome, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateChallengeResult = navigateToHome.result;
            }
            return navigateToHome.copy(validateChallengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/NavigateBackReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/NavigateBackReason;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/NavigateBackReason;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/NavigateBackReason;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateBack;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/NavigateBackReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBack(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason navigateBackReason) {
            super("NavigateBack", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigateBackReason, "");
            this.reason = navigateBackReason;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason navigateBackReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBack(reason=");
            sb.append(navigateBackReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack) && this.reason == ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack) other).reason;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack copy(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateBack navigateBack, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.NavigateBackReason navigateBackReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navigateBackReason = navigateBack.reason;
            }
            return navigateBack.copy(navigateBackReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateToStepupDestination;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEffect$NavigateToStepupDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallenges", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToStepupDestination extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToStepupDestination(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            super("NavigateToStepupDestination", null);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToStepupDestination(challenges=");
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
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination navigateToStepupDestination = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, navigateToStepupDestination.challenges) && this.authIntent == navigateToStepupDestination.authIntent;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination copy(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination(challenges, authIntent);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEffect.NavigateToStepupDestination navigateToStepupDestination, java.util.List list, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = navigateToStepupDestination.challenges;
            }
            if ((i & 2) != 0) {
                authIntent = navigateToStepupDestination.authIntent;
            }
            return navigateToStepupDestination.copy(list, authIntent);
        }
    }

    public /* synthetic */ StepupSnaEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
