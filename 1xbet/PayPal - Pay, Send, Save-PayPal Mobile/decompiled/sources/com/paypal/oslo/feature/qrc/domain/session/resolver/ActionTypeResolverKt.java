package com.paypal.oslo.feature.qrc.domain.session.resolver;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "Lcom/paypal/oslo/feature/qrc/domain/session/resolver/ActionTypeResolver;", "getActionTypeResolver", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;)Lcom/paypal/oslo/feature/qrc/domain/session/resolver/ActionTypeResolver;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionTypeResolverKt {
    public static final com.paypal.oslo.feature.qrc.domain.session.resolver.ActionTypeResolver getActionTypeResolver(com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSession, "");
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction requiredAction = qrcSession.getRequiredAction();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType actionType = requiredAction != null ? requiredAction.getActionType() : null;
        switch (actionType == null ? -1 : com.paypal.oslo.feature.qrc.domain.session.resolver.ActionTypeResolverKt.WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()]) {
            case -1:
            case 8:
                return null;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.PaymentPullActionTypeResolver();
            case 2:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.EnrollmentRequiredActionTypeResolver();
            case 3:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.PaymentPushActionTypeResolver();
            case 4:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.PaymentActionTypeResolver();
            case 5:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.PaymentResultActionTypeResolver();
            case 6:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.ValidationErrorActionTypeResolver();
            case 7:
                return new com.paypal.oslo.feature.qrc.domain.session.resolver.RedirectActionTypeResolver();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.PAYMENT_PULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.ENROLLMENT_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.PAYMENT_PUSH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.PAYMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.PAYMENT_RESULT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.VALIDATION_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.REDIRECT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
