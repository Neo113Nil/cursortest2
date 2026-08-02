package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToChallenge", "AutoRedirect", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect$AutoRedirect;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect$NavigateToChallenge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class StepupUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect$NavigateToChallenge;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect$NavigateToChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToChallenge extends com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            super("NavigateToChallenge", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            this.challengeData = challengeData;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChallenge(challengeData=");
            sb.append(challengeData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, ((com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge) other).challengeData);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge(challengeData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.NavigateToChallenge navigateToChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeData = navigateToChallenge.challengeData;
            }
            return navigateToChallenge.copy(challengeData);
        }
    }

    private StepupUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect$AutoRedirect;", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiEffect$AutoRedirect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoRedirect extends com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoRedirect(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            super("AutoRedirect", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            this.challengeData = challengeData;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoRedirect(challengeData=");
            sb.append(challengeData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, ((com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect) other).challengeData);
        }

        public final com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            return new com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect(challengeData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect copy$default(com.paypal.oslo.feature.identity.stepup.ui.StepupUiEffect.AutoRedirect autoRedirect, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeData = autoRedirect.challengeData;
            }
            return autoRedirect.copy(challengeData);
        }
    }

    public /* synthetic */ StepupUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
