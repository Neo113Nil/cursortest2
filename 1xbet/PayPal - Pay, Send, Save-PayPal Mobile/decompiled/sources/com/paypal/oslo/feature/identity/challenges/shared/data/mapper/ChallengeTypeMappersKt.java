package com.paypal.oslo.feature.identity.challenges.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "Lcom/paypal/oslo/feature/identity/graphql/type/StepUpIdentityChallengeMethod;", "toStepUpIdentityChallengeMethod", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;)Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChallengeTypeMappersKt {
    public static final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod toStepUpIdentityChallengeMethod(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        switch (com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeMappersKt.WhenMappings.$EnumSwitchMapping$0[challengeType.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.TEXT_ONE_TIME_PASSCODE;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.PHONE_ONE_TIME_PASSCODE;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.EMAIL_ONE_TIME_PASSCODE;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.SECURITY_QUESTIONS;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.CREDIT_CARD;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.SILENT_AUTHENTICATION;
            case 7:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.WHATSAPP_ONE_TIME_PASSCODE;
            case 8:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.AUTHENTICATOR_APP;
            default:
                return com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.UNKNOWN__;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
