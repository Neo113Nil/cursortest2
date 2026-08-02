package com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "VerificationStarted", "NetworkCallSucceeded", "NetworkCallFailed", "ValidationSucceeded", "ValidationFailed", "MultiChallengeStepUp", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$MultiChallengeStepUp;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$NetworkCallFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$NetworkCallSucceeded;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$ValidationSucceeded;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$VerificationStarted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupSnaEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupSnaEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$VerificationStarted;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$VerificationStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationStarted extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationStarted(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge) {
            super("VerificationStarted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallenge, "");
            this.challenge = silentAuthChallenge;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationStarted(challenge=");
            sb.append(silentAuthChallenge);
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.VerificationStarted verificationStarted, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthChallenge = verificationStarted.challenge;
            }
            return verificationStarted.copy(silentAuthChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$NetworkCallSucceeded;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkCallSucceeded extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallSucceeded INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallSucceeded();

        public final int hashCode() {
            return -1292358706;
        }

        private NetworkCallSucceeded() {
            super("NetworkCallSucceeded", null);
        }

        public final java.lang.String toString() {
            return "NetworkCallSucceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallSucceeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$NetworkCallFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$NetworkCallFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkCallFailed extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkCallFailed(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError) {
            super("NetworkCallFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snaError, "");
            this.error = snaError;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkCallFailed(error=");
            sb.append(snaError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed copy(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.NetworkCallFailed networkCallFailed, com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError snaError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snaError = networkCallFailed.error;
            }
            return networkCallFailed.copy(snaError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$ValidationSucceeded;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$ValidationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationSucceeded extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationSucceeded(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult) {
            super("ValidationSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeResult, "");
            this.result = validateChallengeResult;
        }

        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationSucceeded(result=");
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded) other).result);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded copy(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationSucceeded validationSucceeded, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateChallengeResult = validationSucceeded.result;
            }
            return validationSucceeded.copy(validateChallengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "copy", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$ValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationFailed(com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError) {
            super("ValidationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeError, "");
            this.error = challengeError;
        }

        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(error=");
            sb.append(challengeError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed copy(com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.ValidationFailed validationFailed, com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError challengeError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeError = validationFailed.error;
            }
            return validationFailed.copy(challengeError);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$MultiChallengeStepUp;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaEvent$MultiChallengeStepUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallenges", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MultiChallengeStepUp extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MultiChallengeStepUp(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            super("MultiChallengeStepUp", null);
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
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp multiChallengeStepUp = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, multiChallengeStepUp.challenges) && this.authIntent == multiChallengeStepUp.authIntent;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp copy(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp(challenges, authIntent);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaEvent.MultiChallengeStepUp multiChallengeStepUp, java.util.List list, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = multiChallengeStepUp.challenges;
            }
            if ((i & 2) != 0) {
                authIntent = multiChallengeStepUp.authIntent;
            }
            return multiChallengeStepUp.copy(list, authIntent);
        }
    }

    public /* synthetic */ StepupSnaEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
