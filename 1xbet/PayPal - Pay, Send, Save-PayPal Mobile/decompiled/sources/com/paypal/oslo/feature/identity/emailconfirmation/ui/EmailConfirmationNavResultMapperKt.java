package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;", "toNavResult", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;)Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "toPublicErrorType", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;)Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationNavResultMapperKt {
    public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult toNavResult(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect emailConfirmationUiEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationUiEffect, "");
        if (emailConfirmationUiEffect instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess) {
            return new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult(new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success(((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess) emailConfirmationUiEffect).getConfirmedEmail()));
        }
        if (emailConfirmationUiEffect instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError) {
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError navigateBackWithError = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError) emailConfirmationUiEffect;
            return new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult(new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error(toPublicErrorType(navigateBackWithError.getErrorType()), navigateBackWithError.getMessage()));
        }
        if (!(emailConfirmationUiEffect instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithDismiss)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed.INSTANCE);
    }

    public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType toPublicErrorType(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationErrorType, "");
        int i = com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationNavResultMapperKt.WhenMappings.$EnumSwitchMapping$0[emailConfirmationErrorType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.ConfirmationFailed.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.NetworkError.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.InvalidLink.INSTANCE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.Unknown.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.CONFIRMATION_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.INVALID_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
