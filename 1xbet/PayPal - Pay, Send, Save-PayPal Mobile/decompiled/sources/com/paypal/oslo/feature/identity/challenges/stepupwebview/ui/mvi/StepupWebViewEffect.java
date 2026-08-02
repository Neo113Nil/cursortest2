package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "ChallengeCompleted", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect$ChallengeCompleted;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupWebViewEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupWebViewEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.NavigateBack();

        public final int hashCode() {
            return -1916141392;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect$ChallengeCompleted;", "Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect;", "", "success", "", "failureReason", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEffect$ChallengeCompleted;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Ljava/lang/String;", "getFailureReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeCompleted extends com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect {
        public static final int $stable = 0;
        private final java.lang.String failureReason;
        private final boolean success;

        public ChallengeCompleted(boolean z, java.lang.String str) {
            super("ChallengeCompleted", null);
            this.success = z;
            this.failureReason = str;
        }

        public /* synthetic */ ChallengeCompleted(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String getFailureReason() {
            return this.failureReason;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.String str = this.failureReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeCompleted(success=");
            sb.append(z);
            sb.append(", failureReason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            java.lang.String str = this.failureReason;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted challengeCompleted = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted) other;
            return this.success == challengeCompleted.success && kotlin.jvm.internal.Intrinsics.areEqual(this.failureReason, challengeCompleted.failureReason);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted copy(boolean success, java.lang.String failureReason) {
            return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted(success, failureReason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted copy$default(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEffect.ChallengeCompleted challengeCompleted, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = challengeCompleted.success;
            }
            if ((i & 2) != 0) {
                str = challengeCompleted.failureReason;
            }
            return challengeCompleted.copy(z, str);
        }
    }

    public /* synthetic */ StepupWebViewEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
