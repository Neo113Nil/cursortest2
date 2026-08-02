package com.paypal.oslo.feature.identity.challenges.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u0007*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u0017\u0010\u0003\u001a\u00020\u000b*\u00060\tj\u0002`\nH\u0000¢\u0006\u0004\b\u0003\u0010\f\u001a\u0017\u0010\u0003\u001a\u00020\u000f*\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00060\rj\u0002`\u000e*\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "Lcom/paypal/oslo/feature/identity/graphql/type/NotifyStepUpIdentityChallengeResultStatus;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResultStatus;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResultStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "Lcom/paypal/oslo/feature/identity/graphql/type/ValidateStepUpIdentityChallengeResultStatus;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResultStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResultStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "Lcom/paypal/oslo/feature/identity/graphql/type/StepUpIdentityChallengeStatus;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/StepUpStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/StepUpStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "Lcom/paypal/oslo/feature/identity/graphql/type/StepUpIdentityChallengeMethod;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "toGraphQL", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;)Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChallengeStatusMappersKt {
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus toDomain(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyStepUpIdentityChallengeResultStatus, "");
        switch (com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.WhenMappings.$EnumSwitchMapping$0[notifyStepUpIdentityChallengeResultStatus.ordinal()]) {
        }
        return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus.DELIVERY_FAILED;
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus toDomain(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateStepUpIdentityChallengeResultStatus, "");
        switch (com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.WhenMappings.$EnumSwitchMapping$1[validateStepUpIdentityChallengeResultStatus.ordinal()]) {
        }
        return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.VALIDATION_FAILED;
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus toDomain(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeStatus, "");
        int i = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.WhenMappings.$EnumSwitchMapping$2[stepUpIdentityChallengeStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.PENDING;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.IN_PROGRESS;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.COMPLETED;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.FAILED;
        }
        if (i == 5) {
            return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.FAILED;
        }
        return com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.FAILED;
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType toDomain(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
        switch (com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.WhenMappings.$EnumSwitchMapping$3[stepUpIdentityChallengeMethod.ordinal()]) {
        }
        return com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.UNKNOWN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod toGraphQL(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        switch (com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.WhenMappings.$EnumSwitchMapping$4[challengeType.ordinal()]) {
        }
        return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.INVALID_CONTEXT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.CONTEXT_EXPIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_FOUND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_ELIGIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.DELIVERY_LIMIT_EXCEEDED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.DELIVERY_FAILED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.INVALID_INPUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.INTERNAL_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.UNKNOWN__.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INVALID_CONTEXT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CONTEXT_EXPIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_FOUND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_ELIGIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.VERIFICATION_LIMIT_EXCEEDED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INVALID_ONE_TIME_PASSCODE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.ONE_TIME_PASSCODE_EXPIRED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INVALID_INPUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.FAILED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.SECURITY_ANSWERS_NOT_CORRECT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CARD_VALIDATION_FAILED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INTERNAL_ERROR.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.UNKNOWN__.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus.PENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus.COMPLETED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.TEXT_ONE_TIME_PASSCODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.EMAIL_ONE_TIME_PASSCODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.WHATSAPP_ONE_TIME_PASSCODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.PHONE_ONE_TIME_PASSCODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.AUTHENTICATOR_APP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.SILENT_AUTHENTICATION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.SECURITY_QUESTIONS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.CREDIT_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.WEBVIEW.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.CHANGE_PASSWORD.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.SKIP_AND_LOGIN.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.UNKNOWN__.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WEBVIEW.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CHANGE_PASSWORD.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SKIP_AND_LOGIN.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr5[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.UNKNOWN.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
