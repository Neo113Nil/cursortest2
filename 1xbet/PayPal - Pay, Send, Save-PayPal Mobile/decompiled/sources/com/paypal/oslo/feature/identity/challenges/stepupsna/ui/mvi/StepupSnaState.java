package com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getChallenge", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Initial", "VerifyingNetwork", "ValidatingWithBackend", "Success", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$Success;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$ValidatingWithBackend;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$VerifyingNetwork;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupSnaState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge();

    private StepupSnaState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallenge, "");
            this.challenge = silentAuthChallenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = this.challenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(challenge=");
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, ((com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial) other).challenge);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Initial initial, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthChallenge = initial.challenge;
            }
            return initial.copy(silentAuthChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$VerifyingNetwork;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "maskedNumber", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$VerifyingNetwork;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getChallenge", "Ljava/lang/String;", "getMaskedNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyingNetwork extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge;
        private final java.lang.String maskedNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyingNetwork(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.lang.String str) {
            super("VerifyingNetwork", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.challenge = silentAuthChallenge;
            this.maskedNumber = str;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = this.challenge;
            java.lang.String str = this.maskedNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyingNetwork(challenge=");
            sb.append(silentAuthChallenge);
            sb.append(", maskedNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.challenge.hashCode() * 31) + this.maskedNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork verifyingNetwork = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, verifyingNetwork.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, verifyingNetwork.maskedNumber);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge, java.lang.String maskedNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork(challenge, maskedNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.VerifyingNetwork verifyingNetwork, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthChallenge = verifyingNetwork.challenge;
            }
            if ((i & 2) != 0) {
                str = verifyingNetwork.maskedNumber;
            }
            return verifyingNetwork.copy(silentAuthChallenge, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$ValidatingWithBackend;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "maskedNumber", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$ValidatingWithBackend;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getChallenge", "Ljava/lang/String;", "getMaskedNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidatingWithBackend extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge;
        private final java.lang.String maskedNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidatingWithBackend(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.lang.String str) {
            super("ValidatingWithBackend", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.challenge = silentAuthChallenge;
            this.maskedNumber = str;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = this.challenge;
            java.lang.String str = this.maskedNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidatingWithBackend(challenge=");
            sb.append(silentAuthChallenge);
            sb.append(", maskedNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.challenge.hashCode() * 31) + this.maskedNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend validatingWithBackend = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, validatingWithBackend.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedNumber, validatingWithBackend.maskedNumber);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge, java.lang.String maskedNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedNumber, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend(challenge, maskedNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedNumber() {
            return this.maskedNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.ValidatingWithBackend validatingWithBackend, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthChallenge = validatingWithBackend.challenge;
            }
            if ((i & 2) != 0) {
                str = validatingWithBackend.maskedNumber;
            }
            return validatingWithBackend.copy(silentAuthChallenge, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$Success;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "latestChallenges", "", "nonce", "partialToken", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/ui/mvi/StepupSnaState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "getChallenge", "Ljava/util/List;", "getLatestChallenges", "Ljava/lang/String;", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.lang.String str, java.lang.String str2) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = silentAuthChallenge;
            this.latestChallenges = list;
            this.nonce = str;
            this.partialToken = str2;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(silentAuthChallenge, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

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
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = this.challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.String str = this.nonce;
            java.lang.String str2 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(challenge=");
            sb.append(silentAuthChallenge);
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
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success success = (com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, success.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, success.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, success.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, success.partialToken);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success(challenge, latestChallenges, nonce, partialToken);
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
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaState.Success success, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthChallenge = success.challenge;
            }
            if ((i & 2) != 0) {
                list = success.latestChallenges;
            }
            if ((i & 4) != 0) {
                str = success.nonce;
            }
            if ((i & 8) != 0) {
                str2 = success.partialToken;
            }
            return success.copy(silentAuthChallenge, list, str, str2);
        }
    }

    public /* synthetic */ StepupSnaState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
