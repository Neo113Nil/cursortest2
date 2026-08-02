package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToNextChallenge", "ChallengeRequired", "HideKeyboard", "ShowKeyboard", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$HideKeyboard;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$NavigateToNextChallenge;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$ShowKeyboard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpVerificationUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OtpVerificationUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateBack();

        public final int hashCode() {
            return 640279752;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$NavigateToNextChallenge;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$NavigateToNextChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "getToken", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNextChallenge extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final com.paypal.oslo.feature.identity.foundation.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToNextChallenge(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
            super("NavigateToNextChallenge", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.token = token;
            this.postAuthOperations = list;
        }

        public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
            return this.token;
        }

        public /* synthetic */ NavigateToNextChallenge(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(token, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
            return this.postAuthOperations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.foundation.model.Token token = this.token;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNextChallenge(token=");
            sb.append(token);
            sb.append(", postAuthOperations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.token.hashCode() * 31) + this.postAuthOperations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge navigateToNextChallenge = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, navigateToNextChallenge.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, navigateToNextChallenge.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge copy(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge(token, postAuthOperations);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
            return this.postAuthOperations;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
            return this.token;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge navigateToNextChallenge, com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                token = navigateToNextChallenge.token;
            }
            if ((i & 2) != 0) {
                list = navigateToNextChallenge.postAuthOperations;
            }
            return navigateToNextChallenge.copy(token, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeRequired(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            super("ChallengeRequired", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            this.challengeResult = challengeResult;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challengeResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(challengeResult=");
            sb.append(challengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired) other).challengeResult);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired(challengeResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeResult = challengeRequired.challengeResult;
            }
            return challengeRequired.copy(challengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$HideKeyboard;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideKeyboard extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard();

        public final int hashCode() {
            return -1605084647;
        }

        private HideKeyboard() {
            super("HideKeyboard", null);
        }

        public final java.lang.String toString() {
            return "HideKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect$ShowKeyboard;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowKeyboard extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ShowKeyboard INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ShowKeyboard();

        public final int hashCode() {
            return 1275686100;
        }

        private ShowKeyboard() {
            super("ShowKeyboard", null);
        }

        public final java.lang.String toString() {
            return "ShowKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ShowKeyboard)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OtpVerificationUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
