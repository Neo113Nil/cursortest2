package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToNextScreen", "NavigateToDifferentChallenge", "NavigateToStepupDestination", "ShowToast", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToDifferentChallenge;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToNextScreen;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToStepupDestination;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupOtpUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupOtpUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack();

        public final int hashCode() {
            return 263058332;
        }

        private NavigateBack() {
            super("StepupOtpUiEffect.NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToNextScreen;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToNextScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "getToken", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNextScreen extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToNextScreen(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
            super("StepupOtpUiEffect.NavigateToNextScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.token = userAccessToken;
            this.postAuthOperations = list;
        }

        public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
            return this.token;
        }

        public /* synthetic */ NavigateToNextScreen(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userAccessToken, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
            return this.postAuthOperations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNextScreen(token=");
            sb.append(userAccessToken);
            sb.append(", postAuthOperations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken = this.token;
            return ((userAccessToken == null ? 0 : userAccessToken.hashCode()) * 31) + this.postAuthOperations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen navigateToNextScreen = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, navigateToNextScreen.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, navigateToNextScreen.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen copy(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen(token, postAuthOperations);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
            return this.postAuthOperations;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken getToken() {
            return this.token;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToNextScreen navigateToNextScreen, com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessToken = navigateToNextScreen.token;
            }
            if ((i & 2) != 0) {
                list = navigateToNextScreen.postAuthOperations;
            }
            return navigateToNextScreen.copy(userAccessToken, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToDifferentChallenge;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToDifferentChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/util/List;", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDifferentChallenge extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToDifferentChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupOtpUiEffect.NavigateToDifferentChallenge", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.latestChallenges = list;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ NavigateToDifferentChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDifferentChallenge(challenge=");
            sb.append(challenge);
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
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge navigateToDifferentChallenge = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, navigateToDifferentChallenge.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, navigateToDifferentChallenge.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge(challenge, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.latestChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToDifferentChallenge navigateToDifferentChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = navigateToDifferentChallenge.challenge;
            }
            if ((i & 2) != 0) {
                list = navigateToDifferentChallenge.latestChallenges;
            }
            return navigateToDifferentChallenge.copy(challenge, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToStepupDestination;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$NavigateToStepupDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToStepupDestination extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToStepupDestination(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupOtpUiEffect.NavigateToStepupDestination", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenges = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getChallenges() {
            return this.challenges;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.challenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToStepupDestination(challenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination) other).challenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination copy(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination(challenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.NavigateToStepupDestination navigateToStepupDestination, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = navigateToStepupDestination.challenges;
            }
            return navigateToStepupDestination.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "isError", "()Z", "WithFormat", "Simple", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast$Simple;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast$WithFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ShowToast extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect {
        public static final int $stable = 0;

        public abstract boolean isError();

        private ShowToast(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast$WithFormat;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast;", "", "messageResId", "", "formatArg", "", "isError", "<init>", "(ILjava/lang/String;Z)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(ILjava/lang/String;Z)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast$WithFormat;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Ljava/lang/String;", "getFormatArg", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class WithFormat extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast {
            public static final int $stable = 0;
            private final java.lang.String formatArg;
            private final boolean isError;
            private final int messageResId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithFormat(int i, java.lang.String str, boolean z) {
                super("StepupOtpUiEffect.ShowToast.WithFormat", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.messageResId = i;
                this.formatArg = str;
                this.isError = z;
            }

            public /* synthetic */ WithFormat(int i, java.lang.String str, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? false : z);
            }

            public final int getMessageResId() {
                return this.messageResId;
            }

            public final java.lang.String getFormatArg() {
                return this.formatArg;
            }

            @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast
            public final boolean isError() {
                return this.isError;
            }

            public final java.lang.String toString() {
                int i = this.messageResId;
                java.lang.String str = this.formatArg;
                boolean z = this.isError;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("WithFormat(messageResId=");
                sb.append(i);
                sb.append(", formatArg=");
                sb.append(str);
                sb.append(", isError=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((java.lang.Integer.hashCode(this.messageResId) * 31) + this.formatArg.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isError);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat withFormat = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat) other;
                return this.messageResId == withFormat.messageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.formatArg, withFormat.formatArg) && this.isError == withFormat.isError;
            }

            public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat copy(int messageResId, java.lang.String formatArg, boolean isError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatArg, "");
                return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat(messageResId, formatArg, isError);
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsError() {
                return this.isError;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getFormatArg() {
                return this.formatArg;
            }

            /* renamed from: component1, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.WithFormat withFormat, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = withFormat.messageResId;
                }
                if ((i2 & 2) != 0) {
                    str = withFormat.formatArg;
                }
                if ((i2 & 4) != 0) {
                    z = withFormat.isError;
                }
                return withFormat.copy(i, str, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast$Simple;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast;", "", "messageResId", "", "isError", "<init>", "(IZ)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiEffect$ShowToast$Simple;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Simple extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast {
            public static final int $stable = 0;
            private final boolean isError;
            private final int messageResId;

            public Simple(int i, boolean z) {
                super("StepupOtpUiEffect.ShowToast.Simple", null);
                this.messageResId = i;
                this.isError = z;
            }

            public /* synthetic */ Simple(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? false : z);
            }

            public final int getMessageResId() {
                return this.messageResId;
            }

            @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast
            public final boolean isError() {
                return this.isError;
            }

            public final java.lang.String toString() {
                int i = this.messageResId;
                boolean z = this.isError;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Simple(messageResId=");
                sb.append(i);
                sb.append(", isError=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Integer.hashCode(this.messageResId) * 31) + java.lang.Boolean.hashCode(this.isError);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple simple = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple) other;
                return this.messageResId == simple.messageResId && this.isError == simple.isError;
            }

            public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple copy(int messageResId, boolean isError) {
                return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple(messageResId, isError);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsError() {
                return this.isError;
            }

            /* renamed from: component1, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiEffect.ShowToast.Simple simple, int i, boolean z, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = simple.messageResId;
                }
                if ((i2 & 2) != 0) {
                    z = simple.isError;
                }
                return simple.copy(i, z);
            }
        }

        public /* synthetic */ ShowToast(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public /* synthetic */ StepupOtpUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
