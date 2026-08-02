package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "", "getChallengeTitle", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getChallengeIcon", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/pds/core/Icon;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChallengeDisplayUtilsKt {
    public static final java.lang.String getChallengeTitle(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(135371579, i, -1, "com.paypal.oslo.feature.identity.stepup.ui.getChallengeTitle (ChallengeDisplayUtils.kt:21)");
        }
        switch (com.paypal.oslo.feature.identity.stepup.ui.ChallengeDisplayUtilsKt.WhenMappings.$EnumSwitchMapping$0[challengeData.getSelectedChallenge().getType().ordinal()]) {
            case 1:
                composer.startReplaceGroup(1243073354);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_sms_password_context, composer, 0);
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(1243076891);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_email, composer, 0);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(1243080062);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_whatsapp, composer, 0);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(1243083178);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_ivr_password_context, composer, 0);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(1243087107);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_authenticator, composer, 0);
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(1243090625);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_silent_auth, composer, 0);
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(1243094301);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_security_question, composer, 0);
                composer.endReplaceGroup();
                break;
            case 8:
                composer.startReplaceGroup(1243098625);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_credit_card, composer, 0);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(1243101405);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_stepup_challenge_unknown, composer, 0);
                composer.endReplaceGroup();
                break;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final com.paypal.pds.core.Icon getChallengeIcon(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        switch (com.paypal.oslo.feature.identity.stepup.ui.ChallengeDisplayUtilsKt.WhenMappings.$EnumSwitchMapping$0[challengeData.getSelectedChallenge().getType().ordinal()]) {
            case 1:
                return com.paypal.pds.core.Icon.MessageText.INSTANCE;
            case 2:
                return com.paypal.pds.core.Icon.Envelope.INSTANCE;
            case 3:
                return com.paypal.pds.core.Icon.SocialWhatsapp.INSTANCE;
            case 4:
                return com.paypal.pds.core.Icon.Phone.INSTANCE;
            case 5:
                return com.paypal.pds.core.Icon.Key.INSTANCE;
            case 6:
                return com.paypal.pds.core.Icon.FaceId.INSTANCE;
            case 7:
                return com.paypal.pds.core.Icon.NoticationList.INSTANCE;
            case 8:
                return com.paypal.pds.core.Icon.Card.INSTANCE;
            default:
                return com.paypal.pds.core.Icon.NoIcon.INSTANCE;
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
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
