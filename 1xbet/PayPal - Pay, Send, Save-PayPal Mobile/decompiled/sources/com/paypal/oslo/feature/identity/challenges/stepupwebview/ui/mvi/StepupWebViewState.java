package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "getChallenge", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Uninitialized", "Initial", "Loading", "Success", "Failure", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Failure;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Success;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Uninitialized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupWebViewState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge();

    private StepupWebViewState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Uninitialized;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "getChallenge", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Uninitialized extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized();
        private static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge = null;

        public final int hashCode() {
            return 1091605817;
        }

        private Uninitialized() {
            super("Uninitialized", null);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return challenge;
        }

        public final java.lang.String toString() {
            return "Uninitialized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Uninitialized)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChallenge, "");
            this.challenge = webViewChallenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(challenge=");
            sb.append(webViewChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial copy$default(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Initial initial, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webViewChallenge = initial.challenge;
            }
            return initial.copy(webViewChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "isInitialized", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;Z)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;Z)Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "getChallenge", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge;
        private final boolean isInitialized;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, boolean z) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChallenge, "");
            this.challenge = webViewChallenge;
            this.isInitialized = z;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(webViewChallenge, (i & 2) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public final boolean isInitialized() {
            return this.isInitialized;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge = this.challenge;
            boolean z = this.isInitialized;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(challenge=");
            sb.append(webViewChallenge);
            sb.append(", isInitialized=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.challenge.hashCode() * 31) + java.lang.Boolean.hashCode(this.isInitialized);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, loading.challenge) && this.isInitialized == loading.isInitialized;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge, boolean isInitialized) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading(challenge, isInitialized);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInitialized() {
            return this.isInitialized;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading copy$default(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Loading loading, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webViewChallenge = loading.challenge;
            }
            if ((i & 2) != 0) {
                z = loading.isInitialized;
            }
            return loading.copy(webViewChallenge, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Success;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChallenge, "");
            this.challenge = webViewChallenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(challenge=");
            sb.append(webViewChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success copy$default(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Success success, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webViewChallenge = success.challenge;
            }
            return success.copy(webViewChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Failure;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;)Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewState$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/WebViewChallenge;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge) {
            super("Failure", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewChallenge, "");
            this.challenge = webViewChallenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(challenge=");
            sb.append(webViewChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure copy$default(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewState.Failure failure, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webViewChallenge = failure.challenge;
            }
            return failure.copy(webViewChallenge);
        }
    }

    public /* synthetic */ StepupWebViewState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
