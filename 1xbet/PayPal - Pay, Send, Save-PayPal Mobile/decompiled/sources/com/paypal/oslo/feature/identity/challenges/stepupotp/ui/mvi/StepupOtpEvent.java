package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ChallengeInitialized", "CodeChanged", "ResendCode", "NotifySent", "NotifyFailed", "ValidationSuccess", "ValidationFailed", "MoreOptionsClicked", "ShowMoreOptions", "MoreOptionSelected", "MoreOptionsDismissed", "ShowContactSelection", "ContactSelected", "EmailPhoneSelectionDismissed", "EmailPhoneSelectionClosed", "NextStepUpChallenge", "MultiChallengeStepUp", "BackClicked", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$BackClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ChallengeInitialized;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$CodeChanged;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ContactSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$EmailPhoneSelectionClosed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$EmailPhoneSelectionDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionsClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionsDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MultiChallengeStepUp;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NextStepUpChallenge;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NotifyFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NotifySent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ResendCode;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ShowContactSelection;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ShowMoreOptions;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ValidationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupOtpEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private StepupOtpEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ChallengeInitialized;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "updatedChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ChallengeInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/util/List;", "getUpdatedChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeInitialized extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> updatedChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChallengeInitialized(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupOtpEvent.ChallengeInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            this.challenge = challenge;
            this.updatedChallenges = list;
        }

        public /* synthetic */ ChallengeInitialized(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, (i & 2) != 0 ? null : list);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getUpdatedChallenges() {
            return this.updatedChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.updatedChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeInitialized(challenge=");
            sb.append(challenge);
            sb.append(", updatedChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.updatedChallenges;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized challengeInitialized = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, challengeInitialized.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedChallenges, challengeInitialized.updatedChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> updatedChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized(challenge, updatedChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.updatedChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ChallengeInitialized challengeInitialized, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = challengeInitialized.challenge;
            }
            if ((i & 2) != 0) {
                list = challengeInitialized.updatedChallenges;
            }
            return challengeInitialized.copy(challenge, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$CodeChanged;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "code", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$CodeChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CodeChanged extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        private final java.lang.String code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CodeChanged(java.lang.String str) {
            super("StepupOtpEvent.CodeChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.code = str;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeChanged(code=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged) other).code);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged copy(java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged(code);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.CodeChanged codeChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = codeChanged.code;
            }
            return codeChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ResendCode;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResendCode extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode();

        public final int hashCode() {
            return -1943484319;
        }

        private ResendCode() {
            super("StepupOtpEvent.ResendCode", null);
        }

        public final java.lang.String toString() {
            return "ResendCode";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ResendCode)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NotifySent;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "deliveryTarget", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "", "showToast", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NotifySent;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeliveryTarget", "Ljava/util/List;", "getChallenges", "Z", "getShowToast"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotifySent extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;
        private final java.lang.String deliveryTarget;
        private final boolean showToast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NotifySent(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, boolean z) {
            super("StepupOtpEvent.NotifySent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.deliveryTarget = str;
            this.challenges = list;
            this.showToast = z;
        }

        public final java.lang.String getDeliveryTarget() {
            return this.deliveryTarget;
        }

        public /* synthetic */ NotifySent(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? true : z);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getChallenges() {
            return this.challenges;
        }

        public final boolean getShowToast() {
            return this.showToast;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deliveryTarget;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.challenges;
            boolean z = this.showToast;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifySent(deliveryTarget=");
            sb.append(str);
            sb.append(", challenges=");
            sb.append(list);
            sb.append(", showToast=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.deliveryTarget.hashCode() * 31) + this.challenges.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showToast);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent notifySent = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTarget, notifySent.deliveryTarget) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, notifySent.challenges) && this.showToast == notifySent.showToast;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent copy(java.lang.String deliveryTarget, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges, boolean showToast) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deliveryTarget, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent(deliveryTarget, challenges, showToast);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowToast() {
            return this.showToast;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.challenges;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeliveryTarget() {
            return this.deliveryTarget;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifySent notifySent, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notifySent.deliveryTarget;
            }
            if ((i & 2) != 0) {
                list = notifySent.challenges;
            }
            if ((i & 4) != 0) {
                z = notifySent.showToast;
            }
            return notifySent.copy(str, list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NotifyFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "errorMessageResId", "", "isRateLimited", "<init>", "(IZ)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NotifyFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotifyFailed extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        private final int errorMessageResId;
        private final boolean isRateLimited;

        public NotifyFailed(int i, boolean z) {
            super("StepupOtpEvent.NotifyFailed", null);
            this.errorMessageResId = i;
            this.isRateLimited = z;
        }

        public /* synthetic */ NotifyFailed(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z);
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final boolean isRateLimited() {
            return this.isRateLimited;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageResId;
            boolean z = this.isRateLimited;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyFailed(errorMessageResId=");
            sb.append(i);
            sb.append(", isRateLimited=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.errorMessageResId) * 31) + java.lang.Boolean.hashCode(this.isRateLimited);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed notifyFailed = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed) other;
            return this.errorMessageResId == notifyFailed.errorMessageResId && this.isRateLimited == notifyFailed.isRateLimited;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed copy(int errorMessageResId, boolean isRateLimited) {
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed(errorMessageResId, isRateLimited);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NotifyFailed notifyFailed, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = notifyFailed.errorMessageResId;
            }
            if ((i2 & 2) != 0) {
                z = notifyFailed.isRateLimited;
            }
            return notifyFailed.copy(i, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011JT\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ValidationSuccess;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "", "nonce", "partialToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ValidationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "getToken", "Ljava/util/List;", "getChallenges", "Ljava/lang/String;", "getNonce", "getPartialToken", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationSuccess extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationSuccess(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list2) {
            super("StepupOtpEvent.ValidationSuccess", null);
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
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess validationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, validationSuccess.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, validationSuccess.challenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, validationSuccess.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, validationSuccess.partialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, validationSuccess.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess copy(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken token, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges, java.lang.String nonce, java.lang.String partialToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess(token, challenges, nonce, partialToken, postAuthOperations);
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

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationSuccess validationSuccess, com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, java.lang.String str, java.lang.String str2, java.util.List list2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\u0010R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "errorMessageResId", "", "isInvalidCode", "isRateLimited", "isExpired", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "<init>", "(IZZZLjava/util/List;)V", "component1", "()I", "component2", "()Z", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(IZZZLjava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ValidationFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Z", "Ljava/util/List;", "getChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;
        private final int errorMessageResId;
        private final boolean isExpired;
        private final boolean isInvalidCode;
        private final boolean isRateLimited;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationFailed(int i, boolean z, boolean z2, boolean z3, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupOtpEvent.ValidationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorMessageResId = i;
            this.isInvalidCode = z;
            this.isRateLimited = z2;
            this.isExpired = z3;
            this.challenges = list;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final boolean isInvalidCode() {
            return this.isInvalidCode;
        }

        public final boolean isRateLimited() {
            return this.isRateLimited;
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public /* synthetic */ ValidationFailed(int i, boolean z, boolean z2, boolean z3, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getChallenges() {
            return this.challenges;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageResId;
            boolean z = this.isInvalidCode;
            boolean z2 = this.isRateLimited;
            boolean z3 = this.isExpired;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.challenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(errorMessageResId=");
            sb.append(i);
            sb.append(", isInvalidCode=");
            sb.append(z);
            sb.append(", isRateLimited=");
            sb.append(z2);
            sb.append(", isExpired=");
            sb.append(z3);
            sb.append(", challenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.errorMessageResId) * 31) + java.lang.Boolean.hashCode(this.isInvalidCode)) * 31) + java.lang.Boolean.hashCode(this.isRateLimited)) * 31) + java.lang.Boolean.hashCode(this.isExpired)) * 31) + this.challenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed validationFailed = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed) other;
            return this.errorMessageResId == validationFailed.errorMessageResId && this.isInvalidCode == validationFailed.isInvalidCode && this.isRateLimited == validationFailed.isRateLimited && this.isExpired == validationFailed.isExpired && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, validationFailed.challenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed copy(int errorMessageResId, boolean isInvalidCode, boolean isRateLimited, boolean isExpired, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(errorMessageResId, isInvalidCode, isRateLimited, isExpired, challenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component5() {
            return this.challenges;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInvalidCode() {
            return this.isInvalidCode;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed validationFailed, int i, boolean z, boolean z2, boolean z3, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = validationFailed.errorMessageResId;
            }
            if ((i2 & 2) != 0) {
                z = validationFailed.isInvalidCode;
            }
            boolean z4 = z;
            if ((i2 & 4) != 0) {
                z2 = validationFailed.isRateLimited;
            }
            boolean z5 = z2;
            if ((i2 & 8) != 0) {
                z3 = validationFailed.isExpired;
            }
            boolean z6 = z3;
            if ((i2 & 16) != 0) {
                list = validationFailed.challenges;
            }
            return validationFailed.copy(i, z4, z5, z6, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionsClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptionsClicked extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked();

        public final int hashCode() {
            return -1121081097;
        }

        private MoreOptionsClicked() {
            super("StepupOtpEvent.MoreOptionsClicked", null);
        }

        public final java.lang.String toString() {
            return "MoreOptionsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ShowMoreOptions;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ShowMoreOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowMoreOptions extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowMoreOptions(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list) {
            super("StepupOtpEvent.ShowMoreOptions", null);
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions) other).options);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowMoreOptions showMoreOptions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = showMoreOptions.options;
            }
            return showMoreOptions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "optionType", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)V", "component1", "()Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "copy", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "getOptionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptionSelected extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreOptionSelected(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
            super("StepupOtpEvent.MoreOptionSelected", null);
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) && this.optionType == ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected) other).optionType;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected copy(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected(optionType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getOptionType() {
            return this.optionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionSelected moreOptionSelected, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optionType = moreOptionSelected.optionType;
            }
            return moreOptionSelected.copy(optionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MoreOptionsDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptionsDismissed extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed();

        public final int hashCode() {
            return -1493079687;
        }

        private MoreOptionsDismissed() {
            super("StepupOtpEvent.MoreOptionsDismissed", null);
        }

        public final java.lang.String toString() {
            return "MoreOptionsDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MoreOptionsDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J@\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ShowContactSelection;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "contacts", "", "currentContactId", "", "isEmailSelection", "shouldFilterCurrentContact", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ShowContactSelection;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getContacts", "Ljava/lang/String;", "getCurrentContactId", "Z", "getShouldFilterCurrentContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowContactSelection extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> contacts;
        private final java.lang.String currentContactId;
        private final boolean isEmailSelection;
        private final boolean shouldFilterCurrentContact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowContactSelection(java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> list, java.lang.String str, boolean z, boolean z2) {
            super("StepupOtpEvent.ShowContactSelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contacts = list;
            this.currentContactId = str;
            this.isEmailSelection = z;
            this.shouldFilterCurrentContact = z2;
        }

        public /* synthetic */ ShowContactSelection(java.util.List list, java.lang.String str, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> getContacts() {
            return this.contacts;
        }

        public final java.lang.String getCurrentContactId() {
            return this.currentContactId;
        }

        public final boolean isEmailSelection() {
            return this.isEmailSelection;
        }

        public final boolean getShouldFilterCurrentContact() {
            return this.shouldFilterCurrentContact;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> list = this.contacts;
            java.lang.String str = this.currentContactId;
            boolean z = this.isEmailSelection;
            boolean z2 = this.shouldFilterCurrentContact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowContactSelection(contacts=");
            sb.append(list);
            sb.append(", currentContactId=");
            sb.append(str);
            sb.append(", isEmailSelection=");
            sb.append(z);
            sb.append(", shouldFilterCurrentContact=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.contacts.hashCode();
            java.lang.String str = this.currentContactId;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isEmailSelection)) * 31) + java.lang.Boolean.hashCode(this.shouldFilterCurrentContact);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection showContactSelection = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, showContactSelection.contacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentContactId, showContactSelection.currentContactId) && this.isEmailSelection == showContactSelection.isEmailSelection && this.shouldFilterCurrentContact == showContactSelection.shouldFilterCurrentContact;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> contacts, java.lang.String currentContactId, boolean isEmailSelection, boolean shouldFilterCurrentContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection(contacts, currentContactId, isEmailSelection, shouldFilterCurrentContact);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldFilterCurrentContact() {
            return this.shouldFilterCurrentContact;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEmailSelection() {
            return this.isEmailSelection;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrentContactId() {
            return this.currentContactId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ShowContactSelection showContactSelection, java.util.List list, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = showContactSelection.contacts;
            }
            if ((i & 2) != 0) {
                str = showContactSelection.currentContactId;
            }
            if ((i & 4) != 0) {
                z = showContactSelection.isEmailSelection;
            }
            if ((i & 8) != 0) {
                z2 = showContactSelection.shouldFilterCurrentContact;
            }
            return showContactSelection.copy(list, str, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ContactSelected;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$ContactSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactSelected extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSelected(java.lang.String str) {
            super("StepupOtpEvent.ContactSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.contactId = str;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSelected(contactId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected) other).contactId);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected copy(java.lang.String contactId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected(contactId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ContactSelected contactSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contactSelected.contactId;
            }
            return contactSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$EmailPhoneSelectionDismissed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailPhoneSelectionDismissed extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed();

        public final int hashCode() {
            return -598392152;
        }

        private EmailPhoneSelectionDismissed() {
            super("StepupOtpEvent.EmailPhoneSelectionDismissed", null);
        }

        public final java.lang.String toString() {
            return "EmailPhoneSelectionDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$EmailPhoneSelectionClosed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailPhoneSelectionClosed extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed();

        public final int hashCode() {
            return 31964109;
        }

        private EmailPhoneSelectionClosed() {
            super("StepupOtpEvent.EmailPhoneSelectionClosed", null);
        }

        public final java.lang.String toString() {
            return "EmailPhoneSelectionClosed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.EmailPhoneSelectionClosed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NextStepUpChallenge;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "nextChallenge", "", "latestChallenges", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$NextStepUpChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getNextChallenge", "Ljava/util/List;", "getLatestChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NextStepUpChallenge extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge nextChallenge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NextStepUpChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupOtpEvent.NextStepUpChallenge", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.nextChallenge = challenge;
            this.latestChallenges = list;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getNextChallenge() {
            return this.nextChallenge;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.nextChallenge;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NextStepUpChallenge(nextChallenge=");
            sb.append(challenge);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.nextChallenge.hashCode() * 31) + this.latestChallenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge nextStepUpChallenge = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.nextChallenge, nextStepUpChallenge.nextChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, nextStepUpChallenge.latestChallenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge nextChallenge, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextChallenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge(nextChallenge, latestChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component2() {
            return this.latestChallenges;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getNextChallenge() {
            return this.nextChallenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.NextStepUpChallenge nextStepUpChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = nextStepUpChallenge.nextChallenge;
            }
            if ((i & 2) != 0) {
                list = nextStepUpChallenge.latestChallenges;
            }
            return nextStepUpChallenge.copy(challenge, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MultiChallengeStepUp;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "challenges", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$MultiChallengeStepUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MultiChallengeStepUp extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MultiChallengeStepUp(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
            super("StepupOtpEvent.MultiChallengeStepUp", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenges = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getChallenges() {
            return this.challenges;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.challenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiChallengeStepUp(challenges=");
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp) other).challenges);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp copy(java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> challenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp(challenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.MultiChallengeStepUp multiChallengeStepUp, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = multiChallengeStepUp.challenges;
            }
            return multiChallengeStepUp.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent$BackClicked;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked();

        public final int hashCode() {
            return 831284423;
        }

        private BackClicked() {
            super("StepupOtpEvent.BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ StepupOtpEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
