package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\u001e\u001f !\"#$B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0007%&'()*+"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "code", "getCode", "", "latestChallenges", "Ljava/util/List;", "getLatestChallenges", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "", "getShowMoreOptions", "()Z", "showMoreOptions", "Initial", "SendingCode", "Loading", "ResendingCode", "VerificationSuccess", "Error", "MaxAttemptsReached", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Error;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$ResendingCode;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$SendingCode;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$VerificationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StepupOtpUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
    private final java.lang.String code;
    private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge();

    private StepupOtpUiState(java.lang.String str) {
        this.name = str;
        this.code = "";
        this.latestChallenges = kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
        return this.latestChallenges;
    }

    public com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final boolean getShowMoreOptions() {
        if (getLatestChallenges().size() <= 1) {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = getChallenge();
            if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) {
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge) challenge).getPhoneNumbers().size() <= 1) {
                    return false;
                }
            } else if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) {
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.EmailChallenge) challenge).getEmails().size() <= 1) {
                    return false;
                }
            } else if (challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) {
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.WhatsAppChallenge) challenge).getPhoneNumbers().size() <= 1) {
                    return false;
                }
            } else if (!(challenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) || ((com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneCallChallenge) challenge).getPhoneNumbers().size() <= 1) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Initial;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "code", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/lang/String;", "getCode", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.lang.String code;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState) {
            super("StepupOtpUiState.Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.code = str;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ Initial(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : otpBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.lang.String getCode() {
            return this.code;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.lang.String str = this.code;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(challenge=");
            sb.append(challenge);
            sb.append(", code=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.code.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial initial = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, initial.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, initial.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, initial.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, initial.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String code, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial(challenge, code, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Initial initial, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = initial.challenge;
            }
            if ((i & 2) != 0) {
                str = initial.code;
            }
            if ((i & 4) != 0) {
                list = initial.latestChallenges;
            }
            if ((i & 8) != 0) {
                otpBottomSheetState = initial.bottomSheetState;
            }
            return initial.copy(challenge, str, list, otpBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$SendingCode;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "code", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$SendingCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/lang/String;", "getCode", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendingCode extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.lang.String code;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SendingCode(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState) {
            super("StepupOtpUiState.SendingCode", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.code = str;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ SendingCode(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : otpBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.lang.String getCode() {
            return this.code;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.lang.String str = this.code;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SendingCode(challenge=");
            sb.append(challenge);
            sb.append(", code=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.code.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode sendingCode = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, sendingCode.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, sendingCode.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, sendingCode.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, sendingCode.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String code, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode(challenge, code, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.SendingCode sendingCode, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = sendingCode.challenge;
            }
            if ((i & 2) != 0) {
                str = sendingCode.code;
            }
            if ((i & 4) != 0) {
                list = sendingCode.latestChallenges;
            }
            if ((i & 8) != 0) {
                otpBottomSheetState = sendingCode.bottomSheetState;
            }
            return sendingCode.copy(challenge, str, list, otpBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Loading;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "code", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/lang/String;", "getCode", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.lang.String code;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState) {
            super("StepupOtpUiState.Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.code = str;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.lang.String getCode() {
            return this.code;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : otpBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.lang.String str = this.code;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(challenge=");
            sb.append(challenge);
            sb.append(", code=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.code.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading loading = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, loading.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, loading.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, loading.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, loading.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String code, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading(challenge, code, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Loading loading, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = loading.challenge;
            }
            if ((i & 2) != 0) {
                str = loading.code;
            }
            if ((i & 4) != 0) {
                list = loading.latestChallenges;
            }
            if ((i & 8) != 0) {
                otpBottomSheetState = loading.bottomSheetState;
            }
            return loading.copy(challenge, str, list, otpBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$ResendingCode;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "code", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$ResendingCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/lang/String;", "getCode", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResendingCode extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.lang.String code;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ResendingCode(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState) {
            super("StepupOtpUiState.ResendingCode", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.code = str;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.lang.String getCode() {
            return this.code;
        }

        public /* synthetic */ ResendingCode(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : otpBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.lang.String str = this.code;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResendingCode(challenge=");
            sb.append(challenge);
            sb.append(", code=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.code.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode resendingCode = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, resendingCode.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, resendingCode.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, resendingCode.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, resendingCode.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String code, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode(challenge, code, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.ResendingCode resendingCode, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = resendingCode.challenge;
            }
            if ((i & 2) != 0) {
                str = resendingCode.code;
            }
            if ((i & 4) != 0) {
                list = resendingCode.latestChallenges;
            }
            if ((i & 8) != 0) {
                otpBottomSheetState = resendingCode.bottomSheetState;
            }
            return resendingCode.copy(challenge, str, list, otpBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011JX\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b,\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$VerificationSuccess;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "code", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "nonce", "partialToken", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "component5", "component6", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$VerificationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/lang/String;", "getCode", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationSuccess extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.lang.String code;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public VerificationSuccess(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, java.lang.String str2, java.lang.String str3) {
            super("StepupOtpUiState.VerificationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.code = str;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
            this.nonce = str2;
            this.partialToken = str3;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ VerificationSuccess(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : otpBottomSheetState, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.lang.String getCode() {
            return this.code;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.lang.String str = this.code;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationSuccess(challenge=");
            sb.append(challenge);
            sb.append(", code=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.code.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            int hashCode4 = otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode();
            java.lang.String str = this.nonce;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess verificationSuccess = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, verificationSuccess.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, verificationSuccess.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, verificationSuccess.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, verificationSuccess.bottomSheetState) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, verificationSuccess.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, verificationSuccess.partialToken);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String code, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess(challenge, code, latestChallenges, bottomSheetState, nonce, partialToken);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.VerificationSuccess verificationSuccess, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = verificationSuccess.challenge;
            }
            if ((i & 2) != 0) {
                str = verificationSuccess.code;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                list = verificationSuccess.latestChallenges;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                otpBottomSheetState = verificationSuccess.bottomSheetState;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState2 = otpBottomSheetState;
            if ((i & 16) != 0) {
                str2 = verificationSuccess.nonce;
            }
            java.lang.String str5 = str2;
            if ((i & 32) != 0) {
                str3 = verificationSuccess.partialToken;
            }
            return verificationSuccess.copy(challenge, str4, list2, otpBottomSheetState2, str5, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b\t\u0010\u0018R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b\n\u0010\u0018R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Error;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "errorMessageResId", "", "code", "", "isInvalidCode", "isExpiredCode", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;ILjava/lang/String;ZZLjava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;ILjava/lang/String;ZZLjava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", com.visa.cbp.getEncExpo.warmup, "getErrorMessageResId", "Ljava/lang/String;", "getCode", "Z", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.lang.String code;
        private final int errorMessageResId;
        private final boolean isExpiredCode;
        private final boolean isInvalidCode;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Error(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, int i, java.lang.String str, boolean z, boolean z2, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState) {
            super("StepupOtpUiState.Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.errorMessageResId = i;
            this.code = str;
            this.isInvalidCode = z;
            this.isExpiredCode = z2;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, int i, java.lang.String str, boolean z, boolean z2, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : otpBottomSheetState);
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.lang.String getCode() {
            return this.code;
        }

        public final boolean isInvalidCode() {
            return this.isInvalidCode;
        }

        public final boolean isExpiredCode() {
            return this.isExpiredCode;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            int i = this.errorMessageResId;
            java.lang.String str = this.code;
            boolean z = this.isInvalidCode;
            boolean z2 = this.isExpiredCode;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(challenge=");
            sb.append(challenge);
            sb.append(", errorMessageResId=");
            sb.append(i);
            sb.append(", code=");
            sb.append(str);
            sb.append(", isInvalidCode=");
            sb.append(z);
            sb.append(", isExpiredCode=");
            sb.append(z2);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.errorMessageResId);
            int hashCode3 = this.code.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.isInvalidCode);
            int hashCode5 = java.lang.Boolean.hashCode(this.isExpiredCode);
            int hashCode6 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error error = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, error.challenge) && this.errorMessageResId == error.errorMessageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.code, error.code) && this.isInvalidCode == error.isInvalidCode && this.isExpiredCode == error.isExpiredCode && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, error.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, error.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, int errorMessageResId, java.lang.String code, boolean isInvalidCode, boolean isExpiredCode, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error(challenge, errorMessageResId, code, isInvalidCode, isExpiredCode, latestChallenges, bottomSheetState);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component6() {
            return this.latestChallenges;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsExpiredCode() {
            return this.isExpiredCode;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsInvalidCode() {
            return this.isInvalidCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.Error error, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, int i, java.lang.String str, boolean z, boolean z2, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                challenge = error.challenge;
            }
            if ((i2 & 2) != 0) {
                i = error.errorMessageResId;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str = error.code;
            }
            java.lang.String str2 = str;
            if ((i2 & 8) != 0) {
                z = error.isInvalidCode;
            }
            boolean z3 = z;
            if ((i2 & 16) != 0) {
                z2 = error.isExpiredCode;
            }
            boolean z4 = z2;
            if ((i2 & 32) != 0) {
                list = error.latestChallenges;
            }
            java.util.List list2 = list;
            if ((i2 & 64) != 0) {
                otpBottomSheetState = error.bottomSheetState;
            }
            return error.copy(challenge, i3, str2, z3, z4, list2, otpBottomSheetState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$MaxAttemptsReached;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "", "bestAlternative", "", "latestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "bottomSheetState", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpUiState$MaxAttemptsReached;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getChallenge", "Ljava/lang/String;", "getBestAlternative", "Ljava/util/List;", "getLatestChallenges", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "getBottomSheetState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxAttemptsReached extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState {
        public static final int $stable = 8;
        private final java.lang.String bestAlternative;
        private final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MaxAttemptsReached(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState) {
            super("StepupOtpUiState.MaxAttemptsReached", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenge = challenge;
            this.bestAlternative = str;
            this.latestChallenges = list;
            this.bottomSheetState = otpBottomSheetState;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ MaxAttemptsReached(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(challenge, (i & 2) != 0 ? "Best Alternative" : str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : otpBottomSheetState);
        }

        public final java.lang.String getBestAlternative() {
            return this.bestAlternative;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getLatestChallenges() {
            return this.latestChallenges;
        }

        @Override // com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.challenge;
            java.lang.String str = this.bestAlternative;
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list = this.latestChallenges;
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxAttemptsReached(challenge=");
            sb.append(challenge);
            sb.append(", bestAlternative=");
            sb.append(str);
            sb.append(", latestChallenges=");
            sb.append(list);
            sb.append(", bottomSheetState=");
            sb.append(otpBottomSheetState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.bestAlternative.hashCode();
            int hashCode3 = this.latestChallenges.hashCode();
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState = this.bottomSheetState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (otpBottomSheetState == null ? 0 : otpBottomSheetState.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached maxAttemptsReached = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, maxAttemptsReached.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.bestAlternative, maxAttemptsReached.bestAlternative) && kotlin.jvm.internal.Intrinsics.areEqual(this.latestChallenges, maxAttemptsReached.latestChallenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetState, maxAttemptsReached.bottomSheetState);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String bestAlternative, java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> latestChallenges, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState bottomSheetState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bestAlternative, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latestChallenges, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached(challenge, bestAlternative, latestChallenges, bottomSheetState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> component3() {
            return this.latestChallenges;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBestAlternative() {
            return this.bestAlternative;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getChallenge() {
            return this.challenge;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpUiState.MaxAttemptsReached maxAttemptsReached, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState otpBottomSheetState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challenge = maxAttemptsReached.challenge;
            }
            if ((i & 2) != 0) {
                str = maxAttemptsReached.bestAlternative;
            }
            if ((i & 4) != 0) {
                list = maxAttemptsReached.latestChallenges;
            }
            if ((i & 8) != 0) {
                otpBottomSheetState = maxAttemptsReached.bottomSheetState;
            }
            return maxAttemptsReached.copy(challenge, str, list, otpBottomSheetState);
        }
    }

    public /* synthetic */ StepupOtpUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
